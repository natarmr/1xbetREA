package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yx70 implements zx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43407a;

    public final boolean equals(Object obj) {
        if (obj instanceof yx70) {
            return this.f43407a.equals(((yx70) obj).f43407a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43407a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f43407a, Separators.RPAREN);
    }
}
