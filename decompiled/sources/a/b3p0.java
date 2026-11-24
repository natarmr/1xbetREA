package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b3p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1919a;

    public b3p0(String str) {
        this.f1919a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3p0) && this.f1919a.equals(((b3p0) obj).f1919a) && ycl.b(156.0f, 156.0f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f1919a;
    }

    public final int hashCode() {
        return Float.hashCode(156.0f) + (this.f1919a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TeamBetStatisticsSkeletonUiItem(key=", this.f1919a, ", height=", ycl.c(156.0f), Separators.RPAREN);
    }
}
