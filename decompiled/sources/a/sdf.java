package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class sdf {
    public static final qdf Companion = new qdf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zcv0 f32032a;

    public /* synthetic */ sdf(int i, zcv0 zcv0Var) {
        if ((i & 1) == 0) {
            this.f32032a = null;
        } else {
            this.f32032a = zcv0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdf) && Intrinsics.d(this.f32032a, ((sdf) obj).f32032a);
    }

    public final int hashCode() {
        zcv0 zcv0Var = this.f32032a;
        if (zcv0Var == null) {
            return 0;
        }
        return zcv0Var.hashCode();
    }

    public final String toString() {
        return "CricketScoreResponse(wicketScore=" + this.f32032a + Separators.RPAREN;
    }
}
