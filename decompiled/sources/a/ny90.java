package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ny90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24320a;
    public final String b;
    public final boolean c;
    public final int d;

    public ny90(int i, String str, String str2, boolean z) {
        this.f24320a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny90)) {
            return false;
        }
        ny90 ny90Var = (ny90) obj;
        return this.f24320a.equals(ny90Var.f24320a) && this.b.equals(ny90Var.b) && this.c == ny90Var.c && this.d == ny90Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(ua80.b(this.f24320a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerAbilitiesModel(name=", this.f24320a, ", image=", this.b, ", isTalent=");
        sbN.append(this.c);
        sbN.append(", slot=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
