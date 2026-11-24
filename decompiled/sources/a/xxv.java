package a;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xxv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41677a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xxv(qow qowVar) {
        this.f41677a = (byte) 12;
        this.b = qowVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r2v144 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        List list;
        vcw vcwVar;
        Object n5wVar;
        Object value;
        Object value2;
        Object g1yVar;
        byte b = this.f41677a;
        Cnew cnew = 0;
        cl5 cl5Var = ukd.f35823a;
        boolean z = false;
        byte b2 = 2;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                vmu0 vmu0Var = (vmu0) obj3;
                yxv yxvVar = (yxv) obj;
                yxv yxvVar2 = (yxv) obj2;
                yxvVar.getClass();
                yxvVar2.getClass();
                if (qcc.e0(vmu0Var, yxvVar.f43441a, gp00.b)) {
                    yxvVar.f43441a = vmu0Var;
                    yxvVar.b.g(vmu0Var);
                }
                if (qcc.e0(vmu0Var, yxvVar2.f43441a, gp00.c)) {
                    yxvVar2.f43441a = vmu0Var;
                    yxvVar2.b.g(vmu0Var);
                }
                return Unit.f46060a;
            case 1:
                r2w r2wVar = (r2w) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                d3w d3wVar = (d3w) r2wVar.y.getValue();
                if (d3wVar.d || d3wVar.e || d3wVar.f) {
                    r2wVar.D();
                }
                return Unit.f46060a;
            case 2:
                naw nawVar = (naw) obj3;
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                qjj.W(jiu0.a(nawVar), null, null, new j0s(nawVar, str, cnew, (byte) 29), 3);
                return Unit.f46060a;
            case 3:
                cdw cdwVar = (cdw) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                rqt rqtVar = cdw.R1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = fetVar.i(cdwVar);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new zcw(cdwVar, (byte) 2);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(cdwVar);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new zcw(cdwVar, (byte) 3);
                        fetVar.o0(objP2);
                    }
                    v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
                    k3t0 k3t0VarG0 = cdwVar.G0();
                    boolean zI3 = fetVar.i(cdwVar);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new n5w(1, cdwVar, cdw.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/hltv_awards/presentation/main/screen/model/HltvAwardsSideEffect;)V", 0, (byte) 13);
                        fetVar.o0(objP3);
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar);
                    boolean zI4 = fetVar.i(k3t0VarG0) | fetVar.i(cdwVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new bio(k3t0VarG0, cdwVar, pz40VarF, null, (byte) 13);
                        fetVar.o0(objP4);
                    }
                    m0x0.t(fetVar, cdwVar, (Function2) objP4);
                    pz40 pz40VarY = ((i3t0) cdwVar.G0()).y(fetVar);
                    boolean zI5 = fetVar.i(cdwVar);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new adw(cdwVar, z ? (byte) 1 : (byte) 0);
                        fetVar.o0(objP5);
                    }
                    wwb.r(pz40VarY, (Function1) objP5, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                tew tewVar = (tew) obj3;
                lew lewVar = (lew) obj2;
                j0g0 j0g0Var = tewVar.f33842a;
                if (j0g0Var != null) {
                    Object obj4 = j0g0Var.f15681a;
                    cnew = (Cnew) (obj4 instanceof g0g0 ? null : obj4);
                }
                long j2 = lewVar.f19925a;
                if (j2 != 0) {
                    j = j2;
                } else if (cnew == 0 || (list = cnew.b) == null || (vcwVar = (vcw) CollectionsKt.firstOrNull(list)) == null) {
                    j = 0;
                } else {
                    j2 = vcwVar.f37207a;
                    j = j2;
                }
                return lew.a(lewVar, j, tewVar, null, 12);
            case 5:
                oiw oiwVar = (oiw) obj3;
                a8z a8zVar = oiwVar.N1;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI6 = fetVar2.i(oiwVar);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        n5wVar = new n5w(1, oiwVar, oiw.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/ufc/impl/home/presentation/model/HomeSideEffect;)V", 0, (byte) 18);
                        fetVar2.o0(n5wVar);
                    } else {
                        n5wVar = objP6;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) n5wVar), fetVar2);
                    boolean zE = fetVar2.e(3) | fetVar2.i(k3t0Var) | fetVar2.i(oiwVar) | fetVar2.g(pz40VarF2);
                    Object objP7 = fetVar2.P();
                    if (zE || objP7 == cl5Var) {
                        bio bioVar = new bio(k3t0Var, oiwVar, pz40VarF2, null, (byte) 14);
                        fetVar2.o0(bioVar);
                        objP7 = bioVar;
                    }
                    m0x0.t(fetVar2, oiwVar, (Function2) objP7);
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar2);
                    qdz qdzVar = oiwVar.O1;
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI7 = fetVar2.i(k3t0Var2);
                    Object objP8 = fetVar2.P();
                    if (zI7 || objP8 == cl5Var) {
                        objP8 = new n5w(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar2.o0(objP8);
                    }
                    s5x0.q(pz40VarY2, qdzVar, (Function1) ((jhy) objP8), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 6:
                piw piwVar = (piw) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                sqt sqtVar = piw.Y1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI8 = fetVar3.i(piwVar);
                    Object objP9 = fetVar3.P();
                    Object obj5 = objP9;
                    if (zI8 || objP9 == cl5Var) {
                        miw miwVar = new miw(piwVar, (byte) 4);
                        fetVar3.o0(miwVar);
                        obj5 = miwVar;
                    }
                    Function0 function1 = (Function0) obj5;
                    boolean zI9 = fetVar3.i(piwVar);
                    Object objP10 = fetVar3.P();
                    Object obj6 = objP10;
                    if (zI9 || objP10 == cl5Var) {
                        miw miwVar2 = new miw(piwVar, (byte) 5);
                        fetVar3.o0(miwVar2);
                        obj6 = miwVar2;
                    }
                    v3c.z(function1, (Function0) obj6, null, fetVar3, 0, 4);
                    pz40 pz40VarY3 = ((i3t0) piwVar.H0()).y(fetVar3);
                    k3t0 k3t0VarH0 = piwVar.H0();
                    boolean zI10 = fetVar3.i(piwVar);
                    Object objP11 = fetVar3.P();
                    Object obj7 = objP11;
                    if (zI10 || objP11 == cl5Var) {
                        n5w n5wVar2 = new n5w(1, piwVar, piw.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/home/presentation/screen/common/model/HomeSideEffect;)V", 0, (byte) 20);
                        fetVar3.o0(n5wVar2);
                        obj7 = n5wVar2;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) obj7), fetVar3);
                    boolean zI11 = fetVar3.i(k3t0VarH0) | fetVar3.i(piwVar) | fetVar3.e(3) | fetVar3.g(pz40VarF3);
                    Object objP12 = fetVar3.P();
                    Object obj8 = objP12;
                    if (zI11 || objP12 == cl5Var) {
                        bio bioVar2 = new bio(k3t0VarH0, piwVar, pz40VarF3, null, (byte) 15);
                        fetVar3.o0(bioVar2);
                        obj8 = bioVar2;
                    }
                    m0x0.t(fetVar3, piwVar, (Function2) obj8);
                    qdz qdzVar2 = piwVar.V1;
                    boolean zI12 = fetVar3.i(piwVar);
                    Object objP13 = fetVar3.P();
                    Object obj9 = objP13;
                    if (zI12 || objP13 == cl5Var) {
                        kiw kiwVar = new kiw(piwVar, (byte) 2);
                        fetVar3.o0(kiwVar);
                        obj9 = kiwVar;
                    }
                    Function1 function2 = (Function1) obj9;
                    boolean zI13 = fetVar3.i(piwVar);
                    Object objP14 = fetVar3.P();
                    Object obj10 = objP14;
                    if (zI13 || objP14 == cl5Var) {
                        kiw kiwVar2 = new kiw(piwVar, (byte) 3);
                        fetVar3.o0(kiwVar2);
                        obj10 = kiwVar2;
                    }
                    Function1 function3 = (Function1) obj10;
                    boolean zI14 = fetVar3.i(piwVar);
                    Object objP15 = fetVar3.P();
                    Object obj11 = objP15;
                    if (zI14 || objP15 == cl5Var) {
                        kiw kiwVar3 = new kiw(piwVar, (byte) 1);
                        fetVar3.o0(kiwVar3);
                        obj11 = kiwVar3;
                    }
                    cfx0.l(pz40VarY3, qdzVar2, function2, function3, (Function1) obj11, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                s5x0.p((cjw) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                a8z a8zVar2 = ((vmw) obj3).O1;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tqt tqtVar = vmw.Q1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar4);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI15 = fetVar4.i(k3t0Var3);
                    Object objP16 = fetVar4.P();
                    if (zI15 || objP16 == cl5Var) {
                        objP16 = new n5w(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar4.o0(objP16);
                    }
                    xf0.r(0, fetVar4, null, pz40VarY4, (Function1) ((jhy) objP16));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                kbc.v((xmw) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                a8z a8zVar3 = ((fow) obj3).N1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                art artVar = fow.P1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar5);
                    k3t0 k3t0Var4 = (k3t0) a8zVar3.getValue();
                    boolean zI16 = fetVar5.i(k3t0Var4);
                    Object objP17 = fetVar5.P();
                    if (zI16 || objP17 == cl5Var) {
                        objP17 = new n5w(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar5.o0(objP17);
                    }
                    ay3.s(0, fetVar5, null, pz40VarY5, (Function1) ((jhy) objP17));
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                qbc.w((dpw) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 12:
                qow qowVar = (qow) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objP18 = fetVar6.P();
                    if (objP18 == cl5Var) {
                        objP18 = new h7w((byte) 10);
                        fetVar6.o0(objP18);
                    }
                    Function1 function4 = (Function1) objP18;
                    boolean zG = fetVar6.g(qowVar);
                    Object objP19 = fetVar6.P();
                    if (zG || objP19 == cl5Var) {
                        objP19 = new adw(qowVar, b2);
                        fetVar6.o0(objP19);
                    }
                    dwi0.b(function4, jm40.b, (Function1) objP19, fetVar6, 6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                cqw cqwVar = (cqw) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                rqt rqtVar2 = cqw.S1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qcc.v((k3t0) cqwVar.Q1.getValue(), (llm0) cqwVar.N1.n(cqwVar, cqw.U1[2]), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                a8z a8zVar4 = ((arw) obj3).O1;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                sqt sqtVar2 = arw.Q1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar8);
                    k3t0 k3t0Var5 = (k3t0) a8zVar4.getValue();
                    boolean zI17 = fetVar8.i(k3t0Var5);
                    Object objP20 = fetVar8.P();
                    if (zI17 || objP20 == cl5Var) {
                        objP20 = new n5w(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar8.o0(objP20);
                    }
                    b34.z(0, fetVar8, null, pz40VarY6, (Function1) ((jhy) objP20));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                ((Float) obj).getClass();
                ((ConstraintLayout) ((c0x) obj3).d.e).setAlpha(1.0f - ((Float) obj2).floatValue());
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ((z7x) obj3).a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 17:
                beo beoVar = (beo) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jwb.p(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), new qw3(4.0f, true, new jf4((byte) 14)), new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, 0, 0, u1c.M(-359109128, new elm(beoVar, (byte) 22), fetVar9), fetVar9, 1575936, 48);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 18:
                a8z a8zVar5 = ((wbx) obj3).M1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                bst bstVar = wbx.P1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fcx fcxVar = (fcx) ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar10).getValue();
                    k3t0 k3t0Var6 = (k3t0) a8zVar5.getValue();
                    boolean zI18 = fetVar10.i(k3t0Var6);
                    Object objP21 = fetVar10.P();
                    if (zI18 || objP21 == cl5Var) {
                        objP21 = new n5w(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar10.o0(objP21);
                    }
                    uc9.B(fcxVar, (Function1) ((jhy) objP21), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                m7x.a((voa0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                t0y t0yVar = (t0y) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                gst gstVar = t0y.P1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pz40 pz40VarY7 = ((i3t0) t0yVar.G0()).y(fetVar11);
                    k3t0 k3t0VarG1 = t0yVar.G0();
                    clz clzVar = (clz) fetVar11.k(or00.f25714a);
                    boolean zI19 = fetVar11.i(t0yVar);
                    Object objP22 = fetVar11.P();
                    Object obj12 = objP22;
                    if (zI19 || objP22 == cl5Var) {
                        adw adwVar = new adw(t0yVar, (byte) 19);
                        fetVar11.o0(adwVar);
                        obj12 = adwVar;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) obj12, fetVar11);
                    boolean zE2 = fetVar11.e(3) | fetVar11.i(k3t0VarG1) | fetVar11.i(clzVar) | fetVar11.g(pz40VarF4);
                    Object objP23 = fetVar11.P();
                    Object obj13 = objP23;
                    if (zE2 || objP23 == cl5Var) {
                        pc pcVar = new pc(k3t0VarG1, clzVar, pz40VarF4, null, (byte) 22);
                        fetVar11.o0(pcVar);
                        obj13 = pcVar;
                    }
                    m0x0.t(fetVar11, clzVar, (Function2) obj13);
                    k3t0 k3t0VarG2 = t0yVar.G0();
                    boolean zI20 = fetVar11.i(k3t0VarG2);
                    Object objP24 = fetVar11.P();
                    if (zI20 || objP24 == cl5Var) {
                        n5w n5wVar3 = new n5w(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar11.o0(n5wVar3);
                        objP24 = n5wVar3;
                    }
                    y9a.E(pz40VarY7, (Function1) ((jhy) objP24), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                r8x.x((e0s) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                e9x.B((d0s) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                y9a.C((v6y) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                gyy gyyVar = (gyy) obj3;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                rqt rqtVar3 = gyy.P1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI21 = fetVar12.i(gyyVar);
                    Object objP25 = fetVar12.P();
                    if (zI21 || objP25 == cl5Var) {
                        objP25 = new fyy(gyyVar, (byte) 1);
                        fetVar12.o0(objP25);
                    }
                    Function0 function5 = (Function0) objP25;
                    boolean zI22 = fetVar12.i(gyyVar);
                    Object objP26 = fetVar12.P();
                    if (zI22 || objP26 == cl5Var) {
                        objP26 = new fyy(gyyVar, (byte) 2);
                        fetVar12.o0(objP26);
                    }
                    v3c.z(function5, (Function0) objP26, null, fetVar12, 0, 4);
                    k3t0 k3t0VarG3 = gyyVar.G0();
                    boolean zI23 = fetVar12.i(gyyVar);
                    Object objP27 = fetVar12.P();
                    if (zI23 || objP27 == cl5Var) {
                        objP27 = new g1y(1, gyyVar, gyy.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/ufc/impl/last_fights/presentation/model/LastFightsSideEffect;)V", 0, (byte) 13);
                        fetVar12.o0(objP27);
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP27), fetVar12);
                    boolean zI24 = fetVar12.i(k3t0VarG3) | fetVar12.i(gyyVar) | fetVar12.e(3) | fetVar12.g(pz40VarF5);
                    Object objP28 = fetVar12.P();
                    if (zI24 || objP28 == cl5Var) {
                        objP28 = new bio(k3t0VarG3, gyyVar, pz40VarF5, null, (byte) 20);
                        fetVar12.o0(objP28);
                    }
                    m0x0.t(fetVar12, gyyVar, (Function2) objP28);
                    pz40 pz40VarY8 = ((i3t0) gyyVar.G0()).y(fetVar12);
                    k3t0 k3t0VarG4 = gyyVar.G0();
                    boolean zI25 = fetVar12.i(k3t0VarG4);
                    Object objP29 = fetVar12.P();
                    if (zI25 || objP29 == cl5Var) {
                        g1y g1yVar2 = new g1y(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                        fetVar12.o0(g1yVar2);
                        objP29 = g1yVar2;
                    }
                    qjj.y(pz40VarY8, (Function1) ((jhy) objP29), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a8z a8zVar6 = ((pzy) obj3).M1;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                sqt sqtVar3 = pzy.Q1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pz40 pz40VarY9 = ((i3t0) ((k3t0) a8zVar6.getValue())).y(fetVar13);
                    k3t0 k3t0Var7 = (k3t0) a8zVar6.getValue();
                    boolean zI26 = fetVar13.i(k3t0Var7);
                    Object objP30 = fetVar13.P();
                    if (zI26 || objP30 == cl5Var) {
                        objP30 = new g1y(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar13.o0(objP30);
                    }
                    eeq.y(pz40VarY9, (Function1) ((jhy) objP30), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wzy wzyVar = (wzy) obj3;
                oyg0 oyg0Var = wzyVar.f;
                ocj ocjVar = wzyVar.i;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, rzy.a((rzy) value2, false, false, true)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, rzy.a((rzy) value, false, true, false)));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                s0z s0zVar = (s0z) obj3;
                a8z a8zVar7 = s0zVar.S1;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                bst bstVar2 = s0z.U1;
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    k3t0 k3t0Var8 = (k3t0) a8zVar7.getValue();
                    boolean zI27 = fetVar14.i(s0zVar);
                    Object objP31 = fetVar14.P();
                    if (zI27 || objP31 == cl5Var) {
                        g1yVar = new g1y(1, s0zVar, s0z.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/statistic/lastgames/presentation/models/LastGamesSideEffect;)V", 0, (byte) 16);
                        fetVar14.o0(g1yVar);
                    } else {
                        g1yVar = objP31;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) g1yVar), fetVar14);
                    boolean zE3 = fetVar14.e(3) | fetVar14.i(k3t0Var8) | fetVar14.i(s0zVar) | fetVar14.g(pz40VarF6);
                    Object objP32 = fetVar14.P();
                    if (zE3 || objP32 == cl5Var) {
                        bio bioVar3 = new bio(k3t0Var8, s0zVar, pz40VarF6, null, (byte) 21);
                        fetVar14.o0(bioVar3);
                        objP32 = bioVar3;
                    }
                    m0x0.t(fetVar14, s0zVar, (Function2) objP32);
                    pz40 pz40VarY10 = ((i3t0) ((k3t0) a8zVar7.getValue())).y(fetVar14);
                    k3t0 k3t0Var9 = (k3t0) a8zVar7.getValue();
                    boolean zI28 = fetVar14.i(k3t0Var9);
                    Object objP33 = fetVar14.P();
                    if (zI28 || objP33 == cl5Var) {
                        g1y g1yVar3 = new g1y(1, k3t0Var9, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                        fetVar14.o0(g1yVar3);
                        objP33 = g1yVar3;
                    }
                    ntr.E(0, fetVar14, null, pz40VarY10, (Function1) ((jhy) objP33));
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                csv csvVar = (csv) obj3;
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fetVar15.X();
                } else if (csvVar.c) {
                    fetVar15.e0(-228552991);
                    Iterator<E> it = csvVar.b.iterator();
                    while (it.hasNext()) {
                        ntr.V((gin0) it.next(), fetVar15, 0);
                    }
                    fetVar15.r(false);
                } else {
                    fetVar15.e0(-228404997);
                    fetVar15.r(false);
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ntr.V((gin0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xxv(Object obj, byte b) {
        this.f41677a = b;
        this.b = obj;
    }

    public /* synthetic */ xxv(Object obj, int i, byte b) {
        this.f41677a = b;
        this.b = obj;
    }
}
