package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lqv f31448a;

    public s1b0(lqv lqvVar) {
        this.f31448a = lqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1b0) && this.f31448a.equals(((s1b0) obj).f31448a);
    }

    public final int hashCode() {
        return this.f31448a.hashCode();
    }

    public final String toString() {
        return "OnAllClick(type=" + this.f31448a + Separators.RPAREN;
    }
}
