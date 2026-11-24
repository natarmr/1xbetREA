package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q7s0 implements s7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu1 f28266a;

    public q7s0(gu1 gu1Var) {
        gu1Var.getClass();
        this.f28266a = gu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7s0) && Intrinsics.d(this.f28266a, ((q7s0) obj).f28266a);
    }

    public final int hashCode() {
        return this.f28266a.hashCode();
    }

    public final String toString() {
        return "Content(tournamentModel=" + this.f28266a + Separators.RPAREN;
    }
}
