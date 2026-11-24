package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ev implements iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8445a;

    public ev(String str) {
        this.f8445a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev) && this.f8445a.equals(((ev) obj).f8445a);
    }

    public final int hashCode() {
        return this.f8445a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f8445a, Separators.RPAREN);
    }
}
