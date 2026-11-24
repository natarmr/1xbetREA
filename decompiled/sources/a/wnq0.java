package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wnq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39460a;
    public final long b;
    public final boolean c;
    public final int d;
    public final Long e;

    public wnq0(boolean z, long j, boolean z2, int i, Long l) {
        this.f39460a = z;
        this.b = j;
        this.c = z2;
        this.d = i;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnq0)) {
            return false;
        }
        wnq0 wnq0Var = (wnq0) obj;
        return this.f39460a == wnq0Var.f39460a && this.b == wnq0Var.b && this.c == wnq0Var.c && this.d == wnq0Var.d && Intrinsics.d(this.e, wnq0Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, brm0.e(rw2.b(Boolean.hashCode(this.f39460a) * 31, 31, this.b), 31, this.c), 31);
        Long l = this.e;
        return iA + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimerUiModel(timerVisibility=");
        sb.append(this.f39460a);
        sb.append(", time=");
        sb.append(this.b);
        cs0.v(this.d, ", timeBackDirection=", ", timeMultiplier=", sb, this.c);
        sb.append(", stageTime=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
