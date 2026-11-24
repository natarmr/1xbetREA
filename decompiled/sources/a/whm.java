package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class whm implements yhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39173a;
    public final String b;
    public final boolean c;
    public final llm d;
    public final emm e;
    public final tlm f;
    public final llm g;
    public final dmm h;
    public final tlm i;
    public final sd j;
    public final ee k;
    public final n0x l;
    public final int m;
    public final a4x n;

    public whm(String str, String str2, boolean z, llm llmVar, emm emmVar, tlm tlmVar, llm llmVar2, dmm dmmVar, tlm tlmVar2, sd sdVar, ee eeVar, n0x n0xVar, int i, a4x a4xVar) {
        w6x.x(a4xVar, str, str2);
        this.f39173a = str;
        this.b = str2;
        this.c = z;
        this.d = llmVar;
        this.e = emmVar;
        this.f = tlmVar;
        this.g = llmVar2;
        this.h = dmmVar;
        this.i = tlmVar2;
        this.j = sdVar;
        this.k = eeVar;
        this.l = n0xVar;
        this.m = i;
        this.n = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whm)) {
            return false;
        }
        whm whmVar = (whm) obj;
        return Intrinsics.d(this.f39173a, whmVar.f39173a) && Intrinsics.d(this.b, whmVar.b) && this.c == whmVar.c && this.d.equals(whmVar.d) && this.e.equals(whmVar.e) && this.f.equals(whmVar.f) && this.g.equals(whmVar.g) && this.h.equals(whmVar.h) && this.i.equals(whmVar.i) && Intrinsics.d(this.j, whmVar.j) && this.k.equals(whmVar.k) && this.l.equals(whmVar.l) && this.m == whmVar.m && Intrinsics.d(this.n, whmVar.n);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.h.f6327a.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.f8053a.hashCode() + ((this.d.hashCode() + brm0.e(ua80.b(this.f39173a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        sd sdVar = this.j;
        return this.n.hashCode() + twn.a(this.m, f140.f(this.l, (this.k.hashCode() + ((iHashCode + (sdVar == null ? 0 : sdVar.hashCode())) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ImageHeader(title=", this.f39173a, ", subTitle=", this.b, ", enableDelete=");
        sbN.append(this.c);
        sbN.append(", leftHeaderStyle=");
        sbN.append(this.d);
        sbN.append(", rightHeaderStyle=");
        sbN.append(this.e);
        sbN.append(", middleHeaderStyle=");
        sbN.append(this.f);
        sbN.append(", collapsedLeftHeaderStyle=");
        sbN.append(this.g);
        sbN.append(", collapsedRightHeaderStyle=");
        sbN.append(this.h);
        sbN.append(", collapsedMiddleHeaderStyle=");
        sbN.append(this.i);
        sbN.append(", accountControlModel=");
        sbN.append(this.j);
        sbN.append(", accountControlStyle=");
        sbN.append(this.k);
        sbN.append(", background=");
        sbN.append(this.l);
        sbN.append(", selectedPosition=");
        sbN.append(this.m);
        sbN.append(", tabs=");
        sbN.append(this.n);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
