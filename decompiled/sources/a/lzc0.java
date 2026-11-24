package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lzc0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kzc0 f20898a;
    public final v12 b;
    public final int c;

    public lzc0(kzc0 kzc0Var, v12 v12Var) {
        this.f20898a = kzc0Var;
        this.b = v12Var;
        this.c = kzc0Var.f19148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzc0)) {
            return false;
        }
        lzc0 lzc0Var = (lzc0) obj;
        return this.f20898a.equals(lzc0Var.f20898a) && this.b == lzc0Var.b;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return Integer.valueOf(this.c);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20898a.hashCode() * 31);
    }

    public final String toString() {
        return "PromotionCardUiModel(card=" + this.f20898a + ", alignmentInSection=" + this.b + Separators.RPAREN;
    }
}
