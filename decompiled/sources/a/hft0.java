package a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f12986a;
    public static final Class b;
    public static final gft0 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Unsafe unsafe;
        Object[] objArr = 0;
        dft0 dft0Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new cft0((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f12986a = unsafe;
        b = bw2.f3304a;
        boolean zD = d(Long.TYPE);
        boolean zD2 = d(Integer.TYPE);
        byte b2 = 1;
        if (unsafe != null) {
            if (!bw2.a()) {
                dft0Var = new dft0(unsafe, (byte) 2);
            } else if (zD) {
                dft0Var = new dft0(unsafe, b2);
            } else if (zD2) {
                dft0Var = new dft0(unsafe, objArr == true ? 1 : 0);
            }
        }
        c = dft0Var;
        d = dft0Var == null ? false : dft0Var.j();
        e = dft0Var == null ? false : dft0Var.i();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        if (fieldC != null && dft0Var != null) {
            dft0Var.b.objectFieldOffset(fieldC);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (bw2.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean d(Class cls) {
        if (!bw2.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(byte[] bArr, long j) {
        return c.b(bArr, f + j);
    }

    public static byte f(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static long i(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object j(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger.getLogger(hft0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.f(f + j, bArr, b2);
    }

    public static void m(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int iH = h(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        o(obj, ((255 & b2) << i) | (iH & (~(255 << i))), j2);
    }

    public static void n(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(obj, ((255 & b2) << i) | (h(obj, j2) & (~(255 << i))), j2);
    }

    public static void o(Object obj, int i, long j) {
        c.b.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void q(Object obj, long j, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
