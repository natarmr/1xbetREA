package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wj7 implements xj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik7 f39247a;
    public final j3w b;
    public final f3w c;
    public final f3w d;
    public final kb90 e;
    public final String f;
    public final pro g;

    public wj7(ik7 ik7Var, j3w j3wVar, f3w f3wVar, f3w f3wVar2, kb90 kb90Var, String str, pro proVar) {
        str.getClass();
        this.f39247a = ik7Var;
        this.b = j3wVar;
        this.c = f3wVar;
        this.d = f3wVar2;
        this.e = kb90Var;
        this.f = str;
        this.g = proVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj7)) {
            return false;
        }
        wj7 wj7Var = (wj7) obj;
        return this.f39247a.equals(wj7Var.f39247a) && this.b.equals(wj7Var.b) && this.c.equals(wj7Var.c) && this.d.equals(wj7Var.d) && this.e.equals(wj7Var.e) && Intrinsics.d(this.f, wj7Var.f) && this.g.equals(wj7Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f39247a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "Success(betSaleInfoUiModel=" + this.f39247a + ", historyItemExpressCoefficientUiModel=" + this.b + ", betItemAmountTextUiModel=" + this.c + ", currentBetItemAmountTextUiModel=" + this.d + ", payoutSummaryUiModel=" + this.e + ", sellTitleButton=" + this.f + ", expressInfoUiState=" + this.g + Separators.RPAREN;
    }
}
