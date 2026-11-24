package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class syz implements tyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33045a;
    public final String b;
    public final wui0 c;
    public final boolean d;

    public syz(wui0 wui0Var, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f33045a = str;
        this.b = str2;
        this.c = wui0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syz)) {
            return false;
        }
        syz syzVar = (syz) obj;
        return Intrinsics.d(this.f33045a, syzVar.f33045a) && Intrinsics.d(this.b, syzVar.b) && this.c == syzVar.c && this.d == syzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.c(this.c, ua80.b(this.f33045a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LimitsKenyaTimeLimitUiModel(title=", this.f33045a, ", limit=", this.b, ", position=");
        sbN.append(this.c);
        sbN.append(", isLimitSet=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
