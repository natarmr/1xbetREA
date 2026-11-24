package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinChoiceView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ejk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7915a;

    public /* synthetic */ ejk0(byte b) {
        this.f7915a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7915a) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, R.drawable.ic_glyph_circle_warning);
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Boolean.TRUE;
            case 3:
                zmk0 zmk0Var = (zmk0) obj;
                zmk0Var.getClass();
                return zmk0Var.f44630a;
            case 4:
                w6k w6kVar = (w6k) obj;
                w6kVar.getClass();
                zcl zclVar = qmk.f28987a;
                long jT = w6kVar.T(8.0f);
                return new ikx((jT & 4294967295L) | (jT << 32));
            case 5:
                ((aqk0) obj).getClass();
                return Boolean.TRUE;
            case 6:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.x(new bb(cpVar, (byte) 18));
                cpVar.y(new bb(cpVar, (byte) 19));
                return Unit.f46060a;
            case 7:
                ttk0 ttk0Var = (ttk0) obj;
                ttk0Var.getClass();
                return vvw.J(ttk0Var.r);
            case 8:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.h(1);
                return Unit.f46060a;
            case 9:
                int i = SpinAndWinChoiceView.d;
                ((yxk0) obj).getClass();
                return Unit.f46060a;
            case 10:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 11:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 12:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 15:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(null, 0.0f, 3), kzn.e(null, 3));
            case 16:
                f1l0 f1l0Var = (f1l0) obj;
                f1l0Var.getClass();
                return sre0.f32672a.b(f1l0Var.getClass());
            case 17:
                a1l0 a1l0Var = (a1l0) obj;
                a1l0Var.getClass();
                return a1l0Var.getId();
            case 18:
                a1l0 a1l0Var2 = (a1l0) obj;
                a1l0Var2.getClass();
                return sre0.f32672a.b(a1l0Var2.getClass());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(null, 0.0f, 3), kzn.e(null, 3));
            case 20:
                i1l0 i1l0Var = (i1l0) obj;
                i1l0Var.getClass();
                if ((i1l0Var instanceof d1l0) || (i1l0Var instanceof e1l0)) {
                    return "Content";
                }
                if (i1l0Var instanceof g1l0) {
                    return "Error";
                }
                if (i1l0Var instanceof h1l0) {
                    return "Loading";
                }
                t9f.b();
                return null;
            case 21:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 22:
                ger0 ger0Var = (ger0) obj;
                ger0Var.getClass();
                return Long.valueOf(ger0Var.f11169a);
            case 23:
                ((ger0) obj).getClass();
                return sre0.f32672a.b(ger0.class);
            case 24:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 11, null, null, tke.d, 6);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, 11, null, null, x8f.d, 6);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.g(hczVar3, 10, null, null, saj.e, 6);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.g(hczVar4, 13, null, null, qjj.g, 6);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hcz.g(hczVar5, 13, null, null, eeq.m, 6);
                return Unit.f46060a;
            default:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hcz.g(hczVar6, 7, null, null, ntr.i, 6);
                return Unit.f46060a;
        }
    }
}
