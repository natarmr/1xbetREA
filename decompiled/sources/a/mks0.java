package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mks0 implements oks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21958a;

    public final boolean equals(Object obj) {
        if (obj instanceof mks0) {
            return this.f21958a.equals(((mks0) obj).f21958a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21958a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f21958a, Separators.RPAREN);
    }
}
