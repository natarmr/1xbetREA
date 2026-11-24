package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30813a;
    public final hjm b;
    public final fyl c;

    public ro0(String str, hjm hjmVar, fyl fylVar) {
        str.getClass();
        this.f30813a = str;
        this.b = hjmVar;
        this.c = fylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro0)) {
            return false;
        }
        ro0 ro0Var = (ro0) obj;
        return Intrinsics.d(this.f30813a, ro0Var.f30813a) && this.b.equals(ro0Var.b) && this.c.equals(ro0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hne.e(this.b, this.f30813a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AggregatorFilterCategoryUiModel(categoryId=" + this.f30813a + ", dsHeaderModel=" + this.b + ", dsChipUiModel=" + this.c + Separators.RPAREN;
    }
}
