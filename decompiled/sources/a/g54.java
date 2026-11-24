package a;

import android.javax.sip.message.Response;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g54 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10700a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g54(pz40 pz40Var, pod podVar, Function2 function2, pz40 pz40Var2) {
        this.f10700a = (byte) 8;
        this.b = pz40Var;
        this.c = podVar;
        this.d = function2;
        this.e = pz40Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        kwj kwjVar;
        boolean z;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        l7m0 l7m0Var = (l7m0) this.c;
        xak xakVar = (xak) this.d;
        nek nekVar = (nek) this.b;
        Function1 function1 = (Function1) this.e;
        tf50 tf50Var = (tf50) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        ((b53) obj).getClass();
        tf50Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.e(tf50Var.ordinal()) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            tf50 tf50Var2 = tf50.b;
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            cl5 cl5Var = ukd.f35823a;
            if (tf50Var == tf50Var2) {
                fetVar.e0(113869754);
                l49 l49Var = ((pjs) l7m0Var.getValue()).e;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new baq(function1, (byte) 16);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean zG2 = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new baq(function1, (byte) 17);
                    fetVar.o0(objP2);
                }
                Function1 function3 = (Function1) objP2;
                l49Var.getClass();
                xakVar.getClass();
                nekVar.getClass();
                function2.getClass();
                function3.getClass();
                if (l49Var.equals(k49.f17656a)) {
                    fetVar.e0(-127652945);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarO = ny9.O(1.7777778f, o7k0.d(s5x0.K(jm40Var, qmk.a(fetVar).c, 8.0f), 1.0f), false);
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO), vbc.d0(null, fetVar, 0, 1), fetVar, 0, false);
                    z = false;
                } else {
                    yje yjeVar = null;
                    if (!(l49Var instanceof j49)) {
                        throw b1j.f(-127650651, fetVar, false);
                    }
                    fetVar.e0(338241874);
                    j49 j49Var = (j49) l49Var;
                    fetVar.b0(-127639282, j49Var.d);
                    int i = j49Var.b;
                    boolean zG3 = fetVar.g(l49Var);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new vb8(l49Var, (byte) 15);
                        fetVar.o0(objP3);
                    }
                    kwj kwjVarB = zk80.b(i, (Function0) objP3, fetVar, 0, 2);
                    fetVar.r(false);
                    i49 i49Var = j49Var.c;
                    boolean zG4 = fetVar.g(kwjVarB) | fetVar.g(l49Var) | fetVar.g(function3);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        kwjVar = kwjVarB;
                        objP4 = new l19((Object) kwjVar, (Object) l49Var, (Object) function3, yjeVar, (byte) 2);
                        fetVar.o0(objP4);
                    } else {
                        kwjVar = kwjVarB;
                    }
                    m0x0.t(fetVar, i49Var, (Function2) objP4);
                    mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), 0, false, 3);
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, shdVar4);
                    jpm0.o(fetVar, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC0, shdVar);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarO2 = ny9.O(1.7777778f, o7k0.d(s5x0.K(jm40Var, qmk.a(fetVar).c, 8.0f), 1.0f), false);
                    boolean zG5 = fetVar.g(l49Var);
                    Object objP5 = fetVar.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new d38(l49Var, (byte) 16);
                        fetVar.o0(objP5);
                    }
                    Function1 function4 = (Function1) objP5;
                    ugd ugdVarM = u1c.M(-778672471, new n82(l49Var, nekVar, xakVar, (byte) 6), fetVar);
                    kwj kwjVar2 = kwjVar;
                    z = false;
                    q5x.e(kwjVar2, mm40VarO2, null, null, 0, 8.0f, null, null, false, function4, null, null, null, ugdVarM, fetVar, 100663296, 24576, 15068);
                    if (j49Var.e) {
                        fetVar.e0(-811969185);
                        mm40 mm40VarE = o7k0.u(s5x0.N(s5x0.L(jm40Var, qmk.a(fetVar).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0.0f, 448.0f, 1).e(new wkw(gqw0.n));
                        dxh0 dxh0Var = j49Var.f;
                        a4x a4xVar = j49Var.g;
                        boolean zG6 = fetVar.g(kwjVar2);
                        Object objP6 = fetVar.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new s39(kwjVar2, (byte) 0);
                            fetVar.o0(objP6);
                        }
                        Function0 function0 = (Function0) objP6;
                        boolean zG7 = fetVar.g(function2) | fetVar.g(l49Var);
                        Object objP7 = fetVar.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new op7(function2, l49Var, (byte) 17);
                            fetVar.o0(objP7);
                        }
                        ibc.n(mm40VarE, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP7, fetVar, 384, 16);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar;
                        fetVar.e0(-810910566);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    fetVar.r(false);
                }
                fetVar.r(z);
            } else {
                fetVar.e0(114579437);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                boolean zG8 = fetVar.g(function1);
                Object objP8 = fetVar.P();
                if (zG8 || objP8 == cl5Var) {
                    objP8 = new x6s(function1, b);
                    fetVar.o0(objP8);
                }
                Function2 function5 = (Function2) objP8;
                l7m0Var.getClass();
                function5.getClass();
                Object[] objArr = new Object[0];
                boolean zG9 = fetVar.g(l7m0Var);
                Object objP9 = fetVar.P();
                if (zG9 || objP9 == cl5Var) {
                    objP9 = new zwp(l7m0Var, (byte) 12);
                    fetVar.o0(objP9);
                }
                obc.d(kr00.f18743a.a(Boolean.valueOf(((pjs) l7m0Var.getValue()).h)), u1c.M(-28496451, new hpr(jm40Var, v3c.Y(objArr, (Function0) objP9, fetVar), function5, b), fetVar), fetVar, 56);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(s5x0.L(jm40Var, qmk.a(fetVar).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                e0k0 e0k0Var = ((pjs) l7m0Var.getValue()).f;
                boolean zG10 = fetVar.g(function1);
                Object objP10 = fetVar.P();
                if (zG10 || objP10 == cl5Var) {
                    objP10 = new baq(function1, (byte) 18);
                    fetVar.o0(objP10);
                }
                fww.n(mm40VarN, e0k0Var, (Function1) objP10, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x02aa  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        d9z d9zVar;
        xcz xczVar;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        byte b = this.f10700a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.e;
        Object obj6 = this.b;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                ugd ugdVar = (ugd) obj8;
                ugd ugdVar2 = (ugd) obj7;
                pz40 pz40Var = (pz40) obj6;
                agk0 agk0Var = (agk0) obj5;
                xn4 xn4Var = (xn4) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                xn4Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= fetVar.e(xn4Var.ordinal()) ? 32 : 16;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                    int iOrdinal = xn4Var.ordinal();
                    if (iOrdinal == 0) {
                        fetVar.e0(403949156);
                        n0q n0qVar = o7k0.c;
                        tj30 tj30VarC = zq8.c(gqw0.b, false);
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
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        boolean zG = fetVar.g(pz40Var);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            z = true;
                            objP = new ys3(pz40Var, agk0Var, true ? 1 : 0);
                            fetVar.o0(objP);
                        } else {
                            z = true;
                        }
                        ugdVar2.j(mm40VarD, (Function1) objP, fetVar, 6);
                        fetVar.r(z);
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(403947241, fetVar, false);
                        }
                        fetVar.e0(403966501);
                        ugdVar.F(o7k0.c, fetVar, 6);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                xno0 xno0Var = (xno0) obj8;
                kwj kwjVar = (kwj) obj7;
                pz40 pz40Var2 = (pz40) obj6;
                Function1 function1 = (Function1) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar2.e(iIntValue2) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    List list = (List) CollectionsKt.W(iIntValue2, xno0Var.e);
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    d9z d9zVarA = f9z.a(fetVar2);
                    Object objP2 = fetVar2.P();
                    Object obj9 = objP2;
                    if (objP2 == cl5Var) {
                        zbk zbkVarB = jgk0.b(new md0(d9zVarA, (byte) 22));
                        fetVar2.o0(zbkVarB);
                        obj9 = zbkVarB;
                    }
                    l7m0 l7m0Var = (l7m0) obj9;
                    Boolean boolValueOf = Boolean.valueOf(xno0Var.c);
                    boolean zG2 = fetVar2.g(kwjVar) | ((iIntValue3 & 112) == 32) | fetVar2.g(pz40Var2) | fetVar2.g(xno0Var) | fetVar2.g(d9zVarA) | fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG2 || objP3 == cl5Var) {
                        d9zVar = d9zVarA;
                        objP3 = new kno0(kwjVar, iIntValue2, pz40Var2, xno0Var, l7m0Var, d9zVar, function1, null, (byte) 0);
                        fetVar2.o0(objP3);
                    } else {
                        d9zVar = d9zVarA;
                    }
                    m0x0.t(fetVar2, boolValueOf, (Function2) objP3);
                    mm40 mm40VarE0 = o2e.e0(o7k0.c, "MENU_LAZY_GRID" + ((s4i) xno0Var.f41179a.get(iIntValue2)).f31606a);
                    ngv ngvVar = new ngv(2);
                    float f = xfn.a(fetVar2).d;
                    float f2 = xfn.a(fetVar2).d;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(f, 8.0f, f2, 24.0f, fetVar2);
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                    boolean zI = fetVar2.i(list) | fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    Object obj10 = objP4;
                    if (zI || objP4 == cl5Var) {
                        rb rbVar = new rb(list, function1, (byte) 13);
                        fetVar2.o0(rbVar);
                        obj10 = rbVar;
                    }
                    g8x.i(ngvVar, mm40VarE0, d9zVar, ch80VarF, qw3Var, qw3Var2, null, false, null, (Function1) obj10, fetVar2, 0, 912);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                yno0 yno0Var = (yno0) obj8;
                kwj kwjVar2 = (kwj) obj7;
                pz40 pz40Var3 = (pz40) obj6;
                Function1 function2 = (Function1) obj5;
                int iIntValue4 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar3.e(iIntValue4) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    List list2 = (List) CollectionsKt.W(iIntValue4, yno0Var.e);
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                    Object objP5 = fetVar3.P();
                    Object obj11 = objP5;
                    if (objP5 == cl5Var) {
                        zbk zbkVarB2 = jgk0.b(new gg90(xczVarA, (byte) 19));
                        fetVar3.o0(zbkVarB2);
                        obj11 = zbkVarB2;
                    }
                    l7m0 l7m0Var2 = (l7m0) obj11;
                    Boolean boolValueOf2 = Boolean.valueOf(yno0Var.c);
                    boolean zG3 = fetVar3.g(kwjVar2) | ((iIntValue5 & 112) == 32) | fetVar3.g(pz40Var3) | fetVar3.g(yno0Var) | fetVar3.g(xczVarA) | fetVar3.g(function2);
                    Object objP6 = fetVar3.P();
                    if (zG3 || objP6 == cl5Var) {
                        xczVar = xczVarA;
                        objP6 = new kno0(kwjVar2, iIntValue4, pz40Var3, yno0Var, l7m0Var2, xczVar, function2, null, (byte) 1);
                        fetVar3.o0(objP6);
                    } else {
                        xczVar = xczVarA;
                    }
                    m0x0.t(fetVar3, boolValueOf2, (Function2) objP6);
                    mm40 mm40VarE1 = o2e.e0(o7k0.c, "MENU_LAZY_GRID" + ((s4i) yno0Var.f42950a.get(iIntValue4)).f31606a);
                    float f3 = xfn.a(fetVar3).d;
                    float f4 = xfn.a(fetVar3).d;
                    zcl zclVar2 = qmk.f28987a;
                    ch80 ch80VarF2 = h97.f(f3, 8.0f, f4, 24.0f, fetVar3);
                    qw3 qw3Var3 = new qw3(8.0f, true, new jf4((byte) 14));
                    boolean zI2 = fetVar3.i(list2) | fetVar3.g(function2);
                    Object objP7 = fetVar3.P();
                    Object obj12 = objP7;
                    if (zI2 || objP7 == cl5Var) {
                        rb rbVar2 = new rb(list2, function2, (byte) 14);
                        fetVar3.o0(rbVar2);
                        obj12 = rbVar2;
                    }
                    b8k0.e(mm40VarE1, xczVar, ch80VarF2, qw3Var3, null, null, false, null, (Function1) obj12, fetVar3, 0, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                l7m0 l7m0Var3 = (l7m0) obj8;
                wpq wpqVar = (wpq) obj7;
                pkk0 pkk0Var = (pkk0) obj6;
                cj4 cj4Var = (cj4) obj5;
                mm40 mm40Var = (mm40) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                gfk0 gfk0Var = cj4.U1;
                ((ir8) obj).getClass();
                mm40Var.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar4.g(mm40Var) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    imm immVar = (imm) l7m0Var3.getValue();
                    boolean zI3 = fetVar4.i(wpqVar) | fetVar4.g(pkk0Var) | fetVar4.i(cj4Var);
                    Object objP8 = fetVar4.P();
                    if (zI3 || objP8 == cl5Var) {
                        objP8 = new zi4(wpqVar, pkk0Var, cj4Var, (byte) 1);
                        fetVar4.o0(objP8);
                    }
                    hlm.c(mm40Var, immVar, null, (Function0) objP8, null, null, null, null, null, null, null, null, fetVar4, (iIntValue6 >> 3) & 14, 0, 4084);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ija ijaVar = (ija) obj8;
                Function1 function3 = (Function1) obj7;
                Function1 function4 = (Function1) obj5;
                pz40 pz40Var4 = (pz40) obj6;
                y5d y5dVar = (y5d) obj;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar5 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, y5dVar, mm40Var2);
                if ((iD & 6) == 0) {
                    i = iD | (fetVar5.g(y5dVar) ? 4 : 2);
                } else {
                    i = iD;
                }
                if ((iD & 48) == 0) {
                    i |= fetVar5.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar5.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar3 = qmk.f28987a;
                    qw3 qw3Var4 = new qw3(4.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN = s5x0.N(y5dVar.b(mm40Var2, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA = w5d.a(qw3Var4, gqw0.m, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarN);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                    q0x.g(0, fetVar5, ijaVar.f14864a.f10537a, dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), function3);
                    jcb.s(new wkw(gqw0.n), (imo) pz40Var4.getValue(), function4, fetVar5, 0, 0);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                jja jjaVar = (jja) obj8;
                Function1 function5 = (Function1) obj7;
                Function1 function6 = (Function1) obj5;
                pz40 pz40Var5 = (pz40) obj6;
                y5d y5dVar2 = (y5d) obj;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar6 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, y5dVar2, mm40Var3);
                if ((iD2 & 6) == 0) {
                    i2 = iD2 | (fetVar6.g(y5dVar2) ? 4 : 2);
                } else {
                    i2 = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar6.U(i2 & 1, (i2 & 147) != 146)) {
                    zcl zclVar4 = qmk.f28987a;
                    qw3 qw3Var5 = new qw3(4.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN2 = s5x0.N(y5dVar2.b(mm40Var3, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA2 = w5d.a(qw3Var5, gqw0.m, fetVar6, 0);
                    int iHashCode3 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM3 = fetVar6.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar6, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC2, gqw0.v);
                    s0x.a(0, fetVar6, jjaVar.f16611a.f14024a, dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), function5);
                    feb.t(new wkw(gqw0.n), (mmo) pz40Var5.getValue(), function6, fetVar6, 0, 0);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                final l7m0 l7m0Var4 = (l7m0) obj8;
                final Function2 function7 = (Function2) obj7;
                ioa ioaVar = (ioa) obj6;
                l7m0 l7m0Var5 = (l7m0) obj5;
                y5d y5dVar3 = (y5d) obj;
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar7 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, y5dVar3, mm40Var4);
                if ((iD3 & 6) == 0) {
                    i3 = iD3 | (fetVar7.g(y5dVar3) ? 4 : 2);
                } else {
                    i3 = iD3;
                }
                if ((iD3 & 48) == 0) {
                    i3 |= fetVar7.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar7.U(i3 & 1, (i3 & 147) != 146)) {
                    zcl zclVar5 = qmk.f28987a;
                    qw3 qw3Var6 = new qw3(16.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN3 = s5x0.N(y5dVar3.b(mm40Var4, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    thg0 thg0VarA = shg0.a(qw3Var6, gqw0.j, fetVar7, 0);
                    int iHashCode4 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM4 = fetVar7.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar7, mm40VarN3);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, thg0VarA, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC3, gqw0.v);
                    final byte b2 = 0;
                    mm40 mm40VarO = ny9.O(1.2f, o7k0.c(jm40Var, 1.0f), false);
                    a4x a4xVar = (a4x) l7m0Var4.getValue();
                    boolean zG4 = fetVar7.g(function7);
                    Object objP9 = fetVar7.P();
                    if (zG4 || objP9 == cl5Var) {
                        objP9 = new Function1() { // from class: a.hoa
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                byte b3 = b2;
                                l7m0 l7m0Var6 = l7m0Var4;
                                Function2 function8 = function7;
                                Integer num = (Integer) obj13;
                                num.getClass();
                                switch (b3) {
                                    case 0:
                                        function8.invoke(num, l7m0Var6.getValue());
                                        break;
                                    default:
                                        function8.invoke(num, l7m0Var6.getValue());
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar7.o0(objP9);
                    }
                    y860.S(6, fetVar7, a4xVar, mm40VarO, (Function1) objP9);
                    m2x.k(0, fetVar7, (a4x) l7m0Var5.getValue(), null, ioaVar.f15108a);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                final l7m0 l7m0Var6 = (l7m0) obj8;
                final Function2 function8 = (Function2) obj7;
                joa joaVar = (joa) obj6;
                l7m0 l7m0Var7 = (l7m0) obj5;
                y5d y5dVar4 = (y5d) obj;
                mm40 mm40Var5 = (mm40) obj2;
                fet fetVar8 = (fet) obj3;
                int iD4 = dw9.d((Integer) obj4, y5dVar4, mm40Var5);
                if ((iD4 & 6) == 0) {
                    i4 = iD4 | (fetVar8.g(y5dVar4) ? 4 : 2);
                } else {
                    i4 = iD4;
                }
                if ((iD4 & 48) == 0) {
                    i4 |= fetVar8.g(mm40Var5) ? 32 : 16;
                }
                if (fetVar8.U(i4 & 1, (i4 & 147) != 146)) {
                    zcl zclVar6 = qmk.f28987a;
                    qw3 qw3Var7 = new qw3(16.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN4 = s5x0.N(y5dVar4.b(mm40Var5, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    thg0 thg0VarA2 = shg0.a(qw3Var7, gqw0.j, fetVar8, 0);
                    int iHashCode5 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM5 = fetVar8.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar8, mm40VarN4);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC4, gqw0.v);
                    mm40 mm40VarO2 = ny9.O(1.2f, o7k0.c(jm40Var, 1.0f), false);
                    a4x a4xVar2 = (a4x) l7m0Var6.getValue();
                    boolean zG5 = fetVar8.g(function8);
                    Object objP10 = fetVar8.P();
                    if (zG5 || objP10 == cl5Var) {
                        z2 = true;
                        final boolean z5 = true ? 1 : 0;
                        objP10 = new Function1() { // from class: a.hoa
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                byte b3 = z5;
                                l7m0 l7m0Var8 = l7m0Var6;
                                Function2 function9 = function8;
                                Integer num = (Integer) obj13;
                                num.getClass();
                                switch (b3) {
                                    case 0:
                                        function9.invoke(num, l7m0Var8.getValue());
                                        break;
                                    default:
                                        function9.invoke(num, l7m0Var8.getValue());
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar8.o0(objP10);
                    } else {
                        z2 = true;
                    }
                    ju70.F(6, fetVar8, a4xVar2, mm40VarO2, (Function1) objP10);
                    c3x.o(0, fetVar8, (a4x) l7m0Var7.getValue(), null, joaVar.f16848a);
                    fetVar8.r(z2);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                pz40 pz40Var6 = (pz40) obj6;
                pod podVar = (pod) obj8;
                Function2 function9 = (Function2) obj7;
                pz40 pz40Var7 = (pz40) obj5;
                mm40 mm40Var6 = (mm40) obj2;
                fet fetVar9 = (fet) obj3;
                int iD5 = dw9.d((Integer) obj4, (y5d) obj, mm40Var6);
                if ((iD5 & 48) == 0) {
                    iD5 |= fetVar9.g(mm40Var6) ? 32 : 16;
                }
                if (fetVar9.U(iD5 & 1, (iD5 & 145) != 144)) {
                    obc.e(new l5d0[]{afp0.f790a.a(w6n.h), dgp0.b.a(gqw0.d), dw9.k(5, dgp0.c)}, u1c.M(1748454552, new ba00((Object) mm40Var6, (Object) pz40Var6, (Object) podVar, (Object) function9, (Object) pz40Var7, (byte) 23), fetVar9), fetVar9, 48);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                hdz hdzVar = (hdz) obj8;
                l4b l4bVar = (l4b) obj7;
                txx txxVar = (txx) obj6;
                Function1 function10 = (Function1) obj5;
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar10.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar10.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    vk5 vk5Var = (vk5) hdzVar.b(iIntValue7);
                    if (vk5Var instanceof ogs0) {
                        fetVar10.e0(-1135274409);
                        l4b l4bVar2 = l4b.ALL;
                        if (l4bVar != l4bVar2) {
                            cl5 cl5Var2 = l4b.b;
                            int i6 = ((ogs0) vk5Var).i;
                            cl5Var2.getClass();
                            if (i6 == 1) {
                                l4bVar2 = l4b.DOWNWARD;
                            } else if (i6 == 2) {
                                l4bVar2 = l4b.UPWARD;
                            } else if (i6 == 3) {
                                l4bVar2 = l4b.CLOSED;
                            } else if (i6 == 4) {
                                l4bVar2 = l4b.PROVISIONAL;
                            }
                            if (l4bVar2 != l4bVar) {
                                fetVar10.e0(-1135009948);
                                txx txxVarD = hdzVar.d();
                                z2 z2Var = new z2(txxVarD, txxVarD.b());
                                while (z2Var.hasPrevious()) {
                                    vk5 vk5Var2 = (vk5) z2Var.previous();
                                    if (vk5Var2 instanceof ogs0) {
                                        if (iIntValue7 >= hdzVar.d().lastIndexOf(vk5Var2)) {
                                            fetVar10.e0(-1134721586);
                                            egm0.c(0.0f, fetVar10, 0, 1);
                                            fetVar10.r(false);
                                        } else {
                                            fetVar10.e0(-1134641823);
                                            fetVar10.r(false);
                                        }
                                        fetVar10.r(false);
                                        fetVar10.r(false);
                                        return Unit.f46060a;
                                    }
                                }
                                v4i0.o("List contains no element matching the predicate.");
                                return null;
                            }
                        }
                        fetVar10.e0(-1134582303);
                        fetVar10.r(false);
                        txxVar.getClass();
                        y2 y2Var = new y2(txxVar, (byte) 0);
                        int i7 = 0;
                        while (true) {
                            i5 = -1;
                            if (!y2Var.hasNext()) {
                                i7 = -1;
                            } else if (!(((vk5) y2Var.next()) instanceof ogs0)) {
                                i7++;
                            }
                        }
                        z2 z2Var2 = new z2(txxVar, txxVar.b());
                        while (z2Var2.hasPrevious()) {
                            if (((vk5) z2Var2.previous()) instanceof ogs0) {
                                i5 = z2Var2.b;
                                if (i7 == iIntValue7) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i5 == iIntValue7) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                dtb.a(null, (ogs0) vk5Var, z3, z4, fetVar10, 0, 1);
                                fetVar10.r(false);
                            }
                        }
                        if (i7 == iIntValue7) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i5 == iIntValue7) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        dtb.a(null, (ogs0) vk5Var, z3, z4, fetVar10, 0, 1);
                        fetVar10.r(false);
                    } else if (Intrinsics.d(vk5Var, ues0.f35545a)) {
                        fetVar10.e0(-1976246692);
                        egm0.c(0.0f, fetVar10, 0, 1);
                        fetVar10.r(false);
                    } else if (Intrinsics.d(vk5Var, gxn.f12084a)) {
                        fetVar10.e0(-1133975881);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar7 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(mm40VarD2, 0.0f, 24.0f, 1);
                        Object objP11 = fetVar10.P();
                        if (objP11 == cl5Var) {
                            objP11 = new rnp((byte) 25);
                            fetVar10.o0(objP11);
                        }
                        Function1 function11 = (Function1) objP11;
                        boolean zG6 = fetVar10.g(function10) | fetVar10.i(hdzVar);
                        Object objP12 = fetVar10.P();
                        if (zG6 || objP12 == cl5Var) {
                            objP12 = new dbr(function10, hdzVar, false ? (byte) 1 : (byte) 0);
                            fetVar10.o0(objP12);
                        }
                        dwi0.b(function11, mm40VarL, (Function1) objP12, fetVar10, 6, 0);
                        fetVar10.r(false);
                    } else if (vk5Var == null) {
                        fetVar10.e0(-1976209051);
                        fetVar10.r(false);
                    } else {
                        fetVar10.e0(-1976208123);
                        fetVar10.r(false);
                    }
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                return a(obj, obj2, obj3, obj4);
            case 11:
                k6z k6zVar = (k6z) obj8;
                bb00 bb00Var = (bb00) obj7;
                ppj0 ppj0Var = (ppj0) obj6;
                Function1 function12 = (Function1) obj5;
                int iIntValue9 = ((Integer) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar11.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    obc.d(bmd.n.a(k6zVar), u1c.M(2097625566, new ca00(bb00Var, iIntValue9, ppj0Var, function12), fetVar11), fetVar11, 56);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 12:
                oms0 oms0Var = (oms0) obj8;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj7;
                mie0 mie0Var = (mie0) obj6;
                Map map = (Map) obj5;
                Object obj13 = (b53) obj;
                y1h0 y1h0Var = (y1h0) obj2;
                fet fetVar12 = (fet) obj3;
                ((Integer) obj4).getClass();
                wjd wjdVarV = r8x.V((Intrinsics.d(oms0Var.f25519a.y0(), ((hgk0) oms0Var.d).getValue()) && snapshotStateList.isEmpty()) ? lkz.e : lkz.d, fetVar12, 2);
                Object objP13 = fetVar12.P();
                if (objP13 == cl5Var) {
                    fetVar12.o0(obj13);
                } else {
                    obj13 = objP13;
                }
                mie0Var.f21842a = (b53) obj13;
                l5d0 l5d0VarA = or00.f25714a.a(wjdVarV);
                zfn zfnVar = pr00.f27441a;
                Object obj14 = mie0Var.f21842a;
                if (obj14 != null) {
                    obc.e(new l5d0[]{l5d0VarA, zfnVar.a((b53) obj14), loj0.f20394a.a(y1h0Var), g2h0.f10557a.a(xp20.d(map, new h63(y1h0Var)))}, u1c.M(-1734941436, new pi40(y1h0Var, (byte) 13), fetVar12), fetVar12, 56);
                    return Unit.f46060a;
                }
                Intrinsics.h("animatedContentScope");
                throw null;
            default:
                ftp0 ftp0Var = (ftp0) obj8;
                k6z k6zVar2 = (k6z) obj7;
                Map map2 = (Map) obj6;
                Function1 function13 = (Function1) obj5;
                int iIntValue11 = ((Integer) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= fetVar13.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    obc.d(bmd.n.a(k6zVar2), u1c.M(100170739, new ku90((a4x) ftp0Var.c.get(iIntValue11), map2, iIntValue11, ftp0Var, function13), fetVar13), fetVar13, 56);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g54(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f10700a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ g54(Object obj, Function1 function1, Function1 function2, pz40 pz40Var, byte b) {
        this.f10700a = b;
        this.c = obj;
        this.d = function1;
        this.e = function2;
        this.b = pz40Var;
    }
}
