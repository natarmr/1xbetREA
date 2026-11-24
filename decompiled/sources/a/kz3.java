package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kz3 implements lz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm80 f19135a;
    public final hhn0 b;

    public kz3(pm80 pm80Var, hhn0 hhn0Var) {
        this.f19135a = pm80Var;
        this.b = hhn0Var;
    }

    @Override // a.lz3
    public final pm80 a() {
        return this.f19135a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz3)) {
            return false;
        }
        kz3 kz3Var = (kz3) obj;
        return this.f19135a.equals(kz3Var.f19135a) && this.b.equals(kz3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19135a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f19135a + ", result=" + this.b + Separators.RPAREN;
    }
}
