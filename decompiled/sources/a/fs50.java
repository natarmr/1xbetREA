package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fs50 implements os50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10048a;

    public fs50(int i) {
        this.f10048a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs50) && this.f10048a == ((fs50) obj).f10048a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10048a);
    }

    public final String toString() {
        return ua80.e(this.f10048a, "OnCategoryAllClick(categoryId=", Separators.RPAREN);
    }
}
