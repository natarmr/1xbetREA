package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class df8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5986a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final mdm f;
    public final mdm g;

    public df8(boolean z, boolean z2, boolean z3, boolean z4, List list, mdm mdmVar, mdm mdmVar2) {
        this.f5986a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = mdmVar;
        this.g = mdmVar2;
    }

    public static df8 a(df8 df8Var, boolean z, boolean z2, boolean z3, List list, mdm mdmVar, mdm mdmVar2, int i) {
        if ((i & 1) != 0) {
            z = df8Var.f5986a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = df8Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = df8Var.c;
        }
        boolean z6 = z3;
        boolean z7 = (i & 8) != 0 ? df8Var.d : true;
        if ((i & 16) != 0) {
            list = df8Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            mdmVar = df8Var.f;
        }
        mdm mdmVar3 = mdmVar;
        if ((i & 64) != 0) {
            mdmVar2 = df8Var.g;
        }
        df8Var.getClass();
        list2.getClass();
        return new df8(z4, z5, z6, z7, list2, mdmVar3, mdmVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df8)) {
            return false;
        }
        df8 df8Var = (df8) obj;
        return this.f5986a == df8Var.f5986a && this.b == df8Var.b && this.c == df8Var.c && this.d == df8Var.d && this.e.equals(df8Var.e) && Intrinsics.d(this.f, df8Var.f) && Intrinsics.d(this.g, df8Var.g);
    }

    public final int hashCode() {
        int iA = dw9.a(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f5986a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        mdm mdmVar = this.f;
        int iHashCode = (iA + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31;
        mdm mdmVar2 = this.g;
        return iHashCode + (mdmVar2 != null ? mdmVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BonusGamesStateModel(isLoadingContent=", ", isConnected=", ", contentLoaded=", this.f5986a, this.b);
        ua80.u(", underMaintenanceEnable=", ", bonusGameCards=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", lottieConfig=");
        sbQ.append(this.f);
        sbQ.append(", umLottieConfig=");
        return cs0.m(sbQ, this.g, Separators.RPAREN);
    }
}
