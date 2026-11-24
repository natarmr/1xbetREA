package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fok implements gok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9884a;

    public fok(String str) {
        this.f9884a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fok) && this.f9884a.equals(((fok) obj).f9884a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f9884a;
    }

    public final int hashCode() {
        return this.f9884a.hashCode();
    }

    public final String toString() {
        return kng0.l("Shimmer(key=", this.f9884a, Separators.RPAREN);
    }
}
