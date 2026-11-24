package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nma0 implements oma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23762a;

    public nma0(String str) {
        this.f23762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nma0) && this.f23762a.equals(((nma0) obj).f23762a);
    }

    public final int hashCode() {
        return this.f23762a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInfoDialog(teamId=", this.f23762a, Separators.RPAREN);
    }
}
