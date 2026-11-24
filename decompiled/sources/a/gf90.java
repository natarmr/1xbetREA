package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gf90 {
    public static final ff90 Companion = new ff90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11198a;
    public final wf90 b;

    public /* synthetic */ gf90(int i, Integer num, wf90 wf90Var) {
        if ((i & 1) == 0) {
            this.f11198a = null;
        } else {
            this.f11198a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = wf90Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf90)) {
            return false;
        }
        gf90 gf90Var = (gf90) obj;
        return Intrinsics.d(this.f11198a, gf90Var.f11198a) && Intrinsics.d(this.b, gf90Var.b);
    }

    public final int hashCode() {
        Integer num = this.f11198a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        wf90 wf90Var = this.b;
        return iHashCode + (wf90Var != null ? wf90Var.hashCode() : 0);
    }

    public final String toString() {
        return "PeriodScoreZipResponse(periodKey=" + this.f11198a + ", periodValue=" + this.b + Separators.RPAREN;
    }
}
