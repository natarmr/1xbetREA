package a;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.AuthenticatorFilterViewModel$ViewModelState;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f8 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f9083a = b;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0323  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        ContentCaptureSession contentCaptureSessionG;
        Object value;
        CoefStepInputUiModel coefStepInputUiModel;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalAdd;
        Object value2;
        CoefStepInputUiModel coefStepInputUiModel2;
        BigDecimal bigDecimalSubtract;
        byte b = this.f9083a;
        sm4 sm4Var = sm4.f32427a;
        byte b2 = 4;
        boolean z2 = true;
        byte b3 = 0;
        ?? r10 = 0;
        switch (b) {
            case 0:
                ((ab) this.receiver).D();
                return Unit.f46060a;
            case 1:
                ((ab) this.receiver).D();
                return Unit.f46060a;
            case 2:
                ((ab) this.receiver).D();
                return Unit.f46060a;
            case 3:
                ((ab) this.receiver).D();
                return Unit.f46060a;
            case 4:
                ((f20) this.receiver).z();
                return Unit.f46060a;
            case 5:
                ((f20) this.receiver).A();
                return Unit.f46060a;
            case 6:
                return ((q21) this.receiver).p0();
            case 7:
                v51 v51Var = (v51) this.receiver;
                qek0 qek0Var = v51.a2;
                lr1 lr1Var = (lr1) v51Var.H0().f.e.getValue();
                if (!Intrinsics.d(lr1Var, ir1.c)) {
                    ehf0 ehf0Var = v51Var.O1;
                    if (ehf0Var == null) {
                        Intrinsics.h("aggregatorScreenUtils");
                        throw null;
                    }
                    FragmentScreen fragmentScreenW = ehf0Var.w(lr1Var.b, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), true);
                    m1r m1rVarS = v51Var.C().S();
                    m1rVarS.getClass();
                    Fragment fragmentA = fragmentScreenW.a(m1rVarS);
                    Class<?> cls = fragmentA != null ? fragmentA.getClass() : null;
                    if (cls != null) {
                        Fragment fragmentI = v51Var.C().I(R.id.fragmentContainer);
                        z = Intrinsics.d(fragmentI != null ? fragmentI.getClass() : 0, cls);
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    e7.m(view);
                }
                if (i < 29 || (contentCaptureSessionG = sf3.g(view)) == null) {
                    return null;
                }
                return new chf0((Object) contentCaptureSessionG, (Object) view, (byte) 22);
            case 9:
                ((lc3) this.receiver).a();
                return Unit.f46060a;
            case 10:
                ((lc3) this.receiver).f();
                return Unit.f46060a;
            case 11:
                ApplicationActivity applicationActivity = (ApplicationActivity) this.receiver;
                int i2 = ApplicationActivity.F1;
                if (!applicationActivity.isFinishing() && !applicationActivity.isDestroyed() && !applicationActivity.isChangingConfigurations()) {
                    ndk0 ndk0Var = applicationActivity.A1;
                    applicationActivity.A1 = ndk0Var != null ? applicationActivity.H(ndk0Var) : null;
                    ndk0 ndk0Var2 = applicationActivity.B1;
                    applicationActivity.B1 = ndk0Var2 != null ? applicationActivity.H(ndk0Var2) : null;
                    ndk0 ndk0Var3 = applicationActivity.C1;
                    applicationActivity.C1 = ndk0Var3 != null ? applicationActivity.H(ndk0Var3) : null;
                    ndk0 ndk0Var4 = applicationActivity.D1;
                    applicationActivity.D1 = ndk0Var4 != null ? applicationActivity.H(ndk0Var4) : null;
                }
                return Unit.f46060a;
            case 12:
                ((Function0) this.receiver).invoke();
                return Unit.f46060a;
            case 13:
                ((im4) this.receiver).g(sm4Var);
                return Unit.f46060a;
            case 14:
                ((im4) this.receiver).g(sm4Var);
                return Unit.f46060a;
            case 15:
                ku4 ku4Var = (ku4) this.receiver;
                i8i.D("action", "off", ku4Var.p.f42966a, "authenticator_off_alert_click");
                b1j.v("off", ku4Var.u.f44833a, 3343L);
                ku4Var.q.e(Boolean.TRUE, "authenticatorChangedResultKey");
                sac.V(jiu0.a(ku4Var), new it4(ku4Var, (byte) 2), new lt4(ku4Var, z2 ? 1 : 0), null, new au4(ku4Var, r10, b3), 12);
                return Unit.f46060a;
            case 16:
                ku4 ku4Var2 = (ku4) this.receiver;
                i8i.D("action", "cancel", ku4Var2.p.f42966a, "authenticator_off_alert_click");
                b1j.v("cancel", ku4Var2.u.f44833a, 3343L);
                return Unit.f46060a;
            case 17:
                qp4 qp4Var = (qp4) this.receiver;
                hfk0 hfk0Var = qp4.R1;
                qp4Var.getClass();
                pek0 pek0Var = cr4.n2;
                androidx.fragment.app.e eVarC = qp4Var.C();
                eVarC.getClass();
                pek0Var.getClass();
                String str = cr4.p2;
                if (eVarC.J(str) == null) {
                    cr4 cr4Var = new cr4();
                    cr4Var.k2.x(cr4Var, cr4.o2[0], "KEY_OPTIONS_TYPE");
                    cr4Var.H0(eVarC, str);
                }
                return Unit.f46060a;
            case 18:
                cq4 cq4Var = (cq4) this.receiver;
                zj2 zj2Var = cq4Var.c;
                zj2Var.getClass();
                AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState = (AuthenticatorFilterViewModel$ViewModelState) zj2Var.getValue();
                authenticatorFilterViewModel$ViewModelState.getClass();
                zj2Var.f(AuthenticatorFilterViewModel$ViewModelState.a(authenticatorFilterViewModel$ViewModelState, c860.ALL, NotificationPeriodInfo.a(authenticatorFilterViewModel$ViewModelState.b, q760.ALL_TIME, null, 0L, 2), 4));
                ol60 ol60Var = cq4Var.d;
                zj2 zj2Var2 = cq4Var.c;
                ol60Var.f(new xp4(((AuthenticatorFilterViewModel$ViewModelState) zj2Var2.getValue()).f46352a, ((AuthenticatorFilterViewModel$ViewModelState) zj2Var2.getValue()).b));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cq4 cq4Var2 = (cq4) this.receiver;
                ol60 ol60Var2 = cq4Var2.d;
                zj2 zj2Var3 = cq4Var2.c;
                ol60Var2.f(new xp4(((AuthenticatorFilterViewModel$ViewModelState) zj2Var3.getValue()).f46352a, ((AuthenticatorFilterViewModel$ViewModelState) zj2Var3.getValue()).b));
                return Unit.f46060a;
            case 20:
                ((hl60) this.receiver).A();
                return Unit.f46060a;
            case 21:
                zr4 zr4Var = (zr4) this.receiver;
                zr4Var.getClass();
                sac.V(jiu0.a(zr4Var), yr4.f43104a, null, null, new qv3(zr4Var, r10, b2), 14);
                return Unit.f46060a;
            case 22:
                ((ku4) this.receiver).w();
                return Unit.f46060a;
            case 23:
                ku4 ku4Var3 = (ku4) this.receiver;
                p7m0 p7m0Var = ku4Var3.y;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                ku4Var3.A(true);
                return Unit.f46060a;
            case 24:
                ((ku4) this.receiver).D();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((ku4) this.receiver).A(false);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((fy4) this.receiver).E();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fy4 fy4Var = (fy4) this.receiver;
                ih5 ih5Var = fy4Var.H;
                ms2 ms2Var = fy4Var.A;
                ms2Var.getClass();
                boolean z3 = ms2Var instanceof vq2;
                ih5Var.f(z3 ? k7k.NoMoneyPlayerDuel : k7k.NoMoneyPlacementBet);
                fy4Var.I.b((z3 ? y1p.NO_MONEY_PLAYER_DUEL : y1p.NO_MONEY_PLACEMENT_BET).f41868a, fy4Var.R.g());
                sac.V(jiu0.a(fy4Var), new sx4(fy4Var, b2), null, fy4Var.g.f22085a, new ac4(fy4Var, null), 10);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p7m0 p7m0Var2 = ((fy4) this.receiver).b0;
                do {
                    value = p7m0Var2.getValue();
                    coefStepInputUiModel = (CoefStepInputUiModel) value;
                    BigDecimal bigDecimal2 = coefStepInputUiModel.f46771a;
                    bigDecimal = coefStepInputUiModel.d;
                    BigDecimal bigDecimal3 = coefStepInputUiModel.c;
                    if (bigDecimal2.compareTo(bigDecimal) < 0) {
                        bigDecimalAdd = bigDecimal;
                    } else if (bigDecimal2.scale() == 1 || bigDecimal2.scale() == 0) {
                        bigDecimalAdd = bigDecimal2.add(bigDecimal3);
                        bigDecimalAdd.getClass();
                    } else {
                        bigDecimalAdd = bigDecimal2.setScale(1, RoundingMode.FLOOR).add(bigDecimal3);
                        bigDecimalAdd.getClass();
                    }
                } while (!p7m0Var2.m(value, CoefStepInputUiModel.a(coefStepInputUiModel, fy4.w(bigDecimalAdd, coefStepInputUiModel), null, false, bigDecimalAdd.compareTo(coefStepInputUiModel.e) > 0, bigDecimalAdd.compareTo(bigDecimal) < 0, false, 286)));
                return Unit.f46060a;
            default:
                p7m0 p7m0Var3 = ((fy4) this.receiver).b0;
                do {
                    value2 = p7m0Var3.getValue();
                    coefStepInputUiModel2 = (CoefStepInputUiModel) value2;
                    BigDecimal bigDecimal4 = coefStepInputUiModel2.f46771a;
                    BigDecimal bigDecimal5 = coefStepInputUiModel2.c;
                    int iScale = bigDecimal4.scale();
                    BigDecimal bigDecimal6 = coefStepInputUiModel2.f46771a;
                    if (iScale == 1) {
                        bigDecimalSubtract = bigDecimal6.subtract(bigDecimal5);
                        bigDecimalSubtract.getClass();
                    } else {
                        bigDecimalSubtract = bigDecimal6.setScale(1, RoundingMode.CEILING).subtract(bigDecimal5);
                        bigDecimalSubtract.getClass();
                    }
                } while (!p7m0Var3.m(value2, CoefStepInputUiModel.a(coefStepInputUiModel2, fy4.w(bigDecimalSubtract, coefStepInputUiModel2), null, false, bigDecimalSubtract.compareTo(coefStepInputUiModel2.e) > 0, bigDecimalSubtract.compareTo(coefStepInputUiModel2.d) < 0, false, 286)));
                return Unit.f46060a;
        }
    }
}
