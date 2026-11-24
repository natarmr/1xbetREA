package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t5s0 implements y5s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33384a;

    public t5s0(long j) {
        this.f33384a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5s0) && this.f33384a == ((t5s0) obj).f33384a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33384a);
    }

    public final String toString() {
        return axq.h(this.f33384a, "UpdateTournamentStageId(id=", Separators.RPAREN);
    }
}
