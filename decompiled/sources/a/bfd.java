package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class bfd implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2496a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;

    public bfd(a4x a4xVar, Function1 function1, l7m0 l7m0Var) {
        this.f2496a = (byte) 4;
        this.b = a4xVar;
        this.d = function1;
        this.c = l7m0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mim0 lim0Var;
        int i2;
        mim0 lim0Var2;
        int i3;
        fet fetVar;
        int i4;
        fet fetVar2;
        int i5;
        byte b = this.f2496a;
        float f = 8.0f;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.d;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    xdd xddVar = (xdd) a4xVar.get(iIntValue);
                    fetVar3.e0(-2046996491);
                    if (xddVar instanceof vdd) {
                        lim0Var = ((vdd) xddVar).f37225a;
                    } else {
                        aql0 aql0Var = aql0.f1302a;
                        lim0Var = new lim0();
                    }
                    mim0 mim0Var = lim0Var;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(jm40Var, xfn.a(fetVar3).d, 12.0f, xfn.a(fetVar3).d, iIntValue == ((dfd) l7m0Var.getValue()).b.size() + (-1) ? 24.0f : 0.0f);
                    boolean zG = fetVar3.g(function1) | fetVar3.g(xddVar);
                    Object objP = fetVar3.P();
                    if (zG || objP == cl5Var) {
                        objP = new at7(function1, xddVar, (byte) 24);
                        fetVar3.o0(objP);
                    }
                    lgb.n(mm40VarM, mim0Var, true, (Function1) objP, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    ugp ugpVar = (ugp) a4xVar.get(iIntValue3);
                    fetVar4.e0(-1122611549);
                    if (ugpVar instanceof sgp) {
                        lim0Var2 = ((sgp) ugpVar).f32172a;
                    } else {
                        aql0 aql0Var2 = aql0.f1302a;
                        lim0Var2 = new lim0();
                    }
                    mim0 mim0Var2 = lim0Var2;
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarM2 = s5x0.M(jm40Var, xfn.a(fetVar4).d, 8.0f, xfn.a(fetVar4).d, iIntValue3 == ((vgp) l7m0Var.getValue()).b.size() + (-1) ? 24.0f : 0.0f);
                    boolean zG2 = fetVar4.g(function1) | fetVar4.g(ugpVar);
                    Object objP2 = fetVar4.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new d2p(function1, ugpVar, (byte) 5);
                        fetVar4.o0(objP2);
                    }
                    lgb.n(mm40VarM2, mim0Var2, true, (Function1) objP2, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar5.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar5.U(i3 & 1, (i3 & 147) != 146)) {
                    uzy uzyVar = (uzy) a4xVar.get(iIntValue5);
                    fetVar5.e0(-1485394914);
                    boolean z = uzyVar instanceof szy;
                    jm40 jm40Var2 = jm40.b;
                    if (z) {
                        fetVar5.e0(-1485336945);
                        if (iIntValue5 == 0) {
                            zcl zclVar3 = qmk.f28987a;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f = 4.0f;
                        }
                        x1x.n(s5x0.M(jm40Var2, xfn.a(fetVar5).d, f, xfn.a(fetVar5).d, iIntValue5 == ((vzy) l7m0Var.getValue()).b.size() + (-1) ? 24.0f : 0.0f), (szy) uzyVar, ((vzy) l7m0Var.getValue()).c, this.d, fetVar5, 0);
                        fetVar = fetVar5;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar5;
                        fetVar.e0(-1484551157);
                        zcl zclVar5 = qmk.f28987a;
                        eeq.I(0, fetVar, s5x0.N(jm40Var2, xfn.a(fetVar).d, iIntValue5 == 0 ? 8.0f : 4.0f, xfn.a(fetVar).d, 0.0f, 8));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar6.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(i4 & 1, (i4 & 147) != 146)) {
                    nq90 nq90Var = (nq90) a4xVar.get(iIntValue7);
                    fetVar6.e0(-1101899080);
                    boolean z2 = ((lo90) l7m0Var.getValue()).g == iIntValue7;
                    if (((lo90) l7m0Var.getValue()).f == iIntValue7) {
                        fetVar6.e0(-1101783823);
                        sjm[] sjmVarArr = sjm.f32310a;
                        slb.l(null, xsm0.s(R.string.recommended, fetVar6), null, 0L, null, fetVar6, 48);
                        fetVar2 = fetVar6;
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar6;
                        fetVar2.e0(-1101591623);
                        fetVar2.r(false);
                    }
                    if (z2 && ((lo90) l7m0Var.getValue()).e) {
                        fetVar2.e0(-1101521997);
                        zcl zclVar6 = qmk.f28987a;
                        wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
                        sjm[] sjmVarArr2 = sjm.f32310a;
                        slb.l(null, xsm0.s(R.string.other, fetVar2), null, 0L, null, fetVar2, 48);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1101270215);
                        fetVar2.r(false);
                    }
                    if (nq90Var instanceof jq90) {
                        fetVar2.e0(-1101166148);
                        zcl zclVar7 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
                        jq90 jq90Var = (jq90) nq90Var;
                        rqm rqmVar = new rqm((vui0) new tui0(jq90Var.b, null), (pui0) null, (pvi0) new nvi0(jq90Var.f16940a == ((lo90) l7m0Var.getValue()).c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
                        boolean zG3 = fetVar2.g(function1) | fetVar2.i(nq90Var);
                        Object objP3 = fetVar2.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new oo90(function1, jq90Var, (byte) 0);
                            fetVar2.o0(objP3);
                        }
                        Function0 function0 = (Function0) objP3;
                        boolean zI = fetVar2.i(nq90Var) | fetVar2.g(function1);
                        Object objP4 = fetVar2.P();
                        if (zI || objP4 == cl5Var) {
                            objP4 = new oo90(function1, jq90Var, (byte) 1);
                            fetVar2.o0(objP4);
                        }
                        obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP4, null, fetVar2, 0, 172);
                        vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar2, 432, 9);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1100067849);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar6.X();
                }
                break;
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar7.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar7.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar7.U(i5 & 1, (i5 & 147) != 146)) {
                    mxm0 mxm0Var = (mxm0) a4xVar.get(iIntValue9);
                    fetVar7.e0(1879073204);
                    long j = mxm0Var.f22563a;
                    String str = mxm0Var.b;
                    boolean z3 = mxm0Var.c;
                    boolean zF = fetVar7.f(j) | fetVar7.g(str) | fetVar7.h(z3);
                    Object objP5 = fetVar7.P();
                    if (zF || objP5 == cl5Var) {
                        objP5 = new kvl(Long.valueOf(mxm0Var.f22563a), new tui0(str, null), null, new nvi0(z3), null, 500);
                        fetVar7.o0(objP5);
                    }
                    kvl kvlVar = (kvl) objP5;
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarL2 = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                    boolean zG4 = fetVar7.g(function1) | fetVar7.g(mxm0Var);
                    Object objP6 = fetVar7.P();
                    if (zG4 || objP6 == cl5Var) {
                        objP6 = new gxm0(function1, mxm0Var, (byte) 0);
                        fetVar7.o0(objP6);
                    }
                    Function1 function2 = (Function1) objP6;
                    boolean zG5 = fetVar7.g(function1) | fetVar7.g(mxm0Var);
                    Object objP7 = fetVar7.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new gxm0(function1, mxm0Var, (byte) 1);
                        fetVar7.o0(objP7);
                    }
                    dub.x(mm40VarL2, kvlVar, function2, (Function1) objP7, fetVar7, 0, 4);
                    if (iIntValue9 != q3d.i(((vxm0) l7m0Var.getValue()).b)) {
                        fetVar7.e0(1879671906);
                        vtb.t(null, qqm.f29173a, null, 0L, fetVar7, 48, 13);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(1879826627);
                        fetVar7.r(false);
                    }
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bfd(a4x a4xVar, l7m0 l7m0Var, Function1 function1, byte b) {
        this.f2496a = b;
        this.b = a4xVar;
        this.c = l7m0Var;
        this.d = function1;
    }
}
