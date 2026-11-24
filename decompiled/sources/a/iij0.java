package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iij0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14830a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final int f;

    public iij0(String str, String str2, String str3, boolean z, List list, int i) {
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.f14830a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iij0)) {
            return false;
        }
        iij0 iij0Var = (iij0) obj;
        return this.f14830a.equals(iij0Var.f14830a) && Intrinsics.d(this.b, iij0Var.b) && Intrinsics.d(this.c, iij0Var.c) && this.d == iij0Var.d && Intrinsics.d(this.e, iij0Var.e) && this.f == iij0Var.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14830a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + dw9.a(brm0.e(ua80.b(ua80.b(this.f14830a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SettoeMezzoCombinationDetailsUiModel(key=", this.f14830a, ", title=", this.b, ", description=");
        brm0.C(this.c, ", vsIsVisible=", ", cards=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", background=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
