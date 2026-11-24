package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7n f7292a;
    public final long b;
    public final boolean c;
    public final Long d;
    public final boolean e;
    public final int f;

    public /* synthetic */ e6m(r7n r7nVar, long j, boolean z, int i, int i2) {
        this(r7nVar, j, z, null, (i2 & 16) != 0, (i2 & 32) != 0 ? 1 : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6m)) {
            return false;
        }
        e6m e6mVar = (e6m) obj;
        return this.f7292a == e6mVar.f7292a && this.b == e6mVar.b && this.c == e6mVar.c && Intrinsics.d(this.d, e6mVar.d) && this.e == e6mVar.e && this.f == e6mVar.f;
    }

    public final int hashCode() {
        int iE = brm0.e(rw2.b(this.f7292a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return Integer.hashCode(this.f) + brm0.e((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberGameHeaderTimerUiModel(timerDirection=");
        sb.append(this.f7292a);
        sb.append(", milliSeconds=");
        sb.append(this.b);
        sb.append(", isTimerRun=");
        sb.append(this.c);
        sb.append(", targetTimeMillis=");
        sb.append(this.d);
        cs0.v(this.f, ", needDecrementingHours=", ", timeMultiplier=", sb, this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public e6m(r7n r7nVar, long j, boolean z, Long l, boolean z2, int i) {
        this.f7292a = r7nVar;
        this.b = j;
        this.c = z;
        this.d = l;
        this.e = z2;
        this.f = i;
    }
}
