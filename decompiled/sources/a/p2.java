package a;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends jd8 {
    public static final Unsafe o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                o2 o2Var = new o2();
                try {
                    unsafe = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, o2Var);
                } catch (Exception unused2) {
                    unsafe = (Unsafe) o2Var.run();
                }
            }
            try {
                q = unsafe.objectFieldOffset(r2.class.getDeclaredField("c"));
                p = unsafe.objectFieldOffset(r2.class.getDeclaredField("b"));
                r = unsafe.objectFieldOffset(r2.class.getDeclaredField("a"));
                s = unsafe.objectFieldOffset(q2.class.getDeclaredField("a"));
                t = unsafe.objectFieldOffset(q2.class.getDeclaredField("b"));
                o = unsafe;
            } catch (NoSuchFieldException e) {
                ohq.p(e);
            }
        } catch (Exception e2) {
            e9d0.m("Could not initialize intrinsics", e2);
        }
    }

    @Override // a.jd8
    public final boolean a0(l2 l2Var, i2 i2Var, i2 i2Var2) {
        while (true) {
            Unsafe unsafe = o;
            long j = p;
            l2 l2Var2 = l2Var;
            i2 i2Var3 = i2Var;
            i2 i2Var4 = i2Var2;
            if (unsafe.compareAndSwapObject(l2Var2, j, i2Var3, i2Var4)) {
                return true;
            }
            if (unsafe.getObject(l2Var2, j) != i2Var3) {
                return false;
            }
            l2Var = l2Var2;
            i2Var = i2Var3;
            i2Var2 = i2Var4;
        }
    }

    @Override // a.jd8
    public final boolean b0(r2 r2Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = o;
            long j = r;
            r2 r2Var2 = r2Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(r2Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(r2Var2, j) != obj3) {
                return false;
            }
            r2Var = r2Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // a.jd8
    public final boolean c0(r2 r2Var, q2 q2Var, q2 q2Var2) {
        while (true) {
            Unsafe unsafe = o;
            long j = q;
            r2 r2Var2 = r2Var;
            q2 q2Var3 = q2Var;
            q2 q2Var4 = q2Var2;
            if (unsafe.compareAndSwapObject(r2Var2, j, q2Var3, q2Var4)) {
                return true;
            }
            if (unsafe.getObject(r2Var2, j) != q2Var3) {
                return false;
            }
            r2Var = r2Var2;
            q2Var = q2Var3;
            q2Var2 = q2Var4;
        }
    }

    @Override // a.jd8
    public final i2 d0(l2 l2Var) {
        i2 i2Var;
        i2 i2Var2 = i2.d;
        do {
            i2Var = l2Var.b;
            if (i2Var2 == i2Var) {
                break;
            }
        } while (!a0(l2Var, i2Var, i2Var2));
        return i2Var;
    }

    @Override // a.jd8
    public final q2 e0(l2 l2Var) {
        q2 q2Var;
        q2 q2Var2 = q2.c;
        do {
            q2Var = l2Var.c;
            if (q2Var2 == q2Var) {
                break;
            }
        } while (!c0(l2Var, q2Var, q2Var2));
        return q2Var;
    }

    @Override // a.jd8
    public final void h0(q2 q2Var, q2 q2Var2) {
        o.putObject(q2Var, t, q2Var2);
    }

    @Override // a.jd8
    public final void i0(q2 q2Var, Thread thread) {
        o.putObject(q2Var, s, thread);
    }
}
