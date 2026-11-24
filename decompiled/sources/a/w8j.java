package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w8j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38725a;

    public final boolean equals(Object obj) {
        if (obj instanceof w8j) {
            return this.f38725a.equals(((w8j) obj).f38725a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38725a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerSumOfThrows(value=", this.f38725a, Separators.RPAREN);
    }
}
