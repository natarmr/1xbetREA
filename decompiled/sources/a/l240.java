package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2c0 f19290a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final ay10 g;
    public final ijl h;
    public final r44 i;
    public final String j;
    public final imm k;
    public final jjl l;
    public final zno0 m;

    public l240(o2c0 o2c0Var, String str, String str2, String str3, boolean z, String str4, ay10 ay10Var, ijl ijlVar, r44 r44Var, String str5, imm immVar, jjl jjlVar, zno0 zno0Var) {
        str5.getClass();
        this.f19290a = o2c0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = ay10Var;
        this.h = ijlVar;
        this.i = r44Var;
        this.j = str5;
        this.k = immVar;
        this.l = jjlVar;
        this.m = zno0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l240)) {
            return false;
        }
        l240 l240Var = (l240) obj;
        return Intrinsics.d(this.f19290a, l240Var.f19290a) && this.b.equals(l240Var.b) && this.c.equals(l240Var.c) && this.d.equals(l240Var.d) && this.e == l240Var.e && Intrinsics.d(this.f, l240Var.f) && this.g == l240Var.g && this.h == l240Var.h && Intrinsics.d(this.i, l240Var.i) && Intrinsics.d(this.j, l240Var.j) && this.k.equals(l240Var.k) && Intrinsics.d(this.l, l240Var.l) && this.m.equals(l240Var.m);
    }

    public final int hashCode() {
        o2c0 o2c0Var = this.f19290a;
        int iE = brm0.e(ua80.b(ua80.b(ua80.b((o2c0Var == null ? 0 : o2c0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        r44 r44Var = this.i;
        int iA = h97.a(this.k, ua80.b((iHashCode + (r44Var == null ? 0 : r44Var.hashCode())) * 31, 31, this.j), 31);
        jjl jjlVar = this.l;
        return this.m.hashCode() + ((iA + (jjlVar != null ? jjlVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuUiState(profileInfoModel=");
        sb.append(this.f19290a);
        sb.append(", balanceTitle=");
        sb.append(this.b);
        sb.append(", money=");
        f140.v(sb, this.c, ", currency=", this.d, ", isLoading=");
        f140.s(", sessionTime=", this.f, ", menuType=", sb, this.e);
        sb.append(this.g);
        sb.append(", accountSelectionStyle=");
        sb.append(this.h);
        sb.append(", authButtonsModel=");
        sb.append(this.i);
        sb.append(", topUpButtonText=");
        sb.append(this.j);
        sb.append(", toolbarUiModel=");
        sb.append(this.k);
        sb.append(", accountSelectionUiModel=");
        sb.append(this.l);
        sb.append(", tabsState=");
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
