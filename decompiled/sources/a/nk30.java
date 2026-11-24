package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nk30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23664a;
    public final String b;
    public final String c;
    public final List d;
    public final jkm e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public nk30(String str, String str2, String str3, List list, jkm jkmVar, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f23664a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = jkmVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static nk30 a(nk30 nk30Var, String str, String str2, String str3, List list, jkm jkmVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = nk30Var.f23664a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = nk30Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = nk30Var.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = nk30Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            jkmVar = nk30Var.e;
        }
        jkm jkmVar2 = jkmVar;
        if ((i & 32) != 0) {
            z = nk30Var.f;
        }
        boolean z4 = z;
        boolean z5 = (i & 64) != 0 ? nk30Var.g : z2;
        boolean z6 = (i & 128) != 0 ? nk30Var.h : z3;
        nk30Var.getClass();
        str4.getClass();
        str5.getClass();
        list2.getClass();
        jkmVar2.getClass();
        return new nk30(str4, str5, str6, list2, jkmVar2, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk30)) {
            return false;
        }
        nk30 nk30Var = (nk30) obj;
        return this.f23664a.equals(nk30Var.f23664a) && this.b.equals(nk30Var.b) && this.c.equals(nk30Var.c) && Intrinsics.d(this.d, nk30Var.d) && this.e.equals(nk30Var.e) && this.f == nk30Var.f && this.g == nk30Var.g && this.h == nk30Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e((this.e.hashCode() + dw9.a(ua80.b(ua80.b(this.f23664a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MedalStatisticStateModel(discipline=", this.f23664a, ", defaultDiscipline=", this.b, ", searchQuery=");
        cs0.y(this.c, ", medalsStatistic=", ", lottieConfig=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", hasError=");
        sbN.append(this.f);
        sbN.append(", hasInternetConnection=");
        return ohs0.p(", isLoading=", Separators.RPAREN, sbN, this.g, this.h);
    }
}
