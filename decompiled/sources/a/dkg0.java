package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6228a;
    public final a4x b;
    public final a4x c;

    public dkg0(String str, a4x a4xVar, a4x a4xVar2) {
        str.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f6228a = str;
        this.b = a4xVar;
        this.c = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkg0)) {
            return false;
        }
        dkg0 dkg0Var = (dkg0) obj;
        return Intrinsics.d(this.f6228a, dkg0Var.f6228a) && Intrinsics.d(this.b, dkg0Var.b) && Intrinsics.d(this.c, dkg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f6228a.hashCode() * 31, 31);
    }

    public final String toString() {
        return cs0.n(kng0.u("RpsResultTableUiModel(playerColumnTitle=", this.f6228a, ", players=", this.b, ", columns="), this.c, Separators.RPAREN);
    }
}
