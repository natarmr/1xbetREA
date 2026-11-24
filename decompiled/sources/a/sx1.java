package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sx1 implements by1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32950a;

    public sx1(long j) {
        this.f32950a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx1) && this.f32950a == ((sx1) obj).f32950a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32950a);
    }

    public final String toString() {
        return axq.h(this.f32950a, "OnMoreInfoClick(tournamentId=", Separators.RPAREN);
    }
}
