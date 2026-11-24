package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o3o0 implements q3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24595a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final a4x g;
    public final String h;

    public o3o0(String str, String str2, String str3, String str4, boolean z, boolean z2, a4x a4xVar, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        a4xVar.getClass();
        this.f24595a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = a4xVar;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3o0)) {
            return false;
        }
        o3o0 o3o0Var = (o3o0) obj;
        return Intrinsics.d(this.f24595a, o3o0Var.f24595a) && Intrinsics.d(this.b, o3o0Var.b) && Intrinsics.d(this.c, o3o0Var.c) && Intrinsics.d(this.d, o3o0Var.d) && this.e == o3o0Var.e && this.f == o3o0Var.f && Intrinsics.d(this.g, o3o0Var.g) && this.h.equals(o3o0Var.h);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(cs0.b(this.g, brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(this.f24595a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Roulette(firstOpponentLabel=", this.f24595a, ", secondOpponentLabel=", this.b, ", firstOpponentScore=");
        f140.v(sbN, this.c, ", secondOpponentScore=", this.d, ", isFirstOpponentScoreChanged=");
        ua80.u(", isSecondOpponentScoreChanged=", ", rouletteList=", sbN, this.e, this.f);
        sbN.append(this.g);
        sbN.append(", infoLabel=");
        sbN.append(this.h);
        sbN.append(", enableEventStatusIndicator=true)");
        return sbN.toString();
    }
}
