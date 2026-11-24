package a;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aed0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aed0 f722a = new aed0(1, f2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/features/notification_settings/impl/databinding/FragmentNotificationSettingsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.clNightModeTimeTable;
        if (((LinearLayout) yum0.f(view, R.id.clNightModeTimeTable)) != null) {
            i = R.id.cmtIndicatorTitle;
            if (((DsCellMiddleTitle) yum0.f(view, R.id.cmtIndicatorTitle)) != null) {
                i = R.id.cmtMatchEventFavoriteTitle;
                if (((DsCellMiddleTitle) yum0.f(view, R.id.cmtMatchEventFavoriteTitle)) != null) {
                    i = R.id.cmtMatchEventTitle;
                    if (((DsCellMiddleTitle) yum0.f(view, R.id.cmtMatchEventTitle)) != null) {
                        i = R.id.cmtSoundsTitle;
                        if (((DsCellMiddleTitle) yum0.f(view, R.id.cmtSoundsTitle)) != null) {
                            i = R.id.crsIndicatorToggle;
                            DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(view, R.id.crsIndicatorToggle);
                            if (dsCellRightSwitch != null) {
                                i = R.id.crsMatchEventFavoriteToggle;
                                DsCellRightSwitch dsCellRightSwitch2 = (DsCellRightSwitch) yum0.f(view, R.id.crsMatchEventFavoriteToggle);
                                if (dsCellRightSwitch2 != null) {
                                    i = R.id.crsMatchEventToggle;
                                    DsCellRightSwitch dsCellRightSwitch3 = (DsCellRightSwitch) yum0.f(view, R.id.crsMatchEventToggle);
                                    if (dsCellRightSwitch3 != null) {
                                        i = R.id.crsSoundsToggle;
                                        if (((DsCellRightLabel) yum0.f(view, R.id.crsSoundsToggle)) != null) {
                                            i = R.id.navigationBar;
                                            DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                                            if (dsNavigationBar != null) {
                                                i = R.id.scIndicatorContainer;
                                                DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(view, R.id.scIndicatorContainer);
                                                if (dsSettingsCell != null) {
                                                    i = R.id.scMatchEventContainer;
                                                    if (((DsSettingsCell) yum0.f(view, R.id.scMatchEventContainer)) != null) {
                                                        i = R.id.scMatchEventFavoriteContainer;
                                                        if (((DsSettingsCell) yum0.f(view, R.id.scMatchEventFavoriteContainer)) != null) {
                                                            i = R.id.scSoundsContainer;
                                                            DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(view, R.id.scSoundsContainer);
                                                            if (dsSettingsCell2 != null) {
                                                                return new f2r((LinearLayout) view, dsCellRightSwitch, dsCellRightSwitch2, dsCellRightSwitch3, dsNavigationBar, dsSettingsCell, dsSettingsCell2);
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
