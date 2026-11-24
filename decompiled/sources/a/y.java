package a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.account_info.DsAccountInfo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41777a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ y(Function0 function0, byte b) {
        this.f41777a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41777a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                int i = DsAccordion.c;
                DsAccordion dsAccordionZ = obb.Z(context, dc.f5825a);
                dsAccordionZ.setId(jmu0.d());
                dsAccordionZ.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                dsAccordionZ.setOnClickListener(new c0(function0, (byte) 0));
                return dsAccordionZ;
            case 1:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 2:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 3:
                DsAccountInfo dsAccountInfo = (DsAccountInfo) obj;
                dsAccountInfo.getClass();
                dsAccountInfo.setButtonClickListener(new c0(function0, (byte) 1));
                return Unit.f46060a;
            case 4:
                if (((Integer) obj).intValue() == 1) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 5:
                ((kz3) obj).getClass();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 6:
                ((iz3) obj).getClass();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 7:
                ((uag0) obj).b(((Number) function0.invoke()).floatValue());
                return Unit.f46060a;
            case 8:
                int i2 = BetInputView.v;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 9:
                if (((Integer) obj).intValue() == 0) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 10:
                ((w6k) obj).getClass();
                return new ikx(((long) si30.b(((Number) function0.invoke()).floatValue())) & 4294967295L);
            case 11:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                float fO = l7x.O(1.08f, 0.88f, ((Number) function0.invoke()).floatValue());
                uag0Var.w(fO);
                uag0Var.y(fO);
                uag0Var.I(Float.intBitsToFloat((int) (uag0Var.r & 4294967295L)) * 0.32f);
                uag0Var.G(osm0.e(0.5f, 0.68f));
                return Unit.f46060a;
            case 12:
                ((w6k) obj).getClass();
                return new ikx(((long) si30.b(((Number) function0.invoke()).floatValue())) & 4294967295L);
            case 13:
                ((w6k) obj).getClass();
                return new ikx(((long) si30.b(((Number) function0.invoke()).floatValue())) & 4294967295L);
            case 14:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.I(uag0Var2.t.getDensity() * u18.i * (-((Number) function0.invoke()).floatValue()));
                return Unit.f46060a;
            case 15:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.d(abi0Var, new g3c0(((Number) function0.invoke()).floatValue(), new cvc(0.0f, 1.0f)));
                return Unit.f46060a;
            case 16:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.f46060a;
            case 17:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case 18:
                uag0 uag0Var4 = (uag0) obj;
                uag0Var4.getClass();
                uag0Var4.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uag0 uag0Var5 = (uag0) obj;
                uag0Var5.getClass();
                uag0Var5.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case 20:
                uag0 uag0Var6 = (uag0) obj;
                uag0Var6.getClass();
                uag0Var6.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case 21:
                uag0 uag0Var7 = (uag0) obj;
                uag0Var7.getClass();
                uag0Var7.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case 22:
                uag0 uag0Var8 = (uag0) obj;
                uag0Var8.getClass();
                float fC = l1e0.c((0.65f - ((Number) function0.invoke()).floatValue()) / 0.65f, 0.0f, 1.0f);
                uag0Var8.b(fC * fC);
                return Unit.f46060a;
            case 23:
                uag0 uag0Var9 = (uag0) obj;
                uag0Var9.getClass();
                uag0Var9.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case 24:
                uag0 uag0Var10 = (uag0) obj;
                uag0Var10.getClass();
                uag0Var10.b(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uag0 uag0Var11 = (uag0) obj;
                uag0Var11.getClass();
                uag0Var11.b(((Number) function0.invoke()).floatValue());
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Boolean) obj).booleanValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function0.invoke();
                return Unit.f46060a;
            default:
                function0.invoke();
                return Unit.f46060a;
        }
    }
}
