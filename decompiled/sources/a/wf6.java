package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wf6 {
    public static final vf6 Companion = new vf6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vm6 f39054a;

    public /* synthetic */ wf6(int i, vm6 vm6Var) {
        if ((i & 1) == 0) {
            this.f39054a = null;
        } else {
            this.f39054a = vm6Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf6) && Intrinsics.d(this.f39054a, ((wf6) obj).f39054a);
    }

    public final int hashCode() {
        vm6 vm6Var = this.f39054a;
        if (vm6Var == null) {
            return 0;
        }
        return vm6Var.hashCode();
    }

    public final String toString() {
        return "BetBuilderCricketScoreResponse(wicketScore=" + this.f39054a + Separators.RPAREN;
    }
}
