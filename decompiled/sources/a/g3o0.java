package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10620a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final a4x i;
    public final String j;
    public final String k;

    public g3o0(String str, String str2, c280 c280Var, c280 c280Var2, String str3, String str4, boolean z, boolean z2, a4x a4xVar, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        a4xVar.getClass();
        str6.getClass();
        this.f10620a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = a4xVar;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3o0)) {
            return false;
        }
        g3o0 g3o0Var = (g3o0) obj;
        return Intrinsics.d(this.f10620a, g3o0Var.f10620a) && Intrinsics.d(this.b, g3o0Var.b) && this.c.equals(g3o0Var.c) && this.d.equals(g3o0Var.d) && Intrinsics.d(this.e, g3o0Var.e) && Intrinsics.d(this.f, g3o0Var.f) && this.g == g3o0Var.g && this.h == g3o0Var.h && Intrinsics.d(this.i, g3o0Var.i) && this.j.equals(g3o0Var.j) && Intrinsics.d(this.k, g3o0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(cs0.b(this.i, brm0.e(brm0.e(ua80.b(ua80.b(hne.g(this.d, hne.g(this.c, ua80.b(this.f10620a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Roulette(firstOpponentLabel=", this.f10620a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", firstOpponentScore=");
        f140.v(sbN, this.e, ", secondOpponentScore=", this.f, ", isFirstOpponentScoreChanged=");
        ua80.u(", isSecondOpponentScoreChanged=", ", rouletteList=", sbN, this.g, this.h);
        sbN.append(this.i);
        sbN.append(", infoLabel=");
        sbN.append(this.j);
        sbN.append(", tagLiveText=");
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
