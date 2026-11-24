package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;
import org.xplatform.aggregator.impl.category.presentation.models.SortingOptionUiModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dr50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6543a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dr50(mm40 mm40Var, fqj0 fqj0Var, a270 a270Var, int i) {
        this.f6543a = (byte) 12;
        this.c = mm40Var;
        this.b = fqj0Var;
        this.d = a270Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        byte b = this.f6543a;
        cl5 cl5Var = ukd.f35823a;
        final byte b2 = 2;
        boolean z = false;
        z = false;
        boolean z2 = false;
        final byte b3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                o050.n((mm40) obj3, (w2d) obj5, (fqj0) obj4, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 1:
                kr50 kr50Var = (kr50) obj3;
                fqj0 fqj0Var = (fqj0) obj4;
                xdr xdrVar = (xdr) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (kr50Var != null) {
                        boolean z3 = kr50Var instanceof jr50;
                        jm40 jm40Var = jm40.b;
                        if (z3) {
                            fetVar.e0(-1786987589);
                            zcl zclVar = qmk.f28987a;
                            o050.H(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), fqj0Var, fetVar, 0);
                            fetVar.r(false);
                        } else if (kr50Var instanceof hr50) {
                            fetVar.e0(-1786980079);
                            ArrayList arrayList = ((hr50) kr50Var).f13514a;
                            if (arrayList.isEmpty()) {
                                fetVar.e0(438733444);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(438226036);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                boolean zG = fetVar.g(xdrVar) | fetVar.i(kr50Var);
                                Object objP = fetVar.P();
                                if (zG || objP == cl5Var) {
                                    objP = new ba30(xdrVar, kr50Var, (byte) 26);
                                    fetVar.o0(objP);
                                }
                                o050.G(mm40VarN, arrayList, (Function2) objP, fetVar, 0);
                                fetVar.r(false);
                            }
                            fetVar.r(false);
                        } else if (kr50Var instanceof ir50) {
                            fetVar.e0(438796002);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(-1786989331, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                y860.G((mm40) obj3, (at50) obj5, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                dw50 dw50Var = (dw50) obj3;
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gq80.G(dw50Var.f6781a, function0, function1, null, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                wha0.A((mm40) obj3, (r060) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                mlr mlrVar = (mlr) obj4;
                c260 c260Var = (c260) obj2;
                rz50 rz50Var = (rz50) ((tz50) obj3);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : (List) obj5) {
                    if (mlrVar.f22006a != ((mlr) obj6).f22006a) {
                        arrayList2.add(obj6);
                    }
                }
                return c260.a(c260Var, null, false, false, false, null, false, null, rz50.a(rz50Var, new kz50(arrayList2), null, 223), null, null, 260095);
            case 6:
                Function1 function2 = (Function1) obj3;
                l7m0 l7m0Var = (l7m0) obj5;
                pl7 pl7Var = (pl7) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zfn zfnVar = zaq0.b;
                    ilm ilmVar = new ilm(((ThemeColors) fetVar3.k(zfnVar)).getSecondary());
                    boolean zH = fetVar3.h(((Boolean) l7m0Var.getValue()).booleanValue());
                    Object objP2 = fetVar3.P();
                    if (zH || objP2 == cl5Var) {
                        boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
                        fa50 fa50Var = fa50.f9191a;
                        if (zBooleanValue) {
                            String title = pl7Var.getTitle();
                            pz40 pz40Var = s6t0.f31722a;
                            objP2 = new plm(title, s6t0.b().f33626a.getSecondary(), fa50Var);
                        } else {
                            String title2 = pl7Var.getTitle();
                            pz40 pz40Var2 = s6t0.f31722a;
                            long secondary = s6t0.b().f33626a.getSecondary();
                            on5 on5VarB = pl7Var.b();
                            if (on5VarB instanceof dn5) {
                                pn40 pn40Var = pn40.f27267a;
                                dn5 dn5Var = (dn5) on5VarB;
                                String str2 = dn5Var.f6351a;
                                String str3 = dn5Var.b;
                                str3.getClass();
                                str = String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{str2, str3}, 2));
                            } else {
                                str = "";
                            }
                            objP2 = new rlm(title2, str, secondary, s6t0.b().f33626a.getSecondary(), fa50Var);
                        }
                        fetVar3.o0(objP2);
                    }
                    imm immVar = new imm(ilmVar, (tlm) objP2, fmm.f9790a, ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG2 = fetVar3.g(function2);
                    Object objP3 = fetVar3.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new xv50(function2, (byte) 17);
                        fetVar3.o0(objP3);
                    }
                    hlm.c(mm40VarD, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                oja0.c((a4x) obj3, (g960) obj5, (nrq) obj4, (fet) obj, x8x.L(393));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                jiq0.i0((mm40) obj3, (uwa) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                jar0.w(x8x.L(1), (fet) obj, (d9z) obj3, (l7m0) obj5, (Function1) obj4);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                jar0.G((d9z) obj3, (htr) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                jar0.a(x8x.L(1), (in5) obj3, (ijl) obj5, (fet) obj, (Function1) obj4);
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                bsr0.E((mm40) obj3, (fqj0) obj4, (a270) obj5, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                bsr0.C((mm40) obj3, (r170) obj5, (Function0) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                bsr0.D((mm40) obj3, (e270) obj5, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                rsr0.J((jn5) obj3, (ijl) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                jn5 jn5Var = (jn5) obj3;
                k570 k570Var = (k570) obj5;
                Function1 function3 = (Function1) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rsr0.J(jn5Var, k570Var.c(), function3, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                p470.a((mm40) obj3, (v8r0) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                List list = (List) obj5;
                Function1 function4 = (Function1) obj4;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((l570) obj3).e.e0();
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new no60(((Number) it.next()).longValue(), vpv0.f37827a));
                }
                function4.invoke(arrayList3);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                cwr0.A((mm40) obj3, (cc70) obj5, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                phu0.v((mm40) obj3, (c880) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                hmw0.n((mm40) obj3, (ud80) obj5, (Function2) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                mm40 mm40Var = (mm40) obj3;
                wcp0 wcp0Var = (wcp0) obj5;
                w6n w6nVar = (w6n) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(e7z.u1);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    ucp0 ucp0Var = (ucp0) wcp0Var;
                    b8k0.k(ucp0Var.f35441a, ucp0Var.b, w6nVar, fetVar5);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 23:
                FilterItemUi filterItemUi = (FilterItemUi) obj3;
                List list2 = (List) obj5;
                wr80 wr80Var = (wr80) obj4;
                rs80 rs80Var = (rs80) obj2;
                ((oyg0) obj).getClass();
                rs80Var.getClass();
                if (Intrinsics.d(filterItemUi.getF46280a(), "0") && list2.isEmpty()) {
                    z2 = true;
                }
                return rs80.a(rs80Var, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, new Pair(Boolean.valueOf(z2), Integer.valueOf(((ur80) wr80Var).f36152a.indexOf(filterItemUi))), 67108863);
            case 24:
                SortingOptionUiModel sortingOptionUiModel = (SortingOptionUiModel) obj3;
                List list3 = (List) obj5;
                List list4 = (List) obj4;
                rs80 rs80Var2 = (rs80) obj2;
                ((oyg0) obj).getClass();
                rs80Var2.getClass();
                return rs80.a(rs80Var2, false, false, false, false, false, false, false, sortingOptionUiModel != null ? sortingOptionUiModel.e : null, sortingOptionUiModel != null ? sortingOptionUiModel.f : null, null, null, null, null, null, null, list3, list4, false, null, 109039615);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                k9x.l((mm40) obj3, (vw80) obj5, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                dwi0.k((mm40) obj3, (bz80) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                final k090 k090Var = (k090) obj5;
                final Function1 function5 = (Function1) obj4;
                mm40 mm40Var2 = (mm40) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    s6q0 s6q0Var = k090Var.b;
                    j3x j3xVar = k090Var.c;
                    int i = j3xVar != null ? j3xVar.f15856a : -1;
                    boolean zG3 = fetVar6.g(function5) | fetVar6.g(k090Var);
                    Object objP4 = fetVar6.P();
                    if (zG3 || objP4 == cl5Var) {
                        final byte b4 = z ? (byte) 1 : (byte) 0;
                        objP4 = new Function1() { // from class: a.h090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b5 = b4;
                                k090 k090Var2 = k090Var;
                                Function1 function6 = function5;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function6.invoke(new b9f0(k090Var2.f17454a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function6.invoke(new d9f0(k090Var2.f17454a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function6.invoke(new p9f0(k090Var2.f17454a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP4);
                    }
                    Function1 function6 = (Function1) objP4;
                    boolean zG4 = fetVar6.g(function5) | fetVar6.g(k090Var);
                    Object objP5 = fetVar6.P();
                    if (zG4 || objP5 == cl5Var) {
                        objP5 = new Function1() { // from class: a.h090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b5 = b3;
                                k090 k090Var2 = k090Var;
                                Function1 function7 = function5;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function7.invoke(new b9f0(k090Var2.f17454a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function7.invoke(new d9f0(k090Var2.f17454a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function7.invoke(new p9f0(k090Var2.f17454a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP5);
                    }
                    kly klyVar = new kly(function6, (Function1) objP5, null, 58);
                    boolean zG5 = fetVar6.g(function5) | fetVar6.g(k090Var);
                    Object objP6 = fetVar6.P();
                    if (zG5 || objP6 == cl5Var) {
                        objP6 = new Function1() { // from class: a.h090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b5 = b2;
                                k090 k090Var2 = k090Var;
                                Function1 function7 = function5;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function7.invoke(new b9f0(k090Var2.f17454a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function7.invoke(new d9f0(k090Var2.f17454a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function7.invoke(new p9f0(k090Var2.f17454a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP6);
                    }
                    jwb.o(mm40Var2, s6q0Var, i, klyVar, (Function1) objP6, fetVar6, 0, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mm40 mm40Var3 = (mm40) obj3;
                final l090 l090Var = (l090) obj5;
                final Function1 function7 = (Function1) obj4;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c6q0 c6q0Var = l090Var.b;
                    j3x j3xVar2 = l090Var.c;
                    int i2 = j3xVar2 != null ? j3xVar2.f15856a : -1;
                    boolean zG6 = fetVar7.g(function7) | fetVar7.g(l090Var);
                    Object objP7 = fetVar7.P();
                    if (zG6 || objP7 == cl5Var) {
                        final byte b5 = z ? (byte) 1 : (byte) 0;
                        objP7 = new Function1() { // from class: a.i090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b6 = b5;
                                l090 l090Var2 = l090Var;
                                Function1 function8 = function7;
                                switch (b6) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function8.invoke(new ove0(l090Var2.f19188a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function8.invoke(new qve0(l090Var2.f19188a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function8.invoke(new ewe0(l090Var2.f19188a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar7.o0(objP7);
                    }
                    Function1 function8 = (Function1) objP7;
                    boolean zG7 = fetVar7.g(function7) | fetVar7.g(l090Var);
                    Object objP8 = fetVar7.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new Function1() { // from class: a.i090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b6 = b3;
                                l090 l090Var2 = l090Var;
                                Function1 function9 = function7;
                                switch (b6) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function9.invoke(new ove0(l090Var2.f19188a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function9.invoke(new qve0(l090Var2.f19188a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function9.invoke(new ewe0(l090Var2.f19188a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar7.o0(objP8);
                    }
                    kly klyVar2 = new kly(function8, (Function1) objP8, null, 58);
                    boolean zG8 = fetVar7.g(function7) | fetVar7.g(l090Var);
                    Object objP9 = fetVar7.P();
                    if (zG8 || objP9 == cl5Var) {
                        objP9 = new Function1() { // from class: a.i090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b6 = b2;
                                l090 l090Var2 = l090Var;
                                Function1 function9 = function7;
                                switch (b6) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function9.invoke(new ove0(l090Var2.f19188a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function9.invoke(new qve0(l090Var2.f19188a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function9.invoke(new ewe0(l090Var2.f19188a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar7.o0(objP9);
                    }
                    wvb.t(mm40Var3, c6q0Var, i2, klyVar2, (Function1) objP9, fetVar7, 0, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            default:
                final m090 m090Var = (m090) obj5;
                final Function1 function9 = (Function1) obj4;
                mm40 mm40Var4 = (mm40) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    s6q0 s6q0Var2 = m090Var.b;
                    j3x j3xVar3 = m090Var.c;
                    int i3 = j3xVar3 != null ? j3xVar3.f15856a : -1;
                    boolean zG9 = fetVar8.g(function9) | fetVar8.g(m090Var);
                    Object objP10 = fetVar8.P();
                    if (zG9 || objP10 == cl5Var) {
                        final byte b6 = z ? (byte) 1 : (byte) 0;
                        objP10 = new Function1() { // from class: a.j090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b7 = b6;
                                m090 m090Var2 = m090Var;
                                Function1 function10 = function9;
                                switch (b7) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function10.invoke(new y2f0(m090Var2.f20943a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function10.invoke(new a3f0(m090Var2.f20943a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function10.invoke(new n3f0(m090Var2.f20943a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar8.o0(objP10);
                    }
                    Function1 function10 = (Function1) objP10;
                    boolean zG10 = fetVar8.g(function9) | fetVar8.g(m090Var);
                    Object objP11 = fetVar8.P();
                    if (zG10 || objP11 == cl5Var) {
                        objP11 = new Function1() { // from class: a.j090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b7 = b3;
                                m090 m090Var2 = m090Var;
                                Function1 function11 = function9;
                                switch (b7) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function11.invoke(new y2f0(m090Var2.f20943a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function11.invoke(new a3f0(m090Var2.f20943a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function11.invoke(new n3f0(m090Var2.f20943a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar8.o0(objP11);
                    }
                    kly klyVar3 = new kly(function10, (Function1) objP11, null, 58);
                    boolean zG11 = fetVar8.g(function9) | fetVar8.g(m090Var);
                    Object objP12 = fetVar8.P();
                    if (zG11 || objP12 == cl5Var) {
                        objP12 = new Function1() { // from class: a.j090
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                byte b7 = b2;
                                m090 m090Var2 = m090Var;
                                Function1 function11 = function9;
                                switch (b7) {
                                    case 0:
                                        ((jly) obj7).getClass();
                                        function11.invoke(new y2f0(m090Var2.f20943a));
                                        break;
                                    case 1:
                                        ((jly) obj7).getClass();
                                        function11.invoke(new a3f0(m090Var2.f20943a));
                                        break;
                                    default:
                                        x5q0 x5q0Var = (x5q0) obj7;
                                        x5q0Var.getClass();
                                        if (x5q0Var instanceof w5q0) {
                                            function11.invoke(new n3f0(m090Var2.f20943a, ((w5q0) x5q0Var).f38596a));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar8.o0(objP12);
                    }
                    jwb.o(mm40Var4, s6q0Var2, i3, klyVar3, (Function1) objP12, fetVar8, 0, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dr50(byte b, mm40 mm40Var, p6t0 p6t0Var, Function1 function1) {
        this.f6543a = b;
        this.d = p6t0Var;
        this.b = function1;
        this.c = mm40Var;
    }

    public /* synthetic */ dr50(kr50 kr50Var, fqj0 fqj0Var, xdr xdrVar) {
        this.f6543a = (byte) 1;
        this.c = kr50Var;
        this.b = fqj0Var;
        this.d = xdrVar;
    }

    public /* synthetic */ dr50(Object obj, Object obj2, Object obj3, byte b) {
        this.f6543a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ dr50(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f6543a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
