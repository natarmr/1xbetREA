package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k580 implements p580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17707a;
    public final String b;
    public final lpm c;
    public final boolean d;

    public k580(String str, String str2, lpm lpmVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f17707a = str;
        this.b = str2;
        this.c = lpmVar;
        this.d = z;
    }

    @Override // a.p580
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k580)) {
            return false;
        }
        k580 k580Var = (k580) obj;
        return Intrinsics.d(this.f17707a, k580Var.f17707a) && Intrinsics.d(this.b, k580Var.b) && this.c.equals(k580Var.c) && this.d == k580Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f140.e(this.c, ua80.b(this.f17707a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MultiTeamsOpponentsUiModel(firstTeamName=", this.f17707a, ", secondTeamName=", this.b, ", scoreModel=");
        sbN.append(this.c);
        sbN.append(", isSupportRtl=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
