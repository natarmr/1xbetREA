package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dwm implements fwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6807a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final y1m h;
    public final boolean i;

    public dwm(y1m y1mVar, a4x a4xVar, a4x a4xVar2, String str, String str2, String str3, String str4, String str5, boolean z) {
        brm0.B(str, str2, str5);
        this.f6807a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = y1mVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwm)) {
            return false;
        }
        dwm dwmVar = (dwm) obj;
        return Intrinsics.d(this.f6807a, dwmVar.f6807a) && Intrinsics.d(this.b, dwmVar.b) && this.c.equals(dwmVar.c) && this.d.equals(dwmVar.d) && this.e.equals(dwmVar.e) && this.f.equals(dwmVar.f) && Intrinsics.d(this.g, dwmVar.g) && this.h.equals(dwmVar.h) && this.i == dwmVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f6807a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V3(firstOpponentLabel=", this.f6807a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", gameLabel=");
        sbN.append(this.g);
        sbN.append(", scoreModel=");
        sbN.append(this.h);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
