package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.header.Header;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class so90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32536a;

    public /* synthetic */ so90(byte b) {
        this.f32536a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32536a;
        int i = R.id.scEntryPoint;
        int i2 = R.id.cellTitle;
        int i3 = R.id.sellSeparator;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_picker_currency, viewGroup, false);
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF, R.id.cellIcon);
                if (dsCellLeftIcon == null) {
                    i = R.id.cellIcon;
                } else if (((DsCellRightRadioButton) yum0.f(viewF, R.id.cellRadioButton)) != null) {
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.cellTitle);
                    if (dsCellMiddleTitle != null) {
                        DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(viewF, R.id.scEntryPoint);
                        if (dsSettingsCell != null) {
                            DsSeparator dsSeparator = (DsSeparator) yum0.f(viewF, R.id.sellSeparator);
                            if (dsSeparator != null) {
                                return new pwx((LinearLayout) viewF, dsCellLeftIcon, dsCellMiddleTitle, dsSettingsCell, dsSeparator);
                            }
                            i = R.id.sellSeparator;
                        }
                    } else {
                        i = R.id.cellTitle;
                    }
                } else {
                    i = R.id.cellRadioButton;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                return Unit.f46060a;
            case 2:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_picker_simple_text, viewGroup2, false);
                DsSeparator dsSeparator2 = (DsSeparator) yum0.f(viewF2, R.id.sellSeparator);
                if (dsSeparator2 != null) {
                    i3 = R.id.tvDescription;
                    TextView textView = (TextView) yum0.f(viewF2, R.id.tvDescription);
                    if (textView != null) {
                        return new rwx((FrameLayout) viewF2, dsSeparator2, textView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i3)));
                return null;
            case 3:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_picker_title, viewGroup3, false);
                if (viewF3 != null) {
                    Header header = (Header) viewF3;
                    return new swx(header, header);
                }
                hny.u("rootView");
                return null;
            case 4:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return Boolean.TRUE;
            case 5:
                return Unit.f46060a;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                ((cav0) obj2).getClass();
                return num;
            case 7:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_picker_option, viewGroup4, false);
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF4, R.id.cellIcon);
                if (dsCellLeftIcon2 == null) {
                    i = R.id.cellIcon;
                } else if (((DsCellRightRadioButton) yum0.f(viewF4, R.id.cellRadioButton)) != null) {
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF4, R.id.cellTitle);
                    if (dsCellMiddleTitle2 != null) {
                        DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(viewF4, R.id.scEntryPoint);
                        if (dsSettingsCell2 != null) {
                            DsSeparator dsSeparator3 = (DsSeparator) yum0.f(viewF4, R.id.sellSeparator);
                            if (dsSeparator3 != null) {
                                return new qwx((LinearLayout) viewF4, dsCellLeftIcon2, dsCellMiddleTitle2, dsSettingsCell2, dsSeparator3);
                            }
                            i = R.id.sellSeparator;
                        }
                    } else {
                        i = R.id.cellTitle;
                    }
                } else {
                    i = R.id.cellRadioButton;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case 8:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_picker_without_image_option, viewGroup5, false);
                if (((DsCellRightRadioButton) yum0.f(viewF5, R.id.cellRadioButton)) != null) {
                    DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF5, R.id.cellTitle);
                    if (dsCellMiddleTitle3 != null) {
                        i2 = R.id.scEntryPointWithoutImage;
                        DsSettingsCell dsSettingsCell3 = (DsSettingsCell) yum0.f(viewF5, R.id.scEntryPointWithoutImage);
                        if (dsSettingsCell3 != null) {
                            DsSeparator dsSeparator4 = (DsSeparator) yum0.f(viewF5, R.id.sellSeparator);
                            if (dsSeparator4 != null) {
                                return new twx((LinearLayout) viewF5, dsCellMiddleTitle3, dsSettingsCell3, dsSeparator4);
                            }
                            i2 = R.id.sellSeparator;
                        }
                    }
                } else {
                    i2 = R.id.cellRadioButton;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i2)));
                return null;
            case 9:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                t9x.m(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return rz4.h(iIntValue, p6t0Var.getKey());
            case 12:
                ((Integer) obj2).getClass();
                bdx.H(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                int iIntValue2 = ((Integer) obj).intValue();
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var2.getClass();
                return rz4.h(iIntValue2, p6t0Var2.getKey());
            case 14:
                ((Integer) obj2).getClass();
                vdx.z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                ((Integer) obj).getClass();
                nz30 nz30Var = (nz30) obj2;
                nz30Var.getClass();
                return nz30Var.b.toString();
            case 16:
                k0a0 k0a0Var = (k0a0) obj2;
                ((oyg0) obj).getClass();
                k0a0Var.getClass();
                return k0a0.a(k0a0Var, false, false, true);
            case 17:
                k0a0 k0a0Var2 = (k0a0) obj2;
                ((oyg0) obj).getClass();
                k0a0Var2.getClass();
                return k0a0.a(k0a0Var2, false, true, false);
            case 18:
                ((Integer) obj2).getClass();
                x8f.F(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Integer num2 = (Integer) obj;
                num2.intValue();
                ((h3a0) obj2).getClass();
                return num2;
            case 20:
                ((Integer) obj2).getClass();
                x8f.k(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                saj.z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 23:
                return Unit.f46060a;
            case 24:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new er90((byte) 16));
                function2.invoke(new wm90((byte) 21));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                qjj.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                qjj.D(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                d9x.q(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup6.getClass();
                return vjd.a(layoutInflater, viewGroup6);
        }
    }

    public /* synthetic */ so90(int i, byte b) {
        this.f32536a = b;
    }
}
