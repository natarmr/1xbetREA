package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class a7k implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f375a;
    public final float b;
    public final hsq c;

    public a7k(float f, float f2, hsq hsqVar) {
        this.f375a = f;
        this.b = f2;
        this.c = hsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7k)) {
            return false;
        }
        a7k a7kVar = (a7k) obj;
        return Float.compare(this.f375a, a7kVar.f375a) == 0 && Float.compare(this.b, a7kVar.b) == 0 && this.c.equals(a7kVar.c);
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f375a;
    }

    public final int hashCode() {
        return this.c.hashCode() + defpackage.c.a(Float.hashCode(this.f375a) * 31, this.b, 31);
    }

    @Override // a.w6k
    public final long o(float f) {
        return idm0.v(this.c.a(f), 4294967296L);
    }

    @Override // a.w6k
    public final float s(long j) {
        if (eaq0.a(daq0.b(j), 4294967296L)) {
            return this.c.b(daq0.c(j));
        }
        jf4.n("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f375a, this.b, "DensityWithConverter(density=", ", fontScale=", ", converter=");
        sbS.append(this.c);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }

    @Override // a.w6k
    public final float v0() {
        return this.b;
    }
}
