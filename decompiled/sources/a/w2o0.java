package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38460a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final y1m h;

    public w2o0(y1m y1mVar, a4x a4xVar, a4x a4xVar2, String str, String str2, String str3, String str4, String str5) {
        brm0.B(str, str2, str5);
        this.f38460a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = y1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2o0)) {
            return false;
        }
        w2o0 w2o0Var = (w2o0) obj;
        return Intrinsics.d(this.f38460a, w2o0Var.f38460a) && Intrinsics.d(this.b, w2o0Var.b) && this.c.equals(w2o0Var.c) && this.d.equals(w2o0Var.d) && this.e.equals(w2o0Var.e) && this.f.equals(w2o0Var.f) && Intrinsics.d(this.g, w2o0Var.g) && this.h.equals(w2o0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f38460a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DicePoker(firstOpponentLabel=", this.f38460a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", gameLabel=");
        sbN.append(this.g);
        sbN.append(", scoreModel=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
