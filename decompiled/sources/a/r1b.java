package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f29670a;
    public final jkm b;

    public r1b(ra10 ra10Var, jkm jkmVar) {
        this.f29670a = ra10Var;
        this.b = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1b)) {
            return false;
        }
        r1b r1bVar = (r1b) obj;
        return Intrinsics.d(this.f29670a, r1bVar.f29670a) && Intrinsics.d(this.b, r1bVar.b);
    }

    public final int hashCode() {
        ra10 ra10Var = this.f29670a;
        int iHashCode = (ra10Var == null ? 0 : ra10Var.hashCode()) * 31;
        jkm jkmVar = this.b;
        return iHashCode + (jkmVar != null ? jkmVar.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorState(lottieConfig=" + this.f29670a + ", dsLottieEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
