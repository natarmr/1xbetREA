package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class ijt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f14892a;
    public final Object b;
    public final z3 c;
    public final hjt d;
    public final Method e;

    public ijt(z3 z3Var, Object obj, z3 z3Var2, hjt hjtVar, Class cls) {
        if (z3Var == null) {
            jf4.o("Null containingTypeDefaultInstance");
            throw null;
        }
        if (hjtVar.b == eov0.f && z3Var2 == null) {
            jf4.o("Null messageDefaultInstance");
            throw null;
        }
        this.f14892a = z3Var;
        this.b = obj;
        this.c = z3Var2;
        this.d = hjtVar;
        if (!vlx.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            e9d0.m(rw2.o(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            throw null;
        }
    }

    public final Object a(Object obj) {
        if (this.d.b.f8155a != hov0.ENUM) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            e9d0.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            e9d0.m("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final Object b(Object obj) {
        return this.d.b.f8155a == hov0.ENUM ? Integer.valueOf(((vlx) obj).a()) : obj;
    }
}
