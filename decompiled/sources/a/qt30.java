package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qt30 implements st30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29281a;

    public final boolean equals(Object obj) {
        if (obj instanceof qt30) {
            return this.f29281a == ((qt30) obj).f29281a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29281a);
    }

    public final String toString() {
        return axq.h(this.f29281a, "OnLineupChipSelect(chip=", Separators.RPAREN);
    }
}
