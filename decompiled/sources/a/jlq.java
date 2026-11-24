package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jlq extends o0d0 {
    @Override // a.o0d0
    public final l7m0 a(oms0 oms0Var, String str, int i, fet fetVar, int i2) {
        Object objJ;
        fetVar.e0(2006928772);
        z30 z30Var = new z30((Object) this, i, (byte) 5);
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        lxs0 lxs0Var = hp4.j;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        boolean zH = oms0Var.h();
        p4 p4Var = oms0Var.f25519a;
        cl5 cl5Var = ukd.f35823a;
        boolean z = true;
        if (zH) {
            objJ = vqd.j(fetVar, 1666827533, false, p4Var);
        } else {
            fetVar.e0(1666573488);
            boolean z2 = (((i4 & 14) ^ 6) > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
            objJ = fetVar.P();
            if (z2 || objJ == cl5Var) {
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
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        fetVar.e0(-1743438372);
        ArrayList arrayList = this.f24419a;
        float fFloatValue = zBooleanValue ? ((Number) ((dmy) CollectionsKt.d0(((t0d0) ((boq0) CollectionsKt.d0(arrayList)).e).b)).b).floatValue() : ((Number) ((dmy) CollectionsKt.U(((t0d0) ((boq0) CollectionsKt.U(arrayList)).e).b)).b).floatValue();
        fetVar.r(false);
        Float fValueOf = Float.valueOf(fFloatValue);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z3 = (i6 > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
        Object objP = fetVar.P();
        if (z3 || objP == cl5Var) {
            objP = jgk0.b(new elb(oms0Var, (byte) 26));
            fetVar.o0(objP);
        }
        boolean zBooleanValue2 = ((Boolean) ((l7m0) objP).getValue()).booleanValue();
        fetVar.e0(-1743438372);
        float fFloatValue2 = zBooleanValue2 ? ((Number) ((dmy) CollectionsKt.d0(((t0d0) ((boq0) CollectionsKt.d0(arrayList)).e).b)).b).floatValue() : ((Number) ((dmy) CollectionsKt.U(((t0d0) ((boq0) CollectionsKt.U(arrayList)).e).b)).b).floatValue();
        fetVar.r(false);
        Float fValueOf2 = Float.valueOf(fFloatValue2);
        if ((i6 <= 4 || !fetVar.g(oms0Var)) && (i4 & 6) != 4) {
            z = false;
        }
        Object objP2 = fetVar.P();
        if (z || objP2 == cl5Var) {
            objP2 = jgk0.b(new elb(oms0Var, (byte) 27));
            fetVar.o0(objP2);
        }
        cms0 cms0VarE = phu0.E(oms0Var, fValueOf, fValueOf2, (cfq) z30Var.F(((l7m0) objP2).getValue(), fetVar, 0), lxs0Var, fetVar, i5 | (458752 & (i4 << 6)));
        fetVar.r(false);
        return cms0VarE;
    }
}
