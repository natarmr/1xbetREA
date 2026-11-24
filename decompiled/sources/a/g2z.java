package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g2z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10585a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2z(tfz tfzVar, int i) {
        this.f10585a = (byte) 1;
        this.b = tfzVar;
    }

    private final Object a(Object obj, Object obj2) {
        zl10 zl10Var = (zl10) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        wsz wszVar = zl10.U1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) zl10Var.H0()).y(fetVar);
            k3t0 k3t0VarH0 = zl10Var.H0();
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            boolean zI = fetVar.i(zl10Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new xl10(zl10Var, b);
                fetVar.o0(objP);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = fetVar.i(k3t0VarH0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                pc pcVar = new pc(k3t0VarH0, clzVar, pz40VarF, null, (byte) 24);
                fetVar.o0(pcVar);
                objP2 = pcVar;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
            k3t0 k3t0VarH1 = zl10Var.H0();
            boolean zI3 = fetVar.i(k3t0VarH1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                pf10 pf10Var = new pf10(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                fetVar.o0(pf10Var);
                objP3 = pf10Var;
            }
            km10.f(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        cx10 cx10Var = (cx10) this.b;
        String str = (String) obj2;
        ((Throwable) obj).getClass();
        str.getClass();
        cx10Var.G.f(new kw10(str));
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        l020 l020Var = (l020) this.b;
        String str = (String) obj2;
        ((Throwable) obj).getClass();
        str.getClass();
        p7m0 p7m0Var = l020Var.t;
        wz10 wz10Var = new wz10(str);
        p7m0Var.getClass();
        p7m0Var.o(null, wz10Var);
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        jgz jgzVar;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        iun iunVar;
        Object value5;
        Object value6;
        byte b = this.f10585a;
        yje yjeVar = null;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        byte b3 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                m2z m2zVar = (m2z) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kkb.w((d2z) m2zVar.b, m2zVar.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                xvw.c((tfz) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                jgz jgzVar2 = (jgz) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tqt tqtVar = jgz.Q1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI = fetVar2.i(jgzVar2);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        objP = new igz(jgzVar2, b2);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar2.i(jgzVar2);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new igz(jgzVar2, (byte) 3);
                        fetVar2.o0(objP2);
                    }
                    v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
                    pz40 pz40VarY = ((i3t0) jgzVar2.G0()).y(fetVar2);
                    boolean zI3 = fetVar2.i(jgzVar2);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new hgz(jgzVar2, b3);
                        fetVar2.o0(objP3);
                    }
                    y860.A(pz40VarY, (Function1) objP3, fetVar2, 0);
                    k3t0 k3t0VarG0 = jgzVar2.G0();
                    boolean zI4 = fetVar2.i(jgzVar2);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new hgz(jgzVar2, b2);
                        fetVar2.o0(objP4);
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar2);
                    boolean zI5 = fetVar2.i(k3t0VarG0) | fetVar2.i(jgzVar2) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        jgzVar = jgzVar2;
                        objP5 = new bio(k3t0VarG0, jgzVar, pz40VarF, null, (byte) 22);
                        fetVar2.o0(objP5);
                    } else {
                        jgzVar = jgzVar2;
                    }
                    m0x0.t(fetVar2, jgzVar, (Function2) objP5);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                qoz qozVar = (qoz) obj3;
                a8z a8zVar = qozVar.M1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                sqt sqtVar = qoz.N1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar3);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI6 = fetVar3.i(qozVar);
                    Object objP6 = fetVar3.P();
                    if (zI6 || objP6 == cl5Var) {
                        wzu0 wzu0Var = new wzu0(1, qozVar, qoz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_africa/impl/presentation/self_exclude/models/LimitSelfExcludeAfricaSideEffect;)V", 0, (byte) 22);
                        fetVar3.o0(wzu0Var);
                        objP6 = wzu0Var;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar3);
                    boolean zI7 = fetVar3.i(k3t0Var) | fetVar3.i(qozVar) | fetVar3.e(3) | fetVar3.g(pz40VarF2);
                    Object objP7 = fetVar3.P();
                    if (zI7 || objP7 == cl5Var) {
                        bio bioVar = new bio(k3t0Var, qozVar, pz40VarF2, null, (byte) 23);
                        fetVar3.o0(bioVar);
                        objP7 = bioVar;
                    }
                    m0x0.t(fetVar3, qozVar, (Function2) objP7);
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI8 = fetVar3.i(k3t0Var2);
                    Object objP8 = fetVar3.P();
                    if (zI8 || objP8 == cl5Var) {
                        objP8 = new g1y(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar3.o0(objP8);
                    }
                    gq80.A(pz40VarY2, (Function1) ((jhy) objP8), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                hpz hpzVar = (hpz) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tqt tqtVar2 = hpz.O1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) hpzVar.G0()).y(fetVar4);
                    k3t0 k3t0VarG1 = hpzVar.G0();
                    boolean zI9 = fetVar4.i(hpzVar);
                    Object objP9 = fetVar4.P();
                    if (zI9 || objP9 == cl5Var) {
                        g1y g1yVar = new g1y(1, hpzVar, hpz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_ee/impl/presentation/self_exclude/models/LimitSelfExcludeEeSideEffect;)V", 0, (byte) 21);
                        fetVar4.o0(g1yVar);
                        objP9 = g1yVar;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP9), fetVar4);
                    boolean zI10 = fetVar4.i(k3t0VarG1) | fetVar4.i(hpzVar) | fetVar4.e(3) | fetVar4.g(pz40VarF3);
                    Object objP10 = fetVar4.P();
                    if (zI10 || objP10 == cl5Var) {
                        bio bioVar2 = new bio(k3t0VarG1, hpzVar, pz40VarF3, null, (byte) 24);
                        fetVar4.o0(bioVar2);
                        objP10 = bioVar2;
                    }
                    m0x0.t(fetVar4, hpzVar, (Function2) objP10);
                    k3t0 k3t0VarG2 = hpzVar.G0();
                    boolean zI11 = fetVar4.i(k3t0VarG2);
                    Object objP11 = fetVar4.P();
                    if (zI11 || objP11 == cl5Var) {
                        g1y g1yVar2 = new g1y(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar4.o0(g1yVar2);
                        objP11 = g1yVar2;
                    }
                    wha0.u(pz40VarY3, (Function1) ((jhy) objP11), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                ((qpz) obj3).G(new mpz(str));
                return Unit.f46060a;
            case 6:
                bqz bqzVar = (bqz) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                art artVar = bqz.O1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) bqzVar.G0()).y(fetVar5);
                    k3t0 k3t0VarG3 = bqzVar.G0();
                    boolean zI12 = fetVar5.i(bqzVar);
                    Object objP12 = fetVar5.P();
                    if (zI12 || objP12 == cl5Var) {
                        g1y g1yVar3 = new g1y(1, bqzVar, bqz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_kenya/impl/presentation/self_exclude/models/LimitSelfExcludeKenyaSideEffect;)V", 0, (byte) 23);
                        fetVar5.o0(g1yVar3);
                        objP12 = g1yVar3;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP12), fetVar5);
                    boolean zI13 = fetVar5.i(k3t0VarG3) | fetVar5.i(bqzVar) | fetVar5.e(3) | fetVar5.g(pz40VarF4);
                    Object objP13 = fetVar5.P();
                    if (zI13 || objP13 == cl5Var) {
                        bio bioVar3 = new bio(k3t0VarG3, bqzVar, pz40VarF4, null, (byte) 25);
                        fetVar5.o0(bioVar3);
                        objP13 = bioVar3;
                    }
                    m0x0.t(fetVar5, bqzVar, (Function2) objP13);
                    k3t0 k3t0VarG4 = bqzVar.G0();
                    boolean zI14 = fetVar5.i(k3t0VarG4);
                    Object objP14 = fetVar5.P();
                    if (zI14 || objP14 == cl5Var) {
                        g1y g1yVar4 = new g1y(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar5.o0(g1yVar4);
                        objP14 = g1yVar4;
                    }
                    nia0.J(pz40VarY4, (Function1) ((jhy) objP14), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                ((lqz) obj3).G(new hqz(str2));
                return Unit.f46060a;
            case 8:
                wqz wqzVar = (wqz) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                bst bstVar = wqz.Q1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) wqzVar.G0()).y(fetVar6);
                    k3t0 k3t0VarG5 = wqzVar.G0();
                    boolean zI15 = fetVar6.i(wqzVar);
                    Object objP15 = fetVar6.P();
                    if (zI15 || objP15 == cl5Var) {
                        g1y g1yVar5 = new g1y(1, wqzVar, wqz.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_africa/impl/presentation/self_exclude_reason/models/LimitSelfExcludeReasonAfricaSideEffect;)V", 0, (byte) 25);
                        fetVar6.o0(g1yVar5);
                        objP15 = g1yVar5;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP15), fetVar6);
                    boolean zI16 = fetVar6.i(k3t0VarG5) | fetVar6.i(wqzVar) | fetVar6.e(3) | fetVar6.g(pz40VarF5);
                    Object objP16 = fetVar6.P();
                    if (zI16 || objP16 == cl5Var) {
                        bio bioVar4 = new bio(k3t0VarG5, wqzVar, pz40VarF5, null, (byte) 26);
                        fetVar6.o0(bioVar4);
                        objP16 = bioVar4;
                    }
                    m0x0.t(fetVar6, wqzVar, (Function2) objP16);
                    k3t0 k3t0VarG6 = wqzVar.G0();
                    boolean zI17 = fetVar6.i(k3t0VarG6);
                    Object objP17 = fetVar6.P();
                    if (zI17 || objP17 == cl5Var) {
                        g1y g1yVar6 = new g1y(1, k3t0VarG6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar6.o0(g1yVar6);
                        objP17 = g1yVar6;
                    }
                    xia0.D(pz40VarY5, (Function1) ((jhy) objP17), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 9:
                cxz cxzVar = (cxz) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = cxzVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    cxzVar.f.getClass();
                } while (!p7m0Var.m(value, uwz.a((uwz) value, null, null, 0, false, true, 4071)));
                return Unit.f46060a;
            case 10:
                q000 q000Var = (q000) obj3;
                a8z a8zVar2 = q000Var.O1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                htz htzVar = q000.P1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar7);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI18 = fetVar7.i(q000Var);
                    Object objP18 = fetVar7.P();
                    if (zI18 || objP18 == cl5Var) {
                        svz svzVar = new svz(1, q000Var, q000.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_ne/impl/presentation/lock_screens/models/LimitsNeLockScreenSideEffect;)V", 0, (byte) 7);
                        fetVar7.o0(svzVar);
                        objP18 = svzVar;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP18), fetVar7);
                    boolean zI19 = fetVar7.i(k3t0Var3) | fetVar7.i(q000Var) | fetVar7.e(3) | fetVar7.g(pz40VarF6);
                    Object objP19 = fetVar7.P();
                    if (zI19 || objP19 == cl5Var) {
                        p000 p000Var = new p000(k3t0Var3, q000Var, pz40VarF6, null, (byte) 0);
                        fetVar7.o0(p000Var);
                        objP19 = p000Var;
                    }
                    m0x0.t(fetVar7, q000Var, (Function2) objP19);
                    k3t0 k3t0Var4 = (k3t0) a8zVar2.getValue();
                    boolean zI20 = fetVar7.i(k3t0Var4);
                    Object objP20 = fetVar7.P();
                    if (zI20 || objP20 == cl5Var) {
                        objP20 = new svz(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar7.o0(objP20);
                    }
                    fre0.E(pz40VarY6, (Function1) ((jhy) objP20), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 11:
                v000 v000Var = (v000) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (agc.L(th)) {
                    i1w0 i1w0Var = v000Var.q;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    v000Var.G(t000.f33095a);
                }
                return Unit.f46060a;
            case 12:
                w400 w400Var = (w400) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = w400Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    w400Var.f.getClass();
                } while (!p7m0Var2.m(value2, l400.a((l400) value2, null, null, 0, false, true, 999)));
                return Unit.f46060a;
            case 13:
                ppj0 ppj0Var = (ppj0) obj3;
                float fFloatValue = ((Float) obj2).floatValue();
                ((dpa0) obj).getClass();
                qjj.W(ppj0Var.b, null, null, new opj0(ppj0Var, fFloatValue, yjeVar, (byte) 0), 3);
                return Unit.f46060a;
            case 14:
                a8z a8zVar3 = ((ha00) obj3).Q1;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                xuz xuzVar = ha00.S1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar8);
                    k3t0 k3t0Var5 = (k3t0) a8zVar3.getValue();
                    boolean zI21 = fetVar8.i(k3t0Var5);
                    Object objP21 = fetVar8.P();
                    if (zI21 || objP21 == cl5Var) {
                        objP21 = new svz(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar8.o0(objP21);
                    }
                    idx.c(pz40VarY7, (Function1) ((jhy) objP21), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                gb00 gb00Var = (gb00) obj3;
                oyg0 oyg0Var = gb00Var.f;
                ocj ocjVar = gb00Var.i;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if (th2 instanceof ff5) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                        iunVar = iun.f15405a;
                    } while (!p7m0Var3.m(value4, ma00.a((ma00) value4, false, false, 0, 0, 0, new l800(0, iunVar, iunVar, iunVar), null, 220)));
                } else {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value3, ma00.a((ma00) value3, false, true, 0, 0, 0, null, null, 252)));
                }
                return Unit.f46060a;
            case 16:
                qi00 qi00Var = (qi00) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var5 = qi00Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    qi00Var.f.getClass();
                } while (!p7m0Var5.m(value5, nj00.a((nj00) value5, null, null, null, ais.b, null, false, null, false, Response.PROXY_AUTHENTICATION_REQUIRED)));
                return Unit.f46060a;
            case 17:
                xeo xeoVar = (xeo) obj3;
                cp00 cp00Var = (cp00) obj2;
                ((oyg0) obj).getClass();
                cp00Var.getClass();
                Set set = cp00Var.j;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : set) {
                    if (!Intrinsics.d((xeo) obj4, xeoVar)) {
                        arrayList.add(obj4);
                    }
                }
                return cp00.a(cp00Var, null, null, null, null, null, CollectionsKt.P0(arrayList), false, false, 130559);
            case 18:
                wz00 wz00Var = (wz00) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                wsz wszVar = wz00.b2;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    n610 n610Var = (n610) ((i3t0) wz00Var.H0()).y(fetVar9).getValue();
                    sek sekVar = wz00Var.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = wz00Var.N1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(wz00Var.G0().f46516a, wz00Var.G0().c, wz00Var.G0().e, wz00Var.G0().d, wz00Var.G0().b);
                    qdz qdzVar = wz00Var.a2;
                    xex xexVar = wz00Var.S1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(wz00Var.G0().f46516a, wz00Var.G0().c, wz00Var.G0().b, wz00Var.G0().e, 2L, wz00Var.G0().h, new lq2(), grs.b, wz00.class.getSimpleName());
                    k3t0 k3t0VarH0 = wz00Var.H0();
                    boolean zI22 = fetVar9.i(k3t0VarH0);
                    Object objP22 = fetVar9.P();
                    if (zI22 || objP22 == cl5Var) {
                        objP22 = new svz(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar9.o0(objP22);
                    }
                    d9x.f(n610Var, sekVar, bekVar, z5sVar, qdzVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP22), fetVar9, 0);
                    k3t0 k3t0VarH1 = wz00Var.H0();
                    boolean zI23 = fetVar9.i(wz00Var);
                    Object objP23 = fetVar9.P();
                    if (zI23 || objP23 == cl5Var) {
                        objP23 = new uz00(wz00Var, (byte) 0);
                        fetVar9.o0(objP23);
                    }
                    clz clzVar = (clz) fetVar9.k(or00.f25714a);
                    lkz lkzVar7 = lkz.f20223a;
                    pz40 pz40VarF7 = androidx.compose.runtime.e.f((Function1) objP23, fetVar9);
                    boolean zI24 = fetVar9.i(k3t0VarH1) | fetVar9.i(clzVar) | fetVar9.e(3) | fetVar9.g(pz40VarF7);
                    Object objP24 = fetVar9.P();
                    if (zI24 || objP24 == cl5Var) {
                        pc pcVar = new pc(k3t0VarH1, clzVar, pz40VarF7, null, (byte) 23);
                        fetVar9.o0(pcVar);
                        objP24 = pcVar;
                    }
                    m0x0.t(fetVar9, clzVar, (Function2) objP24);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k210 k210Var = (k210) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                atz atzVar = k210.U1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    b310 b310Var = (b310) k210Var.O1.getValue();
                    qdz qdzVar2 = k210Var.Q1;
                    g2v g2vVar = k210Var.L1;
                    if (g2vVar == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    boolean zI25 = fetVar10.i(k210Var);
                    Object objP25 = fetVar10.P();
                    if (zI25 || objP25 == cl5Var) {
                        objP25 = new h210(k210Var, b3);
                        fetVar10.o0(objP25);
                    }
                    phu0.s(g2vVar, qdzVar2, b310Var, (Function0) objP25, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 20:
                ((p5q0) obj3).e(((ne60) obj2).f23370a);
                return Unit.f46060a;
            case 21:
                uc10 uc10Var = (uc10) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                wsz wszVar2 = uc10.R1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pz40 pz40VarY8 = ((i3t0) uc10Var.G0()).y(fetVar11);
                    k3t0 k3t0VarG7 = uc10Var.G0();
                    boolean zI26 = fetVar11.i(uc10Var);
                    Object objP26 = fetVar11.P();
                    if (zI26 || objP26 == cl5Var) {
                        objP26 = new svz(1, uc10Var, uc10.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/lotto/impl/presentation/models/LottoSideEffect;)V", 0, (byte) 24);
                        fetVar11.o0(objP26);
                    }
                    lkz lkzVar8 = lkz.f20223a;
                    pz40 pz40VarF8 = androidx.compose.runtime.e.f((Function1) ((jhy) objP26), fetVar11);
                    boolean zI27 = fetVar11.i(k3t0VarG7) | fetVar11.i(uc10Var) | fetVar11.e(3) | fetVar11.g(pz40VarF8);
                    Object objP27 = fetVar11.P();
                    if (zI27 || objP27 == cl5Var) {
                        p000 p000Var2 = new p000(k3t0VarG7, uc10Var, pz40VarF8, null, (byte) 2);
                        fetVar11.o0(p000Var2);
                        objP27 = p000Var2;
                    }
                    m0x0.t(fetVar11, uc10Var, (Function2) objP27);
                    vby vbyVar = uc10Var.N1;
                    if (vbyVar == null) {
                        Intrinsics.h("json");
                        throw null;
                    }
                    k3t0 k3t0VarG8 = uc10Var.G0();
                    boolean zI28 = fetVar11.i(k3t0VarG8);
                    Object objP28 = fetVar11.P();
                    if (zI28 || objP28 == cl5Var) {
                        svz svzVar2 = new svz(1, k3t0VarG8, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar11.o0(svzVar2);
                        objP28 = svzVar2;
                    }
                    hew0.u(vbyVar, (xd10) pz40VarY8.getValue(), (Function1) ((jhy) objP28), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 22:
                be10 be10Var = (be10) obj3;
                Throwable th3 = (Throwable) obj;
                String strA = (String) obj2;
                th3.getClass();
                strA.getClass();
                if (strA.length() == 0) {
                    strA = be10Var.w.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                }
                boolean z = be10Var.z;
                ctf0 ctf0Var = be10Var.w;
                if (!z) {
                    p7m0 p7m0Var6 = be10Var.i.f25029a;
                    do {
                        value6 = p7m0Var6.getValue();
                        value6.getClass();
                        be10Var.f.getClass();
                    } while (!p7m0Var6.m(value6, td10.a((td10) value6, null, false, true, 3)));
                } else if (th3 instanceof bii0) {
                    be10Var.G(new qd10(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), strA));
                } else {
                    be10Var.G(new qd10(ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                }
                return Unit.f46060a;
            case 23:
                ze10 ze10Var = (ze10) obj3;
                a8z a8zVar4 = ze10Var.M1;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                htz htzVar2 = ze10.Q1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    k3t0 k3t0Var6 = (k3t0) a8zVar4.getValue();
                    boolean zI29 = fetVar12.i(ze10Var);
                    Object objP29 = fetVar12.P();
                    if (zI29 || objP29 == cl5Var) {
                        objP29 = new km00(ze10Var, (byte) 5);
                        fetVar12.o0(objP29);
                    }
                    lkz lkzVar9 = lkz.f20223a;
                    pz40 pz40VarF9 = androidx.compose.runtime.e.f((Function1) objP29, fetVar12);
                    boolean zI30 = fetVar12.i(k3t0Var6) | fetVar12.i(ze10Var) | fetVar12.e(3) | fetVar12.g(pz40VarF9);
                    Object objP30 = fetVar12.P();
                    if (zI30 || objP30 == cl5Var) {
                        p000 p000Var3 = new p000(k3t0Var6, ze10Var, pz40VarF9, null, (byte) 3);
                        fetVar12.o0(p000Var3);
                        objP30 = p000Var3;
                    }
                    m0x0.t(fetVar12, ze10Var, (Function2) objP30);
                    pz40 pz40VarY9 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar12);
                    k3t0 k3t0Var7 = (k3t0) a8zVar4.getValue();
                    boolean zI31 = fetVar12.i(k3t0Var7);
                    Object objP31 = fetVar12.P();
                    if (zI31 || objP31 == cl5Var) {
                        svz svzVar3 = new svz(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                        fetVar12.o0(svzVar3);
                        objP31 = svzVar3;
                    }
                    nnw0.q(pz40VarY9, (Function1) ((jhy) objP31), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 24:
                mg10 mg10Var = (mg10) obj3;
                a8z a8zVar5 = mg10Var.M1;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                uuz uuzVar = mg10.Q1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    k3t0 k3t0Var8 = (k3t0) a8zVar5.getValue();
                    boolean zI32 = fetVar13.i(mg10Var);
                    Object objP32 = fetVar13.P();
                    if (zI32 || objP32 == cl5Var) {
                        objP32 = new km00(mg10Var, (byte) 6);
                        fetVar13.o0(objP32);
                    }
                    lkz lkzVar10 = lkz.f20223a;
                    pz40 pz40VarF10 = androidx.compose.runtime.e.f((Function1) objP32, fetVar13);
                    boolean zI33 = fetVar13.i(k3t0Var8) | fetVar13.i(mg10Var) | fetVar13.e(3) | fetVar13.g(pz40VarF10);
                    Object objP33 = fetVar13.P();
                    if (zI33 || objP33 == cl5Var) {
                        p000 p000Var4 = new p000(k3t0Var8, mg10Var, pz40VarF10, null, (byte) 4);
                        fetVar13.o0(p000Var4);
                        objP33 = p000Var4;
                    }
                    m0x0.t(fetVar13, mg10Var, (Function2) objP33);
                    pz40 pz40VarY10 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar13);
                    k3t0 k3t0Var9 = (k3t0) a8zVar5.getValue();
                    boolean zI34 = fetVar13.i(k3t0Var9);
                    Object objP34 = fetVar13.P();
                    if (zI34 || objP34 == cl5Var) {
                        pf10 pf10Var = new pf10(1, k3t0Var9, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar13.o0(pf10Var);
                        objP34 = pf10Var;
                    }
                    m0x0.y(pz40VarY10, (Function1) ((jhy) objP34), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return a(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str3 = (String) obj2;
                ((Throwable) obj).getClass();
                str3.getClass();
                ((vq10) obj3).w.g(new fq10(rek0.b, str3));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return b(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return c(obj, obj2);
            default:
                u020 u020Var = (u020) obj3;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                atz atzVar2 = u020.S1;
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    k3t0 k3t0Var10 = (k3t0) u020Var.N1.getValue();
                    llm0 llm0Var = (llm0) u020Var.R1.n(u020Var, u020.U1[3]);
                    boolean zI35 = fetVar14.i(u020Var);
                    Object objP35 = fetVar14.P();
                    if (zI35 || objP35 == cl5Var) {
                        objP35 = new s020(u020Var, (byte) 1);
                        fetVar14.o0(objP35);
                    }
                    p7x.b(k3t0Var10, llm0Var, (Function0) objP35, fetVar14, 8);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g2z(Object obj, byte b) {
        this.f10585a = b;
        this.b = obj;
    }
}
