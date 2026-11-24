package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16364a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;

    public jea(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, String str8) {
        ohs0.z(str2, str3, str5, str6, str7);
        str8.getClass();
        this.f16364a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
        this.h = j2;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jea)) {
            return false;
        }
        jea jeaVar = (jea) obj;
        if (!this.f16364a.equals(jeaVar.f16364a) || !Intrinsics.d(this.b, jeaVar.b) || !Intrinsics.d(this.c, jeaVar.c) || !this.d.equals(jeaVar.d) || !Intrinsics.d(this.e, jeaVar.e) || !Intrinsics.d(this.f, jeaVar.f)) {
            return false;
        }
        long j = jeaVar.g;
        int i = y3d.h;
        return h2t0.a(this.g, j) && h2t0.a(this.h, jeaVar.h) && Intrinsics.d(this.i, jeaVar.i) && Intrinsics.d(this.j, jeaVar.j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f16364a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.j.hashCode() + ua80.b(rw2.b(rw2.b(iB, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.g);
        String strI2 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("CardCricketGameFieldInfoUiModel(firstOpponentImage=", this.f16364a, ", firstOpponentName=", this.b, ", firstOpponentScore=");
        f140.v(sbN, this.c, ", secondOpponentImage=", this.d, ", secondOpponentName=");
        f140.v(sbN, this.e, ", secondOpponentScore=", this.f, ", firstOpponentGlowingColor=");
        f140.v(sbN, strI, ", secondOpponentGlowingColor=", strI2, ", gameState=");
        return ua80.m(sbN, this.i, ", typefacePath=", this.j, Separators.RPAREN);
    }
}
