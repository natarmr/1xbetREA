package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nrc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23995a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nrc0(Object obj, byte b) {
        this.f23995a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x006f, LOOP:0: B:11:0x0037->B:28:0x007c, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:4:0x0011, B:6:0x0021, B:8:0x0028, B:11:0x0037, B:13:0x0047, B:15:0x0053, B:17:0x005c, B:19:0x0065, B:24:0x0071, B:25:0x0074, B:28:0x007c, B:38:0x00a1, B:29:0x007f, B:30:0x0085, B:32:0x008b, B:34:0x0093, B:37:0x009d), top: B:48:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[EDGE_INSN: B:51:0x00a1->B:38:0x00a1 BREAK  A[LOOP:0: B:11:0x0037->B:28:0x007c], SYNTHETIC] */
    private final Object a(Object obj, Object obj2) {
        m5a m5aVarC;
        fge0 fge0Var = (fge0) this.b;
        Set set = (Set) obj;
        synchronized (fge0Var.c) {
            try {
                if (((dge0) fge0Var.u.getValue()).compareTo(dge0.e) >= 0) {
                    iz40 iz40Var = fge0Var.h;
                    if (set instanceof w1h0) {
                        iz40 iz40Var2 = ((w1h0) set).f38399a;
                        Object[] objArr = iz40Var2.b;
                        long[] jArr = iz40Var2.f15620a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj3 = objArr[(i << 3) + i3];
                                            if (!(obj3 instanceof c8m0) || ((c8m0) obj3).i(1)) {
                                                iz40Var.a(obj3);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (!(obj4 instanceof c8m0) || ((c8m0) obj4).i(1)) {
                                iz40Var.a(obj4);
                            }
                        }
                    }
                    m5aVarC = fge0Var.C();
                } else {
                    m5aVarC = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m5aVarC != null) {
            e0g0 e0g0Var = j0g0.b;
            ((n5a) m5aVarC).resumeWith(Unit.f46060a);
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        clz clzVar;
        Object value4;
        n4e0 n4e0Var;
        Object value5;
        Object value6;
        iun iunVar;
        byte b = this.f23995a;
        jm40 jm40Var = jm40.b;
        yje yjeVar = null;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                qrc0 qrc0Var = (qrc0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = qrc0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    qrc0Var.f.getClass();
                } while (!p7m0Var.m(value, zqc0.a((zqc0) value, false, true, null, null, 0, 0, 0, 0L, 0.0d, null, false, 65532)));
                return Unit.f46060a;
            case 1:
                qwc0 qwc0Var = (qwc0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                rl70 rl70Var = qwc0.Z1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) qwc0Var.J0()).y(fetVar);
                    boolean zI = fetVar.i(qwc0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        prc0 prc0Var = new prc0(1, qwc0Var, qwc0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/web_aggregator/presentation/compose/models/PromoWebAggregatorSideEffect;)V", 0, (byte) 2);
                        fetVar.o0(prc0Var);
                        objP = prc0Var;
                    }
                    qwc0Var.G0((Function1) ((jhy) objP), fetVar, 0);
                    FixedWebView fixedWebView = qwc0Var.Q1;
                    if (fixedWebView == null) {
                        fetVar.e0(-406096563);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-406096562);
                        bxc0 bxc0Var = (bxc0) pz40VarY.getValue();
                        k3t0 k3t0VarJ0 = qwc0Var.J0();
                        boolean zI2 = fetVar.i(k3t0VarJ0);
                        Object objP2 = fetVar.P();
                        if (zI2 || objP2 == cl5Var) {
                            prc0 prc0Var2 = new prc0(1, k3t0VarJ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                            fetVar.o0(prc0Var2);
                            objP2 = prc0Var2;
                        }
                        int i = FixedWebView.e;
                        m0x0.B(bxc0Var, fixedWebView, (Function1) ((jhy) objP2), fetVar, 64);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                kxc0 kxc0Var = (kxc0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                jh70 jh70Var = kxc0.Y1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) kxc0Var.J0()).y(fetVar2);
                    boolean zI3 = fetVar2.i(kxc0Var);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        prc0 prc0Var3 = new prc0(1, kxc0Var, kxc0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/web/presentation/compose/models/PromoWebSideEffect;)V", 0, (byte) 4);
                        fetVar2.o0(prc0Var3);
                        objP3 = prc0Var3;
                    }
                    kxc0Var.G0((Function1) ((jhy) objP3), fetVar2, 0);
                    FixedWebView fixedWebView2 = kxc0Var.Q1;
                    if (fixedWebView2 == null) {
                        fetVar2.e0(-1420738043);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1420738042);
                        uxc0 uxc0Var = (uxc0) pz40VarY2.getValue();
                        k3t0 k3t0VarJ1 = kxc0Var.J0();
                        boolean zI4 = fetVar2.i(k3t0VarJ1);
                        Object objP4 = fetVar2.P();
                        if (zI4 || objP4 == cl5Var) {
                            prc0 prc0Var4 = new prc0(1, k3t0VarJ1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                            fetVar2.o0(prc0Var4);
                            objP4 = prc0Var4;
                        }
                        int i2 = FixedWebView.e;
                        y0x0.u(uxc0Var, fixedWebView2, (Function1) ((jhy) objP4), fetVar2, 64);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                zyc0 zyc0Var = (zyc0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str = zyc0Var.c;
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA = y9q0.a(g1t0.e(), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(str, o7k0.e(mm40VarD, 12.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar3, 0, 0, 130044);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                azc0 azc0Var = (azc0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str2 = azc0Var.c;
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA2 = y9q0.a(g1t0.e(), ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(str2, o7k0.e(mm40VarD2, 12.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA2, fetVar4, 0, 0, 130044);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                String str3 = (String) obj2;
                ((Throwable) obj).getClass();
                str3.getClass();
                ((ned0) obj3).x(new jed0(str3));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                wdx.w((jba) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                wdx.x((kba) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 8:
                qnd0 qnd0Var = (qnd0) obj3;
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                sac.V(jiu0.a(qnd0Var), new ljc0((byte) 29), null, null, new s9c0(qnd0Var, str4, yjeVar, (byte) 16), 14);
                return Unit.f46060a;
            case 9:
                xqd0 xqd0Var = (xqd0) obj3;
                a8z a8zVar = xqd0Var.Q1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                jh70 jh70Var2 = xqd0.S1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int iOrdinal = ((llm0) xqd0Var.N1.n(xqd0Var, xqd0.U1[2])).ordinal();
                    if (iOrdinal == 0) {
                        fetVar5.e0(-827904164);
                        vdx.p((k3t0) a8zVar.getValue(), fetVar5, 0);
                        fetVar5.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar5.e0(-827901186);
                        egm0.a((k3t0) a8zVar.getValue(), fetVar5, 0);
                        fetVar5.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(-827906303, fetVar5, false);
                        }
                        fetVar5.e0(-827897730);
                        pzw.i((k3t0) a8zVar.getValue(), fetVar5, 0);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 10:
                a8z a8zVar2 = ((srd0) obj3).M1;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                nh70 nh70Var = srd0.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar6);
                    k3t0 k3t0Var = (k3t0) a8zVar2.getValue();
                    boolean zI5 = fetVar6.i(k3t0Var);
                    Object objP5 = fetVar6.P();
                    if (zI5 || objP5 == cl5Var) {
                        prc0 prc0Var5 = new prc0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                        fetVar6.o0(prc0Var5);
                        objP5 = prc0Var5;
                    }
                    cfx0.s(pz40VarY3, (Function1) ((jhy) objP5), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 11:
                esd0 esd0Var = (esd0) obj3;
                oyg0 oyg0Var = esd0Var.f;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                boolean z = th instanceof ff5;
                ocj ocjVar = esd0Var.i;
                if (z) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, yrd0.a((yrd0) value3, false, false, null, 0L, 8)));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, yrd0.a((yrd0) value2, false, true, null, 0L, 12)));
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                wb.f((nud0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                uud0 uud0Var = (uud0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                mi70 mi70Var = uud0.b2;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x0e0 x0e0Var = (x0e0) ((i3t0) uud0Var.H0()).y(fetVar7).getValue();
                    sek sekVar = uud0Var.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = uud0Var.N1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(uud0Var.G0().f46520a, uud0Var.G0().c, uud0Var.G0().e, uud0Var.G0().d, uud0Var.G0().b);
                    qdz qdzVar = uud0Var.a2;
                    xex xexVar = uud0Var.S1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(uud0Var.G0().f46520a, uud0Var.G0().c, uud0Var.G0().b, uud0Var.G0().e, 15L, uud0Var.G0().h, new lq2(), grs.b, uud0.class.getSimpleName());
                    k3t0 k3t0VarH0 = uud0Var.H0();
                    boolean zI6 = fetVar7.i(k3t0VarH0);
                    Object objP6 = fetVar7.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new prc0(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar7.o0(objP6);
                    }
                    j0x.j(x0e0Var, sekVar, bekVar, z5sVar, qdzVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP6), fetVar7, 0);
                    k3t0 k3t0VarH1 = uud0Var.H0();
                    boolean zI7 = fetVar7.i(uud0Var);
                    Object objP7 = fetVar7.P();
                    if (zI7 || objP7 == cl5Var) {
                        objP7 = new sud0(uud0Var, (byte) 0);
                        fetVar7.o0(objP7);
                    }
                    clz clzVar2 = (clz) fetVar7.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP7, fetVar7);
                    boolean zI8 = fetVar7.i(k3t0VarH1) | fetVar7.i(clzVar2) | fetVar7.e(3) | fetVar7.g(pz40VarF);
                    Object objP8 = fetVar7.P();
                    if (zI8 || objP8 == cl5Var) {
                        clzVar = clzVar2;
                        kc70 kc70Var = new kc70(k3t0VarH1, clzVar, pz40VarF, null, (byte) 9);
                        fetVar7.o0(kc70Var);
                        objP8 = kc70Var;
                    } else {
                        clzVar = clzVar2;
                    }
                    m0x0.t(fetVar7, clzVar, (Function2) objP8);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                rwd0 rwd0Var = (rwd0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                rl70 rl70Var2 = rwd0.U1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    hxd0 hxd0Var = (hxd0) rwd0Var.O1.getValue();
                    qdz qdzVar2 = rwd0Var.Q1;
                    g2v g2vVar = rwd0Var.L1;
                    if (g2vVar == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    boolean zI9 = fetVar8.i(rwd0Var);
                    Object objP9 = fetVar8.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new pwd0(rwd0Var, b4);
                        fetVar8.o0(objP9);
                    }
                    cy2.q(g2vVar, qdzVar2, hxd0Var, (Function0) objP9, fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                o2e0 o2e0Var = (o2e0) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                mi70 mi70Var2 = o2e0.b2;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    aad.y((k3t0) o2e0Var.a2.getValue(), fetVar9, 8);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 16:
                t4e0 t4e0Var = (t4e0) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var4 = t4e0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    n4e0Var = (n4e0) value4;
                    t4e0Var.f.getClass();
                } while (!p7m0Var4.m(value4, th2 instanceof ff5 ? n4e0.a(n4e0Var, null, false, false, 5) : n4e0.a(n4e0Var, null, false, true, 9)));
                return Unit.f46060a;
            case 17:
                w4e0 w4e0Var = (w4e0) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                rl70 rl70Var3 = w4e0.O1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zI10 = fetVar10.i(w4e0Var);
                    Object objP10 = fetVar10.P();
                    if (zI10 || objP10 == cl5Var) {
                        objP10 = new u4e0(w4e0Var, b2);
                        fetVar10.o0(objP10);
                    }
                    Function0 function0 = (Function0) objP10;
                    boolean zI11 = fetVar10.i(w4e0Var);
                    Object objP11 = fetVar10.P();
                    if (zI11 || objP11 == cl5Var) {
                        objP11 = new u4e0(w4e0Var, b3);
                        fetVar10.o0(objP11);
                    }
                    v3c.z(function0, (Function0) objP11, null, fetVar10, 0, 4);
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) w4e0Var.M1.getValue())).y(fetVar10);
                    boolean zI12 = fetVar10.i(w4e0Var);
                    Object objP12 = fetVar10.P();
                    if (zI12 || objP12 == cl5Var) {
                        objP12 = new v6d0(w4e0Var, (byte) 17);
                        fetVar10.o0(objP12);
                    }
                    ay3.A(pz40VarY4, (Function1) objP12, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 18:
                s5e0 s5e0Var = (s5e0) obj3;
                a8z a8zVar3 = s5e0Var.O1;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                jh70 jh70Var3 = s5e0.P1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    k3t0 k3t0Var2 = (k3t0) a8zVar3.getValue();
                    boolean zI13 = fetVar11.i(s5e0Var);
                    Object objP13 = fetVar11.P();
                    if (zI13 || objP13 == cl5Var) {
                        prc0 prc0Var6 = new prc0(1, s5e0Var, s5e0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/statistic/rating/impl/rating_history/presentation/model/RatingHistoryTableSideEffect;)V", 0, (byte) 26);
                        fetVar11.o0(prc0Var6);
                        objP13 = prc0Var6;
                    }
                    clz clzVar3 = (clz) fetVar11.k(or00.f25714a);
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP13), fetVar11);
                    boolean zI14 = fetVar11.i(k3t0Var2) | fetVar11.i(clzVar3) | fetVar11.e(3) | fetVar11.g(pz40VarF2);
                    Object objP14 = fetVar11.P();
                    if (zI14 || objP14 == cl5Var) {
                        kc70 kc70Var2 = new kc70(k3t0Var2, clzVar3, pz40VarF2, null, (byte) 10);
                        fetVar11.o0(kc70Var2);
                        objP14 = kc70Var2;
                    }
                    m0x0.t(fetVar11, clzVar3, (Function2) objP14);
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar11);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI15 = fetVar11.i(k3t0Var3);
                    Object objP15 = fetVar11.P();
                    if (zI15 || objP15 == cl5Var) {
                        prc0 prc0Var7 = new prc0(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar11.o0(prc0Var7);
                        objP15 = prc0Var7;
                    }
                    xf0.v(pz40VarY5, (Function1) ((jhy) objP15), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                xf0.B((y5e0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                a6e0 a6e0Var = (a6e0) obj3;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if (th3 instanceof ff5) {
                    a6e0Var.H(new ksc0((byte) 26));
                } else {
                    a6e0Var.H(new ksc0((byte) 27));
                }
                return Unit.f46060a;
            case 21:
                k7e0 k7e0Var = (k7e0) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                nh70 nh70Var2 = k7e0.S1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) k7e0Var.G0()).y(fetVar12);
                    j2m0 j2m0Var = k7e0Var.O1;
                    if (j2m0Var == null) {
                        Intrinsics.h("stageTableDelegate");
                        throw null;
                    }
                    k3t0 k3t0VarG0 = k7e0Var.G0();
                    boolean zI16 = fetVar12.i(k3t0VarG0);
                    Object objP16 = fetVar12.P();
                    if (zI16 || objP16 == cl5Var) {
                        prc0 prc0Var8 = new prc0(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar12.o0(prc0Var8);
                        objP16 = prc0Var8;
                    }
                    b34.H(pz40VarY6, j2m0Var, (Function1) ((jhy) objP16), fetVar12, 64);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 22:
                a8z a8zVar4 = ((f8e0) obj3).P1;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                mi70 mi70Var3 = f8e0.Q1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar13);
                    k3t0 k3t0Var4 = (k3t0) a8zVar4.getValue();
                    boolean zI17 = fetVar13.i(k3t0Var4);
                    Object objP17 = fetVar13.P();
                    if (zI17 || objP17 == cl5Var) {
                        d8e0 d8e0Var = new d8e0(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar13.o0(d8e0Var);
                        objP17 = d8e0Var;
                    }
                    hp4.r(pz40VarY7, (Function1) ((jhy) objP17), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 23:
                xce0 xce0Var = (xce0) obj3;
                a8z a8zVar5 = xce0Var.M1;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                fl70 fl70Var = xce0.N1;
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    pz40 pz40VarY8 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar14);
                    k3t0 k3t0Var5 = (k3t0) a8zVar5.getValue();
                    boolean zI18 = fetVar14.i(xce0Var);
                    Object objP18 = fetVar14.P();
                    if (zI18 || objP18 == cl5Var) {
                        d8e0 d8e0Var2 = new d8e0(1, xce0Var, xce0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits/ie/impl/presentation/lock_screens/reality_limit/models/RealityLimitLockScreenSideEffect;)V", 0, (byte) 3);
                        fetVar14.o0(d8e0Var2);
                        objP18 = d8e0Var2;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP18), fetVar14);
                    boolean zI19 = fetVar14.i(k3t0Var5) | fetVar14.i(xce0Var) | fetVar14.e(3) | fetVar14.g(pz40VarF3);
                    Object objP19 = fetVar14.P();
                    if (zI19 || objP19 == cl5Var) {
                        nu80 nu80Var = new nu80(k3t0Var5, xce0Var, pz40VarF3, null, (byte) 13);
                        fetVar14.o0(nu80Var);
                        objP19 = nu80Var;
                    }
                    m0x0.t(fetVar14, xce0Var, (Function2) objP19);
                    k3t0 k3t0Var6 = (k3t0) a8zVar5.getValue();
                    boolean zI20 = fetVar14.i(k3t0Var6);
                    Object objP20 = fetVar14.P();
                    if (zI20 || objP20 == cl5Var) {
                        d8e0 d8e0Var3 = new d8e0(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar14.o0(d8e0Var3);
                        objP20 = d8e0Var3;
                    }
                    kc5.v0(pz40VarY8, (Function1) ((jhy) objP20), fetVar14, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 24:
                nde0 nde0Var = (nde0) obj3;
                Throwable th4 = (Throwable) obj;
                String str5 = (String) obj2;
                b1j.z(str5, th4);
                if (th4 instanceof zhi0) {
                    nde0Var.w(new kde0(str5));
                } else {
                    nde0Var.w(lde0.f19847a);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                bfe0 bfe0Var = (bfe0) obj3;
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                rl70 rl70Var4 = bfe0.R1;
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    k3t0 k3t0VarG1 = bfe0Var.G0();
                    boolean zI21 = fetVar15.i(bfe0Var);
                    Object objP21 = fetVar15.P();
                    if (zI21 || objP21 == cl5Var) {
                        d8e0 d8e0Var4 = new d8e0(1, bfe0Var, bfe0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/recommended/presentation/models/RecommendedGamesSideEffect;)V", 0, (byte) 6);
                        fetVar15.o0(d8e0Var4);
                        objP21 = d8e0Var4;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP21), fetVar15);
                    boolean zI22 = fetVar15.i(k3t0VarG1) | fetVar15.i(bfe0Var) | fetVar15.e(3) | fetVar15.g(pz40VarF4);
                    Object objP22 = fetVar15.P();
                    if (zI22 || objP22 == cl5Var) {
                        nu80 nu80Var2 = new nu80(k3t0VarG1, bfe0Var, pz40VarF4, null, (byte) 14);
                        fetVar15.o0(nu80Var2);
                        objP22 = nu80Var2;
                    }
                    m0x0.t(fetVar15, bfe0Var, (Function2) objP22);
                    mm40 mm40VarE0 = o2e.e0(yyw.X(jm40Var, 0, fetVar15, 1), "RECOMMENDED_SCREEN");
                    pz40 pz40VarY9 = ((i3t0) bfe0Var.G0()).y(fetVar15);
                    k3t0 k3t0VarG2 = bfe0Var.G0();
                    boolean zI23 = fetVar15.i(k3t0VarG2);
                    Object objP23 = fetVar15.P();
                    if (zI23 || objP23 == cl5Var) {
                        objP23 = new d8e0(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar15.o0(objP23);
                    }
                    j47.g0(0, fetVar15, mm40VarE0, pz40VarY9, (Function1) ((jhy) objP23));
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return a(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                a8z a8zVar6 = ((bje0) obj3).M1;
                fet fetVar16 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                zie0 zie0Var = bje0.P1;
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    pz40 pz40VarY10 = ((i3t0) ((k3t0) a8zVar6.getValue())).y(fetVar16);
                    k3t0 k3t0Var7 = (k3t0) a8zVar6.getValue();
                    boolean zI24 = fetVar16.i(k3t0Var7);
                    Object objP24 = fetVar16.P();
                    if (zI24 || objP24 == cl5Var) {
                        d8e0 d8e0Var5 = new d8e0(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar16.o0(d8e0Var5);
                        objP24 = d8e0Var5;
                    }
                    dj8.K(pz40VarY10, (Function1) ((jhy) objP24), fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                dj8.q((fje0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                kje0 kje0Var = (kje0) obj3;
                oyg0 oyg0Var2 = kje0Var.f;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((String) obj2).getClass();
                boolean z2 = th5 instanceof ff5;
                ocj ocjVar2 = kje0Var.i;
                if (z2) {
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value6 = p7m0Var5.getValue();
                        value6.getClass();
                        oyg0Var2.getClass();
                        iunVar = iun.f15405a;
                        iunVar.getClass();
                    } while (!p7m0Var5.m(value6, new dje0(iunVar, false, false)));
                } else {
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var6.getValue();
                        value5.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var6.m(value5, dje0.a((dje0) value5, false, true)));
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ nrc0(Object obj, int i, byte b) {
        this.f23995a = b;
        this.b = obj;
    }
}
