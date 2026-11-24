package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gkg implements jkg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f11442a;

    public gkg(Exception exc) {
        this.f11442a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkg) && this.f11442a.equals(((gkg) obj).f11442a);
    }

    public final int hashCode() {
        return this.f11442a.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.f11442a + Separators.RPAREN;
    }
}
