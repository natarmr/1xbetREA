package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ywl0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43375a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ywl0(boolean z, Function1 function1, kem kemVar) {
        this.f43375a = (byte) 1;
        this.b = z;
        this.c = function1;
        this.d = kemVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r0;
        byte b = this.f43375a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Object obj5 = ukd.f35823a;
        final Function1 function1 = this.c;
        Object obj6 = this.d;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 0:
                a4x a4xVar = (a4x) obj6;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                int i = iIntValue2;
                if (fetVar.U(i & 1, (i & 145) != 144)) {
                    pz40 pz40Var = s6t0.f31722a;
                    oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_stadium, 0, fetVar), new m78(s6t0.b().f33626a.getSecondary20(), 5), null, 10);
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    k7x.b((String) a4xVar.get(iIntValue), null, o2e.e0(n0qVar, "STADIUM_IMAGE"), oilVarT, oilVarT, null, null, null, null, null, gqw0.A, null, fetVar, 37296, 6, 31712);
                    if (this.b) {
                        fetVar.e0(-1224776);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarJ = s5x0.J(jr8.f16991a.b(o7k0.n(jm40Var, 64.0f), gqw0.c), 16.0f);
                        boolean zG = fetVar.g(function1) | fetVar.g(a4xVar) | ((i & 112) == 32);
                        Object objP = fetVar.P();
                        if (zG || objP == obj5) {
                            r0 = 0;
                            objP = new zwl0((byte) 0, iIntValue, a4xVar, function1);
                            fetVar.o0(objP);
                        } else {
                            r0 = 0;
                        }
                        j0x.b(a8k0.F(R.drawable.ic_expand_all_white, r0, fetVar), null, y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28), null, null, 0.0f, null, fetVar, 56, 120);
                        fetVar.r(r0);
                    } else {
                        fetVar.e0(-493734);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                final kem kemVar = (kem) obj6;
                a4x a4xVar2 = (a4x) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                a4xVar2.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar2.g(a4xVar2) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar2, fetVar2);
                    boolean zG2 = fetVar2.g(function1) | fetVar2.g(kemVar);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == obj5) {
                        objP2 = new xdr() { // from class: a.xmo
                            @Override // a.xdr
                            public final Object F(Object obj7, Object obj8, Object obj9) {
                                byte b4 = b3;
                                kem kemVar2 = kemVar;
                                Function1 function2 = function1;
                                long jLongValue = ((Long) obj7).longValue();
                                long jLongValue2 = ((Long) obj8).longValue();
                                switch (b4) {
                                    case 0:
                                        wgl0 wgl0Var = (wgl0) obj9;
                                        wgl0Var.getClass();
                                        function2.invoke(new tdm(kemVar2.f18159a, jLongValue, jLongValue2, wgl0Var));
                                        break;
                                    default:
                                        xgl0 xgl0Var = (xgl0) obj9;
                                        xgl0Var.getClass();
                                        function2.invoke(new vdm(kemVar2.f18159a, jLongValue, jLongValue2, xgl0Var));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP2);
                    }
                    xdr xdrVar = (xdr) objP2;
                    boolean zG3 = fetVar2.g(function1) | fetVar2.g(kemVar);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == obj5) {
                        objP3 = new xdr() { // from class: a.xmo
                            @Override // a.xdr
                            public final Object F(Object obj7, Object obj8, Object obj9) {
                                byte b4 = b2;
                                kem kemVar2 = kemVar;
                                Function1 function2 = function1;
                                long jLongValue = ((Long) obj7).longValue();
                                long jLongValue2 = ((Long) obj8).longValue();
                                switch (b4) {
                                    case 0:
                                        wgl0 wgl0Var = (wgl0) obj9;
                                        wgl0Var.getClass();
                                        function2.invoke(new tdm(kemVar2.f18159a, jLongValue, jLongValue2, wgl0Var));
                                        break;
                                    default:
                                        xgl0 xgl0Var = (xgl0) obj9;
                                        xgl0Var.getClass();
                                        function2.invoke(new vdm(kemVar2.f18159a, jLongValue, jLongValue2, xgl0Var));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP3);
                    }
                    azw.h(null, pz40VarF, this.b, xdrVar, (xdr) objP3, fetVar2, 0, 1);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                c4s0 c4s0Var = (c4s0) obj6;
                int iIntValue4 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar3.e(iIntValue4) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    g3s0 g3s0Var = g3s0.STAGE;
                    boolean z = this.b;
                    Function1 function2 = this.c;
                    if (iIntValue4 == 1) {
                        fetVar3.e0(-1223988903);
                        unh0.g0(0, fetVar3, c4s0Var.b, null, function2, z);
                        fetVar3.r(false);
                    } else if (iIntValue4 == 0) {
                        fetVar3.e0(-1223654444);
                        unh0.g0(0, fetVar3, c4s0Var.c, null, function2, z);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-1223368345);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ywl0(Object obj, boolean z, Function1 function1, byte b) {
        this.f43375a = b;
        this.d = obj;
        this.b = z;
        this.c = function1;
    }
}
