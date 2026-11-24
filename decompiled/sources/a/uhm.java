package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uhm implements yhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35686a;
    public final boolean b;
    public final boolean c;
    public final llm d;
    public final dmm e;
    public final tlm f;
    public final ee g;
    public final chm h;
    public final chm i;
    public final sd j;
    public final a4x k;

    public uhm(String str, boolean z, boolean z2, llm llmVar, dmm dmmVar, tlm tlmVar, ee eeVar, chm chmVar, chm chmVar2, sd sdVar, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f35686a = str;
        this.b = z;
        this.c = z2;
        this.d = llmVar;
        this.e = dmmVar;
        this.f = tlmVar;
        this.g = eeVar;
        this.h = chmVar;
        this.i = chmVar2;
        this.j = sdVar;
        this.k = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhm)) {
            return false;
        }
        uhm uhmVar = (uhm) obj;
        return Intrinsics.d(this.f35686a, uhmVar.f35686a) && this.b == uhmVar.b && this.c == uhmVar.c && this.d.equals(uhmVar.d) && this.e.equals(uhmVar.e) && this.f.equals(uhmVar.f) && this.g.equals(uhmVar.g) && Intrinsics.d(this.h, uhmVar.h) && Intrinsics.d(this.i, uhmVar.i) && Intrinsics.d(this.j, uhmVar.j) && Intrinsics.d(this.k, uhmVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.f6327a.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(this.f35686a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31;
        chm chmVar = this.h;
        int iHashCode2 = (iHashCode + (chmVar == null ? 0 : chmVar.hashCode())) * 31;
        chm chmVar2 = this.i;
        int iHashCode3 = (iHashCode2 + (chmVar2 == null ? 0 : chmVar2.hashCode())) * 31;
        sd sdVar = this.j;
        return this.k.hashCode() + ((iHashCode3 + (sdVar != null ? sdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("CardsInHeader(title=", this.f35686a, ", enableDelete=", this.b, ", showShimmers=");
        sbU.append(this.c);
        sbU.append(", leftHeaderStyle=");
        sbU.append(this.d);
        sbU.append(", rightHeaderStyle=");
        sbU.append(this.e);
        sbU.append(", middleHeaderStyle=");
        sbU.append(this.f);
        sbU.append(", accountControlStyle=");
        sbU.append(this.g);
        sbU.append(", firstButton=");
        sbU.append(this.h);
        sbU.append(", secondButton=");
        sbU.append(this.i);
        sbU.append(", accountControlModel=");
        sbU.append(this.j);
        sbU.append(", eventCards=");
        return cs0.n(sbU, this.k, Separators.RPAREN);
    }
}
