package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class yk90 {
    public static final xk90 Companion = new xk90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42777a;
    public final pcm0 b;

    static {
        ncm0 ncm0Var = pcm0.Companion;
    }

    public /* synthetic */ yk90(int i, Integer num, pcm0 pcm0Var) {
        if ((i & 1) == 0) {
            this.f42777a = null;
        } else {
            this.f42777a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pcm0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk90)) {
            return false;
        }
        yk90 yk90Var = (yk90) obj;
        return Intrinsics.d(this.f42777a, yk90Var.f42777a) && Intrinsics.d(this.b, yk90Var.b);
    }

    public final int hashCode() {
        Integer num = this.f42777a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        pcm0 pcm0Var = this.b;
        return iHashCode + (pcm0Var != null ? pcm0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PersonalStatisticResponse(sportId=" + this.f42777a + ", statisticContent=" + this.b + Separators.RPAREN;
    }
}
