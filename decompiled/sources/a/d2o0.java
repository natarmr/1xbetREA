package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d2o0 implements k2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5366a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final kpm g;

    public d2o0(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        this.f5366a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = kpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2o0)) {
            return false;
        }
        d2o0 d2o0Var = (d2o0) obj;
        return Intrinsics.d(this.f5366a, d2o0Var.f5366a) && Intrinsics.d(this.b, d2o0Var.b) && Intrinsics.d(this.c, d2o0Var.c) && Intrinsics.d(this.d, d2o0Var.d) && this.e.equals(d2o0Var.e) && Intrinsics.d(this.f, d2o0Var.f) && this.g.equals(d2o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f5366a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardGame(firstOpponentLabel=", this.f5366a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", gameLabel=", this.f, ", scoreModel=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
