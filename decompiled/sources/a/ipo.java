package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ipo implements kpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15173a;

    public final boolean equals(Object obj) {
        if (obj instanceof ipo) {
            return this.f15173a.equals(((ipo) obj).f15173a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15173a.hashCode();
    }

    public final String toString() {
        return kng0.l("SubtitleText(value=", this.f15173a, Separators.RPAREN);
    }
}
