package a;

import android.graphics.RectF;
import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fa2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9185a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa2(ta5 ta5Var, int i) {
        this.f9185a = (byte) 16;
        this.b = ta5Var;
    }

    private final Object a(Object obj, Object obj2) {
        xnb0 xnb0Var = (xnb0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            rsr0.H(0, fetVar, null, xnb0Var.f41166a, xnb0Var.b);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        wnb0 wnb0Var = (wnb0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            cwr0.B(0, fetVar, null, wnb0Var.f39439a, wnb0Var.b);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ia2 ia2Var;
        Object value;
        vd2 vd2Var;
        Object value2;
        boolean zK;
        bl5 bl5Var;
        byte b = this.f9185a;
        yje yjeVar = null;
        Object obj3 = ukd.f35823a;
        byte b2 = 3;
        boolean z = false;
        byte b3 = 2;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ia2 ia2Var2 = (ia2) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                rek0 rek0Var = ia2.Q1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0VarG0 = ia2Var2.G0();
                    boolean zI = fetVar.i(ia2Var2);
                    Object objP = fetVar.P();
                    if (zI || objP == obj3) {
                        ia2Var = ia2Var2;
                        Object ln1Var = new ln1(1, ia2Var, ia2.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/results/impl/presentation/alt_result_games/models/AltGamesHistoryResultsSideEffect;)V", 0, (byte) 14);
                        fetVar.o0(ln1Var);
                        objP = ln1Var;
                    } else {
                        ia2Var = ia2Var2;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(ia2Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == obj3) {
                        ia2 ia2Var3 = ia2Var;
                        Object l10Var = new l10(k3t0VarG0, ia2Var3, pz40VarF, null, (byte) 17);
                        ia2Var = ia2Var3;
                        fetVar.o0(l10Var);
                        objP2 = l10Var;
                    }
                    m0x0.t(fetVar, ia2Var, (Function2) objP2);
                    bb2 bb2Var = (bb2) ((i3t0) ia2Var.G0()).y(fetVar).getValue();
                    qdz qdzVar = (qdz) ia2Var.L1.getValue();
                    k3t0 k3t0VarG1 = ia2Var.G0();
                    boolean zI3 = fetVar.i(k3t0VarG1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == obj3) {
                        objP3 = new ln1(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar.o0(objP3);
                    }
                    bsr0.b(null, bb2Var, qdzVar, (Function1) ((jhy) objP3), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                hd2 hd2Var = (hd2) obj4;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = hd2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    hd2Var.f.getClass();
                } while (!p7m0Var.m(value, ad2.a((ad2) value, null, null, false, false, true, false, null, 4039)));
                th.printStackTrace();
                return Unit.f46060a;
            case 2:
                vd2 vd2Var2 = (vd2) obj4;
                a8z a8zVar = vd2Var2.N1;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gfk0 gfk0Var = vd2.R1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI4 = fetVar2.i(vd2Var2);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == obj3) {
                        vd2Var = vd2Var2;
                        Object ln1Var2 = new ln1(1, vd2Var, vd2.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/results/impl/presentation/alt_live_games/models/AltResultLiveGamesSideEffect;)V", 0, (byte) 17);
                        fetVar2.o0(ln1Var2);
                        objP4 = ln1Var2;
                    } else {
                        vd2Var = vd2Var2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP4), fetVar2);
                    boolean zI5 = fetVar2.i(k3t0Var) | fetVar2.i(vd2Var) | fetVar2.e(3) | fetVar2.g(pz40VarF2);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == obj3) {
                        vd2 vd2Var3 = vd2Var;
                        Object l10Var2 = new l10(k3t0Var, vd2Var3, pz40VarF2, null, (byte) 18);
                        vd2Var = vd2Var3;
                        fetVar2.o0(l10Var2);
                        objP5 = l10Var2;
                    }
                    m0x0.t(fetVar2, vd2Var, (Function2) objP5);
                    fe2 fe2Var = (fe2) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar2).getValue();
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI6 = fetVar2.i(k3t0Var2);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == obj3) {
                        objP6 = new ln1(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar2.o0(objP6);
                    }
                    rsr0.b(null, fe2Var, (qdz) vd2Var.O1.getValue(), (Function1) ((jhy) objP6), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                le2 le2Var = (le2) obj4;
                Throwable th2 = (Throwable) obj;
                String str = (String) obj2;
                th2.getClass();
                str.getClass();
                if (th2 instanceof zhi0) {
                    le2Var.getClass();
                    if (((zhi0) th2).c == i2o.IncorrectDataError && str.length() > 0) {
                        le2Var.G(new ae2(str));
                    }
                }
                p7m0 p7m0Var2 = le2Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    le2Var.f.getClass();
                } while (!p7m0Var2.m(value2, ce2.a((ce2) value2, null, false, ihe.f14776a, 0, false, null, null, false, false, 16377)));
                return Unit.f46060a;
            case 4:
                ef2 ef2Var = (ef2) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                hfk0 hfk0Var = ef2.V1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    k3t0 k3t0VarL0 = ef2Var.L0();
                    boolean zI7 = fetVar3.i(ef2Var);
                    Object objP7 = fetVar3.P();
                    if (zI7 || objP7 == obj3) {
                        Object ln1Var3 = new ln1(1, ef2Var, ef2.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/results/impl/presentation/screen/alt/models/AltResultsSideEffect;)V", 0, (byte) 24);
                        fetVar3.o0(ln1Var3);
                        objP7 = ln1Var3;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP7), fetVar3);
                    boolean zI8 = fetVar3.i(k3t0VarL0) | fetVar3.i(ef2Var) | fetVar3.e(3) | fetVar3.g(pz40VarF3);
                    Object objP8 = fetVar3.P();
                    if (zI8 || objP8 == obj3) {
                        Object l10Var3 = new l10(k3t0VarL0, ef2Var, pz40VarF3, null, (byte) 19);
                        fetVar3.o0(l10Var3);
                        objP8 = l10Var3;
                    }
                    m0x0.t(fetVar3, ef2Var, (Function2) objP8);
                    k3t0 k3t0VarK0 = ef2Var.K0();
                    boolean zI9 = fetVar3.i(ef2Var);
                    Object objP9 = fetVar3.P();
                    if (zI9 || objP9 == obj3) {
                        Object ln1Var4 = new ln1(1, ef2Var, ef2.class, "handleSideEffectLive", "handleSideEffectLive(Lorg/xplatform/results/impl/presentation/alt_live/models/AltLiveResultsSideEffect;)V", 0, (byte) 25);
                        fetVar3.o0(ln1Var4);
                        objP9 = ln1Var4;
                    }
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP9), fetVar3);
                    boolean zI10 = fetVar3.i(k3t0VarK0) | fetVar3.i(ef2Var) | fetVar3.e(3) | fetVar3.g(pz40VarF4);
                    Object objP10 = fetVar3.P();
                    if (zI10 || objP10 == obj3) {
                        Object l10Var4 = new l10(k3t0VarK0, ef2Var, pz40VarF4, null, (byte) 20);
                        fetVar3.o0(l10Var4);
                        objP10 = l10Var4;
                    }
                    m0x0.t(fetVar3, ef2Var, (Function2) objP10);
                    k3t0 k3t0VarJ0 = ef2Var.J0();
                    boolean zI11 = fetVar3.i(ef2Var);
                    Object objP11 = fetVar3.P();
                    if (zI11 || objP11 == obj3) {
                        Object ln1Var5 = new ln1(1, ef2Var, ef2.class, "handleSideEffectHistory", "handleSideEffectHistory(Lorg/xplatform/results/impl/presentation/alt_history/models/AltHistoryResultsSideEffect;)V", 0, (byte) 26);
                        fetVar3.o0(ln1Var5);
                        objP11 = ln1Var5;
                    }
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP11), fetVar3);
                    boolean zI12 = fetVar3.i(k3t0VarJ0) | fetVar3.i(ef2Var) | fetVar3.e(3) | fetVar3.g(pz40VarF5);
                    Object objP12 = fetVar3.P();
                    if (zI12 || objP12 == obj3) {
                        Object l10Var5 = new l10(k3t0VarJ0, ef2Var, pz40VarF5, null, (byte) 21);
                        fetVar3.o0(l10Var5);
                        objP12 = l10Var5;
                    }
                    m0x0.t(fetVar3, ef2Var, (Function2) objP12);
                    kf2 kf2Var = (kf2) ((i3t0) ef2Var.L0()).y(fetVar3).getValue();
                    Map map = kf2Var.d;
                    String str2 = (String) map.get(b9g0.d);
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((k3t0) ef2Var.R1.getValue()).x(new l3g0(str2));
                    String str3 = (String) map.get(b9g0.b);
                    if (str3 == null) {
                        str3 = "";
                    }
                    ef2Var.J0().x(new rb2(str3));
                    String str4 = (String) map.get(b9g0.c);
                    ef2Var.K0().x(new sc2(str4 != null ? str4 : ""));
                    boolean z2 = kf2Var.b;
                    ef2Var.K0().x(new pc2(z2));
                    ef2Var.J0().x(new ob2(z2));
                    k3t0 k3t0VarL1 = ef2Var.L0();
                    boolean zI13 = fetVar3.i(k3t0VarL1);
                    Object objP13 = fetVar3.P();
                    if (zI13 || objP13 == obj3) {
                        Object ln1Var6 = new ln1(1, k3t0VarL1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar3.o0(ln1Var6);
                        objP13 = ln1Var6;
                    }
                    cwr0.f(kf2Var, (Function1) ((jhy) objP13), u1c.M(1529307294, new ze2(ef2Var, z ? (byte) 1 : (byte) 0), fetVar3), fetVar3, 3078);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                String str5 = (String) obj2;
                th3.getClass();
                str5.getClass();
                th3.printStackTrace();
                ((yn2) obj4).G(new in2(str5));
                return Unit.f46060a;
            case 6:
                pz40 pz40Var = (pz40) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objP14 = fetVar4.P();
                    if (objP14 == obj3) {
                        objP14 = new sy2(z ? (byte) 1 : (byte) 0);
                        fetVar4.o0(objP14);
                    }
                    y9a.r(pai0.a(jm40.b, false, (Function1) objP14), (Function2) pz40Var.getValue(), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                jge0 jge0VarY = e9x.Y((RectF) obj);
                jge0 jge0VarY2 = e9x.Y((RectF) obj2);
                switch (((v4i0) obj4).f36781a) {
                    case 11:
                        zK = jge0VarY.k(jge0VarY2);
                        break;
                    default:
                        zK = jge0VarY2.a(jge0VarY.e());
                        break;
                }
                return Boolean.valueOf(zK);
            case 8:
                q93 q93Var = (q93) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                pek0 pek0Var = q93.Q1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) q93Var.M1.getValue())).y(fetVar5);
                    boolean zI14 = fetVar5.i(q93Var);
                    Object objP15 = fetVar5.P();
                    if (zI14 || objP15 == obj3) {
                        objP15 = new b33(q93Var, b3);
                        fetVar5.o0(objP15);
                    }
                    kc5.L(pz40VarY, (Function1) objP15, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 9:
                b84 b84Var = (b84) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gfk0 gfk0Var2 = b84.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    k3t0 k3t0VarG2 = b84Var.G0();
                    boolean zI15 = fetVar6.i(b84Var);
                    Object objP16 = fetVar6.P();
                    if (zI15 || objP16 == obj3) {
                        Object bk2Var = new bk2(1, b84Var, b84.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/auth_history/impl/presentation/models/AuthHistorySideEffect;)V", 0, (byte) 27);
                        fetVar6.o0(bk2Var);
                        objP16 = bk2Var;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP16), fetVar6);
                    boolean zI16 = fetVar6.i(k3t0VarG2) | fetVar6.i(b84Var) | fetVar6.e(3) | fetVar6.g(pz40VarF6);
                    Object objP17 = fetVar6.P();
                    if (zI16 || objP17 == obj3) {
                        Object l10Var6 = new l10(k3t0VarG2, b84Var, pz40VarF6, null, (byte) 23);
                        fetVar6.o0(l10Var6);
                        objP17 = l10Var6;
                    }
                    m0x0.t(fetVar6, b84Var, (Function2) objP17);
                    pz40 pz40VarY2 = ((i3t0) b84Var.G0()).y(fetVar6);
                    boolean zBooleanValue = b84Var.K1.n(b84Var, b84.Q1[0]).booleanValue();
                    k3t0 k3t0VarG3 = b84Var.G0();
                    boolean zI17 = fetVar6.i(k3t0VarG3);
                    Object objP18 = fetVar6.P();
                    if (zI17 || objP18 == obj3) {
                        Object bk2Var2 = new bk2(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                        fetVar6.o0(bk2Var2);
                        objP18 = bk2Var2;
                    }
                    tke.j(pz40VarY2, zBooleanValue, (Function1) ((jhy) objP18), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 10:
                String str6 = (String) obj2;
                ((Throwable) obj).getClass();
                str6.getClass();
                p7m0 p7m0Var3 = ((hl4) obj4).h;
                yk4 yk4Var = new yk4(str6);
                p7m0Var3.getClass();
                p7m0Var3.o(null, yk4Var);
                return Unit.f46060a;
            case 11:
                String str7 = (String) obj2;
                ((Throwable) obj).getClass();
                str7.getClass();
                p7m0 p7m0Var4 = ((il4) obj4).h;
                zk4 zk4Var = new zk4(str7);
                p7m0Var4.getClass();
                p7m0Var4.o(null, zk4Var);
                return Unit.f46060a;
            case 12:
                cp4 cp4Var = (cp4) obj4;
                a8z a8zVar2 = cp4Var.O1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                gfk0 gfk0Var3 = cp4.P1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar7);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI18 = fetVar7.i(cp4Var);
                    Object objP19 = fetVar7.P();
                    if (zI18 || objP19 == obj3) {
                        Object j94Var = new j94(1, cp4Var, cp4.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/authenticator/impl/ui/models/AuthHistorySideEffects;)V", 0, (byte) 8);
                        fetVar7.o0(j94Var);
                        objP19 = j94Var;
                    }
                    clz clzVar = (clz) fetVar7.k(or00.f25714a);
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF7 = androidx.compose.runtime.e.f((Function1) ((jhy) objP19), fetVar7);
                    boolean zI19 = fetVar7.i(k3t0Var3) | fetVar7.i(clzVar) | fetVar7.e(3) | fetVar7.g(pz40VarF7);
                    Object objP20 = fetVar7.P();
                    if (zI19 || objP20 == obj3) {
                        Object pcVar = new pc(k3t0Var3, clzVar, pz40VarF7, null, (byte) 2);
                        fetVar7.o0(pcVar);
                        objP20 = pcVar;
                    }
                    m0x0.t(fetVar7, clzVar, (Function2) objP20);
                    Object obj5 = (k3t0) a8zVar2.getValue();
                    boolean zI20 = fetVar7.i(obj5);
                    Object objP21 = fetVar7.P();
                    if (zI20 || objP21 == obj3) {
                        Object j94Var2 = new j94(1, obj5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar7.o0(j94Var2);
                        objP21 = j94Var2;
                    }
                    ahy.e(pz40VarY3, (Function1) ((jhy) objP21), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 13:
                qp4 qp4Var = (qp4) obj4;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                hfk0 hfk0Var2 = qp4.R1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ku4 ku4VarH0 = qp4Var.H0();
                    boolean zI21 = fetVar8.i(qp4Var);
                    Object objP22 = fetVar8.P();
                    if (zI21 || objP22 == obj3) {
                        Object j94Var3 = new j94(1, qp4Var, qp4.class, "onCopyClick", "onCopyClick(Lorg/xplatform/authenticator/impl/ui/fragments/authenticator/models/AuthenticatorActiveUiItem;)V", 0, (byte) 10);
                        fetVar8.o0(j94Var3);
                        objP22 = j94Var3;
                    }
                    Function1 function1 = (Function1) ((jhy) objP22);
                    boolean zI22 = fetVar8.i(qp4Var);
                    Object objP23 = fetVar8.P();
                    if (zI22 || objP23 == obj3) {
                        Object f8Var = new f8(0, qp4Var, qp4.class, "showOptions", "showOptions()V", 0, (byte) 17);
                        fetVar8.o0(f8Var);
                        objP23 = f8Var;
                    }
                    qq4 qq4Var = ku4.J;
                    knx.h(ku4VarH0, function1, (Function0) ((jhy) objP23), null, fetVar8, 8);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 14:
                ur4 ur4Var = (ur4) obj4;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                qek0 qek0Var = ur4.P1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Object objP24 = fetVar9.P();
                    if (objP24 == obj3) {
                        objP24 = g2v.d(((i9i) ur4Var.L1.getValue()).d, pb10.g, null, null, R.string.error, 0, null, 478);
                        fetVar9.o0(objP24);
                    }
                    jkm jkmVar = (jkm) objP24;
                    zr4 zr4Var = (zr4) ur4Var.M1.getValue();
                    boolean zI23 = fetVar9.i(zr4Var);
                    Object objP25 = fetVar9.P();
                    if (zI23 || objP25 == obj3) {
                        Object f8Var2 = new f8(0, zr4Var, zr4.class, "onCloseBtnClicked", "onCloseBtnClicked()V", 0, (byte) 21);
                        fetVar9.o0(f8Var2);
                        objP25 = f8Var2;
                    }
                    i4w0.c((Function0) ((jhy) objP25), ur4Var.O1.n(ur4Var, ur4.Q1[2]), jkmVar, fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 15:
                g85 g85Var = (g85) obj4;
                Throwable th4 = (Throwable) obj;
                String strG = (String) obj2;
                th4.getClass();
                strG.getClass();
                if (StringsKt.W(strG)) {
                    strG = jwb.G(th4, g85Var.p);
                }
                g85Var.G(new q75(strG));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ntr.i((ta5) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                String str8 = (String) obj2;
                ((Throwable) obj).getClass();
                str8.getClass();
                ((kb0) obj4).g(new bi5(str8));
                return Unit.f46060a;
            case 18:
                si5 si5Var = (si5) obj4;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                hfk0 hfk0Var3 = si5.Q1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k3t0 k3t0VarG4 = si5Var.G0();
                    boolean zI24 = fetVar10.i(si5Var);
                    Object objP26 = fetVar10.P();
                    if (zI24 || objP26 == obj3) {
                        Object j94Var4 = new j94(1, si5Var, si5.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/balance_management/impl/balance_management/presentation/single_page/model/SinglePageBalanceManagementSideEffect;)V", 0, (byte) 23);
                        fetVar10.o0(j94Var4);
                        objP26 = j94Var4;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF8 = androidx.compose.runtime.e.f((Function1) ((jhy) objP26), fetVar10);
                    boolean zI25 = fetVar10.i(k3t0VarG4) | fetVar10.i(si5Var) | fetVar10.e(3) | fetVar10.g(pz40VarF8);
                    Object objP27 = fetVar10.P();
                    if (zI25 || objP27 == obj3) {
                        Object l10Var7 = new l10(k3t0VarG4, si5Var, pz40VarF8, null, (byte) 26);
                        fetVar10.o0(l10Var7);
                        objP27 = l10Var7;
                    }
                    m0x0.t(fetVar10, si5Var, (Function2) objP27);
                    wk5 wk5Var = (wk5) ((i3t0) si5Var.G0()).y(fetVar10).getValue();
                    if (wk5Var == null) {
                        throw b1j.f(-692266801, fetVar10, false);
                    }
                    fetVar10.e0(-692261917);
                    k3t0 k3t0VarG5 = si5Var.G0();
                    boolean zI26 = fetVar10.i(k3t0VarG5);
                    Object objP28 = fetVar10.P();
                    if (zI26 || objP28 == obj3) {
                        Object j94Var5 = new j94(1, k3t0VarG5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar10.o0(j94Var5);
                        objP28 = j94Var5;
                    }
                    xf0.A(null, wk5Var, (Function1) ((jhy) objP28), fetVar10, 0);
                    fetVar10.r(false);
                    boolean zI27 = fetVar10.i(si5Var);
                    Object objP29 = fetVar10.P();
                    if (zI27 || objP29 == obj3) {
                        objP29 = new qi5(si5Var, b3);
                        fetVar10.o0(objP29);
                    }
                    Function0 function0 = (Function0) objP29;
                    boolean zI28 = fetVar10.i(si5Var);
                    Object objP30 = fetVar10.P();
                    if (zI28 || objP30 == obj3) {
                        objP30 = new qi5(si5Var, b2);
                        fetVar10.o0(objP30);
                    }
                    v3c.z(function0, (Function0) objP30, null, fetVar10, 0, 4);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bl5 bl5Var2 = (bl5) obj4;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                yk5 yk5Var = bl5.R1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    dk5 dk5VarG0 = bl5Var2.G0();
                    boolean zI29 = fetVar11.i(bl5Var2);
                    Object objP31 = fetVar11.P();
                    if (zI29 || objP31 == obj3) {
                        bl5Var = bl5Var2;
                        Object pw4Var = new pw4(0, bl5Var, bl5.class, "showChangeBalance", "showChangeBalance()V", 0, (byte) 3);
                        fetVar11.o0(pw4Var);
                        objP31 = pw4Var;
                    } else {
                        bl5Var = bl5Var2;
                    }
                    Function0 function2 = (Function0) ((jhy) objP31);
                    dk5 dk5VarG1 = bl5Var.G0();
                    boolean zI30 = fetVar11.i(dk5VarG1);
                    Object objP32 = fetVar11.P();
                    if (zI30 || objP32 == obj3) {
                        Object yj5Var = new yj5(1, dk5VarG1, dk5.class, "onFullHistoryClick", "onFullHistoryClick(Z)V", 0, (byte) 5);
                        fetVar11.o0(yj5Var);
                        objP32 = yj5Var;
                    }
                    oja0.o(dk5VarG0, function2, (Function1) ((jhy) objP32), fetVar11, 8);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 20:
                fl5 fl5Var = (fl5) obj4;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                cl5 cl5Var = fl5.P1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ckb.e((dk5) fl5Var.N1.getValue(), fetVar12, 8);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 21:
                il5 il5Var = (il5) obj4;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                gl5 gl5Var = il5.Q1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    xia0.x((dk5) il5Var.O1.getValue(), fetVar13, 8);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 22:
                ol5 ol5Var = (ol5) obj4;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                kl5 kl5Var = ol5.R1;
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    dk5 dk5VarG2 = ol5Var.G0();
                    boolean zI31 = fetVar14.i(ol5Var);
                    Object objP33 = fetVar14.P();
                    if (zI31 || objP33 == obj3) {
                        Object pw4Var2 = new pw4(0, ol5Var, ol5.class, "showChangeBalance", "showChangeBalance()V", 0, (byte) 4);
                        fetVar14.o0(pw4Var2);
                        objP33 = pw4Var2;
                    }
                    y0x0.z(dk5VarG2, (Function0) ((jhy) objP33), fetVar14, 8);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 23:
                d06 d06Var = (d06) obj4;
                ol60 ol60Var = d06Var.p;
                Throwable th5 = (Throwable) obj;
                String str9 = (String) obj2;
                rek0 rek0Var2 = rek0.b;
                th5.getClass();
                str9.getClass();
                if ((th5 instanceof zhi0) && CollectionsKt.L(d06Var.q, ((zhi0) th5).c)) {
                    String message = th5.getMessage();
                    ol60Var.f(new p0o(new xdk0(rek0Var2, message == null ? "" : message, null, null, null, null, 124)));
                    d06Var.o.f(j320.f15811a);
                } else {
                    ol60Var.f(new p0o(new xdk0(rek0Var2, str9, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            case 24:
                l46 l46Var = (l46) obj4;
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                kl5 kl5Var2 = l46.O1;
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    k3t0 k3t0Var4 = (k3t0) l46Var.N1.getValue();
                    boolean zI32 = fetVar15.i(k3t0Var4);
                    Object objP34 = fetVar15.P();
                    if (zI32 || objP34 == obj3) {
                        Object yj5Var2 = new yj5(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                        fetVar15.o0(yj5Var2);
                        objP34 = yj5Var2;
                    }
                    o050.d((Function1) ((jhy) objP34), fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                er6 er6Var = (er6) obj4;
                Bundle bundle = (Bundle) obj2;
                kl5 kl5Var3 = er6.S1;
                if (!h97.B(bundle, (String) obj, "REQUEST_TEAM_SELECTOR_KEY")) {
                    return Unit.f46060a;
                }
                if (bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    Serializable serializable = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                    serializable.getClass();
                    as6 as6VarH0 = er6Var.H0();
                    sac.V(jiu0.a(as6VarH0), new ur6(1, as6VarH0, as6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 4), null, null, new yp6(as6VarH0, (ojp0) serializable, yjeVar, b3), 14);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wr6 wr6Var = (wr6) obj4;
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((String) obj2).getClass();
                if (th6 instanceof ff5) {
                    wr6Var.H(new gh5((byte) 24));
                } else {
                    wr6Var.H(new gh5((byte) 25));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return b(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return a(obj, obj2);
            default:
                p580 p580Var = (p580) obj4;
                fet fetVar16 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    bdx.p(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), p580Var, fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fa2(Object obj, byte b) {
        this.f9185a = b;
        this.b = obj;
    }
}
