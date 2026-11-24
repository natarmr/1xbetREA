package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f21014a;

    public final boolean equals(Object obj) {
        if (obj instanceof m1l) {
            return this.f21014a.equals(((m1l) obj).f21014a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21014a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f21014a + Separators.RPAREN;
    }
}
