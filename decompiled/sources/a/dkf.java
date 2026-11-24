package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dkf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f6227a;

    public final boolean equals(Object obj) {
        if (obj instanceof dkf) {
            return this.f6227a.equals(((dkf) obj).f6227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6227a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f6227a + Separators.RPAREN;
    }
}
