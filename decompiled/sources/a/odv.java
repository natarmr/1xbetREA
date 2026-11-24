package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class odv implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25094a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ odv(ehm0 ehm0Var, Function1 function1, jam0 jam0Var, boolean z) {
        this.f25094a = (byte) 4;
        this.c = ehm0Var;
        this.d = function1;
        this.e = jam0Var;
        this.b = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        k6z k6zVar;
        byte b = this.f25094a;
        wam0 wam0Var = wam0.f38836a;
        jm40 jm40Var = jm40.b;
        boolean z = this.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                w03 w03Var = (w03) obj6;
                w03 w03Var2 = (w03) obj5;
                i9q i9qVar = (i9q) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarK = lgb.K(tdc.F(o7k0.c, lr8Var.c()));
                    boolean zI = fetVar.i(w03Var) | fetVar.i(w03Var2);
                    boolean z2 = this.b;
                    boolean zH = fetVar.h(z2) | zI | fetVar.g(i9qVar);
                    Object objP = fetVar.P();
                    if (zH || objP == cl5Var) {
                        t13 t13Var = new t13((Object) w03Var, (Object) w03Var2, z2, (Object) i9qVar, (byte) 12);
                        fetVar.o0(t13Var);
                        objP = t13Var;
                    }
                    p8a.k(mm40VarK, (Function1) objP, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                llm0 llm0Var = (llm0) obj6;
                r020 r020Var = (r020) obj5;
                k3t0 k3t0Var = (k3t0) obj4;
                ir8 ir8Var = (ir8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ir8Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int iOrdinal = llm0Var.ordinal();
                    boolean z3 = this.b;
                    if (iOrdinal == 0) {
                        fetVar2.e0(1214548987);
                        n0q n0qVar = o7k0.c;
                        boolean zI2 = fetVar2.i(k3t0Var);
                        Object objP2 = fetVar2.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new yw10(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                            fetVar2.o0(objP2);
                        }
                        rq8.u(ir8Var, n0qVar, r020Var, z3, (Function1) ((jhy) objP2), fetVar2, (iIntValue2 & 14) | 48);
                        fetVar2.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar2.e0(1214559197);
                        n0q n0qVar2 = o7k0.c;
                        boolean zI3 = fetVar2.i(k3t0Var);
                        Object objP3 = fetVar2.P();
                        if (zI3 || objP3 == cl5Var) {
                            objP3 = new yw10(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                            fetVar2.o0(objP3);
                        }
                        wgm0.i(n0qVar2, r020Var, z3, (Function1) ((jhy) objP3), fetVar2, 6);
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(1214546924, fetVar2, false);
                        }
                        fetVar2.e0(1214569885);
                        n0q n0qVar3 = o7k0.c;
                        boolean zI4 = fetVar2.i(k3t0Var);
                        Object objP4 = fetVar2.P();
                        if (zI4 || objP4 == cl5Var) {
                            objP4 = new yw10(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                            fetVar2.o0(objP4);
                        }
                        j0x.e(n0qVar3, r020Var, z3, (Function1) ((jhy) objP4), fetVar2, 6);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                xcz xczVar = (xcz) obj6;
                pz40 pz40Var = (pz40) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean z4 = !z;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(xfn.a(fetVar3).d, 12.0f, xfn.a(fetVar3).d, 24.0f, fetVar3);
                    boolean zG = fetVar3.g(pz40Var) | fetVar3.g(function1);
                    Object objP5 = fetVar3.P();
                    if (zG || objP5 == cl5Var) {
                        objP5 = new jg2(pz40Var, function1, (byte) 4);
                        fetVar3.o0(objP5);
                    }
                    b8k0.e(null, xczVar, ch80VarF, null, null, null, z4, null, (Function1) objP5, fetVar3, 0, 377);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                Function0 function0 = (Function0) obj6;
                Function1 function2 = (Function1) obj5;
                cgk0 cgk0Var = (cgk0) obj4;
                h6m h6mVar = (h6m) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                h6mVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(h6mVar) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    Object objP6 = fetVar4.P();
                    if (objP6 == cl5Var) {
                        objP6 = new nw6(cgk0Var, (byte) 10);
                        fetVar4.o0(objP6);
                    }
                    nkb.a(mm40VarD, h6mVar, this.b, function0, (Function1) objP6, function2, fetVar4, ((iIntValue4 << 3) & 112) | 24582);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ehm0 ehm0Var = (ehm0) obj6;
                Function1 function3 = (Function1) obj5;
                jam0 jam0Var = (jam0) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ufx ufxVar = ehm0Var.d;
                    if (ufxVar instanceof vam0) {
                        fetVar5.e0(534275355);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 24.0f, 1);
                        mdm mdmVar = ((vam0) ufxVar).f37097a;
                        boolean zG2 = fetVar5.g(function3) | fetVar5.e(jam0Var.ordinal());
                        Object objP7 = fetVar5.P();
                        if (zG2 || objP7 == cl5Var) {
                            objP7 = new m0z(function3, jam0Var, (byte) 1);
                            fetVar5.o0(objP7);
                        }
                        jcb.l(mm40VarL, mdmVar, true, (Function0) objP7, fetVar5, 384, 0);
                        fetVar5.r(false);
                    } else if (Intrinsics.d(ufxVar, wam0Var)) {
                        fetVar5.e0(534696738);
                        lmc.d(0, 1, fetVar5, null);
                        fetVar5.r(false);
                    } else {
                        if (!(ufxVar instanceof xam0)) {
                            throw b1j.f(-1922429414, fetVar5, false);
                        }
                        fetVar5.e0(534865750);
                        Object objP8 = fetVar5.P();
                        if (objP8 == cl5Var) {
                            objP8 = new m0z(function3, jam0Var, (byte) 2);
                            fetVar5.o0(objP8);
                        }
                        Function0 function4 = (Function0) objP8;
                        n1z n1zVar = (n1z) ((xam0) ufxVar).f40564a;
                        h1z h1zVar = n1zVar.f22776a;
                        mdm mdmVar2 = n1zVar.b;
                        Object objP9 = fetVar5.P();
                        if (objP9 == cl5Var) {
                            objP9 = new okw(function3, jam0Var, (byte) 17);
                            fetVar5.o0(objP9);
                        }
                        Function1 function5 = (Function1) objP9;
                        boolean zG3 = fetVar5.g(function3);
                        Object objP10 = fetVar5.P();
                        if (zG3 || objP10 == cl5Var) {
                            objP10 = new i1y(function3, (byte) 15);
                            fetVar5.o0(objP10);
                        }
                        azw.y(ehm0Var, this.b, mdmVar2, jam0Var, h1zVar, (Function1) objP10, function4, function5, fetVar5, 14155776);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                ufx ufxVar2 = ((ehm0) obj6).d;
                xcz xczVar2 = (xcz) obj5;
                Function1 function6 = (Function1) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    fetVar6.X();
                } else if (ufxVar2 instanceof vam0) {
                    fetVar6.e0(-1096562237);
                    fetVar6.r(false);
                } else if (Intrinsics.d(ufxVar2, wam0Var)) {
                    fetVar6.e0(-1096488798);
                    lmc.d(0, 1, fetVar6, null);
                    fetVar6.r(false);
                } else {
                    if (!(ufxVar2 instanceof xam0)) {
                        throw b1j.f(-1697942600, fetVar6, false);
                    }
                    fetVar6.e0(-1096346322);
                    rrb0 rrb0Var = (rrb0) ((xam0) ufxVar2).f40564a;
                    a4x a4xVar = rrb0Var.f30975a;
                    a4x a4xVar2 = rrb0Var.b;
                    Object objP11 = fetVar6.P();
                    if (objP11 == cl5Var) {
                        objP11 = new rpa0(function6, (byte) 15);
                        fetVar6.o0(objP11);
                    }
                    q0x.E(a4xVar, a4xVar2, xczVar2, this.b, (Function1) objP11, fetVar6, 24576);
                    fetVar6.r(false);
                }
                return Unit.f46060a;
            case 6:
                hh80 hh80Var = (hh80) obj6;
                a4x a4xVar3 = (a4x) obj5;
                Function1 function7 = (Function1) obj4;
                lr8 lr8Var2 = (lr8) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                lr8Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(lr8Var2) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    int i = ycl.a(lr8Var2.d(), 560.0f) >= 0 ? 3 : 2;
                    k6z k6zVar2 = k6z.f17794a;
                    float fD = lr8Var2.d() - (hh80Var.c(k6zVar2) + hh80Var.b(k6zVar2));
                    zcl zclVar3 = qmk.f28987a;
                    float f = (fD - ((i - 1) * 8.0f)) / i;
                    mm40 mm40VarI = s5x0.I(o7k0.d(jm40Var, 1.0f), hh80Var);
                    if (z) {
                        fetVar7.e0(-1541082188);
                        n2x.r(mm40VarI, a4xVar3, i, f, function7, fetVar7, 0);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-1540830158);
                        n2x.q(mm40VarI, a4xVar3, i, f, function7, fetVar7, 0);
                        fetVar7.r(false);
                    }
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                hh80 hh80Var2 = (hh80) obj6;
                final ugg0 ugg0Var = (ugg0) obj5;
                final fqj0 fqj0Var = (fqj0) obj4;
                lr8 lr8Var3 = (lr8) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                lr8Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(lr8Var3) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    int i2 = ycl.a(lr8Var3.d(), 560.0f) >= 0 ? 3 : 2;
                    k6z k6zVar3 = k6z.f17794a;
                    final float fD2 = ((lr8Var3.d() - (hh80Var2.c(k6zVar3) + hh80Var2.b(k6zVar3))) - ((i2 - 1) * 8.0f)) / i2;
                    final int i3 = i2 * 2;
                    if (z) {
                        fetVar8.e0(-314478612);
                        mm40 mm40VarI2 = s5x0.I(o7k0.d(jm40Var, 1.0f), hh80Var2);
                        ngv ngvVar = new ngv(i2);
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                        boolean zE = fetVar8.e(i3) | fetVar8.d(fD2) | fetVar8.g(ugg0Var) | fetVar8.g(fqj0Var);
                        Object objP12 = fetVar8.P();
                        if (zE || objP12 == cl5Var) {
                            objP12 = new Function1() { // from class: a.juc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    i8z i8zVar = (i8z) obj7;
                                    i8zVar.getClass();
                                    i8z.f(i8zVar, i3, null, null, new ugd(-377720219, true, new yjm(fD2, ugg0Var, fqj0Var, (byte) 2)), 14);
                                    return Unit.f46060a;
                                }
                            };
                            fetVar8.o0(objP12);
                        }
                        g8x.i(ngvVar, mm40VarI2, null, null, qw3Var2, qw3Var, null, true, null, (Function1) objP12, fetVar8, 100663296, 668);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-313548333);
                        mm40 mm40VarI3 = s5x0.I(o7k0.d(jm40Var, 1.0f), hh80Var2);
                        x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar8, 0);
                        ugg0 ugg0Var2 = ugg0Var;
                        int iHashCode = Long.hashCode(fetVar8.T);
                        bh90 bh90VarM = fetVar8.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar8, mm40VarI3);
                        mkd.c0.getClass();
                        fetVar8.i0();
                        boolean z5 = fetVar8.S;
                        pcy pcyVar = e7z.u1;
                        if (z5) {
                            fetVar8.l(pcyVar);
                        } else {
                            fetVar8.r0();
                        }
                        jpm0.o(fetVar8, x5dVarA, shdVar4);
                        jpm0.o(fetVar8, bh90VarM, shdVar3);
                        vqd.u(iHashCode, fetVar8, shdVar2, fetVar8);
                        jpm0.o(fetVar8, mm40VarC0, shdVar);
                        fetVar8.e0(-308493684);
                        for (int i4 = 0; i4 < 2; i4++) {
                            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar8, 0);
                            ugg0 ugg0Var3 = ugg0Var2;
                            int iHashCode2 = Long.hashCode(fetVar8.T);
                            bh90 bh90VarM2 = fetVar8.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar8, jm40Var);
                            mkd.c0.getClass();
                            fetVar8.i0();
                            if (fetVar8.S) {
                                fetVar8.l(pcyVar);
                            } else {
                                fetVar8.r0();
                            }
                            jpm0.o(fetVar8, thg0VarA, shdVar4);
                            jpm0.o(fetVar8, bh90VarM2, shdVar3);
                            vqd.u(iHashCode2, fetVar8, shdVar2, fetVar8);
                            jpm0.o(fetVar8, mm40VarC1, shdVar);
                            fetVar8.e0(192456251);
                            for (int iB = 0; iB < i2; iB = h97.b(lgb.J(ny9.O(1.5f, o7k0.s(jm40Var, fD2), false), ugg0Var3), fqj0Var, fetVar8, 0, iB, 1)) {
                            }
                            ugg0Var2 = ugg0Var3;
                            fetVar8.r(false);
                            fetVar8.r(true);
                        }
                        ohs0.x(fetVar8, false, true, false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            default:
                db00 db00Var = (db00) obj6;
                Function1 function8 = (Function1) obj5;
                Function1 function9 = (Function1) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    fetVar9.X();
                } else if (db00Var instanceof ab00) {
                    fetVar9.e0(-785551703);
                    lmc.d(0, 1, fetVar9, null);
                    fetVar9.r(false);
                } else if (db00Var instanceof wa00) {
                    fetVar9.e0(-785549621);
                    t9x.b((wa00) db00Var, function8, fetVar9, 0);
                    fetVar9.r(false);
                } else if (db00Var instanceof ya00) {
                    fetVar9.e0(-785544501);
                    t9x.c((ya00) db00Var, function8, fetVar9, 0);
                    fetVar9.r(false);
                } else {
                    if (!(db00Var instanceof va00)) {
                        throw b1j.f(-785552000, fetVar9, false);
                    }
                    fetVar9.e0(1418119950);
                    if (z) {
                        fetVar9.e0(-785536258);
                        k6zVar = (k6z) fetVar9.k(bmd.n);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(-785535334);
                        fetVar9.r(false);
                        k6zVar = k6z.f17794a;
                    }
                    obc.d(bmd.n.a(k6zVar), u1c.M(224406040, new aak0(db00Var, function9, function8, (byte) 27), fetVar9), fetVar9, 56);
                    fetVar9.r(false);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ odv(hh80 hh80Var, boolean z, Object obj, Object obj2, byte b) {
        this.f25094a = b;
        this.c = hh80Var;
        this.b = z;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ odv(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.f25094a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ odv(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.f25094a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
