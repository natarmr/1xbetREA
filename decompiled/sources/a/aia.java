package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aia implements dia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mha f914a;

    public final boolean equals(Object obj) {
        if (obj instanceof aia) {
            return this.f914a.equals(((aia) obj).f914a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f914a.hashCode();
    }

    public final String toString() {
        return "SecondPeriod(value=" + this.f914a + Separators.RPAREN;
    }
}
