package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2o0 implements s2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19321a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final y1m g;
    public final String h;

    public l2o0(y1m y1mVar, a4x a4xVar, a4x a4xVar2, String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f19321a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = y1mVar;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2o0)) {
            return false;
        }
        l2o0 l2o0Var = (l2o0) obj;
        return Intrinsics.d(this.f19321a, l2o0Var.f19321a) && Intrinsics.d(this.b, l2o0Var.b) && Intrinsics.d(this.c, l2o0Var.c) && Intrinsics.d(this.d, l2o0Var.d) && Intrinsics.d(this.e, l2o0Var.e) && Intrinsics.d(this.f, l2o0Var.f) && this.g.equals(l2o0Var.g) && Intrinsics.d(this.h, l2o0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f19321a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardGame(firstOpponentLabel=", this.f19321a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", gameLabel=");
        f140.v(sbN, this.e, ", infoLabel=", this.f, ", customScoreModel=");
        sbN.append(this.g);
        sbN.append(", tagLive=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
