package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40544a;
    public final String b;
    public final String c;
    public final a4x d;
    public final a4x e;
    public final int f;

    public xaa(String str, String str2, String str3, a4x a4xVar, a4x a4xVar2, int i) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f40544a = str;
        this.b = str2;
        this.c = str3;
        this.d = a4xVar;
        this.e = a4xVar2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaa)) {
            return false;
        }
        xaa xaaVar = (xaa) obj;
        return this.f40544a.equals(xaaVar.f40544a) && this.b.equals(xaaVar.b) && this.c.equals(xaaVar.c) && Intrinsics.d(this.d, xaaVar.d) && Intrinsics.d(this.e, xaaVar.e) && this.f == xaaVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + cs0.b(this.e, cs0.b(this.d, ua80.b(ua80.b(this.f40544a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardBasketballGameFieldUiModel(fieldImage=", this.f40544a, ", baseCardImage=", this.b, ", cardDeckImage=");
        cs0.B(sbN, this.c, ", firstPlayerCards=", this.d, ", secondPlayerCards=");
        sbN.append(this.e);
        sbN.append(", totalShots=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
