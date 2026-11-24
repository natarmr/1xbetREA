package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kka0 implements mka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18427a;

    public kka0(long j) {
        this.f18427a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kka0) && this.f18427a == ((kka0) obj).f18427a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18427a);
    }

    public final String toString() {
        return axq.h(this.f18427a, "OnInningSelected(chipsIndex=", Separators.RPAREN);
    }
}
