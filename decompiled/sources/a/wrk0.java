package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wrk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f39648a;
    public final o0 b;

    public wrk0(btk0 btk0Var, o0 o0Var) {
        this.f39648a = btk0Var;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrk0)) {
            return false;
        }
        wrk0 wrk0Var = (wrk0) obj;
        return this.f39648a.equals(wrk0Var.f39648a) && Intrinsics.d(this.b, wrk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f39648a.hashCode() * 31;
        o0 o0Var = this.b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }

    public final String toString() {
        return "AboutTournament(status=" + this.f39648a + ", content=" + this.b + Separators.RPAREN;
    }
}
