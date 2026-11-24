package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class zsv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44925a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public zsv(int i, String str, String str2, boolean z, boolean z2) {
        this.f44925a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsv)) {
            return false;
        }
        zsv zsvVar = (zsv) obj;
        return this.f44925a.equals(zsvVar.f44925a) && this.b.equals(zsvVar.b) && this.c == zsvVar.c && this.d == zsvVar.d && this.e == zsvVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(R.drawable.ic_glyph_info_circle, twn.a(this.d, brm0.e(ua80.b(this.f44925a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HeaderUiState(title=", this.f44925a, ", subtitle=", this.b, ", editIconVisible=");
        ua80.q(this.d, ", editIconRes=", ", infoIconResId=", sbN, this.c);
        return ohs0.k(R.drawable.ic_glyph_info_circle, ", isVisibleBottomShadow=", Separators.RPAREN, sbN, this.e);
    }
}
