package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.radio_button.DsRadioButton;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wbq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wbq0 f38892a = new wbq0(1, v5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/themesettings/impl/databinding/FragmentThemeSettingsUiKitBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.activeNightModeContent;
        if (((ConstraintLayout) yum0.f(view, R.id.activeNightModeContent)) != null) {
            i = R.id.chooseThemeHeader;
            if (((DsHeader) yum0.f(view, R.id.chooseThemeHeader)) != null) {
                i = R.id.ivDark;
                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.ivDark);
                if (appCompatImageView != null) {
                    i = R.id.ivDarkBack;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(view, R.id.ivDarkBack);
                    if (appCompatImageView2 != null) {
                        i = R.id.ivLight;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) yum0.f(view, R.id.ivLight);
                        if (appCompatImageView3 != null) {
                            i = R.id.ivLightBack;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) yum0.f(view, R.id.ivLightBack);
                            if (appCompatImageView4 != null) {
                                i = R.id.ivNight;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) yum0.f(view, R.id.ivNight);
                                if (appCompatImageView5 != null) {
                                    i = R.id.ivNightBack;
                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) yum0.f(view, R.id.ivNightBack);
                                    if (appCompatImageView6 != null) {
                                        i = R.id.navigationBar;
                                        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                                        if (dsNavigationBarBasic != null) {
                                            i = R.id.rbDark;
                                            DsRadioButton dsRadioButton = (DsRadioButton) yum0.f(view, R.id.rbDark);
                                            if (dsRadioButton != null) {
                                                i = R.id.rbLight;
                                                DsRadioButton dsRadioButton2 = (DsRadioButton) yum0.f(view, R.id.rbLight);
                                                if (dsRadioButton2 != null) {
                                                    i = R.id.rbNight;
                                                    DsRadioButton dsRadioButton3 = (DsRadioButton) yum0.f(view, R.id.rbNight);
                                                    if (dsRadioButton3 != null) {
                                                        i = R.id.settingsHeader;
                                                        if (((DsHeader) yum0.f(view, R.id.settingsHeader)) != null) {
                                                            i = R.id.switchTurnOnTimeTable;
                                                            DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(view, R.id.switchTurnOnTimeTable);
                                                            if (dsCellRightSwitch != null) {
                                                                i = R.id.turnOffLabel;
                                                                DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(view, R.id.turnOffLabel);
                                                                if (dsCellRightLabel != null) {
                                                                    i = R.id.turnOffTimeCell;
                                                                    DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(view, R.id.turnOffTimeCell);
                                                                    if (dsSettingsCell != null) {
                                                                        i = R.id.turnOnLabel;
                                                                        DsCellRightLabel dsCellRightLabel2 = (DsCellRightLabel) yum0.f(view, R.id.turnOnLabel);
                                                                        if (dsCellRightLabel2 != null) {
                                                                            i = R.id.turnOnTimeCell;
                                                                            DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(view, R.id.turnOnTimeCell);
                                                                            if (dsSettingsCell2 != null) {
                                                                                i = R.id.turnOnTimeTableCell;
                                                                                DsSettingsCell dsSettingsCell3 = (DsSettingsCell) yum0.f(view, R.id.turnOnTimeTableCell);
                                                                                if (dsSettingsCell3 != null) {
                                                                                    return new v5r((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, dsNavigationBarBasic, dsRadioButton, dsRadioButton2, dsRadioButton3, dsCellRightSwitch, dsCellRightLabel, dsSettingsCell, dsCellRightLabel2, dsSettingsCell2, dsSettingsCell3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
