package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f41684a;

    public final boolean equals(Object obj) {
        if (obj instanceof xy00) {
            return this.f41684a.equals(((xy00) obj).f41684a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41684a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f41684a + Separators.RPAREN;
    }
}
