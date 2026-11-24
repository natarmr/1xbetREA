package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorGiftsFragmentScreen;
import org.xplatform.feature.promo_aggregator.impl.presentation.compose.PromoCodeCacheContentState;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ppb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27369a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ppb0(Object obj, byte b) {
        this.f27369a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27369a;
        byte b2 = 13;
        byte b3 = 3;
        yje yjeVar = null;
        boolean z = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                w5z w5zVar = (w5z) obj2;
                w5zVar.d = (Drawable) obj;
                tpb0 tpb0Var = (tpb0) w5zVar.f38604a;
                tpb0Var.requestLayout();
                tpb0Var.invalidate();
                return Unit.f46060a;
            case 1:
                DsTeamLogo dsTeamLogo = (DsTeamLogo) obj;
                dsTeamLogo.getClass();
                String str = ((kxb0) obj2).b;
                Drawable drawableU = epv0.U(R.drawable.ic_logo_placeholder, dsTeamLogo.getContext());
                Context context = dsTeamLogo.getContext();
                context.getClass();
                sj3.B0(drawableU, context, R.attr.uikitSecondary60);
                LoadableShapeableImageView.i(dsTeamLogo, str, drawableU, 12);
                return Unit.f46060a;
            case 2:
                ((xw3) ((w5z) obj2).e).addLast(obj);
                return Unit.f46060a;
            case 3:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                dyb.N(((wwx) cpVar.u).b, ymx.INTERVAL_500, new zga0(obj2, (Object) cpVar, (byte) 23));
                cpVar.t(new ctv(cpVar, cpVar, (byte) 9));
                return Unit.f46060a;
            case 4:
                yn90 yn90Var = (yn90) obj2;
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                vwx vwxVar = (vwx) cpVar2.u;
                TextView textView = vwxVar.b.getTextView();
                if (textView != null) {
                    textView.setFocusable(false);
                    textView.setFocusableInTouchMode(false);
                }
                vwxVar.f38175a.setOnClickListener(new s6w(cpVar2, (byte) 1));
                cpVar2.z(new bb(cpVar2, b2));
                vwxVar.b.a(new da0(new zga0((Object) yn90Var, (Object) cpVar2, (byte) 24)));
                cpVar2.t(new ctv(cpVar2, cpVar2, (byte) 10));
                return Unit.f46060a;
            case 5:
                ((View) obj).getClass();
                ((b0c0) obj2).invoke();
                return Unit.f46060a;
            case 6:
                ((View) obj).getClass();
                ((b0c0) obj2).invoke();
                return Unit.f46060a;
            case 7:
                g7c0 g7c0Var = (g7c0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                g7c0Var.k.b(th, new c7c0(g7c0Var, (byte) 1));
                return Unit.f46060a;
            case 8:
                mi70 mi70Var = m8c0.V1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((m8c0) obj2).H0().y(false);
                return Unit.f46060a;
            case 9:
                xi70 xi70Var = r8c0.U1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((r8c0) obj2).H0().x();
                return Unit.f46060a;
            case 10:
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                peg0 peg0Var = bVar.x;
                eld0 eld0Var = bVar.o;
                int i = eld0Var.b;
                int i2 = eld0Var.c;
                art artVar = d7v.f5612a;
                peg0Var.getClass();
                k0w0Var.k(new AggregatorScreens$AggregatorGiftsFragmentScreen(i, i2, 0, false));
                return Unit.f46060a;
            case 11:
                nac0 nac0Var = (nac0) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, new ugd(-1424401906, true, new p0z((Object) nac0Var, (byte) 27)), 3);
                a4x a4xVar = ((edc0) nac0Var.b).b;
                hczVar.f(a4xVar.size(), null, new ubn(a4xVar, (byte) 21), new ugd(802480018, true, new zd1(a4xVar, (byte) 7)));
                return Unit.f46060a;
            case 12:
                op30 op30Var = (op30) obj2;
                n0o0 n0o0Var = op30Var.d;
                ((fee) obj).getClass();
                n0o0 n0o0Var2 = op30Var.h;
                fee feeVar = (fee) n0o0Var2.getValue();
                ctf0 ctf0Var = op30Var.b;
                boolean z2 = ((PromoCodeCacheContentState) feeVar.c()) instanceof PromoCodeCacheContentState.DetailsPromo;
                n0o0 n0o0Var3 = op30Var.f;
                if (!z2) {
                    String str2 = (String) ((fee) n0o0Var3.getValue()).c();
                    lsm0 lsm0Var = ctf0Var.b;
                    lsm0 lsm0Var2 = ctf0Var.b;
                    return new ddc0(str2, lsm0Var.a(R.string.activate_promocode_summary_from_casino, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.enter_promo, Arrays.copyOf(new Object[0], 0)), ((fee) n0o0Var2.getValue()).c() instanceof PromoCodeCacheContentState.Error, (String) ((fee) op30Var.e.getValue()).c(), new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[0], 0))), ((CharSequence) ((fee) n0o0Var3.getValue()).c()).length() > 0 && !((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue(), true), rk.f30621a))));
                }
                String str3 = (String) ((fee) n0o0Var3.getValue()).c();
                a4x a4xVarO0 = dyb.o0((Iterable) ((fee) op30Var.g.getValue()).c());
                lsm0 lsm0Var3 = ctf0Var.b;
                lsm0 lsm0Var4 = ctf0Var.b;
                String strA = lsm0Var3.a(R.string.bonus_freespin_gifts_hint, Arrays.copyOf(new Object[0], 0));
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.f25112a;
                return new edc0(str3, a4xVarO0, strA, new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var4.a(R.string.go_to_gifts, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.A), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var4.a(R.string.later, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.Z))));
            case 13:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.h(((tac0) obj2).h.o()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 14:
                idc0 idc0Var = (idc0) obj2;
                jh70 jh70Var = idc0.S1;
                ((View) obj).getClass();
                idc0Var.L0().c.clearFocus();
                kvc0 kvc0VarM0 = idc0Var.M0();
                String strI0 = sj3.i0(((ivc0) kvc0VarM0.D.getValue()).f15440a);
                if (strI0 != null) {
                    kvc0VarM0.C(strI0, false);
                }
                return Unit.f46060a;
            case 15:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                DsSettingsCell dsSettingsCell = ((ywx) cpVar3.u).f43394a;
                dsSettingsCell.getClass();
                dyb.c0(dsSettingsCell, new oac0((l8c0) obj2, cpVar3, b3));
                cpVar3.x(new bb(cpVar3, (byte) 14));
                cpVar3.t(new ui80(cpVar3, b2));
                return Unit.f46060a;
            case 16:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = ((jhc0) obj2).n;
                p7m0Var.getClass();
                p7m0Var.o(null, ygc0.f42577a);
                return Unit.f46060a;
            case 17:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((gkc0) obj2).m.b(th2, new yr0(th2, (byte) 21));
                return Unit.f46060a;
            case 18:
                rkc0 rkc0Var = (rkc0) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                rkc0Var.e.b(th3, new lma0(rkc0Var, (byte) 22));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                clc0 clc0Var = (clc0) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (saj.Y(th4)) {
                    Map map = clc0Var.r;
                    if (map == null) {
                        map = lun.f20680a;
                        map.getClass();
                    }
                    clc0Var.r = map;
                    clc0Var.y();
                } else {
                    th4.printStackTrace();
                    clc0Var.p.f(new wkc0(R.string.something_went_wrong));
                }
                return Unit.f46060a;
            case 20:
                nh70 nh70Var = jmc0.U1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((jmc0) obj2).H0().y(false);
                return Unit.f46060a;
            case 21:
                bnc0 bnc0Var = (bnc0) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, jiq0.e, 3);
                if (bnc0Var.b) {
                    hcz.e(hczVar2, null, null, jiq0.f, 3);
                }
                if (bnc0Var.c) {
                    hcz.e(hczVar2, null, null, jiq0.g, 3);
                    hcz.e(hczVar2, null, null, jiq0.h, 3);
                }
                hcz.e(hczVar2, null, null, jiq0.i, 3);
                hcz.g(hczVar2, 5, null, null, jiq0.j, 6);
                return Unit.f46060a;
            case 22:
                xi70 xi70Var2 = hnc0.R1;
                ((View) obj).getClass();
                qnc0 qnc0Var = (qnc0) ((hnc0) obj2).Q1.getValue();
                sac.V(jiu0.a(qnc0Var), new inc0(qnc0Var, (byte) 0), null, qnc0Var.c.b, new hu3((diu0) qnc0Var, yjeVar, (byte) 5), 10);
                return Unit.f46060a;
            case 23:
                rl70 rl70Var = znc0.U1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((znc0) obj2).H0().y();
                return Unit.f46060a;
            case 24:
                aqc0 aqc0Var = (aqc0) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                aqc0Var.w.b(th5, new xh20(z, (Object) aqc0Var, (byte) 15));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((kvc0) obj2).w(th6);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str4 = (String) obj;
                rl70 rl70Var2 = qwc0.Z1;
                str4.getClass();
                ((qwc0) obj2).J0().x(new iwc0(str4));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str5 = (String) obj;
                jh70 jh70Var2 = kxc0.Y1;
                str5.getClass();
                ((kxc0) obj2).J0().x(new uvc0(str5));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Unit unit = Unit.f46060a;
                ((odd) obj2).N(unit);
                return unit;
            default:
                odd oddVar = ((hmf0) obj2).b;
                Unit unit2 = Unit.f46060a;
                oddVar.N(unit2);
                return unit2;
        }
    }
}
