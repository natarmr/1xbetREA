package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ob4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24960a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final c6q0 e;
    public final c6q0 f;
    public final hnm g;
    public final String h;
    public final wul i;
    public final wul j;
    public final wul k;
    public final xa4 l;

    public ob4(boolean z, boolean z2, boolean z3, List list, c6q0 c6q0Var, c6q0 c6q0Var2, hnm hnmVar, String str, wul wulVar, wul wulVar2, wul wulVar3, xa4 xa4Var) {
        list.getClass();
        c6q0Var.getClass();
        c6q0Var2.getClass();
        hnmVar.getClass();
        str.getClass();
        wulVar3.getClass();
        this.f24960a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = c6q0Var;
        this.f = c6q0Var2;
        this.g = hnmVar;
        this.h = str;
        this.i = wulVar;
        this.j = wulVar2;
        this.k = wulVar3;
        this.l = xa4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob4)) {
            return false;
        }
        ob4 ob4Var = (ob4) obj;
        return this.f24960a == ob4Var.f24960a && this.b == ob4Var.b && this.c == ob4Var.c && Intrinsics.d(this.d, ob4Var.d) && Intrinsics.d(this.e, ob4Var.e) && Intrinsics.d(this.f, ob4Var.f) && Intrinsics.d(this.g, ob4Var.g) && Intrinsics.d(this.h, ob4Var.h) && Intrinsics.d(this.i, ob4Var.i) && Intrinsics.d(this.j, ob4Var.j) && Intrinsics.d(this.k, ob4Var.k) && Intrinsics.d(this.l, ob4Var.l);
    }

    public final int hashCode() {
        int iB = ua80.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f24960a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31, this.h);
        wul wulVar = this.i;
        int iHashCode = (iB + (wulVar == null ? 0 : wulVar.hashCode())) * 31;
        wul wulVar2 = this.j;
        int iA = i8i.a(this.k, (iHashCode + (wulVar2 == null ? 0 : wulVar2.hashCode())) * 31, 31);
        xa4 xa4Var = this.l;
        return iA + (xa4Var != null ? xa4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginDefaultUiState(isLoading=", ", isLoginByPhoneFieldVisible=", ", isLoginByAllFieldVisible=", this.f24960a, this.b);
        vqd.y(sbQ, ", entryPointUiModelList=", this.d, ", loginFieldUiModel=", this.c);
        sbQ.append(this.e);
        sbQ.append(", passwordFieldUiModel=");
        sbQ.append(this.f);
        sbQ.append(", phoneFieldUiModel=");
        sbQ.append(this.g);
        sbQ.append(", title=");
        sbQ.append(this.h);
        sbQ.append(", loginWayButtonUiModel=");
        sbQ.append(this.i);
        sbQ.append(", forgetPasswordButtonUiModel=");
        sbQ.append(this.j);
        sbQ.append(", loginButtonUiModel=");
        sbQ.append(this.k);
        sbQ.append(", registrationUiModel=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
