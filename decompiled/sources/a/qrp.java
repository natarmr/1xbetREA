package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qrp implements urp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29221a;

    public qrp(String str) {
        this.f29221a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrp) && this.f29221a.equals(((qrp) obj).f29221a);
    }

    public final int hashCode() {
        return this.f29221a.hashCode();
    }

    public final String toString() {
        return kng0.l("WrongData(message=", this.f29221a, Separators.RPAREN);
    }
}
