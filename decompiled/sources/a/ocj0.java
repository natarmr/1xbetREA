package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ocj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25030a;

    public ocj0(String str) {
        this.f25030a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocj0) && this.f25030a.equals(((ocj0) obj).f25030a);
    }

    public final int hashCode() {
        return this.f25030a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBarError(message=", this.f25030a, Separators.RPAREN);
    }
}
