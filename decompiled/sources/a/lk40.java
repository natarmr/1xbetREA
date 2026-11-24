package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lk40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljg f20181a;
    public final ypl0 b;

    public lk40(ljg ljgVar, ypl0 ypl0Var) {
        ljgVar.getClass();
        ypl0Var.getClass();
        this.f20181a = ljgVar;
        this.b = ypl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk40)) {
            return false;
        }
        lk40 lk40Var = (lk40) obj;
        return Intrinsics.d(this.f20181a, lk40Var.f20181a) && Intrinsics.d(this.b, lk40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20181a.hashCode() * 31);
    }

    public final String toString() {
        return "MlbbPostGameStatModel(lastMatchesInfoModel=" + this.f20181a + ", sportSimpleModel=" + this.b + Separators.RPAREN;
    }
}
