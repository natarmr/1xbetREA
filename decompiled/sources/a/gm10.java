package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gm10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11521a;

    public /* synthetic */ gm10(byte b) {
        this.f11521a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11521a) {
            case 0:
                ((Integer) obj2).getClass();
                km10.a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                co10 co10Var = (co10) obj2;
                co10Var.getClass();
                return iIntValue + BundleUtil.UNDERLINE_TAG + co10Var.f4680a.f4905a.f3145a;
            case 2:
                ((Integer) obj2).getClass();
                km10.c(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.mailing_text_switcher_ui_kit_item, viewGroup, false);
                int i = R.id.cellTitle;
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.cellTitle);
                if (dsCellMiddleTitle != null) {
                    i = R.id.switchView;
                    DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewF, R.id.switchView);
                    if (dsCellRightSwitch != null) {
                        return new er10((DsSettingsCell) viewF, dsCellMiddleTitle, dsCellRightSwitch);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 4:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_main_description, viewGroup2, false);
                if (viewF2 != null) {
                    return new gwx((TextView) viewF2);
                }
                hny.u("rootView");
                return null;
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 6:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 7:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 8:
                v020 v020Var = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var.getClass();
                ehm0 ehm0Var = v020Var.r;
                return v020.a(v020Var, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, ehm0.a(ehm0Var, !ehm0Var.f7815a, 0, null, 14), null, null, null, null, 8257535);
            case 9:
                v020 v020Var2 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var2.getClass();
                ehm0 ehm0Var2 = v020Var2.n;
                return v020.a(v020Var2, false, false, 0L, false, 0, null, null, null, null, null, null, ehm0.a(ehm0Var2, !ehm0Var2.f7815a, 0, null, 14), null, null, null, null, null, null, null, null, 8380415);
            case 10:
                v020 v020Var3 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var3.getClass();
                ehm0 ehm0Var3 = v020Var3.t;
                return v020.a(v020Var3, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, ehm0.a(ehm0Var3, !ehm0Var3.f7815a, 0, null, 14), null, null, 7864319);
            case 11:
                v020 v020Var4 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var4.getClass();
                ehm0 ehm0Var4 = v020Var4.m;
                return v020.a(v020Var4, false, false, 0L, false, 0, null, null, null, null, null, ehm0.a(ehm0Var4, !ehm0Var4.f7815a, 0, null, 14), null, null, null, null, null, null, null, null, null, 8384511);
            case 12:
                v020 v020Var5 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var5.getClass();
                ehm0 ehm0Var5 = v020Var5.s;
                return v020.a(v020Var5, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, null, ehm0.a(ehm0Var5, !ehm0Var5.f7815a, 0, null, 14), null, null, null, 8126463);
            case 13:
                v020 v020Var6 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var6.getClass();
                ehm0 ehm0Var6 = v020Var6.u;
                return v020.a(v020Var6, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, ehm0.a(ehm0Var6, !ehm0Var6.f7815a, 0, null, 14), null, 7340031);
            case 14:
                v020 v020Var7 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var7.getClass();
                ehm0 ehm0Var7 = v020Var7.p;
                return v020.a(v020Var7, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, ehm0.a(ehm0Var7, !ehm0Var7.f7815a, 0, null, 14), null, null, null, null, null, null, 8355839);
            case 15:
                v020 v020Var8 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var8.getClass();
                return v020.a(v020Var8, false, false, 0L, false, 0, null, null, null, null, null, ehm0.a(v020Var8.m, false, 0, null, 13), null, null, null, null, null, null, null, null, null, 8384511);
            case 16:
                v020 v020Var9 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var9.getClass();
                return v020.a(v020Var9, false, false, 0L, false, 0, null, null, null, null, null, null, ehm0.a(v020Var9.n, false, 0, null, 13), null, null, null, null, null, null, null, null, 8380415);
            case 17:
                v020 v020Var10 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var10.getClass();
                return v020.a(v020Var10, false, false, 0L, false, 0, null, null, null, null, null, null, null, na00.a(v020Var10.o, null, 0, 0L, 0L, false, false, 0L, 383), null, null, null, null, null, null, null, 8372223);
            case 18:
                v020 v020Var11 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var11.getClass();
                na00 na00Var = v020Var11.o;
                iun iunVar = iun.f15405a;
                return v020.a(v020Var11, false, false, 0L, false, 0, null, null, null, null, null, null, null, na00.a(na00Var, new l800(0, iunVar, iunVar, iunVar), 0, 0L, 0L, false, false, 0L, 462), null, null, null, null, null, null, null, 8372223);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_main_title, viewGroup3, false);
                if (viewF3 != null) {
                    return new hwx((TextView) viewF3);
                }
                hny.u("rootView");
                return null;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 23:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            default:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
        }
    }
}
