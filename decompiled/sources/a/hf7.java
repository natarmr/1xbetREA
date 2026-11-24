package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hf7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f12959a;
    public final af7 b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public hf7(xrz xrzVar, af7 af7Var, boolean z, String str, boolean z2) {
        xrzVar.getClass();
        this.f12959a = xrzVar;
        this.b = af7Var;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public static hf7 a(hf7 hf7Var, xrz xrzVar, af7 af7Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            xrzVar = hf7Var.f12959a;
        }
        xrz xrzVar2 = xrzVar;
        if ((i & 2) != 0) {
            af7Var = hf7Var.b;
        }
        af7 af7Var2 = af7Var;
        if ((i & 4) != 0) {
            z = hf7Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = hf7Var.d;
        }
        String str2 = str;
        boolean z3 = (i & 16) != 0 ? hf7Var.e : true;
        hf7Var.getClass();
        xrzVar2.getClass();
        str2.getClass();
        return new hf7(xrzVar2, af7Var2, z2, str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf7)) {
            return false;
        }
        hf7 hf7Var = (hf7) obj;
        return Intrinsics.d(this.f12959a, hf7Var.f12959a) && this.b.equals(hf7Var.b) && this.c == hf7Var.c && this.d.equals(hf7Var.d) && this.e == hf7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.e((this.b.hashCode() + (this.f12959a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetLimitIeState(betLimitType=");
        sb.append(this.f12959a);
        sb.append(", betLimitIeModel=");
        sb.append(this.b);
        sb.append(", isLoading=");
        f140.s(", textFieldError=", this.d, ", hasErrorWhileLoadingLimits=", sb, this.c);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
