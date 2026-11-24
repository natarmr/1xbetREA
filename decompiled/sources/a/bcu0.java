package a;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class bcu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx3 f2370a;
    public final gx3 b;
    public final gx3 c;

    public bcu0(gx3 gx3Var, gx3 gx3Var2, gx3 gx3Var3) {
        this.f2370a = gx3Var;
        this.b = gx3Var2;
        this.c = gx3Var3;
    }

    public abstract ccu0 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        gx3 gx3Var = this.c;
        Class cls2 = (Class) gx3Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(kng0.m(cls.getPackage().getName(), Separators.DOT, cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        gx3Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        gx3 gx3Var = this.f2370a;
        Method method = (Method) gx3Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, bcu0.class.getClassLoader()).getDeclaredMethod("read", bcu0.class);
        gx3Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        gx3 gx3Var = this.b;
        Method method = (Method) gx3Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, bcu0.class);
        gx3Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((ccu0) this).e.readParcelable(ccu0.class.getClassLoader());
    }

    public final dcu0 g() {
        String string = ((ccu0) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (dcu0) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            e9d0.m("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            e9d0.m("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            e9d0.m("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            e9d0.m("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(dcu0 dcu0Var) {
        if (dcu0Var == null) {
            ((ccu0) this).e.writeString(null);
            return;
        }
        try {
            ((ccu0) this).e.writeString(b(dcu0Var.getClass()).getName());
            ccu0 ccu0VarA = a();
            try {
                d(dcu0Var.getClass()).invoke(null, dcu0Var, ccu0VarA);
                Parcel parcel = ccu0VarA.e;
                int i = ccu0VarA.i;
                if (i >= 0) {
                    int i2 = ccu0VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                e9d0.m("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                e9d0.m("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                e9d0.m("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                e9d0.m("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            e9d0.m(dcu0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
