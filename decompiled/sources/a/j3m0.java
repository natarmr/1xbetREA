package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j3m0 implements p6t0, uxx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b110 f15842a;
    public final List b;

    public j3m0(b110 b110Var, List list) {
        list.getClass();
        this.f15842a = b110Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3m0)) {
            return false;
        }
        j3m0 j3m0Var = (j3m0) obj;
        return this.f15842a.equals(j3m0Var.f15842a) && Intrinsics.d(this.b, j3m0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STAGE";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f15842a.hashCode() - 1839165214) * 31);
    }

    public final String toString() {
        return "StageUiModel(key=STAGE, map=" + this.f15842a + ", timers=" + this.b + Separators.RPAREN;
    }
}
