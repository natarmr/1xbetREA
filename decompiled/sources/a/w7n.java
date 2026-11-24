package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8n f38682a;
    public final long b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final Long f;

    public /* synthetic */ w7n(b8n b8nVar, long j, boolean z, int i, boolean z2, Long l, int i2) {
        this(b8nVar, j, z, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? null : l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7n)) {
            return false;
        }
        w7n w7nVar = (w7n) obj;
        return Intrinsics.d(this.f38682a, w7nVar.f38682a) && this.b == w7nVar.b && this.c == w7nVar.c && this.d == w7nVar.d && this.e == w7nVar.e && Intrinsics.d(this.f, w7nVar.f);
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(this.d, brm0.e(rw2.b(this.f38682a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        Long l = this.f;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsTimerModel(style=");
        sb.append(this.f38682a);
        sb.append(", milliSeconds=");
        sb.append(this.b);
        cs0.v(this.d, ", isTimerRun=", ", timeMultiplier=", sb, this.c);
        sb.append(", needDecrementingHours=");
        sb.append(this.e);
        sb.append(", targetTimeMillis=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public w7n(b8n b8nVar, long j, boolean z, int i, boolean z2, Long l) {
        this.f38682a = b8nVar;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = l;
    }
}
