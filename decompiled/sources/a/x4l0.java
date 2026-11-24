package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x4l0 implements b5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40271a;

    public x4l0(long j) {
        this.f40271a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4l0) && this.f40271a == ((x4l0) obj).f40271a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40271a);
    }

    public final String toString() {
        return axq.h(this.f40271a, "OnFavoriteButtonClick(champId=", Separators.RPAREN);
    }
}
