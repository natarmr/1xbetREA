package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c9j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3965a;

    public final boolean equals(Object obj) {
        if (obj instanceof c9j) {
            return this.f3965a.equals(((c9j) obj).f3965a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3965a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerSumOfThrows(value=", this.f3965a, Separators.RPAREN);
    }
}
