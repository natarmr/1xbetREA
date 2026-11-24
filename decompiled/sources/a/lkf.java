package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lkf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20200a;

    public final boolean equals(Object obj) {
        if (obj instanceof lkf) {
            return this.f20200a == ((lkf) obj).f20200a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20200a);
    }

    public final String toString() {
        return axq.h(this.f20200a, "OnTabClick(value=", Separators.RPAREN);
    }
}
