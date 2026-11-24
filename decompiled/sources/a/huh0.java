package a;

import a.m1r;
import a.wid0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationFailScreen$1;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class huh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13680a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ huh0(Object obj, Object obj2, byte b) {
        this.f13680a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i;
        byte b = this.f13680a;
        byte b2 = 2;
        Object[] objArr = 0;
        byte b3 = 1;
        hjm hjmVar = null;
        Object[] objArr2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zuh0 zuh0Var = (zuh0) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                zuh0Var.B((dth0) obj2, zuh0Var.M);
                zuh0Var.s.b(th, new fuh0(zuh0Var, objArr == true ? 1 : 0));
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rek0 rek0Var = ((ldi0) obj3).z;
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                boolean z = ((an4) th2).c == i2o.AuthenticatorPartnerIsBlocked;
                rek0Var.getClass();
                k0w0Var.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(message, z));
                return Unit.f46060a;
            case 2:
                rzg0 rzg0Var = (rzg0) obj2;
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                rzg0Var.getClass();
                return new tzg0(bundle, rzg0Var).w((v950) obj3);
            case 3:
                ((View) obj).getClass();
                ((uki0) obj3).invoke(((qki0) ((cp) obj2).u()).f28887a);
                return Unit.f46060a;
            case 4:
                tti0 tti0Var = (tti0) obj3;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.getLocalizedMessage();
                tti0Var.g.o(null, i8d.e);
                tti0Var.f(th3, (vne) obj2);
                return Unit.f46060a;
            case 5:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ((c8d) k0w0Var2.h(iw20.f(((xxi0) obj3).D0, (nqh0) obj2)).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                return Unit.f46060a;
            case 6:
                xxi0 xxi0Var = (xxi0) obj3;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                xxi0Var.H(new kui0((byte) 18));
                xxi0Var.Q(th4, (uu4) obj2);
                return Unit.f46060a;
            case 7:
                final swp0 swp0Var = (swp0) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((xxi0) obj3).V.getClass();
                k0w0Var3.h(new FragmentScreen() { // from class: org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        wid0.R1.getClass();
                        wid0 wid0Var = new wid0();
                        wid0Var.Q1.u(wid0Var, wid0.S1[1], swp0Var);
                        return wid0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return "QrSendConfirmationMailFragment";
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case 8:
                odj0 odj0Var = (odj0) obj3;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                odj0Var.H(new r3j0((byte) 22));
                odj0Var.O(th5, (uu4) obj2);
                return Unit.f46060a;
            case 9:
                final swp0 swp0Var2 = (swp0) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                ((odj0) obj3).U.getClass();
                k0w0Var4.h(new FragmentScreen() { // from class: org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        wid0.R1.getClass();
                        wid0 wid0Var = new wid0();
                        wid0Var.Q1.u(wid0Var, wid0.S1[1], swp0Var2);
                        return wid0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return "QrSendConfirmationMailFragment";
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case 10:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                ((c8d) k0w0Var5.h(iw20.f(((org.xplatform.settings.impl.presentation.a) obj3).q0, (nqh0) obj2)).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                return Unit.f46060a;
            case 11:
                org.xplatform.settings.impl.presentation.a aVar = (org.xplatform.settings.impl.presentation.a) obj3;
                uu4 uu4Var = (uu4) obj2;
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                p7m0 p7m0Var = aVar.X0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, caj0.a((caj0) value, false, false, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, 33554430)));
                aVar.B(th6, uu4Var);
                return Unit.f46060a;
            case 12:
                final swp0 swp0Var3 = (swp0) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                ((org.xplatform.settings.impl.presentation.a) obj3).G.getClass();
                k0w0Var6.h(new FragmentScreen() { // from class: org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        wid0.R1.getClass();
                        wid0 wid0Var = new wid0();
                        wid0Var.Q1.u(wid0Var, wid0.S1[1], swp0Var3);
                        return wid0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return "QrSendConfirmationMailFragment";
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case 13:
                ngj0 ngj0Var = (ngj0) obj3;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ngj0Var.H(new mej0((byte) 25));
                ngj0Var.Q(th7, (uu4) obj2);
                return Unit.f46060a;
            case 14:
                final swp0 swp0Var4 = (swp0) obj2;
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                ((ngj0) obj3).W.getClass();
                k0w0Var7.h(new FragmentScreen() { // from class: org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        wid0.R1.getClass();
                        wid0 wid0Var = new wid0();
                        wid0Var.Q1.u(wid0Var, wid0.S1[1], swp0Var4);
                        return wid0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return "QrSendConfirmationMailFragment";
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case 15:
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                ((c8d) k0w0Var8.h(iw20.f(((ngj0) obj3).D0, (nqh0) obj2)).f14945a).f3908a = new v7d(true, new bjk(null, false, false, true), cfx0.o);
                return Unit.f46060a;
            case 16:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new nej0(cpVar, (goi0) obj3, (nmo0) obj2, b2));
                return Unit.f46060a;
            case 17:
                StepInputUiModel stepInputUiModel = (StepInputUiModel) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                double d = ((txu) obj3).i;
                if (d > 0.0d) {
                    int i2 = cy7.f5159a;
                    pn40 pn40Var = pn40.f27267a;
                    pzw.E(bnk0Var, cy7.e(pn40.p(stepInputUiModel.f, d)), 0, R.color.static_green, 0, 0, 54);
                } else if (d < 0.0d) {
                    int i3 = cy7.f5159a;
                    pn40 pn40Var2 = pn40.f27267a;
                    pzw.E(bnk0Var, cy7.e(pn40.p(stepInputUiModel.f, d)), 0, 0, 0, 0, 62);
                }
                return Unit.f46060a;
            case 18:
                xxj0 xxj0Var = (xxj0) obj3;
                ((nb7) xxj0Var.I.f20392a.b).b = ((m97) obj).d;
                xxj0Var.q0.f(new tuj0(new xdk0(rek0.b, (String) obj2, null, null, jdk0.f16332a, null, 108)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ou90.F((ou90) obj, (pu90) obj3, 0, 0, ((gyj0) obj2).j1, 4);
                return Unit.f46060a;
            case 20:
                ((Function2) obj3).invoke((r370) obj2, (String) obj);
                return Unit.f46060a;
            case 21:
                ctf0 ctf0Var = (ctf0) obj2;
                z3k0 z3k0Var = (z3k0) obj;
                z3k0Var.getClass();
                h3m0 h3m0Var = ((x3k0) obj3).b;
                ctf0Var.getClass();
                if (h3m0Var.equals(g3m0.f10617a)) {
                    i = R.string.special_events_who_win_play_off;
                } else {
                    if (!h3m0Var.equals(f3m0.f8871a)) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.special_events_who_win_final;
                }
                if (z3k0Var.f43723a) {
                    String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
                    pz40 pz40Var = s6t0.f31722a;
                    hjmVar = new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186);
                }
                return new a4k0(hjmVar);
            case 22:
                jie0 jie0Var = (jie0) obj2;
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                hgk0 hgk0Var = (hgk0) i73Var.e;
                ((qah0) obj3).a(((Number) hgk0Var.getValue()).floatValue() - jie0Var.f16571a);
                jie0Var.f16571a = ((Number) hgk0Var.getValue()).floatValue();
                return Unit.f46060a;
            case 23:
                lik0 lik0Var = (lik0) obj3;
                cik0 cik0Var = (cik0) obj;
                cik0Var.getClass();
                cik0Var.b.setIconResource(lik0Var.b);
                cik0Var.c.setTitle(lik0Var.f20112a);
                cik0Var.f4420a.setOnClickListener(new bs50(obj2, (Object) lik0Var, (byte) 8));
                return Unit.f46060a;
            case 24:
                ((View) obj).getClass();
                ((wma0) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hyk0 hyk0Var = (hyk0) obj3;
                x4r x4rVar = (x4r) obj2;
                iiy[] iiyVarArr = hyk0.U1;
                ((View) obj).getClass();
                if (hyk0Var.n0().getCurrentFocus() != null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new b1(hyk0Var.o0(), x4rVar.c.getWindowToken(), new t32((byte) 28), b2), 0L);
                }
                tyk0 tyk0VarH0 = hyk0Var.H0();
                if (tyk0VarH0.w.a() && !tyk0VarH0.t.a()) {
                    tyk0VarH0.h.a(true);
                    sac.V(jiu0.a(tyk0VarH0), new gvj0(1, tyk0VarH0, tyk0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, tyk0VarH0.v.b, new syk0(tyk0VarH0, objArr2 == true ? 1 : 0, b3), 10);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                y3d y3dVar = (y3d) obj3;
                pz40 pz40Var2 = (pz40) obj2;
                ((kz3) obj).getClass();
                if (y3dVar != null) {
                    pz40Var2.setValue(new m78(y3dVar.f41946a, 5));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return SportCellMiddleView.a((SportCellMiddleView) obj3, (Context) obj2, (TypedArray) obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((View) obj).getClass();
                ((yj5) obj3).invoke(Integer.valueOf(((p3l0) ((cp) obj2).u()).f26304a));
                return Unit.f46060a;
            default:
                pz40 pz40Var3 = (pz40) obj3;
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                pz40Var3.setValue(Long.valueOf(((Number) pz40Var3.getValue()).longValue() + 1));
                ((ngk0) obj2).put("Filter", j6zVar);
                return Unit.f46060a;
        }
    }
}
