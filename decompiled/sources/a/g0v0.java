package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g0v0 implements i0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10479a;

    public g0v0(String str) {
        this.f10479a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0v0) && this.f10479a.equals(((g0v0) obj).f10479a);
    }

    public final int hashCode() {
        return this.f10479a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDeleteWalletInfoMessage(message=", this.f10479a, Separators.RPAREN);
    }
}
