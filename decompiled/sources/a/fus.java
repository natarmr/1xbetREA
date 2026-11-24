package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10180a;
    public final boolean b;
    public final long c;
    public final long d;

    public fus(long j, long j2, boolean z, boolean z2) {
        this.f10180a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fus)) {
            return false;
        }
        fus fusVar = (fus) obj;
        return this.f10180a == fusVar.f10180a && this.b == fusVar.b && this.c == fusVar.c && this.d == fusVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(brm0.e(Boolean.hashCode(this.f10180a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameTimeUiModel(timerEnabled=", ", countDownTimer=", ", timeSec=", this.f10180a, this.b);
        sbQ.append(this.c);
        return rw2.n(sbQ, this.d, ", requestedMsAt=", Separators.RPAREN);
    }
}
