package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ujd0 implements xjd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35773a;

    public ujd0(String str) {
        this.f35773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujd0) && this.f35773a.equals(((ujd0) obj).f35773a);
    }

    public final int hashCode() {
        return this.f35773a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f35773a, Separators.RPAREN);
    }
}
