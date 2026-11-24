package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g97 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10899a;

    public /* synthetic */ g97(long j) {
        this.f10899a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g97) {
            return this.f10899a == ((g97) obj).f10899a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10899a);
    }

    public final String toString() {
        return axq.h(this.f10899a, "BetId(value=", Separators.RPAREN);
    }
}
