package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ae2 implements be2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f705a;

    public ae2(String str) {
        this.f705a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae2) && this.f705a.equals(((ae2) obj).f705a);
    }

    public final int hashCode() {
        return this.f705a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerErrorMessage(message=", this.f705a, Separators.RPAREN);
    }
}
