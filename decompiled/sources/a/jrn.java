package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jrn implements mrn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17011a;

    public jrn(String str) {
        this.f17011a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrn) && this.f17011a.equals(((jrn) obj).f17011a);
    }

    public final int hashCode() {
        return this.f17011a.hashCode();
    }

    public final String toString() {
        return kng0.l("SetErrorText(message=", this.f17011a, Separators.RPAREN);
    }
}
