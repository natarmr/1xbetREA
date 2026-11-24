package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ga90 implements ka90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10955a;
    public final k790 b;
    public final lun c;
    public final boolean d;

    public ga90(boolean z, k790 k790Var) {
        this.f10955a = z;
        this.b = k790Var;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.c = lunVar;
        this.d = k790Var != null ? k790Var.f17810a : false;
    }

    @Override // a.ka90
    public final boolean a() {
        return this.f10955a;
    }

    @Override // a.ka90
    public final k790 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga90)) {
            return false;
        }
        ga90 ga90Var = (ga90) obj;
        return this.f10955a == ga90Var.f10955a && Intrinsics.d(this.b, ga90Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10955a) * 31;
        k790 k790Var = this.b;
        return iHashCode + (k790Var == null ? 0 : k790Var.hashCode());
    }

    public final String toString() {
        return "Error(reloadEnable=" + this.f10955a + ", paymentParams=" + this.b + Separators.RPAREN;
    }
}
