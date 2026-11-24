package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j3o0 implements q3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15846a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public j3o0(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f15846a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3o0)) {
            return false;
        }
        j3o0 j3o0Var = (j3o0) obj;
        return Intrinsics.d(this.f15846a, j3o0Var.f15846a) && Intrinsics.d(this.b, j3o0Var.b) && Intrinsics.d(this.c, j3o0Var.c) && Intrinsics.d(this.d, j3o0Var.d) && this.e.equals(j3o0Var.e) && Intrinsics.d(this.f, j3o0Var.f) && Intrinsics.d(this.g, j3o0Var.g) && Intrinsics.d(this.h, j3o0Var.h) && this.i == j3o0Var.i && this.j == j3o0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f15846a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardGame(firstOpponentLabel=", this.f15846a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", gameLabel=", this.f, ", firstResultScore=");
        f140.v(sbN, this.g, ", secondResultScore=", this.h, ", firstResultScoreChanged=");
        return ohs0.p(", secondResultScoreChanged=", ", enableEventStatusIndicator=true)", sbN, this.i, this.j);
    }
}
