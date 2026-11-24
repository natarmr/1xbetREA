package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ng4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23467a;
    public final boolean b;
    public final List c;
    public final s6q0 d;
    public final s6q0 e;
    public final inm f;
    public final df4 g;
    public final wul h;
    public final wul i;
    public final wul j;
    public final if4 k;
    public final ne4 l;
    public final long m;

    public ng4(boolean z, boolean z2, List list, s6q0 s6q0Var, s6q0 s6q0Var2, inm inmVar, df4 df4Var, wul wulVar, wul wulVar2, wul wulVar3, if4 if4Var, ne4 ne4Var, long j) {
        list.getClass();
        s6q0Var.getClass();
        s6q0Var2.getClass();
        inmVar.getClass();
        df4Var.getClass();
        wulVar3.getClass();
        ne4Var.getClass();
        this.f23467a = z;
        this.b = z2;
        this.c = list;
        this.d = s6q0Var;
        this.e = s6q0Var2;
        this.f = inmVar;
        this.g = df4Var;
        this.h = wulVar;
        this.i = wulVar2;
        this.j = wulVar3;
        this.k = if4Var;
        this.l = ne4Var;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng4)) {
            return false;
        }
        ng4 ng4Var = (ng4) obj;
        if (this.f23467a != ng4Var.f23467a || this.b != ng4Var.b || !Intrinsics.d(this.c, ng4Var.c) || !Intrinsics.d(this.d, ng4Var.d) || !Intrinsics.d(this.e, ng4Var.e) || !Intrinsics.d(this.f, ng4Var.f) || !Intrinsics.d(this.g, ng4Var.g) || !Intrinsics.d(this.h, ng4Var.h) || !Intrinsics.d(this.i, ng4Var.i) || !Intrinsics.d(this.j, ng4Var.j) || !Intrinsics.d(this.k, ng4Var.k) || !Intrinsics.d(this.l, ng4Var.l)) {
            return false;
        }
        long j = ng4Var.m;
        int i = y3d.h;
        return h2t0.a(this.m, j);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + dw9.a(brm0.e(Boolean.hashCode(this.f23467a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31;
        wul wulVar = this.h;
        int iHashCode2 = (iHashCode + (wulVar == null ? 0 : wulVar.hashCode())) * 31;
        wul wulVar2 = this.i;
        int iA = i8i.a(this.j, (iHashCode2 + (wulVar2 == null ? 0 : wulVar2.hashCode())) * 31, 31);
        if4 if4Var = this.k;
        int iHashCode3 = (this.l.hashCode() + ((iA + (if4Var != null ? if4Var.hashCode() : 0)) * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.m) + iHashCode3;
    }

    public final String toString() {
        String strI = y3d.i(this.m);
        StringBuilder sbQ = f140.q("AuthLoginSimpleUiState(isLoginByPhoneFieldVisible=", ", isLoginByAllFieldVisible=", ", entryPointUiModelList=", this.f23467a, this.b);
        sbQ.append(this.c);
        sbQ.append(", loginFieldUiModel=");
        sbQ.append(this.d);
        sbQ.append(", passwordFieldUiModel=");
        sbQ.append(this.e);
        sbQ.append(", phoneFieldUiModel=");
        sbQ.append(this.f);
        sbQ.append(", headerUiModel=");
        sbQ.append(this.g);
        sbQ.append(", loginWayButtonUiModel=");
        sbQ.append(this.h);
        sbQ.append(", forgetPasswordButtonUiModel=");
        sbQ.append(this.i);
        sbQ.append(", loginButtonUiModel=");
        sbQ.append(this.j);
        sbQ.append(", registrationUiModel=");
        sbQ.append(this.k);
        sbQ.append(", dialogVisualState=");
        sbQ.append(this.l);
        sbQ.append(", background=");
        return axq.n(sbQ, strI, Separators.RPAREN);
    }
}
