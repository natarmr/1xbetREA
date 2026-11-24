package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zrv implements asv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44877a;

    public final boolean equals(Object obj) {
        if (obj instanceof zrv) {
            return this.f44877a.equals(((zrv) obj).f44877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44877a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f44877a, Separators.RPAREN);
    }
}
