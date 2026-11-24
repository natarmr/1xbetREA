package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gm implements hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11518a;

    public gm(String str) {
        this.f11518a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm) && this.f11518a.equals(((gm) obj).f11518a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f11518a;
    }

    public final int hashCode() {
        return this.f11518a.hashCode();
    }

    public final String toString() {
        return kng0.l("Shimmer(key=", this.f11518a, Separators.RPAREN);
    }
}
