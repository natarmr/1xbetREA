package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ve0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37258a;

    public ve0(long j) {
        this.f37258a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve0) && this.f37258a == ((ve0) obj).f37258a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37258a);
    }

    public final String toString() {
        return axq.h(this.f37258a, "OnCategoryClick(categoryId=", Separators.RPAREN);
    }
}
