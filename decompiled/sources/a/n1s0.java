package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n1s0 {
    public static final m1s0 Companion = new m1s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5s0 f22768a;

    static {
        y4s0 y4s0Var = d5s0.Companion;
    }

    public /* synthetic */ n1s0(int i, d5s0 d5s0Var) {
        if ((i & 1) == 0) {
            this.f22768a = null;
        } else {
            this.f22768a = d5s0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1s0) && Intrinsics.d(this.f22768a, ((n1s0) obj).f22768a);
    }

    public final int hashCode() {
        d5s0 d5s0Var = this.f22768a;
        if (d5s0Var == null) {
            return 0;
        }
        return d5s0Var.hashCode();
    }

    public final String toString() {
        return "TournamentFullInfoResponse(tournament=" + this.f22768a + Separators.RPAREN;
    }
}
