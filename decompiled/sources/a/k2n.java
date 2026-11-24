package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17582a;
    public final String b;
    public final a4x c;
    public final String d;
    public final boolean e;

    public k2n(String str, String str2, i4 i4Var, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        str3.getClass();
        this.f17582a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2n)) {
            return false;
        }
        k2n k2nVar = (k2n) obj;
        return Intrinsics.d(this.f17582a, k2nVar.f17582a) && Intrinsics.d(this.b, k2nVar.b) && Intrinsics.d(this.c, k2nVar.c) && Intrinsics.d(this.d, k2nVar.d) && this.e == k2nVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(cs0.b(this.c, ua80.b(this.f17582a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V1(opponentName=", this.f17582a, ", formulaValue=", this.b, ", scores=");
        sbN.append(this.c);
        sbN.append(", resultScore=");
        sbN.append(this.d);
        sbN.append(", resultScoreChanged=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
