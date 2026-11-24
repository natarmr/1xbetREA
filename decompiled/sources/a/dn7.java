package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dn7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6354a;
    public final String b;
    public final String c;
    public final tvw d;

    public dn7(String str, String str2, String str3, tvw tvwVar) {
        brm0.B(str, str2, str3);
        this.f6354a = str;
        this.b = str2;
        this.c = str3;
        this.d = tvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn7)) {
            return false;
        }
        dn7 dn7Var = (dn7) obj;
        return Intrinsics.d(this.f6354a, dn7Var.f6354a) && Intrinsics.d(this.b, dn7Var.b) && Intrinsics.d(this.c, dn7Var.c) && this.d.equals(dn7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f6354a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetSummaryInfoUiModel(statisticTitle=", this.f6354a, ", betAmount=", this.b, ", count=");
        sbN.append(this.c);
        sbN.append(", iconBetUiModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
