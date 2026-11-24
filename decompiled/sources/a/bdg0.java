package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bdg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f2398a = {new ez40(bdg0.class, "isSelected", "isSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    public static final zai0 b = new zai0("IsSelected");

    public static final void a(mm40 mm40Var, final cdg0 cdg0Var, vcg0 vcg0Var, fet fetVar, int i, int i2) {
        int i3;
        ugd ugdVarM;
        cdg0Var.getClass();
        fetVar.g0(-1921134756);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.g(cdg0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= fetVar.e(vcg0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= fetVar.g(null) ? 2048 : 1024;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            final edg0 edg0VarK = n7x.K(vcg0Var);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "ROLLING_CALENDAR_DATE_CELL_TEMPLATE");
            boolean z = (i5 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eme0(cdg0Var, (byte) 20);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            ugd ugdVarM2 = u1c.M(754870155, new xdr() { // from class: a.adg0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    jm40 jm40Var = jm40.b;
                    edg0 edg0Var = edg0VarK;
                    cdg0 cdg0Var2 = cdg0Var;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                v8q0.a(cdg0Var2.f4161a, o2e.e0(jm40Var, "DAY_CONTENT"), cdg0Var2.e ? edg0Var.c : edg0Var.d, null, 0L, null, null, null, 0L, null, qmk.t, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, 48, 24960, 108536);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                String str = cdg0Var2.b;
                                qrq qrqVar = j1t0.b;
                                long j = qmk.p;
                                y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.C, 16646109);
                                v8q0.a(str, o2e.e0(jm40Var, "MONTH_CONTENT"), cdg0Var2.e ? edg0Var.e : edg0Var.f, new n05(qmk.o, j, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.q, 2, false, 1, 0, null, y9q0Var, fetVar3, 48, 24960, 108528);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            ugd ugdVarM3 = u1c.M(-310097076, new xdr() { // from class: a.adg0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    jm40 jm40Var = jm40.b;
                    edg0 edg0Var = edg0VarK;
                    cdg0 cdg0Var2 = cdg0Var;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                v8q0.a(cdg0Var2.f4161a, o2e.e0(jm40Var, "DAY_CONTENT"), cdg0Var2.e ? edg0Var.c : edg0Var.d, null, 0L, null, null, null, 0L, null, qmk.t, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, 48, 24960, 108536);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                String str = cdg0Var2.b;
                                qrq qrqVar = j1t0.b;
                                long j = qmk.p;
                                y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.C, 16646109);
                                v8q0.a(str, o2e.e0(jm40Var, "MONTH_CONTENT"), cdg0Var2.e ? edg0Var.e : edg0Var.f, new n05(qmk.o, j, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.q, 2, false, 1, 0, null, y9q0Var, fetVar3, 48, 24960, 108528);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            String str = cdg0Var.c;
            if (str == null) {
                fetVar.e0(-2084805199);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-2084805198);
                ugdVarM = u1c.M(-1273560415, new sqc0(str, edg0VarK, cdg0Var, (byte) 6), fetVar);
                fetVar.r(false);
            }
            m7x.l(mm40VarA, ugdVarM2, ugdVarM3, ugdVarM, cdg0Var.d ? hmw0.f : null, fetVar, 432);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hmo(mm40Var2, cdg0Var, vcg0Var, i, i2, (byte) 2);
        }
    }
}
