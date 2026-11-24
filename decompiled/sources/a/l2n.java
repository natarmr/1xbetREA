package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19318a;
    public final String b;
    public final a4x c;
    public final String d;
    public final String e;
    public final boolean f;

    public l2n(String str, String str2, i4 i4Var, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        str3.getClass();
        str4.getClass();
        this.f19318a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2n)) {
            return false;
        }
        l2n l2nVar = (l2n) obj;
        return Intrinsics.d(this.f19318a, l2nVar.f19318a) && Intrinsics.d(this.b, l2nVar.b) && Intrinsics.d(this.c, l2nVar.c) && Intrinsics.d(this.d, l2nVar.d) && Intrinsics.d(this.e, l2nVar.e) && this.f == l2nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(cs0.b(this.c, ua80.b(this.f19318a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V2(opponentName=", this.f19318a, ", formulaValue=", this.b, ", scores=");
        sbN.append(this.c);
        sbN.append(", resultScoreTitle=");
        sbN.append(this.d);
        sbN.append(", resultScoreValue=");
        return defpackage.c.c(this.e, ", resultScoreChanged=", Separators.RPAREN, sbN, this.f);
    }
}
