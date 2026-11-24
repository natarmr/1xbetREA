package a;

import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.Editable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.AppScreens$ContactsFragmentScreen;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.statistic.tablet.Cs2StatisticTabletView;
import org.xplatform.make_bet_settings.impl.navigation.SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ejd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7903a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ejd(Object obj, byte b) {
        this.f7903a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        m7h0 rulesScreenFactoryImpl$getRulesFragmentOldScreen$1;
        Object value3;
        byte b = this.f7903a;
        byte b2 = 2;
        byte b3 = 14;
        boolean z = false;
        byte b4 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rjd rjdVar = new rjd(((Integer) obj).intValue());
                int i = hjd.E;
                ((hjd) obj2).g(rjdVar);
                return Unit.f46060a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return Unit.f46060a;
            case 2:
                skd skdVar = (skd) obj2;
                a23 a23Var = skdVar.x;
                if (a23Var != null) {
                    return a23Var;
                }
                a23 a23Var2 = new a23(skdVar.f32341a);
                skdVar.x = a23Var2;
                return a23Var2;
            case 3:
                wlu0 wlu0Var = (wlu0) obj2;
                bh90 bh90Var = (bh90) obj;
                zfn zfnVar = wrw.f39666a;
                bh90Var.getClass();
                View view = ((xlu0) qbc.V(bh90Var, zfnVar)).f41093a;
                while (view != null) {
                    Object tag = view.getTag(wlu0Var.a());
                    if (tag != null) {
                        return tag;
                    }
                    Object objV = k7n0.v(view);
                    view = objV instanceof View ? (View) objV : null;
                }
                return null;
            case 4:
                Editable editable = (Editable) obj;
                kud kudVar = nud.b2;
                editable.getClass();
                svd svdVarI0 = ((nud) obj2).I0();
                String string = editable.toString();
                svdVarI0.y(string != null ? string : "");
                return Unit.f46060a;
            case 5:
                mwd mwdVar = (mwd) obj2;
                fwd fwdVar = (fwd) obj;
                kwd kwdVar = mwd.k2;
                fwdVar.getClass();
                if (fwdVar.equals(ewd.f8518a)) {
                    ii iiVar = mwdVar.i2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = mwdVar.H(R.string.caution);
                    String strH2 = mwdVar.H(R.string.language_warning_message);
                    String strH3 = mwdVar.H(R.string.ok);
                    strH3.getClass();
                    iiVar.d(new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528), mwdVar.n0().r());
                    mwdVar.x0();
                } else {
                    if (!fwdVar.equals(dwd.f6793a)) {
                        t9f.b();
                        return null;
                    }
                    Context contextD = mwdVar.D();
                    if (contextD != null) {
                        j120.g0(contextD, i120.U());
                    }
                    mwdVar.x0();
                }
                ((k3t0) mwdVar.j2.getValue()).x(yvd.f43312a);
                return Unit.f46060a;
            case 6:
                Editable editable2 = (Editable) obj;
                usd usdVar = exd.U1;
                editable2.getClass();
                kyd kydVarI0 = ((exd) obj2).I0();
                String string2 = editable2.toString();
                String str = string2 == null ? "" : string2;
                p7m0 p7m0Var = kydVarI0.B;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, wxd.a((wxd) value, false, str, false, false, str.length() > 0, 189)));
                kydVarI0.I("");
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = ((kyd) obj2).B;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, wxd.a((wxd) value2, false, null, false, true, false, 222)));
                return Unit.f46060a;
            case 8:
                iqt0 iqt0Var = (iqt0) obj;
                kud kudVar2 = xyd.U1;
                iqt0Var.getClass();
                ((xyd) obj2).H0().l.a(iqt0Var);
                return Unit.f46060a;
            case 9:
                kwd kwdVar2 = e7e.d2;
                ((View) obj).getClass();
                fae faeVarJ0 = ((e7e) obj2).J0();
                faeVarJ0.b.d(new ejd(faeVarJ0, (byte) 10));
                faeVarJ0.A(false);
                return Unit.f46060a;
            case 10:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (((pru) ((fae) obj2).d.b).a().A0) {
                    rulesScreenFactoryImpl$getRulesFragmentOldScreen$1 = new AppScreens$ContactsFragmentScreen();
                } else {
                    y9x y9xVar = y9x.INFO_CONTACT;
                    rulesScreenFactoryImpl$getRulesFragmentOldScreen$1 = new RulesScreenFactoryImpl$getRulesFragmentOldScreen$1(new RuleData(y9xVar.a(), 14, (Map) null, (String) null), x9x.T(y9xVar), true);
                }
                k0w0Var.h(rulesScreenFactoryImpl$getRulesFragmentOldScreen$1);
                return Unit.f46060a;
            case 11:
                vae vaeVar = (vae) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                vaeVar.a();
                vaeVar.f.g(th);
                return Unit.f46060a;
            case 12:
                Uri uri = (Uri) obj;
                kwd kwdVar3 = dce.Q1;
                uri.getClass();
                ((pce) ((dce) obj2).N1.getValue()).w(new vbe(uri));
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = ((pce) obj2).k;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, gce.a((gce) value3, null, false, true, 3)));
                return Unit.f46060a;
            case 14:
                tu9 tu9Var = (tu9) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 == null) {
                    tu9Var.b(null);
                } else if (th2 instanceof CancellationException) {
                    tu9Var.c();
                } else {
                    tu9Var.d(th2);
                }
                return Unit.f46060a;
            case 15:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view2 = cpVar.f40887a;
                view2.getClass();
                dyb.O(view2, new h6c((lya) obj2, cpVar, (byte) 26));
                cpVar.t(new rn5(cpVar, (byte) 21));
                return Unit.f46060a;
            case 16:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                y3j0 y3j0Var = ((wze) obj2).s;
                bm5 bm5Var = bm5.i;
                y3j0Var.getClass();
                k0w0Var2.h(new SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1(bm5Var));
                return Unit.f46060a;
            case 17:
                ((View) obj).getClass();
                ((pw4) obj2).invoke();
                return Unit.f46060a;
            case 18:
                ((View) obj).getClass();
                ((pw4) obj2).invoke();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new l4f(cpVar2, (ejd) obj2));
                return Unit.f46060a;
            case 20:
                n4f n4fVar = (n4f) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                kwd kwdVar4 = n4f.k2;
                phf0 phf0Var = n4fVar.i2;
                iiy[] iiyVarArr = n4f.l2;
                if (phf0Var.n(n4fVar, iiyVarArr[2]).length() > 0) {
                    vcc.f0(i120.V(new Pair("RESULT_POSITION", num)), n4fVar, phf0Var.n(n4fVar, iiyVarArr[2]));
                }
                n4fVar.y0();
                return Unit.f46060a;
            case 21:
                dcf dcfVar = (dcf) obj2;
                e0u e0uVar = (e0u) obj;
                e0uVar.getClass();
                dcfVar.e().execute(new bcf(dcfVar, e0uVar, b4));
                return Unit.f46060a;
            case 22:
                icf icfVar = (icf) obj2;
                e0u e0uVar2 = (e0u) obj;
                e0uVar2.getClass();
                icfVar.e().execute(new hcf(icfVar, e0uVar2, b2));
                return Unit.f46060a;
            case 23:
                hnf hnfVar = (hnf) obj2;
                eth ethVar = (eth) obj;
                ethVar.getClass();
                Cs2StatisticTabletView cs2StatisticTabletView = ethVar.f8375a;
                enf enfVar = hnfVar.c;
                cs2StatisticTabletView.w(enfVar.f8091a, enfVar.b);
                cs2StatisticTabletView.setFirstPlayer(hnfVar.d);
                cs2StatisticTabletView.setSecondPlayer(hnfVar.e);
                cs2StatisticTabletView.setThirdPlayer(hnfVar.f);
                cs2StatisticTabletView.setFourPlayer(hnfVar.g);
                cs2StatisticTabletView.setFivePlayer(hnfVar.h);
                cs2StatisticTabletView.setExtraMargin(hnfVar.k);
                cs2StatisticTabletView.setBackground(hnfVar.i);
                cs2StatisticTabletView.setTotalCash(hnfVar.j);
                return Unit.f46060a;
            case 24:
                rnf rnfVar = (rnf) obj2;
                xus xusVar = (xus) obj;
                xusVar.getClass();
                p7m0 p7m0Var4 = rnfVar.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    rnfVar.f.getClass();
                    rnf rnfVar2 = rnfVar;
                    if (p7m0Var4.m(value4, wmf.a((wmf) value4, null, null, false, null, null, null, false, false, null, false, xusVar, null, null, null, null, 16646143))) {
                        return Unit.f46060a;
                    }
                    rnfVar = rnfVar2;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                LinkedHashMap linkedHashMap = Cs2MapMovementView.A;
                ((jwd) obj2).invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue = ((Integer) obj).intValue();
                qud qudVar = n5g.S1;
                Object obj3 = ((n5g) obj2).H0().e.f.get(iIntValue);
                w5g w5gVar = obj3 instanceof w5g ? (w5g) obj3 : null;
                if (w5gVar != null && w5gVar.d.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mhc mhcVar = (mhc) obj2;
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                k7g k7gVar = (k7g) cpVar3.u;
                ConstraintLayout constraintLayout = k7gVar.c;
                constraintLayout.getClass();
                dyb.O(constraintLayout, new v4f(mhcVar, cpVar3, b3));
                k7gVar.b.setOnClickListener(new wg(cpVar3, (rer) mhcVar, (byte) 12));
                cpVar3.t(new ok(cpVar3, cpVar3, (byte) 19));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                nwd nwdVar = dcg.P1;
                ((View) obj).getClass();
                p7m0 p7m0Var5 = ((ecg) ((dcg) obj2).N1.getValue()).f;
                p7m0Var5.o(null, Boolean.valueOf(!((Boolean) p7m0Var5.getValue()).booleanValue()));
                return Unit.f46060a;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((ecg) obj2).d.a(th3);
                return Unit.f46060a;
        }
    }
}
