package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class z470 extends a570 {
    public static final y470 Companion = new y470();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43755a;

    public z470(int i, long j) {
        if (1 == (i & 1)) {
            this.f43755a = j;
        } else {
            m2x.I(i, 1, x470.f40251a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z470) && this.f43755a == ((z470) obj).f43755a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43755a);
    }

    public final String toString() {
        return axq.h(this.f43755a, "OneXGamesTypeWeb(gameTypeId=", Separators.RPAREN);
    }

    public z470(long j) {
        this.f43755a = j;
    }
}
