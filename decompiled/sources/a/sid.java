package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32258a;

    public sid(long j) {
        this.f32258a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sid) && this.f32258a == ((sid) obj).f32258a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32258a);
    }

    public final String toString() {
        return axq.h(this.f32258a, "OnVideoClick(gameId=", Separators.RPAREN);
    }
}
