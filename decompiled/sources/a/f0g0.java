package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f0g0 extends fww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f8716a;

    public f0g0(Exception exc) {
        this.f8716a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0g0) && this.f8716a.equals(((f0g0) obj).f8716a);
    }

    public final int hashCode() {
        return this.f8716a.hashCode();
    }

    public final String toString() {
        return "Failure(errorValue=" + this.f8716a + Separators.RPAREN;
    }
}
