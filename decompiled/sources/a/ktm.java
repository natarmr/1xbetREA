package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ktm implements ltm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18873a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final y1m g;
    public final String h;
    public final boolean i;

    public ktm(y1m y1mVar, a4x a4xVar, a4x a4xVar2, String str, String str2, String str3, String str4, String str5, boolean z) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f18873a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = y1mVar;
        this.h = str5;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktm)) {
            return false;
        }
        ktm ktmVar = (ktm) obj;
        return Intrinsics.d(this.f18873a, ktmVar.f18873a) && Intrinsics.d(this.b, ktmVar.b) && Intrinsics.d(this.c, ktmVar.c) && Intrinsics.d(this.d, ktmVar.d) && Intrinsics.d(this.e, ktmVar.e) && Intrinsics.d(this.f, ktmVar.f) && this.g.equals(ktmVar.g) && Intrinsics.d(this.h, ktmVar.h) && this.i == ktmVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b((this.g.hashCode() + ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f18873a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V4(firstOpponentLabel=", this.f18873a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", gameLabel=");
        f140.v(sbN, this.e, ", infoLabel=", this.f, ", customScoreModel=");
        sbN.append(this.g);
        sbN.append(", tagLive=");
        sbN.append(this.h);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
