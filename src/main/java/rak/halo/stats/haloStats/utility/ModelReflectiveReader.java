package rak.halo.stats.haloStats.utility;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ModelReflectiveReader {

	public static <T> String toString(T object) {
		String message = "";
		Class<?> c = object.getClass();
		
		if (c.isArray()){
			for (T o : unpack(object)){
				message += toString(o);
			}
		} else {
			for (Field field : c.getDeclaredFields()) {
				message += fieldToString(object, field);
			}
		}
		return message;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] unpack(T array) {
	    Object[] array2 = new Object[Array.getLength(array)];
	    for(int i=0;i<array2.length;i++)
	        array2[i] = Array.get(array, i);
	    return (T[]) array2;
	}

	private static <T> String fieldToString(T object, Field field) {
		try {
			return attemptFieldToString(object, field);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static <T> String attemptFieldToString(T object, Field field) throws IllegalAccessException {
		field.setAccessible(true);
		Object value = field.get(object);
		if (fieldHasSubFields(field)){
			return toString(value);
		} else {
			return field.getName() + ": " + value.toString() + "\n";
		}
	}

	private static boolean fieldHasSubFields(Field field) {
		return !field.getType().isPrimitive() && !field.getType().isInstance("");
	}

}
