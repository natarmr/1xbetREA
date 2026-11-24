package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f43700a;
    public final a4x b;
    public final udl0 c;
    public final boolean d;
    public final pw20 e;
    public final mtl f;
    public final boolean g;

    public z330(imm immVar, a4x a4xVar, udl0 udl0Var, boolean z, pw20 pw20Var, mtl mtlVar, boolean z2) {
        immVar.getClass();
        a4xVar.getClass();
        mtlVar.getClass();
        this.f43700a = immVar;
        this.b = a4xVar;
        this.c = udl0Var;
        this.d = z;
        this.e = pw20Var;
        this.f = mtlVar;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z330)) {
            return false;
        }
        z330 z330Var = (z330) obj;
        return Intrinsics.d(this.f43700a, z330Var.f43700a) && Intrinsics.d(this.b, z330Var.b) && this.c == z330Var.c && this.d == z330Var.d && Intrinsics.d(this.e, z330Var.e) && Intrinsics.d(this.f, z330Var.f) && this.g == z330Var.g;
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + cs0.b(this.b, this.f43700a.hashCode() * 31, 31)) * 31, 31, this.d);
        pw20 pw20Var = this.e;
        return Boolean.hashCode(this.g) + cs0.b(this.f.f22376a, (iE + (pw20Var == null ? 0 : pw20Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsDisplaySettingsUiState(navigationBarUiModel=");
        sb.append(this.f43700a);
        sb.append(", marketUiModels=");
        sb.append(this.b);
        sb.append(", sportGameType=");
        sb.append(this.c);
        sb.append(", isClassicRefactorEnabled=");
        sb.append(this.d);
        sb.append(", marketsSettings=");
        sb.append(this.e);
        sb.append(", bottomBarModel=");
        sb.append(this.f);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
