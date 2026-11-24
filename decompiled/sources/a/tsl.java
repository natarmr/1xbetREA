package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tsl implements vsl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssl f34466a;

    public tsl(ssl sslVar) {
        this.f34466a = sslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsl) && this.f34466a.equals(((tsl) obj).f34466a);
    }

    public final int hashCode() {
        return this.f34466a.hashCode();
    }

    public final String toString() {
        return "Available(style=" + this.f34466a + Separators.RPAREN;
    }
}
