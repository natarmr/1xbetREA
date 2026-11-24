package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hp40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13426a;
    public final String b;
    public final x6q0 c;
    public final jjm d;
    public final List e;
    public final mtl f;
    public final boolean g;
    public final mdm h;
    public final imm i;

    public hp40(boolean z, String str, x6q0 x6q0Var, hjm hjmVar, List list, mtl mtlVar, boolean z2, mdm mdmVar, imm immVar) {
        str.getClass();
        list.getClass();
        this.f13426a = z;
        this.b = str;
        this.c = x6q0Var;
        this.d = hjmVar;
        this.e = list;
        this.f = mtlVar;
        this.g = z2;
        this.h = mdmVar;
        this.i = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp40)) {
            return false;
        }
        hp40 hp40Var = (hp40) obj;
        return this.f13426a == hp40Var.f13426a && Intrinsics.d(this.b, hp40Var.b) && Intrinsics.d(this.c, hp40Var.c) && Intrinsics.d(this.d, hp40Var.d) && Intrinsics.d(this.e, hp40Var.e) && this.f.equals(hp40Var.f) && this.g == hp40Var.g && this.h.equals(hp40Var.h) && this.i.equals(hp40Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b(Boolean.hashCode(this.f13426a) * 31, 31, this.b);
        x6q0 x6q0Var = this.c;
        int iHashCode = (iB + (x6q0Var == null ? 0 : x6q0Var.hashCode())) * 31;
        jjm jjmVar = this.d;
        return this.i.hashCode() + f140.d(this.h, brm0.e(cs0.b(this.f.f22376a, dw9.a((iHashCode + (jjmVar != null ? jjmVar.hashCode() : 0)) * 31, 31, this.e), 31), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("MoneyLimitRsUiState(isLoading=", ", description=", this.b, this.f13426a, ", moneyLimitValueUiModel=");
        sbQ.append(this.c);
        sbQ.append(", fixedSumHeaderUiModel=");
        sbQ.append(this.d);
        sbQ.append(", moneyLimitValueUiModels=");
        sbQ.append(this.e);
        sbQ.append(", bottomUiModel=");
        sbQ.append(this.f);
        sbQ.append(", hasErrorWhileLoadingLimits=");
        sbQ.append(this.g);
        sbQ.append(", dsEmptyConfig=");
        sbQ.append(this.h);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
