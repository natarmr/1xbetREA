package a;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11222a;
    public final Unsafe b;

    public /* synthetic */ gft0(Unsafe unsafe, byte b) {
        this.f11222a = b;
        this.b = unsafe;
    }

    public abstract boolean a(Object obj, long j);

    public abstract byte b(Object obj, long j);

    public abstract double c(Object obj, long j);

    public abstract float d(Object obj, long j);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(long j, Object obj, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public boolean i() {
        byte b = this.f11222a;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th) {
                        hft0.k(th);
                    }
                }
                return false;
            case 1:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th2) {
                        ift0.k(th2);
                    }
                }
                return false;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls5 = unsafe.getClass();
                        cls5.getMethod("objectFieldOffset", Field.class);
                        cls5.getMethod("arrayBaseOffset", Class.class);
                        cls5.getMethod("arrayIndexScale", Class.class);
                        cls5.getMethod("getInt", Object.class, cls2);
                        cls5.getMethod("putInt", Object.class, cls2, cls);
                        cls5.getMethod("getLong", Object.class, cls2);
                        cls5.getMethod("putLong", Object.class, cls2, cls2);
                        cls5.getMethod("getObject", Object.class, cls2);
                        cls5.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th3) {
                        jft0.i(th3);
                    }
                }
                return false;
        }
    }

    public abstract boolean j();

    public abstract double k(Object obj, long j);

    public abstract void l(long j, Object obj, byte b);

    public abstract void m(Object obj, long j, double d);

    public abstract void n(Object obj, long j, float f);

    public abstract void o(Object obj, long j, boolean z);

    public abstract float p(Object obj, long j);

    public abstract boolean q(Object obj, long j);

    public abstract void r(Object obj, long j, boolean z);

    public abstract boolean s(Object obj, long j);

    public abstract float t(Object obj, long j);

    public abstract void u(Object obj, long j, float f);

    public abstract double v(Object obj, long j);

    public abstract void w(Object obj, long j, double d);
}
