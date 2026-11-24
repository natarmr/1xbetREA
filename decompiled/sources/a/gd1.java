package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gd1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11085a;

    public gd1(long j) {
        this.f11085a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd1) && this.f11085a == ((gd1) obj).f11085a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11085a);
    }

    public final String toString() {
        return axq.h(this.f11085a, "OnOpenGame(gameId=", Separators.RPAREN);
    }
}
