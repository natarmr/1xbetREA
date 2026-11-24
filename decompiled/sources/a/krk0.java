package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class krk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18770a;

    public krk0(long j) {
        this.f18770a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krk0) && this.f18770a == ((krk0) obj).f18770a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18770a);
    }

    public final String toString() {
        return axq.h(this.f18770a, "OnWhoWinChipClick(id=", Separators.RPAREN);
    }
}
