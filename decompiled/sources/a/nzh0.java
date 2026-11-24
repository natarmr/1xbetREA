package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nzh0 extends ozh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2h f24373a;

    public nzh0(v2h v2hVar) {
        this.f24373a = v2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzh0) && this.f24373a.equals(((nzh0) obj).f24373a);
    }

    public final int hashCode() {
        return this.f24373a.hashCode();
    }

    public final String toString() {
        return "Loading(config=" + this.f24373a + Separators.RPAREN;
    }
}
