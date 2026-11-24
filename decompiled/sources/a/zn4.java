package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44656a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final jkm e;
    public final boolean f;
    public final bo4 g;
    public final List h;

    public zn4(boolean z, String str, boolean z2, boolean z3, jkm jkmVar, boolean z4, bo4 bo4Var, List list) {
        str.getClass();
        list.getClass();
        this.f44656a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = jkmVar;
        this.f = z4;
        this.g = bo4Var;
        this.h = list;
    }

    public static zn4 a(zn4 zn4Var, boolean z, boolean z2, boolean z3, boolean z4, bo4 bo4Var, List list, int i) {
        if ((i & 1) != 0) {
            z = zn4Var.f44656a;
        }
        boolean z5 = z;
        String str = zn4Var.b;
        if ((i & 4) != 0) {
            z2 = zn4Var.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = zn4Var.d;
        }
        boolean z7 = z3;
        jkm jkmVar = zn4Var.e;
        if ((i & 32) != 0) {
            z4 = zn4Var.f;
        }
        boolean z8 = z4;
        bo4 bo4Var2 = (i & 64) != 0 ? zn4Var.g : bo4Var;
        List list2 = (i & 128) != 0 ? zn4Var.h : list;
        zn4Var.getClass();
        str.getClass();
        list2.getClass();
        return new zn4(z5, str, z6, z7, jkmVar, z8, bo4Var2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn4)) {
            return false;
        }
        zn4 zn4Var = (zn4) obj;
        return this.f44656a == zn4Var.f44656a && Intrinsics.d(this.b, zn4Var.b) && this.c == zn4Var.c && this.d == zn4Var.d && this.e.equals(zn4Var.e) && this.f == zn4Var.f && Intrinsics.d(this.g, zn4Var.g) && Intrinsics.d(this.h, zn4Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e((this.e.hashCode() + brm0.e(brm0.e(ua80.b(Boolean.hashCode(this.f44656a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        bo4 bo4Var = this.g;
        return this.h.hashCode() + ((iE + (bo4Var == null ? 0 : bo4Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("AuthSessionHistoryState(showError=", ", headerTitle=", this.b, this.f44656a, ", showShimmers=");
        ua80.u(", showReload=", ", lottieErrorConfig=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", showCloseAllSessionsDialog=");
        sbQ.append(this.f);
        sbQ.append(", chasedCloseSessionItem=");
        sbQ.append(this.g);
        sbQ.append(", sessionsItems=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
