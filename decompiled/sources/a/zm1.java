package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zm1 implements fn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44602a;

    public final boolean equals(Object obj) {
        if (obj instanceof zm1) {
            return this.f44602a.equals(((zm1) obj).f44602a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44602a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnChangeQuery(query=", this.f44602a, Separators.RPAREN);
    }
}
