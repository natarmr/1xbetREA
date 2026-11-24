package a;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class m1r {
    public static final nuj0 b = new nuj0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.e f21022a;

    public m1r(androidx.fragment.app.e eVar) {
        this.f21022a = eVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        nuj0 nuj0Var = b;
        nuj0 nuj0Var2 = (nuj0) nuj0Var.get(classLoader);
        if (nuj0Var2 == null) {
            nuj0Var2 = new nuj0(0);
            nuj0Var.put(classLoader, nuj0Var2);
        }
        Class cls = (Class) nuj0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        nuj0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new ss3(kng0.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new ss3(kng0.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final Fragment a(String str) {
        try {
            return (Fragment) c(this.f21022a.x.b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new ss3(kng0.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new ss3(kng0.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new ss3(kng0.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new ss3(kng0.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
