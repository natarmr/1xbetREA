package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class a100 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f46a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ a100(List list, Function1 function1, byte b) {
        this.f46a = b;
        this.b = list;
        this.c = function1;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        yjj0 yjj0VarC = jd8.n;
        g9zVar.getClass();
        final byte b = 2;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        final byte b2 = 1;
        final byte b3 = 0;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            hvk0 hvk0Var = (hvk0) this.b.get(iIntValue);
            fetVar.e0(-864491598);
            if (hvk0Var == null) {
                z2 = false;
            } else {
                boolean z4 = hvk0Var instanceof eok0;
                final Function1 function1 = this.c;
                if (z4) {
                    fetVar.e0(-1274823776);
                    b5x.q(null, (eok0) hvk0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else {
                    boolean z5 = hvk0Var instanceof br40;
                    byte b4 = 3;
                    cl5 cl5Var = ukd.f35823a;
                    if (z5) {
                        fetVar.e0(-1274820712);
                        br40 br40Var = (br40) hvk0Var;
                        br40Var.getClass();
                        function1.getClass();
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarD = o7k0.d(s5x0.L(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                        wul wulVar = br40Var.b;
                        boolean zG = fetVar.g(function1) | fetVar.g(br40Var);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new a540(b4, br40Var, function1);
                            fetVar.o0(objP);
                        }
                        qzb.n(mm40VarD, wulVar, (Function0) objP, fetVar, 0, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof y5l0) {
                        fetVar.e0(-1274817764);
                        wdx.E(null, (y5l0) hvk0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof wll0) {
                        fetVar.e0(-1274814205);
                        kcx.v(null, (wll0) hvk0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof i9l0) {
                        fetVar.e0(-1274808635);
                        uvw.m(null, (i9l0) hvk0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof gem0) {
                        fetVar.e0(-1274805173);
                        fem0.a(null, (gem0) hvk0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof rxl0) {
                        fetVar.e0(-1274802628);
                        final rxl0 rxl0Var = (rxl0) hvk0Var;
                        rxl0Var.getClass();
                        function1.getClass();
                        boolean z6 = rxl0Var instanceof qxl0;
                        jm40 jm40Var = jm40.b;
                        if (z6) {
                            fetVar.e0(2136715776);
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            qxl0 qxl0Var = (qxl0) rxl0Var;
                            boolean zG2 = fetVar.g(function1);
                            Object objP2 = fetVar.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new ru80(function1, (byte) 14);
                                fetVar.o0(objP2);
                            }
                            n7x.n(mm40VarN, qxl0Var, (Function2) objP2, fetVar, 0);
                            fetVar.r(false);
                        } else if (rxl0Var instanceof nxl0) {
                            fetVar.e0(2137190293);
                            zcl zclVar3 = qmk.f28987a;
                            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), qmk.a(fetVar).c, 0.0f, 2), 1.0f), 168.0f);
                            pz40 pz40Var = s6t0.f31722a;
                            mm40 mm40VarQ = i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(16.0f));
                            boolean zG3 = fetVar.g(function1) | fetVar.g(rxl0Var);
                            Object objP3 = fetVar.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new Function0() { // from class: a.mxl0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = b3;
                                        rxl0 rxl0Var2 = rxl0Var;
                                        Function1 function2 = function1;
                                        switch (b5) {
                                            case 0:
                                                kvl0 kvl0Var = ((nxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(kvl0Var.f18961a, kvl0Var.b));
                                                break;
                                            case 1:
                                                mvl0 mvl0Var = ((pxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(mvl0Var.f22462a, mvl0Var.b));
                                                break;
                                            default:
                                                mvl0 mvl0Var2 = ((oxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(mvl0Var2.f22462a, mvl0Var2.b));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP3);
                            }
                            x0x.p(y860.W(mm40VarQ, null, null, false, null, (Function0) objP3, 28), ((nxl0) rxl0Var).b, fetVar, 0);
                            fetVar.r(false);
                        } else if (rxl0Var instanceof pxl0) {
                            fetVar.e0(2138046854);
                            pxl0 pxl0Var = (pxl0) rxl0Var;
                            v12 v12Var = pxl0Var.c;
                            int iOrdinal = v12Var.ordinal();
                            if (iOrdinal == 1 || iOrdinal == 2) {
                                zcl zclVar4 = qmk.f28987a;
                                f2 = 4.0f;
                            } else {
                                zcl zclVar5 = qmk.f28987a;
                                f2 = 0.0f;
                            }
                            int iOrdinal2 = v12Var.ordinal();
                            mm40 mm40VarE2 = o7k0.e(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f2, 0.0f, (iOrdinal2 == 2 || iOrdinal2 == 3) ? 8.0f : 0.0f, 5), qmk.a(fetVar).c, 0.0f, 2), 1.0f), 144.0f);
                            pz40 pz40Var2 = s6t0.f31722a;
                            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                            zcl zclVar6 = qmk.k;
                            ugg0 ugg0Var = vgg0.f37379a;
                            mm40 mm40VarN2 = s5x0.N(i120.Q(mm40VarE2, backgroundContent, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6)), 16.0f, 0.0f, 12.0f, 0.0f, 10);
                            boolean zG4 = fetVar.g(function1) | fetVar.g(rxl0Var);
                            Object objP4 = fetVar.P();
                            if (zG4 || objP4 == cl5Var) {
                                objP4 = new Function0() { // from class: a.mxl0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = b2;
                                        rxl0 rxl0Var2 = rxl0Var;
                                        Function1 function2 = function1;
                                        switch (b5) {
                                            case 0:
                                                kvl0 kvl0Var = ((nxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(kvl0Var.f18961a, kvl0Var.b));
                                                break;
                                            case 1:
                                                mvl0 mvl0Var = ((pxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(mvl0Var.f22462a, mvl0Var.b));
                                                break;
                                            default:
                                                mvl0 mvl0Var2 = ((oxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(mvl0Var2.f22462a, mvl0Var2.b));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP4);
                            }
                            x1x.t(y860.W(mm40VarN2, null, null, false, null, (Function0) objP4, 28), pxl0Var.b, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            if (!(rxl0Var instanceof oxl0)) {
                                throw b1j.f(-1316546295, fetVar, false);
                            }
                            fetVar.e0(2139340980);
                            zcl zclVar7 = qmk.f28987a;
                            mm40 mm40VarE3 = o7k0.e(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), qmk.a(fetVar).c, 0.0f, 2), 1.0f), 144.0f);
                            pz40 pz40Var3 = s6t0.f31722a;
                            long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
                            zcl zclVar8 = qmk.k;
                            ugg0 ugg0Var2 = vgg0.f37379a;
                            mm40 mm40VarN3 = s5x0.N(i120.Q(mm40VarE3, backgroundContent2, new ugg0(zclVar8, zclVar8, zclVar8, zclVar8)), 16.0f, 0.0f, 12.0f, 0.0f, 10);
                            boolean zG5 = fetVar.g(function1) | fetVar.g(rxl0Var);
                            Object objP5 = fetVar.P();
                            if (zG5 || objP5 == cl5Var) {
                                objP5 = new Function0() { // from class: a.mxl0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = b;
                                        rxl0 rxl0Var2 = rxl0Var;
                                        Function1 function2 = function1;
                                        switch (b5) {
                                            case 0:
                                                kvl0 kvl0Var = ((nxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(kvl0Var.f18961a, kvl0Var.b));
                                                break;
                                            case 1:
                                                mvl0 mvl0Var = ((pxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(mvl0Var.f22462a, mvl0Var.b));
                                                break;
                                            default:
                                                mvl0 mvl0Var2 = ((oxl0) rxl0Var2).b;
                                                function2.invoke(new frk0(mvl0Var2.f22462a, mvl0Var2.b));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar.o0(objP5);
                            }
                            x1x.t(y860.W(mm40VarN3, null, null, false, null, (Function0) objP5, 28), ((oxl0) rxl0Var).b, fetVar, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else if (hvk0Var instanceof o1s0) {
                        fetVar.e0(-1274799424);
                        btm0.i(null, (o1s0) hvk0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof q850) {
                        fetVar.e0(-1274796257);
                        idx.e(null, (q850) hvk0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof n4m0) {
                        fetVar.e0(-1274793253);
                        q8x.u(null, (n4m0) hvk0Var, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof q6u0) {
                        fetVar.e0(-1274790278);
                        nsm0.j((q6u0) hvk0Var, function1, fetVar);
                        fetVar.r(false);
                    } else if (hvk0Var instanceof al30) {
                        fetVar.e0(-1274787190);
                        al30 al30Var = (al30) hvk0Var;
                        al30Var.getClass();
                        fetVar.e0(2041496279);
                        int iOrdinal3 = al30Var.i.ordinal();
                        if (iOrdinal3 == 1 || iOrdinal3 == 2) {
                            zcl zclVar9 = qmk.f28987a;
                            f = 8.0f;
                        } else {
                            zcl zclVar10 = qmk.f28987a;
                            f = 0.0f;
                        }
                        m8x.m(o7k0.d(s5x0.L(s5x0.N(jm40.b, 0.0f, f, 0.0f, 0.0f, 13), qmk.a(fetVar).c, 0.0f, 2), 1.0f), al30Var, fetVar, 0);
                        fetVar.r(false);
                        fetVar.r(false);
                    } else {
                        boolean z7 = hvk0Var instanceof uqp0;
                        jm40 jm40Var2 = jm40.b;
                        if (z7) {
                            fetVar.e0(-1274784635);
                            uqp0 uqp0Var = (uqp0) hvk0Var;
                            uqp0Var.getClass();
                            function1.getClass();
                            if (uqp0Var instanceof sqp0) {
                                fetVar.e0(-435660883);
                                mm40 mm40VarD3 = o7k0.d(jm40Var2, 1.0f);
                                sqp0 sqp0Var = (sqp0) uqp0Var;
                                boolean zG6 = fetVar.g(function1);
                                Object objP6 = fetVar.P();
                                if (zG6 || objP6 == cl5Var) {
                                    objP6 = new coo0(function1, (byte) 17);
                                    fetVar.o0(objP6);
                                }
                                Function1 function2 = (Function1) objP6;
                                boolean zG7 = fetVar.g(function1);
                                Object objP7 = fetVar.P();
                                if (zG7 || objP7 == cl5Var) {
                                    objP7 = new g4p0(function1, (byte) 19);
                                    fetVar.o0(objP7);
                                }
                                n8n0.d(mm40VarD3, sqp0Var, function2, (Function0) objP7, fetVar, 0);
                                fetVar = fetVar;
                                fetVar.r(false);
                            } else if (uqp0Var instanceof tqp0) {
                                fetVar.e0(-435211445);
                                mm40 mm40VarN4 = s5x0.N(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                a4x a4xVar = ((tqp0) uqp0Var).f34391a;
                                boolean zG8 = fetVar.g(function1);
                                Object objP8 = fetVar.P();
                                if (zG8 || objP8 == cl5Var) {
                                    objP8 = new coo0(function1, (byte) 18);
                                    fetVar.o0(objP8);
                                }
                                afn0.f(0, fetVar, a4xVar, mm40VarN4, (Function1) objP8);
                                fetVar.r(false);
                            } else {
                                if (!(uqp0Var instanceof rqp0)) {
                                    throw b1j.f(2064154862, fetVar, false);
                                }
                                fetVar.e0(2064186259);
                                zcl zclVar11 = qmk.f28987a;
                                jeb.u(s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), (rqp0) uqp0Var, fetVar, 0);
                                fetVar.r(false);
                            }
                            fetVar.r(false);
                        } else if (hvk0Var instanceof lzc0) {
                            fetVar.e0(-1274778341);
                            m7x.i(null, (lzc0) hvk0Var, function1, fetVar, 0);
                            fetVar.r(false);
                        } else if (hvk0Var instanceof p1e0) {
                            fetVar.e0(-1274775299);
                            p1e0 p1e0Var = (p1e0) hvk0Var;
                            p1e0Var.getClass();
                            function1.getClass();
                            if (p1e0Var instanceof n1e0) {
                                fetVar.e0(-24788505);
                                mm40 mm40VarD4 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                n1e0 n1e0Var = (n1e0) p1e0Var;
                                v12 v12Var2 = n1e0Var.c;
                                int iOrdinal4 = v12Var2.ordinal();
                                float f3 = (iOrdinal4 == 1 || iOrdinal4 == 2) ? 4.0f : 0.0f;
                                int iOrdinal5 = v12Var2.ordinal();
                                mm40 mm40VarN5 = s5x0.N(mm40VarD4, 0.0f, f3, 0.0f, (iOrdinal5 == 2 || iOrdinal5 == 3) ? 8.0f : 0.0f, 5);
                                boolean zG9 = fetVar.g(function1) | fetVar.g(p1e0Var);
                                Object objP9 = fetVar.P();
                                if (zG9 || objP9 == cl5Var) {
                                    objP9 = new gvb0(function1, p1e0Var, (byte) 13);
                                    fetVar.o0(objP9);
                                }
                                m7x.j(y860.W(mm40VarN5, null, null, false, null, (Function0) objP9, 28), n1e0Var, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                if (!(p1e0Var instanceof o1e0)) {
                                    throw b1j.f(276293179, fetVar, false);
                                }
                                fetVar.e0(-23749726);
                                mm40 mm40VarD5 = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar12 = qmk.f28987a;
                                mm40 mm40VarN6 = s5x0.N(mm40VarD5, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                o1e0 o1e0Var = (o1e0) p1e0Var;
                                boolean zG10 = fetVar.g(function1);
                                Object objP10 = fetVar.P();
                                if (zG10 || objP10 == cl5Var) {
                                    objP10 = new dvd0(function1, (byte) 7);
                                    fetVar.o0(objP10);
                                }
                                n7x.i(mm40VarN6, o1e0Var, (Function1) objP10, fetVar, 0);
                                fetVar.r(false);
                            }
                            fetVar.r(false);
                        } else {
                            if (hvk0Var instanceof bbr0) {
                                fetVar.e0(-1274772098);
                                final bbr0 bbr0Var = (bbr0) hvk0Var;
                                bbr0Var.getClass();
                                function1.getClass();
                                if (bbr0Var instanceof yar0) {
                                    fetVar.e0(689589495);
                                    pz40 pz40VarF = androidx.compose.runtime.e.f(bbr0Var, fetVar);
                                    mm40 mm40VarD6 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                    int iOrdinal6 = ((yar0) bbr0Var).g.ordinal();
                                    mm40 mm40VarE4 = o7k0.e(i120.Q(s5x0.N(mm40VarD6, 0.0f, (iOrdinal6 == 1 || iOrdinal6 == 2) ? 8.0f : 0.0f, 0.0f, 0.0f, 13), s6t0.b().f33626a.getBackgroundContent(), vgg0.a(16.0f)), 72.0f);
                                    boolean zG11 = fetVar.g(function1) | fetVar.g(bbr0Var);
                                    Object objP11 = fetVar.P();
                                    if (zG11 || objP11 == cl5Var) {
                                        objP11 = new Function0() { // from class: a.c9r0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                byte b5 = b3;
                                                bbr0 bbr0Var2 = bbr0Var;
                                                Function1 function3 = function1;
                                                switch (b5) {
                                                    case 0:
                                                        function3.invoke(new yqk0(((yar0) bbr0Var2).f42314a));
                                                        break;
                                                    default:
                                                        function3.invoke(new yqk0(((abr0) bbr0Var2).f593a));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        };
                                        fetVar.o0(objP11);
                                    }
                                    ihm0.c(s5x0.J(y860.W(mm40VarE4, null, null, false, null, (Function0) objP11, 28), 8.0f), pz40VarF, fetVar, 0);
                                    fetVar.r(false);
                                } else if (bbr0Var instanceof abr0) {
                                    fetVar.e0(690674836);
                                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(bbr0Var, fetVar);
                                    mm40 mm40VarD7 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                    v12 v12Var3 = ((abr0) bbr0Var).j;
                                    int iOrdinal7 = v12Var3.ordinal();
                                    float f4 = (iOrdinal7 == 1 || iOrdinal7 == 2) ? 4.0f : 0.0f;
                                    int iOrdinal8 = v12Var3.ordinal();
                                    mm40 mm40VarN7 = s5x0.N(mm40VarD7, 0.0f, f4, 0.0f, (iOrdinal8 == 2 || iOrdinal8 == 3) ? 8.0f : 0.0f, 5);
                                    boolean zG12 = fetVar.g(function1) | fetVar.g(bbr0Var);
                                    Object objP12 = fetVar.P();
                                    if (zG12 || objP12 == cl5Var) {
                                        objP12 = new Function0() { // from class: a.c9r0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                byte b5 = b2;
                                                bbr0 bbr0Var2 = bbr0Var;
                                                Function1 function3 = function1;
                                                switch (b5) {
                                                    case 0:
                                                        function3.invoke(new yqk0(((yar0) bbr0Var2).f42314a));
                                                        break;
                                                    default:
                                                        function3.invoke(new yqk0(((abr0) bbr0Var2).f593a));
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        };
                                        fetVar.o0(objP12);
                                    }
                                    qim0.e(y860.W(mm40VarN7, null, null, false, null, (Function0) objP12, 28), pz40VarF2, fetVar, 0);
                                    fetVar.r(false);
                                } else {
                                    if (!(bbr0Var instanceof zar0)) {
                                        throw b1j.f(714980385, fetVar, false);
                                    }
                                    fetVar.e0(691718482);
                                    ohm0.e(o7k0.d(s5x0.K(jm40Var2, qmk.a(fetVar).c, 8.0f), 1.0f), androidx.compose.runtime.e.f(bbr0Var, fetVar), fetVar, 0);
                                    fetVar.r(false);
                                }
                                fetVar.r(false);
                            } else {
                                if (hvk0Var instanceof mcv0) {
                                    fetVar.e0(-1274768851);
                                    mcv0 mcv0Var = (mcv0) hvk0Var;
                                    mcv0Var.getClass();
                                    function1.getClass();
                                    if (mcv0Var instanceof icv0) {
                                        fetVar.e0(-1405947015);
                                        pz40 pz40VarF3 = androidx.compose.runtime.e.f(mcv0Var, fetVar);
                                        mm40 mm40VarD8 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                        int iOrdinal9 = ((icv0) mcv0Var).f.ordinal();
                                        mm40 mm40VarE5 = o7k0.e(s5x0.N(mm40VarD8, 0.0f, (iOrdinal9 == 1 || iOrdinal9 == 2) ? 4.0f : 0.0f, 0.0f, 0.0f, 13), 64.0f);
                                        long backgroundContent3 = s6t0.b().f33626a.getBackgroundContent();
                                        zcl zclVar13 = qmk.k;
                                        ugg0 ugg0Var3 = vgg0.f37379a;
                                        ktt0.f(s5x0.L(i120.Q(mm40VarE5, backgroundContent3, new ugg0(zclVar13, zclVar13, zclVar13, zclVar13)), 12.0f, 0.0f, 2), pz40VarF3, function1, fetVar, 0);
                                        fetVar.r(false);
                                    } else {
                                        if (mcv0Var instanceof kcv0) {
                                            fetVar.e0(-1405015186);
                                            vic.n(o7k0.d(jm40Var2, 1.0f), androidx.compose.runtime.e.f(mcv0Var, fetVar), function1, fetVar, 6);
                                            fetVar.r(false);
                                        } else {
                                            if (mcv0Var instanceof lcv0) {
                                                fetVar.e0(-1404662468);
                                                wbv0 wbv0Var = ((lcv0) mcv0Var).b;
                                                pz40 pz40VarF4 = androidx.compose.runtime.e.f(wbv0Var, fetVar);
                                                mm40 mm40VarD9 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                                long backgroundContent4 = s6t0.b().f33626a.getBackgroundContent();
                                                int iOrdinal10 = wbv0Var.f.ordinal();
                                                if (iOrdinal10 == 0) {
                                                    yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                                                } else if (iOrdinal10 != 1) {
                                                    if (iOrdinal10 == 2) {
                                                        yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                                    } else {
                                                        if (iOrdinal10 != 3) {
                                                            t9f.b();
                                                            return null;
                                                        }
                                                        zcl zclVar14 = qmk.i;
                                                        ugg0 ugg0Var4 = vgg0.f37379a;
                                                        yjj0VarC = new ugg0(zclVar14, zclVar14, zclVar14, zclVar14);
                                                    }
                                                }
                                                mm40 mm40VarQ2 = i120.Q(mm40VarD9, backgroundContent4, yjj0VarC);
                                                boolean zG13 = fetVar.g(mcv0Var);
                                                Object objP13 = fetVar.P();
                                                if (zG13 || objP13 == cl5Var) {
                                                    objP13 = new npt0(mcv0Var, (byte) 28);
                                                    fetVar.o0(objP13);
                                                }
                                                mm40 mm40VarE6 = o7k0.e(rq8.K(mm40VarQ2, (Function1) objP13), 60.0f);
                                                z3 = false;
                                                jtm0.i(mm40VarE6, pz40VarF4, function1, fetVar, 0);
                                                fetVar.r(false);
                                            } else if (mcv0Var instanceof hcv0) {
                                                fetVar.e0(-1402762044);
                                                pz40 pz40VarF5 = androidx.compose.runtime.e.f(mcv0Var, fetVar);
                                                mm40 mm40VarE7 = o7k0.e(s5x0.N(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), 0.0f, 4.0f, 0.0f, 8.0f, 5), 64.0f);
                                                long backgroundContent5 = s6t0.b().f33626a.getBackgroundContent();
                                                zcl zclVar15 = qmk.k;
                                                ugg0 ugg0Var5 = vgg0.f37379a;
                                                mm40 mm40VarQ3 = i120.Q(mm40VarE7, backgroundContent5, new ugg0(zclVar15, zclVar15, zclVar15, zclVar15));
                                                boolean zG14 = fetVar.g(function1);
                                                Object objP14 = fetVar.P();
                                                if (zG14 || objP14 == cl5Var) {
                                                    objP14 = new ntu0(function1, (byte) 11);
                                                    fetVar.o0(objP14);
                                                }
                                                z3 = false;
                                                btm0.l(s5x0.K(y860.W(mm40VarQ3, null, null, false, null, (Function0) objP14, 28), 12.0f, 2.0f), pz40VarF5, fetVar, 0);
                                                fetVar.r(false);
                                            } else {
                                                if (!(mcv0Var instanceof jcv0)) {
                                                    throw b1j.f(-1569372509, fetVar, false);
                                                }
                                                fetVar.e0(-1401819613);
                                                mm40 mm40VarD10 = o7k0.d(jm40Var2, 1.0f);
                                                fyl fylVar = ((jcv0) mcv0Var).f16298a;
                                                vxl vxlVar = vxl.f38204a;
                                                boolean zG15 = fetVar.g(function1);
                                                Object objP15 = fetVar.P();
                                                if (zG15 || objP15 == cl5Var) {
                                                    objP15 = new szu0(function1, (byte) 4);
                                                    fetVar.o0(objP15);
                                                }
                                                ebc.r(mm40VarD10, fylVar, vxlVar, (Function1) objP15, null, fetVar, 390, 40);
                                                fetVar = fetVar;
                                                z = false;
                                                fetVar.r(false);
                                            }
                                            z = z3;
                                        }
                                        fetVar.r(z);
                                    }
                                    z = false;
                                    fetVar.r(z);
                                } else {
                                    z = false;
                                    if (hvk0Var instanceof l0) {
                                        fetVar.e0(-1274760361);
                                        ay3.a((l0) hvk0Var, function1, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof g6l) {
                                        fetVar.e0(-862751476);
                                        zcl zclVar16 = qmk.f28987a;
                                        z2 = false;
                                        dub.U((g6l) hvk0Var, s5x0.J(i120.Q(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 8.0f), fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof z5l) {
                                        fetVar.e0(-862171001);
                                        zcl zclVar17 = qmk.f28987a;
                                        mm40 mm40VarD11 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                        long backgroundContent6 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                        z5l z5lVar = (z5l) hvk0Var;
                                        if (z5lVar.e) {
                                            yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                        }
                                        mm40 mm40VarN8 = s5x0.N(i120.Q(mm40VarD11, backgroundContent6, yjj0VarC), 8.0f, 0.0f, 8.0f, 8.0f, 2);
                                        z2 = false;
                                        vtb.H(z5lVar, mm40VarN8, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof m110) {
                                        fetVar.e0(-861372937);
                                        zcl zclVar18 = qmk.f28987a;
                                        z2 = false;
                                        kcx.o((m110) hvk0Var, s5x0.N(i120.Q(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 8.0f, 8.0f, 8.0f, 0.0f, 8), fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof g110) {
                                        fetVar.e0(-860732260);
                                        zcl zclVar19 = qmk.f28987a;
                                        mm40 mm40VarD12 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                        long backgroundContent7 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                        g110 g110Var = (g110) hvk0Var;
                                        if (g110Var.j) {
                                            yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                        }
                                        mm40 mm40VarQ4 = i120.Q(mm40VarD12, backgroundContent7, yjj0VarC);
                                        z2 = false;
                                        x9x.s(g110Var, s5x0.M(mm40VarQ4, 8.0f, g110Var.i ? 8.0f : 0.0f, 8.0f, 8.0f), fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof c610) {
                                        fetVar.e0(-859745220);
                                        zcl zclVar20 = qmk.f28987a;
                                        z2 = false;
                                        uvw.c((c610) hvk0Var, s5x0.N(i120.Q(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 8.0f, 8.0f, 8.0f, 0.0f, 8), fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof g610) {
                                        fetVar.e0(-859091089);
                                        zcl zclVar21 = qmk.f28987a;
                                        mm40 mm40VarD13 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                        long backgroundContent8 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                        g610 g610Var = (g610) hvk0Var;
                                        if (g610Var.f10741a) {
                                            yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                        }
                                        mm40 mm40VarQ5 = i120.Q(mm40VarD13, backgroundContent8, yjj0VarC);
                                        z2 = false;
                                        ufx.c(g610Var, s5x0.M(mm40VarQ5, 8.0f, 8.0f, 8.0f, g610Var.f10741a ? 8.0f : 0.0f), fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof h9d) {
                                        fetVar.e0(-858083961);
                                        zcl zclVar22 = qmk.f28987a;
                                        z2 = false;
                                        acb.h((h9d) hvk0Var, s5x0.N(i120.Q(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 8.0f, 8.0f, 8.0f, 0.0f, 8), fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof l9d) {
                                        fetVar.e0(-1274585093);
                                        zcl zclVar23 = qmk.f28987a;
                                        mm40 mm40VarD14 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                        long backgroundContent9 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                        l9d l9dVar = (l9d) hvk0Var;
                                        if (l9dVar.f19645a) {
                                            yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                        }
                                        mm40 mm40VarQ6 = i120.Q(mm40VarD14, backgroundContent9, yjj0VarC);
                                        z2 = false;
                                        plc.e(s5x0.M(mm40VarQ6, 8.0f, 8.0f, 8.0f, l9dVar.f19645a ? 8.0f : 0.0f), l9dVar, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (hvk0Var instanceof lxb0) {
                                        fetVar.e0(-1274552954);
                                        lxb0 lxb0Var = (lxb0) hvk0Var;
                                        lxb0Var.getClass();
                                        function1.getClass();
                                        if (lxb0Var instanceof jxb0) {
                                            fetVar.e0(-1759756529);
                                            zcl zclVar24 = qmk.f28987a;
                                            mm40 mm40VarN9 = s5x0.N(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                            long backgroundContent10 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                            zcl zclVar25 = qmk.f;
                                            ugg0 ugg0Var6 = vgg0.f37379a;
                                            mm40 mm40VarQ7 = i120.Q(mm40VarN9, backgroundContent10, new ugg0(zclVar25, zclVar25, zclVar25, zclVar25));
                                            boolean zG16 = fetVar.g(function1);
                                            Object objP16 = fetVar.P();
                                            if (zG16 || objP16 == cl5Var) {
                                                objP16 = new wta0(function1, (byte) 21);
                                                fetVar.o0(objP16);
                                            }
                                            z = false;
                                            ieb.x(y860.W(mm40VarQ7, null, null, false, null, (Function0) objP16, 28), (jxb0) lxb0Var, function1, fetVar, 0);
                                            fetVar.r(false);
                                        } else {
                                            if (!(lxb0Var instanceof kxb0)) {
                                                throw b1j.f(-1442241563, fetVar, false);
                                            }
                                            fetVar.e0(-1759073785);
                                            zcl zclVar26 = qmk.f28987a;
                                            mm40 mm40VarD15 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                            kxb0 kxb0Var = (kxb0) lxb0Var;
                                            int iOrdinal11 = kxb0Var.e.ordinal();
                                            mm40 mm40VarN10 = s5x0.N(mm40VarD15, 0.0f, (iOrdinal11 == 1 || iOrdinal11 == 2) ? 8.0f : 0.0f, 0.0f, 0.0f, 13);
                                            long backgroundContent11 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                            zcl zclVar27 = qmk.g;
                                            ugg0 ugg0Var7 = vgg0.f37379a;
                                            z = false;
                                            d7x.i(i120.Q(mm40VarN10, backgroundContent11, new ugg0(zclVar27, zclVar27, zclVar27, zclVar27)), kxb0Var, fetVar, 0);
                                            fetVar.r(false);
                                        }
                                        fetVar.r(z);
                                    } else {
                                        z = false;
                                        if (hvk0Var instanceof ip20) {
                                            fetVar.e0(-1274549537);
                                            s5x0.r((ip20) hvk0Var, fetVar, 0);
                                            fetVar.r(false);
                                        } else if (hvk0Var instanceof thh) {
                                            fetVar.e0(-1274547125);
                                            zcl zclVar28 = qmk.f28987a;
                                            z = false;
                                            ieb.l(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), (thh) hvk0Var, function1, fetVar, 0);
                                            fetVar.r(false);
                                        } else {
                                            z = false;
                                            if (hvk0Var instanceof i0h) {
                                                fetVar.e0(-1274536329);
                                                dtb.d(((i0h) hvk0Var).f13948a, function1, fetVar, 0);
                                                fetVar.r(false);
                                            } else if (hvk0Var instanceof p0h) {
                                                fetVar.e0(-1274529798);
                                                zcl zclVar29 = qmk.f28987a;
                                                z2 = false;
                                                vic.b(s5x0.N(i120.Q(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 8.0f, 8.0f, 8.0f, 0.0f, 8), (p0h) hvk0Var, fetVar, 0);
                                                fetVar.r(false);
                                            } else if (hvk0Var instanceof o0h) {
                                                fetVar.e0(-1274508922);
                                                zcl zclVar30 = qmk.f28987a;
                                                mm40 mm40VarD16 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                                long backgroundContent12 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                                o0h o0hVar = (o0h) hvk0Var;
                                                if (o0hVar.d) {
                                                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                                }
                                                mm40 mm40VarQ8 = i120.Q(mm40VarD16, backgroundContent12, yjj0VarC);
                                                boolean zG17 = fetVar.g(function1) | fetVar.g(hvk0Var);
                                                Object objP17 = fetVar.P();
                                                if (zG17 || objP17 == cl5Var) {
                                                    objP17 = new us10(function1, hvk0Var, (byte) 0);
                                                    fetVar.o0(objP17);
                                                }
                                                z2 = false;
                                                hic.e(s5x0.M(y860.W(mm40VarQ8, null, null, false, null, (Function0) objP17, 28), 8.0f, 8.0f, 8.0f, o0hVar.d ? 8.0f : 0.0f), o0hVar, fetVar, 0);
                                                fetVar.r(false);
                                            } else if (hvk0Var instanceof m010) {
                                                fetVar.e0(-853872146);
                                                zcl zclVar31 = qmk.f28987a;
                                                z2 = false;
                                                k9x.d((m010) hvk0Var, s5x0.N(i120.Q(o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 8.0f, 8.0f, 8.0f, 0.0f, 8), fetVar, 0);
                                                fetVar.r(false);
                                            } else if (hvk0Var instanceof n010) {
                                                fetVar.e0(-853231779);
                                                zcl zclVar32 = qmk.f28987a;
                                                mm40 mm40VarD17 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).c, 0.0f, 2), 1.0f);
                                                long backgroundContent13 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                                                n010 n010Var = (n010) hvk0Var;
                                                if (n010Var.d) {
                                                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                                }
                                                mm40 mm40VarQ9 = i120.Q(mm40VarD17, backgroundContent13, yjj0VarC);
                                                boolean zG18 = fetVar.g(function1) | fetVar.g(hvk0Var);
                                                Object objP18 = fetVar.P();
                                                if (zG18 || objP18 == cl5Var) {
                                                    objP18 = new us10(function1, hvk0Var, (byte) 1);
                                                    fetVar.o0(objP18);
                                                }
                                                z2 = false;
                                                e9x.i(n010Var, s5x0.M(y860.W(mm40VarQ9, null, null, false, null, (Function0) objP18, 28), 8.0f, 8.0f, 8.0f, n010Var.d ? 8.0f : 0.0f), fetVar, 0);
                                                fetVar.r(false);
                                            } else {
                                                z2 = false;
                                                if (hvk0Var instanceof lik0) {
                                                    fetVar.e0(-1274411689);
                                                    tfx.o(null, (lik0) hvk0Var, function1, fetVar, 0);
                                                    fetVar.r(false);
                                                }
                                            }
                                        }
                                    }
                                }
                                z2 = z;
                            }
                            fetVar.r(z2);
                        }
                    }
                }
                z2 = false;
                fetVar.r(z2);
            }
            fetVar.e0(-851998599);
            fetVar.r(z2);
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            tf40 tf40Var = (tf40) this.b.get(iIntValue);
            fetVar.e0(-2140331039);
            if (tf40Var != null) {
                boolean z = tf40Var instanceof jf40;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-2140690299);
                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2);
                    jjm jjmVar = ((jf40) tf40Var).b;
                    kjm kjmVar = kjm.f18392a;
                    boolean zG = fetVar.g(function1) | fetVar.g(tf40Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new r450(function1, tf40Var);
                        fetVar.o0(objP);
                    }
                    nkb.h(mm40VarL, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (tf40Var instanceof ff40) {
                    fetVar.e0(-2139939913);
                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarL2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    hkl hklVar = ((ff40) tf40Var).f9434a;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new cnn(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    y9a.s(mm40VarN, hklVar, null, (Function0) objP2, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (tf40Var instanceof of40) {
                    fetVar.e0(-2139124489);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    tzc0 tzc0Var = ((of40) tf40Var).f25148a;
                    a4x a4xVar = tzc0Var instanceof rzc0 ? ((rzc0) tzc0Var).b : lak0.c;
                    lq5 lq5VarA = tzc0Var.a();
                    boolean z2 = tzc0Var instanceof szc0;
                    boolean zG3 = fetVar.g(function1);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new hrk(function1, (byte) 6);
                        fetVar.o0(objP3);
                    }
                    etl.e(mm40VarN2, a4xVar, lq5VarA, z2, null, 0.0f, 0, null, (Function2) objP3, fetVar, 0, 240);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (tf40Var instanceof pf40) {
                    fetVar.e0(-2138199666);
                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarL3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    wyh wyhVar = ((pf40) tf40Var).f26883a;
                    boolean zG4 = fetVar.g(function1);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new cnn(function1, (byte) 28);
                        fetVar.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zG5 = fetVar.g(function1);
                    Object objP5 = fetVar.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new cnn(function1, (byte) 29);
                        fetVar.o0(objP5);
                    }
                    vtb.i(mm40VarN3, wyhVar, function0, (Function0) objP5, fetVar);
                    fetVar.r(false);
                } else if (tf40Var instanceof qf40) {
                    fetVar.e0(-2137013141);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    a4x a4xVar2 = ((qf40) tf40Var).f28612a;
                    float f = xfn.a(fetVar).c;
                    boolean zG6 = fetVar.g(function1);
                    Object objP6 = fetVar.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new w8v(function1, (byte) 9);
                        fetVar.o0(objP6);
                    }
                    dub.l(mm40VarN4, a4xVar2, f, (Function1) objP6, fetVar, 0);
                    fetVar.r(false);
                } else if (tf40Var instanceof if40) {
                    fetVar.e0(-2136211264);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f2 = xfn.a(fetVar).c;
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarD, f2, 8.0f);
                    szh szhVar = ((if40) tf40Var).f14669a;
                    boolean zG7 = fetVar.g(function1);
                    Object objP7 = fetVar.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new w8v(function1, (byte) 10);
                        fetVar.o0(objP7);
                    }
                    Function1 function2 = (Function1) objP7;
                    boolean zG8 = fetVar.g(function1);
                    Object objP8 = fetVar.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new t450(function1, (byte) 0);
                        fetVar.o0(objP8);
                    }
                    hkb.f(mm40VarK, szhVar, function2, (Function0) objP8, fetVar);
                    fetVar.r(false);
                } else if (tf40Var instanceof rf40) {
                    fetVar.e0(-2135127287);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarN5 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    h0i h0iVar = ((rf40) tf40Var).f30368a;
                    float f3 = xfn.a(fetVar).c;
                    boolean zG9 = fetVar.g(function1);
                    Object objP9 = fetVar.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new w8v(function1, (byte) 11);
                        fetVar.o0(objP9);
                    }
                    ro4.u(mm40VarN5, h0iVar, f3, (Function1) objP9, fetVar);
                    fetVar.r(false);
                } else if (tf40Var instanceof kf40) {
                    fetVar.e0(-2134238455);
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(jm40Var, xfn.a(fetVar).c, 4.0f, xfn.a(fetVar).c, 16.0f);
                    hkl hklVar2 = ((kf40) tf40Var).f18181a;
                    boolean zG10 = fetVar.g(function1);
                    Object objP10 = fetVar.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new cnn(function1, (byte) 22);
                        fetVar.o0(objP10);
                    }
                    y9a.s(mm40VarM, hklVar2, null, (Function0) objP10, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (tf40Var instanceof hf40) {
                    fetVar.e0(-2133428456);
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarN6 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    bml bmlVar = ((hf40) tf40Var).b;
                    lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
                    boolean zG11 = fetVar.g(function1) | fetVar.g(tf40Var);
                    Object objP11 = fetVar.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new s450(function1, tf40Var, (byte) 0);
                        fetVar.o0(objP11);
                    }
                    Function1 function3 = (Function1) objP11;
                    boolean zG12 = fetVar.g(function1) | fetVar.g(tf40Var);
                    Object objP12 = fetVar.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new s450(function1, tf40Var, (byte) 1);
                        fetVar.o0(objP12);
                    }
                    ckb.f(mm40VarN6, bmlVar, null, lh80VarT, null, null, function3, (Function1) objP12, fetVar, 0, 52);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (tf40Var instanceof gf40) {
                    fetVar.e0(-2132147877);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarL4 = s5x0.L(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), xfn.a(fetVar).c, 0.0f, 2);
                    ozh ozhVar = ((gf40) tf40Var).f11190a;
                    boolean zG13 = fetVar.g(tf40Var) | fetVar.g(function1);
                    Object objP13 = fetVar.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new r450(tf40Var, function1);
                        fetVar.o0(objP13);
                    }
                    Function0 function4 = (Function0) objP13;
                    boolean zG14 = fetVar.g(function1);
                    Object objP14 = fetVar.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new cnn(function1, (byte) 23);
                        fetVar.o0(objP14);
                    }
                    jwb.i(mm40VarL4, ozhVar, function4, (Function0) objP14, fetVar, 0);
                    fetVar.r(false);
                } else if (tf40Var instanceof sf40) {
                    fetVar.e0(-2130219770);
                    zcl zclVar10 = qmk.f28987a;
                    mm40 mm40VarN7 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    sf40 sf40Var = (sf40) tf40Var;
                    ypl yplVar = sf40Var.f32101a;
                    bql bqlVar = sf40Var.b;
                    boolean zG15 = fetVar.g(function1);
                    Object objP15 = fetVar.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new cnn(function1, (byte) 24);
                        fetVar.o0(objP15);
                    }
                    Function0 function5 = (Function0) objP15;
                    boolean zG16 = fetVar.g(function1);
                    Object objP16 = fetVar.P();
                    if (zG16 || objP16 == cl5Var) {
                        objP16 = new hrk(function1, (byte) 5);
                        fetVar.o0(objP16);
                    }
                    dyb.k(mm40VarN7, yplVar, bqlVar, function5, (Function2) objP16, fetVar, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (tf40Var instanceof mf40) {
                    fetVar.e0(-2129165212);
                    mm40 mm40VarL5 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarN8 = s5x0.N(mm40VarL5, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    a0i a0iVar = ((mf40) tf40Var).f21679a;
                    boolean zG17 = fetVar.g(function1);
                    Object objP17 = fetVar.P();
                    if (zG17 || objP17 == cl5Var) {
                        objP17 = new cnn(function1, (byte) 25);
                        fetVar.o0(objP17);
                    }
                    ntr.s(mm40VarN8, a0iVar, (Function0) objP17, fetVar, 0);
                    fetVar.r(false);
                } else if (tf40Var instanceof lf40) {
                    fetVar.e0(-2128471215);
                    mm40 mm40VarL6 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarN9 = s5x0.N(mm40VarL6, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    vf10 vf10Var = ((lf40) tf40Var).f19936a;
                    boolean zG18 = fetVar.g(function1);
                    Object objP18 = fetVar.P();
                    if (zG18 || objP18 == cl5Var) {
                        objP18 = new cnn(function1, (byte) 26);
                        fetVar.o0(objP18);
                    }
                    q0x.h(mm40VarN9, vf10Var, (Function0) objP18, fetVar, 0);
                    fetVar.r(false);
                } else if (tf40Var instanceof nf40) {
                    fetVar.e0(-1315541613);
                    mm40 mm40VarL7 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar13 = qmk.f28987a;
                    mm40 mm40VarN10 = s5x0.N(mm40VarL7, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    a4x a4xVar3 = ((nf40) tf40Var).f23418a;
                    boolean zG19 = fetVar.g(function1);
                    Object objP19 = fetVar.P();
                    if (zG19 || objP19 == cl5Var) {
                        objP19 = new w8v(function1, (byte) 7);
                        fetVar.o0(objP19);
                    }
                    Function1 function6 = (Function1) objP19;
                    boolean zG20 = fetVar.g(function1);
                    Object objP20 = fetVar.P();
                    if (zG20 || objP20 == cl5Var) {
                        objP20 = new w8v(function1, (byte) 8);
                        fetVar.o0(objP20);
                    }
                    idx.j(mm40VarN10, a4xVar3, function6, (Function1) objP20, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-1315968926, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            fdp fdpVar = (fdp) this.b.get(iIntValue);
            fetVar.e0(-1538604560);
            if (fdpVar == null) {
                fetVar.e0(-1537338924);
                fetVar.r(false);
            } else {
                boolean z = fdpVar instanceof cdp;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(227463488);
                    int i2 = ((cdp) fdpVar).f4172a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new t450(function1, (byte) 2);
                        fetVar.o0(objP);
                    }
                    hxm0.g(i2, 0, fetVar, null, (Function0) objP);
                    fetVar.r(false);
                } else if (fdpVar instanceof edp) {
                    fetVar.e0(-1538318307);
                    wcp wcpVar = ((edp) fdpVar).f7629a;
                    boolean zG2 = fetVar.g(function1) | fetVar.g(fdpVar);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new p160(function1, fdpVar, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zG3 = fetVar.g(function1) | fetVar.g(fdpVar);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new p160(function1, fdpVar, (byte) 1);
                        fetVar.o0(objP3);
                    }
                    ay3.H(null, wcpVar, function0, (Function0) objP3, fetVar, 0, 1);
                    fetVar.r(false);
                } else if (fdpVar instanceof bdp) {
                    fetVar.e0(227496202);
                    boolean zG4 = fetVar.g(function1);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new t450(function1, (byte) 3);
                        fetVar.o0(objP4);
                    }
                    pvm0.f(0, fetVar, null, (Function0) objP4);
                    fetVar.r(false);
                } else if (fdpVar instanceof ddp) {
                    fetVar.e0(227502111);
                    k5n0.g(0, fetVar, null);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1537338924);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            fdp fdpVar = (fdp) this.b.get(iIntValue);
            fetVar.e0(-896218068);
            if (fdpVar == null) {
                fetVar.e0(-895167696);
                fetVar.r(false);
            } else {
                boolean z = fdpVar instanceof cdp;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-721645484);
                    int i2 = ((cdp) fdpVar).f4172a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new t450(function1, (byte) 5);
                        fetVar.o0(objP);
                    }
                    hxm0.g(i2, 0, fetVar, null, (Function0) objP);
                    fetVar.r(false);
                } else if (fdpVar instanceof edp) {
                    fetVar.e0(-895946695);
                    wcp wcpVar = ((edp) fdpVar).f7629a;
                    boolean zG2 = fetVar.g(function1) | fetVar.g(fdpVar);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new p160(function1, fdpVar, (byte) 2);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zG3 = fetVar.g(function1) | fetVar.g(fdpVar);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new p160(function1, fdpVar, (byte) 3);
                        fetVar.o0(objP3);
                    }
                    ay3.H(null, wcpVar, function0, (Function0) objP3, fetVar, 0, 1);
                    fetVar.r(false);
                } else if (fdpVar instanceof bdp) {
                    fetVar.e0(-721619426);
                    boolean zG4 = fetVar.g(function1);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new t450(function1, (byte) 6);
                        fetVar.o0(objP4);
                    }
                    pvm0.f(0, fetVar, null, (Function0) objP4);
                    fetVar.r(false);
                } else if (fdpVar instanceof ddp) {
                    fetVar.e0(-721614013);
                    k5n0.g(0, fetVar, null);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-895167696);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            au90 au90Var = (au90) this.b.get(iIntValue);
            fetVar.e0(624759761);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(au90Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ha30(function1, au90Var, (byte) 20);
                fetVar.o0(objP);
            }
            j47.d0(null, au90Var, (Function0) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-1801864687);
            if (p6t0Var == null) {
                fetVar.e0(-1800878702);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof pqv;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-1801825039);
                    float f = xfn.a(fetVar).e - xfn.a(fetVar).d;
                    mm40 mm40VarN = s5x0.N(jm40Var, f, 0.0f, f, 0.0f, 10);
                    pqv pqvVar = (pqv) p6t0Var;
                    boolean zG = fetVar.g(function1) | fetVar.g(p6t0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new z7(function1, p6t0Var, (byte) 17);
                        fetVar.o0(objP);
                    }
                    zvw.c(mm40VarN, pqvVar, (Function0) objP, fetVar, 0, 0);
                    fetVar.r(false);
                } else if (p6t0Var instanceof my30) {
                    fetVar.e0(-1801192422);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    my30 my30Var = (my30) p6t0Var;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new w8v(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    zvw.i(mm40VarN2, my30Var, (Function1) objP2, fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1800878702);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(1458753220);
            if (p6t0Var instanceof my30) {
                fetVar.e0(1458801796);
                my30 my30Var = (my30) p6t0Var;
                Function1 function1 = this.c;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new w8v(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                zvw.i(null, my30Var, (Function1) objP, fetVar, 0, 1);
                fetVar.r(false);
            } else {
                fetVar.e0(1458989625);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            j6a0 j6a0Var = (j6a0) this.b.get(iIntValue);
            fetVar.e0(-1824399458);
            boolean z = j6a0Var.f15975a.d;
            Function1 function1 = this.c;
            n7x.f(3456, u1c.M(-1510424092, new u6a0(j6a0Var, function1, b), fetVar), u1c.M(884626725, new u6a0(j6a0Var, function1, b2), fetVar), fetVar, null, z);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            jz30 jz30Var = (jz30) this.b.get(iIntValue);
            fetVar.e0(-761479907);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(jz30Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ha30(function1, jz30Var, (byte) 21);
                fetVar.o0(objP);
            }
            mrv.P(jz30Var, (Function0) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        float f;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            j2b0 j2b0Var = (j2b0) this.b.get(iIntValue);
            fetVar2.e0(-418588355);
            if (j2b0Var != null) {
                boolean z = j2b0Var instanceof e2b0;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar2.e0(-418609622);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    float f2 = qmk.a(fetVar2).c;
                    float f3 = qmk.a(fetVar2).c;
                    e2b0 e2b0Var = (e2b0) j2b0Var;
                    boolean z2 = e2b0Var.f7076a instanceof ss5;
                    mm40 mm40VarN = s5x0.N(mm40VarD, f2, z2 ? 8.0f : 0.0f, f3, 0.0f, 8);
                    zcl zclVar2 = z2 ? qmk.i : qmk.k;
                    hkl hklVar = e2b0Var.b;
                    boolean zG = fetVar2.g(function1) | fetVar2.g(j2b0Var);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new m2b0(function1, j2b0Var, (byte) 1);
                        fetVar2.o0(objP);
                    }
                    fetVar = fetVar2;
                    y9a.s(mm40VarN, hklVar, zclVar2, (Function0) objP, fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar = fetVar2;
                    if (j2b0Var instanceof g2b0) {
                        fetVar.e0(-417295253);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        bml bmlVar = ((g2b0) j2b0Var).c;
                        lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
                        boolean zG2 = fetVar.g(function1) | fetVar.g(j2b0Var);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new n2b0(function1, j2b0Var, (byte) 0);
                            fetVar.o0(objP2);
                        }
                        Function1 function2 = (Function1) objP2;
                        boolean zG3 = fetVar.g(function1) | fetVar.g(j2b0Var);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new n2b0(function1, j2b0Var, (byte) 1);
                            fetVar.o0(objP3);
                        }
                        ckb.f(mm40VarD2, bmlVar, null, lh80VarT, null, null, function2, (Function1) objP3, fetVar, 6, 52);
                        fetVar.r(false);
                    } else if (j2b0Var instanceof f2b0) {
                        fetVar.e0(-415801797);
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        bvl bvlVar = ((f2b0) j2b0Var).f8804a;
                        boolean zG4 = fetVar.g(function1);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new v6a0(function1, (byte) 4);
                            fetVar.o0(objP4);
                        }
                        ju70.p(mm40VarD3, bvlVar, null, 0.0f, (Function1) objP4, fetVar, 6, 12);
                        fetVar.r(false);
                    } else if (j2b0Var instanceof i2b0) {
                        fetVar.e0(-414974190);
                        float f4 = xfn.a(fetVar).c;
                        float f5 = xfn.a(fetVar).c;
                        i2b0 i2b0Var = (i2b0) j2b0Var;
                        if (i2b0Var.f14039a) {
                            zcl zclVar3 = qmk.f28987a;
                            f = 8.0f;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f = 0.0f;
                        }
                        mm40 mm40VarN2 = s5x0.N(jm40Var, f4, f, f5, 0.0f, 8);
                        jml jmlVar = i2b0Var.b;
                        boolean zG5 = fetVar.g(function1);
                        Object objP5 = fetVar.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new v6a0(function1, (byte) 5);
                            fetVar.o0(objP5);
                        }
                        Function1 function3 = (Function1) objP5;
                        boolean zG6 = fetVar.g(function1);
                        Object objP6 = fetVar.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new v6a0(function1, (byte) 6);
                            fetVar.o0(objP6);
                        }
                        Function1 function4 = (Function1) objP6;
                        boolean zG7 = fetVar.g(function1);
                        Object objP7 = fetVar.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new hrk(function1, (byte) 11);
                            fetVar.o0(objP7);
                        }
                        gkb.h(mm40VarN2, jmlVar, function3, function4, (Function2) objP7, fetVar, 0);
                        fetVar.r(false);
                    } else if (j2b0Var instanceof h2b0) {
                        fetVar.e0(-413369599);
                        float f6 = xfn.a(fetVar).e;
                        float f7 = xfn.a(fetVar).e;
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarN3 = s5x0.N(jm40Var, f6, 8.0f, f7, 0.0f, 8);
                        jjm jjmVar = ((h2b0) j2b0Var).b;
                        kjm kjmVar = kjm.f18392a;
                        boolean zG8 = fetVar.g(function1) | fetVar.g(j2b0Var);
                        Object objP8 = fetVar.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new m2b0(function1, j2b0Var, (byte) 3);
                            fetVar.o0(objP8);
                        }
                        nkb.h(mm40VarN3, jjmVar, kjmVar, null, (Function0) objP8, null, fetVar, 384, 40);
                        fetVar = fetVar;
                        fetVar.r(false);
                    }
                }
                fetVar.r(false);
            } else {
                fetVar = fetVar2;
            }
            throw b1j.f(263591814, fetVar, false);
        }
        fetVar2.X();
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            oeb0 oeb0Var = (oeb0) this.b.get(iIntValue);
            fetVar.e0(957240899);
            if (oeb0Var != null) {
                boolean z4 = oeb0Var instanceof heb0;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z4) {
                    fetVar.e0(957111690);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
                    heb0 heb0Var = (heb0) oeb0Var;
                    a4x a4xVar = heb0Var.f12915a;
                    lq5 lq5Var = heb0Var.b;
                    boolean z5 = heb0Var.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new hrk(function1, (byte) 12);
                        fetVar.o0(objP);
                    }
                    z3 = false;
                    etl.e(mm40VarL, a4xVar, lq5Var, z5, null, 0.0f, 0, null, (Function2) objP, fetVar, 0, 240);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else {
                    boolean z6 = oeb0Var instanceof leb0;
                    pcy pcyVar = e7z.u1;
                    if (z6) {
                        fetVar.e0(958138286);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD2);
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
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar2 = qmk.f28987a;
                        leb0 leb0Var = (leb0) oeb0Var;
                        nkb.h(s5x0.N(mm40VarD3, qmk.a(fetVar).e, 8.0f, qmk.a(fetVar).e, 0.0f, 8), leb0Var.b, kjm.f18392a, null, null, null, fetVar, 384, 56);
                        mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                        mvy mvyVar = leb0Var.f19894a;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new t6a0(function1, (byte) 1);
                            fetVar.o0(objP2);
                        }
                        tfx.a(mm40VarD4, mvyVar, (xdr) objP2, fetVar, 6);
                        fetVar.r(true);
                        fetVar.r(false);
                        z2 = false;
                    } else if (oeb0Var instanceof neb0) {
                        fetVar.e0(959589706);
                        mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarD5, qmk.a(fetVar).c, 16.0f, qmk.a(fetVar).c, 0.0f, 8);
                        vo30 vo30Var = ((neb0) oeb0Var).f23378a;
                        boolean zG3 = fetVar.g(function1) | fetVar.g(oeb0Var);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new zu90((byte) 13, function1, oeb0Var);
                            fetVar.o0(objP3);
                        }
                        z2 = false;
                        ay3.w(mm40VarN, vo30Var, (Function1) objP3, fetVar, 0);
                        fetVar.r(false);
                    } else if (oeb0Var instanceof ieb0) {
                        fetVar.e0(961203070);
                        mm40 mm40VarD6 = o7k0.d(jm40Var, 1.0f);
                        x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD6);
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
                        mm40 mm40VarD7 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN2 = s5x0.N(mm40VarD7, qmk.a(fetVar).e, 8.0f, qmk.a(fetVar).e, 0.0f, 8);
                        ieb0 ieb0Var = (ieb0) oeb0Var;
                        jjm jjmVar = ieb0Var.c;
                        kjm kjmVar = kjm.f18392a;
                        boolean zG4 = fetVar.g(function1) | fetVar.g(oeb0Var);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new qeb0(function1, oeb0Var, (byte) 0);
                            fetVar.o0(objP4);
                        }
                        nkb.h(mm40VarN2, jjmVar, kjmVar, null, (Function0) objP4, null, fetVar, 384, 40);
                        mm40 mm40VarD8 = o7k0.d(jm40Var, 1.0f);
                        float f = qmk.a(fetVar).c;
                        ejm ejmVar = ieb0Var.b;
                        boolean zG5 = fetVar.g(function1) | fetVar.g(oeb0Var);
                        Object objP5 = fetVar.P();
                        if (zG5 || objP5 == cl5Var) {
                            z3 = false;
                            objP5 = new reb0(function1, oeb0Var, (byte) 0);
                            fetVar.o0(objP5);
                        } else {
                            z3 = false;
                        }
                        v3c.r(mm40VarD8, ejmVar, f, null, null, (Function2) objP5, fetVar, 6, 24);
                        fetVar.r(true);
                        fetVar.r(z3);
                    } else if (oeb0Var instanceof jeb0) {
                        fetVar.e0(963212118);
                        mm40 mm40VarD9 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarN3 = s5x0.N(mm40VarD9, qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 0.0f, 8);
                        jeb0 jeb0Var = (jeb0) oeb0Var;
                        i4 i4Var = jeb0Var.b;
                        String str = jeb0Var.c;
                        boolean z7 = jeb0Var.f;
                        o0x o0xVar = jeb0Var.d;
                        e900 e900Var = jeb0Var.e;
                        long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        boolean zG6 = fetVar.g(function1) | fetVar.g(oeb0Var);
                        Object objP6 = fetVar.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new reb0(function1, oeb0Var, (byte) 1);
                            fetVar.o0(objP6);
                        }
                        Function2 function2 = (Function2) objP6;
                        boolean zG7 = fetVar.g(function1) | fetVar.g(oeb0Var);
                        Object objP7 = fetVar.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new qeb0(function1, oeb0Var, (byte) 1);
                            fetVar.o0(objP7);
                        }
                        d5c.n(mm40VarN3, i4Var, str, z7, o0xVar, e900Var, jM123getWhite0d7_KjU, null, null, function2, (Function0) objP7, fetVar, 0);
                        fetVar = fetVar;
                        z2 = false;
                        fetVar.r(false);
                    } else {
                        z = false;
                    }
                    fetVar.r(z2);
                }
                z2 = z3;
                fetVar.r(z2);
            } else {
                z = false;
            }
            throw b1j.f(1554899392, fetVar, z);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            oza0 oza0Var = (oza0) this.b.get(iIntValue);
            fetVar.e0(-253065241);
            if (oza0Var != null) {
                boolean z = oza0Var instanceof dza0;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-253041000);
                    xia0.h(null, (dza0) oza0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else if (oza0Var instanceof pza0) {
                    fetVar.e0(-252773687);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 0.0f, 8);
                    zcl zclVar2 = qmk.i;
                    fkl fklVar = ((pza0) oza0Var).f27836a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new t450(function1, (byte) 7);
                        fetVar.o0(objP);
                    }
                    y9a.s(mm40VarN, fklVar, zclVar2, (Function0) objP, fetVar, 0, 0);
                    fetVar.r(false);
                } else if (oza0Var instanceof mza0) {
                    fetVar.e0(-252092400);
                    xia0.y(null, (mza0) oza0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else if (oza0Var instanceof eza0) {
                    fetVar.e0(-251861109);
                    xia0.n(null, (eza0) oza0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else if (oza0Var instanceof qza0) {
                    fetVar.e0(-251622254);
                    xia0.Q(null, (qza0) oza0Var, function1, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-1116542052, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            aec0 aec0Var = (aec0) this.b.get(iIntValue);
            fetVar.e0(-537815498);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new v6a0(function1, (byte) 9);
                fetVar.o0(objP);
            }
            n6x.e(null, aec0Var, (Function1) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            rnc0 rnc0Var = (rnc0) this.b.get(iIntValue);
            fetVar.e0(927289019);
            o0x o0xVar = rnc0Var.e;
            m0x m0xVar = o0xVar instanceof m0x ? (m0x) o0xVar : null;
            int i2 = m0xVar != null ? m0xVar.f20977a : R.drawable.ic_glyph_bonus_info;
            float f = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.K(jm40.b, f, 4.0f), 1.0f);
            rx30 rx30Var = new rx30(rnc0Var.e, 0L, null, i2, 0L, new pc5(new y3d(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60())), 438);
            String str = rnc0Var.c;
            String str2 = rnc0Var.d;
            ux30 ux30Var = new ux30(10, 0L, str, str2.length() > 0 ? str2 : null);
            o0x o0xVar2 = rnc0Var.f;
            gy30 gy30Var = new gy30(ux30Var, rx30Var, o0xVar2 != null ? new zx30(o0xVar2, 3) : cy30.f5153a, 0L, null, xx30.f41640a, 184);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(rnc0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ha30(function1, rnc0Var, (byte) 27);
                fetVar.o0(objP);
            }
            jiq0.y(mm40VarD, gy30Var, (Function0) objP, null, null, fetVar, 0, 24);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            cuc0 cuc0Var = (cuc0) this.b.get(iIntValue);
            fetVar.e0(1434410072);
            nnw0.t(null, cuc0Var, guc0.f11922a, this.c, fetVar, 384, 1);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            h6i0 h6i0Var = (h6i0) this.b.get(iIntValue);
            fetVar.e0(-114440524);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.i(h6i0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ha30(function1, h6i0Var, (byte) 29);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarD, gy40Var, null, false, null, (Function0) objP2, 28), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarQ, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(rsm0.w(h6i0Var.f12531a.f14241a, 0, fetVar), new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.n(), fetVar), fetVar, 0, 24960, 110588);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(h6i0Var.b, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 16.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, ibm0.n(g1t0.n(), fetVar), fetVar, 0, 24960, 109564);
            fetVar.r(true);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            d8f0 d8f0Var = (d8f0) this.b.get(iIntValue);
            fetVar.e0(321446892);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(d8f0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new sue0(function1, d8f0Var, (byte) 0);
                fetVar.o0(objP);
            }
            q7x.l(null, d8f0Var, (Function0) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        int i3;
        int i4;
        int i5;
        fet fetVar2;
        int i6;
        fet fetVar3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        fet fetVar4;
        float f;
        float f2;
        byte b = this.f46a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        List list = this.b;
        Function1 function1 = this.c;
        boolean z = true;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar5.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar5.e(iIntValue) ? 32 : 16;
                }
                if (fetVar5.U(i & 1, (i & 147) != 146)) {
                    g100 g100Var = (g100) list.get(iIntValue);
                    fetVar5.e0(-67913243);
                    if (g100Var == null) {
                        fetVar = fetVar5;
                    } else {
                        if (g100Var instanceof i000) {
                            fetVar5.e0(-140737874);
                            i000 i000Var = (i000) g100Var;
                            unh0.G(i000Var.f13928a, i000Var.b, fetVar5, 0);
                            fetVar5.r(false);
                        } else if (g100Var instanceof f100) {
                            fetVar5.e0(-140732563);
                            unh0.d0(null, (f100) g100Var, function1, fetVar5, 0);
                            fetVar5.r(false);
                        } else {
                            if (g100Var instanceof h000) {
                                fetVar5.e0(-140729276);
                                unh0.D((h000) g100Var, function1, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (g100Var instanceof nzz) {
                                fetVar5.e0(-67521838);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar5, 0);
                                int iHashCode = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM = fetVar5.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarL);
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
                                unh0.H(i120.Q(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar5).d, 0.0f, 2), ((ThemeColors) fetVar5.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f)), ((nzz) g100Var).f24395a, d4d.STATIC_YELLOW, d4d.BACKGROUND_CONTENT, fetVar5, 0);
                                fetVar = fetVar5;
                                fetVar.r(true);
                                fetVar.r(false);
                            } else {
                                fetVar = fetVar5;
                                if (g100Var instanceof mzz) {
                                    fetVar.e0(-66649002);
                                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                    float f3 = xfn.a(fetVar).d;
                                    zcl zclVar2 = qmk.f28987a;
                                    mm40 mm40VarK = s5x0.K(mm40VarD, f3, 12.0f);
                                    mzz mzzVar = (mzz) g100Var;
                                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(mzzVar.c), mzzVar.b, false, false);
                                    boolean zG = fetVar.g(function1) | fetVar.g(g100Var);
                                    Object objP = fetVar.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new z000(function1, g100Var, (byte) 1);
                                        fetVar.o0(objP);
                                    }
                                    qzb.n(mm40VarK, wulVar, (Function0) objP, fetVar, 0, 0);
                                    fetVar.r(false);
                                }
                            }
                            fetVar.r(false);
                        }
                        fetVar = fetVar5;
                        fetVar.r(false);
                    }
                    fetVar.e0(-65752916);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar6.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar6.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar6.U(i2 & 1, (i2 & 147) != 146)) {
                    q400 q400Var = (q400) list.get(iIntValue3);
                    fetVar6.e0(47589521);
                    if (q400Var != null) {
                        if (q400Var instanceof o400) {
                            fetVar6.e0(278631811);
                            o400 o400Var = (o400) q400Var;
                            ccq0.v(o400Var.f24609a, o400Var.b, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (q400Var instanceof m400) {
                            fetVar6.e0(278635508);
                            ccq0.E((m400) q400Var, function1, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (q400Var instanceof p400) {
                            fetVar6.e0(278638588);
                            ccq0.M(null, (p400) q400Var, function1, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (q400Var instanceof n400) {
                            fetVar6.e0(278641793);
                            ccq0.t(0, fetVar6, null, ((n400) q400Var).f22875a);
                            fetVar6.r(false);
                        }
                        fetVar6.r(false);
                    }
                    throw b1j.f(278629810, fetVar6, false);
                }
                fetVar6.X();
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar7.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar7.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar7.U(i3 & 1, (i3 & 147) != 146)) {
                    co10 co10Var = (co10) list.get(iIntValue5);
                    fetVar7.e0(-1001094546);
                    km10.k(co10Var, function1, fetVar7, 8);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 3:
                return a(obj, obj2, obj3, obj4);
            case 4:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar8.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar8.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar8.U(i4 & 1, (i4 & 147) != 146)) {
                    mg30 mg30Var = (mg30) list.get(iIntValue7);
                    fetVar8.e0(702886731);
                    Object objP2 = fetVar8.P();
                    if (objP2 == cl5Var) {
                        objP2 = dw9.j(fetVar8);
                    }
                    gy40 gy40Var = (gy40) objP2;
                    boolean zG2 = fetVar8.g(function1) | fetVar8.g(mg30Var);
                    Object objP3 = fetVar8.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new ha30(function1, mg30Var, (byte) 3);
                        fetVar8.o0(objP3);
                    }
                    b5x.f(y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP3, 28), mg30Var, fetVar8, 0);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar9.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar9.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar9.U(i5 & 1, (i5 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue9);
                    fetVar9.e0(1960476569);
                    if (p6t0Var == null) {
                        fetVar2 = fetVar9;
                    } else {
                        if (p6t0Var instanceof gsv) {
                            fetVar9.e0(1960523347);
                            nkb.h(jm40.b, ((gsv) p6t0Var).b, kjm.b, null, null, null, fetVar9, 390, 56);
                            fetVar2 = fetVar9;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar9;
                            if (p6t0Var instanceof fql0) {
                                fetVar2.e0(1960823768);
                                j47.n0(null, (fql0) p6t0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(1961031065);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar10.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar10.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar10.U(i6 & 1, (i6 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue11);
                    fetVar10.e0(111618245);
                    if (p6t0Var2 == null) {
                        fetVar3 = fetVar10;
                    } else {
                        if (p6t0Var2 instanceof gsv) {
                            fetVar10.e0(111665023);
                            nkb.h(jm40.b, ((gsv) p6t0Var2).b, kjm.b, null, null, null, fetVar10, 390, 56);
                            fetVar3 = fetVar10;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar10;
                            if (p6t0Var2 instanceof fql0) {
                                fetVar3.e0(111965444);
                                rq8.B(null, (fql0) p6t0Var2, function1, fetVar3, 0);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(112172741);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = (fetVar11.g(g9zVar7) ? 4 : 2) | iIntValue14;
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar11.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar11.U(i7 & 1, (i7 & 147) != 146)) {
                    ek00 ek00Var = (ek00) list.get(iIntValue13);
                    fetVar11.e0(954384554);
                    b8l0 b8l0Var = ek00Var.b;
                    n3l0 n3l0Var = ek00Var.c;
                    boolean zG3 = fetVar11.g(ek00Var) | fetVar11.g(function1);
                    Object objP4 = fetVar11.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new bxy(ek00Var, function1, (byte) 4);
                        fetVar11.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zG4 = fetVar11.g(ek00Var) | fetVar11.g(function1);
                    Object objP5 = fetVar11.P();
                    if (zG4 || objP5 == cl5Var) {
                        objP5 = new bxy(ek00Var, function1, (byte) 5);
                        fetVar11.o0(objP5);
                    }
                    Function0 function2 = (Function0) objP5;
                    boolean zG5 = fetVar11.g(ek00Var) | fetVar11.g(function1);
                    Object objP6 = fetVar11.P();
                    if (zG5 || objP6 == cl5Var) {
                        objP6 = new dxy(ek00Var, function1, (byte) 2);
                        fetVar11.o0(objP6);
                    }
                    xbc.o(null, b8l0Var, n3l0Var, null, false, function0, function2, null, (Function1) objP6, fetVar11, 0, 153);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = (fetVar12.g(g9zVar8) ? 4 : 2) | iIntValue16;
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar12.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar12.U(i8 & 1, (i8 & 147) != 146)) {
                    l6w l6wVar = (l6w) list.get(iIntValue15);
                    fetVar12.e0(410102685);
                    b8l0 b8l0Var2 = l6wVar.b;
                    n3l0 n3l0Var2 = l6wVar.c;
                    boolean zG6 = fetVar12.g(l6wVar) | fetVar12.g(function1);
                    Object objP7 = fetVar12.P();
                    if (zG6 || objP7 == cl5Var) {
                        objP7 = new cxy(l6wVar, function1, (byte) 4);
                        fetVar12.o0(objP7);
                    }
                    Function0 function3 = (Function0) objP7;
                    boolean zG7 = fetVar12.g(l6wVar) | fetVar12.g(function1);
                    Object objP8 = fetVar12.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new cxy(l6wVar, function1, (byte) 5);
                        fetVar12.o0(objP8);
                    }
                    Function0 function4 = (Function0) objP8;
                    boolean zG8 = fetVar12.g(l6wVar) | fetVar12.g(function1);
                    Object objP9 = fetVar12.P();
                    if (zG8 || objP9 == cl5Var) {
                        objP9 = new exy(l6wVar, function1, (byte) 2);
                        fetVar12.o0(objP9);
                    }
                    xbc.o(null, b8l0Var2, n3l0Var2, null, false, function3, function4, null, (Function1) objP9, fetVar12, 0, 153);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 9:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar13.g(g9zVar9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar13.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar13.U(i9 & 1, (i9 & 147) != 146)) {
                    i740 i740Var = (i740) list.get(iIntValue17);
                    fetVar13.e0(-2106062388);
                    mm40 mm40VarH = phu0.H(jm40Var, new ktc(ymx.INTERVAL_500, 2), 0);
                    boolean zG9 = fetVar13.g(function1) | fetVar13.g(i740Var);
                    Object objP10 = fetVar13.P();
                    if (zG9 || objP10 == cl5Var) {
                        objP10 = new r840(function1, i740Var, (byte) 0);
                        fetVar13.o0(objP10);
                    }
                    Function0 function5 = (Function0) objP10;
                    boolean zG10 = fetVar13.g(function1) | fetVar13.g(i740Var);
                    Object objP11 = fetVar13.P();
                    if (zG10 || objP11 == cl5Var) {
                        objP11 = new r840(function1, i740Var, (byte) 1);
                        fetVar13.o0(objP11);
                    }
                    Function0 function6 = (Function0) objP11;
                    boolean zG11 = fetVar13.g(function1);
                    Object objP12 = fetVar13.P();
                    if (zG11 || objP12 == cl5Var) {
                        objP12 = new w8v(function1, (byte) 5);
                        fetVar13.o0(objP12);
                    }
                    pzw.k(mm40VarH, i740Var, function5, function6, (Function1) objP12, fetVar13, 0);
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 10:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar14.g(g9zVar10) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar14.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar14.U(i10 & 1, (i10 & 147) != 146)) {
                    qa40 qa40Var = (qa40) list.get(iIntValue19);
                    fetVar14.e0(1469354586);
                    boolean zG12 = fetVar14.g(function1) | fetVar14.g(qa40Var);
                    Object objP13 = fetVar14.P();
                    if (zG12 || objP13 == cl5Var) {
                        objP13 = new ha30(function1, qa40Var, (byte) 6);
                        fetVar14.o0(objP13);
                    }
                    b5x.g(null, qa40Var, (Function0) objP13, fetVar14, 0, 1);
                    fetVar14.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 11:
                g9z g9zVar11 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar15.g(g9zVar11) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar15.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar15.U(i11 & 1, (i11 & 147) != 146)) {
                    lc40 lc40Var = (lc40) list.get(iIntValue21);
                    fetVar15.e0(-1178501723);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    rqm rqmVar = lc40Var.b;
                    boolean zI = fetVar15.i(lc40Var);
                    Object objP14 = fetVar15.P();
                    if (zI || objP14 == cl5Var) {
                        objP14 = new jc40(function1, lc40Var, (byte) 0);
                        fetVar15.o0(objP14);
                    }
                    Function0 function7 = (Function0) objP14;
                    boolean zI2 = fetVar15.i(lc40Var);
                    Object objP15 = fetVar15.P();
                    if (zI2 || objP15 == cl5Var) {
                        objP15 = new jc40(function1, lc40Var, (byte) 1);
                        fetVar15.o0(objP15);
                    }
                    obc.q(mm40VarD2, rqmVar, false, null, function7, null, (Function0) objP15, null, fetVar15, 6, 172);
                    if (lc40Var.c) {
                        fetVar15.e0(-1177695445);
                        fetVar15.r(false);
                    } else {
                        fetVar15.e0(-1178006654);
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar3 = qmk.f28987a;
                        mbc.o(zfi0.f44303a, s5x0.L(mm40VarD3, 12.0f, 0.0f, 2), false, fetVar15, 6, 4);
                        fetVar15.r(false);
                    }
                    fetVar15.r(false);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 12:
                g9z g9zVar12 = (g9z) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (fetVar16.g(g9zVar12) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= fetVar16.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar16.U(i12 & 1, (i12 & 147) != 146)) {
                    mp40 mp40Var = (mp40) list.get(iIntValue23);
                    fetVar16.e0(-667747224);
                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar16).d, 0.0f, 2);
                    rqm rqmVar2 = new rqm((vui0) new tui0(mp40Var.f22161a, null), (pui0) null, (pvi0) new nvi0(mp40Var.b), (d4d) null, (tvi0) null, mp40Var.c, false, (e900) null, 442);
                    boolean zG13 = fetVar16.g(function1);
                    if ((((i12 & 112) ^ 48) <= 32 || !fetVar16.e(iIntValue23)) && (i12 & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zG13 | z;
                    Object objP16 = fetVar16.P();
                    if (z2 || objP16 == cl5Var) {
                        objP16 = new bp40(function1, iIntValue23, (byte) 0);
                        fetVar16.o0(objP16);
                    }
                    obc.q(mm40VarL2, rqmVar2, false, null, (Function0) objP16, null, null, null, fetVar16, 0, 236);
                    fetVar16.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 13:
                return b(obj, obj2, obj3, obj4);
            case 14:
                return c(obj, obj2, obj3, obj4);
            case 15:
                return g(obj, obj2, obj3, obj4);
            case 16:
                return h(obj, obj2, obj3, obj4);
            case 17:
                return i(obj, obj2, obj3, obj4);
            case 18:
                return l(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return m(obj, obj2, obj3, obj4);
            case 20:
                return o(obj, obj2, obj3, obj4);
            case 21:
                return p(obj, obj2, obj3, obj4);
            case 22:
                return r(obj, obj2, obj3, obj4);
            case 23:
                return s(obj, obj2, obj3, obj4);
            case 24:
                return t(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return u(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return v(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return w(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return x(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar13 = (g9z) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                fet fetVar17 = (fet) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (fetVar17.g(g9zVar13) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= fetVar17.e(iIntValue25) ? 32 : 16;
                }
                int i14 = i13;
                if (fetVar17.U(i14 & 1, (i14 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) list.get(iIntValue25);
                    fetVar17.e0(-1957278488);
                    if (p6t0Var3 == null) {
                        fetVar4 = fetVar17;
                    } else {
                        if (p6t0Var3 instanceof tgt0) {
                            fetVar17.e0(-1957332925);
                            gnm0.g(g9zVar13.a(jm40Var, bgh0.f2557a, bgh0.b, null), (tgt0) p6t0Var3, fetVar17, 0);
                            fetVar17.r(false);
                        } else {
                            if (p6t0Var3 instanceof agh0) {
                                fetVar17.e0(-1956924686);
                                x2x.n(g9zVar13.a(jm40Var, bgh0.f2557a, null, null), (agh0) p6t0Var3, fetVar17, 0);
                                fetVar17.r(false);
                            } else if (p6t0Var3 instanceof x5l0) {
                                fetVar17.e0(-1956503458);
                                x5l0 x5l0Var = (x5l0) p6t0Var3;
                                a2n a2nVar = x5l0Var.b;
                                int iOrdinal = x5l0Var.c.ordinal();
                                if (iOrdinal == 1 || iOrdinal == 2) {
                                    zcl zclVar4 = qmk.f28987a;
                                    f2 = 8.0f;
                                } else {
                                    zcl zclVar5 = qmk.f28987a;
                                    f2 = 0.0f;
                                }
                                if (a2nVar instanceof y56) {
                                    fetVar17.e0(-1956167666);
                                    mm40 mm40VarN = s5x0.N(o7k0.d(g9zVar13.a(jm40Var, bgh0.f2557a, bgh0.b, null), 1.0f), 0.0f, f2, 0.0f, 0.0f, 13);
                                    y56 y56Var = (y56) a2nVar;
                                    boolean z3 = x5l0Var.d;
                                    boolean zG14 = fetVar17.g(function1);
                                    Object objP17 = fetVar17.P();
                                    if (zG14 || objP17 == cl5Var) {
                                        objP17 = new v6a0(function1, (byte) 18);
                                        fetVar17.o0(objP17);
                                    }
                                    vcc.i(mm40VarN, y56Var, z3, (Function1) objP17, null, fetVar17, 0, 16);
                                    fetVar4 = fetVar17;
                                    fetVar4.r(false);
                                } else {
                                    fetVar4 = fetVar17;
                                    fetVar4.e0(-1955393100);
                                    fetVar4.r(false);
                                }
                                fetVar4.r(false);
                            } else {
                                fetVar4 = fetVar17;
                                if (p6t0Var3 instanceof vll0) {
                                    fetVar4.e0(-1955259862);
                                    vll0 vll0Var = (vll0) p6t0Var3;
                                    nla nlaVar = vll0Var.b;
                                    int iOrdinal2 = vll0Var.c.ordinal();
                                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                                        zcl zclVar6 = qmk.f28987a;
                                        f = 8.0f;
                                    } else {
                                        zcl zclVar7 = qmk.f28987a;
                                        f = 0.0f;
                                    }
                                    mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
                                    boolean z4 = vll0Var.d;
                                    boolean zG15 = fetVar4.g(nlaVar) | fetVar4.g(function1);
                                    Object objP18 = fetVar4.P();
                                    if (zG15 || objP18 == cl5Var) {
                                        objP18 = new v22(nlaVar, function1, (byte) 2);
                                        fetVar4.o0(objP18);
                                    }
                                    rcb.C(mm40VarN2, nlaVar, z4, (Function1) objP18, fetVar4, 0);
                                    fetVar4.r(false);
                                }
                            }
                            fetVar4.r(false);
                        }
                        fetVar4 = fetVar17;
                        fetVar4.r(false);
                    }
                    fetVar4.e0(-1953452748);
                    fetVar4.r(false);
                    fetVar4.r(false);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
        }
    }
}
