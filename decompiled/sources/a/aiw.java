package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aiw implements ciw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f946a;

    public aiw(lq5 lq5Var) {
        this.f946a = lq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aiw) && this.f946a.equals(((aiw) obj).f946a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "shimmer_banner_1";
    }

    public final int hashCode() {
        return this.f946a.hashCode() + 216165924;
    }

    public final String toString() {
        return "Shimmers(key=shimmer_banner_1, bannerCollectionStyle=" + this.f946a + Separators.RPAREN;
    }
}
