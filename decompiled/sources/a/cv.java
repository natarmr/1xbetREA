package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cv implements iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5009a;

    public cv(String str) {
        this.f5009a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv) && this.f5009a.equals(((cv) obj).f5009a);
    }

    public final int hashCode() {
        return this.f5009a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenAuthenticatorApp(authString=", this.f5009a, Separators.RPAREN);
    }
}
