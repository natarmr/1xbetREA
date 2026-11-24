package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zn50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44658a;

    public zn50(int i) {
        this.f44658a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn50) && this.f44658a == ((zn50) obj).f44658a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44658a);
    }

    public final String toString() {
        return ua80.e(this.f44658a, "OnCategoryAllClick(categoryId=", Separators.RPAREN);
    }
}
