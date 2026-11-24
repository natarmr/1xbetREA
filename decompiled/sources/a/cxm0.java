package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cxm0 implements exm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5128a;

    public cxm0(String str) {
        this.f5128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxm0) && this.f5128a.equals(((cxm0) obj).f5128a);
    }

    public final int hashCode() {
        return this.f5128a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(query=", this.f5128a, Separators.RPAREN);
    }
}
