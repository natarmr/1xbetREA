package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20736a;
    public final xuf b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;

    public lw(boolean z, xuf xufVar, boolean z2, boolean z3, String str, String str2, boolean z4) {
        xufVar.getClass();
        this.f20736a = z;
        this.b = xufVar;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = z4;
    }

    public static lw a(lw lwVar, boolean z, xuf xufVar, boolean z2, boolean z3, String str, String str2, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = lwVar.f20736a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            xufVar = lwVar.b;
        }
        xuf xufVar2 = xufVar;
        if ((i & 4) != 0) {
            z2 = lwVar.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = lwVar.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            str = lwVar.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = lwVar.f;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            z4 = lwVar.g;
        }
        lwVar.getClass();
        xufVar2.getClass();
        str3.getClass();
        return new lw(z5, xufVar2, z6, z7, str3, str4, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw)) {
            return false;
        }
        lw lwVar = (lw) obj;
        return this.f20736a == lwVar.f20736a && Intrinsics.d(this.b, lwVar.b) && this.c == lwVar.c && this.d == lwVar.d && this.e.equals(lwVar.e) && this.f.equals(lwVar.f) && this.g == lwVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(ua80.b(brm0.e(brm0.e((this.b.hashCode() + (Boolean.hashCode(this.f20736a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddWalletState(isLoading=");
        sb.append(this.f20736a);
        sb.append(", selectedCurrency=");
        sb.append(this.b);
        sb.append(", canAutoSetWalletName=");
        ua80.u(", hasError=", ", errorMessage=", sb, this.c, this.d);
        f140.v(sb, this.e, ", walletName=", this.f, ", showAddWalletButton=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
