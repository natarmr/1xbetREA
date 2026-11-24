package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lym implements oym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20868a;
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

    public lym(String str, String str2, c280 c280Var, c280 c280Var2, String str3, String str4, boolean z, boolean z2, a4x a4xVar, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        a4xVar.getClass();
        str6.getClass();
        this.f20868a = str;
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
        if (!(obj instanceof lym)) {
            return false;
        }
        lym lymVar = (lym) obj;
        return Intrinsics.d(this.f20868a, lymVar.f20868a) && Intrinsics.d(this.b, lymVar.b) && this.c.equals(lymVar.c) && this.d.equals(lymVar.d) && Intrinsics.d(this.e, lymVar.e) && Intrinsics.d(this.f, lymVar.f) && this.g == lymVar.g && this.h == lymVar.h && Intrinsics.d(this.i, lymVar.i) && this.j.equals(lymVar.j) && Intrinsics.d(this.k, lymVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(cs0.b(this.i, brm0.e(brm0.e(ua80.b(ua80.b(hne.g(this.d, hne.g(this.c, ua80.b(this.f20868a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V2(firstOpponentLabel=", this.f20868a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
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
