package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.api.ConnectionResult;
import org.xbet.client1.R;
import org.xplatform.cyber.dota.impl.presentation.common.DotaAdditionalTeamInformationView;
import org.xplatform.cyber.dota.impl.presentation.statistic.items.view.DotaItemsHeroesTableView;
import org.xplatform.cyber.dota.impl.presentation.statistic.items.view.DotaItemsTableView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelTimerView;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.EnteringPinCode;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PicCodeEditField;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PinCodeSymbolButton;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLine;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoSeeding;

/* JADX INFO: loaded from: classes3.dex */
public final class dc3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5832a;
    public final ViewGroup b;
    public final View c;
    public final Object d;
    public final Object e;

    public dc3(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.f5832a = (byte) 20;
        this.b = constraintLayout;
        this.d = imageView;
        this.c = imageView2;
        this.e = imageView3;
    }

    public static dc3 a(View view) {
        int i = R.id.chipGroupRv;
        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.chipGroupRv);
        if (recyclerView != null) {
            i = R.id.container;
            BracketItemView bracketItemView = (BracketItemView) yum0.f(view, R.id.container);
            if (bracketItemView != null) {
                i = R.id.maskLayout;
                View viewF = yum0.f(view, R.id.maskLayout);
                if (viewF != null) {
                    return new dc3((ViewGroup) view, (View) recyclerView, (Object) bracketItemView, (Object) viewF, (byte) 7);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dc3 b(View view) {
        int i = R.id.cmtTitle;
        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(view, R.id.cmtTitle);
        if (dsCellMiddleTitle != null) {
            i = R.id.radioButton;
            DsCellRightRadioButton dsCellRightRadioButton = (DsCellRightRadioButton) yum0.f(view, R.id.radioButton);
            if (dsCellRightRadioButton != null) {
                DsSettingsCell dsSettingsCell = (DsSettingsCell) view;
                return new dc3((ViewGroup) dsSettingsCell, (View) dsCellMiddleTitle, (Object) dsCellRightRadioButton, (Object) dsSettingsCell, (byte) 10);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dc3 c(View view) {
        int i = R.id.cmtTitle;
        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(view, R.id.cmtTitle);
        if (dsCellMiddleTitle != null) {
            i = R.id.rightLabel;
            DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(view, R.id.rightLabel);
            if (dsCellRightLabel != null) {
                DsSettingsCell dsSettingsCell = (DsSettingsCell) view;
                return new dc3((ViewGroup) dsSettingsCell, (View) dsCellMiddleTitle, (Object) dsCellRightLabel, (Object) dsSettingsCell, (byte) 11);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dc3 d(View view) {
        int i = R.id.cmtTitle;
        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(view, R.id.cmtTitle);
        if (dsCellMiddleTitle != null) {
            DsSettingsCell dsSettingsCell = (DsSettingsCell) view;
            i = R.id.toggle;
            DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(view, R.id.toggle);
            if (dsCellRightSwitch != null) {
                return new dc3((ViewGroup) dsSettingsCell, (View) dsCellMiddleTitle, (Object) dsSettingsCell, (Object) dsCellRightSwitch, (byte) 12);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dc3 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_balance_management_legal, viewGroup, false);
        int i = R.id.cellIcon;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.cellIcon);
        if (dsCellLeftIcon != null) {
            i = R.id.cellTitle;
            DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.cellTitle);
            if (dsCellMiddleTitle != null) {
                DsSettingsCell dsSettingsCell = (DsSettingsCell) viewInflate;
                return new dc3((ViewGroup) dsSettingsCell, (View) dsCellLeftIcon, (Object) dsCellMiddleTitle, (Object) dsSettingsCell, (byte) 5);
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static dc3 f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.tournament_table_row_cell, viewGroup, false);
        int i = R.id.arrow;
        if (((ImageView) yum0.f(viewInflate, R.id.arrow)) != null) {
            i = R.id.image;
            DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(viewInflate, R.id.image);
            if (dsTeamLogo != null) {
                i = R.id.position;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.position);
                if (textView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.title);
                    if (textView2 != null) {
                        return new dc3((ViewGroup) viewInflate, (View) dsTeamLogo, textView, textView2, (byte) 13);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f5832a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                return (AppBarMotionLayout) viewGroup;
            case 1:
                return (m5l) viewGroup;
            case 2:
                return (LinearLayout) viewGroup;
            case 3:
                return (EventCardInfoLine) viewGroup;
            case 4:
                return (EventCardInfoSeeding) viewGroup;
            case 5:
                return (DsSettingsCell) viewGroup;
            case 6:
                return (RelativeLayout) viewGroup;
            case 7:
                return (LinearLayout) viewGroup;
            case 8:
                return (ConstraintLayout) viewGroup;
            case 9:
                return (dub0) viewGroup;
            case 10:
                return (DsSettingsCell) viewGroup;
            case 11:
                return (DsSettingsCell) viewGroup;
            case 12:
                return (DsSettingsCell) viewGroup;
            case 13:
                return (LinearLayout) viewGroup;
            case 14:
                return (FrameLayout) viewGroup;
            case 15:
                return (ConstraintLayout) viewGroup;
            case 16:
                return (ConstraintLayout) viewGroup;
            case 17:
                return (EnteringPinCode) viewGroup;
            case 18:
                return (LuckyWheelTimerView) viewGroup;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public /* synthetic */ dc3(ViewGroup viewGroup, View view, Object obj, Object obj2, byte b) {
        this.f5832a = b;
        this.b = viewGroup;
        this.c = view;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ dc3(ViewGroup viewGroup, TextView textView, View view, View view2, byte b) {
        this.f5832a = b;
        this.b = viewGroup;
        this.e = textView;
        this.c = view;
        this.d = view2;
    }

    public /* synthetic */ dc3(ViewGroup viewGroup, View view, TextView textView, TextView textView2, byte b) {
        this.f5832a = b;
        this.b = viewGroup;
        this.c = view;
        this.e = textView;
        this.d = textView2;
    }

    public dc3(m5l m5lVar, DotaAdditionalTeamInformationView dotaAdditionalTeamInformationView, DotaItemsHeroesTableView dotaItemsHeroesTableView, DotaItemsTableView dotaItemsTableView, HorizontalScrollView horizontalScrollView) {
        this.f5832a = (byte) 1;
        this.b = m5lVar;
        this.c = dotaItemsHeroesTableView;
        this.d = dotaItemsTableView;
        this.e = horizontalScrollView;
    }

    public dc3(EnteringPinCode enteringPinCode, View view, PinCodeSymbolButton pinCodeSymbolButton, PinCodeSymbolButton pinCodeSymbolButton2, PinCodeSymbolButton pinCodeSymbolButton3, PinCodeSymbolButton pinCodeSymbolButton4, PinCodeSymbolButton pinCodeSymbolButton5, PicCodeEditField picCodeEditField, TextView textView, ImageView imageView, PinCodeSymbolButton pinCodeSymbolButton6, PinCodeSymbolButton pinCodeSymbolButton7, PinCodeSymbolButton pinCodeSymbolButton8, PinCodeSymbolButton pinCodeSymbolButton9, PinCodeSymbolButton pinCodeSymbolButton10) {
        this.f5832a = (byte) 17;
        this.b = enteringPinCode;
        this.c = view;
        this.d = picCodeEditField;
        this.e = textView;
    }
}
