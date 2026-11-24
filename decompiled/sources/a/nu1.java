package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nu1 implements ou1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f24126a;
    public final ju1 b;

    public nu1(mdm mdmVar, ju1 ju1Var) {
        this.f24126a = mdmVar;
        this.b = ju1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1Var = (nu1) obj;
        return this.f24126a.equals(nu1Var.f24126a) && Intrinsics.d(this.b, nu1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f24126a.hashCode() * 31;
        ju1 ju1Var = this.b;
        return iHashCode + (ju1Var == null ? 0 : ju1Var.hashCode());
    }

    public final String toString() {
        return "NotAvailable(config=" + this.f24126a + ", progress=" + this.b + Separators.RPAREN;
    }
}
