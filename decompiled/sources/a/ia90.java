package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ia90 implements ka90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14427a;
    public final k790 b;
    public final lun c;
    public final boolean d;

    public ia90(boolean z, k790 k790Var) {
        this.f14427a = z;
        this.b = k790Var;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.c = lunVar;
        this.d = k790Var != null ? k790Var.f17810a : false;
    }

    @Override // a.ka90
    public final boolean a() {
        return this.f14427a;
    }

    @Override // a.ka90
    public final k790 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia90)) {
            return false;
        }
        ia90 ia90Var = (ia90) obj;
        return this.f14427a == ia90Var.f14427a && Intrinsics.d(this.b, ia90Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f14427a) * 31;
        k790 k790Var = this.b;
        return iHashCode + (k790Var == null ? 0 : k790Var.hashCode());
    }

    public final String toString() {
        return "Loading(reloadEnable=" + this.f14427a + ", paymentParams=" + this.b + Separators.RPAREN;
    }
}
