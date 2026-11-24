package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bqv0 implements dqv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f3052a;

    public bqv0(Exception exc) {
        this.f3052a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqv0) && this.f3052a.equals(((bqv0) obj).f3052a);
    }

    public final int hashCode() {
        return this.f3052a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f3052a + Separators.RPAREN;
    }
}
