package a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jkw0 extends ojw0 {
    private static final Map<Class<?>, jkw0> zzc = new ConcurrentHashMap();
    protected klw0 zzb;
    private int zzd;

    public jkw0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = klw0.f;
    }

    public static jkw0 d(jkw0 jkw0Var, tdw0 tdw0Var, dkw0 dkw0Var) throws qkw0 {
        jkw0 jkw0VarP = jkw0Var.p();
        try {
            clw0 clw0Var = clw0.b;
            clw0Var.getClass();
            dlw0 dlw0VarA = clw0Var.a(jkw0VarP.getClass());
            hu5 hu5Var = (hu5) tdw0Var.c;
            if (hu5Var == null) {
                hu5Var = new hu5(tdw0Var, (byte) 0);
            }
            dlw0VarA.d(jkw0VarP, hu5Var, dkw0Var);
            dlw0VarA.b(jkw0VarP);
            return jkw0VarP;
        } catch (ilw0 e) {
            throw new qkw0(e.getMessage());
        } catch (qkw0 e2) {
            if (e2.f28907a) {
                throw new qkw0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof qkw0) {
                throw ((qkw0) e3.getCause());
            }
            throw new qkw0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof qkw0) {
                throw ((qkw0) e4.getCause());
            }
            throw e4;
        }
    }

    public static jkw0 e(jkw0 jkw0Var, sjw0 sjw0Var, dkw0 dkw0Var) throws qkw0 {
        wjw0 wjw0VarQ = sjw0Var.q();
        jkw0 jkw0VarD = d(jkw0Var, wjw0VarQ, dkw0Var);
        wjw0VarQ.t(0);
        m(jkw0VarD);
        return jkw0VarD;
    }

    public static jkw0 f(jkw0 jkw0Var, byte[] bArr, dkw0 dkw0Var) throws qkw0 {
        int length = bArr.length;
        if (length != 0) {
            jkw0 jkw0VarP = jkw0Var.p();
            try {
                clw0 clw0Var = clw0.b;
                clw0Var.getClass();
                dlw0 dlw0VarA = clw0Var.a(jkw0VarP.getClass());
                mdw0 mdw0Var = new mdw0();
                dkw0Var.getClass();
                dlw0VarA.h(jkw0VarP, bArr, 0, length, mdw0Var);
                dlw0VarA.b(jkw0VarP);
                jkw0Var = jkw0VarP;
            } catch (ilw0 e) {
                throw new qkw0(e.getMessage());
            } catch (qkw0 e2) {
                if (e2.f28907a) {
                    throw new qkw0(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof qkw0) {
                    throw ((qkw0) e3.getCause());
                }
                throw new qkw0(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw qkw0.h();
            }
        }
        m(jkw0Var);
        return jkw0Var;
    }

    public static jkw0 g(Class cls) {
        Map<Class<?>, jkw0> map = zzc;
        jkw0 jkw0Var = map.get(cls);
        if (jkw0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                jkw0Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                hny.q("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (jkw0Var != null) {
            return jkw0Var;
        }
        try {
            jkw0 jkw0Var2 = (jkw0) ((jkw0) mlw0.f22013a.allocateInstance(cls)).h(6);
            if (jkw0Var2 != null) {
                map.put(cls, jkw0Var2);
                return jkw0Var2;
            }
            v4i0.e();
            return null;
        } catch (InstantiationException e2) {
            itt0.o(e2);
            return null;
        }
    }

    public static Object i(Method method, jkw0 jkw0Var, Object... objArr) {
        try {
            return method.invoke(jkw0Var, objArr);
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

    public static void l(Class cls, jkw0 jkw0Var) {
        jkw0Var.r();
        zzc.put(cls, jkw0Var);
    }

    public static void m(jkw0 jkw0Var) throws qkw0 {
        if (jkw0Var != null && !n(jkw0Var, true)) {
            throw new qkw0(new ilw0().getMessage());
        }
    }

    public static final boolean n(jkw0 jkw0Var, boolean z) {
        byte bByteValue = ((Byte) jkw0Var.h(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        clw0 clw0Var = clw0.b;
        clw0Var.getClass();
        boolean zA = clw0Var.a(jkw0Var.getClass()).a(jkw0Var);
        if (z) {
            jkw0Var.h(2);
        }
        return zA;
    }

    @Override // a.ojw0
    public final int b(dlw0 dlw0Var) {
        int iF;
        int iF2;
        if (s()) {
            if (dlw0Var == null) {
                clw0 clw0Var = clw0.b;
                clw0Var.getClass();
                iF2 = clw0Var.a(getClass()).f(this);
            } else {
                iF2 = dlw0Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            jf4.n(twn.m(iF2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (dlw0Var == null) {
            clw0 clw0Var2 = clw0.b;
            clw0Var2.getClass();
            iF = clw0Var2.a(getClass()).f(this);
        } else {
            iF = dlw0Var.f(this);
        }
        j(iF);
        return iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        clw0 clw0Var = clw0.b;
        clw0Var.getClass();
        return clw0Var.a(getClass()).g(this, (jkw0) obj);
    }

    public abstract Object h(int i);

    public final int hashCode() {
        if (s()) {
            clw0 clw0Var = clw0.b;
            clw0Var.getClass();
            return clw0Var.a(getClass()).e(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        clw0 clw0Var2 = clw0.b;
        clw0Var2.getClass();
        int iE = clw0Var2.a(getClass()).e(this);
        this.zza = iE;
        return iE;
    }

    public final void j(int i) {
        if (i < 0) {
            jf4.n(twn.m(i, "serialized size must be non-negative, was "));
        } else {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        }
    }

    public final void k(p4 p4Var) {
        clw0 clw0Var = clw0.b;
        clw0Var.getClass();
        dlw0 dlw0VarA = clw0Var.a(getClass());
        zlt0 zlt0Var = (zlt0) p4Var.b;
        if (zlt0Var == null) {
            zlt0Var = new zlt0(p4Var);
        }
        dlw0VarA.c(this, zlt0Var);
    }

    public final hkw0 o() {
        return (hkw0) h(5);
    }

    public final jkw0 p() {
        return (jkw0) h(4);
    }

    public final void q() {
        clw0 clw0Var = clw0.b;
        clw0Var.getClass();
        clw0Var.a(getClass()).b(this);
        r();
    }

    public final void r() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean s() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = ykw0.f42812a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        ykw0.b(this, sb, 0);
        return sb.toString();
    }
}
