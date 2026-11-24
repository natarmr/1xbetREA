package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class op50 implements rp50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f25625a;
    public final a4x b;

    public op50(a4x a4xVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f25625a = a4xVar;
        this.b = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op50)) {
            return false;
        }
        op50 op50Var = (op50) obj;
        return Intrinsics.d(this.f25625a, op50Var.f25625a) && Intrinsics.d(this.b, op50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25625a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(topBanners=" + this.f25625a + ", categories=" + this.b + Separators.RPAREN;
    }
}
