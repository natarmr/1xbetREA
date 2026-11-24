package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c210 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3603a;

    public final boolean equals(Object obj) {
        if (obj instanceof c210) {
            return this.f3603a == ((c210) obj).f3603a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3603a);
    }

    public final String toString() {
        return axq.h(this.f3603a, "TeamClick(value=", Separators.RPAREN);
    }
}
