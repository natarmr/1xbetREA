package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nwa0 implements owa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24226a;

    public nwa0(String str) {
        this.f24226a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwa0) && this.f24226a.equals(((nwa0) obj).f24226a);
    }

    public final int hashCode() {
        return this.f24226a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(text=", this.f24226a, Separators.RPAREN);
    }
}
