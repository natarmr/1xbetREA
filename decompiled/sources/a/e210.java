package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e210 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7063a;

    public final boolean equals(Object obj) {
        if (obj instanceof e210) {
            return this.f7063a == ((e210) obj).f7063a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7063a);
    }

    public final String toString() {
        return axq.h(this.f7063a, "TournamentTableTabClick(value=", Separators.RPAREN);
    }
}
