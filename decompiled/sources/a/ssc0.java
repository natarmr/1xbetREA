package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ssc0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32719a;
    public final String b;

    public ssc0(long j, String str) {
        this.f32719a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssc0)) {
            return false;
        }
        ssc0 ssc0Var = (ssc0) obj;
        return this.f32719a == ssc0Var.f32719a && this.b.equals(ssc0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return h97.h(this.f32719a, super.getKey());
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f32719a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32719a, "PromoShopTitleUiModel(categoryId=", ", categoryName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
