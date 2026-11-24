package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class btr0 implements etr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3197a;

    public btr0(String str) {
        this.f3197a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btr0) && this.f3197a.equals(((btr0) obj).f3197a);
    }

    public final int hashCode() {
        return this.f3197a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsDialog(message=", this.f3197a, Separators.RPAREN);
    }
}
