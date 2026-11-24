package a;

import androidx.compose.ui.tooling.PreviewActivity;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o090 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24411a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o090(mm40 mm40Var, Function1 function1, szy szyVar) {
        this.f24411a = (byte) 11;
        this.b = mm40Var;
        this.c = function1;
        this.d = szyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        Object a5nVar;
        byte b = this.f24411a;
        cl5 cl5Var = ukd.f35823a;
        final byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                xdx.g((mm40) obj5, (p090) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ydx.m((mm40) obj5, (q090) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                zdx.i((mm40) obj5, (r090) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                xf0.t((d790) obj5, (FixedWebView) obj4, (Function1) obj3, (fet) obj, x8x.L(65));
                break;
            case 4:
                ((Integer) obj2).getClass();
                p7x.g((ctf0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                break;
            case 5:
                final vl90 vl90Var = (vl90) obj4;
                final Function1 function1 = (Function1) obj3;
                mm40 mm40Var = (mm40) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    inm inmVar = vl90Var.f37611a;
                    j3x j3xVar = vl90Var.b;
                    int i = j3xVar != null ? j3xVar.f15856a : -1;
                    boolean zG = fetVar.g(function1) | fetVar.g(vl90Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new Function1() { // from class: a.ll90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b3;
                                vl90 vl90Var2 = vl90Var;
                                Function1 function2 = function1;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        vl90Var2.getClass();
                                        function2.invoke(new b9f0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        vl90Var2.getClass();
                                        function2.invoke(new d9f0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        vl90Var2.getClass();
                                        function2.invoke(new p9f0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zG2 = fetVar.g(function1) | fetVar.g(vl90Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new Function1() { // from class: a.ll90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b4;
                                vl90 vl90Var2 = vl90Var;
                                Function1 function3 = function1;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        vl90Var2.getClass();
                                        function3.invoke(new b9f0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        vl90Var2.getClass();
                                        function3.invoke(new d9f0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        vl90Var2.getClass();
                                        function3.invoke(new p9f0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP2);
                    }
                    kly klyVar = new kly(function2, (Function1) objP2, null, 58);
                    boolean zG3 = fetVar.g(function1);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new qu80(function1, (byte) 24);
                        fetVar.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG4 = fetVar.g(function1) | fetVar.g(vl90Var);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new Function1() { // from class: a.ll90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b2;
                                vl90 vl90Var2 = vl90Var;
                                Function1 function3 = function1;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        vl90Var2.getClass();
                                        function3.invoke(new b9f0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        vl90Var2.getClass();
                                        function3.invoke(new d9f0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        vl90Var2.getClass();
                                        function3.invoke(new p9f0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP4);
                    }
                    wwb.k(mm40Var, inmVar, i, klyVar, function0, (Function1) objP4, fetVar, 0, 64);
                } else {
                    fetVar.X();
                }
                break;
            case 6:
                final wl90 wl90Var = (wl90) obj4;
                final Function1 function3 = (Function1) obj3;
                mm40 mm40Var2 = (mm40) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hnm hnmVar = wl90Var.f39343a;
                    j3x j3xVar2 = wl90Var.b;
                    int i2 = j3xVar2 != null ? j3xVar2.f15856a : -1;
                    boolean zG5 = fetVar2.g(function3) | fetVar2.g(wl90Var);
                    Object objP5 = fetVar2.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new Function1() { // from class: a.ml90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b3;
                                wl90 wl90Var2 = wl90Var;
                                Function1 function4 = function3;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        wl90Var2.getClass();
                                        function4.invoke(new ove0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        wl90Var2.getClass();
                                        function4.invoke(new qve0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        wl90Var2.getClass();
                                        function4.invoke(new ewe0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP5);
                    }
                    Function1 function4 = (Function1) objP5;
                    boolean zG6 = fetVar2.g(function3) | fetVar2.g(wl90Var);
                    Object objP6 = fetVar2.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new Function1() { // from class: a.ml90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b4;
                                wl90 wl90Var2 = wl90Var;
                                Function1 function5 = function3;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        wl90Var2.getClass();
                                        function5.invoke(new ove0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        wl90Var2.getClass();
                                        function5.invoke(new qve0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        wl90Var2.getClass();
                                        function5.invoke(new ewe0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP6);
                    }
                    kly klyVar2 = new kly(function4, (Function1) objP6, null, 58);
                    boolean zG7 = fetVar2.g(function3);
                    Object objP7 = fetVar2.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new qu80(function3, (byte) 25);
                        fetVar2.o0(objP7);
                    }
                    Function0 function5 = (Function0) objP7;
                    boolean zG8 = fetVar2.g(function3) | fetVar2.g(wl90Var);
                    Object objP8 = fetVar2.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new Function1() { // from class: a.ml90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b2;
                                wl90 wl90Var2 = wl90Var;
                                Function1 function6 = function3;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        wl90Var2.getClass();
                                        function6.invoke(new ove0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        wl90Var2.getClass();
                                        function6.invoke(new qve0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        wl90Var2.getClass();
                                        function6.invoke(new ewe0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP8);
                    }
                    wwb.k(mm40Var2, hnmVar, i2, klyVar2, function5, (Function1) objP8, fetVar2, 0, 64);
                } else {
                    fetVar2.X();
                }
                break;
            case 7:
                final yl90 yl90Var = (yl90) obj4;
                final Function1 function6 = (Function1) obj3;
                mm40 mm40Var3 = (mm40) obj5;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    inm inmVar2 = yl90Var.f42830a;
                    j3x j3xVar3 = yl90Var.b;
                    int i3 = j3xVar3 != null ? j3xVar3.f15856a : -1;
                    boolean zG9 = fetVar3.g(function6) | fetVar3.g(yl90Var);
                    Object objP9 = fetVar3.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new Function1() { // from class: a.nl90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b3;
                                yl90 yl90Var2 = yl90Var;
                                Function1 function7 = function6;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        yl90Var2.getClass();
                                        function7.invoke(new y2f0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        yl90Var2.getClass();
                                        function7.invoke(new a3f0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        yl90Var2.getClass();
                                        function7.invoke(new n3f0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP9);
                    }
                    Function1 function7 = (Function1) objP9;
                    boolean zG10 = fetVar3.g(function6) | fetVar3.g(yl90Var);
                    Object objP10 = fetVar3.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new Function1() { // from class: a.nl90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b4;
                                yl90 yl90Var2 = yl90Var;
                                Function1 function8 = function6;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        yl90Var2.getClass();
                                        function8.invoke(new y2f0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        yl90Var2.getClass();
                                        function8.invoke(new a3f0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        yl90Var2.getClass();
                                        function8.invoke(new n3f0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP10);
                    }
                    kly klyVar3 = new kly(function7, (Function1) objP10, null, 58);
                    boolean zG11 = fetVar3.g(function6);
                    Object objP11 = fetVar3.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new qu80(function6, (byte) 26);
                        fetVar3.o0(objP11);
                    }
                    Function0 function8 = (Function0) objP11;
                    boolean zG12 = fetVar3.g(function6) | fetVar3.g(yl90Var);
                    Object objP12 = fetVar3.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new Function1() { // from class: a.nl90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b5 = b2;
                                yl90 yl90Var2 = yl90Var;
                                Function1 function9 = function6;
                                switch (b5) {
                                    case 0:
                                        ((jly) obj6).getClass();
                                        yl90Var2.getClass();
                                        function9.invoke(new y2f0(u0f0.h));
                                        break;
                                    case 1:
                                        ((jly) obj6).getClass();
                                        yl90Var2.getClass();
                                        function9.invoke(new a3f0(u0f0.h));
                                        break;
                                    default:
                                        String str = (String) obj6;
                                        str.getClass();
                                        yl90Var2.getClass();
                                        function9.invoke(new n3f0(u0f0.h, str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar3.o0(objP12);
                    }
                    wwb.k(mm40Var3, inmVar2, i3, klyVar3, function8, (Function1) objP12, fetVar3, 0, 64);
                } else {
                    fetVar3.X();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                j47.d0((mm40) obj5, (au90) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                piz.p((mm40) obj5, (s2a0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 10:
                Function0 function9 = (Function0) obj5;
                u6n u6nVar = (u6n) obj4;
                nea0 nea0Var = (nea0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarW = y860.W(o7k0.u(o7k0.e(jm40Var, 60.0f), 0.0f, 100.0f, 1), null, null, false, null, function9, 28);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar4, 48);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarW);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    boolean z = fetVar4.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar4, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar4, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar4, numValueOf, shdVar3);
                    jpm0.n(fetVar4);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar4, mm40VarC0, shdVar4);
                    boolean zG13 = fetVar4.g(u6nVar);
                    Object objP13 = fetVar4.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new d1n(u6nVar, (byte) 1);
                        fetVar4.o0(objP13);
                    }
                    kkb.p(1, fetVar4, null, (Function0) objP13);
                    mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 28.0f);
                    long jM75getBlack600d7_KjU = ((StaticColors) fetVar4.k(m8m0.f21378a)).m75getBlack600d7_KjU();
                    zcl zclVar2 = qmk.d;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ = i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarQ);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, shdVar);
                    jpm0.o(fetVar4, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, shdVar4);
                    mm40 mm40VarK = s5x0.K(jm40Var, 2.0f, 2.0f);
                    String str = nea0Var.e;
                    qrq qrqVar = j1t0.b;
                    long j = qmk.p;
                    aad.e(str, mm40VarK, y9q0.a(ibm0.s(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.C, 16646109), fetVar4), 0L, 0L, null, null, null, 0L, null, null, 3, 3, 0L, null, null, 16678911), null, 2, false, 2, 0, null, new n05(qmk.o, j, qmk.n), fetVar4, 1597440, 424);
                    fetVar4.r(true);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
            case 11:
                mm40 mm40Var4 = (mm40) obj5;
                Function1 function10 = (Function1) obj3;
                szy szyVar = (szy) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
                    boolean zG14 = fetVar5.g(function10) | fetVar5.g(szyVar);
                    Object objP14 = fetVar5.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new qw80((Object) function10, (Object) szyVar, (byte) 15);
                        fetVar5.o0(objP14);
                    }
                    mm40 mm40VarY = y860.Y(mm40VarD, false, null, null, (Function0) objP14, 15);
                    pz40 pz40Var = s6t0.f31722a;
                    long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar3 = qmk.e;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarY, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 8.0f);
                    fetVar5.e0(-1003410150);
                    fetVar5.e0(212064437);
                    fetVar5.r(false);
                    w6k w6kVar = (w6k) fetVar5.k(bmd.h);
                    Object objP15 = fetVar5.P();
                    if (objP15 == cl5Var) {
                        objP15 = new bk30(w6kVar);
                        fetVar5.o0(objP15);
                    }
                    bk30 bk30Var = (bk30) objP15;
                    Object objP16 = fetVar5.P();
                    if (objP16 == cl5Var) {
                        objP16 = new g3e();
                        fetVar5.o0(objP16);
                    }
                    g3e g3eVar = (g3e) objP16;
                    Object objP17 = fetVar5.P();
                    if (objP17 == cl5Var) {
                        objP17 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar5.o0(objP17);
                    }
                    pz40 pz40Var2 = (pz40) objP17;
                    Object objP18 = fetVar5.P();
                    if (objP18 == cl5Var) {
                        objP18 = new v3e(g3eVar);
                        fetVar5.o0(objP18);
                    }
                    v3e v3eVar = (v3e) objP18;
                    Object objP19 = fetVar5.P();
                    if (objP19 == cl5Var) {
                        objP19 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                        fetVar5.o0(objP19);
                    }
                    pz40 pz40Var3 = (pz40) objP19;
                    boolean zI = fetVar5.i(bk30Var) | fetVar5.e(257);
                    Object objP20 = fetVar5.P();
                    if (zI || objP20 == cl5Var) {
                        a5nVar = new a5n(pz40Var3, bk30Var, v3eVar, pz40Var2, (byte) 3);
                        fetVar5.o0(a5nVar);
                    } else {
                        a5nVar = objP20;
                    }
                    tj30 tj30Var = (tj30) a5nVar;
                    Object objP21 = fetVar5.P();
                    if (objP21 == cl5Var) {
                        objP21 = new b5n(pz40Var2, v3eVar, (byte) 3);
                        fetVar5.o0(objP21);
                    }
                    Function0 function11 = (Function0) objP21;
                    boolean zI2 = fetVar5.i(bk30Var);
                    Object objP22 = fetVar5.P();
                    if (zI2 || objP22 == cl5Var) {
                        objP22 = new c5n(bk30Var, (byte) 3);
                        fetVar5.o0(objP22);
                    }
                    l7x.s(pai0.a(mm40VarJ, false, (Function1) objP22), u1c.M(1200550679, new jef(pz40Var3, g3eVar, function11, szyVar, (byte) 2), fetVar5), tj30Var, fetVar5, 48);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                u7x.i((mm40) obj5, (String) obj4, (y9q0) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((xi70) obj5).a((Fragment) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                d7x.g((mm40) obj5, (spa0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                k7x.l((mm40) obj5, (upa0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 16:
                ((Integer) obj2).getClass();
                g7x.h((mm40) obj5, (tpa0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                wha0.B((mm40) obj5, (d6b0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                ylb0 ylb0Var = (ylb0) obj4;
                pv40 pv40Var = (pv40) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                mi70 mi70Var = ccb0.X1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    List list = (List) linkedHashMap.get(ylb0Var);
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    boolean zG15 = fetVar6.g(pv40Var);
                    Object objP23 = fetVar6.P();
                    if (zG15 || objP23 == cl5Var) {
                        bi80 bi80Var = new bi80(0, pv40Var, pv40.class, "back", "back()Z", 8, (byte) 2);
                        fetVar6.o0(bi80Var);
                        objP23 = bi80Var;
                    }
                    x8x.f(null, list, (Function0) objP23, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                xia0.Q((mm40) obj5, (qza0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                xia0.h((mm40) obj5, (dza0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                xia0.y((mm40) obj5, (mza0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                xia0.n((mm40) obj5, (eza0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 23:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                Object[] objArr = (Object[]) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i4 = PreviewActivity.w;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    wzb.r0(str2, str3, fetVar7, Arrays.copyOf(objArr, 0));
                } else {
                    fetVar7.X();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                c9x.h((ff6) obj5, (a7c0) obj4, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                phu0.a((mm40) obj5, (ldc0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                i4w0.v((zmc0) obj5, (Function2) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                i4w0.G((String) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(385));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                vbw0.D((mm40) obj5, (yrc0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                q0x.o((mm40) obj5, (String) obj4, (hds) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o090(byte b, mm40 mm40Var, p6t0 p6t0Var, Function1 function1) {
        this.f24411a = b;
        this.d = p6t0Var;
        this.c = function1;
        this.b = mm40Var;
    }

    public /* synthetic */ o090(Object obj, Object obj2, Object obj3, byte b) {
        this.f24411a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ o090(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f24411a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ o090(String str, Function1 function1, ugd ugdVar, int i) {
        this.f24411a = (byte) 27;
        this.b = str;
        this.c = function1;
        this.d = ugdVar;
    }
}
