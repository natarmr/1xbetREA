package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gj00 implements kj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11374a;
    public final boolean b;

    public gj00(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f11374a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj00)) {
            return false;
        }
        gj00 gj00Var = (gj00) obj;
        return ycl.b(12.0f, 12.0f) && Intrinsics.d(this.f11374a, gj00Var.f11374a) && this.b == gj00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + cs0.b(this.f11374a, Float.hashCode(12.0f) * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.u("Content(paddingTop=", ycl.c(12.0f), ", eventCardList=", this.f11374a, ", supportRtl="), this.b, Separators.RPAREN);
    }
}
