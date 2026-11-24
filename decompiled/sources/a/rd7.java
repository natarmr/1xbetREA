package a;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackView;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rd7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30277a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rd7(Object obj, boolean z, byte b) {
        this.f30277a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SimpleDate simpleDateA;
        mz40 mz40VarI;
        List list;
        a4x a4xVar;
        byte b = this.f30277a;
        anf0 anf0Var = 0;
        boolean z = true;
        byte b2 = 0;
        boolean z2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((DsTextField) ((BetInputView) obj).r.d).g(z2);
                return Unit.f46060a;
            case 1:
                hdj hdjVar = (hdj) obj;
                if (!z2 || ((simpleDateA = hdjVar.a()) != null && (bsr0.W(simpleDateA, hdjVar.b) < 0 || bsr0.W(simpleDateA, hdjVar.c) > 0))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                int i = CashbackView.c;
                ((CashbackView) obj).a(false, z2);
                return Unit.f46060a;
            case 3:
                return Boolean.valueOf(!z2 && ((Number) ((l7m0) ((bzl) obj).f.getValue()).getValue()).floatValue() >= 0.5f);
            case 4:
                nyq0 nyq0Var = (nyq0) obj;
                if (nyq0Var.getState().a() != 1.0f && 1.0f - nyq0Var.getState().a() >= 0.01f && z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                e03 e03Var = (e03) obj;
                if (z2 && (mz40VarI = e03Var.i()) != null) {
                    ((qoj0) mz40VarI).g(Unit.f46060a);
                }
                return Unit.f46060a;
            case 6:
                r7f r7fVar = (r7f) obj;
                if (r7fVar.C1 == w4f.c && z2) {
                    r7fVar.Z();
                }
                return Unit.f46060a;
            case 7:
                egk0 egk0Var = (egk0) obj;
                if (!z2 && egk0Var.l() <= 5999000) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                ((kfp) obj).f(z2);
                return Unit.f46060a;
            case 9:
                return new cy00((String) obj, z2, true);
            case 10:
                d650 d650Var = (d650) obj;
                sac.V(jiu0.a(d650Var), new f340(1, d650Var, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, d650Var.L.b, new x550(d650Var, z2, anf0Var, b2), 10);
                return Unit.f46060a;
            case 11:
                p850 p850Var = (p850) obj;
                sac.V(jiu0.a(p850Var), new r750(1, p850Var, p850.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, p850Var.p.b, new l850(p850Var, z2, anf0Var, b2), 10);
                return Unit.f46060a;
            case 12:
                r790 r790Var = (r790) obj;
                xi70 xi70Var = r790.Z1;
                if (z2) {
                    kxq kxqVarN0 = r790Var.n0();
                    Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                    kxqVarN0.startActivityForResult(intentJ, 555);
                } else {
                    qog0 qog0Var = (qog0) r790Var.P1.getValue();
                    if (qog0Var != null) {
                        qog0Var.f29072a.add(new lz9(qog0Var, r790Var, (byte) 4));
                        qog0Var.a();
                    }
                }
                return Unit.f46060a;
            case 13:
                o890 o890Var = (o890) obj;
                jh70 jh70Var = o890.f2;
                if (z2) {
                    kxq kxqVarN1 = o890Var.n0();
                    Intent intentJ2 = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ2.setData(Uri.fromParts("package", kxqVarN1.getPackageName(), null));
                    kxqVarN1.startActivityForResult(intentJ2, 555);
                } else {
                    o890Var.G0();
                }
                return Unit.f46060a;
            case 14:
                g9b0 g9b0Var = (g9b0) obj;
                g9b0Var.G(z2);
                g9b0Var.A(s8b0.f31793a);
                return Unit.f46060a;
            case 15:
                hde0 hde0Var = (hde0) obj;
                p7m0 p7m0Var = hde0Var.j;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                hde0Var.w(z2);
                return Unit.f46060a;
            case 16:
                xcz xczVar = (xcz) obj;
                if (!xczVar.j.a() && !z2 && !xczVar.d() && !xczVar.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                k4g0 k4g0Var = (k4g0) obj;
                if (z2) {
                    enf0 enf0Var = ((y3g0) k4g0Var.D()).d;
                    anf0Var = enf0Var instanceof anf0 ? (anf0) enf0Var : 0;
                    if (anf0Var == 0 || (list = anf0Var.f1149a) == null || !(!list.isEmpty())) {
                        z = false;
                    }
                } else {
                    z = ((y3g0) k4g0Var.D()).d instanceof anf0;
                }
                return Boolean.valueOf(z);
            case 18:
                w5j0 w5j0Var = (w5j0) obj;
                w5j0Var.J(new x2j0(z2));
                ((vwb0) ((ywu) w5j0Var.l.f6958a.f27640a).c).e("PREF_IS_QUICK_BETS_ENABLED", z2);
                dyb.u0();
                return Boolean.TRUE;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                oyj0 oyj0Var = (oyj0) obj;
                gle0 gle0Var = oyj0.U1;
                if (z2) {
                    wyj0 wyj0VarH0 = oyj0Var.H0();
                    wyj0VarH0.x.c("toto");
                    wyj0VarH0.y.i("toto");
                    oyj0Var.G0().e.clearFocus();
                    ynb ynbVar = oyj0Var.P1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.l;
                    androidx.fragment.app.e eVarC = oyj0Var.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else {
                    wyj0 wyj0VarH1 = oyj0Var.H0();
                    wyj0VarH1.z.f(k7k.Toto);
                    l7k l7kVar = wyj0VarH1.A;
                    y1p y1pVar = y1p.MAIN;
                    l7kVar.b("toto", wyj0VarH1.B.g());
                    sac.V(jiu0.a(wyj0VarH1), new pyj0(wyj0VarH1, b2), null, null, new myj0(wyj0VarH1, null), 14);
                }
                return Unit.f46060a;
            case 20:
                xpl0 xpl0Var = (xpl0) obj;
                if (z2) {
                    dnf0 dnf0Var = ((hpl0) xpl0Var.D()).f;
                    zmf0 zmf0Var = dnf0Var instanceof zmf0 ? (zmf0) dnf0Var : null;
                    if (zmf0Var == null || (a4xVar = zmf0Var.f44624a) == null || !(!a4xVar.isEmpty())) {
                        z = false;
                    }
                } else {
                    z = ((hpl0) xpl0Var.D()).f instanceof zmf0;
                }
                return Boolean.valueOf(z);
            case 21:
                return Boolean.valueOf(!z2 && ((e2d) obj).f7077a.a() >= 0.5f);
            case 22:
                return Float.valueOf(z2 ? 1.0f : ((oyq0) obj).a());
            default:
                ((ywv0) obj).e.g = z2;
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rd7(boolean z, Object obj, byte b) {
        this.f30277a = b;
        this.b = z;
        this.c = obj;
    }
}
