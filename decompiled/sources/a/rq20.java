package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rq20 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30910a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public rq20(String str, String str2, String str3, List list, String str4) {
        list.getClass();
        this.f30910a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq20)) {
            return false;
        }
        rq20 rq20Var = (rq20) obj;
        return this.f30910a.equals(rq20Var.f30910a) && this.b.equals(rq20Var.b) && this.c.equals(rq20Var.c) && this.d.equals(rq20Var.d) && Intrinsics.d(this.e, rq20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f30910a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MarbleGamesModel(firstTeamName=", this.f30910a, ", secondTeamName=", this.b, ", firstTeamImage=");
        f140.v(sbN, this.c, ", secondTeamImage=", this.d, ", periodsScore=");
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
