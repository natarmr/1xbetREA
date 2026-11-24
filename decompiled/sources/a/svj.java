package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class svj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32869a;

    public /* synthetic */ svj(byte b) {
        this.f32869a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32869a) {
            case 0:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case 1:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case 3:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case 4:
                bwj bwjVar = (bwj) obj2;
                ((azg0) obj).getClass();
                bwjVar.getClass();
                return q3d.j(Integer.valueOf(bwjVar.k()), Float.valueOf(l1e0.c(bwjVar.l(), -0.5f, 0.5f)), Integer.valueOf(bwjVar.n()));
            case 5:
                kwj kwjVar = (kwj) obj2;
                return q3d.j(Integer.valueOf(kwjVar.k()), Float.valueOf(l1e0.c(kwjVar.l(), -0.5f, 0.5f)), Integer.valueOf(kwjVar.n()));
            case 6:
                ((Integer) obj2).getClass();
                hmw0.I(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return djj0.a(layoutInflater, viewGroup);
            case 8:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                return djj0.a(layoutInflater2, viewGroup2);
            case 9:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_filter_market_description, viewGroup3, false);
                TextView textView = (TextView) yum0.f(viewF, R.id.tvTitle);
                if (textView != null) {
                    return new jux((ConstraintLayout) viewF, textView);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.tvTitle)));
                return null;
            case 10:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_filter_market_description, viewGroup4, false);
                TextView textView2 = (TextView) yum0.f(viewF2, R.id.tvTitle);
                if (textView2 != null) {
                    return new kux((ConstraintLayout) viewF2, textView2);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.tvTitle)));
                return null;
            case 11:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.description_info_item, viewGroup5, false);
                if (viewF3 != null) {
                    return new cck((TextView) viewF3, (byte) 0);
                }
                hny.u("rootView");
                return null;
            case 12:
                ((Integer) obj2).getClass();
                dub.V(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(625086327);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 14:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.cybergames_item_discipline_button, viewGroup6, false);
                int i = R.id.cellLeftView;
                SportCellLeftView sportCellLeftView = (SportCellLeftView) yum0.f(viewF4, R.id.cellLeftView);
                if (sportCellLeftView != null) {
                    i = R.id.cellMiddleView;
                    SportCellMiddleView sportCellMiddleView = (SportCellMiddleView) yum0.f(viewF4, R.id.cellMiddleView);
                    if (sportCellMiddleView != null) {
                        i = R.id.cellRightView;
                        if (((SportCellRightView) yum0.f(viewF4, R.id.cellRightView)) != null) {
                            return new xth((DsSportCell) viewF4, sportCellLeftView, sportCellMiddleView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case 15:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(603569292);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 16:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(-285424861);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 17:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar4.e0(-813650807);
                xcz xczVarA4 = ddz.a(0, 0, fetVar4, 0, 3);
                fetVar4.r(false);
                return xczVarA4;
            case 18:
                fet fetVar5 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar5.e0(-1077431488);
                xcz xczVarA5 = ddz.a(0, 0, fetVar5, 0, 3);
                fetVar5.r(false);
                return xczVarA5;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar6 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar6.e0(-242054056);
                xcz xczVarA6 = ddz.a(0, 0, fetVar6, 0, 3);
                fetVar6.r(false);
                return xczVarA6;
            case 20:
                fet fetVar7 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar7.e0(-1076242513);
                xcz xczVarA7 = ddz.a(0, 0, fetVar7, 0, 3);
                fetVar7.r(false);
                return xczVarA7;
            case 21:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new vbk((byte) 18));
                function2.invoke(new rtj((byte) 12));
                return Unit.f46060a;
            case 22:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                vfc.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.discipline_item, viewGroup7, false);
                int i2 = R.id.cellRadioButton;
                if (((DsCellRightRadioButton) yum0.f(viewF5, R.id.cellRadioButton)) != null) {
                    i2 = R.id.cellTitle;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF5, R.id.cellTitle);
                    if (dsCellMiddleTitle != null) {
                        i2 = R.id.sSeparator;
                        DsSeparator dsSeparator = (DsSeparator) yum0.f(viewF5, R.id.sSeparator);
                        if (dsSeparator != null) {
                            DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF5;
                            return new ktk(dsSettingsCell, dsSettingsCell, dsCellMiddleTitle, dsSeparator);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i2)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup8.getClass();
                return zvx.a(layoutInflater3, viewGroup8);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                vdb.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                vdb.K(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.app_start_dot_item, viewGroup9, false);
                if (viewF6 != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) viewF6;
                    return new jg3(appCompatImageView, appCompatImageView);
                }
                hny.u("rootView");
                return null;
            default:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup10.getClass();
                return vjd.a(layoutInflater4, viewGroup10);
        }
    }

    public /* synthetic */ svj(int i, byte b) {
        this.f32869a = b;
    }
}
