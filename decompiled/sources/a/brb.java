package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class brb implements erb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3071a;

    public brb(String str) {
        this.f3071a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brb) && this.f3071a.equals(((brb) obj).f3071a);
    }

    public final int hashCode() {
        return this.f3071a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f3071a, Separators.RPAREN);
    }
}
