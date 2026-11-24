package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9707a;
    public final String b;
    public final a4x c;
    public final String d;
    public final String e;
    public final imm f;
    public final mtl g;

    public fkr(boolean z, String str, i4 i4Var, String str2, String str3, imm immVar, mtl mtlVar) {
        str.getClass();
        i4Var.getClass();
        str2.getClass();
        str3.getClass();
        this.f9707a = z;
        this.b = str;
        this.c = i4Var;
        this.d = str2;
        this.e = str3;
        this.f = immVar;
        this.g = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkr)) {
            return false;
        }
        fkr fkrVar = (fkr) obj;
        return this.f9707a == fkrVar.f9707a && Intrinsics.d(this.b, fkrVar.b) && Intrinsics.d(this.c, fkrVar.c) && Intrinsics.d(this.d, fkrVar.d) && Intrinsics.d(this.e, fkrVar.e) && this.f.equals(fkrVar.f) && this.g.equals(fkrVar.g);
    }

    public final int hashCode() {
        return this.g.f22376a.hashCode() + h97.a(this.f, ua80.b(ua80.b(cs0.b(this.c, ua80.b(Boolean.hashCode(this.f9707a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("GamblingExamIeUiState(isLoading=", ", description=", this.b, this.f9707a, ", questions=");
        sbQ.append(this.c);
        sbQ.append(", yesLabel=");
        sbQ.append(this.d);
        sbQ.append(", noLabel=");
        sbQ.append(this.e);
        sbQ.append(", dsNavigationBarUiModel=");
        sbQ.append(this.f);
        sbQ.append(", bottomUiModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
