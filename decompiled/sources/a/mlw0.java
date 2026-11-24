package a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f22013a;
    public static final Class b;
    public static final gft0 c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    static {
        llw0 llw0Var;
        Unsafe unsafe;
        boolean z;
        gft0 gft0Var;
        Unsafe unsafe2;
        Unsafe unsafeE = e();
        f22013a = unsafeE;
        b = pjw0.f27110a;
        Class cls = Long.TYPE;
        boolean zL = l(cls);
        Class cls2 = Integer.TYPE;
        boolean zL2 = l(cls2);
        char c2 = 1;
        byte b2 = 0;
        if (unsafeE == null) {
            llw0Var = null;
        } else if (zL) {
            llw0Var = new llw0(unsafeE, c2 == true ? 1 : 0);
        } else if (zL2) {
            llw0Var = new llw0(unsafeE, b2);
        } else {
            llw0Var = null;
        }
        c = llw0Var;
        if (llw0Var != null && (unsafe2 = llw0Var.b) != null) {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                i();
            } catch (Throwable th) {
                Logger.getLogger(mlw0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            }
        }
        gft0 gft0Var2 = c;
        if (gft0Var2 == null || (unsafe = gft0Var2.b) == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(mlw0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
                z = false;
            }
        }
        d = z;
        f(byte[].class);
        f(boolean[].class);
        j(boolean[].class);
        f(int[].class);
        j(int[].class);
        f(long[].class);
        j(long[].class);
        f(float[].class);
        j(float[].class);
        f(double[].class);
        j(double[].class);
        f(Object[].class);
        j(Object[].class);
        Field fieldI = i();
        if (fieldI != null && (gft0Var = c) != null) {
            gft0Var.b.objectFieldOffset(fieldI);
        }
        e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Object obj, int i, long j) {
        c.b.putInt(obj, j, i);
    }

    public static void b(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void c(Object obj, long j, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }

    public static /* synthetic */ void d(Object obj, long j, boolean z) {
        byte b2 = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int iH = h(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        a(obj, ((255 & b2) << i) | (iH & (~(255 << i))), j2);
    }

    public static Unsafe e() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new cft0((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(mlw0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void f(Class cls) {
        if (d) {
            c.b.arrayBaseOffset(cls);
        }
    }

    public static /* synthetic */ void g(Object obj, long j, boolean z) {
        byte b2 = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        a(obj, ((255 & b2) << i) | (h(obj, j2) & (~(255 << i))), j2);
    }

    public static int h(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static Field i() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void j(Class cls) {
        if (d) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static long k(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static boolean l(Class cls) {
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

    public static Object m(Object obj, long j) {
        return c.b.getObject(obj, j);
    }
}
