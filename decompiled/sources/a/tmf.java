package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tmf implements vmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34191a;

    public final boolean equals(Object obj) {
        if (obj instanceof tmf) {
            return this.f34191a.equals(((tmf) obj).f34191a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34191a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f34191a, Separators.RPAREN);
    }
}
