package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gnw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11605a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final List e;
    public final wmw f;
    public final nc5 g;

    public gnw(boolean z, boolean z2, boolean z3, String str, List list, wmw wmwVar, nc5 nc5Var) {
        list.getClass();
        this.f11605a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = list;
        this.f = wmwVar;
        this.g = nc5Var;
    }

    public static gnw a(gnw gnwVar, boolean z, boolean z2, boolean z3, ArrayList arrayList, wmw wmwVar, nc5 nc5Var, int i) {
        if ((i & 1) != 0) {
            z = gnwVar.f11605a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = gnwVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = gnwVar.c;
        }
        boolean z6 = z3;
        String str = gnwVar.d;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = gnwVar.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            wmwVar = gnwVar.f;
        }
        wmw wmwVar2 = wmwVar;
        if ((i & 64) != 0) {
            nc5Var = gnwVar.g;
        }
        gnwVar.getClass();
        list2.getClass();
        return new gnw(z4, z5, z6, str, list2, wmwVar2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnw)) {
            return false;
        }
        gnw gnwVar = (gnw) obj;
        return this.f11605a == gnwVar.f11605a && this.b == gnwVar.b && this.c == gnwVar.c && this.d.equals(gnwVar.d) && Intrinsics.d(this.e, gnwVar.e) && this.f.equals(gnwVar.f) && this.g.equals(gnwVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + dw9.a(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f11605a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HorseMenuState(isLoading=", ", isError=", ", isEmpty=", this.f11605a, this.b);
        f140.s(", title=", this.d, ", horseMenuItems=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(", horseMenuHeaderStateModel=");
        sbQ.append(this.f);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
