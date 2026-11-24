package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bw5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw5 f3310a;
    public final xdr b;
    public final xdr c;
    public final xdr d;
    public final ugd e;

    public /* synthetic */ bw5(cw5 cw5Var, xdr xdrVar, ugd ugdVar, ugd ugdVar2, int i) {
        this(cw5Var, (xdr) null, (i & 4) != 0 ? null : xdrVar, (i & 8) != 0 ? null : ugdVar, ugdVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw5)) {
            return false;
        }
        bw5 bw5Var = (bw5) obj;
        return Intrinsics.d(this.f3310a, bw5Var.f3310a) && Intrinsics.d(this.b, bw5Var.b) && Intrinsics.d(this.c, bw5Var.c) && Intrinsics.d(this.d, bw5Var.d) && Intrinsics.d(this.e, bw5Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f3310a.hashCode() * 31;
        xdr xdrVar = this.b;
        int iHashCode2 = (iHashCode + (xdrVar == null ? 0 : xdrVar.hashCode())) * 31;
        xdr xdrVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (xdrVar2 == null ? 0 : xdrVar2.hashCode())) * 31;
        xdr xdrVar3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (xdrVar3 != null ? xdrVar3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BottomSheetScreenContent(screenParameters=" + this.f3310a + ", additionalTopContent=" + this.b + ", topContent=" + this.c + ", bottomContent=" + this.d + ", content=" + this.e + Separators.RPAREN;
    }

    public bw5(cw5 cw5Var, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, ugd ugdVar) {
        cw5Var.getClass();
        this.f3310a = cw5Var;
        this.b = xdrVar;
        this.c = xdrVar2;
        this.d = xdrVar3;
        this.e = ugdVar;
    }
}
