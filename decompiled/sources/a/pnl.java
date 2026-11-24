package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pnl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27294a;
    public final String b;
    public final String c;
    public final n0x d;

    public pnl(n0x n0xVar, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f27294a = str;
        this.b = str2;
        this.c = str3;
        this.d = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnl)) {
            return false;
        }
        pnl pnlVar = (pnl) obj;
        return Intrinsics.d(this.f27294a, pnlVar.f27294a) && Intrinsics.d(this.b, pnlVar.b) && Intrinsics.d(this.c, pnlVar.c) && this.d.equals(pnlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f27294a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(headerLabel=", this.f27294a, ", label=", this.b, ", caption=");
        sbN.append(this.c);
        sbN.append(", picture=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
