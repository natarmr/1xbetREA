package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tkr implements ukr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34110a;

    public tkr(String str) {
        this.f34110a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkr) && this.f34110a.equals(((tkr) obj).f34110a);
    }

    public final int hashCode() {
        return this.f34110a.hashCode();
    }

    public final String toString() {
        return kng0.l("UnknownError(errorMessage=", this.f34110a, Separators.RPAREN);
    }
}
