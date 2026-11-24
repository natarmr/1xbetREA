package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gtm implements ltm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11888a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final kpm g;
    public final boolean h;

    public gtm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, boolean z) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        this.f11888a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = kpmVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtm)) {
            return false;
        }
        gtm gtmVar = (gtm) obj;
        return Intrinsics.d(this.f11888a, gtmVar.f11888a) && Intrinsics.d(this.b, gtmVar.b) && Intrinsics.d(this.c, gtmVar.c) && Intrinsics.d(this.d, gtmVar.d) && this.e.equals(gtmVar.e) && Intrinsics.d(this.f, gtmVar.f) && this.g.equals(gtmVar.g) && this.h == gtmVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + dw9.c(this.g, ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f11888a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(firstOpponentLabel=", this.f11888a, ", secondOpponentLabel=", this.b, ", firstOpponentCardList=");
        hne.y(sbN, this.c, ", secondOpponentCardList=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", gameLabel=", this.f, ", scoreModel=");
        sbN.append(this.g);
        sbN.append(", supportRtl=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
