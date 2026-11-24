package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class eg50 {
    public static final dg50 Companion = new dg50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui50 f7746a;

    public /* synthetic */ eg50(int i, ui50 ui50Var) {
        if ((i & 1) == 0) {
            this.f7746a = null;
        } else {
            this.f7746a = ui50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg50) && Intrinsics.d(this.f7746a, ((eg50) obj).f7746a);
    }

    public final int hashCode() {
        ui50 ui50Var = this.f7746a;
        if (ui50Var == null) {
            return 0;
        }
        return ui50Var.hashCode();
    }

    public final String toString() {
        return "NearestGameDetailsCricketScoreResponse(wicketScore=" + this.f7746a + Separators.RPAREN;
    }
}
