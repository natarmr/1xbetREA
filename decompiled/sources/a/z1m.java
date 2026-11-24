package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z1m implements a2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2m f43628a;

    public z1m(d2m d2mVar) {
        this.f43628a = d2mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1m) && this.f43628a.equals(((z1m) obj).f43628a);
    }

    public final int hashCode() {
        return this.f43628a.hashCode();
    }

    public final String toString() {
        return "VS(style=" + this.f43628a + Separators.RPAREN;
    }
}
