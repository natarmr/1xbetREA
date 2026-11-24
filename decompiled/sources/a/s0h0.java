package a;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f31408a = q3d.j(Application.class, vzg0.class);
    public static final List b = kotlin.collections.a.c(vzg0.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listG0 = tx3.g0(parameterTypes);
            if (list.equals(listG0)) {
                return constructor;
            }
            if (list.size() == listG0.size() && listG0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final diu0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (diu0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            e9d0.l("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            e9d0.m("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
