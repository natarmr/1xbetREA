package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o implements r0o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24437a;

    public o0o(String str) {
        this.f24437a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0o) && this.f24437a.equals(((o0o) obj).f24437a);
    }

    public final int hashCode() {
        return this.f24437a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f24437a, Separators.RPAREN);
    }
}
