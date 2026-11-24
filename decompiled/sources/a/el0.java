package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class el0 implements pl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8b f7976a;

    public el0(j8b j8bVar) {
        this.f7976a = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el0) && this.f7976a.equals(((el0) obj).f7976a);
    }

    public final int hashCode() {
        return this.f7976a.hashCode();
    }

    public final String toString() {
        return "OnAllCategoryClick(category=" + this.f7976a + Separators.RPAREN;
    }
}
