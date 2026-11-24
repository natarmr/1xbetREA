package a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mew0 extends jdw0 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected mgw0 zzc;

    public mew0() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = mgw0.f;
    }

    public static mew0 c(mew0 mew0Var, byte[] bArr, bew0 bew0Var) throws zew0 {
        int length = bArr.length;
        if (length != 0) {
            mew0 mew0VarG = mew0Var.g();
            try {
                egw0 egw0VarA = agw0.c.a(mew0VarG.getClass());
                egw0VarA.b(mew0VarG, bArr, 0, length, new mdw0(bew0Var));
                egw0VarA.h(mew0VarG);
                mew0Var = mew0VarG;
            } catch (igw0 e) {
                throw e.a();
            } catch (zew0 e2) {
                if (e2.f44274a) {
                    throw new zew0(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zew0) {
                    throw ((zew0) e3.getCause());
                }
                throw new zew0(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        p(mew0Var);
        return mew0Var;
    }

    public static mew0 l(Class cls) {
        Map map = zze;
        mew0 mew0Var = (mew0) map.get(cls);
        if (mew0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                mew0Var = (mew0) map.get(cls);
            } catch (ClassNotFoundException e) {
                hny.q("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (mew0Var != null) {
            return mew0Var;
        }
        try {
            mew0 mew0Var2 = (mew0) ((mew0) pgw0.f26971a.allocateInstance(cls)).q(6);
            if (mew0Var2 != null) {
                map.put(cls, mew0Var2);
                return mew0Var2;
            }
            v4i0.e();
            return null;
        } catch (InstantiationException e2) {
            itt0.o(e2);
            return null;
        }
    }

    public static void m(Class cls, mew0 mew0Var) {
        mew0Var.f();
        zze.put(cls, mew0Var);
    }

    public static Object n(Method method, mew0 mew0Var, Object... objArr) {
        try {
            return method.invoke(mew0Var, objArr);
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

    public static final boolean o(mew0 mew0Var, boolean z) {
        byte bByteValue = ((Byte) mew0Var.q(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = agw0.c.a(mew0Var.getClass()).zzl(mew0Var);
        if (z) {
            mew0Var.q(2);
        }
        return zZzl;
    }

    public static void p(mew0 mew0Var) {
        if (mew0Var != null && !o(mew0Var, true)) {
            throw new igw0().a();
        }
    }

    @Override // a.jdw0
    public final int b(egw0 egw0Var) {
        if (e()) {
            int iA = egw0Var.a(this);
            if (iA >= 0) {
                return iA;
            }
            itt0.u(String.valueOf(iA).length() + 42, iA);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iA2 = egw0Var.a(this);
        if (iA2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        itt0.u(String.valueOf(iA2).length() + 42, iA2);
        return 0;
    }

    public final void d(aew0 aew0Var) {
        egw0 egw0VarA = agw0.c.a(getClass());
        owp0 owp0Var = aew0Var.f750a;
        if (owp0Var == null) {
            owp0Var = new owp0(aew0Var);
        }
        egw0VarA.f(this, owp0Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return agw0.c.a(getClass()).c(this, (mew0) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final mew0 g() {
        return (mew0) q(4);
    }

    public final iew0 h() {
        return (iew0) q(5);
    }

    public final int hashCode() {
        if (e()) {
            return agw0.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iD = agw0.c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final iew0 i() {
        iew0 iew0Var = (iew0) q(5);
        iew0Var.f(this);
        return iew0Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iA = agw0.c.a(getClass()).a(this);
            if (iA >= 0) {
                return iA;
            }
            itt0.u(String.valueOf(iA).length() + 42, iA);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iA2 = agw0.c.a(getClass()).a(this);
        if (iA2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        itt0.u(String.valueOf(iA2).length() + 42, iA2);
        return 0;
    }

    public abstract Object q(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = sfw0.f32135a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        sfw0.b(this, sb, 0);
        return sb.toString();
    }
}
