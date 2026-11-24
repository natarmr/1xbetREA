package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class acv0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f649a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ acv0(pz40 pz40Var, ccv0 ccv0Var, long j, xhv xhvVar, y3k0 y3k0Var) {
        this.c = pz40Var;
        this.d = ccv0Var;
        this.b = j;
        this.e = xhvVar;
        this.f = y3k0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        boolean z;
        y9q0 y9q0Var;
        byte b = this.f649a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj7;
                ccv0 ccv0Var = (ccv0) obj6;
                xhv xhvVar = (xhv) obj5;
                y3k0 y3k0Var = (y3k0) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                uxs0 uxs0Var = ccv0.Q1;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(mm40Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    rcv0 rcv0Var = (rcv0) l7m0Var.getValue();
                    if (rcv0Var instanceof ocv0) {
                        fetVar2.e0(-1175280721);
                        n0q n0qVar = o7k0.c;
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA, shdVar);
                        jpm0.o(fetVar2, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, shdVar4);
                        ocv0 ocv0Var = (ocv0) rcv0Var;
                        oxh0 oxh0Var = ocv0Var.b;
                        int size = oxh0Var.b.size();
                        agi0 agi0Var = agi0.f827a;
                        if (size > 1) {
                            fetVar2.e0(747428224);
                            mm40 mm40VarQ = i120.Q(jm40Var, this.b, jd8.n);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarJ = s5x0.J(mm40VarQ, 8.0f);
                            a4x a4xVar = oxh0Var.b;
                            dxh0 dxh0Var = oxh0Var.c;
                            boolean zG = fetVar2.g(rcv0Var);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new rbt0(ocv0Var, (byte) 26);
                                fetVar2.o0(objP);
                            }
                            Function0 function0 = (Function0) objP;
                            boolean zI = fetVar2.i(ccv0Var);
                            Object objP2 = fetVar2.P();
                            if (zI || objP2 == cl5Var) {
                                objP2 = new npt0(ccv0Var, (byte) 27);
                                fetVar2.o0(objP2);
                            }
                            ibc.n(mm40VarJ, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar2, 384, 16);
                            mbc.o(agi0Var, null, false, fetVar2, 6, 6);
                            fetVar = fetVar2;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar2;
                            fetVar.e0(748285684);
                            mbc.o(agi0Var, null, false, fetVar, 6, 6);
                            fetVar.r(false);
                        }
                        i3m0 i3m0Var = ocv0Var.f25047a;
                        x7z x7zVar = new x7z(1.0f, true);
                        Object objP3 = fetVar.P();
                        if (objP3 == cl5Var) {
                            objP3 = new d4u0((byte) 23);
                            fetVar.o0(objP3);
                        }
                        ay3.f(i3m0Var, x7zVar, (Function1) objP3, null, null, null, u1c.M(-1872277853, new n82(xhvVar, ccv0Var, y3k0Var, (byte) 5), fetVar), fetVar, 1573248, 56);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        if (rcv0Var instanceof pcv0) {
                            fetVar.e0(-1171449710);
                            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                            mdm mdmVar = ((pcv0) rcv0Var).f26778a;
                            boolean zI2 = fetVar.i(ccv0Var);
                            Object objP4 = fetVar.P();
                            if (zI2 || objP4 == cl5Var) {
                                z = false;
                                objP4 = new zbv0(ccv0Var, false ? 1 : 0);
                                fetVar.o0(objP4);
                            } else {
                                z = false;
                            }
                            jcb.l(mm40VarB, mdmVar, false, (Function0) objP4, fetVar, 0, 4);
                            fetVar.r(z);
                        } else {
                            if (!Intrinsics.d(rcv0Var, qcv0.f28503a)) {
                                throw b1j.f(377727554, fetVar, false);
                            }
                            fetVar.e0(377867249);
                            lvm0.e(0, fetVar, null);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                String str = (String) obj7;
                String str2 = (String) obj6;
                y9q0 y9q0Var2 = (y9q0) obj5;
                y9q0 y9q0Var3 = (y9q0) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(lr8Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    g9q0 g9q0VarN = pym0.n(fetVar3);
                    w6k w6kVar = (w6k) fetVar3.k(bmd.h);
                    Object objP5 = fetVar3.P();
                    Object obj8 = objP5;
                    if (objP5 == cl5Var) {
                        pz40 pz40VarE = androidx.compose.runtime.e.e(new daq0(y9q0Var2.f42262a.b));
                        fetVar3.o0(pz40VarE);
                        obj8 = pz40VarE;
                    }
                    pz40 pz40Var = (pz40) obj8;
                    ycl yclVar = new ycl(lr8Var.d());
                    boolean zG2 = fetVar3.g(w6kVar) | ((iIntValue2 & 14) == 4) | fetVar3.g(y9q0Var2);
                    long j = this.b;
                    boolean zF = zG2 | fetVar3.f(j) | fetVar3.g(g9q0VarN) | fetVar3.g(str) | fetVar3.g(str2) | fetVar3.g(y9q0Var3);
                    Object objP6 = fetVar3.P();
                    if (zF || objP6 == cl5Var) {
                        y9q0Var = y9q0Var2;
                        objP6 = new gsn(w6kVar, y9q0Var, j, g9q0VarN, str, str2, y9q0Var3, lr8Var, pz40Var, (yje) null);
                        fetVar3.o0(objP6);
                    } else {
                        y9q0Var = y9q0Var2;
                    }
                    m0x0.u(str, str2, yclVar, (Function2) objP6, fetVar3);
                    mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarW);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    v8q0.a(str, new x7z(1.0f, false), 0L, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar3, 0, 24960, 110572);
                    zcl zclVar2 = qmk.f28987a;
                    qxw.o(fetVar3, o7k0.s(jm40Var, 4.0f));
                    v8q0.a(str2, null, ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0Var3, fetVar3, 0, 24576, 114666);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ acv0(String str, String str2, y9q0 y9q0Var, long j, y9q0 y9q0Var2) {
        this.c = str;
        this.d = str2;
        this.e = y9q0Var;
        this.b = j;
        this.f = y9q0Var2;
    }
}
