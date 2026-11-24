package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f33442a;
    public final z70 b;
    public final String c;
    public final esr d;

    public t70(double d, z70 z70Var, String str, esr esrVar) {
        z70Var.getClass();
        str.getClass();
        esrVar.getClass();
        this.f33442a = d;
        this.b = z70Var;
        this.c = str;
        this.d = esrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        return Double.compare(this.f33442a, t70Var.f33442a) == 0 && this.b == t70Var.b && Intrinsics.d(this.c, t70Var.c) && this.d == t70Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (Double.hashCode(this.f33442a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "AfricanRouletteBet(betSum=" + this.f33442a + ", typeBet=" + this.b + ", currencySymbol=" + this.c + ", bonus=" + this.d + Separators.RPAREN;
    }
}
