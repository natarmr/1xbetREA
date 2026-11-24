package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33333a;
    public final zzp0 b;
    public final zzp0 c;
    public final zzp0 d;

    public t4q(boolean z, zzp0 zzp0Var, zzp0 zzp0Var2, zzp0 zzp0Var3) {
        zzp0Var.getClass();
        zzp0Var2.getClass();
        zzp0Var3.getClass();
        this.f33333a = z;
        this.b = zzp0Var;
        this.c = zzp0Var2;
        this.d = zzp0Var3;
    }

    public static t4q a(t4q t4qVar, zzp0 zzp0Var) {
        boolean z = t4qVar.f33333a;
        zzp0 zzp0Var2 = t4qVar.b;
        zzp0 zzp0Var3 = t4qVar.c;
        zzp0Var2.getClass();
        zzp0Var3.getClass();
        zzp0Var.getClass();
        return new t4q(z, zzp0Var2, zzp0Var3, zzp0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4q)) {
            return false;
        }
        t4q t4qVar = (t4q) obj;
        return this.f33333a == t4qVar.f33333a && Intrinsics.d(this.b, t4qVar.b) && Intrinsics.d(this.c, t4qVar.c) && Intrinsics.d(this.d, t4qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f33333a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FilterWinLossState(isEmpty=" + this.f33333a + ", initialFilterModel=" + this.b + ", defaultFilterModel=" + this.c + ", selectedFilterModel=" + this.d + Separators.RPAREN;
    }
}
