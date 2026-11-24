package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class yqe0 extends uqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43073a;

    public yqe0(Object obj) {
        obj.getClass();
        this.f43073a = obj;
    }

    @Override // a.uqe0
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f43073a;
        obj.getClass();
        abu abuVar = ydx.f42460a;
        Method method = null;
        if (abuVar == null) {
            Class<?> cls = obj.getClass();
            byte b = 21;
            try {
                abuVar = new abu(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), b);
            } catch (NoSuchMethodException unused) {
                abuVar = new abu(method, method, b);
            }
            ydx.f42460a = abuVar;
        }
        Method method2 = (Method) abuVar.c;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final zqe0 f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f43073a;
        obj.getClass();
        abu abuVar = ydx.f42460a;
        Class cls = null;
        if (abuVar == null) {
            Class<?> cls2 = obj.getClass();
            byte b = 21;
            try {
                abuVar = new abu(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null), b);
            } catch (NoSuchMethodException unused) {
                abuVar = new abu(cls, cls, b);
            }
            ydx.f42460a = abuVar;
        }
        Method method = (Method) abuVar.b;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new oqe0(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
