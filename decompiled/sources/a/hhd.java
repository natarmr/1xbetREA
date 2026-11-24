package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightAccordion;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.footer.DsFooter;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hhd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13057a;

    public /* synthetic */ hhd(byte b) {
        this.f13057a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13057a;
        int i = R.id.decorIcon;
        int i2 = R.id.vDivider;
        int i3 = R.id.tvTitle;
        int i4 = R.id.title;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    pz40 pz40Var = s6t0.f31722a;
                    zq8.a(0, fetVar, i120.Q(n0qVar, StaticColors.INSTANCE.m130getWhite600d7_KjU(), jd8.n));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return rz4.h(iIntValue2, p6t0Var.getKey());
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var2.getClass();
                return rz4.h(iIntValue3, p6t0Var2.getKey());
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                p6t0 p6t0Var3 = (p6t0) obj2;
                p6t0Var3.getClass();
                return rz4.h(iIntValue4, p6t0Var3.getKey());
            case 4:
                int iIntValue5 = ((Integer) obj).intValue();
                p6t0 p6t0Var4 = (p6t0) obj2;
                p6t0Var4.getClass();
                return rz4.h(iIntValue5, p6t0Var4.getKey());
            case 5:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return nrx.a(layoutInflater, viewGroup);
            case 6:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_accordion_isolated_decorated_line_menu_item, viewGroup2, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF;
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF, R.id.decorIcon);
                if (dsCellRightBanner != null) {
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new mrx(dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                        i = R.id.title;
                    } else {
                        i = R.id.icon;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 7:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup3.getClass();
                return nrx.a(layoutInflater2, viewGroup3);
            case 8:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_accordion_isolated_line_menu_item, viewGroup4, false);
                DsMenuCell dsMenuCell2 = (DsMenuCell) viewF2;
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF2, R.id.icon);
                if (dsCellLeftIcon2 != null) {
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF2, R.id.title);
                    if (dsCellMiddleTitle2 != null) {
                        return new orx(dsMenuCell2, dsCellLeftIcon2, dsCellMiddleTitle2);
                    }
                } else {
                    i4 = R.id.icon;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i4)));
                return null;
            case 9:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup5.getClass();
                return nrx.a(layoutInflater3, viewGroup5);
            case 10:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_accordion_isolated_special_line_menu_item, viewGroup6, false);
                DsMenuCell dsMenuCell3 = (DsMenuCell) viewF3;
                DsCellRightBanner dsCellRightBanner2 = (DsCellRightBanner) yum0.f(viewF3, R.id.decorIcon);
                if (dsCellRightBanner2 != null) {
                    DsCellLeftIcon dsCellLeftIcon3 = (DsCellLeftIcon) yum0.f(viewF3, R.id.icon);
                    if (dsCellLeftIcon3 != null) {
                        DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF3, R.id.title);
                        if (dsCellMiddleTitle3 != null) {
                            return new prx(dsMenuCell3, dsCellRightBanner2, dsCellLeftIcon3, dsCellMiddleTitle3);
                        }
                        i = R.id.title;
                    } else {
                        i = R.id.icon;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 11:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_accordion_isolated_support_line_menu_item, viewGroup7, false);
                DsMenuCell dsMenuCell4 = (DsMenuCell) viewF4;
                DsCellRightCounter dsCellRightCounter = (DsCellRightCounter) yum0.f(viewF4, R.id.counter);
                if (dsCellRightCounter != null) {
                    DsCellLeftIcon dsCellLeftIcon4 = (DsCellLeftIcon) yum0.f(viewF4, R.id.icon);
                    if (dsCellLeftIcon4 != null) {
                        DsCellMiddleTitle dsCellMiddleTitle4 = (DsCellMiddleTitle) yum0.f(viewF4, R.id.title);
                        if (dsCellMiddleTitle4 != null) {
                            return new qrx(dsMenuCell4, dsCellRightCounter, dsCellLeftIcon4, dsCellMiddleTitle4);
                        }
                    } else {
                        i4 = R.id.icon;
                    }
                } else {
                    i4 = R.id.counter;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i4)));
                return null;
            case 12:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup8.getClass();
                return nrx.a(layoutInflater4, viewGroup8);
            case 13:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.item_accordion_isolated_virtual_simple_menu_item, viewGroup9, false);
                int i5 = R.id.left;
                DsCellLeftIcon dsCellLeftIcon5 = (DsCellLeftIcon) yum0.f(viewF5, R.id.left);
                if (dsCellLeftIcon5 != null) {
                    i5 = R.id.middle;
                    DsCellMiddleTitle dsCellMiddleTitle5 = (DsCellMiddleTitle) yum0.f(viewF5, R.id.middle);
                    if (dsCellMiddleTitle5 != null) {
                        return new rrx((DsMenuCell) viewF5, dsCellLeftIcon5, dsCellMiddleTitle5);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i5)));
                return null;
            case 14:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.item_accordion_header_menu_item, viewGroup10, false);
                DsCellRightAccordion dsCellRightAccordion = (DsCellRightAccordion) yum0.f(viewF6, R.id.accordion);
                if (dsCellRightAccordion != null) {
                    DsMenuCell dsMenuCell5 = (DsMenuCell) viewF6;
                    DsCellLeftIcon dsCellLeftIcon6 = (DsCellLeftIcon) yum0.f(viewF6, R.id.icon);
                    if (dsCellLeftIcon6 != null) {
                        DsCellMiddleTitle dsCellMiddleTitle6 = (DsCellMiddleTitle) yum0.f(viewF6, R.id.title);
                        if (dsCellMiddleTitle6 != null) {
                            return new krx(dsMenuCell5, dsCellRightAccordion, dsCellLeftIcon6, dsCellMiddleTitle6);
                        }
                    } else {
                        i4 = R.id.icon;
                    }
                } else {
                    i4 = R.id.accordion;
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i4)));
                return null;
            case 15:
                ((Integer) obj2).getClass();
                xia0.U(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                xia0.V(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 17:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.item_account, viewGroup11, false);
                int i6 = R.id.accountId;
                DsCellMiddleTitle dsCellMiddleTitle7 = (DsCellMiddleTitle) yum0.f(viewF7, R.id.accountId);
                if (dsCellMiddleTitle7 != null) {
                    DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF7;
                    i6 = R.id.avatarPlaceholder;
                    DsCellLeftIcon dsCellLeftIcon7 = (DsCellLeftIcon) yum0.f(viewF7, R.id.avatarPlaceholder);
                    if (dsCellLeftIcon7 != null) {
                        i6 = R.id.iconCheck;
                        DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(viewF7, R.id.iconCheck);
                        if (dsCellRightLabel != null) {
                            i6 = R.id.sellSeparator;
                            DsSeparator dsSeparator = (DsSeparator) yum0.f(viewF7, R.id.sellSeparator);
                            if (dsSeparator != null) {
                                return new trx(dsSettingsCell, dsCellMiddleTitle7, dsCellLeftIcon7, dsCellRightLabel, dsSeparator);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i6)));
                return null;
            case 18:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.item_filter_market_action, viewGroup12, false);
                ImageView imageView = (ImageView) yum0.f(viewF8, R.id.ivImage);
                if (imageView != null) {
                    TextView textView = (TextView) yum0.f(viewF8, R.id.tvTitle);
                    if (textView != null) {
                        View viewF9 = yum0.f(viewF8, R.id.vDivider);
                        if (viewF9 != null) {
                            return new fux((LinearLayout) viewF8, imageView, textView, viewF9);
                        }
                    } else {
                        i2 = R.id.tvTitle;
                    }
                } else {
                    i2 = R.id.ivImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i2)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup13, R.layout.item_filter_market_action, viewGroup13, false);
                ImageView imageView2 = (ImageView) yum0.f(viewF10, R.id.ivImage);
                if (imageView2 != null) {
                    TextView textView2 = (TextView) yum0.f(viewF10, R.id.tvTitle);
                    if (textView2 != null) {
                        View viewF11 = yum0.f(viewF10, R.id.vDivider);
                        if (viewF11 != null) {
                            return new gux((LinearLayout) viewF10, imageView2, textView2, viewF11);
                        }
                    } else {
                        i2 = R.id.tvTitle;
                    }
                } else {
                    i2 = R.id.ivImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i2)));
                return null;
            case 20:
                return Unit.f46060a;
            case 21:
                ViewGroup viewGroup14 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup14, R.layout.item_action_menu, viewGroup14, false);
                ImageView imageView3 = (ImageView) yum0.f(viewF12, R.id.ivLable);
                if (imageView3 != null) {
                    TextView textView3 = (TextView) yum0.f(viewF12, R.id.tvTitle);
                    if (textView3 != null) {
                        return new urx((LinearLayout) viewF12, imageView3, textView3);
                    }
                } else {
                    i3 = R.id.ivLable;
                }
                hny.u("Missing required view with ID: ".concat(viewF12.getResources().getResourceName(i3)));
                return null;
            case 22:
                ViewGroup viewGroup15 = (ViewGroup) obj2;
                View viewF13 = rw2.f((LayoutInflater) obj, viewGroup15, R.layout.mailing_info_ui_kit_item, viewGroup15, false);
                if (viewF13 != null) {
                    return new mzq((DsFooter) viewF13, (byte) 5);
                }
                hny.u("rootView");
                return null;
            case 23:
                ViewGroup viewGroup16 = (ViewGroup) obj2;
                View viewF14 = rw2.f((LayoutInflater) obj, viewGroup16, R.layout.mailing_attach_phone_email_ui_kit_item, viewGroup16, false);
                int i7 = R.id.cellTitle;
                DsCellMiddleTitle dsCellMiddleTitle8 = (DsCellMiddleTitle) yum0.f(viewF14, R.id.cellTitle);
                if (dsCellMiddleTitle8 != null) {
                    i7 = R.id.startIcon;
                    DsCellLeftIcon dsCellLeftIcon8 = (DsCellLeftIcon) yum0.f(viewF14, R.id.startIcon);
                    if (dsCellLeftIcon8 != null) {
                        return new tp10((DsSettingsCell) viewF14, dsCellLeftIcon8, dsCellMiddleTitle8);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF14.getResources().getResourceName(i7)));
                return null;
            case 24:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(465154462);
                xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup17 = (ViewGroup) obj2;
                View viewF15 = rw2.f((LayoutInflater) obj, viewGroup17, R.layout.add_team_menu_item, viewGroup17, false);
                int i8 = R.id.ivAddTeam;
                ImageView imageView4 = (ImageView) yum0.f(viewF15, R.id.ivAddTeam);
                if (imageView4 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewF15;
                    TextView textView4 = (TextView) yum0.f(viewF15, R.id.tvAddTeam);
                    if (textView4 != null) {
                        return new yt(linearLayout, imageView4, textView4);
                    }
                    i8 = R.id.tvAddTeam;
                }
                hny.u("Missing required view with ID: ".concat(viewF15.getResources().getResourceName(i8)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hhd(int i, byte b) {
        this.f13057a = b;
    }
}
