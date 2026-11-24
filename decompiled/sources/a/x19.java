package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w19 f40110a;
    public final u19 b;
    public final v19 c;
    public final boolean d;
    public final ql5 e;
    public final kg f;
    public final uzb0 g;
    public final int h;
    public final long i;

    public x19(w19 w19Var, u19 u19Var, v19 v19Var, boolean z, ql5 ql5Var, kg kgVar, uzb0 uzb0Var, int i, long j) {
        kgVar.getClass();
        uzb0Var.getClass();
        this.f40110a = w19Var;
        this.b = u19Var;
        this.c = v19Var;
        this.d = z;
        this.e = ql5Var;
        this.f = kgVar;
        this.g = uzb0Var;
        this.h = i;
        this.i = j;
    }

    public static x19 a(x19 x19Var, w19 w19Var, u19 u19Var, v19 v19Var, boolean z, ql5 ql5Var, uzb0 uzb0Var, int i) {
        if ((i & 1) != 0) {
            w19Var = x19Var.f40110a;
        }
        w19 w19Var2 = w19Var;
        if ((i & 2) != 0) {
            u19Var = x19Var.b;
        }
        u19 u19Var2 = u19Var;
        v19 v19Var2 = (i & 4) != 0 ? x19Var.c : v19Var;
        boolean z2 = (i & 8) != 0 ? x19Var.d : z;
        ql5 ql5Var2 = (i & 16) != 0 ? x19Var.e : ql5Var;
        kg kgVar = x19Var.f;
        uzb0 uzb0Var2 = (i & 64) != 0 ? x19Var.g : uzb0Var;
        int i2 = x19Var.h;
        long j = (i & 256) != 0 ? x19Var.i : 0L;
        x19Var.getClass();
        kgVar.getClass();
        uzb0Var2.getClass();
        return new x19(w19Var2, u19Var2, v19Var2, z2, ql5Var2, kgVar, uzb0Var2, i2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x19)) {
            return false;
        }
        x19 x19Var = (x19) obj;
        return this.f40110a.equals(x19Var.f40110a) && this.b.equals(x19Var.b) && this.c.equals(x19Var.c) && this.d == x19Var.d && Intrinsics.d(this.e, x19Var.e) && this.f == x19Var.f && this.g == x19Var.g && this.h == x19Var.h && this.i == x19Var.i;
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f40110a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ql5 ql5Var = this.e;
        return Long.hashCode(this.i) + twn.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((iE + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandsListState(navigationBarState=");
        sb.append(this.f40110a);
        sb.append(", bannersState=");
        sb.append(this.b);
        sb.append(", brandsState=");
        sb.append(this.c);
        sb.append(", isLoggedIn=");
        sb.append(this.d);
        sb.append(", balance=");
        sb.append(this.e);
        sb.append(", accountSelectionStyle=");
        sb.append(this.f);
        sb.append(", sortType=");
        sb.append(this.g);
        sb.append(", lottieTypeId=");
        sb.append(this.h);
        sb.append(", brandToOpenId=");
        return brm0.k(this.i, Separators.RPAREN, sb);
    }
}
