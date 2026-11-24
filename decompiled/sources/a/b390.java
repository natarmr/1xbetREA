package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b390 extends o0d0 {
    @Override // a.o0d0
    public final l7m0 a(oms0 oms0Var, String str, int i, fet fetVar, int i2) {
        Object objJ;
        fetVar.e0(119461169);
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        lxs0 lxs0Var = hp4.j;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        boolean zH = oms0Var.h();
        p4 p4Var = oms0Var.f25519a;
        cl5 cl5Var = ukd.f35823a;
        if (zH) {
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
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        fetVar.e0(-1210845840);
        float f = zBooleanValue ? i : 0.0f;
        fetVar.r(false);
        Float fValueOf = Float.valueOf(f);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z2 = (i6 > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
        Object objP = fetVar.P();
        if (z2 || objP == cl5Var) {
            objP = jgk0.b(new tx50(oms0Var, (byte) 4));
            fetVar.o0(objP);
        }
        boolean zBooleanValue2 = ((Boolean) ((l7m0) objP).getValue()).booleanValue();
        fetVar.e0(-1210845840);
        float f2 = zBooleanValue2 ? i : 0.0f;
        fetVar.r(false);
        Float fValueOf2 = Float.valueOf(f2);
        boolean z3 = (i6 > 4 && fetVar.g(oms0Var)) || (i4 & 6) == 4;
        Object objP2 = fetVar.P();
        byte b = 5;
        if (z3 || objP2 == cl5Var) {
            objP2 = jgk0.b(new tx50(oms0Var, (byte) 5));
            fetVar.o0(objP2);
        }
        ams0 ams0Var = (ams0) ((l7m0) objP2).getValue();
        fetVar.e0(2115989621);
        cfq cfqVarM0 = ro4.m0(i, 0, ihn.d, 2);
        if (!((Boolean) ams0Var.b()).booleanValue()) {
            cfqVarM0 = new zag0(cfqVarM0, i);
        }
        fetVar.r(false);
        cms0 cms0VarE = phu0.E(oms0Var, fValueOf, fValueOf2, cfqVarM0, lxs0Var, fetVar, (458752 & (i4 << 6)) | i5);
        boolean zI = fetVar.i(this) | fetVar.g(cms0VarE);
        Object objP3 = fetVar.P();
        if (zI || objP3 == cl5Var) {
            objP3 = new qw80(this, cms0VarE, b);
            fetVar.o0(objP3);
        }
        zbk zbkVarB = jgk0.b((Function0) objP3);
        fetVar.r(false);
        return zbkVarB;
    }
}
