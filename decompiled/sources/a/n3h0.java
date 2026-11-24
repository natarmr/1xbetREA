package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22851a;
    public final String b;
    public final bnq0 c;
    public final String d;
    public final boolean e;

    public n3h0(String str, String str2, bnq0 bnq0Var, String str3, boolean z) {
        this.f22851a = str;
        this.b = str2;
        this.c = bnq0Var;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3h0)) {
            return false;
        }
        n3h0 n3h0Var = (n3h0) obj;
        return this.f22851a.equals(n3h0Var.f22851a) && this.b.equals(n3h0Var.b) && Intrinsics.d(this.c, n3h0Var.c) && this.d.equals(n3h0Var.d) && this.e == n3h0Var.e;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f22851a.hashCode() * 31, 31, this.b);
        bnq0 bnq0Var = this.c;
        return Boolean.hashCode(this.e) + ua80.b((iB + (bnq0Var == null ? 0 : bnq0Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ScoreModel(fullScore=", this.f22851a, ", currentPeriodName=", this.b, ", timer=");
        sbN.append(this.c);
        sbN.append(", info=");
        sbN.append(this.d);
        sbN.append(", isBreak=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
