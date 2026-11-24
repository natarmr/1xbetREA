package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ong0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25546a;
    public final int b;
    public final boolean c;
    public final mdm d;
    public final mdm e;
    public final mdm f;
    public final List g;
    public final xkg0 h;
    public final boolean i;

    public ong0(boolean z, int i, boolean z2, mdm mdmVar, mdm mdmVar2, mdm mdmVar3, List list, xkg0 xkg0Var, boolean z3) {
        list.getClass();
        this.f25546a = z;
        this.b = i;
        this.c = z2;
        this.d = mdmVar;
        this.e = mdmVar2;
        this.f = mdmVar3;
        this.g = list;
        this.h = xkg0Var;
        this.i = z3;
    }

    public static ong0 a(ong0 ong0Var, mdm mdmVar, List list, xkg0 xkg0Var, boolean z, int i) {
        boolean z2 = ong0Var.f25546a;
        int i2 = ong0Var.b;
        mdm mdmVar2 = ong0Var.e;
        mdm mdmVar3 = ong0Var.f;
        if ((i & 128) != 0) {
            xkg0Var = ong0Var.h;
        }
        xkg0 xkg0Var2 = xkg0Var;
        if ((i & 512) != 0) {
            z = ong0Var.i;
        }
        list.getClass();
        return new ong0(z2, i2, false, mdmVar, mdmVar2, mdmVar3, list, xkg0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ong0)) {
            return false;
        }
        ong0 ong0Var = (ong0) obj;
        return this.f25546a == ong0Var.f25546a && this.b == ong0Var.b && this.c == ong0Var.c && Intrinsics.d(this.d, ong0Var.d) && this.e.equals(ong0Var.e) && this.f.equals(ong0Var.f) && Intrinsics.d(this.g, ong0Var.g) && Intrinsics.d(this.h, ong0Var.h) && this.i == ong0Var.i;
    }

    public final int hashCode() {
        int iE = brm0.e(twn.a(this.b, Boolean.hashCode(this.f25546a) * 31, 31), 31, this.c);
        mdm mdmVar = this.d;
        int iA = dw9.a(f140.d(this.f, f140.d(this.e, (iE + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31, 31), 31), 31, this.g);
        xkg0 xkg0Var = this.h;
        return Boolean.hashCode(this.i) + brm0.e((iA + (xkg0Var == null ? 0 : xkg0Var.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "RulesState(showToolbar=", ", toolbarTitleRes=", ", loading=", this.f25546a);
        sbT.append(this.c);
        sbT.append(", lottieConfig=");
        sbT.append(this.d);
        sbT.append(", dataErrorLottieConfig=");
        sbT.append(this.e);
        sbT.append(", emptyDataLottieConfig=");
        sbT.append(this.f);
        sbT.append(", rulesList=");
        sbT.append(this.g);
        sbT.append(", ruleButtonConfig=");
        sbT.append(this.h);
        sbT.append(", rulesButtonNeeded=false, rulesLoaded=");
        return rw2.p(sbT, this.i, Separators.RPAREN);
    }
}
