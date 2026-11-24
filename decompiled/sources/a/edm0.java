package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class edm0 implements hdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7625a;

    public /* synthetic */ edm0(long j) {
        this.f7625a = j;
    }

    @Override // a.hdm0
    public final long a() {
        return this.f7625a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edm0) {
            return this.f7625a == ((edm0) obj).f7625a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7625a);
    }

    public final String toString() {
        return axq.h(this.f7625a, "Empty(globalChampId=", Separators.RPAREN);
    }
}
