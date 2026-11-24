package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class grw implements hrw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbd f11801a = dbd.f5798a;

    @Override // a.hrw
    public final dbd a() {
        return this.f11801a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grw) && this.f11801a == ((grw) obj).f11801a;
    }

    public final int hashCode() {
        return this.f11801a.hashCode();
    }

    public final String toString() {
        return "Loading(compactIconState=" + this.f11801a + Separators.RPAREN;
    }
}
