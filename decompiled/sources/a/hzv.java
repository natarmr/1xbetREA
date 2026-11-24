package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class hzv extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ izv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzv(izv izvVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = izvVar;
    }

    private final Object l(Object obj) {
        qek0 qek0Var = qek0.f28589a;
        rek0 rek0Var = rek0.b;
        s4w s4wVar = (s4w) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean zD = Intrinsics.d(s4wVar, m4w.f21194a);
        izv izvVar = this.k;
        if (zD) {
            ii iiVarG0 = izvVar.G0();
            String strH = izvVar.H(R.string.confirmation);
            String strH2 = izvVar.H(R.string.order_already_exist_message);
            String strH3 = izvVar.H(R.string.yes);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, izvVar.H(R.string.no), (String) null, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC = izvVar.C();
            eVarC.getClass();
            iiVarG0.d(dialogFields, eVarC);
        } else if (s4wVar instanceof o4w) {
            o4w o4wVar = (o4w) s4wVar;
            sqt.g(y3w.n2, izvVar.F(), o4wVar.f24659a, o4wVar.b, (sys0) izvVar.R1.n(izvVar, izv.e2[6]));
        } else if (s4wVar instanceof n4w) {
            String str = ((n4w) s4wVar).f22917a;
            String strI = str.length() > 0 ? izvVar.I(R.string.history_coupon_number_with_dot, str) : "";
            strI.getClass();
            ii iiVarG1 = izvVar.G0();
            String strH4 = izvVar.H(R.string.hide_history_dialog_message);
            String strH5 = izvVar.H(R.string.ok_new);
            strH5.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strI, (CharSequence) strH4, (CharSequence) strH5, izvVar.H(R.string.cancel), (String) null, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC2 = izvVar.C();
            eVarC2.getClass();
            iiVarG1.d(dialogFields2, eVarC2);
        } else if (s4wVar instanceof l4w) {
            ii iiVarG2 = izvVar.G0();
            String strH6 = izvVar.H(R.string.coupon_has_items);
            String strH7 = izvVar.H(R.string.duplicate_coupon_not_empty_error);
            String strH8 = izvVar.H(R.string.ok_new);
            strH8.getClass();
            DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, izvVar.H(R.string.cancel), (String) null, "REQUEST_COUPON_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC3 = izvVar.C();
            eVarC3.getClass();
            iiVarG2.d(dialogFields3, eVarC3);
        } else if (s4wVar instanceof q4w) {
            wdk0 wdk0VarL0 = izvVar.L0();
            String strH9 = izvVar.H(R.string.selected_bid_was_successfully_hidden);
            strH9.getClass();
            wdk0.k(wdk0VarL0, new xdk0(qek0Var, strH9, ((q4w) s4wVar).f28121a, null, null, new Integer(R.drawable.ic_snack_hide), 88), izvVar, null, null, false, null, 1020);
        } else {
            if (s4wVar instanceof j4w) {
                j4w j4wVar = (j4w) s4wVar;
                String str2 = j4wVar.b;
                byte[] bArr = j4wVar.f15904a;
                rqt rqtVar = izv.d2;
                kxq kxqVarB = izvVar.B();
                if (kxqVarB != null && !kxqVarB.isFinishing()) {
                    try {
                        Object systemService = kxqVarB.getSystemService("print");
                        PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                        if (printManager != null) {
                            int i = qb90.e;
                            printManager.print(str2, xvw.D(izvVar.o0(), str2, bArr), new PrintAttributes.Builder().build());
                        }
                    } catch (ActivityNotFoundException unused) {
                        wdk0 wdk0VarL1 = izvVar.L0();
                        String string = kxqVarB.getString(R.string.error_not_installed_v2, "PDFReader");
                        string.getClass();
                        wdk0.k(wdk0VarL1, new xdk0(rek0Var, string, null, null, null, null, 124), izvVar, null, null, false, null, 1020);
                    }
                }
            } else if (s4wVar instanceof h4w) {
                wdk0 wdk0VarL2 = izvVar.L0();
                h4w h4wVar = (h4w) s4wVar;
                String str3 = h4wVar.b;
                String str4 = h4wVar.f12454a;
                String strH10 = izvVar.H(R.string.copy_history_bet_number_copy);
                strH10.getClass();
                j120.M(izvVar, wdk0VarL2, "Bet Number", str3, strH10, str4, new Integer(R.drawable.data_copy_icon), null, 64);
            } else if (s4wVar instanceof g4w) {
                wdk0 wdk0VarL3 = izvVar.L0();
                String strH11 = izvVar.H(R.string.cancel_autobet_request);
                strH11.getClass();
                wdk0.k(wdk0VarL3, new xdk0(qek0Var, strH11, null, null, null, null, 124), izvVar, null, null, false, null, 1020);
            } else if (s4wVar instanceof i4w) {
                izvVar.n0().r().t0(i120.V(new Pair("BET_INFO_FRAGMENT_REQUEST_KEY", ((i4w) s4wVar).f14163a.f22868a)), "BET_INFO_FRAGMENT_REQUEST_KEY");
                izvVar.M0().w();
            } else if (s4wVar instanceof k4w) {
                ii iiVarG3 = izvVar.G0();
                String strH12 = izvVar.H(R.string.error);
                String strH13 = izvVar.H(R.string.request_error);
                String strH14 = izvVar.H(R.string.ok_new);
                strH14.getClass();
                DialogFields dialogFields4 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                androidx.fragment.app.e eVarC4 = izvVar.C();
                eVarC4.getClass();
                iiVarG3.d(dialogFields4, eVarC4);
            } else if (s4wVar instanceof p4w) {
                wdk0.k(izvVar.L0(), new xdk0(rek0Var, ((p4w) s4wVar).f26377a, null, null, null, null, 124), izvVar, null, null, false, null, 1020);
            } else {
                if (!(s4wVar instanceof r4w)) {
                    t9f.b();
                    return null;
                }
                wdk0.k(izvVar.L0(), new xdk0(rek0Var, ((r4w) s4wVar).f29858a, null, null, null, null, 124), izvVar, null, null, false, null, 1020);
            }
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        qek0 qek0Var = qek0.f28589a;
        j5w j5wVar = (j5w) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean zD = Intrinsics.d(j5wVar, e5w.c);
        izv izvVar = this.k;
        if (zD) {
            rqt rqtVar = izv.d2;
            ii iiVarG0 = izvVar.G0();
            String strH = izvVar.H(R.string.confirmation);
            String strH2 = izvVar.H(R.string.system_push_notification_setting);
            String strH3 = izvVar.H(R.string.open_settings);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, izvVar.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC = izvVar.C();
            eVarC.getClass();
            iiVarG0.d(dialogFields, eVarC);
        } else if (Intrinsics.d(j5wVar, e5w.b)) {
            rqt rqtVar2 = izv.d2;
            ii iiVarG1 = izvVar.G0();
            String strH4 = izvVar.H(R.string.confirmation);
            String strH5 = izvVar.H(R.string.push_tracking_alert_message);
            String strH6 = izvVar.H(R.string.activate);
            strH6.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, izvVar.H(R.string.cancel), (String) null, "REQUEST_APP_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC2 = izvVar.C();
            eVarC2.getClass();
            iiVarG1.d(dialogFields2, eVarC2);
        } else if (Intrinsics.d(j5wVar, e5w.f7252a)) {
            rqt rqtVar3 = izv.d2;
            ii iiVarG2 = izvVar.G0();
            String strH7 = izvVar.H(R.string.attention);
            String strH8 = izvVar.H(R.string.self_exclusion_changes_prohibited);
            String strH9 = izvVar.H(R.string.ok_new);
            strH9.getClass();
            DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
            androidx.fragment.app.e eVarC3 = izvVar.C();
            eVarC3.getClass();
            iiVarG2.d(dialogFields3, eVarC3);
        } else if (j5wVar instanceof f5w) {
            f5w f5wVar = (f5w) j5wVar;
            wdk0.k(izvVar.L0(), new xdk0(qek0Var, f5wVar.f8982a, f5wVar.b, null, null, new Integer(f5wVar.c), 88), izvVar, null, null, false, null, 1020);
        } else if (j5wVar instanceof h5w) {
            std stdVar = oyd.k2;
            androidx.fragment.app.e eVarF = izvVar.F();
            n3w n3wVar = ((h5w) j5wVar).f12501a;
            double d = n3wVar.m;
            stdVar.getClass();
            std.h(eVarF, n3wVar, d);
        } else if (j5wVar instanceof i5w) {
            i5w i5wVar = (i5w) j5wVar;
            wdk0.k(izvVar.L0(), new xdk0(qek0Var, i5wVar.f14214a, i5wVar.b, null, null, null, 120), izvVar, null, null, true, null, 1004);
            vcc.f0(i120.V(new Pair("BUNDLE_BET_ID", i5wVar.c), new Pair("REQUEST_KEY_HIDE_COUPON", Boolean.TRUE)), izvVar, "REQUEST_KEY_SUCCESS_SALE");
        } else {
            if (!(j5wVar instanceof g5w)) {
                t9f.b();
                return null;
            }
            wdk0.k(izvVar.L0(), new xdk0(rek0.b, ((g5w) j5wVar).f10736a, null, null, null, null, 124), izvVar, null, null, false, null, 1020);
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        izv izvVar = this.k;
        switch (b) {
            case 0:
                hzv hzvVar = new hzv(izvVar, yjeVar, (byte) 0);
                hzvVar.j = obj;
                return hzvVar;
            case 1:
                hzv hzvVar2 = new hzv(izvVar, yjeVar, (byte) 1);
                hzvVar2.j = obj;
                return hzvVar2;
            case 2:
                hzv hzvVar3 = new hzv(izvVar, yjeVar, (byte) 2);
                hzvVar3.j = obj;
                return hzvVar3;
            case 3:
                hzv hzvVar4 = new hzv(izvVar, yjeVar, (byte) 3);
                hzvVar4.j = obj;
                return hzvVar4;
            default:
                hzv hzvVar5 = new hzv(izvVar, yjeVar, (byte) 4);
                hzvVar5.j = obj;
                return hzvVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hzv) create((i2w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hzv) create((s4w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hzv) create((j5w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hzv) create((d5w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hzv) create((k5w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        k5w k5wVar;
        String strI;
        String strG;
        String strH;
        q4f q4fVar;
        int i;
        int iA;
        String strI0;
        s77 s77Var;
        byte b = this.i;
        izv izvVar = this.k;
        switch (b) {
            case 0:
                n0o0 n0o0Var = izvVar.b2;
                i2w i2wVar = (i2w) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(i2wVar, f2w.f8834a)) {
                    rqt rqtVar = izv.d2;
                    izvVar.I0().e.setVisibility(8);
                    izvVar.N0();
                    izvVar.Q0(false);
                    izvVar.O0(true);
                } else {
                    if (!(i2wVar instanceof g2w)) {
                        if (i2wVar instanceof h2w) {
                            rqt rqtVar2 = izv.d2;
                            izvVar.I0().e.setVisibility(0);
                            izvVar.O0(false);
                            izvVar.N0();
                            izvVar.Q0(false);
                            h2w h2wVar = (h2w) i2wVar;
                            s47 s47Var = h2wVar.f12355a;
                            n3w n3wVar = s47Var.f31591a;
                            double d = n3wVar.B;
                            double d2 = n3wVar.n;
                            double d3 = n3wVar.o;
                            long j = n3wVar.N1;
                            double d4 = n3wVar.Z;
                            String str = n3wVar.q1;
                            e4f e4fVar = n3wVar.l;
                            String str2 = n3wVar.g;
                            jzv jzvVarM0 = izvVar.M0();
                            mob0 mob0Var = n3wVar.A1;
                            String str3 = n3wVar.i;
                            String str4 = n3wVar.h;
                            boolean z = n3wVar.f1;
                            boolean z2 = n3wVar.t;
                            q4f q4fVar2 = n3wVar.g1;
                            s77 s77Var2 = n3wVar.c;
                            q5w q5wVar = jzvVarM0.e;
                            q5wVar.getClass();
                            p7m0 p7m0Var = q5wVar.C;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, n3wVar));
                            p7m0 p7m0Var2 = q5wVar.E;
                            n3w n3wVarV = q5wVar.v();
                            if (n3wVarV.l != e4f.c || (s77Var = n3wVarV.c) == s77.TOTO || s77Var == s77.JACKPOT || s77Var == s77.AUTO) {
                                k5wVar = k5w.f17739a;
                            } else {
                                k5wVar = q5wVar.v().j1 ? k5w.b : k5w.c;
                            }
                            p7m0Var2.o(null, k5wVar);
                            izvVar.I0().l.setEnabled((z2 || s77Var2 == s77.AUTO) ? false : true);
                            String str5 = s47Var.h;
                            boolean z3 = s47Var.l;
                            double d5 = n3wVar.v;
                            String str6 = n3wVar.g;
                            double d6 = n3wVar.p;
                            boolean z4 = s47Var.i;
                            boolean z5 = s47Var.n;
                            boolean z6 = s47Var.j;
                            TextView textView = izvVar.I0().b.R;
                            rdj rdjVar = rdj.f30294a;
                            textView.setText(rdj.g(new znq0(n3wVar.j), efj.UNIVERSAL, Boolean.valueOf(z5), false, 56));
                            izvVar.I0().b.k0.setText(n3wVar.m1);
                            TextView textView2 = izvVar.I0().b.X;
                            int i2 = fzv.f10429a[s77Var2.ordinal()];
                            String str7 = n3wVar.f22868a;
                            if (i2 == 1) {
                                if (str7.length() == 0) {
                                    str7 = n3wVar.b;
                                }
                                strI = izvVar.I(R.string.history_coupon_number_with_dot, str7);
                            } else {
                                strI = izvVar.I(R.string.history_coupon_number_with_dot, str7);
                            }
                            textView2.setText(strI);
                            izvVar.I0().b.c0.setVisibility(n3wVar.s1 ? 0 : 8);
                            izvVar.I0().b.o.setVisibility(z2 ? 0 : 8);
                            izvVar.I0().b.Y.setVisibility(z4 ? 0 : 8);
                            izvVar.I0().b.S.setVisibility(z6 ? 0 : 8);
                            TextView textView3 = izvVar.I0().b.U;
                            q4f q4fVar3 = q4f.u;
                            textView3.setVisibility(q4fVar2 == q4fVar3 ? 0 : 8);
                            izvVar.I0().b.T.setVisibility(str5.length() > 0 ? 0 : 8);
                            izvVar.I0().b.T.setText(str5);
                            izvVar.I0().b.f.setVisibility(n3wVar.P1 ? 0 : 8);
                            izvVar.S0("MENU_MORE_BUTTON", (s77Var2 == s77.AGGREGATOR || q3d.j(e4f.l, e4f.m).contains(e4fVar)) ? false : true);
                            e1i e1iVarB = izvVar.I0().k.b("MENU_MORE_BUTTON");
                            if (e1iVarB != null) {
                                e1iVarB.setOnNavigationBarButtonClickListener(new wqv(izvVar, n3wVar, (byte) 6));
                            }
                            izvVar.R0(n3wVar.j1);
                            izvVar.I0().b.e.setVisibility(d4 > 0.0d ? 0 : 8);
                            izvVar.I0().b.F.setText(jtv.I0(d4, str2, false));
                            TextView textView4 = izvVar.I0().b.P;
                            e4f e4fVar2 = e4f.k;
                            boolean z7 = e4fVar == e4fVar2 || (str.length() > 0 && e4fVar == e4f.l);
                            boolean z8 = n3wVar.o1;
                            textView4.setVisibility(z7 ? 0 : 8);
                            izvVar.I0().b.Q.setVisibility((e4fVar == e4fVar2 || (str.length() > 0 && e4fVar == e4f.l)) ? 0 : 8);
                            if (e4fVar == e4fVar2) {
                                izvVar.I0().b.Q.setText(izvVar.H(R.string.when_score_change));
                            } else {
                                izvVar.I0().b.Q.setText(izvVar.H(R.string.cancellation_reason));
                            }
                            izvVar.I0().b.P.setTextColor(feb.a0(e4fVar, izvVar.o0()));
                            TextView textView5 = izvVar.I0().b.P;
                            if (z8 && e4fVar == e4fVar2) {
                                strG = izvVar.H(R.string.drop_on);
                            } else if (str.length() <= 0 || e4fVar != e4f.l) {
                                strG = (z8 || zjb.G(n3wVar, izvVar.K0()).length() != 0) ? zjb.G(n3wVar, izvVar.K0()) : izvVar.H(R.string.not_drop_on);
                            } else {
                                strG = str;
                            }
                            textView5.setText(strG);
                            izvVar.I0().b.D.setVisibility((!z || j == 0) ? 8 : 0);
                            izvVar.I0().b.D.setText(izvVar.K0().f(R.string.bet_info_approved_by_bet_v2, String.valueOf(j)));
                            Group group = izvVar.I0().b.p;
                            int i3 = n3wVar.y;
                            group.setVisibility(i3 > 1 ? 0 : 8);
                            if (i3 > 1) {
                                izvVar.I0().b.q.setImageResource(lgb.S(q4fVar2));
                                ImageView imageView = izvVar.I0().b.q;
                                TypedValue typedValue = j5d.f15927a;
                                imageView.setColorFilter(j5d.a(izvVar.o0(), R.attr.uikitSecondary, false));
                                izvVar.I0().b.W.setText(zjb.A(n3wVar, izvVar.K0()));
                                izvVar.I0().b.V.setText(izvVar.o0().getResources().getString(R.string.finished_bets, Integer.valueOf(n3wVar.A), Integer.valueOf(i3)));
                            }
                            if (s47Var.f) {
                                izvVar.I0().b.k.setVisibility(0);
                                izvVar.I0().b.I.setText(izvVar.H(R.string.coef_view_ind));
                                izvVar.I0().b.J.setText(izvVar.H(R.string.coefficient_type_title));
                            } else {
                                izvVar.I0().b.k.setVisibility(8);
                            }
                            String str8 = n3wVar.f;
                            if (str4.length() > 0 && z4) {
                                izvVar.I0().b.j.setVisibility(0);
                                izvVar.I0().b.G.setText(str4);
                                boolean zC = cy7.c();
                                String strH2 = izvVar.H(R.string.maximum_coef);
                                strH2.getClass();
                                izvVar.I0().b.H.setText(zC ? Separators.COLON.concat(strH2) : strH2.concat(Separators.COLON));
                            } else if (str8.length() == 0) {
                                izvVar.I0().b.j.setVisibility(8);
                            } else if ((s77Var2 == s77.TOTO || s77Var2 == s77.JACKPOT) && !q3d.j(e4f.e, e4f.f).contains(e4fVar)) {
                                izvVar.I0().b.j.setVisibility(8);
                            } else {
                                izvVar.I0().b.j.setVisibility(0);
                                izvVar.I0().b.G.setText(str8);
                            }
                            if (str3.length() <= 0 || !z4) {
                                izvVar.I0().b.r.setVisibility(8);
                            } else {
                                izvVar.I0().b.r.setVisibility(0);
                                izvVar.I0().b.Z.setText(str3);
                                boolean zC2 = cy7.c();
                                String strH3 = izvVar.H(R.string.optional_coef);
                                strH3.getClass();
                                izvVar.I0().b.a0.setText(zC2 ? Separators.COLON.concat(strH3) : strH3.concat(Separators.COLON));
                            }
                            Group group2 = izvVar.I0().b.h;
                            double d7 = n3wVar.n1;
                            group2.setVisibility((s77Var2 == s77.TOTO || s77Var2 == s77.JACKPOT ? d3 <= 0.0d : q4fVar2 == q4f.h) ? 8 : 0);
                            izvVar.I0().b.g.setVisibility((d2 <= 0.0d || d7 <= 0.0d) ? 8 : 0);
                            izvVar.I0().b.l.setVisibility(d2 > 0.0d ? 0 : 8);
                            TextView textView6 = izvVar.I0().b.M;
                            e4f e4fVar3 = e4f.j;
                            if (e4fVar == e4fVar3) {
                                strH = izvVar.H(R.string.starting_bet);
                            } else {
                                strH = d2 > 0.0d ? izvVar.H(R.string.history_bet_rate_partially_sold) : izvVar.H(R.string.history_bet_rate);
                            }
                            textView6.setText(strH);
                            TextView textView7 = izvVar.I0().b.L;
                            if (d7 <= 0.0d) {
                                d7 = d3;
                            }
                            textView7.setText(jtv.I0(d7, str2, false));
                            izvVar.I0().b.f0.setText(jtv.I0(d3, str2, false));
                            izvVar.I0().b.m.setText(jtv.I0(d2, str2, false));
                            String str9 = n3wVar.u;
                            e4f e4fVar4 = n3wVar.l;
                            if (d6 <= 0.0d || e4fVar4 == e4f.g) {
                                q4fVar = q4fVar3;
                                boolean z9 = n3wVar.r1;
                                if (z9 && d5 > 0.0d && e4fVar4 == e4fVar3) {
                                    izvVar.I0().b.O.setText(izvVar.H(R.string.history_bill_received));
                                    TextView textView8 = izvVar.I0().b.N;
                                    double d8 = n3wVar.y1;
                                    if (d5 <= d8) {
                                        d8 = d5;
                                    }
                                    textView8.setText(jtv.I0(d8, str6, false));
                                    TextView textView9 = izvVar.I0().b.N;
                                    TypedValue typedValue2 = j5d.f15927a;
                                    textView9.setTextColor(j5d.a(izvVar.o0(), R.attr.uikitTextPrimary, false));
                                } else if (!z9 || d5 <= 0.0d) {
                                    izvVar.I0().b.i.setVisibility(8);
                                } else {
                                    int iOrdinal = n3wVar.L1.ordinal();
                                    if (iOrdinal == 0) {
                                        i = R.string.max_payout;
                                    } else if (iOrdinal == 1) {
                                        i = R.string.history_min_payout;
                                    } else if (iOrdinal == 2) {
                                        i = n3wVar.w ? R.string.make_bet_max_possible_win : R.string.history_possible_win;
                                    } else {
                                        t9f.b();
                                    }
                                    izvVar.I0().b.O.setText(izvVar.H(i));
                                    izvVar.I0().b.N.setText(jtv.I0(d5, str6, false));
                                    TextView textView10 = izvVar.I0().b.N;
                                    TypedValue typedValue3 = j5d.f15927a;
                                    textView10.setTextColor(j5d.a(izvVar.o0(), R.attr.uikitTextPrimary, false));
                                }
                            } else {
                                izvVar.I0().b.O.setText(izvVar.H(R.string.history_your_win_new));
                                TextView textView11 = izvVar.I0().b.N;
                                q4f q4fVar4 = n3wVar.g1;
                                if (q4fVar4 == q4fVar3) {
                                    pn40 pn40Var = pn40.f27267a;
                                    q4fVar = q4fVar3;
                                    strI0 = kng0.l(pn40.c(d6, p3u0.c), Separators.SP, izvVar.H(R.string.pts));
                                } else {
                                    q4fVar = q4fVar3;
                                    strI0 = (q4fVar4 != q4f.y || str9.length() <= 0) ? jtv.I0(d6, str6, false) : kng0.l(str9, Separators.SP, jtv.I0(d6, str6, false));
                                }
                                textView11.setText(strI0);
                                izvVar.I0().b.N.setTextColor(izvVar.o0().getColor(R.color.static_green));
                            }
                            mb90 mb90Var = s47Var.b;
                            h6z h6zVar = izvVar.I0().b;
                            Group group3 = h6zVar.s;
                            TextView textView12 = h6zVar.t;
                            group3.setVisibility(mb90Var.d ? 0 : 8);
                            h6zVar.u.setText(mb90Var.f21497a);
                            textView12.setText(mb90Var.b);
                            textView12.setTextColor(mb90Var.c);
                            double d9 = s47Var.c;
                            Group group4 = izvVar.I0().b.v;
                            s77 s77Var3 = s77.SALE;
                            group4.setVisibility((s77Var2 != s77Var3 || e4fVar == e4fVar3) ? 8 : 0);
                            String strI1 = jtv.I0(d9, str2, true);
                            if (d9 > 0.0d) {
                                iA = izvVar.o0().getColor(R.color.static_green);
                            } else if (d9 < 0.0d) {
                                iA = izvVar.o0().getColor(R.color.static_red);
                            } else {
                                TypedValue typedValue4 = j5d.f15927a;
                                iA = j5d.a(izvVar.o0(), R.attr.uikitTextPrimary, false);
                            }
                            izvVar.I0().b.x.setTextColor(iA);
                            izvVar.I0().b.x.setText(strI1);
                            izvVar.I0().b.z.setVisibility((s77Var2 != s77Var3 || e4fVar == e4fVar3) ? 0 : 8);
                            Context context = izvVar.I0().b.K.getContext();
                            context.getClass();
                            if (feb.a0(e4fVar, context) != 0) {
                                TextView textView13 = izvVar.I0().b.K;
                                Context context2 = izvVar.I0().b.K.getContext();
                                context2.getClass();
                                textView13.setTextColor(feb.a0(e4fVar, context2));
                            }
                            if (q4fVar2 == q4fVar) {
                                izvVar.I0().b.n.setImageResource(0);
                                String string = izvVar.o0().getString(feb.X(e4fVar));
                                string.getClass();
                                CharSequence text = izvVar.o0().getText(z ? R.string.confirmed : R.string.not_confirmed);
                                text.getClass();
                                izvVar.I0().b.K.setText(string + " (" + ((Object) text) + Separators.RPAREN);
                            } else if (e4fVar == e4f.e && d == n3wVar.G1 && d > 0.0d) {
                                izvVar.I0().b.n.setImageResource(feb.V(e4fVar));
                                izvVar.I0().b.K.setText(izvVar.I(R.string.history_paid_and_prepaid, jtv.I0(n3wVar.p, str2, false), jtv.I0(d, str2, false)));
                            } else {
                                izvVar.I0().b.n.setImageResource(feb.V(e4fVar));
                                izvVar.I0().b.K.setText(izvVar.H(feb.X(e4fVar)));
                            }
                            boolean z10 = s47Var.g;
                            boolean z11 = s47Var.d;
                            boolean z12 = s47Var.e;
                            izvVar.I0().f.setVisibility((z10 || z12) ? 0 : 8);
                            izvVar.I0().d.setVisibility(z10 ? 0 : 8);
                            if (izvVar.I0().d.getVisibility() == 0) {
                                if (Intrinsics.d(mob0Var, mob0.f) || !z11) {
                                    pn40 pn40Var2 = pn40.f27267a;
                                    izvVar.I0().d.setText(izvVar.I(R.string.history_sale_for_v2, pn40.d(n3wVar.m, str2, p3u0.c)));
                                    dyb.O(izvVar.I0().d, new ezv(izvVar, (byte) 2));
                                    MaterialButton materialButton = izvVar.I0().d;
                                    TypedValue typedValue5 = j5d.f15927a;
                                    materialButton.setBackgroundTintList(ColorStateList.valueOf(j5d.a(izvVar.o0(), R.attr.uikitPrimary, false)));
                                } else {
                                    pn40 pn40Var3 = pn40.f27267a;
                                    izvVar.I0().d.setText(izvVar.I(R.string.history_powerbet_for_v2, pn40.d(mob0Var.c, str2, p3u0.c)));
                                    MaterialButton materialButton2 = izvVar.I0().d;
                                    TypedValue typedValue6 = j5d.f15927a;
                                    materialButton2.setBackgroundTintList(ColorStateList.valueOf(j5d.a(izvVar.o0(), R.attr.uikitCommerce, false)));
                                    dyb.O(izvVar.I0().d, new ezv(izvVar, (byte) 1));
                                }
                            }
                            izvVar.I0().c.setVisibility(z12 ? 0 : 8);
                            dyb.O(izvVar.I0().c, new f3s(izvVar, n3wVar, (byte) 23));
                            ArrayList arrayList = h2wVar.b;
                            if (arrayList.isEmpty()) {
                                izvVar.I0().j.setVisibility(8);
                            } else {
                                izvVar.I0().j.setVisibility(0);
                                ((ma7) n0o0Var.getValue()).f = arrayList;
                                ((ma7) n0o0Var.getValue()).g();
                            }
                            cxo0 cxo0Var = h2wVar.c;
                            String str10 = cxo0Var.b;
                            Group group5 = izvVar.I0().b.A;
                            hxu hxuVar = cxo0Var.f5131a;
                            e4f e4fVar5 = cxo0Var.c;
                            ivo0 ivo0Var = hxuVar.f13829a;
                            group5.setVisibility(osm0.l(ivo0Var) ? 0 : 8);
                            TextView textView14 = izvVar.I0().b.g0;
                            ctf0 ctf0VarK0 = izvVar.K0();
                            ivo0 ivo0Var2 = hxuVar.f;
                            ivo0 ivo0Var3 = hxuVar.e;
                            ivo0 ivo0Var4 = hxuVar.d;
                            ivo0 ivo0Var5 = hxuVar.c;
                            ivo0 ivo0Var6 = hxuVar.b;
                            textView14.setText(ctf0VarK0.b.a(R.string.bet_vat_title, Arrays.copyOf(new Object[]{ivo0Var.f15455a}, 1)));
                            izvVar.I0().b.h0.setText(jtv.I0(ivo0Var.b, str10, false));
                            izvVar.I0().b.s0.setVisibility(osm0.l(ivo0Var6) ? 0 : 8);
                            izvVar.I0().b.n0.setText(izvVar.K0().b.a(R.string.bet_vat_title, Arrays.copyOf(new Object[]{ivo0Var6.f15455a}, 1)));
                            izvVar.I0().b.o0.setText(jtv.I0(ivo0Var6.b, str10, false));
                            izvVar.I0().b.y.setVisibility(osm0.l(ivo0Var5) ? 0 : 8);
                            izvVar.I0().b.d0.setText(izvVar.K0().b.a(R.string.bet_vat_title, Arrays.copyOf(new Object[]{ivo0Var5.f15455a}, 1)));
                            izvVar.I0().b.e0.setText(jtv.I0(ivo0Var5.b, str10, false));
                            izvVar.I0().b.t0.setVisibility(osm0.l(ivo0Var4) ? 0 : 8);
                            izvVar.I0().b.p0.setText(izvVar.K0().b.a(R.string.bet_vat_title, Arrays.copyOf(new Object[]{ivo0Var4.f15455a}, 1)));
                            izvVar.I0().b.q0.setText(jtv.I0(ivo0Var4.b, str10, false));
                            izvVar.I0().b.B.setVisibility(osm0.l(ivo0Var3) ? 0 : 8);
                            izvVar.I0().b.i0.setText(izvVar.K0().k(R.string.bet_vat_title, ivo0Var3.f15455a));
                            izvVar.I0().b.j0.setText(jtv.I0(ivo0Var3.b, str10, false));
                            if (osm0.l(ivo0Var2) && e4fVar5 != e4f.f) {
                                izvVar.I0().b.i.setVisibility(0);
                                String strH4 = e4fVar5 == e4f.e ? izvVar.H(R.string.history_your_win_new) : izvVar.K0().k(R.string.bet_vat_title, ivo0Var2.f15455a);
                                strH4.getClass();
                                izvVar.I0().b.O.setText(strH4);
                                izvVar.I0().b.N.setText(jtv.I0(ivo0Var2.b, str10, false));
                            }
                            ViewGroup.LayoutParams layoutParams = izvVar.I0().b.O.getLayoutParams();
                            layoutParams.getClass();
                            a3e a3eVar = (a3e) layoutParams;
                            ViewGroup.LayoutParams layoutParams2 = izvVar.I0().b.E.getLayoutParams();
                            layoutParams2.getClass();
                            a3e a3eVar2 = (a3e) layoutParams2;
                            ViewGroup.LayoutParams layoutParams3 = izvVar.I0().b.w.getLayoutParams();
                            layoutParams3.getClass();
                            a3e a3eVar3 = (a3e) layoutParams3;
                            if (n3wVar.b() && izvVar.I0().b.v.getVisibility() != 0) {
                                a3eVar.j = izvVar.I0().b.E.getId();
                                a3eVar3.j = izvVar.I0().b.O.getId();
                                a3eVar2.j = izvVar.I0().b.C.getId();
                                izvVar.I0().b.O.setLayoutParams(a3eVar);
                                izvVar.I0().b.E.setLayoutParams(a3eVar2);
                                izvVar.I0().b.w.setLayoutParams(a3eVar3);
                            }
                            ViewGroup.LayoutParams layoutParams4 = izvVar.I0().b.O.getLayoutParams();
                            layoutParams4.getClass();
                            a3e a3eVar4 = (a3e) layoutParams4;
                            ViewGroup.LayoutParams layoutParams5 = izvVar.I0().b.c.getLayoutParams();
                            layoutParams5.getClass();
                            a3e a3eVar5 = (a3e) layoutParams5;
                            ViewGroup.LayoutParams layoutParams6 = izvVar.I0().b.l0.getLayoutParams();
                            layoutParams6.getClass();
                            a3e a3eVar6 = (a3e) layoutParams6;
                            if (n3wVar.e()) {
                                a3eVar4.j = izvVar.I0().b.c.getId();
                                a3eVar6.j = izvVar.I0().b.O.getId();
                                a3eVar5.j = izvVar.I0().b.i0.getId();
                                izvVar.I0().b.O.setLayoutParams(a3eVar4);
                                izvVar.I0().b.c.setLayoutParams(a3eVar5);
                                izvVar.I0().b.l0.setLayoutParams(a3eVar6);
                            }
                            izvVar.I0().b.b.setVisibility(zjb.G(n3wVar, izvVar.K0()).length() > 0 ? 0 : 8);
                            izvVar.I0().b.c.setText(zjb.G(n3wVar, izvVar.K0()));
                            izvVar.I0().b.d.setText(zjb.H(n3wVar, izvVar.K0(), n3wVar.g));
                            long j2 = s47Var.k;
                            String str11 = n3wVar.M1;
                            izvVar.I0().b.r0.setVisibility(z3 ? 0 : 8);
                            izvVar.I0().b.m0.setText(String.valueOf(j2));
                            izvVar.I0().b.b0.setText(str11);
                            Bitmap bitmap = s47Var.m;
                            nq8 nq8Var = izvVar.I0().i;
                            LinearLayout linearLayout = (LinearLayout) nq8Var.b;
                            if (!z3 || bitmap == null) {
                                linearLayout.setVisibility(8);
                            } else {
                                linearLayout.setVisibility(0);
                                ((ImageView) nq8Var.c).setImageBitmap(bitmap);
                            }
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    rqt rqtVar3 = izv.d2;
                    izvVar.O0(false);
                    g2w g2wVar = (g2w) i2wVar;
                    boolean z13 = g2wVar.f10581a;
                    izvVar.Q0(z13);
                    if (!z13) {
                        izvVar.P0(g2wVar.b, false);
                    }
                }
                return Unit.f46060a;
            case 1:
                return l(obj);
            case 2:
                return m(obj);
            case 3:
                d5w d5wVar = (d5w) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                b5w b5wVar = b5w.f2026a;
                if (!Intrinsics.d(d5wVar, b5wVar)) {
                    if (!(d5wVar instanceof c5w)) {
                        t9f.b();
                        return null;
                    }
                    c5w c5wVar = (c5w) d5wVar;
                    boolean z14 = c5wVar.f3793a;
                    boolean z15 = c5wVar.b;
                    rqt rqtVar4 = izv.d2;
                    izvVar.P0(z14, z15);
                    izvVar.M0().e.F.o(null, b5wVar);
                }
                return Unit.f46060a;
            default:
                k5w k5wVar2 = (k5w) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(k5wVar2, k5w.b)) {
                    rqt rqtVar5 = izv.d2;
                    izvVar.S0("MENU_NOTIFY_BUTTON", true);
                    izvVar.R0(true);
                } else if (Intrinsics.d(k5wVar2, k5w.c)) {
                    rqt rqtVar6 = izv.d2;
                    izvVar.S0("MENU_NOTIFY_BUTTON", true);
                    izvVar.R0(false);
                } else {
                    if (!Intrinsics.d(k5wVar2, k5w.f17739a)) {
                        t9f.b();
                        return null;
                    }
                    rqt rqtVar7 = izv.d2;
                    izvVar.S0("MENU_NOTIFY_BUTTON", false);
                }
                return Unit.f46060a;
        }
    }
}
