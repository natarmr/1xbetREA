package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ndn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23343a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndn0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f23343a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kuw kuwVar;
        switch (this.f23343a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((rdn0) this.receiver).M(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((rdn0) this.receiver).M(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((ren0) this.receiver).M(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((ren0) this.receiver).M(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((ren0) this.receiver).M(th5);
                return Unit.f46060a;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((ren0) this.receiver).M(th6);
                return Unit.f46060a;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((ven0) this.receiver).M(th7);
                return Unit.f46060a;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((ven0) this.receiver).M(th8);
                return Unit.f46060a;
            case 8:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                sgn0 sgn0Var = (sgn0) this.receiver;
                duj dujVar = sgn0Var.u;
                if ((th9 instanceof zhi0) && ((kuwVar = ((zhi0) th9).c) == i2o.BetFromAnotherUser || kuwVar == i2o.SavedCouponsLimit)) {
                    dujVar.b(th9, new abn0(sgn0Var, (byte) 5));
                } else {
                    dujVar.b(th9, new was0(th9, (byte) 1));
                }
                return Unit.f46060a;
            case 9:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                mkn0 mkn0Var = (mkn0) this.receiver;
                mkn0Var.t.b(th10, new abn0(mkn0Var, (byte) 9));
                return Unit.f46060a;
            case 10:
                unn0 unn0Var = (unn0) obj;
                unn0Var.getClass();
                snn0 snn0Var = (snn0) this.receiver;
                j6m0 j6m0Var = snn0.n2;
                snn0Var.getClass();
                if (Intrinsics.d(unn0Var, unn0.f35972a)) {
                    snn0Var.y0();
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 11:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((arn0) this.receiver).w(th11);
                return Unit.f46060a;
            case 12:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((arn0) this.receiver).w(th12);
                return Unit.f46060a;
            case 13:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((arn0) this.receiver).w(th13);
                return Unit.f46060a;
            case 14:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((arn0) this.receiver).w(th14);
                return Unit.f46060a;
            case 15:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((arn0) this.receiver).w(th15);
                return Unit.f46060a;
            case 16:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((arn0) this.receiver).w(th16);
                return Unit.f46060a;
            case 17:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((duj) this.receiver).a(th17);
                return Unit.f46060a;
            case 18:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((duj) this.receiver).a(th18);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((duj) this.receiver).a(th19);
                return Unit.f46060a;
            case 20:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ((duj) this.receiver).a(th20);
                return Unit.f46060a;
            case 21:
                x6t0 x6t0Var = (x6t0) obj;
                x6t0Var.getClass();
                tun0 tun0Var = (tun0) this.receiver;
                y2m0 y2m0Var = tun0.P1;
                tun0Var.getClass();
                if (!(x6t0Var instanceof x6t0)) {
                    t9f.b();
                    return null;
                }
                ii iiVar = ((vvi) tun0Var.L1.getValue()).f38100a;
                String strH = tun0Var.H(R.string.attention);
                String strH2 = tun0Var.H(R.string.swipe_x_doesnt_have_events);
                String strH3 = tun0Var.H(R.string.ok);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "CHANGE_FILTERS_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                androidx.fragment.app.e eVarC = tun0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
            case 22:
                ovn0 ovn0Var = (ovn0) obj;
                ovn0Var.getClass();
                ((k3t0) this.receiver).x(ovn0Var);
                return Unit.f46060a;
            case 23:
                gsn0 gsn0Var = (gsn0) obj;
                gsn0Var.getClass();
                ((k3t0) this.receiver).x(gsn0Var);
                return Unit.f46060a;
            case 24:
                Object objF = ((m0o0) this.receiver).f((yje) obj);
                return objF == wne.f39444a ? objF : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                h7o0 h7o0Var = (h7o0) obj;
                h7o0Var.getClass();
                d7o0 d7o0Var = (d7o0) this.receiver;
                s9m0 s9m0Var = d7o0.R1;
                wdk0 wdk0Var = d7o0Var.N1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var, new xdk0(rek0.b, h7o0Var.f12586a, null, null, null, null, 124), d7o0Var, null, null, false, null, 1020);
                d7o0Var.G0().x(p6o0.f26466a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                prk0 prk0Var = (prk0) obj;
                prk0Var.getClass();
                ((k3t0) this.receiver).x(prk0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                zco0 zco0Var = (zco0) this.receiver;
                zco0Var.p.b(th21, new abn0(zco0Var, (byte) 14));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th22 = (Throwable) obj;
                th22.getClass();
                zco0 zco0Var2 = (zco0) this.receiver;
                zco0Var2.c0.f(th22, new ttn0(zco0Var2, (byte) 6));
                return Unit.f46060a;
            default:
                jeo0 jeo0Var = (jeo0) obj;
                jeo0Var.getClass();
                ((k3t0) this.receiver).x(jeo0Var);
                return Unit.f46060a;
        }
    }
}
