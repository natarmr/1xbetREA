package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mrp implements urp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22284a;

    public mrp(String str) {
        this.f22284a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrp) && this.f22284a.equals(((mrp) obj).f22284a);
    }

    public final int hashCode() {
        return this.f22284a.hashCode();
    }

    public final String toString() {
        return kng0.l("PasswordNotValid(message=", this.f22284a, Separators.RPAREN);
    }
}
