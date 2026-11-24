package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kym implements oym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19112a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final a4x g;
    public final String h;

    public kym(String str, String str2, String str3, String str4, boolean z, boolean z2, a4x a4xVar, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        a4xVar.getClass();
        this.f19112a = str;
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
        if (!(obj instanceof kym)) {
            return false;
        }
        kym kymVar = (kym) obj;
        return Intrinsics.d(this.f19112a, kymVar.f19112a) && Intrinsics.d(this.b, kymVar.b) && Intrinsics.d(this.c, kymVar.c) && Intrinsics.d(this.d, kymVar.d) && this.e == kymVar.e && this.f == kymVar.f && Intrinsics.d(this.g, kymVar.g) && this.h.equals(kymVar.h);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(cs0.b(this.g, brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(this.f19112a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V1(firstOpponentLabel=", this.f19112a, ", secondOpponentLabel=", this.b, ", firstOpponentScore=");
        f140.v(sbN, this.c, ", secondOpponentScore=", this.d, ", isFirstOpponentScoreChanged=");
        ua80.u(", isSecondOpponentScoreChanged=", ", rouletteList=", sbN, this.e, this.f);
        sbN.append(this.g);
        sbN.append(", infoLabel=");
        sbN.append(this.h);
        sbN.append(", enableEventStatusIndicator=true)");
        return sbN.toString();
    }
}
