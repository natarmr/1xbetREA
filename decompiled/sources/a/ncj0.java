package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ncj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23298a;

    public ncj0(String str) {
        this.f23298a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncj0) && this.f23298a.equals(((ncj0) obj).f23298a);
    }

    public final int hashCode() {
        return this.f23298a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerException(message=", this.f23298a, Separators.RPAREN);
    }
}
