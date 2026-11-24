package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33226a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final y1m f;

    public t2o0(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, y1m y1mVar) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str3.getClass();
        this.f33226a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = y1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2o0)) {
            return false;
        }
        t2o0 t2o0Var = (t2o0) obj;
        return Intrinsics.d(this.f33226a, t2o0Var.f33226a) && Intrinsics.d(this.b, t2o0Var.b) && Intrinsics.d(this.c, t2o0Var.c) && Intrinsics.d(this.d, t2o0Var.d) && Intrinsics.d(this.e, t2o0Var.e) && this.f.equals(t2o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f33226a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardGame(firstOpponentLabel=", this.f33226a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", gameLabel=");
        sbN.append(this.e);
        sbN.append(", customScoreModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
