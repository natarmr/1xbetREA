package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class clb0 implements flb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5l0 f4550a;

    public final boolean equals(Object obj) {
        if (obj instanceof clb0) {
            return this.f4550a.equals(((clb0) obj).f4550a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4550a.f5512a.hashCode();
    }

    public final String toString() {
        return "SendPopularSportSideEffect(value=" + this.f4550a + Separators.RPAREN;
    }
}
