package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljg f21826a;
    public final hj40 b;

    public mi40(ljg ljgVar, hj40 hj40Var) {
        ljgVar.getClass();
        hj40Var.getClass();
        this.f21826a = ljgVar;
        this.b = hj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi40)) {
            return false;
        }
        mi40 mi40Var = (mi40) obj;
        return Intrinsics.d(this.f21826a, mi40Var.f21826a) && Intrinsics.d(this.b, mi40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21826a.hashCode() * 31);
    }

    public final String toString() {
        return "MlbbGameStatisticModel(lastMatchesInfo=" + this.f21826a + ", playersComposition=" + this.b + Separators.RPAREN;
    }
}
