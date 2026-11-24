package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p3q0 implements r3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f26311a;

    public p3q0(Exception exc) {
        this.f26311a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3q0) && this.f26311a.equals(((p3q0) obj).f26311a);
    }

    public final int hashCode() {
        return this.f26311a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f26311a + Separators.RPAREN;
    }
}
