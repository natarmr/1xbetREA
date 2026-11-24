package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class z0q0 implements Serializable {
    public static final z0q0 g = new z0q0("", "", false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43582a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public z0q0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f43582a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public static z0q0 a(z0q0 z0q0Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            str = z0q0Var.f43582a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = z0q0Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = z0q0Var.c;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = z0q0Var.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = z0q0Var.e;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = z0q0Var.f;
        }
        z0q0Var.getClass();
        str3.getClass();
        str4.getClass();
        return new z0q0(str3, str4, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0q0)) {
            return false;
        }
        z0q0 z0q0Var = (z0q0) obj;
        return this.f43582a.equals(z0q0Var.f43582a) && this.b.equals(z0q0Var.b) && this.c == z0q0Var.c && this.d == z0q0Var.d && this.e == z0q0Var.e && this.f == z0q0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(brm0.e(ua80.b(this.f43582a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TestConsultantModel(projectId=", this.f43582a, ", projectUrl=", this.b, ", customConsultant=");
        ua80.u(", testConsultant=", ", stageTestConsultant=", sbN, this.c, this.d);
        return ohs0.p(", stageConsultant=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
