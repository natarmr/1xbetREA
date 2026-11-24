package a;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.bet_info.presentation.BetInfoScreen;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bethistory.share_coupon.presentation.ShareCouponScreen;
import org.xplatform.bethistory.share_coupon.presentation.ShareCouponScreenOld;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qo5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29056a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qo5(Object obj, Object obj2, byte b) {
        this.f29056a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29056a;
        byte b2 = 24;
        byte b3 = 26;
        byte b4 = 8;
        byte b5 = 6;
        final byte b6 = 3;
        final byte b7 = 0;
        final byte b8 = 1;
        String str = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ro5 ro5Var = (ro5) obj3;
                o0x o0xVar = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                ro5Var.l = n0xVar != null ? n0xVar.f22722a : 0;
                return Boolean.FALSE;
            case 1:
                rr5 rr5Var = (rr5) obj3;
                o0x o0xVar2 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar2 = o0xVar2 instanceof n0x ? (n0x) o0xVar2 : null;
                rr5Var.o = n0xVar2 != null ? n0xVar2.f22722a : null;
                return Boolean.FALSE;
            case 2:
                tr5 tr5Var = (tr5) obj3;
                o0x o0xVar3 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar3 = o0xVar3 instanceof n0x ? (n0x) o0xVar3 : null;
                tr5Var.k = n0xVar3 != null ? n0xVar3.f22722a : null;
                return Boolean.FALSE;
            case 3:
                wr5 wr5Var = (wr5) obj3;
                o0x o0xVar4 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar4 = o0xVar4 instanceof n0x ? (n0x) o0xVar4 : null;
                wr5Var.l = n0xVar4 != null ? n0xVar4.f22722a : null;
                return Boolean.FALSE;
            case 4:
                yr5 yr5Var = (yr5) obj3;
                o0x o0xVar5 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar5 = o0xVar5 instanceof n0x ? (n0x) o0xVar5 : null;
                yr5Var.h = n0xVar5 != null ? n0xVar5.f22722a : null;
                return Boolean.FALSE;
            case 5:
                fs5 fs5Var = (fs5) obj3;
                o0x o0xVar6 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar6 = o0xVar6 instanceof n0x ? (n0x) o0xVar6 : null;
                fs5Var.g = n0xVar6 != null ? n0xVar6.f22722a : null;
                return Boolean.FALSE;
            case 6:
                hs5 hs5Var = (hs5) obj3;
                o0x o0xVar7 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar7 = o0xVar7 instanceof n0x ? (n0x) o0xVar7 : null;
                hs5Var.h = n0xVar7 != null ? n0xVar7.f22722a : null;
                return Boolean.FALSE;
            case 7:
                ms5 ms5Var = (ms5) obj3;
                o0x o0xVar8 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar8 = o0xVar8 instanceof n0x ? (n0x) o0xVar8 : null;
                ms5Var.f = n0xVar8 != null ? n0xVar8.f22722a : null;
                return Boolean.FALSE;
            case 8:
                qs5 qs5Var = (qs5) obj3;
                o0x o0xVar9 = (o0x) obj2;
                ((Drawable) obj).getClass();
                n0x n0xVar9 = o0xVar9 instanceof n0x ? (n0x) o0xVar9 : null;
                qs5Var.f = n0xVar9 != null ? n0xVar9.f22722a : null;
                return Boolean.FALSE;
            case 9:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj3;
                agk0 agk0Var = (agk0) obj2;
                j6z j6zVar = (j6z) obj;
                iiy[] iiyVarArr = iw5.j2;
                j6zVar.getClass();
                float fMin = 0.1f;
                if (((int) (j6zVar.g() & 4294967295L)) > 0) {
                    boolean z = bottomSheetBehavior.g;
                    fMin = ((z ? -1 : bottomSheetBehavior.f) * 0.1f) / Math.min(z ? -1 : bottomSheetBehavior.f, (int) (j6zVar.g() & 4294967295L));
                }
                agk0Var.m(fMin);
                return Unit.f46060a;
            case 10:
                ((View) obj).getClass();
                ((rac) obj3).d.invoke(obj2);
                return Unit.f46060a;
            case 11:
                ((View) obj).getClass();
                ((Function1) ((i26) obj3).e).invoke(obj2);
                return Unit.f46060a;
            case 12:
                Function1 function1 = (Function1) obj2;
                a8q0 a8q0Var = (a8q0) obj;
                if (!Intrinsics.d((a8q0) obj3, a8q0Var)) {
                    function1.invoke(a8q0Var);
                }
                return Unit.f46060a;
            case 13:
                qjj.W((vne) obj3, null, null, new xw5((iqq) obj, (bxq0) obj2, str, b5), 3);
                return Unit.f46060a;
            case 14:
                cp cpVar = (cp) obj3;
                ((List) obj).getClass();
                ((vjd) cpVar.u).b.setContent(new ugd(19585299, true, new sr1(cpVar, (x6f) obj2, b2)));
                return Unit.f46060a;
            case 15:
                BetZip betZip = (BetZip) obj3;
                ao6 ao6Var = (ao6) obj2;
                ((View) obj).getClass();
                if (!betZip.f) {
                    ao6Var.invoke(betZip);
                }
                return Unit.f46060a;
            case 16:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new ho6((po6) obj3, (jg7) obj2, b8))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 17:
                ((Throwable) obj).getClass();
                ((po6) obj3).F.b((Throwable) obj2, new gh5((byte) 15));
                return Unit.f46060a;
            case 18:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.b(new a1w0(new qp6((vp6) obj3, (jg7) obj2, b8))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sr6 sr6Var = (sr6) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = sr6Var.c;
                hczVar.f(a4xVar.size(), new ci2(new h26((byte) 13), a4xVar, (byte) 23), new ci2(new h26((byte) 14), a4xVar, b2), new ugd(802480018, true, new c8((List) a4xVar, (Object) sr6Var, (Function1) obj2, b4)));
                return Unit.f46060a;
            case 20:
                ((View) obj).getClass();
                ((yj5) obj3).invoke(Long.valueOf(((r07) ((cp) obj2).u()).f29616a));
                return Unit.f46060a;
            case 21:
                Function1 function2 = (Function1) obj2;
                Float f = (Float) obj;
                f.getClass();
                ((ypq) ((wpq) obj3)).b(false);
                if (function2 != null) {
                    function2.invoke(f);
                }
                return Unit.f46060a;
            case 22:
                BetHistoryScreenModel betHistoryScreenModel = (BetHistoryScreenModel) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(new BetInfoScreen((String) obj3, new BetInfoScreenModel(betHistoryScreenModel.getB(), betHistoryScreenModel.getF46388a(), i8w.a(betHistoryScreenModel), false)));
                return Unit.f46060a;
            case 23:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                r9u r9uVar = (r9u) ((f47) obj3).s;
                ygp ygpVar = ygp.I1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                String str2 = ((r0k) obj2).f29634a;
                k0w0Var4.h(zD ? new ShareCouponScreen(str2) : new ShareCouponScreenOld(str2));
                return Unit.f46060a;
            case 24:
                f97 f97Var = (f97) obj3;
                ((Throwable) obj).getClass();
                f97Var.H(new os6(b3));
                ctf0 ctf0Var = f97Var.r;
                f97Var.G(new a77(ctf0Var.b.a(R.string.selected_bid_hidden_with_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{(String) obj2}, 1))));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                View view = cpVar2.f40887a;
                view.getClass();
                dyb.c0(view, new qo5((ezv) obj3, cpVar2, b3));
                cpVar2.t(new na7(cpVar2, (vft) obj2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((View) obj).getClass();
                ((ezv) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar3 = (cp) obj3;
                ao6 ao6Var2 = (ao6) obj2;
                ((List) obj).getClass();
                Object objU = cpVar3.u();
                yfu0 yfu0Var = cpVar3.u;
                BetZip betZip2 = ((de7) objU).c;
                cpVar3.f40887a.setEnabled(betZip2 != null);
                bs6 bs6Var = (bs6) yfu0Var;
                bs6Var.b.setVisibility(betZip2 != null ? (byte) 0 : (byte) 8);
                if (betZip2 != null && !((de7) cpVar3.u()).d) {
                    ComposeView composeView = bs6Var.b;
                    de7 de7Var = (de7) cpVar3.u();
                    if (de7Var.m != null) {
                        pkd.i(composeView, null, new ugd(-31992043, true, new t87(de7Var, ao6Var2, b6)));
                    }
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                de7 de7Var2 = (de7) obj3;
                ao6 ao6Var3 = (ao6) obj2;
                ((wgl0) obj).getClass();
                if (de7Var2.l) {
                    gj4 gj4Var = new gj4(de7Var2, ao6Var3, (byte) 17);
                    ymx ymxVar = ivb0.b;
                    ymxVar.getClass();
                    new bjj(ymxVar, false, gj4Var).a();
                }
                return Unit.f46060a;
            default:
                final xj7 xj7Var = (xj7) obj3;
                tj7 tj7Var = (tj7) obj2;
                hcz hczVar2 = (hcz) obj;
                gl5 gl5Var = tj7.t2;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, new ugd(-807667049, true, new xdr() { // from class: a.sj7
                    @Override // a.xdr
                    public final Object F(Object obj4, Object obj5, Object obj6) {
                        byte b9 = b8;
                        xj7 xj7Var2 = xj7Var;
                        g9z g9zVar = (g9z) obj4;
                        fet fetVar = (fet) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (b9) {
                            case 0:
                                gl5 gl5Var2 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    ufx.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((wj7) xj7Var2).e, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 1:
                                gl5 gl5Var3 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ntr.l(null, ((wj7) xj7Var2).f39247a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 2:
                                gl5 gl5Var4 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    vfc.u(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((nro) ((wj7) xj7Var2).g).f24012a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 3:
                                gl5 gl5Var5 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar3 = qmk.f28987a;
                                    hkb.p(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).b, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 4:
                                gl5 gl5Var6 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar4 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).c, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                gl5 gl5Var7 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar5 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).d, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                hcz.e(hczVar2, null, null, kc5.b, 3);
                pro proVar = ((wj7) xj7Var).g;
                final byte b9 = 2;
                if (proVar instanceof nro) {
                    hcz.e(hczVar2, null, null, new ugd(-106815345, true, new xdr() { // from class: a.sj7
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            byte b10 = b9;
                            xj7 xj7Var2 = xj7Var;
                            g9z g9zVar = (g9z) obj4;
                            fet fetVar = (fet) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            switch (b10) {
                                case 0:
                                    gl5 gl5Var2 = tj7.t2;
                                    g9zVar.getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        zcl zclVar = qmk.f28987a;
                                        ufx.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((wj7) xj7Var2).e, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                case 1:
                                    gl5 gl5Var3 = tj7.t2;
                                    g9zVar.getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        ntr.l(null, ((wj7) xj7Var2).f39247a, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                case 2:
                                    gl5 gl5Var4 = tj7.t2;
                                    g9zVar.getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        zcl zclVar2 = qmk.f28987a;
                                        vfc.u(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((nro) ((wj7) xj7Var2).g).f24012a, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                case 3:
                                    gl5 gl5Var5 = tj7.t2;
                                    g9zVar.getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        zcl zclVar3 = qmk.f28987a;
                                        hkb.p(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).b, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                case 4:
                                    gl5 gl5Var6 = tj7.t2;
                                    g9zVar.getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        zcl zclVar4 = qmk.f28987a;
                                        hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).c, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                                default:
                                    gl5 gl5Var7 = tj7.t2;
                                    g9zVar.getClass();
                                    if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        zcl zclVar5 = qmk.f28987a;
                                        hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).d, fetVar, 0);
                                    } else {
                                        fetVar.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }), 3);
                } else if (!proVar.equals(oro.f25743a)) {
                    t9f.b();
                    return null;
                }
                hcz.e(hczVar2, null, null, new ugd(1305439183, true, new xdr() { // from class: a.sj7
                    @Override // a.xdr
                    public final Object F(Object obj4, Object obj5, Object obj6) {
                        byte b10 = b6;
                        xj7 xj7Var2 = xj7Var;
                        g9z g9zVar = (g9z) obj4;
                        fet fetVar = (fet) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (b10) {
                            case 0:
                                gl5 gl5Var2 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    ufx.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((wj7) xj7Var2).e, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 1:
                                gl5 gl5Var3 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ntr.l(null, ((wj7) xj7Var2).f39247a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 2:
                                gl5 gl5Var4 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    vfc.u(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((nro) ((wj7) xj7Var2).g).f24012a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 3:
                                gl5 gl5Var5 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar3 = qmk.f28987a;
                                    hkb.p(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).b, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 4:
                                gl5 gl5Var6 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar4 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).c, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                gl5 gl5Var7 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar5 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).d, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                final byte b10 = 4;
                hcz.e(hczVar2, null, null, new ugd(-1847180528, true, new xdr() { // from class: a.sj7
                    @Override // a.xdr
                    public final Object F(Object obj4, Object obj5, Object obj6) {
                        byte b11 = b10;
                        xj7 xj7Var2 = xj7Var;
                        g9z g9zVar = (g9z) obj4;
                        fet fetVar = (fet) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (b11) {
                            case 0:
                                gl5 gl5Var2 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    ufx.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((wj7) xj7Var2).e, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 1:
                                gl5 gl5Var3 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ntr.l(null, ((wj7) xj7Var2).f39247a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 2:
                                gl5 gl5Var4 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    vfc.u(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((nro) ((wj7) xj7Var2).g).f24012a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 3:
                                gl5 gl5Var5 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar3 = qmk.f28987a;
                                    hkb.p(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).b, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 4:
                                gl5 gl5Var6 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar4 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).c, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                gl5 gl5Var7 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar5 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).d, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                final byte b11 = 5;
                hcz.e(hczVar2, null, null, new ugd(-704832943, true, new xdr() { // from class: a.sj7
                    @Override // a.xdr
                    public final Object F(Object obj4, Object obj5, Object obj6) {
                        byte b12 = b11;
                        xj7 xj7Var2 = xj7Var;
                        g9z g9zVar = (g9z) obj4;
                        fet fetVar = (fet) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (b12) {
                            case 0:
                                gl5 gl5Var2 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    ufx.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((wj7) xj7Var2).e, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 1:
                                gl5 gl5Var3 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ntr.l(null, ((wj7) xj7Var2).f39247a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 2:
                                gl5 gl5Var4 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    vfc.u(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((nro) ((wj7) xj7Var2).g).f24012a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 3:
                                gl5 gl5Var5 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar3 = qmk.f28987a;
                                    hkb.p(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).b, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 4:
                                gl5 gl5Var6 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar4 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).c, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                gl5 gl5Var7 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar5 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).d, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                chf0 chf0Var = tj7Var.p2;
                iiy[] iiyVarArr2 = tj7.u2;
                if (chf0Var.n(tj7Var, iiyVarArr2[3]).doubleValue() != -1.0d) {
                    hcz.e(hczVar2, null, null, new ugd(-390560846, true, new rj7(tj7Var, b9)), 3);
                }
                if (tj7Var.s2.n(tj7Var, iiyVarArr2[6]).booleanValue() && tj7Var.r2.n(tj7Var, iiyVarArr2[5]).doubleValue() != -1.0d) {
                    hcz.e(hczVar2, null, null, new ugd(1570194153, true, new rj7(tj7Var, b7)), 3);
                }
                hcz.e(hczVar2, null, null, new ugd(437514642, true, new xdr() { // from class: a.sj7
                    @Override // a.xdr
                    public final Object F(Object obj4, Object obj5, Object obj6) {
                        byte b12 = b7;
                        xj7 xj7Var2 = xj7Var;
                        g9z g9zVar = (g9z) obj4;
                        fet fetVar = (fet) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (b12) {
                            case 0:
                                gl5 gl5Var2 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    ufx.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((wj7) xj7Var2).e, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 1:
                                gl5 gl5Var3 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ntr.l(null, ((wj7) xj7Var2).f39247a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 2:
                                gl5 gl5Var4 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    vfc.u(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((nro) ((wj7) xj7Var2).g).f24012a, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 3:
                                gl5 gl5Var5 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar3 = qmk.f28987a;
                                    hkb.p(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).b, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            case 4:
                                gl5 gl5Var6 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar4 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).c, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                gl5 gl5Var7 = tj7.t2;
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar5 = qmk.f28987a;
                                    hp4.c(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((wj7) xj7Var2).d, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                hcz.e(hczVar2, null, null, new ugd(1579862227, true, new ab4((Object) xj7Var, (Object) tj7Var, (byte) 7)), 3);
                return Unit.f46060a;
        }
    }
}
