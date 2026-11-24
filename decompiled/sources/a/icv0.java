package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class icv0 implements mcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14554a;
    public final int b;
    public final Integer c;
    public final u6n d;
    public final chl0 e;
    public final v12 f;

    public icv0(String str, int i, Integer num, u6n u6nVar, chl0 chl0Var, v12 v12Var) {
        this.f14554a = str;
        this.b = i;
        this.c = num;
        this.d = u6nVar;
        this.e = chl0Var;
        this.f = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icv0)) {
            return false;
        }
        icv0 icv0Var = (icv0) obj;
        return this.f14554a.equals(icv0Var.f14554a) && this.b == icv0Var.b && Intrinsics.d(this.c, icv0Var.c) && this.d.equals(icv0Var.d) && this.e.equals(icv0Var.e) && this.f == icv0Var.f;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f14554a;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f14554a.hashCode() * 31, 31);
        Integer num = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "WhoWinCellMainLUiModel(key=", this.f14554a, ", id=", ", gameId=");
        sbP.append(this.c);
        sbP.append(", logo=");
        sbP.append(this.d);
        sbP.append(", sportMarketDsModel=");
        sbP.append(this.e);
        sbP.append(", alignmentInSection=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
