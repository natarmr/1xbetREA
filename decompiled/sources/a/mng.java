package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22086a;

    public final boolean equals(Object obj) {
        if (obj instanceof mng) {
            return this.f22086a.equals(((mng) obj).f22086a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22086a.hashCode();
    }

    public final String toString() {
        return kng0.l("CountTakenTitle(value=", this.f22086a, Separators.RPAREN);
    }
}
