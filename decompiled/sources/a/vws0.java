package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38169a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vws0(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str4.getClass();
        this.f38169a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vws0)) {
            return false;
        }
        vws0 vws0Var = (vws0) obj;
        return Intrinsics.d(this.f38169a, vws0Var.f38169a) && this.b == vws0Var.b && this.c.equals(vws0Var.c) && this.d.equals(vws0Var.d) && Intrinsics.d(this.e, vws0Var.e) && this.f == vws0Var.f && this.g == vws0Var.g && this.h == vws0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.b, this.f38169a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V1(opponentLabel=", this.f38169a, ", redCardCounter=", ", gameScore=");
        f140.v(sbP, this.c, ", setScore=", this.d, ", resultScore=");
        brm0.C(this.e, ", resultScoreChanged=", ", gameScoreChanged=", sbP, this.f);
        return ohs0.p(", setScoreChanged=", Separators.RPAREN, sbP, this.g, this.h);
    }
}
