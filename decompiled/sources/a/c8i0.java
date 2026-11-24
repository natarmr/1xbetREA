package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3916a;
    public final boolean b;
    public final String c;
    public final String d;
    public final hjm e;
    public final i4 f;
    public final imm g;
    public final mdm h;
    public final mtl i;

    public c8i0(boolean z, boolean z2, String str, String str2, hjm hjmVar, i4 i4Var, imm immVar, mdm mdmVar, mtl mtlVar) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f3916a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = hjmVar;
        this.f = i4Var;
        this.g = immVar;
        this.h = mdmVar;
        this.i = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8i0)) {
            return false;
        }
        c8i0 c8i0Var = (c8i0) obj;
        return this.f3916a == c8i0Var.f3916a && this.b == c8i0Var.b && Intrinsics.d(this.c, c8i0Var.c) && Intrinsics.d(this.d, c8i0Var.d) && this.e.equals(c8i0Var.e) && Intrinsics.d(this.f, c8i0Var.f) && this.g.equals(c8i0Var.g) && this.h.equals(c8i0Var.h) && Intrinsics.d(this.i, c8i0Var.i);
    }

    public final int hashCode() {
        int iD = f140.d(this.h, h97.a(this.g, f140.c(this.f, hne.e(this.e, ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f3916a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31);
        mtl mtlVar = this.i;
        return iD + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SelfExclusionDisclaimerRsUiState(isLoading=", ", isEmpty=", ", attentionText=", this.f3916a, this.b);
        f140.v(sbQ, this.c, ", disclaimerText=", this.d, ", personalDataTitle=");
        sbQ.append(this.e);
        sbQ.append(", personalData=");
        sbQ.append(this.f);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.g);
        sbQ.append(", dsEmptyConfig=");
        sbQ.append(this.h);
        sbQ.append(", bottomUiModel=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
