package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lap0 implements map0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19716a;

    public lap0(long j) {
        this.f19716a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lap0) && this.f19716a == ((lap0) obj).f19716a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19716a);
    }

    public final String toString() {
        return axq.h(this.f19716a, "OnResultCardClick(gameId=", Separators.RPAREN);
    }
}
