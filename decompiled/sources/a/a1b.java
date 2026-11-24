package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hcs f64a;

    public final boolean equals(Object obj) {
        if (obj instanceof a1b) {
            return this.f64a == ((a1b) obj).f64a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f64a.hashCode();
    }

    public final String toString() {
        return "GameFlag(value=" + this.f64a + Separators.RPAREN;
    }
}
