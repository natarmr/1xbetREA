package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4i0 f35050a;
    public final t4i0 b;
    public final boolean c;

    public u4i0(t4i0 t4i0Var, t4i0 t4i0Var2, boolean z) {
        this.f35050a = t4i0Var;
        this.b = t4i0Var2;
        this.c = z;
    }

    public static u4i0 a(u4i0 u4i0Var, t4i0 t4i0Var, t4i0 t4i0Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            t4i0Var = u4i0Var.f35050a;
        }
        if ((i & 2) != 0) {
            t4i0Var2 = u4i0Var.b;
        }
        u4i0Var.getClass();
        return new u4i0(t4i0Var, t4i0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4i0)) {
            return false;
        }
        u4i0 u4i0Var = (u4i0) obj;
        return Intrinsics.d(this.f35050a, u4i0Var.f35050a) && Intrinsics.d(this.b, u4i0Var.b) && this.c == u4i0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f35050a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f35050a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
