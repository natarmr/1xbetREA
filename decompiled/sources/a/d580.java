package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d580 implements h580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5493a;
    public final String b;
    public final lpm c;
    public final boolean d;

    public d580(String str, String str2, lpm lpmVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.f5493a = str;
        this.b = str2;
        this.c = lpmVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d580)) {
            return false;
        }
        d580 d580Var = (d580) obj;
        return Intrinsics.d(this.f5493a, d580Var.f5493a) && Intrinsics.d(this.b, d580Var.b) && this.c.equals(d580Var.c) && this.d == d580Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f140.e(this.c, ua80.b(this.f5493a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MultiTeamsOpponentsStateModel(firstTeamName=", this.f5493a, ", secondTeamName=", this.b, ", scoreModel=");
        sbN.append(this.c);
        sbN.append(", isSupportRtl=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
