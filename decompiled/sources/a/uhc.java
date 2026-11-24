package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uhc implements vhc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35670a;

    public uhc(String str) {
        this.f35670a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhc) && this.f35670a.equals(((uhc) obj).f35670a);
    }

    public final int hashCode() {
        return this.f35670a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f35670a, Separators.RPAREN);
    }
}
