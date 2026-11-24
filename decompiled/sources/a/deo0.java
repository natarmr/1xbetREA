package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class deo0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5959a;
    public final String b;
    public final u6n c;
    public final String d;
    public final String e;
    public final t6n f;
    public final boolean g;
    public final long h;
    public final Map i;

    public deo0(String str, String str2, u6n u6nVar, String str3, String str4, t6n t6nVar, boolean z, long j, Map map) {
        str2.getClass();
        this.f5959a = str;
        this.b = str2;
        this.c = u6nVar;
        this.d = str3;
        this.e = str4;
        this.f = t6nVar;
        this.g = z;
        this.h = j;
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deo0)) {
            return false;
        }
        deo0 deo0Var = (deo0) obj;
        if (!this.f5959a.equals(deo0Var.f5959a) || !Intrinsics.d(this.b, deo0Var.b) || !this.c.equals(deo0Var.c) || !this.d.equals(deo0Var.d) || !this.e.equals(deo0Var.e) || !this.f.equals(deo0Var.f) || this.g != deo0Var.g) {
            return false;
        }
        long j = deo0Var.h;
        int i = y3d.h;
        return h2t0.a(this.h, j) && this.i.equals(deo0Var.i);
    }

    public final int hashCode() {
        int iE = brm0.e((this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ua80.b(this.f5959a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + rw2.b(iE, 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.h);
        StringBuilder sbN = b1j.n("TabTopPlayerUiModel(id=", this.f5959a, ", number=", this.b, ", logo=");
        sbN.append(this.c);
        sbN.append(", name=");
        sbN.append(this.d);
        sbN.append(", country=");
        sbN.append(this.e);
        sbN.append(", countryLogo=");
        sbN.append(this.f);
        sbN.append(", isSelected=");
        f140.s(", background=", strI, ", statisticByColumn=", sbN, this.g);
        sbN.append(this.i);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
