package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f100 implements g100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8741a;
    public final String b;
    public final wui0 c;
    public final boolean d;

    public f100(wui0 wui0Var, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f8741a = str;
        this.b = str2;
        this.c = wui0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f100)) {
            return false;
        }
        f100 f100Var = (f100) obj;
        return Intrinsics.d(this.f8741a, f100Var.f8741a) && Intrinsics.d(this.b, f100Var.b) && this.c == f100Var.c && this.d == f100Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.c(this.c, ua80.b(this.f8741a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LimitsNeTimeLimitUiModel(title=", this.f8741a, ", limit=", this.b, ", position=");
        sbN.append(this.c);
        sbN.append(", isLimitSet=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
