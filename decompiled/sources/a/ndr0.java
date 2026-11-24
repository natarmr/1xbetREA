package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ndr0 extends pdr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f23349a;

    public ndr0(Exception exc) {
        this.f23349a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndr0) && this.f23349a.equals(((ndr0) obj).f23349a);
    }

    public final int hashCode() {
        return this.f23349a.hashCode();
    }

    public final String toString() {
        return "Failure(throwable=" + this.f23349a + Separators.RPAREN;
    }
}
