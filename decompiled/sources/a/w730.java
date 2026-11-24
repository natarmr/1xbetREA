package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w730 implements a830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f38652a;
    public final boolean b;
    public final a4x c;
    public final boolean d;

    public w730(udl0 udl0Var, boolean z, a4x a4xVar, boolean z2) {
        a4xVar.getClass();
        this.f38652a = udl0Var;
        this.b = z;
        this.c = a4xVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w730)) {
            return false;
        }
        w730 w730Var = (w730) obj;
        return this.f38652a == w730Var.f38652a && this.b == w730Var.b && Intrinsics.d(this.c, w730Var.c) && this.d == w730Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, brm0.e(this.f38652a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsLoaded(sportGameType=");
        sb.append(this.f38652a);
        sb.append(", isClassicRefactorEnabled=");
        sb.append(this.b);
        sb.append(", items=");
        return rz4.m(sb, this.c, ", rtlSupport=", this.d, Separators.RPAREN);
    }
}
