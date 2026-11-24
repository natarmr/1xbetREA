package a;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class dft0 extends gft0 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dft0(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 0);
        this.c = b;
    }

    @Override // a.gft0
    public final boolean a(Object obj, long j) {
        switch (this.c) {
            case 0:
                if (hft0.g) {
                    if (hft0.f(obj, j) == 0) {
                        return false;
                    }
                } else if (hft0.g(obj, j) == 0) {
                    return false;
                }
                return true;
            case 1:
                if (hft0.g) {
                    if (hft0.f(obj, j) == 0) {
                        return false;
                    }
                } else if (hft0.g(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                return this.b.getBoolean(obj, j);
        }
    }

    @Override // a.gft0
    public final byte b(Object obj, long j) {
        switch (this.c) {
            case 0:
                return hft0.g ? hft0.f(obj, j) : hft0.g(obj, j);
            case 1:
                return hft0.g ? hft0.f(obj, j) : hft0.g(obj, j);
            default:
                return this.b.getByte(obj, j);
        }
    }

    @Override // a.gft0
    public final double c(Object obj, long j) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return this.b.getDouble(obj, j);
        }
    }

    @Override // a.gft0
    public final float d(Object obj, long j) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return this.b.getFloat(obj, j);
        }
    }

    @Override // a.gft0
    public final void e(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!hft0.g) {
                    hft0.n(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    hft0.m(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            case 1:
                if (!hft0.g) {
                    hft0.n(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    hft0.m(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                this.b.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // a.gft0
    public final void f(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (!hft0.g) {
                    hft0.n(j, obj, b);
                } else {
                    hft0.m(j, obj, b);
                }
                break;
            case 1:
                if (!hft0.g) {
                    hft0.n(j, obj, b);
                } else {
                    hft0.m(j, obj, b);
                }
                break;
            default:
                this.b.putByte(obj, j, b);
                break;
        }
    }

    @Override // a.gft0
    public final void g(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putDouble(obj, j, d);
                break;
        }
    }

    @Override // a.gft0
    public final void h(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.b.putFloat(obj, j, f);
                break;
        }
    }

    @Override // a.gft0
    public boolean i() {
        switch (this.c) {
            case 2:
                if (!super.i()) {
                    return false;
                }
                try {
                    Class<?> cls = this.b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    hft0.k(th);
                    return false;
                }
            default:
                return super.i();
        }
    }

    @Override // a.gft0
    public final boolean j() {
        switch (this.c) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.b;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (hft0.c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        hft0.k(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    hft0.k(th2);
                    return false;
                }
        }
    }
}
