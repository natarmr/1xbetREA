package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yda0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42424a;

    public final boolean equals(Object obj) {
        if (obj instanceof yda0) {
            return this.f42424a.equals(((yda0) obj).f42424a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42424a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f42424a, Separators.RPAREN);
    }
}
