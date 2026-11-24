package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w5x implements x5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnq0 f38602a;

    public final boolean equals(Object obj) {
        if (obj instanceof w5x) {
            return this.f38602a.equals(((w5x) obj).f38602a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38602a.hashCode();
    }

    public final String toString() {
        return "Timer(value=" + this.f38602a + Separators.RPAREN;
    }
}
