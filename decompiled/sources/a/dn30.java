package a;

/* JADX INFO: loaded from: classes.dex */
public final class dn30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6348a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new dn30(new cn30());
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(2);
        vtt0.H(3);
        vtt0.H(4);
    }

    public dn30(cn30 cn30Var) {
        long j = cn30Var.f4635a;
        long j2 = cn30Var.b;
        long j3 = cn30Var.c;
        float f = cn30Var.d;
        float f2 = cn30Var.e;
        this.f6348a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final cn30 a() {
        cn30 cn30Var = new cn30();
        cn30Var.f4635a = this.f6348a;
        cn30Var.b = this.b;
        cn30Var.c = this.c;
        cn30Var.d = this.d;
        cn30Var.e = this.e;
        return cn30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn30)) {
            return false;
        }
        dn30 dn30Var = (dn30) obj;
        return this.f6348a == dn30Var.f6348a && this.b == dn30Var.b && this.c == dn30Var.c && this.d == dn30Var.d && this.e == dn30Var.e;
    }

    public final int hashCode() {
        long j = this.f6348a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
