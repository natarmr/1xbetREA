package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45023a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public zus(boolean z, boolean z2, String str, int i) {
        this.f45023a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zus)) {
            return false;
        }
        zus zusVar = (zus) obj;
        return this.f45023a.equals(zusVar.f45023a) && this.b == zusVar.b && this.c == zusVar.c && this.d == zusVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, this.f45023a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", menuEnabled=", Separators.RPAREN, kng0.p(this.b, "GameToolbarUiModel(title=", this.f45023a, ", quickBetIconResId=", ", quickBetVisible="), this.c, this.d);
    }
}
