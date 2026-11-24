package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class std0 {
    public static final rtd0 Companion = new rtd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32768a;
    public final ntd0 b;

    static {
        mtd0 mtd0Var = ntd0.Companion;
    }

    public /* synthetic */ std0(int i, Long l, ntd0 ntd0Var) {
        if ((i & 1) == 0) {
            this.f32768a = null;
        } else {
            this.f32768a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ntd0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof std0)) {
            return false;
        }
        std0 std0Var = (std0) obj;
        return Intrinsics.d(this.f32768a, std0Var.f32768a) && Intrinsics.d(this.b, std0Var.b);
    }

    public final int hashCode() {
        Long l = this.f32768a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        ntd0 ntd0Var = this.b;
        return iHashCode + (ntd0Var != null ? ntd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RacesStatisticResponse(sportId=" + this.f32768a + ", response=" + this.b + Separators.RPAREN;
    }
}
