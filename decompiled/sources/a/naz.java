package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/naz;", "La/um40;", "La/oaz;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class naz extends um40 {
    public final cfq b;
    public final cfq c;
    public final cfq d;

    public naz(cfq cfqVar, cfq cfqVar2, cfq cfqVar3) {
        this.b = cfqVar;
        this.c = cfqVar2;
        this.d = cfqVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naz)) {
            return false;
        }
        naz nazVar = (naz) obj;
        return Intrinsics.d(this.b, nazVar.b) && Intrinsics.d(this.c, nazVar.c) && Intrinsics.d(this.d, nazVar.d);
    }

    @Override // a.um40
    public final lm40 f() {
        oaz oazVar = new oaz();
        oazVar.o = this.b;
        oazVar.p = this.c;
        oazVar.q = this.d;
        return oazVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        oaz oazVar = (oaz) lm40Var;
        oazVar.o = this.b;
        oazVar.p = this.c;
        oazVar.q = this.d;
    }

    public final int hashCode() {
        cfq cfqVar = this.b;
        int iHashCode = (cfqVar == null ? 0 : cfqVar.hashCode()) * 31;
        cfq cfqVar2 = this.c;
        int iHashCode2 = (iHashCode + (cfqVar2 == null ? 0 : cfqVar2.hashCode())) * 31;
        cfq cfqVar3 = this.d;
        return iHashCode2 + (cfqVar3 != null ? cfqVar3.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.b + ", placementSpec=" + this.c + ", fadeOutSpec=" + this.d + Separators.RPAREN;
    }
}
