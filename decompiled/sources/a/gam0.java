package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gam0 implements ham0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10975a;

    public final boolean equals(Object obj) {
        if (obj instanceof gam0) {
            return this.f10975a.equals(((gam0) obj).f10975a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10975a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f10975a, Separators.RPAREN);
    }
}
