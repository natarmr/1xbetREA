package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ap60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1236a;

    public ap60(int i) {
        this.f1236a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap60) && this.f1236a == ((ap60) obj).f1236a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1236a);
    }

    public final String toString() {
        return ua80.e(this.f1236a, "OnCategoryClicked(idCategory=", Separators.RPAREN);
    }
}
