package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cjl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4465a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ cjl(Function0 function0, byte b) {
        this.f4465a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4465a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                int i = DsAccountSelection.z;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 1:
                int i2 = DsAccountSelection.z;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 2:
                int i3 = DsAccountSelection.z;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 3:
                int i4 = DsAccountSelection.z;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 4:
                int i5 = DsBottomBar.v;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 5:
                int i6 = DsBottomBar.v;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 6:
                int i7 = DsBottomBar.v;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 7:
                ((Integer) obj).intValue();
                function0.invoke();
                return Unit.f46060a;
            case 8:
                ((Integer) obj).intValue();
                function0.invoke();
                return Unit.f46060a;
            case 9:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 10:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(1.0f - l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case 11:
                ((String) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 12:
                ((String) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 13:
                ((String) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 14:
                ((Integer) obj).intValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 15:
                int i8 = DsLottieEmpty.t;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 16:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                if (((Number) function0.invoke()).floatValue() > 0.0f) {
                    yai0.d(abi0Var, new g3c0(((Number) function0.invoke()).floatValue(), new cvc(0.0f, 1.0f)));
                }
                return Unit.f46060a;
            case 17:
                ((jly) obj).getClass();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 18:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 20:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 21:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 22:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 23:
                ((w6k) obj).getClass();
                return new ikx(((long) si30.b(((Number) function0.invoke()).floatValue())) << 32);
            case 24:
                gvn gvnVar = (gvn) obj;
                gvnVar.getClass();
                gvnVar.f11983a.setButtonOnClickListener(new dbn(function0, (byte) 2));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((wgl0) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((mvl) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((mvl) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
        }
    }
}
