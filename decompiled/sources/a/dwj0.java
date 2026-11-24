package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dwj0 implements hwj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6802a;

    public dwj0(String str) {
        this.f6802a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwj0) && this.f6802a.equals(((dwj0) obj).f6802a);
    }

    public final int hashCode() {
        return this.f6802a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFunds(message=", this.f6802a, Separators.RPAREN);
    }
}
