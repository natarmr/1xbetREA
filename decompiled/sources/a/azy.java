package a;

import android.content.res.Configuration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class azy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1742a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fzy c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ azy(mm40 mm40Var, fzy fzyVar, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = fzyVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object objJ;
        Object objJ2;
        int i;
        byte b = this.f1742a;
        Function1 function1 = this.d;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qja qjaVar = qja.j;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = fetVar.g(function1);
                    fzy fzyVar = this.c;
                    boolean zI = zG | fetVar.i(fzyVar);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new wqv(function1, fzyVar, (byte) 23);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarW = y860.W(this.b, null, null, false, null, (Function0) objP, 28);
                    thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(fzyVar.f != hkv0.c), fetVar);
                    oms0 oms0VarZ = phu0.Z(fzyVar.f, null, fetVar, 0, 2);
                    pz40 pz40Var = oms0VarZ.d;
                    p4 p4Var = oms0VarZ.f25519a;
                    hgk0 hgk0Var = (hgk0) pz40Var;
                    hkv0 hkv0Var = (hkv0) hgk0Var.getValue();
                    fetVar.e0(2084094035);
                    int[] iArr = dzy.f6964a;
                    long jD = iArr[hkv0Var.ordinal()] == 1 ? cs0.D(fetVar, 1359612088, fetVar, false) : b1j.e(fetVar, 1359613950, fetVar, false);
                    fetVar.r(false);
                    y4d y4dVarF = y3d.f(jD);
                    boolean zG2 = fetVar.g(y4dVarF);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = kng0.d(qjaVar, new s43(y4dVarF, (byte) 2), fetVar);
                    }
                    lxs0 lxs0Var = (lxs0) objP2;
                    if (oms0VarZ.h()) {
                        objJ = vqd.j(fetVar, 1666827533, false, p4Var);
                    } else {
                        fetVar.e0(1666573488);
                        boolean zG3 = fetVar.g(oms0VarZ);
                        objJ = fetVar.P();
                        if (zG3 || objJ == cl5Var) {
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
                    fetVar.e0(2084094035);
                    y3d y3dVarF = dw9.f(fetVar, false, iArr[((hkv0) objJ).ordinal()] == 1 ? cs0.D(fetVar, 1359612088, fetVar, false) : b1j.e(fetVar, 1359613950, fetVar, false));
                    boolean zG4 = fetVar.g(oms0VarZ);
                    Object objP3 = fetVar.P();
                    if (zG4 || objP3 == cl5Var) {
                        objP3 = jgk0.b(new m6x(oms0VarZ, (byte) 19));
                        fetVar.o0(objP3);
                    }
                    hkv0 hkv0Var2 = (hkv0) ((l7m0) objP3).getValue();
                    fetVar.e0(2084094035);
                    y3d y3dVarF2 = dw9.f(fetVar, false, iArr[hkv0Var2.ordinal()] == 1 ? cs0.D(fetVar, 1359612088, fetVar, false) : b1j.e(fetVar, 1359613950, fetVar, false));
                    boolean zG5 = fetVar.g(oms0VarZ);
                    Object objP4 = fetVar.P();
                    if (zG5 || objP4 == cl5Var) {
                        objP4 = jgk0.b(new m6x(oms0VarZ, (byte) 21));
                        fetVar.o0(objP4);
                    }
                    fetVar.e0(-781456724);
                    nul0 nul0VarG0 = ro4.g0(0.0f, 0.0f, null, 7);
                    fetVar.r(false);
                    cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, nul0VarG0, lxs0Var, fetVar, 0);
                    hkv0 hkv0Var3 = (hkv0) hgk0Var.getValue();
                    fetVar.e0(1522005945);
                    long jD2 = iArr[hkv0Var3.ordinal()] == 2 ? cs0.D(fetVar, -1936130402, fetVar, false) : b1j.e(fetVar, -1936128540, fetVar, false);
                    fetVar.r(false);
                    y4d y4dVarF2 = y3d.f(jD2);
                    boolean zG6 = fetVar.g(y4dVarF2);
                    Object objP5 = fetVar.P();
                    if (zG6 || objP5 == cl5Var) {
                        objP5 = kng0.d(qjaVar, new s43(y4dVarF2, (byte) 2), fetVar);
                    }
                    lxs0 lxs0Var2 = (lxs0) objP5;
                    if (oms0VarZ.h()) {
                        objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
                    } else {
                        fetVar.e0(1666573488);
                        boolean zG7 = fetVar.g(oms0VarZ);
                        objJ2 = fetVar.P();
                        if (zG7 || objJ2 == cl5Var) {
                            rfk0 rfk0VarJ2 = vdx.J();
                            Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                            rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                            try {
                                Object objY1 = p4Var.y0();
                                vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                fetVar.o0(objY1);
                                objJ2 = objY1;
                            } catch (Throwable th2) {
                                vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                throw th2;
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(1522005945);
                    y3d y3dVarF3 = dw9.f(fetVar, false, iArr[((hkv0) objJ2).ordinal()] == 2 ? cs0.D(fetVar, -1936130402, fetVar, false) : b1j.e(fetVar, -1936128540, fetVar, false));
                    boolean zG8 = fetVar.g(oms0VarZ);
                    Object objP6 = fetVar.P();
                    if (zG8 || objP6 == cl5Var) {
                        objP6 = jgk0.b(new m6x(oms0VarZ, (byte) 23));
                        fetVar.o0(objP6);
                    }
                    hkv0 hkv0Var4 = (hkv0) ((l7m0) objP6).getValue();
                    fetVar.e0(1522005945);
                    y3d y3dVarF4 = dw9.f(fetVar, false, iArr[hkv0Var4.ordinal()] == 2 ? cs0.D(fetVar, -1936130402, fetVar, false) : b1j.e(fetVar, -1936128540, fetVar, false));
                    boolean zG9 = fetVar.g(oms0VarZ);
                    Object objP7 = fetVar.P();
                    if (zG9 || objP7 == cl5Var) {
                        objP7 = jgk0.b(new m6x(oms0VarZ, (byte) 25));
                        fetVar.o0(objP7);
                    }
                    fetVar.e0(-781456724);
                    nul0 nul0VarG1 = ro4.g0(0.0f, 0.0f, null, 7);
                    fetVar.r(false);
                    cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVarF3, y3dVarF4, nul0VarG1, lxs0Var2, fetVar, 0);
                    Object objP8 = fetVar.P();
                    if (objP8 == cl5Var) {
                        zcl zclVar = qmk.f28987a;
                        i = 2;
                        objP8 = o7k0.n(s5x0.L(jm40.b, 8.0f, 0.0f, 2), 8.0f);
                        fetVar.o0(objP8);
                    } else {
                        i = 2;
                    }
                    mm40 mm40Var = (mm40) objP8;
                    obc.d(dgp0.d.a(y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, ((Configuration) fetVar.k(dy2.f6873a)).getLayoutDirection() == 1 ? i : 1, 0L, null, null, 16711679)), u1c.M(-727226338, new ajw((Object) fzyVar, (Object) pz40VarF, (Object) mm40Var, (l7m0) cms0VarE, (l7m0) cms0VarE2, (byte) 4), fetVar), fetVar, 56);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                qxw.d(this.b, this.c, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ azy(mm40 mm40Var, Function1 function1, fzy fzyVar) {
        this.b = mm40Var;
        this.d = function1;
        this.c = fzyVar;
    }
}
