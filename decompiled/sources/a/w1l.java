package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f38406a;

    public final boolean equals(Object obj) {
        if (obj instanceof w1l) {
            return this.f38406a.equals(((w1l) obj).f38406a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38406a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f38406a + Separators.RPAREN;
    }
}
