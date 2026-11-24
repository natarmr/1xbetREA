package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5688a;
    public final String b;
    public final c980 c;
    public final a980 d;
    public final b980 e;
    public final boolean f;
    public final boolean g;

    public d980(boolean z, String str, c980 c980Var, a980 a980Var, b980 b980Var, boolean z2, boolean z3) {
        this.f5688a = z;
        this.b = str;
        this.c = c980Var;
        this.d = a980Var;
        this.e = b980Var;
        this.f = z2;
        this.g = z3;
    }

    public static d980 a(d980 d980Var, boolean z, String str, c980 c980Var, a980 a980Var, b980 b980Var, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = d980Var.f5688a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            str = d980Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            c980Var = d980Var.c;
        }
        c980 c980Var2 = c980Var;
        if ((i & 8) != 0) {
            a980Var = d980Var.d;
        }
        a980 a980Var2 = a980Var;
        if ((i & 16) != 0) {
            b980Var = d980Var.e;
        }
        b980 b980Var2 = b980Var;
        if ((i & 32) != 0) {
            z2 = d980Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = d980Var.g;
        }
        d980Var.getClass();
        return new d980(z4, str2, c980Var2, a980Var2, b980Var2, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d980)) {
            return false;
        }
        d980 d980Var = (d980) obj;
        return this.f5688a == d980Var.f5688a && this.b.equals(d980Var.b) && this.c.equals(d980Var.c) && Intrinsics.d(this.d, d980Var.d) && this.e.equals(d980Var.e) && this.f == d980Var.f && this.g == d980Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ua80.b(Boolean.hashCode(this.f5688a) * 31, 31, this.b)) * 31;
        a980 a980Var = this.d;
        return Boolean.hashCode(this.g) + brm0.e((this.e.hashCode() + ((iHashCode + (a980Var == null ? 0 : a980Var.hashCode())) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("OrderCallStateModel(isMainLoading=", ", message=", this.b, this.f5688a, ", phoneFieldStateModel=");
        sbQ.append(this.c);
        sbQ.append(", countryStateModel=");
        sbQ.append(this.d);
        sbQ.append(", languageFieldStateModel=");
        sbQ.append(this.e);
        sbQ.append(", isError=");
        sbQ.append(this.f);
        sbQ.append(", isLoading=");
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
