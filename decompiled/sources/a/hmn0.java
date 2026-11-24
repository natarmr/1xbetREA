package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hmn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13318a;
    public final int b;
    public final int c;
    public final String d;

    public hmn0(String str, int i, int i2, String str2) {
        this.f13318a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmn0)) {
            return false;
        }
        hmn0 hmn0Var = (hmn0) obj;
        return this.f13318a.equals(hmn0Var.f13318a) && this.b == hmn0Var.b && this.c == hmn0Var.c && this.d.equals(hmn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f13318a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", winRate=", this.d, Separators.RPAREN, kng0.p(this.b, "SurfaceModel(surface=", this.f13318a, ", wins=", ", losses="));
    }
}
