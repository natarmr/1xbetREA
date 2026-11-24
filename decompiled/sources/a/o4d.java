package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o4d extends o0d0 {
    @Override // a.o0d0
    public final l7m0 a(oms0 oms0Var, String str, int i, fet fetVar, int i2) {
        Object objJ;
        fetVar.e0(-2133734837);
        z30 z30Var = new z30((Object) this, i, (byte) 5);
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        pz40 pz40Var = oms0Var.d;
        p4 p4Var = oms0Var.f25519a;
        boolean zBooleanValue = ((Boolean) ((hgk0) pz40Var).getValue()).booleanValue();
        fetVar.e0(1880460593);
        ArrayList arrayList = this.f24419a;
        long j = zBooleanValue ? ((y3d) ((dmy) CollectionsKt.d0(((s0d0) ((boq0) CollectionsKt.d0(arrayList)).e).b)).b).f41946a : ((y3d) ((dmy) CollectionsKt.U(((s0d0) ((boq0) CollectionsKt.U(arrayList)).e).b)).b).f41946a;
        fetVar.r(false);
        y4d y4dVarF = y3d.f(j);
        boolean zG = fetVar.g(y4dVarF);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = kng0.d(qja.j, new s43(y4dVarF, (byte) 2), fetVar);
        }
        lxs0 lxs0Var = (lxs0) objP;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        if (oms0Var.h()) {
            objJ = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
            objJ = fetVar.P();
            if (z || objJ == cl5Var) {
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    Object objY0 = p4Var.y0();
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    fetVar.o0(objY0);
                    objJ = objY0;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            fetVar.r(false);
        }
        boolean zBooleanValue2 = ((Boolean) objJ).booleanValue();
        fetVar.e0(1880460593);
        y3d y3dVarF = dw9.f(fetVar, false, zBooleanValue2 ? ((y3d) ((dmy) CollectionsKt.d0(((s0d0) ((boq0) CollectionsKt.d0(arrayList)).e).b)).b).f41946a : ((y3d) ((dmy) CollectionsKt.U(((s0d0) ((boq0) CollectionsKt.U(arrayList)).e).b)).b).f41946a);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z2 = (i6 > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
        Object objP2 = fetVar.P();
        if (z2 || objP2 == cl5Var) {
            objP2 = jgk0.b(new elb(oms0Var, (byte) 4));
            fetVar.o0(objP2);
        }
        boolean zBooleanValue3 = ((Boolean) ((l7m0) objP2).getValue()).booleanValue();
        fetVar.e0(1880460593);
        y3d y3dVarF2 = dw9.f(fetVar, false, zBooleanValue3 ? ((y3d) ((dmy) CollectionsKt.d0(((s0d0) ((boq0) CollectionsKt.d0(arrayList)).e).b)).b).f41946a : ((y3d) ((dmy) CollectionsKt.U(((s0d0) ((boq0) CollectionsKt.U(arrayList)).e).b)).b).f41946a);
        boolean z3 = (i6 > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
        Object objP3 = fetVar.P();
        if (z3 || objP3 == cl5Var) {
            objP3 = jgk0.b(new elb(oms0Var, (byte) 5));
            fetVar.o0(objP3);
        }
        cms0 cms0VarE = phu0.E(oms0Var, y3dVarF, y3dVarF2, (cfq) z30Var.F(((l7m0) objP3).getValue(), fetVar, 0), lxs0Var, fetVar, (458752 & (i4 << 6)) | i5);
        fetVar.r(false);
        return cms0VarE;
    }
}
