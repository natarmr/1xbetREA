package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a210 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102a;

    public final boolean equals(Object obj) {
        if (obj instanceof a210) {
            return this.f102a == ((a210) obj).f102a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f102a);
    }

    public final String toString() {
        return axq.h(this.f102a, "TabClick(value=", Separators.RPAREN);
    }
}
