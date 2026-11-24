package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bwv0 implements dwv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcz f3347a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bwv0(mcz mczVar, boolean z, boolean z2, boolean z3) {
        mczVar.getClass();
        this.f3347a = mczVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // a.dwv0
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwv0)) {
            return false;
        }
        bwv0 bwv0Var = (bwv0) obj;
        return Intrinsics.d(this.f3347a, bwv0Var.f3347a) && this.b == bwv0Var.b && this.c == bwv0Var.c && this.d == bwv0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f3347a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LazyList(layoutInfo=");
        sb.append(this.f3347a);
        sb.append(", isScrollInProgress=");
        sb.append(this.b);
        sb.append(", canScrollForward=");
        return ohs0.p(", canScrollBackward=", Separators.RPAREN, sb, this.c, this.d);
    }
}
