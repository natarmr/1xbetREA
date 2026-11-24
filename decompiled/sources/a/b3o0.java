package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1918a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final kpm g;
    public final String h;

    public b3o0(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, String str5) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        str5.getClass();
        this.f1918a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = kpmVar;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3o0)) {
            return false;
        }
        b3o0 b3o0Var = (b3o0) obj;
        return Intrinsics.d(this.f1918a, b3o0Var.f1918a) && Intrinsics.d(this.b, b3o0Var.b) && Intrinsics.d(this.c, b3o0Var.c) && Intrinsics.d(this.d, b3o0Var.d) && this.e.equals(b3o0Var.e) && Intrinsics.d(this.f, b3o0Var.f) && this.g.equals(b3o0Var.g) && Intrinsics.d(this.h, b3o0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.c(this.g, ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f1918a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardGame(firstOpponentLabel=", this.f1918a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", gameLabel=", this.f, ", scoreModel=");
        sbN.append(this.g);
        sbN.append(", tagLiveText=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
