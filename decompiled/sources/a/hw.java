package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hw implements kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13747a;

    public hw(String str) {
        this.f13747a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw) && this.f13747a.equals(((hw) obj).f13747a);
    }

    public final int hashCode() {
        return this.f13747a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowAccountsNumberLimitMessage(message=", this.f13747a, Separators.RPAREN);
    }
}
