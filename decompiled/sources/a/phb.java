package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class phb implements rhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26987a;

    public phb(String str) {
        this.f26987a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phb) && this.f26987a.equals(((phb) obj).f26987a);
    }

    public final int hashCode() {
        return this.f26987a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnOpenDeeplink(deeplink=", this.f26987a, Separators.RPAREN);
    }
}
