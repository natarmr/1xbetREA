package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class c5s0 {
    public static final x4s0 Companion = new x4s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1s0 f3788a;

    public /* synthetic */ c5s0(int i, u1s0 u1s0Var) {
        if ((i & 1) == 0) {
            this.f3788a = null;
        } else {
            this.f3788a = u1s0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5s0) && Intrinsics.d(this.f3788a, ((c5s0) obj).f3788a);
    }

    public final int hashCode() {
        u1s0 u1s0Var = this.f3788a;
        if (u1s0Var == null) {
            return 0;
        }
        return u1s0Var.hashCode();
    }

    public final String toString() {
        return "TournamentResponse(tournamentInfo=" + this.f3788a + Separators.RPAREN;
    }
}
