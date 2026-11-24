package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29805a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ r3w(Function0 function0, byte b) {
        this.f29805a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ky2 ky2VarA;
        byte b = this.f29805a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                Object objInvoke = function0.invoke();
                Float f = (Float) (Float.isNaN(((Number) objInvoke).floatValue()) ? null : objInvoke);
                yai0.d(abi0Var, new g3c0(f != null ? f.floatValue() : 0.0f, new cvc(0.0f, 1.0f)));
                return Unit.f46060a;
            case 1:
                function0.invoke();
                return Boolean.FALSE;
            case 2:
                int i = LottieView.o1;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 3:
                ((String) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 4:
                int i2 = MakeBetBalanceView.b;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 5:
                int i3 = MakeBetBalanceView.b;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 6:
                int i4 = MakeBetBalanceViewDs.t;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 7:
                int i5 = MatchInfoTabsContainerView.e;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 8:
                int i6 = MatchInfoTabsContainerView.e;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 9:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 10:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 11:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 12:
                function0.invoke();
                return Unit.f46060a;
            case 13:
                function0.invoke();
                return Unit.f46060a;
            case 14:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                if (((Boolean) function0.invoke()).booleanValue()) {
                    oie.f25306a.getClass();
                    ky2VarA = mie.b.a(mie.d);
                } else {
                    oie.f25306a.getClass();
                    ky2VarA = mie.k.a(mie.l).a(mie.m);
                }
                yai0.c(abi0Var2, ky2VarA);
                return Unit.f46060a;
            case 15:
                if (((Integer) obj).intValue() == 0) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 16:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 17:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 18:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                abi0 abi0Var3 = (abi0) obj;
                Object objInvoke2 = function0.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) objInvoke2).floatValue()) ? null : objInvoke2);
                yai0.d(abi0Var3, new g3c0(f2 != null ? f2.floatValue() : 0.0f, new cvc(0.0f, 1.0f)));
                return Unit.f46060a;
            case 20:
                abi0 abi0Var4 = (abi0) obj;
                Object objInvoke3 = function0.invoke();
                Float f3 = (Float) (Float.isNaN(((Number) objInvoke3).floatValue()) ? null : objInvoke3);
                yai0.d(abi0Var4, new g3c0(f3 != null ? f3.floatValue() : 0.0f, new cvc(0.0f, 1.0f)));
                return Unit.f46060a;
            case 21:
                ((jtl) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 22:
                ((jtl) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 23:
                if (((Integer) obj).intValue() == 0) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 24:
                ((Integer) obj).intValue();
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                obj.getClass();
                return function0.invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Boolean) obj).booleanValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Boolean) obj).booleanValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Boolean) obj).booleanValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            default:
                ((iz3) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
        }
    }
}
