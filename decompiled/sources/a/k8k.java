package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k8k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f17876a;
    public final d8k b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public k8k(xrz xrzVar, d8k d8kVar, boolean z, String str, boolean z2) {
        xrzVar.getClass();
        this.f17876a = xrzVar;
        this.b = d8kVar;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public static k8k a(k8k k8kVar, xrz xrzVar, d8k d8kVar, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            xrzVar = k8kVar.f17876a;
        }
        xrz xrzVar2 = xrzVar;
        if ((i & 2) != 0) {
            d8kVar = k8kVar.b;
        }
        d8k d8kVar2 = d8kVar;
        if ((i & 4) != 0) {
            z = k8kVar.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = k8kVar.d;
        }
        String str2 = str;
        boolean z3 = (i & 16) != 0 ? k8kVar.e : true;
        k8kVar.getClass();
        xrzVar2.getClass();
        str2.getClass();
        return new k8k(xrzVar2, d8kVar2, z2, str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8k)) {
            return false;
        }
        k8k k8kVar = (k8k) obj;
        return Intrinsics.d(this.f17876a, k8kVar.f17876a) && this.b.equals(k8kVar.b) && this.c == k8kVar.c && this.d.equals(k8kVar.d) && this.e == k8kVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.e((this.b.hashCode() + (this.f17876a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositLimitIeState(limitType=");
        sb.append(this.f17876a);
        sb.append(", depositLimitIeModel=");
        sb.append(this.b);
        sb.append(", isLoading=");
        f140.s(", textFieldError=", this.d, ", hasErrorWhileLoadingLimits=", sb, this.c);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
