package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fkq0 implements hkq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9706a;

    public final boolean equals(Object obj) {
        if (obj instanceof fkq0) {
            return this.f9706a.equals(((fkq0) obj).f9706a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9706a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f9706a, Separators.RPAREN);
    }
}
