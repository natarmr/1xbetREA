package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ofl0 implements pfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l0 f25175a;
    public final float b;
    public final a4x c;

    public ofl0(j8l0 j8l0Var, float f, a4x a4xVar) {
        a4xVar.getClass();
        this.f25175a = j8l0Var;
        this.b = f;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofl0)) {
            return false;
        }
        ofl0 ofl0Var = (ofl0) obj;
        return this.f25175a == ofl0Var.f25175a && ycl.b(this.b, ofl0Var.b) && Intrinsics.d(this.c, ofl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + defpackage.c.a(this.f25175a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        StringBuilder sb = new StringBuilder("Shimmers(listStyle=");
        sb.append(this.f25175a);
        sb.append(", paddingTop=");
        sb.append(strC);
        sb.append(", items=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
