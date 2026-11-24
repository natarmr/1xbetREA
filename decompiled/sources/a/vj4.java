package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37509a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final s6q0 e;
    public final s6q0 f;
    public final inm g;
    public final imm h;
    public final String i;
    public final String j;
    public final wul k;
    public final wul l;
    public final wul m;
    public final wul n;

    public vj4(boolean z, boolean z2, boolean z3, List list, s6q0 s6q0Var, s6q0 s6q0Var2, inm inmVar, imm immVar, String str, String str2, wul wulVar, wul wulVar2, wul wulVar3, wul wulVar4) {
        list.getClass();
        s6q0Var.getClass();
        s6q0Var2.getClass();
        inmVar.getClass();
        immVar.getClass();
        str.getClass();
        str2.getClass();
        wulVar3.getClass();
        this.f37509a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = s6q0Var;
        this.f = s6q0Var2;
        this.g = inmVar;
        this.h = immVar;
        this.i = str;
        this.j = str2;
        this.k = wulVar;
        this.l = wulVar2;
        this.m = wulVar3;
        this.n = wulVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        return this.f37509a == vj4Var.f37509a && this.b == vj4Var.b && this.c == vj4Var.c && Intrinsics.d(this.d, vj4Var.d) && Intrinsics.d(this.e, vj4Var.e) && Intrinsics.d(this.f, vj4Var.f) && Intrinsics.d(this.g, vj4Var.g) && Intrinsics.d(this.h, vj4Var.h) && Intrinsics.d(this.i, vj4Var.i) && Intrinsics.d(this.j, vj4Var.j) && Intrinsics.d(this.k, vj4Var.k) && Intrinsics.d(this.l, vj4Var.l) && Intrinsics.d(this.m, vj4Var.m) && Intrinsics.d(this.n, vj4Var.n);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(h97.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f37509a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31), 31, this.i), 31, this.j);
        wul wulVar = this.k;
        int iHashCode = (iB + (wulVar == null ? 0 : wulVar.hashCode())) * 31;
        wul wulVar2 = this.l;
        int iA = i8i.a(this.m, (iHashCode + (wulVar2 == null ? 0 : wulVar2.hashCode())) * 31, 31);
        wul wulVar3 = this.n;
        return iA + (wulVar3 != null ? wulVar3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginVisualUiState(isLoading=", ", isLoginByPhoneFieldVisible=", ", isLoginByAllFieldVisible=", this.f37509a, this.b);
        vqd.y(sbQ, ", entryPointUiModelList=", this.d, ", loginFieldUiModel=", this.c);
        sbQ.append(this.e);
        sbQ.append(", passwordFieldUiModel=");
        sbQ.append(this.f);
        sbQ.append(", phoneFieldUiModel=");
        sbQ.append(this.g);
        sbQ.append(", navigationBarUiModel=");
        sbQ.append(this.h);
        sbQ.append(", backgroundImage=");
        f140.v(sbQ, this.i, ", socialLabel=", this.j, ", loginWayButtonUiModel=");
        sbQ.append(this.k);
        sbQ.append(", forgetPasswordButtonUiModel=");
        sbQ.append(this.l);
        sbQ.append(", loginButtonUiModel=");
        sbQ.append(this.m);
        sbQ.append(", registrationButtonUiModel=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
