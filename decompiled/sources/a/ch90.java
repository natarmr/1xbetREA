package a;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightMediumLabel;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ch90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4349a;

    public /* synthetic */ ch90(int i) {
        this.f4349a = (byte) 29;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4349a;
        int i = R.id.scItem;
        switch (b) {
            case 0:
                wb00 wb00Var = (wb00) obj2;
                wb00Var.getClass();
                return Boolean.valueOf(Intrinsics.d(obj, wb00Var.f38853a));
            case 1:
                wb00 wb00Var2 = (wb00) obj2;
                wb00Var2.getClass();
                return Boolean.valueOf(Intrinsics.d(obj, wb00Var2.f38853a));
            case 2:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 3:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 4:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 5:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 6:
                wb00 wb00Var3 = (wb00) obj2;
                wb00Var3.getClass();
                return Boolean.valueOf(Intrinsics.d(obj, wb00Var3.f38853a));
            case 7:
                wb00 wb00Var4 = (wb00) obj2;
                wb00Var4.getClass();
                return Boolean.valueOf(Intrinsics.d(obj, wb00Var4.f38853a));
            case 8:
                wb00 wb00Var5 = (wb00) obj;
                wb00 wb00Var6 = (wb00) obj2;
                wb00Var5.getClass();
                wb00Var6.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var5.f38853a, wb00Var6.f38853a));
            case 9:
                wb00 wb00Var7 = (wb00) obj;
                wb00 wb00Var8 = (wb00) obj2;
                wb00Var7.getClass();
                wb00Var8.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var7.f38853a, wb00Var8.f38853a));
            case 10:
                wb00 wb00Var9 = (wb00) obj;
                wb00Var9.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var9.f38853a, obj2));
            case 11:
                wb00 wb00Var10 = (wb00) obj;
                wb00Var10.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var10.f38853a, obj2));
            case 12:
                wb00 wb00Var11 = (wb00) obj;
                wb00 wb00Var12 = (wb00) obj2;
                wb00Var11.getClass();
                wb00Var12.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var11.f38853a, wb00Var12.f38853a));
            case 13:
                wb00 wb00Var13 = (wb00) obj;
                wb00 wb00Var14 = (wb00) obj2;
                wb00Var13.getClass();
                wb00Var14.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var13.f38853a, wb00Var14.f38853a));
            case 14:
                wb00 wb00Var15 = (wb00) obj;
                wb00Var15.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var15.f38853a, obj2));
            case 15:
                wb00 wb00Var16 = (wb00) obj;
                wb00Var16.getClass();
                return Boolean.valueOf(Intrinsics.d(wb00Var16.f38853a, obj2));
            case 16:
                ((yb00) obj).getClass();
                ((yb00) obj2).getClass();
                return Boolean.TRUE;
            case 17:
                ((yb00) obj).getClass();
                ((yb00) obj2).getClass();
                return Boolean.TRUE;
            case 18:
                ((yb00) obj).getClass();
                ((yb00) obj2).getClass();
                return Boolean.TRUE;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((yb00) obj).getClass();
                ((yb00) obj2).getClass();
                return Boolean.TRUE;
            case 20:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.personal_data_action_item_layout, viewGroup, false);
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.cmtTitle);
                if (dsCellMiddleTitle != null) {
                    DsCellRightMediumLabel dsCellRightMediumLabel = (DsCellRightMediumLabel) yum0.f(viewF, R.id.crlAction);
                    if (dsCellRightMediumLabel != null) {
                        DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(viewF, R.id.scItem);
                        if (dsSettingsCell != null) {
                            return new si90((FrameLayout) viewF, dsCellMiddleTitle, dsCellRightMediumLabel, dsSettingsCell);
                        }
                    } else {
                        i = R.id.crlAction;
                    }
                } else {
                    i = R.id.cmtTitle;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 21:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.personal_data_button_item_layout, viewGroup2, false);
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF2, R.id.cliIcon);
                if (dsCellLeftIcon != null) {
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF2, R.id.cmtTitle);
                    if (dsCellMiddleTitle2 != null) {
                        DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(viewF2, R.id.scItem);
                        if (dsSettingsCell2 != null) {
                            return new vi90((FrameLayout) viewF2, dsCellLeftIcon, dsCellMiddleTitle2, dsSettingsCell2);
                        }
                    } else {
                        i = R.id.cmtTitle;
                    }
                } else {
                    i = R.id.cliIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 22:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.personal_data_header_layout, viewGroup3, false);
                DsHeader dsHeader = (DsHeader) yum0.f(viewF3, R.id.header);
                if (dsHeader != null) {
                    return new cj90((FrameLayout) viewF3, dsHeader);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.header)));
                return null;
            case 23:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.personal_data_value_item_layout, viewGroup4, false);
                DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF4, R.id.cmtTitle);
                if (dsCellMiddleTitle3 != null) {
                    DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(viewF4, R.id.crlValue);
                    if (dsCellRightLabel != null) {
                        DsSettingsCell dsSettingsCell3 = (DsSettingsCell) yum0.f(viewF4, R.id.scItem);
                        if (dsSettingsCell3 != null) {
                            return new gj90((FrameLayout) viewF4, dsCellMiddleTitle3, dsCellRightLabel, dsSettingsCell3);
                        }
                    } else {
                        i = R.id.crlValue;
                    }
                } else {
                    i = R.id.cmtTitle;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case 24:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.input_phone_item, viewGroup5, false);
                if (viewF5 != null) {
                    DsPhoneTextField dsPhoneTextField = (DsPhoneTextField) viewF5;
                    return new cfx(dsPhoneTextField, dsPhoneTextField);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).intValue();
                ((File) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj).intValue();
                ((Intent) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj).getClass();
                hn90 hn90Var = (hn90) obj2;
                int i2 = dn90.m2;
                hn90Var.getClass();
                return Long.valueOf(hn90Var.f13340a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                kc5.b0(x8x.L(1), (fet) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ch90(byte b) {
        this.f4349a = b;
    }
}
