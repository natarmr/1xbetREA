package a;

/* JADX INFO: loaded from: classes.dex */
public final class zg9 extends xg9 {
    public float e;

    public zg9(float f) {
        super(null);
        this.e = f;
    }

    @Override // a.xg9
    public final float e() {
        char[] cArr;
        if (Float.isNaN(this.e) && (cArr = this.f40826a) != null && cArr.length >= 1) {
            this.e = Float.parseFloat(c());
        }
        return this.e;
    }

    @Override // a.xg9
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zg9) {
            float fE = e();
            float fE2 = ((zg9) obj).e();
            if ((Float.isNaN(fE) && Float.isNaN(fE2)) || fE == fE2) {
                return true;
            }
        }
        return false;
    }

    @Override // a.xg9
    public final int f() {
        char[] cArr;
        if (Float.isNaN(this.e) && (cArr = this.f40826a) != null && cArr.length >= 1) {
            this.e = Integer.parseInt(c());
        }
        return (int) this.e;
    }

    @Override // a.xg9
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.e;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }
}
