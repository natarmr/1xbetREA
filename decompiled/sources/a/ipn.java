package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ipn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw20 f15171a;
    public final boolean b;
    public final int c;
    public final oon d;

    public ipn(aw20 aw20Var, boolean z, int i, oon oonVar) {
        this.f15171a = aw20Var;
        this.b = z;
        this.c = i;
        this.d = oonVar;
    }

    public static ipn a(ipn ipnVar, oon oonVar) {
        aw20 aw20Var = ipnVar.f15171a;
        boolean z = ipnVar.b;
        int i = ipnVar.c;
        ipnVar.getClass();
        return new ipn(aw20Var, z, i, oonVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipn)) {
            return false;
        }
        ipn ipnVar = (ipn) obj;
        return this.f15171a.equals(ipnVar.f15171a) && this.b == ipnVar.b && this.c == ipnVar.c && this.d.equals(ipnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, brm0.e(this.f15171a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "EditEventState(marketPropertiesModel=" + this.f15171a + ", supportRtl=" + this.b + ", lottieAnimationTypeId=" + this.c + ", editEventDataState=" + this.d + Separators.RPAREN;
    }
}
