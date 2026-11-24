package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class f0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8712a;

    public f0e(String str) {
        this.f8712a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0e) && this.f8712a.equals(((f0e) obj).f8712a);
    }

    public final int hashCode() {
        return this.f8712a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowAuthenticatorBlockedErrorDialog(message=", this.f8712a, Separators.RPAREN);
    }
}
