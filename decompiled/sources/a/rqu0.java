package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rqu0 implements xqu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30949a;

    public final boolean equals(Object obj) {
        if (obj instanceof rqu0) {
            return this.f30949a == ((rqu0) obj).f30949a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30949a);
    }

    public final String toString() {
        return ua80.e(this.f30949a, "CategoryClick(id=", Separators.RPAREN);
    }
}
