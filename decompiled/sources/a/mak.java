package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mak implements nak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21461a;

    public mak(String str) {
        this.f21461a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mak) && this.f21461a.equals(((mak) obj).f21461a);
    }

    public final int hashCode() {
        return this.f21461a.hashCode();
    }

    public final String toString() {
        return kng0.l("UnknownServerError(errorMessage=", this.f21461a, Separators.RPAREN);
    }
}
