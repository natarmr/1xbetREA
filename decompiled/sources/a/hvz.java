package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hvz implements ivz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13746a;
    public final String b;
    public final wui0 c;
    public final boolean d;

    public hvz(wui0 wui0Var, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f13746a = str;
        this.b = str2;
        this.c = wui0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvz)) {
            return false;
        }
        hvz hvzVar = (hvz) obj;
        return Intrinsics.d(this.f13746a, hvzVar.f13746a) && Intrinsics.d(this.b, hvzVar.b) && this.c == hvzVar.c && this.d == hvzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.c(this.c, ua80.b(this.f13746a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LimitsEeTimeLimitUiModel(title=", this.f13746a, ", limit=", this.b, ", position=");
        sbN.append(this.c);
        sbN.append(", isLimitSet=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
