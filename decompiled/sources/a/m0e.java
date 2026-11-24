package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class m0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20950a;

    public m0e(String str) {
        this.f20950a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0e) && this.f20950a.equals(((m0e) obj).f20950a);
    }

    public final int hashCode() {
        return this.f20950a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNoAuthenticatorErrorDialog(message=", this.f20950a, Separators.RPAREN);
    }
}
