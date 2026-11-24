package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx6 f27665a;
    public final knb0 b;
    public final iwo0 c;
    public final nnd0 d;
    public final String e;
    public final boolean f;

    public pvj0(bx6 bx6Var, knb0 knb0Var, iwo0 iwo0Var, nnd0 nnd0Var, String str, boolean z) {
        this.f27665a = bx6Var;
        this.b = knb0Var;
        this.c = iwo0Var;
        this.d = nnd0Var;
        this.e = str;
        this.f = z;
    }

    public static pvj0 a(pvj0 pvj0Var, bx6 bx6Var, knb0 knb0Var, iwo0 iwo0Var, nnd0 nnd0Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            bx6Var = pvj0Var.f27665a;
        }
        bx6 bx6Var2 = bx6Var;
        if ((i & 2) != 0) {
            knb0Var = pvj0Var.b;
        }
        knb0 knb0Var2 = knb0Var;
        if ((i & 4) != 0) {
            iwo0Var = pvj0Var.c;
        }
        iwo0 iwo0Var2 = iwo0Var;
        if ((i & 8) != 0) {
            nnd0Var = pvj0Var.d;
        }
        nnd0 nnd0Var2 = nnd0Var;
        if ((i & 16) != 0) {
            str = pvj0Var.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = pvj0Var.f;
        }
        pvj0Var.getClass();
        return new pvj0(bx6Var2, knb0Var2, iwo0Var2, nnd0Var2, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvj0)) {
            return false;
        }
        pvj0 pvj0Var = (pvj0) obj;
        return this.f27665a.equals(pvj0Var.f27665a) && this.b.equals(pvj0Var.b) && this.c.equals(pvj0Var.c) && this.d.equals(pvj0Var.d) && Intrinsics.d(this.e, pvj0Var.e) && this.f == pvj0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f27665a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetStateModel(betFieldState=");
        sb.append(this.f27665a);
        sb.append(", possibleWinStateModel=");
        sb.append(this.b);
        sb.append(", taxStateModel=");
        sb.append(this.c);
        sb.append(", quickBetStateModel=");
        sb.append(this.d);
        sb.append(", infoLine=");
        return defpackage.c.c(this.e, ", makeBetBtnEnabled=", Separators.RPAREN, sb, this.f);
    }
}
