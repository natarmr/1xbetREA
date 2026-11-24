package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jqr implements nqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16968a;
    public final String b;
    public final a4x c;
    public final a4x d;

    public jqr(String str, String str2, i4 i4Var, i4 i4Var2) {
        str2.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f16968a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqr)) {
            return false;
        }
        jqr jqrVar = (jqr) obj;
        return this.f16968a.equals(jqrVar.f16968a) && Intrinsics.d(this.b, jqrVar.b) && Intrinsics.d(this.c, jqrVar.c) && Intrinsics.d(this.d, jqrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, ua80.b(this.f16968a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Penalty(score=", this.f16968a, ", penaltyName=", this.b, ", penaltyTeamOne=");
        sbN.append(this.c);
        sbN.append(", penaltyTeamTwo=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
