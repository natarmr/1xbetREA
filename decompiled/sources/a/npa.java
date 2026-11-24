package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class npa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23902a;

    public npa(String str) {
        this.f23902a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npa) && this.f23902a.equals(((npa) obj).f23902a);
    }

    public final int hashCode() {
        return this.f23902a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneLogoUrlChanged(teamOneImageUrl=", this.f23902a, Separators.RPAREN);
    }
}
