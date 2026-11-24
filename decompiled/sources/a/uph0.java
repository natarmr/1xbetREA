package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uph0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36065a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uph0(plp plpVar, int i) {
        this.f36065a = (byte) 29;
        this.b = plpVar;
    }

    private final Object a(Object obj, Object obj2) {
        rlj0 rlj0Var = (rlj0) this.b;
        a8z a8zVar = rlj0Var.N1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        eke0 eke0Var = rlj0.O1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(rlj0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                uki0 uki0Var = new uki0(1, rlj0Var, rlj0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/share_app/impl/presentation/models/ShareAppByQrCodeSideEffect;)V", 0, (byte) 18);
                fetVar.o0(uki0Var);
                objP = uki0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(rlj0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                nu80 nu80Var = new nu80(k3t0Var, rlj0Var, pz40VarF, null, (byte) 29);
                fetVar.o0(nu80Var);
                objP2 = nu80Var;
            }
            m0x0.t(fetVar, rlj0Var, (Function2) objP2);
            m0x0.C((k3t0) a8zVar.getValue(), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        Object tmj0Var;
        mm40 mm40Var;
        umj0 umj0Var = (umj0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        lme0 lme0Var = umj0.S1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) umj0Var.G0()).y(fetVar);
            k3t0 k3t0VarG0 = umj0Var.G0();
            boolean zI = fetVar.i(umj0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new rai0(umj0Var, (byte) 13);
                fetVar.o0(objP);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(umj0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                mm40Var = null;
                tmj0Var = new tmj0(k3t0VarG0, umj0Var, pz40VarF, null, (byte) 0);
                fetVar.o0(tmj0Var);
            } else {
                tmj0Var = objP2;
                mm40Var = null;
            }
            m0x0.t(fetVar, umj0Var, (Function2) tmj0Var);
            k3t0 k3t0VarG1 = umj0Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                uki0 uki0Var = new uki0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                fetVar.o0(uki0Var);
                objP3 = uki0Var;
            }
            y0x0.w(0, fetVar, mm40Var, pz40VarY, (Function1) ((jhy) objP3));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[LOOP:0: B:14:0x002f->B:27:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006d A[EDGE_INSN: B:28:0x006d->B:29:0x006e BREAK  A[LOOP:0: B:14:0x002f->B:27:0x006a]] */
    /* JADX WARN: Code duplicated, block: B:39:0x006d A[SYNTHETIC] */
    private final Object c(Object obj, Object obj2) {
        jbi0 jbi0Var;
        c4k0 c4k0Var = (c4k0) this.b;
        Set set = (Set) obj;
        synchronized (c4k0Var.b) {
            try {
                iz40 iz40Var = c4k0Var.e;
                if (iz40Var != null) {
                    Object[] objArr = iz40Var.b;
                    long[] jArr = iz40Var.f15620a;
                    int length = jArr.length - 2;
                    if (length < 0) {
                        jbi0Var = null;
                        break;
                    }
                    int i = 0;
                    loop0: while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                                    jbi0Var = c4k0Var.g;
                                    break loop0;
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i == length) {
                                    i++;
                                }
                            }
                            jbi0Var = null;
                            break;
                        }
                        if (i == length) {
                            jbi0Var = null;
                            break;
                        }
                        i++;
                    }
                } else {
                    if (!CollectionsKt.L(set, c4k0Var.c)) {
                        jbi0Var = null;
                        break;
                    }
                    jbi0Var = c4k0Var.g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jbi0Var != null) {
            jbi0Var.f(Unit.f46060a);
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        a8z a8zVar = ((y4k0) this.b).R1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        gne0 gne0Var = y4k0.S1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                gvj0 gvj0Var = new gvj0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                fetVar.o0(gvj0Var);
                objP = gvj0Var;
            }
            ay3.E(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n0i0 n0i0Var;
        m1i0 m1i0Var;
        m1i0 m1i0Var2;
        Object value;
        swi0 swi0Var;
        swi0 swi0Var2;
        Object nu80Var;
        Function1 function1;
        r6j0 r6j0Var;
        kuw kuwVar;
        ofj0 ofj0Var;
        ofj0 ofj0Var2;
        byte b = this.f36065a;
        byte b2 = 4;
        byte b3 = 9;
        byte b4 = 8;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b5 = 2;
        byte b6 = 3;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                xph0 xph0Var = (xph0) obj3;
                a8z a8zVar = xph0Var.O1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                lme0 lme0Var = xph0.Q1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        jjh0 jjh0Var = new jjh0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar.o0(jjh0Var);
                        objP = jjh0Var;
                    }
                    xph0Var.H0(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                cqh0 cqh0Var = (cqh0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gne0 gne0Var = cqh0.N1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarQ = gkb.Q(cqh0Var.H0().K, null, fetVar2, 0, 7);
                    pz40 pz40VarQ2 = gkb.Q(vtb.N(cqh0Var.H0().D), null, fetVar2, 0, 7);
                    irh0 irh0VarH0 = cqh0Var.H0();
                    boolean zI2 = fetVar2.i(irh0VarH0);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new lph0(0, irh0VarH0, irh0.class, "onRefreshData", "onRefreshData()V", 0, (byte) 2);
                        fetVar2.o0(objP2);
                    }
                    jhy jhyVar = (jhy) objP2;
                    irh0 irh0VarH1 = cqh0Var.H0();
                    boolean zI3 = fetVar2.i(irh0VarH1);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new lph0(0, irh0VarH1, irh0.class, "onReceiveGiftClicked", "onReceiveGiftClicked()V", 0, (byte) 3);
                        fetVar2.o0(objP3);
                    }
                    crh0 crh0Var = (crh0) pz40VarQ.getValue();
                    boolean zBooleanValue = ((Boolean) pz40VarQ2.getValue()).booleanValue();
                    Function0 function0 = (Function0) jhyVar;
                    Function0 function2 = (Function0) ((jhy) objP3);
                    boolean zI4 = fetVar2.i(cqh0Var);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new gwg0((Object) cqh0Var, (byte) 16);
                        fetVar2.o0(objP4);
                    }
                    ccq0.I(function0, function2, (Function1) objP4, crh0Var, zBooleanValue, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                izh0 izh0Var = (izh0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                lme0 lme0Var2 = izh0.S1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI5 = fetVar3.i(izh0Var);
                    Object objP5 = fetVar3.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new gzh0(izh0Var, (byte) 2);
                        fetVar3.o0(objP5);
                    }
                    Function0 function3 = (Function0) objP5;
                    boolean zI6 = fetVar3.i(izh0Var);
                    Object objP6 = fetVar3.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new gzh0(izh0Var, (byte) 3);
                        fetVar3.o0(objP6);
                    }
                    v3c.z(function3, (Function0) objP6, null, fetVar3, 0, 4);
                    k3t0 k3t0VarG0 = izh0Var.G0();
                    boolean zI7 = fetVar3.i(izh0Var);
                    Object objP7 = fetVar3.P();
                    if (zI7 || objP7 == cl5Var) {
                        nxh0 nxh0Var = new nxh0(1, izh0Var, izh0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/hltv_awards/presentation/select_award/screen/model/SelectAwardSideEffect;)V", 0, (byte) 1);
                        fetVar3.o0(nxh0Var);
                        objP7 = nxh0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP7), fetVar3);
                    boolean zI8 = fetVar3.i(k3t0VarG0) | fetVar3.i(izh0Var) | fetVar3.e(3) | fetVar3.g(pz40VarF);
                    Object objP8 = fetVar3.P();
                    if (zI8 || objP8 == cl5Var) {
                        nu80 nu80Var2 = new nu80(k3t0VarG0, izh0Var, pz40VarF, null, (byte) 22);
                        fetVar3.o0(nu80Var2);
                        objP8 = nu80Var2;
                    }
                    m0x0.t(fetVar3, izh0Var, (Function2) objP8);
                    pz40 pz40VarY2 = ((i3t0) izh0Var.G0()).y(fetVar3);
                    boolean zI9 = fetVar3.i(izh0Var);
                    Object objP9 = fetVar3.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new gwg0((Object) izh0Var, (byte) 20);
                        fetVar3.o0(objP9);
                    }
                    bww.t(pz40VarY2, (Function1) objP9, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                n0i0 n0i0Var2 = (n0i0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                gne0 gne0Var2 = n0i0.R1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) n0i0Var2.G0()).y(fetVar4);
                    k3t0 k3t0VarG1 = n0i0Var2.G0();
                    boolean zI10 = fetVar4.i(n0i0Var2);
                    Object objP10 = fetVar4.P();
                    if (zI10 || objP10 == cl5Var) {
                        n0i0Var = n0i0Var2;
                        nxh0 nxh0Var2 = new nxh0(1, n0i0Var, n0i0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cashback/impl/presentation/model/SelectCashbackSideEffect;)V", 0, (byte) 6);
                        fetVar4.o0(nxh0Var2);
                        objP10 = nxh0Var2;
                    } else {
                        n0i0Var = n0i0Var2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP10), fetVar4);
                    boolean zI11 = fetVar4.i(k3t0VarG1) | fetVar4.i(n0i0Var) | fetVar4.e(3) | fetVar4.g(pz40VarF2);
                    Object objP11 = fetVar4.P();
                    if (zI11 || objP11 == cl5Var) {
                        nu80 nu80Var3 = new nu80(k3t0VarG1, n0i0Var, pz40VarF2, null, (byte) 23);
                        fetVar4.o0(nu80Var3);
                        objP11 = nu80Var3;
                    }
                    m0x0.t(fetVar4, n0i0Var, (Function2) objP11);
                    k3t0 k3t0VarG2 = n0i0Var.G0();
                    boolean zI12 = fetVar4.i(k3t0VarG2);
                    Object objP12 = fetVar4.P();
                    if (zI12 || objP12 == cl5Var) {
                        nxh0 nxh0Var3 = new nxh0(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar4.o0(nxh0Var3);
                        objP12 = nxh0Var3;
                    }
                    jar0.F(pz40VarY3, (Function1) ((jhy) objP12), fetVar4, 6);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                m1i0 m1i0Var3 = (m1i0) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                cge0 cge0Var = m1i0.O1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k3t0 k3t0VarG3 = m1i0Var3.G0();
                    boolean zI13 = fetVar5.i(m1i0Var3);
                    Object objP13 = fetVar5.P();
                    if (zI13 || objP13 == cl5Var) {
                        nxh0 nxh0Var4 = new nxh0(1, m1i0Var3, m1i0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/linelive/presentation/feeds/betonyoursscreen/model/ChooseCountrySideEffect;)V", 0, (byte) 10);
                        m1i0Var = m1i0Var3;
                        fetVar5.o0(nxh0Var4);
                        objP13 = nxh0Var4;
                    } else {
                        m1i0Var = m1i0Var3;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP13), fetVar5);
                    boolean zI14 = fetVar5.i(k3t0VarG3) | fetVar5.i(m1i0Var) | fetVar5.e(3) | fetVar5.g(pz40VarF3);
                    Object objP14 = fetVar5.P();
                    if (zI14 || objP14 == cl5Var) {
                        m1i0Var2 = m1i0Var;
                        nu80 nu80Var4 = new nu80(k3t0VarG3, m1i0Var2, pz40VarF3, null, (byte) 24);
                        fetVar5.o0(nu80Var4);
                        objP14 = nu80Var4;
                    } else {
                        m1i0Var2 = m1i0Var;
                    }
                    m0x0.t(fetVar5, m1i0Var2, (Function2) objP14);
                    mm40 mm40VarX = yyw.X(jm40Var, r17, fetVar5, 1);
                    boolean zI15 = fetVar5.i(m1i0Var2);
                    Object objP15 = fetVar5.P();
                    if (zI15 || objP15 == cl5Var) {
                        objP15 = new k1i0(m1i0Var2, b2);
                        fetVar5.o0(objP15);
                    }
                    mm40 mm40VarH = phu0.H(pzw.A(0, fetVar5, mm40VarX, (Function0) objP15), 0, 1);
                    pz40 pz40VarY4 = ((i3t0) m1i0Var2.G0()).y(fetVar5);
                    k3t0 k3t0VarG4 = m1i0Var2.G0();
                    boolean zI16 = fetVar5.i(k3t0VarG4);
                    Object objP16 = fetVar5.P();
                    if (zI16 || objP16 == cl5Var) {
                        objP16 = new nxh0(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar5.o0(objP16);
                    }
                    bsr0.J(0, fetVar5, mm40VarH, pz40VarY4, (Function1) ((jhy) objP16));
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                gle0 gle0Var = d3i0.n2;
                ((lw5) obj).getClass();
                ((d3i0) obj3).T0().x(r2i0.f29735a);
                return Unit.f46060a;
            case 6:
                ((dpa0) obj).a();
                ((lie0) obj3).f20100a = ((ne60) obj2).f23370a;
                return Unit.f46060a;
            case 7:
                s7i0 s7i0Var = (s7i0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gne0 gne0Var3 = s7i0.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI17 = fetVar6.i(s7i0Var);
                    Object objP17 = fetVar6.P();
                    if (zI17 || objP17 == cl5Var) {
                        objP17 = new p7i0(s7i0Var, (byte) 2);
                        fetVar6.o0(objP17);
                    }
                    qcc.X(s7i0Var, (Function0) objP17);
                    pz40 pz40VarY5 = ((i3t0) s7i0Var.G0()).y(fetVar6);
                    k3t0 k3t0VarG5 = s7i0Var.G0();
                    boolean zI18 = fetVar6.i(k3t0VarG5);
                    Object objP18 = fetVar6.P();
                    if (zI18 || objP18 == cl5Var) {
                        nxh0 nxh0Var5 = new nxh0(1, k3t0VarG5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar6.o0(nxh0Var5);
                        objP18 = nxh0Var5;
                    }
                    cwr0.C(pz40VarY5, (Function1) ((jhy) objP18), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                e8i0 e8i0Var = (e8i0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                e8i0Var.G(new z7i0(e8i0Var.p.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 9:
                t8i0 t8i0Var = (t8i0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                cge0 cge0Var2 = t8i0.O1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI19 = fetVar7.i(t8i0Var);
                    Object objP19 = fetVar7.P();
                    if (zI19 || objP19 == cl5Var) {
                        objP19 = new r8i0(t8i0Var, b6);
                        fetVar7.o0(objP19);
                    }
                    qcc.X(t8i0Var, (Function0) objP19);
                    pz40 pz40VarY6 = ((i3t0) t8i0Var.G0()).y(fetVar7);
                    k3t0 k3t0VarG6 = t8i0Var.G0();
                    boolean zI20 = fetVar7.i(k3t0VarG6);
                    Object objP20 = fetVar7.P();
                    if (zI20 || objP20 == cl5Var) {
                        nxh0 nxh0Var6 = new nxh0(1, k3t0VarG6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar7.o0(nxh0Var6);
                        objP20 = nxh0Var6;
                    }
                    f1t0.G(pz40VarY6, (Function1) ((jhy) objP20), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 10:
                c9i0 c9i0Var = (c9i0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                c9i0Var.G(new w8i0(c9i0Var.p.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 11:
                cai0 cai0Var = (cai0) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    cai0Var.w(new v9i0(str));
                } else {
                    cai0Var.w(w9i0.f38782a);
                }
                return Unit.f46060a;
            case 12:
                jai0 jai0Var = (jai0) obj3;
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                b1j.z(str2, th2);
                if (th2 instanceof zhi0) {
                    jai0Var.w(new fai0(str2));
                } else {
                    jai0Var.w(gai0.f10967a);
                }
                return Unit.f46060a;
            case 13:
                Throwable th3 = (Throwable) obj;
                String str3 = (String) obj2;
                th3.getClass();
                str3.getClass();
                ((ldi0) obj3).I.f(new qci0(str3));
                th3.printStackTrace();
                return Unit.f46060a;
            case 14:
                lli0 lli0Var = (lli0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                cge0 cge0Var3 = lli0.P1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zI21 = fetVar8.i(lli0Var);
                    Object objP21 = fetVar8.P();
                    if (zI21 || objP21 == cl5Var) {
                        objP21 = new jli0(lli0Var, b6);
                        fetVar8.o0(objP21);
                    }
                    qcc.X(lli0Var, (Function0) objP21);
                    pz40 pz40VarY7 = ((i3t0) lli0Var.G0()).y(fetVar8);
                    k3t0 k3t0VarG7 = lli0Var.G0();
                    boolean zI22 = fetVar8.i(k3t0VarG7);
                    Object objP22 = fetVar8.P();
                    if (zI22 || objP22 == cl5Var) {
                        uki0 uki0Var = new uki0(1, k3t0VarG7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar8.o0(uki0Var);
                        objP22 = uki0Var;
                    }
                    i4w0.H(pz40VarY7, (Function1) ((jhy) objP22), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                wli0 wli0Var = (wli0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = wli0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wli0Var.f.getClass();
                } while (!p7m0Var.m(value, sli0.a((sli0) value, false, false, true, false, null, 0, 0, 242)));
                return Unit.f46060a;
            case 16:
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                ((uri0) obj3).w.f(new kri0(str4));
                return Unit.f46060a;
            case 17:
                swi0 swi0Var3 = (swi0) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                gne0 gne0Var4 = swi0.X1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pz40 pz40VarY8 = ((i3t0) swi0Var3.H0()).y(fetVar9);
                    k3t0 k3t0VarH0 = swi0Var3.H0();
                    boolean zI23 = fetVar9.i(swi0Var3);
                    Object objP23 = fetVar9.P();
                    if (zI23 || objP23 == cl5Var) {
                        uki0 uki0Var2 = new uki0(1, swi0Var3, swi0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/settings/impl/presentation/models/SettingsEvent;)V", 0, (byte) 2);
                        swi0Var = swi0Var3;
                        fetVar9.o0(uki0Var2);
                        objP23 = uki0Var2;
                    } else {
                        swi0Var = swi0Var3;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP23), fetVar9);
                    boolean zI24 = fetVar9.i(k3t0VarH0) | fetVar9.i(swi0Var) | fetVar9.e(3) | fetVar9.g(pz40VarF4);
                    Object objP24 = fetVar9.P();
                    if (zI24 || objP24 == cl5Var) {
                        swi0Var2 = swi0Var;
                        nu80 nu80Var5 = new nu80(k3t0VarH0, swi0Var2, pz40VarF4, null, (byte) 25);
                        fetVar9.o0(nu80Var5);
                        objP24 = nu80Var5;
                    } else {
                        swi0Var2 = swi0Var;
                    }
                    m0x0.t(fetVar9, swi0Var2, (Function2) objP24);
                    boolean zI25 = fetVar9.i(swi0Var2);
                    Object objP25 = fetVar9.P();
                    if (zI25 || objP25 == cl5Var) {
                        objP25 = new qwi0(swi0Var2, (byte) 7);
                        fetVar9.o0(objP25);
                    }
                    Function0 function4 = (Function0) objP25;
                    boolean zI26 = fetVar9.i(swi0Var2);
                    Object objP26 = fetVar9.P();
                    if (zI26 || objP26 == cl5Var) {
                        objP26 = new qwi0(swi0Var2, (byte) 8);
                        fetVar9.o0(objP26);
                    }
                    v3c.A(function4, (Function0) objP26, null, fetVar9, 0, 4);
                    k3t0 k3t0VarH1 = swi0Var2.H0();
                    boolean zI27 = fetVar9.i(k3t0VarH1);
                    Object objP27 = fetVar9.P();
                    if (zI27 || objP27 == cl5Var) {
                        uki0 uki0Var3 = new uki0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar9.o0(uki0Var3);
                        objP27 = uki0Var3;
                    }
                    wb.b(pz40VarY8, (Function1) ((jhy) objP27), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 18:
                e0j0 e0j0Var = (e0j0) obj3;
                a8z a8zVar2 = e0j0Var.M1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                cge0 cge0Var4 = e0j0.N1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI28 = fetVar10.i(e0j0Var);
                    Object objP28 = fetVar10.P();
                    if (zI28 || objP28 == cl5Var) {
                        opc0 opc0Var = new opc0(1, e0j0Var, e0j0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/coef_type/impl/presentation/coef_types/models/SettingsCoefTypeSideEffect;)V", 0, (byte) 1);
                        fetVar10.o0(opc0Var);
                        objP28 = opc0Var;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP28), fetVar10);
                    boolean zI29 = fetVar10.i(k3t0Var2) | fetVar10.i(e0j0Var) | fetVar10.e(3) | fetVar10.g(pz40VarF5);
                    Object objP29 = fetVar10.P();
                    if (zI29 || objP29 == cl5Var) {
                        function1 = null;
                        nu80Var = new nu80(k3t0Var2, e0j0Var, pz40VarF5, null, (byte) 26);
                        fetVar10.o0(nu80Var);
                    } else {
                        nu80Var = objP29;
                        function1 = null;
                    }
                    m0x0.t(fetVar10, e0j0Var, (Function2) nu80Var);
                    g0j0 g0j0Var = (g0j0) ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar10).getValue();
                    mm40 mm40VarE0 = o2e.e0(yyw.X(jm40Var, function1, fetVar10, 1), "SETTINGS_COEF_TYPE_SCREEN");
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI30 = fetVar10.i(k3t0Var3);
                    Object objP30 = fetVar10.P();
                    if (zI30 || objP30 == cl5Var) {
                        uki0 uki0Var4 = new uki0(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                        fetVar10.o0(uki0Var4);
                        objP30 = uki0Var4;
                    }
                    hew0.z(mm40VarE0, g0j0Var, (Function1) ((jhy) objP30), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                r6j0 r6j0Var2 = (r6j0) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                gle0 gle0Var2 = r6j0.N1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zI31 = fetVar11.i(r6j0Var2);
                    Object objP31 = fetVar11.P();
                    if (zI31 || objP31 == cl5Var) {
                        objP31 = new p6j0(r6j0Var2, b6);
                        fetVar11.o0(objP31);
                    }
                    Function0 function5 = (Function0) objP31;
                    boolean zI32 = fetVar11.i(r6j0Var2);
                    Object objP32 = fetVar11.P();
                    if (zI32 || objP32 == cl5Var) {
                        objP32 = new p6j0(r6j0Var2, b2);
                        fetVar11.o0(objP32);
                    }
                    v3c.z(function5, (Function0) objP32, null, fetVar11, 0, 4);
                    k3t0 k3t0VarG8 = r6j0Var2.G0();
                    Object objP33 = fetVar11.P();
                    if (objP33 == cl5Var) {
                        objP33 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar11);
                        fetVar11.o0(objP33);
                    }
                    vne vneVar = (vne) objP33;
                    boolean zI33 = fetVar11.i(r6j0Var2);
                    Object objP34 = fetVar11.P();
                    if (zI33 || objP34 == cl5Var) {
                        r6j0Var = r6j0Var2;
                        opc0 opc0Var2 = new opc0(1, r6j0Var, r6j0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/pin_code/impl/presentation/settings/compose/models/SettingsPinCodeSideEffect;)V", 0, (byte) 2);
                        fetVar11.o0(opc0Var2);
                        objP34 = opc0Var2;
                    } else {
                        r6j0Var = r6j0Var2;
                    }
                    Function1 function6 = (Function1) ((jhy) objP34);
                    Unit unit = Unit.f46060a;
                    boolean zI34 = fetVar11.i(vneVar) | fetVar11.i(k3t0VarG8) | fetVar11.g(function6) | fetVar11.g(null);
                    Object objP35 = fetVar11.P();
                    if (zI34 || objP35 == cl5Var) {
                        objP35 = new ggc0(vneVar, k3t0VarG8, function6, b3);
                        fetVar11.o0(objP35);
                    }
                    m0x0.o(unit, (Function1) objP35, fetVar11);
                    t6j0 t6j0Var = (t6j0) ((i3t0) r6j0Var.G0()).y(fetVar11).getValue();
                    mm40 mm40VarE1 = o2e.e0(jm40Var, "SETTING_PIN_CODE_SCREEN");
                    k3t0 k3t0VarG9 = r6j0Var.G0();
                    boolean zI35 = fetVar11.i(k3t0VarG9);
                    Object objP36 = fetVar11.P();
                    if (zI35 || objP36 == cl5Var) {
                        uki0 uki0Var5 = new uki0(1, k3t0VarG9, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar11.o0(uki0Var5);
                        objP36 = uki0Var5;
                    }
                    nnw0.v(mm40VarE1, t6j0Var, (Function1) ((jhy) objP36), fetVar11, 6);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 20:
                qbj0 qbj0Var = (qbj0) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                lme0 lme0Var3 = qbj0.Z1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    k3t0 k3t0VarH2 = qbj0Var.H0();
                    boolean zI36 = fetVar12.i(qbj0Var);
                    Object objP37 = fetVar12.P();
                    if (zI36 || objP37 == cl5Var) {
                        uki0 uki0Var6 = new uki0(1, qbj0Var, qbj0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/settings/impl/presentation/frgments/tabs/models/SettingsTabsSideEffect;)V", 0, (byte) 8);
                        fetVar12.o0(uki0Var6);
                        objP37 = uki0Var6;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP37), fetVar12);
                    boolean zI37 = fetVar12.i(k3t0VarH2) | fetVar12.i(qbj0Var) | fetVar12.e(3) | fetVar12.g(pz40VarF6);
                    Object objP38 = fetVar12.P();
                    if (zI37 || objP38 == cl5Var) {
                        nu80 nu80Var6 = new nu80(k3t0VarH2, qbj0Var, pz40VarF6, null, (byte) 27);
                        fetVar12.o0(nu80Var6);
                        objP38 = nu80Var6;
                    }
                    m0x0.t(fetVar12, qbj0Var, (Function2) objP38);
                    pz40 pz40VarY9 = ((i3t0) qbj0Var.H0()).y(fetVar12);
                    boolean zI38 = fetVar12.i(qbj0Var);
                    Object objP39 = fetVar12.P();
                    if (zI38 || objP39 == cl5Var) {
                        objP39 = new mbj0(qbj0Var, b5);
                        fetVar12.o0(objP39);
                    }
                    Function0 function7 = (Function0) objP39;
                    boolean zI39 = fetVar12.i(qbj0Var);
                    Object objP40 = fetVar12.P();
                    if (zI39 || objP40 == cl5Var) {
                        objP40 = new mbj0(qbj0Var, b6);
                        fetVar12.o0(objP40);
                    }
                    v3c.A(function7, (Function0) objP40, null, fetVar12, 0, 4);
                    adz adzVar = (adz) qbj0Var.L1.getValue();
                    k3t0 k3t0VarH3 = qbj0Var.H0();
                    boolean zI40 = fetVar12.i(k3t0VarH3);
                    Object objP41 = fetVar12.P();
                    if (zI40 || objP41 == cl5Var) {
                        uki0 uki0Var7 = new uki0(1, k3t0VarH3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar12.o0(uki0Var7);
                        objP41 = uki0Var7;
                    }
                    w9x.v(pz40VarY9, adzVar, (Function1) ((jhy) objP41), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 21:
                String str5 = (String) obj2;
                ((Throwable) obj).getClass();
                str5.getClass();
                ((odj0) obj3).G(new ocj0(str5));
                return Unit.f46060a;
            case 22:
                org.xplatform.settings.impl.presentation.a aVar = (org.xplatform.settings.impl.presentation.a) obj3;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((String) obj2).getClass();
                zhi0 zhi0Var = th4 instanceof zhi0 ? (zhi0) th4 : null;
                if (zhi0Var != null && ((kuwVar = zhi0Var.c) == i2o.WrongQrCode || kuwVar == i2o.AllowQrCode || kuwVar == i2o.WrongToken)) {
                    String message = zhi0Var.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    aVar.G(new i1j0(message), null);
                }
                return Unit.f46060a;
            case 23:
                ofj0 ofj0Var3 = (ofj0) obj3;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                cge0 cge0Var5 = ofj0.X1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pz40 pz40VarY10 = ((i3t0) ofj0Var3.H0()).y(fetVar13);
                    k3t0 k3t0VarH4 = ofj0Var3.H0();
                    boolean zI41 = fetVar13.i(ofj0Var3);
                    Object objP42 = fetVar13.P();
                    if (zI41 || objP42 == cl5Var) {
                        uki0 uki0Var8 = new uki0(1, ofj0Var3, ofj0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/settings/impl/presentation/models/SettingsEvent;)V", 0, (byte) 14);
                        ofj0Var = ofj0Var3;
                        fetVar13.o0(uki0Var8);
                        objP42 = uki0Var8;
                    } else {
                        ofj0Var = ofj0Var3;
                    }
                    lkz lkzVar7 = lkz.f20223a;
                    pz40 pz40VarF7 = androidx.compose.runtime.e.f((Function1) ((jhy) objP42), fetVar13);
                    boolean zI42 = fetVar13.i(k3t0VarH4) | fetVar13.i(ofj0Var) | fetVar13.e(3) | fetVar13.g(pz40VarF7);
                    Object objP43 = fetVar13.P();
                    if (zI42 || objP43 == cl5Var) {
                        ofj0Var2 = ofj0Var;
                        nu80 nu80Var7 = new nu80(k3t0VarH4, ofj0Var2, pz40VarF7, null, (byte) 28);
                        fetVar13.o0(nu80Var7);
                        objP43 = nu80Var7;
                    } else {
                        ofj0Var2 = ofj0Var;
                    }
                    m0x0.t(fetVar13, ofj0Var2, (Function2) objP43);
                    boolean zI43 = fetVar13.i(ofj0Var2);
                    Object objP44 = fetVar13.P();
                    if (zI43 || objP44 == cl5Var) {
                        objP44 = new jfj0(ofj0Var2, b4);
                        fetVar13.o0(objP44);
                    }
                    Function0 function8 = (Function0) objP44;
                    boolean zI44 = fetVar13.i(ofj0Var2);
                    Object objP45 = fetVar13.P();
                    if (zI44 || objP45 == cl5Var) {
                        objP45 = new jfj0(ofj0Var2, b3);
                        fetVar13.o0(objP45);
                    }
                    v3c.A(function8, (Function0) objP45, null, fetVar13, 0, 4);
                    k3t0 k3t0VarH5 = ofj0Var2.H0();
                    boolean zI45 = fetVar13.i(k3t0VarH5);
                    Object objP46 = fetVar13.P();
                    if (zI45 || objP46 == cl5Var) {
                        objP46 = new uki0(1, k3t0VarH5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar13.o0(objP46);
                    }
                    dwi0.y(pz40VarY10, (Function1) ((jhy) objP46), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 24:
                return a(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return b(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                h3k0 h3k0Var = (h3k0) obj3;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    h3k0Var.b.a(0, fetVar14);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return c(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return g(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                b34.l((plp) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ uph0(Object obj, byte b) {
        this.f36065a = b;
        this.b = obj;
    }
}
