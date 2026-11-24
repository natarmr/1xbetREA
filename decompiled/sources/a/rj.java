package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes6.dex */
public final class rj extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(Object obj, Object obj2, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = 3;
        switch (this.i) {
            case 0:
                rj rjVar = new rj(this.k, (yje) obj3, (byte) 0);
                rjVar.j = (Throwable) obj2;
                return rjVar.invokeSuspend(Unit.f46060a);
            case 1:
                rj rjVar2 = new rj(this.k, (yje) obj3, (byte) 1);
                rjVar2.j = (Throwable) obj2;
                return rjVar2.invokeSuspend(Unit.f46060a);
            case 2:
                rj rjVar3 = new rj(this.k, (yje) obj3, (byte) 2);
                rjVar3.j = (Throwable) obj2;
                return rjVar3.invokeSuspend(Unit.f46060a);
            case 3:
                rj rjVar4 = new rj((jgb) this.k, (yje) obj3, b);
                rjVar4.j = (Throwable) obj2;
                return rjVar4.invokeSuspend(Unit.f46060a);
            case 4:
                rj rjVar5 = new rj(this.k, (yje) obj3, (byte) 4);
                rjVar5.j = (Throwable) obj2;
                return rjVar5.invokeSuspend(Unit.f46060a);
            case 5:
                rj rjVar6 = new rj(this.k, (yje) obj3, (byte) 5);
                rjVar6.j = (Throwable) obj2;
                return rjVar6.invokeSuspend(Unit.f46060a);
            case 6:
                rj rjVar7 = new rj(this.k, (yje) obj3, (byte) 6);
                rjVar7.j = (Throwable) obj2;
                return rjVar7.invokeSuspend(Unit.f46060a);
            case 7:
                rj rjVar8 = new rj(this.k, (yje) obj3, (byte) 7);
                rjVar8.j = (Throwable) obj2;
                return rjVar8.invokeSuspend(Unit.f46060a);
            case 8:
                return new rj((y7b) this.j, (js20) this.k, (yje) obj3, (byte) 8).invokeSuspend(Unit.f46060a);
            case 9:
                rj rjVar9 = new rj(this.k, (yje) obj3, (byte) 9);
                rjVar9.j = (Throwable) obj2;
                return rjVar9.invokeSuspend(Unit.f46060a);
            case 10:
                rj rjVar10 = new rj(this.k, (yje) obj3, (byte) 10);
                rjVar10.j = (Throwable) obj2;
                return rjVar10.invokeSuspend(Unit.f46060a);
            case 11:
                rj rjVar11 = new rj(this.k, (yje) obj3, (byte) 11);
                rjVar11.j = (Throwable) obj2;
                return rjVar11.invokeSuspend(Unit.f46060a);
            case 12:
                rj rjVar12 = new rj(this.k, (yje) obj3, (byte) 12);
                rjVar12.j = (Throwable) obj2;
                return rjVar12.invokeSuspend(Unit.f46060a);
            case 13:
                rj rjVar13 = new rj(this.k, (yje) obj3, (byte) 13);
                rjVar13.j = (Throwable) obj2;
                return rjVar13.invokeSuspend(Unit.f46060a);
            case 14:
                rj rjVar14 = new rj(this.k, (yje) obj3, (byte) 14);
                rjVar14.j = (Throwable) obj2;
                return rjVar14.invokeSuspend(Unit.f46060a);
            case 15:
                rj rjVar15 = new rj(this.k, (yje) obj3, (byte) 15);
                rjVar15.j = (Throwable) obj2;
                return rjVar15.invokeSuspend(Unit.f46060a);
            case 16:
                rj rjVar16 = new rj((int) b, (yje) obj3, (byte) 16);
                rjVar16.j = (hcg) obj;
                rjVar16.k = (j0g0) obj2;
                return rjVar16.invokeSuspend(Unit.f46060a);
            case 17:
                rj rjVar17 = new rj(this.k, (yje) obj3, (byte) 17);
                rjVar17.j = (Throwable) obj2;
                return rjVar17.invokeSuspend(Unit.f46060a);
            case 18:
                return new rj((dch) this.j, (RelatedParams) this.k, (yje) obj3, (byte) 18).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rj rjVar18 = new rj(this.k, (yje) obj3, (byte) 19);
                rjVar18.j = (Throwable) obj2;
                return rjVar18.invokeSuspend(Unit.f46060a);
            case 20:
                return new rj((DsButton) this.j, (DsLottieEmpty) this.k, (yje) obj3, (byte) 20).invokeSuspend(Unit.f46060a);
            case 21:
                rj rjVar19 = new rj(this.k, (yje) obj3, (byte) 21);
                rjVar19.j = (Throwable) obj2;
                return rjVar19.invokeSuspend(Unit.f46060a);
            case 22:
                rj rjVar20 = new rj(this.k, (yje) obj3, (byte) 22);
                rjVar20.j = (Throwable) obj2;
                return rjVar20.invokeSuspend(Unit.f46060a);
            case 23:
                rj rjVar21 = new rj(this.k, (yje) obj3, (byte) 23);
                rjVar21.j = (Throwable) obj2;
                return rjVar21.invokeSuspend(Unit.f46060a);
            case 24:
                rj rjVar22 = new rj(this.k, (yje) obj3, (byte) 24);
                rjVar22.j = (Throwable) obj2;
                return rjVar22.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                rj rjVar23 = new rj(this.k, (yje) obj3, (byte) 25);
                rjVar23.j = (Throwable) obj2;
                return rjVar23.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rj rjVar24 = new rj(this.k, (yje) obj3, (byte) 26);
                rjVar24.j = (Throwable) obj2;
                return rjVar24.invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rj rjVar25 = new rj(this.k, (yje) obj3, (byte) 27);
                rjVar25.j = (Throwable) obj2;
                return rjVar25.invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                rj rjVar26 = new rj((int) b, (yje) obj3, (byte) 28);
                rjVar26.j = (ljg) obj;
                rjVar26.k = (hj40) obj2;
                return rjVar26.invokeSuspend(Unit.f46060a);
            default:
                rj rjVar27 = new rj(this.k, (yje) obj3, (byte) 29);
                rjVar27.j = (Throwable) obj2;
                rjVar27.invokeSuspend(Unit.f46060a);
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        kuw kuwVar;
        kuw kuwVar2;
        Object value2;
        Object value3;
        List list;
        List list2;
        List list3;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        Object value4;
        boolean z;
        byte b = this.i;
        c56 c56Var = c56.f3755a;
        byte b2 = 1;
        ?? errorCode = 0;
        errorCode = 0;
        int errorCode2 = 0;
        errorCode = 0;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((wj) this.k).e.b(th, new hhd((byte) 20));
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ul2 ul2Var = (ul2) this.k;
                int i = ul2.S;
                p7m0 p7m0Var = ul2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ul2Var.f.getClass();
                    th2.getClass();
                } while (!p7m0Var.m(value, nl2.a((nl2) value, null, false, false, new cds0(th2), false, false, false, null, null, 471)));
                ul2Var.I.b(th2, new ma2((byte) 15));
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((gp2) this.k).g.a(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ((jgb) this.k).c.a(th4);
                return Unit.f46060a;
            case 4:
                p36 p36Var = (p36) this.k;
                Throwable th5 = (Throwable) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(th5.getMessage(), "PROPHYLAXIS_CANCEL")) {
                    return Unit.f46060a;
                }
                zhi0 zhi0Var = th5 instanceof zhi0 ? (zhi0) th5 : null;
                if (zhi0Var != null && (kuwVar = zhi0Var.c) != null) {
                    errorCode = kuwVar.getErrorCode();
                }
                kt2 kt2Var = p36Var.d.f42966a;
                if (errorCode == 0) {
                    kt2Var.c("widget_line_error");
                } else {
                    b1j.w("error_code", Integer.valueOf((int) errorCode), kt2Var, "widget_line_error");
                }
                p36Var.e.f1455a.a(errorCode > 0 ? cui0.b(new i1p((int) errorCode, (byte) 2)) : xun.f41520a, 3150L);
                p36Var.k.g(c56Var);
                return Unit.f46060a;
            case 5:
                p36 p36Var2 = (p36) this.k;
                Throwable th6 = (Throwable) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                zhi0 zhi0Var2 = th6 instanceof zhi0 ? (zhi0) th6 : null;
                if (zhi0Var2 != null && (kuwVar2 = zhi0Var2.c) != null) {
                    errorCode2 = kuwVar2.getErrorCode();
                }
                kt2 kt2Var2 = p36Var2.d.f42966a;
                if (errorCode2 == 0) {
                    kt2Var2.c("widget_live_error");
                } else {
                    b1j.w("error_code", Integer.valueOf(errorCode2), kt2Var2, "widget_live_error");
                }
                p36Var2.e.f1455a.a(errorCode2 > 0 ? cui0.b(new i1p(errorCode2, (byte) 2)) : xun.f41520a, 3148L);
                p36Var2.k.g(c56Var);
                return Unit.f46060a;
            case 6:
                Throwable th7 = (Throwable) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ((fm7) this.k).t.b(th7, new i87((byte) 13));
                return Unit.f46060a;
            case 7:
                Throwable th8 = (Throwable) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ((h2b) this.k).E(th8);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                y7b y7bVar = (y7b) this.j;
                y7bVar.z.g(idf0.f14583a);
                y7bVar.x.b(lx7.f20801a);
                y7bVar.H(new j7b((js20) this.k, errorCode));
                return Unit.f46060a;
            case 9:
                Throwable th9 = (Throwable) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ajb ajbVar = (ajb) this.k;
                int i2 = ajb.E;
                ajbVar.O(th9);
                return Unit.f46060a;
            case 10:
                Throwable th10 = (Throwable) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                eqb eqbVar = (eqb) this.k;
                eqbVar.z(eqbVar.p, zpb.d);
                eqbVar.x(th10);
                return Unit.f46060a;
            case 11:
                Throwable th11 = (Throwable) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                if (th11 == null) {
                    p7m0 p7m0Var2 = ((svd) this.k).A;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, fvd.a((fvd) value2, false, true, false, false, false, null, 253)));
                }
                return Unit.f46060a;
            case 12:
                Throwable th12 = (Throwable) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (th12 == null) {
                    p7m0 p7m0Var3 = ((kyd) this.k).B;
                    do {
                        value3 = p7m0Var3.getValue();
                    } while (!p7m0Var3.m(value3, wxd.a((wxd) value3, false, null, false, true, false, 223)));
                }
                return Unit.f46060a;
            case 13:
                Throwable th13 = (Throwable) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                if (th13 == null) {
                    g1e g1eVar = (g1e) this.k;
                    g1eVar.H(g1eVar.B);
                }
                return Unit.f46060a;
            case 14:
                Throwable th14 = (Throwable) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((lbf) this.k).w(th14);
                return Unit.f46060a;
            case 15:
                Throwable th15 = (Throwable) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                hbg hbgVar = (hbg) this.k;
                hbgVar.l.b(th15, new zag(hbgVar, b2));
                return Unit.f46060a;
            case 16:
                hcg hcgVar = (hcg) this.j;
                j0g0 j0g0Var3 = (j0g0) this.k;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                if (hcgVar == null || (j0g0Var2 = hcgVar.f12822a) == null) {
                    list = null;
                } else {
                    Object obj2 = j0g0Var2.f15681a;
                    if (obj2 instanceof g0g0) {
                        obj2 = null;
                    }
                    fcg fcgVar = (fcg) obj2;
                    if (fcgVar != null) {
                        list = fcgVar.f9311a;
                    } else {
                        list = null;
                    }
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                if (hcgVar == null || (j0g0Var = hcgVar.b) == null) {
                    list2 = null;
                } else {
                    Object obj3 = j0g0Var.f15681a;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    fcg fcgVar2 = (fcg) obj3;
                    if (fcgVar2 != null) {
                        list2 = fcgVar2.f9311a;
                    } else {
                        list2 = null;
                    }
                }
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                if (j0g0Var3 != null) {
                    Object obj4 = j0g0Var3.f15681a;
                    if (obj4 instanceof g0g0) {
                        obj4 = null;
                    }
                    vdg vdgVar = (vdg) obj4;
                    if (vdgVar != null) {
                        list3 = vdgVar.b;
                    } else {
                        list3 = null;
                    }
                } else {
                    list3 = null;
                }
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                if (!list.isEmpty()) {
                    d0t d0tVar = (d0t) CollectionsKt.firstOrNull(list);
                    String str = d0tVar != null ? d0tVar.o : null;
                    if (str != null) {
                        return str;
                    }
                } else if (!list2.isEmpty()) {
                    d0t d0tVar2 = (d0t) CollectionsKt.firstOrNull(list2);
                    String str2 = d0tVar2 != null ? d0tVar2.o : null;
                    if (str2 != null) {
                        return str2;
                    }
                } else if (!list3.isEmpty()) {
                    icg icgVar = (icg) CollectionsKt.firstOrNull(list3);
                    String str3 = icgVar != null ? icgVar.b : null;
                    if (str3 != null) {
                        return str3;
                    }
                }
                return "";
            case 17:
                Throwable th16 = (Throwable) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ((dch) this.k).x(new hbh(th16));
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                dch dchVar = (dch) this.j;
                RelatedParams relatedParams = (RelatedParams) this.k;
                int i3 = dch.F;
                dchVar.M(relatedParams);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th17 = (Throwable) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                e6j.P((e6j) this.k, th17);
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                ((DsButton) this.j).setEnabled(true);
                DsLottieEmpty dsLottieEmpty = (DsLottieEmpty) this.k;
                dsLottieEmpty.getCaptionView().animate().alpha(0.0f);
                dsLottieEmpty.getCaptionView().setVisibility(8);
                e3c.n(dsLottieEmpty.getCountDownTimerJob());
                return Unit.f46060a;
            case 21:
                Throwable th18 = (Throwable) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                e0p e0pVar = (e0p) this.k;
                e0pVar.i.b(th18, new brk(2, e0pVar, e0p.class, "processLoadFrameException", "processLoadFrameException(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 13));
                return Unit.f46060a;
            case 22:
                Throwable th19 = (Throwable) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                i3p i3pVar = (i3p) this.k;
                int i4 = i3p.F;
                i3pVar.u.b(th19, new f5o(i3pVar, (byte) 12));
                return Unit.f46060a;
            case 23:
                Throwable th20 = (Throwable) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                k6p k6pVar = (k6p) this.k;
                k6pVar.i.b(th20, new f5o(k6pVar, (byte) 14));
                return Unit.f46060a;
            case 24:
                Throwable th21 = (Throwable) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                bep bepVar = (bep) this.k;
                int i5 = bep.I;
                boolean z2 = th21 != null && ((th21 instanceof SocketTimeoutException) || (th21 instanceof ConnectException) || (th21 instanceof UnknownHostException));
                p7m0 p7m0Var4 = bepVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    bepVar.f.getClass();
                } while (!p7m0Var4.m(value4, e2p.a((e2p) value4, false, false, false, z2, !z2, false, null, null, null, false, 65337)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th22 = (Throwable) this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                gfp gfpVar = (gfp) this.k;
                int i6 = gfp.B;
                gfpVar.O(th22);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th23 = (Throwable) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                nnp nnpVar = (nnp) this.k;
                int i7 = nnp.a0;
                nnpVar.T(th23);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th24 = (Throwable) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                fpp fppVar = (fpp) this.k;
                int i8 = fpp.P;
                fppVar.P(th24);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ljg ljgVar = (ljg) this.j;
                hj40 hj40Var = (hj40) this.k;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                return new mi40(ljgVar, hj40Var);
            default:
                Throwable th25 = (Throwable) this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                zos zosVar = (zos) this.k;
                sip sipVar = zosVar.b;
                th25.getClass();
                sipVar.getClass();
                if ((sipVar == sip.b && (th25 instanceof ff5)) || (((z = th25 instanceof zhi0)) && ((zhi0) th25).c == i2o.LineGameFinished)) {
                    throw new e600(zosVar.f44730a);
                }
                sip sipVar2 = zosVar.b;
                sipVar2.getClass();
                if ((sipVar2 == sip.c && (th25 instanceof ff5)) || (z && ((zhi0) th25).c == i2o.LiveGameFinished)) {
                    throw new yj00();
                }
                throw th25;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }
}
