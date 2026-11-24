package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sul f39796a;
    public final oe9 b;
    public final xe9 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public wul(sul sulVar, oe9 oe9Var, xe9 xe9Var, boolean z, boolean z2, boolean z3) {
        sulVar.getClass();
        oe9Var.getClass();
        xe9Var.getClass();
        this.f39796a = sulVar;
        this.b = oe9Var;
        this.c = xe9Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static wul a(int i, wul wulVar) {
        oe9 oe9Var = oe9.f25112a;
        sul sulVar = wulVar.f39796a;
        if ((i & 2) != 0) {
            oe9Var = wulVar.b;
        }
        oe9 oe9Var2 = oe9Var;
        xe9 xe9Var = wulVar.c;
        boolean z = (i & 8) != 0 ? wulVar.d : false;
        boolean z2 = wulVar.e;
        boolean z3 = wulVar.f;
        wulVar.getClass();
        sulVar.getClass();
        oe9Var2.getClass();
        xe9Var.getClass();
        return new wul(sulVar, oe9Var2, xe9Var, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wul)) {
            return false;
        }
        wul wulVar = (wul) obj;
        return Intrinsics.d(this.f39796a, wulVar.f39796a) && this.b == wulVar.b && Intrinsics.d(this.c, wulVar.c) && this.d == wulVar.d && this.e == wulVar.e && this.f == wulVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f39796a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsButtonUiModel(buttonColorType=");
        sb.append(this.f39796a);
        sb.append(", buttonSize=");
        sb.append(this.b);
        sb.append(", buttonStyle=");
        sb.append(this.c);
        sb.append(", enabled=");
        sb.append(this.d);
        sb.append(", loading=");
        return ohs0.p(", fixed=", Separators.RPAREN, sb, this.e, this.f);
    }
}
