package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xbj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40603a;

    public xbj0(String str) {
        this.f40603a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbj0) && this.f40603a.equals(((xbj0) obj).f40603a);
    }

    public final int hashCode() {
        return this.f40603a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenActualDomain(url=", this.f40603a, Separators.RPAREN);
    }
}
