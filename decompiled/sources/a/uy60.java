package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uy60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36476a;
    public final String b;
    public final String c;
    public final y3q d;
    public final imm e;
    public final mtl f;
    public final a4x g;
    public final a4x h;
    public final a4x i;

    public uy60(String str, String str2, String str3, y3q y3qVar, imm immVar, mtl mtlVar, a4x a4xVar, a4x a4xVar2, a4x a4xVar3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f36476a = str;
        this.b = str2;
        this.c = str3;
        this.d = y3qVar;
        this.e = immVar;
        this.f = mtlVar;
        this.g = a4xVar;
        this.h = a4xVar2;
        this.i = a4xVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy60)) {
            return false;
        }
        uy60 uy60Var = (uy60) obj;
        return Intrinsics.d(this.f36476a, uy60Var.f36476a) && Intrinsics.d(this.b, uy60Var.b) && Intrinsics.d(this.c, uy60Var.c) && this.d.equals(uy60Var.d) && this.e.equals(uy60Var.e) && this.f.equals(uy60Var.f) && Intrinsics.d(this.g, uy60Var.g) && Intrinsics.d(this.h, uy60Var.h) && Intrinsics.d(this.i, uy60Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cs0.b(this.h, cs0.b(this.g, cs0.b(this.f.f22376a, h97.a(this.e, (this.d.hashCode() + ua80.b(ua80.b(this.f36476a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneXGamesFilterUiState(categoryHeaderTitle=", this.f36476a, ", sortByHeaderTitle=", this.b, ", coefficientHeaderTitle=");
        sbN.append(this.c);
        sbN.append(", filterUiState=");
        sbN.append(this.d);
        sbN.append(", navigationBar=");
        sbN.append(this.e);
        sbN.append(", bottomBarModel=");
        sbN.append(this.f);
        sbN.append(", chipsItems=");
        hne.y(sbN, this.g, ", sortOptionCells=", this.h, ", coefficientOptionCells=");
        return cs0.n(sbN, this.i, Separators.RPAREN);
    }
}
