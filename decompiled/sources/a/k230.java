package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17556a;

    public k230(long j) {
        this.f17556a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k230) && this.f17556a == ((k230) obj).f17556a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17556a);
    }

    public final String toString() {
        return axq.h(this.f17556a, "OnSubGameSelected(subGameId=", Separators.RPAREN);
    }
}
