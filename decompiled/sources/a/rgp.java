package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30449a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final long e;

    public rgp(long j, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f30449a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = j;
    }

    public static rgp a(rgp rgpVar, boolean z, boolean z2, boolean z3) {
        List list = rgpVar.d;
        long j = rgpVar.e;
        list.getClass();
        return new rgp(j, list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgp)) {
            return false;
        }
        rgp rgpVar = (rgp) obj;
        return this.f30449a == rgpVar.f30449a && this.b == rgpVar.b && this.c == rgpVar.c && Intrinsics.d(this.d, rgpVar.d) && this.e == rgpVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f30449a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FeatureMatchTeamState(isLoading=", ", isError=", ", isEmpty=", this.f30449a, this.b);
        vqd.y(sbQ, ", matchesResultList=", this.d, ", sportId=", this.c);
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
