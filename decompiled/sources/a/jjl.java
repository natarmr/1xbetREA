package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jjl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16624a;
    public final String b;
    public final String c;
    public final String d;
    public final y3d e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jjl(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, new y3d(s6t0.b().f33626a.getBackgroundContent()));
        pz40 pz40Var = s6t0.f31722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjl)) {
            return false;
        }
        jjl jjlVar = (jjl) obj;
        return Intrinsics.d(this.f16624a, jjlVar.f16624a) && Intrinsics.d(this.b, jjlVar.b) && Intrinsics.d(this.c, jjlVar.c) && Intrinsics.d(this.d, jjlVar.d) && Intrinsics.d(this.e, jjlVar.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f16624a.hashCode() * 31, 31, this.b);
        int iHashCode = 0;
        String str = this.c;
        int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        y3d y3dVar = this.e;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DsAccountSelectionUiModel(balanceValue=", this.f16624a, ", currency=", this.b, ", topUpButtonText=");
        f140.v(sbN, this.c, ", accountTitle=", this.d, ", backgroundColor=");
        return hne.p(sbN, this.e, Separators.RPAREN);
    }

    public jjl(String str, String str2, String str3, String str4, y3d y3dVar) {
        str.getClass();
        str2.getClass();
        this.f16624a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = y3dVar;
    }
}
