package a;

import android.app.RemoteAction;
import android.os.Bundle;
import android.view.textclassifier.TextClassification;
import android.widget.CompoundButton;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l7p0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19570a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7p0(Object obj, byte b) {
        this.f19570a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.f19570a;
        yje yjeVar = null;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        byte b3 = 3;
        boolean z = false;
        boolean z2 = false;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                m7p0 m7p0Var = (m7p0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s9m0 s9m0Var = m7p0.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = fetVar.i(m7p0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new k7p0(m7p0Var, b2);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(m7p0Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new k7p0(m7p0Var, b3);
                        fetVar.o0(objP2);
                    }
                    v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
                    pz40 pz40VarY = ((i3t0) ((k3t0) m7p0Var.M1.getValue())).y(fetVar);
                    boolean zI3 = fetVar.i(m7p0Var);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new ttn0(m7p0Var, (byte) 20);
                        fetVar.o0(objP3);
                    }
                    j47.p0(pz40VarY, (Function1) objP3, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                h9p0 h9p0Var = (h9p0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y2m0 y2m0Var = h9p0.V1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI4 = fetVar2.i(h9p0Var);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new g9p0(h9p0Var, b2);
                        fetVar2.o0(objP4);
                    }
                    Function0 function1 = (Function0) objP4;
                    boolean zI5 = fetVar2.i(h9p0Var);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new g9p0(h9p0Var, b3);
                        fetVar2.o0(objP5);
                    }
                    v3c.z(function1, (Function0) objP5, null, fetVar2, 0, 4);
                    k3t0 k3t0VarG0 = h9p0Var.G0();
                    boolean zI6 = fetVar2.i(h9p0Var);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new g0p0(1, h9p0Var, h9p0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/team_details/presentation/main/model/TeamDetailsSideEffect;)V", 0, (byte) 8);
                        fetVar2.o0(objP6);
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar2);
                    boolean zI7 = fetVar2.i(k3t0VarG0) | fetVar2.i(h9p0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP7 = fetVar2.P();
                    if (zI7 || objP7 == cl5Var) {
                        objP7 = new tmj0(k3t0VarG0, h9p0Var, pz40VarF, null, (byte) 10);
                        fetVar2.o0(objP7);
                    }
                    m0x0.t(fetVar2, h9p0Var, (Function2) objP7);
                    pz40 pz40VarY2 = ((i3t0) h9p0Var.G0()).y(fetVar2);
                    qdz qdzVar = h9p0Var.S1;
                    boolean zI8 = fetVar2.i(h9p0Var);
                    Object objP8 = fetVar2.P();
                    if (zI8 || objP8 == cl5Var) {
                        objP8 = new f9p0(h9p0Var, (byte) 2);
                        fetVar2.o0(objP8);
                    }
                    Function1 function2 = (Function1) objP8;
                    boolean zI9 = fetVar2.i(h9p0Var);
                    Object objP9 = fetVar2.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new f9p0(h9p0Var, (byte) 3);
                        fetVar2.o0(objP9);
                    }
                    ohm0.c(pz40VarY2, qdzVar, function2, (Function1) objP9, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                sap0 sap0Var = (sap0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                j6m0 j6m0Var = sap0.R1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI10 = fetVar3.i(sap0Var);
                    Object objP10 = fetVar3.P();
                    if (zI10 || objP10 == cl5Var) {
                        objP10 = new rap0(sap0Var, b2);
                        fetVar3.o0(objP10);
                    }
                    Function0 function3 = (Function0) objP10;
                    boolean zI11 = fetVar3.i(sap0Var);
                    Object objP11 = fetVar3.P();
                    if (zI11 || objP11 == cl5Var) {
                        objP11 = new rap0(sap0Var, b3);
                        fetVar3.o0(objP11);
                    }
                    v3c.z(function3, (Function0) objP11, null, fetVar3, 0, 4);
                    k3t0 k3t0VarG1 = sap0Var.G0();
                    boolean zI12 = fetVar3.i(sap0Var);
                    Object objP12 = fetVar3.P();
                    if (zI12 || objP12 == cl5Var) {
                        g0p0 g0p0Var = new g0p0(1, sap0Var, sap0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/team_details/presentation/results/model/TeamDetailsResultsSideEffect;)V", 0, (byte) 9);
                        fetVar3.o0(g0p0Var);
                        objP12 = g0p0Var;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP12), fetVar3);
                    boolean zI13 = fetVar3.i(k3t0VarG1) | fetVar3.i(sap0Var) | fetVar3.e(3) | fetVar3.g(pz40VarF2);
                    Object objP13 = fetVar3.P();
                    if (zI13 || objP13 == cl5Var) {
                        tmj0 tmj0Var = new tmj0(k3t0VarG1, sap0Var, pz40VarF2, null, (byte) 11);
                        fetVar3.o0(tmj0Var);
                        objP13 = tmj0Var;
                    }
                    m0x0.t(fetVar3, sap0Var, (Function2) objP13);
                    pz40 pz40VarY3 = ((i3t0) sap0Var.G0()).y(fetVar3);
                    qdz qdzVar2 = sap0Var.P1;
                    boolean zI14 = fetVar3.i(sap0Var);
                    Object objP14 = fetVar3.P();
                    if (zI14 || objP14 == cl5Var) {
                        objP14 = new ttn0(sap0Var, (byte) 23);
                        fetVar3.o0(objP14);
                    }
                    jd8.V(pz40VarY3, qdzVar2, (Function1) objP14, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                atm0.b((rep0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                a8z a8zVar = ((xgp0) obj3).M1;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m6m0 m6m0Var = xgp0.P1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar4);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI15 = fetVar4.i(k3t0Var);
                    Object objP15 = fetVar4.P();
                    if (zI15 || objP15 == cl5Var) {
                        g0p0 g0p0Var2 = new g0p0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar4.o0(g0p0Var2);
                        objP15 = g0p0Var2;
                    }
                    uc9.O(0, fetVar4, null, pz40VarY4, (Function1) ((jhy) objP15));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                a8z a8zVar2 = ((jkp0) obj3).O1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s2m0 s2m0Var = jkp0.Q1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar5);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI16 = fetVar5.i(k3t0Var2);
                    Object objP16 = fetVar5.P();
                    if (zI16 || objP16 == cl5Var) {
                        g0p0 g0p0Var3 = new g0p0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar5.o0(g0p0Var3);
                        objP16 = g0p0Var3;
                    }
                    ny9.J(pz40VarY5, (Function1) ((jhy) objP16), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 6:
                ykp0 ykp0Var = (ykp0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = ykp0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ykp0Var.f.getClass();
                } while (!p7m0Var.m(value, qkp0.a((qkp0) value, 0L, false, true, null, 0L, 25)));
                return Unit.f46060a;
            case 7:
                a8z a8zVar3 = ((inp0) obj3).O1;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                j6m0 j6m0Var2 = inp0.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar6);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI17 = fetVar6.i(k3t0Var3);
                    Object objP17 = fetVar6.P();
                    if (zI17 || objP17 == cl5Var) {
                        g0p0 g0p0Var4 = new g0p0(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar6.o0(g0p0Var4);
                        objP17 = g0p0Var4;
                    }
                    p8a.I(pz40VarY6, (Function1) ((jhy) objP17), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 8:
                a8z a8zVar4 = ((lop0) obj3).P1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s9m0 s9m0Var2 = lop0.Q1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar7);
                    k3t0 k3t0Var4 = (k3t0) a8zVar4.getValue();
                    boolean zI18 = fetVar7.i(k3t0Var4);
                    Object objP18 = fetVar7.P();
                    if (zI18 || objP18 == cl5Var) {
                        g0p0 g0p0Var5 = new g0p0(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar7.o0(g0p0Var5);
                        objP18 = g0p0Var5;
                    }
                    ofm0.e(pz40VarY7, (Function1) ((jhy) objP18), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 9:
                pop0 pop0Var = (pop0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                    xx7 xx7Var = gqw0.n;
                    qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                    boolean zG = fetVar8.g(pop0Var);
                    Object objP19 = fetVar8.P();
                    if (zG || objP19 == cl5Var) {
                        objP19 = new nop0((Object) pop0Var, (byte) (z ? 1 : 0));
                        fetVar8.o0(objP19);
                    }
                    b8k0.e(mm40VarN, null, null, qw3Var, xx7Var, null, false, null, (Function1) objP19, fetVar8, 196608, 462);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 10:
                a8z a8zVar5 = ((bsp0) obj3).P1;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                j6m0 j6m0Var3 = bsp0.R1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pz40 pz40VarY8 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar9);
                    k3t0 k3t0Var5 = (k3t0) a8zVar5.getValue();
                    boolean zI19 = fetVar9.i(k3t0Var5);
                    Object objP20 = fetVar9.P();
                    if (zI19 || objP20 == cl5Var) {
                        g0p0 g0p0Var6 = new g0p0(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar9.o0(g0p0Var6);
                        objP20 = g0p0Var6;
                    }
                    q8a.F(pz40VarY8, (Function1) ((jhy) objP20), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 11:
                kyp0 kyp0Var = (kyp0) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                y2m0 y2m0Var2 = kyp0.Q1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k3t0 k3t0VarG2 = kyp0Var.G0();
                    boolean zI20 = fetVar10.i(kyp0Var);
                    Object objP21 = fetVar10.P();
                    if (zI20 || objP21 == cl5Var) {
                        g0p0 g0p0Var7 = new g0p0(1, kyp0Var, kyp0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/statistic/tennis/impl/summary/presentation/model/TennisSummarySideEffect;)V", 0, (byte) 20);
                        fetVar10.o0(g0p0Var7);
                        objP21 = g0p0Var7;
                    }
                    clz clzVar = (clz) fetVar10.k(or00.f25714a);
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP21), fetVar10);
                    boolean zI21 = fetVar10.i(k3t0VarG2) | fetVar10.i(clzVar) | fetVar10.e(3) | fetVar10.g(pz40VarF3);
                    Object objP22 = fetVar10.P();
                    if (zI21 || objP22 == cl5Var) {
                        kc70 kc70Var = new kc70(k3t0VarG2, clzVar, pz40VarF3, null, (byte) 23);
                        fetVar10.o0(kc70Var);
                        objP22 = kc70Var;
                    }
                    m0x0.t(fetVar10, clzVar, (Function2) objP22);
                    oyp0 oyp0Var = (oyp0) ((i3t0) kyp0Var.G0()).y(fetVar10).getValue();
                    k3t0 k3t0VarG3 = kyp0Var.G0();
                    boolean zI22 = fetVar10.i(k3t0VarG3);
                    Object objP23 = fetVar10.P();
                    if (zI22 || objP23 == cl5Var) {
                        g0p0 g0p0Var8 = new g0p0(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar10.o0(g0p0Var8);
                        objP23 = g0p0Var8;
                    }
                    y9a.L(oyp0Var, (Function1) ((jhy) objP23), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 12:
                a8z a8zVar6 = ((ryp0) obj3).M1;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                j6m0 j6m0Var4 = ryp0.P1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    lzp0 lzp0Var = (lzp0) ((i3t0) ((k3t0) a8zVar6.getValue())).y(fetVar11).getValue();
                    k3t0 k3t0Var6 = (k3t0) a8zVar6.getValue();
                    boolean zI23 = fetVar11.i(k3t0Var6);
                    Object objP24 = fetVar11.P();
                    if (zI23 || objP24 == cl5Var) {
                        g0p0 g0p0Var9 = new g0p0(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar11.o0(g0p0Var9);
                        objP24 = g0p0Var9;
                    }
                    zgc.G(lzp0Var, (Function1) ((jhy) objP24), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((nzp0) obj3).H(new zgp0((byte) 18));
                return Unit.f46060a;
            case 14:
                a8z a8zVar7 = ((b0q0) obj3).N1;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                g9m0 g9m0Var = b0q0.P1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pz40 pz40VarY9 = ((i3t0) ((k3t0) a8zVar7.getValue())).y(fetVar12);
                    k3t0 k3t0Var7 = (k3t0) a8zVar7.getValue();
                    boolean zI24 = fetVar12.i(k3t0Var7);
                    Object objP25 = fetVar12.P();
                    if (zI24 || objP25 == cl5Var) {
                        g0p0 g0p0Var10 = new g0p0(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar12.o0(g0p0Var10);
                        objP25 = g0p0Var10;
                    }
                    j2e.D(0, fetVar12, null, pz40VarY9, (Function1) ((jhy) objP25));
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 15:
                iiy[] iiyVarArr = p1q0.Q1;
                int iH = f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST");
                x1q0 x1q0VarH0 = ((p1q0) obj3).H0();
                byte b4 = 10;
                sac.V(jiu0.a(x1q0VarH0), new nop0(x1q0VarH0, b4), null, null, new defpackage.e(x1q0VarH0, iH, yjeVar, b4), 14);
                return Unit.f46060a;
            case 16:
                a8z a8zVar8 = ((j3q0) obj3).O1;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m6m0 m6m0Var2 = j3q0.P1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pz40 pz40VarY10 = ((i3t0) ((k3t0) a8zVar8.getValue())).y(fetVar13);
                    k3t0 k3t0Var8 = (k3t0) a8zVar8.getValue();
                    boolean zI25 = fetVar13.i(k3t0Var8);
                    Object objP26 = fetVar13.P();
                    if (zI25 || objP26 == cl5Var) {
                        g0p0 g0p0Var11 = new g0p0(1, k3t0Var8, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar13.o0(g0p0Var11);
                        objP26 = g0p0Var11;
                    }
                    tke.N(pz40VarY10, (Function1) ((jhy) objP26), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                tke.m((m39) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                fet fetVar14 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar14.e0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                fetVar14.r(false);
                return strValueOf;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar15 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar15.e0(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                fetVar15.r(false);
                return string;
            case 20:
                ((Integer) obj2).getClass();
                ((e9q0) obj3).a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                xbq0 xbq0Var = (xbq0) obj3;
                CompoundButton compoundButton = (CompoundButton) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m6m0 m6m0Var3 = xbq0.O1;
                if (compoundButton != null) {
                    compoundButton.postDelayed(new dy3(xbq0Var, zBooleanValue), 250L);
                }
                return Unit.f46060a;
            case 22:
                int iIntValue14 = ((Integer) obj).intValue();
                int iIntValue15 = ((Integer) obj2).intValue();
                s9m0 s9m0Var3 = weq0.Q1;
                wfq0 wfq0VarJ0 = ((weq0) obj3).J0();
                bby bbyVar = wfq0VarJ0.v;
                if (bbyVar == null || !bbyVar.isActive()) {
                    wfq0VarJ0.v = sac.i0(jiu0.a(wfq0VarJ0), wfq0.class.getName().concat(".makeAction"), 5, 5L, q3d.j(oqt0.class, ff5.class, zhi0.class, qct.class), null, new see(wfq0VarJ0, iIntValue14, iIntValue15, null), null, wfq0VarJ0.q.b, new zeq0(wfq0VarJ0, z2 ? 1 : 0), null, 592);
                }
                return Unit.f46060a;
            case 23:
                diq0 diq0Var = (diq0) obj3;
                a8z a8zVar9 = diq0Var.a2;
                fet fetVar16 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                g9m0 g9m0Var2 = diq0.b2;
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    pz40 pz40VarY11 = ((i3t0) ((k3t0) a8zVar9.getValue())).y(fetVar16);
                    k3t0 k3t0Var9 = (k3t0) a8zVar9.getValue();
                    boolean zI26 = fetVar16.i(diq0Var);
                    Object objP27 = fetVar16.P();
                    Object obj4 = objP27;
                    if (zI26 || objP27 == cl5Var) {
                        w6q0 w6q0Var = new w6q0(1, diq0Var, diq0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/lock/impl/presentation/model/TimeIsEndSideEffect;)V", 0, (byte) 12);
                        fetVar16.o0(w6q0Var);
                        obj4 = w6q0Var;
                    }
                    clz clzVar2 = (clz) fetVar16.k(or00.f25714a);
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) obj4), fetVar16);
                    boolean zI27 = fetVar16.i(k3t0Var9) | fetVar16.i(clzVar2) | fetVar16.e(3) | fetVar16.g(pz40VarF4);
                    Object objP28 = fetVar16.P();
                    if (zI27 || objP28 == cl5Var) {
                        kc70 kc70Var2 = new kc70(k3t0Var9, clzVar2, pz40VarF4, null, (byte) 24);
                        fetVar16.o0(kc70Var2);
                        objP28 = kc70Var2;
                    }
                    m0x0.t(fetVar16, clzVar2, (Function2) objP28);
                    boolean zI28 = fetVar16.i(diq0Var);
                    Object objP29 = fetVar16.P();
                    Object obj5 = objP29;
                    if (zI28 || objP29 == cl5Var) {
                        ciq0 ciq0Var = new ciq0(diq0Var, (byte) 1);
                        fetVar16.o0(ciq0Var);
                        obj5 = ciq0Var;
                    }
                    yqm0.d(pz40VarY11, (Function0) obj5, fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 24:
                akq0 akq0Var = (akq0) obj3;
                fet fetVar17 = (fet) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                s9m0 s9m0Var4 = akq0.P1;
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    boolean zI29 = fetVar17.i(akq0Var);
                    Object objP30 = fetVar17.P();
                    if (zI29 || objP30 == cl5Var) {
                        objP30 = new yjq0(akq0Var, (byte) 3);
                        fetVar17.o0(objP30);
                    }
                    qcc.X(akq0Var, (Function0) objP30);
                    pz40 pz40VarY12 = ((i3t0) akq0Var.G0()).y(fetVar17);
                    k3t0 k3t0VarG4 = akq0Var.G0();
                    boolean zI30 = fetVar17.i(k3t0VarG4);
                    Object objP31 = fetVar17.P();
                    if (zI30 || objP31 == cl5Var) {
                        w6q0 w6q0Var2 = new w6q0(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar17.o0(w6q0Var2);
                        objP31 = w6q0Var2;
                    }
                    cjx.K(pz40VarY12, (Function1) ((jhy) objP31), fetVar17, 0);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkq0 lkq0Var = (lkq0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = lkq0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    lkq0Var.f.getClass();
                } while (!p7m0Var2.m(value2, ikq0.a((ikq0) value2, false, false, true, false, null, 0, 0, 242)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wmq0 wmq0Var = (wmq0) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    wmq0Var.w(new smq0(str));
                } else {
                    wmq0Var.w(tmq0.f34206a);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((tpq0) obj3).x(false);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((yqq0) obj3).x(false);
                return Unit.f46060a;
            default:
                u4s u4sVar = (u4s) obj;
                y2m0 y2m0Var3 = xsq0.P1;
                u4sVar.getClass();
                xtq0 xtq0VarH0 = ((xsq0) obj3).H0();
                sac.V(jiu0.a(xtq0VarH0), new w6q0(1, xtq0VarH0, xtq0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, xtq0VarH0.x.f22085a, new ze1((Object) u4sVar, (Object) xtq0VarH0, obj2, (yje) null, (byte) 15), 10);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ l7p0(Object obj, int i, byte b) {
        this.f19570a = b;
        this.b = obj;
    }
}
