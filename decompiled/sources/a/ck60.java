package a;

import android.content.Context;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.text.Editable;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.presentation.views.OneXGamesInputEditText;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.disciplinefilter.model.TransfersDisciplineFilterBottomParams;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.timefilter.model.TransfersTimeFilterBottomParams;
import org.xplatform.feature.promo_aggregator.impl.presentation.compose.PromoCodeCacheContentState;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ck60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4491a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ck60(Object obj, Object obj2, Object obj3, byte b) {
        this.f4491a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pru pruVar;
        int iIntValue;
        dxh0 dxh0Var;
        byte b = this.f4491a;
        yje yjeVar = null;
        byte b2 = 1;
        byte b3 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                xkb0 xkb0Var = (xkb0) obj2;
                i3t0 i3t0Var = (i3t0) obj;
                av9 yu9Var = ((ak60) obj3).g;
                if (yu9Var == null) {
                    yu9Var = new yu9(xkb0Var.a(), xkb0Var.b());
                }
                i3t0Var.x(new uh60(yu9Var));
                return Unit.f46060a;
            case 1:
                Window window = (Window) obj3;
                Context context = (Context) obj2;
                a8z a8zVar = (a8z) obj;
                if (window != null) {
                    ((k9o0) a8zVar.getValue()).getClass();
                    ((k9o0) a8zVar.getValue()).getClass();
                    ofm0.y(window, context, R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, false, false);
                }
                return Unit.f46060a;
            case 2:
                pm60 pm60Var = (pm60) obj3;
                sac.V(jiu0.a(pm60Var.s()), new jw50(1, pm60Var, pm60.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, pm60Var.h.b, new up6((z470) ((a570) obj2), pm60Var, (String) obj, null, (byte) 4), 10);
                return Unit.f46060a;
            case 3:
                pru pruVar2 = (pru) obj3;
                Bundle bundle = (Bundle) obj;
                return new w370(true, false, null, new rc50(pruVar2.a().d.f27973a.b, "", ((ctf0) obj2).b.a(R.string.search_by_games, Arrays.copyOf(new Object[0], 0)), true, false, false), new zm5(null, null, null, true), new tdt(0, 0, null, null, null), new f3b(), bundle != null ? bundle.getLong("GAME_ID_TO_OPEN_BUNDLE_KEY") : 0L, true, false, false, false, pruVar2.a().g.e, pruVar2.a().d.f27973a.d);
            case 4:
                jiq0.s0(((bxa) obj3).f3366a, (String) ((pz40) obj).getValue(), (Function1) obj2);
                return Unit.f46060a;
            case 5:
                dg70 dg70Var = (dg70) obj3;
                OneXGamesInputEditText oneXGamesInputEditText = (OneXGamesInputEditText) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                if (dg70Var.P1) {
                    Editable text = oneXGamesInputEditText.getText();
                    eh70 eh70VarJ0 = dg70Var.J0();
                    String strValueOf = String.valueOf(text);
                    if (eh70VarJ0.k.a()) {
                        sac.V(jiu0.a(eh70VarJ0), new cf70(1, eh70VarJ0, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, eh70VarJ0.l.f22085a, new wg70(eh70VarJ0, strValueOf, yjeVar, b3), 10);
                    }
                }
                constraintLayout.requestFocus();
                oneXGamesInputEditText.clearFocus();
                return Unit.f46060a;
            case 6:
                mh70 mh70Var = (mh70) obj3;
                OneXGamesInputEditText oneXGamesInputEditText2 = (OneXGamesInputEditText) obj2;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) obj;
                if (mh70Var.P1) {
                    Editable text2 = oneXGamesInputEditText2.getText();
                    ji70 ji70VarI0 = mh70Var.I0();
                    String strValueOf2 = String.valueOf(text2);
                    if (ji70VarI0.k.a()) {
                        sac.V(jiu0.a(ji70VarI0), new cf70(1, ji70VarI0, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, ji70VarI0.l.b, new wg70(ji70VarI0, strValueOf2, yjeVar, b2), 10);
                    }
                }
                constraintLayout2.requestFocus();
                oneXGamesInputEditText2.clearFocus();
                return Unit.f46060a;
            case 7:
                bet betVar = (bet) obj3;
                t9k0 t9k0Var = (t9k0) obj2;
                s080 s080Var = (s080) obj;
                if (betVar != null) {
                    t9k0Var.a(t9k0Var.c(betVar) - t9k0Var.t);
                }
                List listO = aac.O(t9k0Var, null, t9k0Var.t, null);
                kkd kkdVar = (kkd) CollectionsKt.f0(listO);
                Integer num = kkdVar != null ? kkdVar.b : null;
                List listA = s080Var.a(num);
                if (num != null && !listA.isEmpty()) {
                    listA = CollectionsKt.q0(kotlin.collections.a.c(new kkd(((kkd) CollectionsKt.U(listA)).f18431a, null, num)), CollectionsKt.O(listA, 1));
                }
                return new ikd(CollectionsKt.q0(listO, listA), s080Var.b());
            case 8:
                float f = ys90.f43156a;
                Integer numValueOf = Integer.valueOf(((Number) ((l7m0) obj2).getValue()).intValue());
                Boolean boolValueOf = Boolean.valueOf(((xcz) obj3).j.a());
                Boolean bool = (Boolean) ((pz40) obj).getValue();
                bool.booleanValue();
                return new prs0(numValueOf, boolValueOf, bool);
            case 9:
                g9b0 g9b0Var = (g9b0) obj3;
                sac.V(jiu0.a(g9b0Var), new wma0(1, g9b0Var, g9b0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 29), new k8b0(g9b0Var, b2), g9b0Var.h.b, new up6((z470) ((a570) obj2), g9b0Var, (String) obj, null, (byte) 5), 8);
                return Unit.f46060a;
            case 10:
                st0 st0Var = (st0) obj2;
                mza0 mza0Var = (mza0) obj;
                ((Function1) obj3).invoke(new tya0(st0Var.f32750a, mza0Var.b, mza0Var.f22644a, st0Var.g));
                return Unit.f46060a;
            case 11:
                vzg0 vzg0Var = (vzg0) obj2;
                pru pruVar3 = (pru) obj;
                String strA = ((ctf0) obj3).b.a(R.string.activate_promocode_title, Arrays.copyOf(new Object[0], 0));
                PromoCodeCacheContentState promoCodeCacheContentState = (PromoCodeCacheContentState) vzg0Var.a("CONTENT_STATE_KEY");
                Boolean bool2 = (Boolean) vzg0Var.a("KEY_WAS_KEYBOARD_OPEN");
                return new iac0(strA, promoCodeCacheContentState, false, "", "", iun.f15405a, "", false, false, pruVar3.a().b.z, pruVar3.a().b.A, pruVar3.a().b.B, bool2 != null ? bool2.booleanValue() : false);
            case 12:
                ctf0 ctf0Var = (ctf0) obj2;
                g2v g2vVar = (g2v) obj;
                toc0 toc0Var = ((pru) obj3).a().l;
                iun iunVar = iun.f15405a;
                boolean z = toc0Var.c;
                boolean z2 = toc0Var.e;
                String strA2 = ctf0Var.b.a(R.string.promo_bonus_title, Arrays.copyOf(new Object[0], 0));
                lsm0 lsm0Var = ctf0Var.b;
                return new rrc0(iunVar, 0, false, z, z2, true, "", true, false, false, g2v.b(g2vVar, pb10.e, null, null, 0, 0, R.string.currently_no_events, 0, 0, 0L, 0L, 990), g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 9000L, 0L, Response.SESSION_NOT_ACCEPTABLE), strA2, lsm0Var.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.promo_bonus_request_pts, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
            case 13:
                pru pruVar4 = (pru) obj3;
                ctf0 ctf0Var2 = (ctf0) obj2;
                qho qhoVar = (qho) obj;
                toc0 toc0Var2 = pruVar4.a().l;
                lsm0 lsm0Var2 = ctf0Var2.b;
                lsm0 lsm0Var3 = ctf0Var2.b;
                String strA3 = lsm0Var2.a(R.string.promo_shop_name, Arrays.copyOf(new Object[0], 0));
                boolean z3 = toc0Var2.k;
                boolean z4 = toc0Var2.f34278a;
                yee yeeVar = yee.f42482a;
                dfe dfeVar = dfe.f5996a;
                return new mmc0(strA3, z3, z4, z3 ? dfeVar : yeeVar, z4 ? dfeVar : yeeVar, dfeVar, lsm0Var3.a(R.string.promo_bonus_games_title, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.all, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.additionally, Arrays.copyOf(new Object[0], 0)), qhoVar, pruVar4.a().Z1);
            case 14:
                pkk0 pkk0Var = (pkk0) obj2;
                pz40 pz40Var = (pz40) obj;
                ((ypq) ((wpq) obj3)).b(true);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                ((Function1) pz40Var.getValue()).invoke(pve0.f27659a);
                return Unit.f46060a;
            case 15:
                pkk0 pkk0Var2 = (pkk0) obj2;
                z3f0 z3f0Var = (z3f0) obj;
                zie0 zie0Var = z3f0.Y1;
                ((ypq) ((wpq) obj3)).b(false);
                if (pkk0Var2 != null) {
                    ((r3k) pkk0Var2).a();
                }
                z3f0Var.H0().x(q2f0.f27997a);
                return Unit.f46060a;
            case 16:
                String str = (String) obj2;
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                k7g0 k7g0Var = (k7g0) ((z220) ((x4u) obj3).f40284a).c;
                k7g0Var.getClass();
                Iterable iterable = (List) k7g0Var.b.get(str);
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (Intrinsics.d(((e8g0) obj4).b.f35586a, str2)) {
                        arrayList.add(obj4);
                    }
                }
                return new a5g0(arrayList);
            case 17:
                ((Function2) obj3).invoke(Boolean.valueOf(!((Boolean) ((pz40) obj2).getValue()).booleanValue()), Long.valueOf(((i8b) obj).f14330a));
                return Unit.f46060a;
            case 18:
                m0n0 m0n0Var = (m0n0) obj3;
                pvi0 pvi0Var = (pvi0) obj2;
                Function1 function1 = (Function1) obj;
                if (m0n0Var != null) {
                    if (m0n0Var instanceof e2n0) {
                        if (pvi0Var instanceof ovi0) {
                            function1.invoke(new a0n0((e2n0) m0n0Var, ((ovi0) pvi0Var).f25927a));
                        }
                    } else if ((m0n0Var instanceof r0n0) && (pvi0Var instanceof nvi0)) {
                        function1.invoke(new yzm0((r0n0) m0n0Var));
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Integer num2 = ((TeamDetailsResultsParams) obj3).c;
                sff0 sff0VarA = ((pru) obj2).a();
                ygp ygpVar = ygp.t;
                j1q0 j1q0Var = ((r9u) obj).f30104a;
                j1q0Var.getClass();
                return new wap0(true, num2, null, sff0VarA, j1q0Var.f15748a.d(ygpVar));
            case 20:
                String str3 = (String) obj3;
                pru pruVar5 = (pru) obj;
                iun iunVar2 = iun.f15405a;
                Integer num3 = (Integer) ((vzg0) obj2).a("KEY_CURRENT_TAB");
                if (num3 != null) {
                    iIntValue = num3.intValue();
                    pruVar = pruVar5;
                } else {
                    pruVar = pruVar5;
                    iIntValue = 0;
                }
                int iOrdinal = pruVar.a().g.x.ordinal();
                if (iOrdinal == 0) {
                    dxh0Var = axh0.f1625a;
                } else if (iOrdinal == 1) {
                    dxh0Var = zwh0.f45106a;
                } else if (iOrdinal == 2) {
                    dxh0Var = cxh0.f5122a;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    dxh0Var = bxh0.f3376a;
                }
                return new knp0(str3, true, false, iunVar2, iIntValue, dxh0Var);
            case 21:
                kie0 kie0Var = (kie0) obj3;
                TileMatchingGameFieldView tileMatchingGameFieldView = (TileMatchingGameFieldView) obj;
                int i = TileMatchingGameFieldView.h;
                int i2 = kie0Var.f18333a + 1;
                kie0Var.f18333a = i2;
                if (((kie0) obj2).f18333a == i2) {
                    tileMatchingGameFieldView.c();
                    tileMatchingGameFieldView.e.invoke();
                }
                return Unit.f46060a;
            case 22:
                vxi vxiVar = (vxi) obj3;
                Fragment fragment = (Fragment) obj2;
                k3t0 k3t0Var = (k3t0) obj;
                ujd ujdVarD = vxiVar.p.d();
                x1x.x(ujdVarD);
                ujdVarD.c(fragment, new kr2(), new ebh(k3t0Var, (byte) 10));
                ((nc0) vxiVar.n.b).r();
                ccq0.V(fragment, "REQUEST_EXPRESS_DIALOG_EXPRESS", new a7g0(new ebh(k3t0Var, (byte) 11), (byte) 16));
                return Unit.f46060a;
            case 23:
                Fragment fragment2 = (Fragment) obj2;
                ((v2t0) obj3).getClass();
                fragment2.getClass();
                fragment2.C().g("REQUEST_KEY_CLOSE_GAME");
                ((ujd) obj).getClass();
                ujd.a(fragment2);
                return Unit.f46060a;
            case 24:
                ((Function1) obj3).invoke(new t27(((xww) obj2).C(), (String) obj));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uvr0 uvr0VarJ = fem0.j();
                mtr0 mtr0Var = fem0.j().f36362a.b;
                String strA4 = ((ctf0) obj3).b.a(R.string.toto_draws, Arrays.copyOf(new Object[0], 0));
                rkr0 rkr0Var = ((ctu) obj2).f4960a;
                mtr0 mtr0VarA = mtr0.a(mtr0Var, strA4, rkr0Var.r().b, false, 12);
                long jF = hfm0.F(rkr0Var.r().c);
                s9m0 s9m0Var = uaq0.f35345a;
                uaq0 uaq0VarA = ((wyu) obj).a();
                s9m0Var.getClass();
                return uvr0.a(uvr0VarJ, new vvr0(p7x.z(s9m0.k(uaq0VarA), jF), mtr0VarA, crq0.f4858a), null, false, rkr0Var.r().f20312a, 0L, null, null, null, 494);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function2) obj3).invoke((String) obj2, ((dxr0) obj).c);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                crm0 crm0Var = (crm0) obj2;
                return new e7s0(((wiu) obj3).a(), crm0Var.f4852a, crm0Var.b, crm0Var.c, r7s0.f29993a, false, gqt0.h, ((bzt) obj).f3488a.a().r, false);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gjs0 gjs0Var = (gjs0) obj3;
                String str4 = (String) obj2;
                lks0 lks0Var = (lks0) obj;
                j6m0 j6m0Var = gjs0.R1;
                if (gjs0Var.C().J(str4) != null) {
                    return Unit.f46060a;
                }
                y2m0 y2m0Var = zis0.m2;
                TransfersDisciplineFilterBottomParams transfersDisciplineFilterBottomParams = lks0Var.f20216a;
                y2m0Var.getClass();
                zis0 zis0Var = new zis0();
                zis0Var.l2.J(zis0Var, zis0.n2[0], transfersDisciplineFilterBottomParams);
                zis0Var.H0(gjs0Var.C(), str4);
                return Unit.f46060a;
            default:
                gjs0 gjs0Var2 = (gjs0) obj3;
                String str5 = (String) obj2;
                nks0 nks0Var = (nks0) obj;
                j6m0 j6m0Var2 = gjs0.R1;
                if (gjs0Var2.C().J(str5) != null) {
                    return Unit.f46060a;
                }
                s9m0 s9m0Var2 = uks0.l2;
                TransfersTimeFilterBottomParams transfersTimeFilterBottomParams = nks0Var.f23696a;
                s9m0Var2.getClass();
                uks0 uks0Var = new uks0();
                uks0Var.k2.J(uks0Var, uks0.m2[0], transfersTimeFilterBottomParams);
                uks0Var.H0(gjs0Var2.C(), str5);
                return Unit.f46060a;
        }
    }
}
