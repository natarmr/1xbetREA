package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23425a;
    public final String b;
    public final String c;
    public final n0x d;
    public final chl0 e;

    public nfa(String str, String str2, String str3, n0x n0xVar, chl0 chl0Var) {
        str.getClass();
        str2.getClass();
        this.f23425a = str;
        this.b = str2;
        this.c = str3;
        this.d = n0xVar;
        this.e = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfa)) {
            return false;
        }
        nfa nfaVar = (nfa) obj;
        return Intrinsics.d(this.f23425a, nfaVar.f23425a) && Intrinsics.d(this.b, nfaVar.b) && this.c.equals(nfaVar.c) && this.d.equals(nfaVar.d) && this.e.equals(nfaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f140.f(this.d, ua80.b(ua80.b(this.f23425a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardExpressItem(title=", this.f23425a, ", subTitle=", this.b, ", caption=");
        sbN.append(this.c);
        sbN.append(", icon=");
        sbN.append(this.d);
        sbN.append(", sportMarket=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
