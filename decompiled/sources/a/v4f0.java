package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f36776a;
    public final a4x b;
    public final aoo0 c;
    public final int d;
    public final List e;
    public final q7f0 f;
    public final mtl g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public v4f0(imm immVar, a4x a4xVar, aoo0 aoo0Var, int i, a4x a4xVar2, q7f0 q7f0Var, mtl mtlVar, boolean z, int i2, boolean z2) {
        immVar.getClass();
        a4xVar.getClass();
        aoo0Var.getClass();
        a4xVar2.getClass();
        mtlVar.getClass();
        this.f36776a = immVar;
        this.b = a4xVar;
        this.c = aoo0Var;
        this.d = i;
        this.e = a4xVar2;
        this.f = q7f0Var;
        this.g = mtlVar;
        this.h = z;
        this.i = i2;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4f0)) {
            return false;
        }
        v4f0 v4f0Var = (v4f0) obj;
        return Intrinsics.d(this.f36776a, v4f0Var.f36776a) && Intrinsics.d(this.b, v4f0Var.b) && this.c == v4f0Var.c && this.d == v4f0Var.d && Intrinsics.d(this.e, v4f0Var.e) && this.f == v4f0Var.f && Intrinsics.d(this.g, v4f0Var.g) && this.h == v4f0Var.h && this.i == v4f0Var.i && this.j == v4f0Var.j;
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.d, (this.c.hashCode() + cs0.b(this.b, this.f36776a.hashCode() * 31, 31)) * 31, 31), 31, this.e);
        q7f0 q7f0Var = this.f;
        return Boolean.hashCode(this.j) + twn.a(this.i, brm0.e(cs0.b(this.g.f22376a, (iA + (q7f0Var == null ? 0 : q7f0Var.hashCode())) * 31, 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationSimpleUiState(navigationBarUiModel=");
        sb.append(this.f36776a);
        sb.append(", tabs=");
        sb.append(this.b);
        sb.append(", tabsStyle=");
        sb.append(this.c);
        sb.append(", selectedTabPosition=");
        sb.append(this.d);
        sb.append(", fieldsList=");
        sb.append(this.e);
        sb.append(", registrationType=");
        sb.append(this.f);
        sb.append(", bottomBarModel=");
        sb.append(this.g);
        sb.append(", isFieldsLoading=");
        sb.append(this.h);
        sb.append(", firstValidationFailedIndex=");
        return ohs0.k(this.i, ", isLoading=", Separators.RPAREN, sb, this.j);
    }
}
