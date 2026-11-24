package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class llw0 extends gft0 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ llw0(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 4);
        this.c = b;
    }

    @Override // a.gft0
    public final double k(Object obj, long j) {
        switch (this.c) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(this.b.getLong(obj, j));
    }

    @Override // a.gft0
    public final void m(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // a.gft0
    public final void n(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // a.gft0
    public final void o(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!mlw0.e) {
                    mlw0.g(obj, j, z);
                } else {
                    mlw0.d(obj, j, z);
                }
                break;
            default:
                if (!mlw0.e) {
                    mlw0.g(obj, j, z);
                } else {
                    mlw0.d(obj, j, z);
                }
                break;
        }
    }

    @Override // a.gft0
    public final float p(Object obj, long j) {
        switch (this.c) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(this.b.getInt(obj, j));
    }

    @Override // a.gft0
    public final boolean s(Object obj, long j) {
        switch (this.c) {
            case 0:
                if (mlw0.e) {
                    if (((byte) (mlw0.h(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else if (((byte) (mlw0.h(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) == 0) {
                    return false;
                }
                return true;
            default:
                if (mlw0.e) {
                    if (((byte) (mlw0.h(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else if (((byte) (mlw0.h(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) == 0) {
                    return false;
                }
                return true;
        }
    }
}
