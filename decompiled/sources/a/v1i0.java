package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v1i0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36632a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v1i0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f36632a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        byte b = this.f36632a;
        mm40 mm40VarY = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                boolean z2 = false;
                wul wulVar = (wul) obj7;
                wul wulVar2 = (wul) obj6;
                x1i0 x1i0Var = (x1i0) obj5;
                hdj hdjVar = (hdj) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zie0 zie0Var = x1i0.n2;
                ((ir8) obj).getClass();
                if ((iIntValue & 17) != 16) {
                    z2 = true;
                }
                if (fetVar.U(iIntValue & 1, z2)) {
                    vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
                    vul vulVar = vul.f38053a;
                    boolean zI = fetVar.i(x1i0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new w1i0(x1i0Var, (byte) 2);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG = fetVar.g(hdjVar) | fetVar.i(x1i0Var);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new x6h0(hdjVar, x1i0Var, (byte) 9);
                        fetVar.o0(objP2);
                    }
                    gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
                    zcl zclVar = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                boolean z3 = false;
                wul wulVar3 = (wul) obj7;
                wul wulVar4 = (wul) obj6;
                y3i0 y3i0Var = (y3i0) obj5;
                gfj gfjVar = (gfj) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lme0 lme0Var = y3i0.n2;
                ((ir8) obj).getClass();
                if ((iIntValue2 & 17) != 16) {
                    z3 = true;
                }
                if (fetVar2.U(iIntValue2 & 1, z3)) {
                    vtb.t(null, qqm.b, null, 0L, fetVar2, 48, 13);
                    vul vulVar2 = vul.f38053a;
                    boolean zI2 = fetVar2.i(y3i0Var);
                    Object objP3 = fetVar2.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new w3i0(y3i0Var, (byte) 2);
                        fetVar2.o0(objP3);
                    }
                    Function0 function1 = (Function0) objP3;
                    boolean zG2 = fetVar2.g(gfjVar) | fetVar2.i(y3i0Var);
                    Object objP4 = fetVar2.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new x6h0(gfjVar, y3i0Var, (byte) 10);
                        fetVar2.o0(objP4);
                    }
                    gkb.i(null, vulVar2, wulVar3, wulVar4, 0L, function1, (Function0) objP4, fetVar2, 48, 17);
                    zcl zclVar2 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                f1l0 f1l0Var = (f1l0) obj7;
                w6k w6kVar = (w6k) obj6;
                Function1 function2 = (Function1) obj5;
                pz40 pz40Var = (pz40) obj4;
                g9z g9zVar = (g9z) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                g9zVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(g9zVar) ? 4 : 2;
                }
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarB = g9z.b(g9zVar, mm40VarY, null, 7);
                    if (f1l0Var instanceof d1l0) {
                        fetVar3.e0(492698049);
                        boolean zG3 = fetVar3.g(w6kVar);
                        Object objP5 = fetVar3.P();
                        if (zG3 || objP5 == cl5Var) {
                            objP5 = new a1i(pz40Var, w6kVar);
                            fetVar3.o0(objP5);
                        }
                        mm40VarY = fre0.Y(mm40VarY, (Function1) objP5);
                        i = 0;
                        fetVar3.r(false);
                    } else {
                        i = 0;
                        fetVar3.e0(492917653);
                        fetVar3.r(false);
                    }
                    o2e.U(mm40VarB.e(mm40VarY), f1l0Var, function2, fetVar3, i);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                skk0 skk0Var = (skk0) obj7;
                djz djzVar = (djz) obj6;
                a8q0 a8q0Var = (a8q0) obj5;
                qe60 qe60Var = (qe60) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar4 = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar4.e0(-84507373);
                boolean zBooleanValue = ((Boolean) fetVar4.k(bmd.y)).booleanValue();
                boolean zH = fetVar4.h(zBooleanValue);
                Object objP6 = fetVar4.P();
                if (zH || objP6 == cl5Var) {
                    objP6 = new fwf(zBooleanValue);
                    fetVar4.o0(objP6);
                }
                fwf fwfVar = (fwf) objP6;
                boolean z4 = skk0Var.f32354a != 16;
                if (((yez) ((rhv0) fetVar4.k(bmd.u))).c() && djzVar.b() && o9q0.c(a8q0Var.b) && z4) {
                    fetVar4.e0(-707487962);
                    j83 j83Var = a8q0Var.f440a;
                    o9q0 o9q0Var = new o9q0(a8q0Var.b);
                    boolean zI3 = fetVar4.i(fwfVar);
                    Object objP7 = fetVar4.P();
                    if (zI3 || objP7 == cl5Var) {
                        objP7 = new z2n0(fwfVar, null, (byte) 11);
                        fetVar4.o0(objP7);
                    }
                    m0x0.v(j83Var, o9q0Var, (Function2) objP7, fetVar4);
                    boolean zI4 = fetVar4.i(fwfVar) | fetVar4.i(qe60Var) | fetVar4.g(a8q0Var) | fetVar4.i(djzVar) | fetVar4.g(skk0Var);
                    Object objP8 = fetVar4.P();
                    if (zI4 || objP8 == cl5Var) {
                        q6q0 q6q0Var = new q6q0(fwfVar, qe60Var, a8q0Var, djzVar, skk0Var, (byte) 0);
                        fetVar4.o0(q6q0Var);
                        objP8 = q6q0Var;
                    }
                    mm40VarY = rq8.M(mm40Var, (Function1) objP8);
                    z = false;
                    fetVar4.r(false);
                } else {
                    z = false;
                    fetVar4.e0(-705473241);
                    fetVar4.r(false);
                }
                fetVar4.r(z);
                return mm40VarY;
            default:
                qdz qdzVar = (qdz) obj7;
                Function1 function3 = (Function1) obj6;
                Function1 function4 = (Function1) obj5;
                d930 d930Var = (d930) obj4;
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(p6t0Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean z5 = p6t0Var instanceof epu0;
                    jm40 jm40Var = jm40.b;
                    if (z5) {
                        fetVar5.e0(-836811092);
                        epu0 epu0Var = (epu0) p6t0Var;
                        qdzVar.getClass();
                        zcl zclVar3 = qmk.f28987a;
                        zvw.k(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), epu0Var.b, false, qdzVar.b(epu0Var.f8204a, new b4u0((byte) 16), fetVar5, 0), s5x0.t(xfn.a(fetVar5).c, 0.0f, 2), function3, fetVar5, 384, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var instanceof qpu0) {
                        fetVar5.e0(-836479144);
                        mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar5).e, 0.0f, 2);
                        qpu0 qpu0Var = (qpu0) p6t0Var;
                        boolean zG4 = fetVar5.g(function4) | ((iIntValue4 & 14) == 4);
                        Object objP9 = fetVar5.P();
                        if (zG4 || objP9 == cl5Var) {
                            objP9 = new vwj(function4, p6t0Var, (byte) 11);
                            fetVar5.o0(objP9);
                        }
                        Function0 function5 = (Function0) objP9;
                        function5.getClass();
                        nkb.h(o7k0.d(mm40VarL, 1.0f), qpu0Var.b, kjm.f18392a, null, function5, null, fetVar5, 384, 40);
                        fetVar5.r(false);
                    } else if (p6t0Var instanceof vpu0) {
                        fetVar5.e0(-836004224);
                        vpu0 vpu0Var = (vpu0) p6t0Var;
                        boolean zG5 = fetVar5.g(function4) | ((iIntValue4 & 14) == 4);
                        Object objP10 = fetVar5.P();
                        if (zG5 || objP10 == cl5Var) {
                            objP10 = new vwj(function4, p6t0Var, (byte) 12);
                            fetVar5.o0(objP10);
                        }
                        Function0 function6 = (Function0) objP10;
                        function6.getClass();
                        float f = xfn.a(fetVar5).e;
                        float f2 = xfn.a(fetVar5).e;
                        zcl zclVar4 = qmk.f28987a;
                        tlb.o(s5x0.N(jm40Var, f, 0.0f, f2, 4.0f, 2), vpu0Var.c, function6, fetVar5, 0, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var instanceof jpu0) {
                        fetVar5.e0(-835594621);
                        jpu0 jpu0Var = (jpu0) p6t0Var;
                        boolean zG6 = fetVar5.g(function4);
                        Object objP11 = fetVar5.P();
                        if (zG6 || objP11 == cl5Var) {
                            objP11 = new sbt0(function4, (byte) 20);
                            fetVar5.o0(objP11);
                        }
                        dem0.j(jpu0Var, d930Var, (Function1) objP11, fetVar5, ((iIntValue4 << 3) & 112) | 6);
                        fetVar5.r(false);
                    } else if (p6t0Var instanceof fpu0) {
                        fetVar5.e0(-835087585);
                        float f3 = xfn.a(fetVar5).c;
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var, f3, 0.0f, f3, 8.0f, 2);
                        vrm vrmVar = ((fpu0) p6t0Var).b;
                        boolean zG7 = fetVar5.g(function4);
                        Object objP12 = fetVar5.P();
                        if (zG7 || objP12 == cl5Var) {
                            objP12 = new sbt0(function4, (byte) 21);
                            fetVar5.o0(objP12);
                        }
                        ccq0.s(mm40VarN, vrmVar, (Function1) objP12, fetVar5, 0);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-834463586);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }
}
