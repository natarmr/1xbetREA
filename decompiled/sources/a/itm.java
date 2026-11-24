package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class itm implements ltm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15360a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final kpm g;
    public final String h;
    public final boolean i;

    public itm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, String str5, boolean z) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        str5.getClass();
        this.f15360a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = kpmVar;
        this.h = str5;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itm)) {
            return false;
        }
        itm itmVar = (itm) obj;
        return Intrinsics.d(this.f15360a, itmVar.f15360a) && Intrinsics.d(this.b, itmVar.b) && Intrinsics.d(this.c, itmVar.c) && Intrinsics.d(this.d, itmVar.d) && this.e.equals(itmVar.e) && Intrinsics.d(this.f, itmVar.f) && this.g.equals(itmVar.g) && Intrinsics.d(this.h, itmVar.h) && this.i == itmVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(dw9.c(this.g, ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f15360a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V2(firstOpponentLabel=", this.f15360a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", gameLabel=", this.f, ", scoreModel=");
        sbN.append(this.g);
        sbN.append(", tagLiveText=");
        sbN.append(this.h);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
