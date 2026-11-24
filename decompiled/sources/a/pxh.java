package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pxh implements sxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f27753a;
    public final a4x b;
    public final long c;
    public final int d;

    public pxh(a4x a4xVar, a4x a4xVar2, long j, int i) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f27753a = a4xVar;
        this.b = a4xVar2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxh)) {
            return false;
        }
        pxh pxhVar = (pxh) obj;
        return Intrinsics.d(this.f27753a, pxhVar.f27753a) && Intrinsics.d(this.b, pxhVar.b) && this.c == pxhVar.c && this.d == pxhVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rw2.b(cs0.b(this.b, this.f27753a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("Content(chipsList=", this.f27753a, ", statisticTableUiModelList=", this.b, ", checkedChipsPosition=");
        ua80.v(sbQ, this.c, ", pageCount=", this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
