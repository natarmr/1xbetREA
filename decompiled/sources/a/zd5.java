package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zd5 implements be5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44196a;

    public final boolean equals(Object obj) {
        if (obj instanceof zd5) {
            return this.f44196a.equals(((zd5) obj).f44196a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44196a.hashCode();
    }

    public final String toString() {
        return kng0.l("Medium(urn=", this.f44196a, Separators.RPAREN);
    }
}
