package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class acg extends bcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f625a;

    public acg(String str) {
        this.f625a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acg) && this.f625a.equals(((acg) obj).f625a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f625a;
    }

    public final int hashCode() {
        return this.f625a.hashCode();
    }

    public final String toString() {
        return kng0.l("Shimmer(key=", this.f625a, Separators.RPAREN);
    }
}
