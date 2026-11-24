package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class c100 implements d100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3550a;

    public final boolean equals(Object obj) {
        if (obj instanceof c100) {
            return this.f3550a.equals(((c100) obj).f3550a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3550a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f3550a, Separators.RPAREN);
    }
}
