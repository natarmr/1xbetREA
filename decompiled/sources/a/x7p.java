package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x7p implements y7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40423a;
    public final String b;
    public final d280 c;
    public final d280 d;

    public x7p(String str, String str2, d280 d280Var, d280 d280Var2) {
        str.getClass();
        str2.getClass();
        this.f40423a = str;
        this.b = str2;
        this.c = d280Var;
        this.d = d280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7p)) {
            return false;
        }
        x7p x7pVar = (x7p) obj;
        return Intrinsics.d(this.f40423a, x7pVar.f40423a) && Intrinsics.d(this.b, x7pVar.b) && this.c.equals(x7pVar.c) && this.d.equals(x7pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.e(this.c, ua80.b(this.f40423a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwoTeams(firstOpponentLabel=", this.f40423a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        sbN.append(this.c);
        sbN.append(", secondOpponentIcon=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
