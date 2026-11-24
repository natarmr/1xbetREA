package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30798a;
    public final a4x b;

    public rno0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f30798a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rno0)) {
            return false;
        }
        rno0 rno0Var = (rno0) obj;
        return this.f30798a == rno0Var.f30798a && Intrinsics.d(this.b, rno0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f30798a) * 31);
    }

    public final String toString() {
        return "AccordeonCards(scrollToTop=" + this.f30798a + ", items=" + this.b + Separators.RPAREN;
    }
}
