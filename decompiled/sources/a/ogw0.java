package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class ogw0 extends gft0 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogw0(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 3);
        this.c = b;
    }

    @Override // a.gft0
    public final void l(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (!pgw0.f) {
                    pgw0.c(obj, j, b);
                } else {
                    pgw0.b(j, obj, b);
                }
                break;
            default:
                if (!pgw0.f) {
                    pgw0.c(obj, j, b);
                } else {
                    pgw0.b(j, obj, b);
                }
                break;
        }
    }

    @Override // a.gft0
    public final boolean q(Object obj, long j) {
        switch (this.c) {
            case 0:
                return pgw0.f ? pgw0.m(obj, j) : pgw0.n(obj, j);
            default:
                return pgw0.f ? pgw0.m(obj, j) : pgw0.n(obj, j);
        }
    }

    @Override // a.gft0
    public final void r(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!pgw0.f) {
                    pgw0.c(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    pgw0.b(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!pgw0.f) {
                    pgw0.c(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    pgw0.b(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // a.gft0
    public final float t(Object obj, long j) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // a.gft0
    public final void u(Object obj, long j, float f) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // a.gft0
    public final double v(Object obj, long j) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // a.gft0
    public final void w(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
