package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xd5 implements be5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40679a;

    public final boolean equals(Object obj) {
        if (obj instanceof xd5) {
            return this.f40679a.equals(((xd5) obj).f40679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40679a.hashCode();
    }

    public final String toString() {
        return kng0.l("Small(urn=", this.f40679a, Separators.RPAREN);
    }
}
