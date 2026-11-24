package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9582a;

    public fid(boolean z) {
        this.f9582a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fid) && this.f9582a == ((fid) obj).f9582a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9582a);
    }

    public final String toString() {
        return defpackage.c.d("OnAddGameToCouponClick(resetToExpress=", Separators.RPAREN, this.f9582a);
    }
}
