package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final axs0 f10521a;
    public final axs0 b;
    public final a4x c;
    public final lpm d;
    public final boolean e;

    public g1n(axs0 axs0Var, axs0 axs0Var2, a4x a4xVar, lpm lpmVar, boolean z) {
        a4xVar.getClass();
        this.f10521a = axs0Var;
        this.b = axs0Var2;
        this.c = a4xVar;
        this.d = lpmVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1n)) {
            return false;
        }
        g1n g1nVar = (g1n) obj;
        return this.f10521a.equals(g1nVar.f10521a) && this.b.equals(g1nVar.b) && Intrinsics.d(this.c, g1nVar.c) && this.d.equals(g1nVar.d) && this.e == g1nVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f140.e(this.d, cs0.b(this.c, (this.b.hashCode() + (this.f10521a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(teamOneModel=");
        sb.append(this.f10521a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", info=");
        sb.append(this.c);
        sb.append(", scoreSection=");
        sb.append(this.d);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
