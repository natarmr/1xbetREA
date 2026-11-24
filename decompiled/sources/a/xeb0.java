package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xeb0 implements zeb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6y f40737a;
    public final String b;

    public xeb0(f6y f6yVar, String str) {
        f6yVar.getClass();
        str.getClass();
        this.f40737a = f6yVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeb0)) {
            return false;
        }
        xeb0 xeb0Var = (xeb0) obj;
        return Intrinsics.d(this.f40737a, xeb0Var.f40737a) && Intrinsics.d(this.b, xeb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40737a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(jackpotModel=" + this.f40737a + ", currency=" + this.b + Separators.RPAREN;
    }
}
