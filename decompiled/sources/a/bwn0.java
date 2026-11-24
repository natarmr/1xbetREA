package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bwn0 implements fwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fzc f3334a;

    public final boolean equals(Object obj) {
        if (obj instanceof bwn0) {
            return this.f3334a == ((bwn0) obj).f3334a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3334a.hashCode();
    }

    public final String toString() {
        return "CoefColor(coefColorType=" + this.f3334a + Separators.RPAREN;
    }
}
