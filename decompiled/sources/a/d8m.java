package a;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d8m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5656a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d8m(whm whmVar, Function1 function1, l7m0 l7m0Var) {
        this.f5656a = (byte) 8;
        this.b = whmVar;
        this.d = function1;
        this.c = l7m0Var;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        thb.j((mm40) this.b, (yhm0) this.c, (Function1) this.d, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ckb.n((mm40) this.b, (eim0) this.c, (Function1) this.d, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        gkb.m((mm40) this.b, (kim0) this.c, (Function1) this.d, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) this.b;
        List list = (List) this.c;
        sso0 sso0Var = (sso0) this.d;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j6n.h((String) list.get(((Number) it.next()).intValue()), sso0Var, null, 0, 0, fetVar, 0, 28);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        c8n c8nVar = (c8n) this.b;
        mm40 mm40Var = (mm40) this.c;
        Function0 function0 = (Function0) this.d;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            r7n r7nVar = c8nVar.f3922a;
            w7n w7nVar = c8nVar.b;
            int iOrdinal = r7nVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(551923156);
                v7n.b(mm40Var, w7nVar, c8nVar.f3922a == r7n.b || w7nVar.b > 5999000, function0, fetVar, 0);
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(551910363, fetVar, false);
                }
                fetVar.e0(-70589773);
                v7n.a(mm40Var, w7nVar, w7nVar.e, function0, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        pzb.x((mm40) this.b, (fan) this.c, (fan) this.d, (fet) obj, x8x.L(7));
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        pzb.q((mm40) this.b, (ian) this.c, (Function2) this.d, (fet) obj, x8x.L(7));
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        qzb.s((mm40) this.b, (lan) this.c, (Function1) this.d, (fet) obj, x8x.L(7));
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        f1t0.i((mm40) this.b, (mt90) this.c, (m0x) this.d, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2) {
        htr htrVar = (htr) this.b;
        Function2 function2 = (Function2) this.c;
        Function1 function1 = (Function1) this.d;
        i8z i8zVar = (i8z) obj;
        ((Integer) obj2).getClass();
        i8zVar.getClass();
        uzb.T(i8zVar, htrVar, function2, function1, null);
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        xbc.p((mm40) this.b, (jln) this.c, (Function1) this.d, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long jM123getWhite0d7_KjU;
        long jM73getBlack400d7_KjU;
        boolean z6;
        long jM123getWhite0d7_KjU2;
        long jM73getBlack400d7_KjU2;
        long jM123getWhite0d7_KjU3;
        long jM73getBlack400d7_KjU3;
        boolean z7;
        long jM123getWhite0d7_KjU4;
        long jM73getBlack400d7_KjU4;
        long jM123getWhite0d7_KjU5;
        long jM73getBlack400d7_KjU5;
        boolean z8;
        long jM123getWhite0d7_KjU6;
        long jM73getBlack400d7_KjU6;
        lh80 lh80VarU;
        byte b = this.f5656a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        boolean z10 = false;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ozb.s((uzb) obj5, (e8m) obj4, (Function1) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ibc.e((mm40) obj5, (jam) obj4, (p9m) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                plc.c((mm40) obj5, (fdm) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ieb.p((mm40) obj5, (xgm) obj4, (jgm) obj3, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 4:
                uhm uhmVar = (uhm) obj5;
                sd sdVar = (sd) obj4;
                Function0 function0 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ee eeVar = uhmVar.g;
                    if (function0 == null) {
                        fetVar.e0(-1240984406);
                        Object objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 1);
                            fetVar.o0(objP);
                        }
                        function0 = (Function0) objP;
                        z = false;
                    } else {
                        z = false;
                        fetVar.e0(-1009863638);
                    }
                    fetVar.r(z);
                    jcb.f(mm40VarN, eeVar, sdVar, false, null, function0, fetVar, 3072, 16);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 5:
                vhm vhmVar = (vhm) obj5;
                sd sdVar2 = (sd) obj4;
                Function0 function1 = (Function0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ee eeVar2 = vhmVar.g;
                    if (function1 == null) {
                        fetVar2.e0(7861036);
                        Object objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 2);
                            fetVar2.o0(objP2);
                        }
                        function1 = (Function0) objP2;
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar2.e0(277347688);
                    }
                    fetVar2.r(z2);
                    jcb.f(mm40VarN2, eeVar2, sdVar2, false, null, function1, fetVar2, 3072, 16);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 6:
                xhm xhmVar = (xhm) obj5;
                sd sdVar3 = (sd) obj4;
                Function0 function2 = (Function0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(jm40.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ee eeVar3 = xhmVar.c;
                    if (function2 == null) {
                        fetVar3.e0(-790926132);
                        Object objP3 = fetVar3.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 3);
                            fetVar3.o0(objP3);
                        }
                        function2 = (Function0) objP3;
                        z3 = false;
                    } else {
                        z3 = false;
                        fetVar3.e0(251580360);
                    }
                    fetVar3.r(z3);
                    jcb.f(mm40VarN3, eeVar3, sdVar3, false, null, function2, fetVar3, 3072, 16);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                zjb.i((xhm) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                whm whmVar = (whm) obj5;
                Function1 function3 = (Function1) obj3;
                l7m0 l7m0Var = (l7m0) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN4 = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 16.0f, 5);
                    Object objP4 = fetVar4.P();
                    if (objP4 == cl5Var) {
                        objP4 = new x1d(l7m0Var, (byte) 22);
                        fetVar4.o0(objP4);
                    }
                    bkb.x(i4w0.T(mm40VarN4, (Function1) objP4), whmVar.m, whmVar.n, function3, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ntb.p((j240) obj5, (Function1) obj3, (mm40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                Function2 function4 = (Function2) obj5;
                imm immVar = (imm) obj4;
                Function0 function5 = (Function0) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar5.X();
                } else if (function4 != null) {
                    fetVar5.e0(-2019322474);
                    function4.invoke(fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(-2019253406);
                    if (!Intrinsics.d(immVar.f15032a, klm.f18497a)) {
                        fetVar5.e0(-2019157740);
                        llm llmVar = immVar.f15032a;
                        if (llmVar != null) {
                            if (llmVar instanceof klm) {
                                fetVar5.e0(617901054);
                                z4 = false;
                                fetVar5.r(false);
                            } else if (llmVar instanceof ilm) {
                                fetVar5.e0(1975126484);
                                hlm.d(o2e.e0(jm40Var, "ICON_LEFT"), ((StaticColors) fetVar5.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ilm) llmVar).f14986a, function5, fetVar5, 0);
                                z4 = false;
                                fetVar5.r(false);
                            } else if (llmVar instanceof jlm) {
                                fetVar5.e0(1975460974);
                                mm40 mm40VarE0 = o2e.e0(jm40Var, "ICON_LEFT");
                                zfn zfnVar = m8m0.f21378a;
                                hlm.d(mm40VarE0, ((StaticColors) fetVar5.k(zfnVar)).m73getBlack400d7_KjU(), ((StaticColors) fetVar5.k(zfnVar)).m123getWhite0d7_KjU(), function5, fetVar5, 0);
                                z4 = false;
                                fetVar5.r(false);
                            }
                            fetVar5.r(z4);
                        }
                        throw b1j.f(617899777, fetVar5, false);
                    }
                    z4 = false;
                    fetVar5.e0(-2018949203);
                    fetVar5.r(false);
                    fetVar5.r(z4);
                }
                return Unit.f46060a;
            case 11:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                Function2 function6 = (Function2) obj5;
                imm immVar2 = (imm) obj4;
                final Function1 function7 = (Function1) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fetVar6.X();
                } else if (function6 != null) {
                    fetVar6.e0(907954583);
                    function6.invoke(fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(908024550);
                    if (!Intrinsics.d(immVar2.c, fmm.f9790a)) {
                        fetVar6.e0(908122138);
                        gmm gmmVar = immVar2.c;
                        lw3 lw3Var = uc9.f35418a;
                        yx7 yx7Var = gqw0.j;
                        if (gmmVar != null) {
                            if (gmmVar instanceof fmm) {
                                fetVar6.e0(-777945669);
                                fetVar6.r(false);
                            } else {
                                boolean z11 = gmmVar instanceof dmm;
                                jm40 jm40Var2 = jm40.b;
                                if (z11) {
                                    fetVar6.e0(1653558192);
                                    final wa50 wa50Var = ((dmm) gmmVar).f6327a;
                                    if (wa50Var instanceof ta50) {
                                        fetVar6.e0(-1726904125);
                                        Resources resources = ((Context) fetVar6.k(dy2.b)).getResources();
                                        wkm wkmVar = ((ta50) wa50Var).f33599a;
                                        int i = wkmVar.b;
                                        long j = wkmVar.e;
                                        long jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                                        sa50 sa50Var = wkmVar.d;
                                        boolean z12 = wkmVar.c;
                                        boolean zG = fetVar6.g(function7) | fetVar6.g(wa50Var);
                                        Object objP5 = fetVar6.P();
                                        if (zG || objP5 == cl5Var) {
                                            final byte b2 = false ? (byte) 1 : (byte) 0;
                                            objP5 = new Function0() { // from class: a.alm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b3 = b2;
                                                    wa50 wa50Var2 = wa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b3) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ta50) wa50Var2).f33599a.f39313a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).f37070a.f39313a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).f35315a.f39313a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).c.f39313a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP5);
                                        }
                                        hlm.e(o2e.e0(epv0.N(y860.W(jm40Var2, null, null, z12, null, (Function0) objP5, 24), wkmVar.c ? 1.0f : 0.5f), "ICON_RIGHT" + resources.getResourceEntryName(wkmVar.b)), i, jM121getTransparent0d7_KjU, j, sa50Var, fetVar6, 0);
                                        fetVar6 = fetVar6;
                                        fetVar6.r(false);
                                    } else if (wa50Var instanceof va50) {
                                        fetVar6.e0(-1725959803);
                                        Resources resources2 = ((Context) fetVar6.k(dy2.b)).getResources();
                                        mm40 mm40VarE1 = o2e.e0(jm40Var2, "NavBarRightIconsGroupTestTag");
                                        thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar6, 0);
                                        int iHashCode = Long.hashCode(fetVar6.T);
                                        bh90 bh90VarM = fetVar6.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarE1);
                                        mkd.c0.getClass();
                                        fetVar6.i0();
                                        if (fetVar6.S) {
                                            fetVar6.l(pcyVar);
                                        } else {
                                            fetVar6.r0();
                                        }
                                        jpm0.o(fetVar6, thg0VarA, shdVar4);
                                        jpm0.o(fetVar6, bh90VarM, shdVar3);
                                        vqd.u(iHashCode, fetVar6, shdVar2, fetVar6);
                                        jpm0.o(fetVar6, mm40VarC0, shdVar);
                                        va50 va50Var = (va50) wa50Var;
                                        wkm wkmVar2 = va50Var.b;
                                        wkm wkmVar3 = va50Var.f37070a;
                                        boolean z13 = wkmVar3.c;
                                        boolean zG2 = fetVar6.g(function7) | fetVar6.g(wa50Var);
                                        Object objP6 = fetVar6.P();
                                        if (zG2 || objP6 == cl5Var) {
                                            final byte b3 = 1;
                                            objP6 = new Function0() { // from class: a.alm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b4 = b3;
                                                    wa50 wa50Var2 = wa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b4) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ta50) wa50Var2).f33599a.f39313a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).f37070a.f39313a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).f35315a.f39313a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).c.f39313a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP6);
                                        }
                                        mm40 mm40VarE2 = o2e.e0(epv0.N(y860.W(jm40Var2, null, null, z13, null, (Function0) objP6, 24), wkmVar3.c ? 1.0f : 0.5f), "ICON_RIGHT" + resources2.getResourceEntryName(wkmVar3.b));
                                        int i2 = wkmVar3.b;
                                        long j2 = wkmVar3.e;
                                        zfn zfnVar2 = m8m0.f21378a;
                                        hlm.e(mm40VarE2, i2, ((StaticColors) fetVar6.k(zfnVar2)).m121getTransparent0d7_KjU(), j2, wkmVar3.d, fetVar6, 0);
                                        boolean z14 = wkmVar2.c;
                                        boolean zG3 = fetVar6.g(function7) | fetVar6.g(wa50Var);
                                        Object objP7 = fetVar6.P();
                                        if (zG3 || objP7 == cl5Var) {
                                            final byte b4 = 2;
                                            objP7 = new Function0() { // from class: a.alm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b5 = b4;
                                                    wa50 wa50Var2 = wa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b5) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ta50) wa50Var2).f33599a.f39313a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).f37070a.f39313a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).f35315a.f39313a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).c.f39313a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP7);
                                        }
                                        hlm.e(o2e.e0(epv0.N(y860.W(jm40Var2, null, null, z14, null, (Function0) objP7, 24), wkmVar2.c ? 1.0f : 0.5f), "ICON_RIGHT" + resources2.getResourceEntryName(wkmVar2.b)), wkmVar2.b, ((StaticColors) fetVar6.k(zfnVar2)).m121getTransparent0d7_KjU(), wkmVar2.e, wkmVar2.d, fetVar6, 0);
                                        fetVar6 = fetVar6;
                                        fetVar6.r(true);
                                        z9 = false;
                                        fetVar6.r(false);
                                    } else {
                                        if (!(wa50Var instanceof ua50)) {
                                            throw b1j.f(-332798231, fetVar6, false);
                                        }
                                        fetVar6.e0(-1723912377);
                                        Resources resources3 = ((Context) fetVar6.k(dy2.b)).getResources();
                                        thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar6, 0);
                                        int iHashCode2 = Long.hashCode(fetVar6.T);
                                        bh90 bh90VarM2 = fetVar6.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar6, jm40Var2);
                                        mkd.c0.getClass();
                                        fetVar6.i0();
                                        if (fetVar6.S) {
                                            fetVar6.l(pcyVar);
                                        } else {
                                            fetVar6.r0();
                                        }
                                        jpm0.o(fetVar6, thg0VarA2, shdVar4);
                                        jpm0.o(fetVar6, bh90VarM2, shdVar3);
                                        vqd.u(iHashCode2, fetVar6, shdVar2, fetVar6);
                                        jpm0.o(fetVar6, mm40VarC1, shdVar);
                                        ua50 ua50Var = (ua50) wa50Var;
                                        wkm wkmVar4 = ua50Var.c;
                                        wkm wkmVar5 = ua50Var.b;
                                        wkm wkmVar6 = ua50Var.f35315a;
                                        boolean z15 = wkmVar6.c;
                                        boolean zG4 = fetVar6.g(function7) | fetVar6.g(wa50Var);
                                        Object objP8 = fetVar6.P();
                                        if (zG4 || objP8 == cl5Var) {
                                            final byte b5 = 3;
                                            objP8 = new Function0() { // from class: a.alm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b6 = b5;
                                                    wa50 wa50Var2 = wa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b6) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ta50) wa50Var2).f33599a.f39313a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).f37070a.f39313a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).f35315a.f39313a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).c.f39313a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP8);
                                        }
                                        mm40 mm40VarE3 = o2e.e0(epv0.N(y860.W(jm40Var2, null, null, z15, null, (Function0) objP8, 24), wkmVar6.c ? 1.0f : 0.5f), "ICON_RIGHT" + resources3.getResourceEntryName(wkmVar6.b));
                                        int i3 = wkmVar6.b;
                                        long j3 = wkmVar6.e;
                                        zfn zfnVar3 = m8m0.f21378a;
                                        hlm.e(mm40VarE3, i3, ((StaticColors) fetVar6.k(zfnVar3)).m121getTransparent0d7_KjU(), j3, wkmVar6.d, fetVar6, 0);
                                        boolean z16 = wkmVar5.c;
                                        boolean zG5 = fetVar6.g(function7) | fetVar6.g(wa50Var);
                                        Object objP9 = fetVar6.P();
                                        if (zG5 || objP9 == cl5Var) {
                                            final byte b6 = 4;
                                            objP9 = new Function0() { // from class: a.alm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b7 = b6;
                                                    wa50 wa50Var2 = wa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b7) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ta50) wa50Var2).f33599a.f39313a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).f37070a.f39313a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).f35315a.f39313a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).c.f39313a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP9);
                                        }
                                        hlm.e(o2e.e0(epv0.N(y860.W(jm40Var2, null, null, z16, null, (Function0) objP9, 24), wkmVar5.c ? 1.0f : 0.5f), "ICON_RIGHT" + resources3.getResourceEntryName(wkmVar5.b)), wkmVar5.b, ((StaticColors) fetVar6.k(zfnVar3)).m121getTransparent0d7_KjU(), wkmVar5.e, wkmVar5.d, fetVar6, 0);
                                        boolean z17 = wkmVar4.c;
                                        boolean zG6 = fetVar6.g(function7) | fetVar6.g(wa50Var);
                                        Object objP10 = fetVar6.P();
                                        if (zG6 || objP10 == cl5Var) {
                                            final byte b7 = 5;
                                            objP10 = new Function0() { // from class: a.alm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b8 = b7;
                                                    wa50 wa50Var2 = wa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b8) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ta50) wa50Var2).f33599a.f39313a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).f37070a.f39313a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((va50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).f35315a.f39313a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).b.f39313a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ua50) wa50Var2).c.f39313a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP10);
                                        }
                                        hlm.e(o2e.e0(epv0.N(y860.W(jm40Var2, null, null, z17, null, (Function0) objP10, 24), wkmVar4.c ? 1.0f : 0.5f), "ICON_RIGHT" + resources3.getResourceEntryName(wkmVar4.b)), wkmVar4.b, ((StaticColors) fetVar6.k(zfnVar3)).m121getTransparent0d7_KjU(), wkmVar4.e, wkmVar4.d, fetVar6, 0);
                                        fetVar6 = fetVar6;
                                        fetVar6.r(true);
                                        z9 = false;
                                        fetVar6.r(false);
                                    }
                                    fetVar6.r(z9);
                                } else if (gmmVar instanceof emm) {
                                    fetVar6.e0(1653793606);
                                    final oa50 oa50Var = ((emm) gmmVar).f8053a;
                                    boolean z18 = oa50Var instanceof la50;
                                    ra50 ra50Var = ra50.f30118a;
                                    if (z18) {
                                        fetVar6.e0(1754622704);
                                        skm skmVar = ((la50) oa50Var).f19691a;
                                        int i4 = skmVar.b;
                                        y3d y3dVar = skmVar.e;
                                        if (y3dVar == null) {
                                            fetVar6.e0(1857720193);
                                            jM123getWhite0d7_KjU6 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                            z8 = false;
                                            fetVar6.r(false);
                                        } else {
                                            z8 = false;
                                            fetVar6.e0(1857718364);
                                            fetVar6.r(false);
                                            jM123getWhite0d7_KjU6 = y3dVar.f41946a;
                                        }
                                        y3d y3dVar2 = skmVar.f;
                                        if (y3dVar2 == null) {
                                            fetVar6.e0(1857723555);
                                            jM73getBlack400d7_KjU6 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                                            fetVar6.r(z8);
                                        } else {
                                            fetVar6.e0(1857721540);
                                            fetVar6.r(z8);
                                            jM73getBlack400d7_KjU6 = y3dVar2.f41946a;
                                        }
                                        boolean z19 = skmVar.c;
                                        boolean zG7 = fetVar6.g(function7) | fetVar6.g(oa50Var);
                                        Object objP11 = fetVar6.P();
                                        if (zG7 || objP11 == cl5Var) {
                                            final byte b8 = 5;
                                            objP11 = new Function0() { // from class: a.ykm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b9 = b8;
                                                    oa50 oa50Var2 = oa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b9) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).f23174a.f32357a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).f21444a.f32357a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).c.f32357a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((la50) oa50Var2).f19691a.f32357a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP11);
                                        }
                                        hlm.e(epv0.N(y860.W(jm40Var2, null, null, z19, null, (Function0) objP11, 24), skmVar.c ? 1.0f : 0.5f), i4, jM73getBlack400d7_KjU6, jM123getWhite0d7_KjU6, ra50Var, fetVar6, 0);
                                        fetVar6 = fetVar6;
                                        z9 = false;
                                        fetVar6.r(false);
                                    } else if (oa50Var instanceof na50) {
                                        fetVar6.e0(1755473251);
                                        thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var, fetVar6, 0);
                                        int iHashCode3 = Long.hashCode(fetVar6.T);
                                        bh90 bh90VarM3 = fetVar6.m();
                                        mm40 mm40VarC2 = kbc.c0(fetVar6, jm40Var2);
                                        mkd.c0.getClass();
                                        fetVar6.i0();
                                        if (fetVar6.S) {
                                            fetVar6.l(pcyVar);
                                        } else {
                                            fetVar6.r0();
                                        }
                                        jpm0.o(fetVar6, thg0VarA3, shdVar4);
                                        jpm0.o(fetVar6, bh90VarM3, shdVar3);
                                        vqd.u(iHashCode3, fetVar6, shdVar2, fetVar6);
                                        jpm0.o(fetVar6, mm40VarC2, shdVar);
                                        na50 na50Var = (na50) oa50Var;
                                        skm skmVar2 = na50Var.b;
                                        skm skmVar3 = na50Var.f23174a;
                                        boolean z20 = skmVar3.c;
                                        boolean zG8 = fetVar6.g(function7) | fetVar6.g(oa50Var);
                                        Object objP12 = fetVar6.P();
                                        if (zG8 || objP12 == cl5Var) {
                                            final byte b9 = 0;
                                            objP12 = new Function0() { // from class: a.ykm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b10 = b9;
                                                    oa50 oa50Var2 = oa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b10) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).f23174a.f32357a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).f21444a.f32357a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).c.f32357a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((la50) oa50Var2).f19691a.f32357a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP12);
                                        }
                                        mm40 mm40VarN5 = epv0.N(y860.W(jm40Var2, null, null, z20, null, (Function0) objP12, 24), skmVar3.c ? 1.0f : 0.5f);
                                        int i5 = skmVar3.b;
                                        y3d y3dVar3 = skmVar3.e;
                                        if (y3dVar3 == null) {
                                            fetVar6.e0(1787764156);
                                            jM123getWhite0d7_KjU4 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                            z7 = false;
                                            fetVar6.r(false);
                                        } else {
                                            z7 = false;
                                            fetVar6.e0(1787762172);
                                            fetVar6.r(false);
                                            jM123getWhite0d7_KjU4 = y3dVar3.f41946a;
                                        }
                                        long j4 = jM123getWhite0d7_KjU4;
                                        y3d y3dVar4 = skmVar3.f;
                                        if (y3dVar4 == null) {
                                            fetVar6.e0(1787767806);
                                            jM73getBlack400d7_KjU4 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                                            fetVar6.r(z7);
                                        } else {
                                            fetVar6.e0(1787765636);
                                            fetVar6.r(z7);
                                            jM73getBlack400d7_KjU4 = y3dVar4.f41946a;
                                        }
                                        hlm.e(mm40VarN5, i5, jM73getBlack400d7_KjU4, j4, ra50Var, fetVar6, 0);
                                        boolean z21 = skmVar2.c;
                                        boolean zG9 = fetVar6.g(function7) | fetVar6.g(oa50Var);
                                        Object objP13 = fetVar6.P();
                                        if (zG9 || objP13 == cl5Var) {
                                            final byte b10 = 1;
                                            objP13 = new Function0() { // from class: a.ykm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b11 = b10;
                                                    oa50 oa50Var2 = oa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b11) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).f23174a.f32357a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).f21444a.f32357a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).c.f32357a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((la50) oa50Var2).f19691a.f32357a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP13);
                                        }
                                        mm40 mm40VarN6 = epv0.N(y860.W(jm40Var2, null, null, z21, null, (Function0) objP13, 24), skmVar2.c ? 1.0f : 0.5f);
                                        int i6 = skmVar2.b;
                                        y3d y3dVar5 = skmVar2.e;
                                        if (y3dVar5 == null) {
                                            fetVar6.e0(1787791932);
                                            jM123getWhite0d7_KjU5 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                            z9 = false;
                                            fetVar6.r(false);
                                        } else {
                                            z9 = false;
                                            fetVar6.e0(1787789917);
                                            fetVar6.r(false);
                                            jM123getWhite0d7_KjU5 = y3dVar5.f41946a;
                                        }
                                        long j5 = jM123getWhite0d7_KjU5;
                                        y3d y3dVar6 = skmVar2.f;
                                        if (y3dVar6 == null) {
                                            fetVar6.e0(1787795614);
                                            jM73getBlack400d7_KjU5 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                                            fetVar6.r(z9);
                                        } else {
                                            fetVar6.e0(1787793413);
                                            fetVar6.r(z9);
                                            jM73getBlack400d7_KjU5 = y3dVar6.f41946a;
                                        }
                                        hlm.e(mm40VarN6, i6, jM73getBlack400d7_KjU5, j5, ra50Var, fetVar6, 0);
                                        fetVar6 = fetVar6;
                                        fetVar6.r(true);
                                        fetVar6.r(z9);
                                    } else {
                                        if (!(oa50Var instanceof ma50)) {
                                            throw b1j.f(1857718031, fetVar6, false);
                                        }
                                        fetVar6.e0(1757369924);
                                        thg0 thg0VarA4 = shg0.a(lw3Var, yx7Var, fetVar6, 0);
                                        int iHashCode4 = Long.hashCode(fetVar6.T);
                                        bh90 bh90VarM4 = fetVar6.m();
                                        mm40 mm40VarC3 = kbc.c0(fetVar6, jm40Var2);
                                        mkd.c0.getClass();
                                        fetVar6.i0();
                                        if (fetVar6.S) {
                                            fetVar6.l(pcyVar);
                                        } else {
                                            fetVar6.r0();
                                        }
                                        jpm0.o(fetVar6, thg0VarA4, shdVar4);
                                        jpm0.o(fetVar6, bh90VarM4, shdVar3);
                                        vqd.u(iHashCode4, fetVar6, shdVar2, fetVar6);
                                        jpm0.o(fetVar6, mm40VarC3, shdVar);
                                        ma50 ma50Var = (ma50) oa50Var;
                                        skm skmVar4 = ma50Var.c;
                                        skm skmVar5 = ma50Var.b;
                                        skm skmVar6 = ma50Var.f21444a;
                                        boolean z22 = skmVar6.c;
                                        boolean zG10 = fetVar6.g(function7) | fetVar6.g(oa50Var);
                                        Object objP14 = fetVar6.P();
                                        if (zG10 || objP14 == cl5Var) {
                                            final byte b11 = 2;
                                            objP14 = new Function0() { // from class: a.ykm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b12 = b11;
                                                    oa50 oa50Var2 = oa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b12) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).f23174a.f32357a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).f21444a.f32357a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).c.f32357a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((la50) oa50Var2).f19691a.f32357a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP14);
                                        }
                                        mm40 mm40VarN7 = epv0.N(y860.W(jm40Var2, null, null, z22, null, (Function0) objP14, 24), skmVar6.c ? 1.0f : 0.5f);
                                        int i7 = skmVar6.b;
                                        y3d y3dVar7 = skmVar6.e;
                                        if (y3dVar7 == null) {
                                            fetVar6.e0(1797534717);
                                            jM123getWhite0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                            z5 = false;
                                            fetVar6.r(false);
                                        } else {
                                            z5 = false;
                                            fetVar6.e0(1797532733);
                                            fetVar6.r(false);
                                            jM123getWhite0d7_KjU = y3dVar7.f41946a;
                                        }
                                        long j6 = jM123getWhite0d7_KjU;
                                        y3d y3dVar8 = skmVar6.f;
                                        if (y3dVar8 == null) {
                                            fetVar6.e0(1797538367);
                                            jM73getBlack400d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                                            fetVar6.r(z5);
                                        } else {
                                            fetVar6.e0(1797536197);
                                            fetVar6.r(z5);
                                            jM73getBlack400d7_KjU = y3dVar8.f41946a;
                                        }
                                        hlm.e(mm40VarN7, i7, jM73getBlack400d7_KjU, j6, ra50Var, fetVar6, 0);
                                        boolean z23 = skmVar5.c;
                                        boolean zG11 = fetVar6.g(function7) | fetVar6.g(oa50Var);
                                        Object objP15 = fetVar6.P();
                                        if (zG11 || objP15 == cl5Var) {
                                            final byte b12 = 3;
                                            objP15 = new Function0() { // from class: a.ykm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b13 = b12;
                                                    oa50 oa50Var2 = oa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b13) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).f23174a.f32357a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).f21444a.f32357a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).c.f32357a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((la50) oa50Var2).f19691a.f32357a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP15);
                                        }
                                        mm40 mm40VarN8 = epv0.N(y860.W(jm40Var2, null, null, z23, null, (Function0) objP15, 24), skmVar5.c ? 1.0f : 0.5f);
                                        int i8 = skmVar5.b;
                                        y3d y3dVar9 = skmVar5.e;
                                        if (y3dVar9 == null) {
                                            fetVar6.e0(1797562493);
                                            jM123getWhite0d7_KjU2 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                            z6 = false;
                                            fetVar6.r(false);
                                        } else {
                                            z6 = false;
                                            fetVar6.e0(1797560478);
                                            fetVar6.r(false);
                                            jM123getWhite0d7_KjU2 = y3dVar9.f41946a;
                                        }
                                        long j7 = jM123getWhite0d7_KjU2;
                                        y3d y3dVar10 = skmVar5.f;
                                        if (y3dVar10 == null) {
                                            fetVar6.e0(1797566175);
                                            jM73getBlack400d7_KjU2 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                                            fetVar6.r(z6);
                                        } else {
                                            fetVar6.e0(1797563974);
                                            fetVar6.r(z6);
                                            jM73getBlack400d7_KjU2 = y3dVar10.f41946a;
                                        }
                                        hlm.e(mm40VarN8, i8, jM73getBlack400d7_KjU2, j7, ra50Var, fetVar6, 0);
                                        boolean z24 = skmVar4.c;
                                        boolean zG12 = fetVar6.g(function7) | fetVar6.g(oa50Var);
                                        Object objP16 = fetVar6.P();
                                        if (zG12 || objP16 == cl5Var) {
                                            final byte b13 = 4;
                                            objP16 = new Function0() { // from class: a.ykm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    byte b14 = b13;
                                                    oa50 oa50Var2 = oa50Var;
                                                    Function1 function8 = function7;
                                                    switch (b14) {
                                                        case 0:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).f23174a.f32357a));
                                                            }
                                                            break;
                                                        case 1:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((na50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 2:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).f21444a.f32357a));
                                                            }
                                                            break;
                                                        case 3:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).b.f32357a));
                                                            }
                                                            break;
                                                        case 4:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((ma50) oa50Var2).c.f32357a));
                                                            }
                                                            break;
                                                        default:
                                                            if (function8 != null) {
                                                                function8.invoke(Integer.valueOf(((la50) oa50Var2).f19691a.f32357a));
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar6.o0(objP16);
                                        }
                                        mm40 mm40VarN9 = epv0.N(y860.W(jm40Var2, null, null, z24, null, (Function0) objP16, 24), skmVar4.c ? 1.0f : 0.5f);
                                        int i9 = skmVar4.b;
                                        y3d y3dVar11 = skmVar4.e;
                                        if (y3dVar11 == null) {
                                            fetVar6.e0(1797590173);
                                            jM123getWhite0d7_KjU3 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                            z9 = false;
                                            fetVar6.r(false);
                                        } else {
                                            z9 = false;
                                            fetVar6.e0(1797588189);
                                            fetVar6.r(false);
                                            jM123getWhite0d7_KjU3 = y3dVar11.f41946a;
                                        }
                                        long j8 = jM123getWhite0d7_KjU3;
                                        y3d y3dVar12 = skmVar4.f;
                                        if (y3dVar12 == null) {
                                            fetVar6.e0(1797593823);
                                            jM73getBlack400d7_KjU3 = ((StaticColors) fetVar6.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                                            fetVar6.r(z9);
                                        } else {
                                            fetVar6.e0(1797591653);
                                            fetVar6.r(z9);
                                            jM73getBlack400d7_KjU3 = y3dVar12.f41946a;
                                        }
                                        hlm.e(mm40VarN9, i9, jM73getBlack400d7_KjU3, j8, ra50Var, fetVar6, 0);
                                        fetVar6 = fetVar6;
                                        fetVar6.r(true);
                                        fetVar6.r(z9);
                                    }
                                    fetVar6.r(z9);
                                } else {
                                    z10 = false;
                                }
                            }
                            fetVar6.r(z9);
                        }
                        throw b1j.f(-777947204, fetVar6, z10);
                    }
                    fetVar6.e0(908326831);
                    fetVar6.r(false);
                    fetVar6.r(z9);
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                dub.b((mm40) obj5, (omm) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 13:
                k6z k6zVar = (k6z) obj5;
                k6z k6zVar2 = (k6z) obj4;
                Function2 function8 = (Function2) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zE = fetVar7.e(k6zVar.ordinal()) | fetVar7.e(k6zVar2.ordinal());
                    Object objP17 = fetVar7.P();
                    if (zE || objP17 == cl5Var) {
                        if (k6zVar2 == k6z.b && k6zVar == k6z.f17794a) {
                            zcl zclVar5 = qmk.f28987a;
                            lh80VarU = s5x0.u(12.0f, 0.0f, 0.0f, 0.0f, 14);
                        } else {
                            zcl zclVar6 = qmk.f28987a;
                            lh80VarU = s5x0.u(0.0f, 0.0f, 12.0f, 0.0f, 11);
                        }
                        objP17 = lh80VarU;
                        fetVar7.o0(objP17);
                    }
                    mm40 mm40VarI = s5x0.I(o7k0.d(jm40Var, 1.0f), (hh80) objP17);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode5 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM5 = fetVar7.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar7, mm40VarI);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC4, gqw0.v);
                    h97.q(0, fetVar7, function8, true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ccq0.s((mm40) obj5, (vrm) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                ohq0.T((mm40) obj5, (String) obj4, (zum) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                tdc.t((mm40) obj5, (wxm) obj4, (String) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                mim0 mim0Var = (mim0) obj5;
                mm40 mm40Var = (mm40) obj4;
                Function1 function9 = (Function1) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (mim0Var != null) {
                        if (mim0Var instanceof yhm0) {
                            fetVar8.e0(1468773844);
                            thb.j(mm40Var, (yhm0) mim0Var, function9, fetVar8, 0);
                            fetVar8.r(false);
                        } else if (mim0Var instanceof eim0) {
                            fetVar8.e0(1469011924);
                            ckb.n(mm40Var, (eim0) mim0Var, function9, fetVar8, 0);
                            fetVar8.r(false);
                        } else if (mim0Var instanceof kim0) {
                            fetVar8.e0(1469253073);
                            gkb.m(mm40Var, (kim0) mim0Var, function9, fetVar8, 0);
                            fetVar8.r(false);
                        } else if (mim0Var instanceof lim0) {
                            fetVar8.e0(1469494160);
                            aql0 aql0Var = aql0.f1302a;
                            ahb.k(0, fetVar8, mm40Var);
                            fetVar8.r(false);
                        } else if (mim0Var instanceof shm0) {
                            fetVar8.e0(1469640759);
                            bfb.t(0, fetVar8, null);
                            fetVar8.r(false);
                        }
                    }
                    throw b1j.f(740115452, fetVar8, false);
                }
                fetVar8.X();
                return Unit.f46060a;
            case 18:
                return a(obj, obj2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return b(obj, obj2);
            case 20:
                return c(obj, obj2);
            case 21:
                return g(obj, obj2);
            case 22:
                return h(obj, obj2);
            case 23:
                return i(obj, obj2);
            case 24:
                return l(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return m(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return o(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return p(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return r(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                hmw0.t((mm40) obj5, (gmn) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ d8m(j240 j240Var, Function1 function1, mm40 mm40Var, int i) {
        this.f5656a = (byte) 9;
        this.b = j240Var;
        this.d = function1;
        this.c = mm40Var;
    }

    public /* synthetic */ d8m(Object obj, Object obj2, Object obj3, byte b) {
        this.f5656a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ d8m(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f5656a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
