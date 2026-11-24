package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g6d0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g6d0 f10758a = new g6d0(1, i3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/proxy/impl/databinding/FragmentProxySettingsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.cmtTitle;
            if (((DsCellMiddleTitle) yum0.f(view, R.id.cmtTitle)) != null) {
                i = R.id.crsToggle;
                DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(view, R.id.crsToggle);
                if (dsCellRightSwitch != null) {
                    i = R.id.llContent;
                    if (((LinearLayout) yum0.f(view, R.id.llContent)) != null) {
                        i = R.id.navigationBar;
                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                        if (dsNavigationBar != null) {
                            i = R.id.scContainer;
                            if (((DsSettingsCell) yum0.f(view, R.id.scContainer)) != null) {
                                i = R.id.svContent;
                                if (((ScrollView) yum0.f(view, R.id.svContent)) != null) {
                                    i = R.id.tfProxyPassword;
                                    DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfProxyPassword);
                                    if (dsTextField != null) {
                                        i = R.id.tfProxyPort;
                                        DsTextField dsTextField2 = (DsTextField) yum0.f(view, R.id.tfProxyPort);
                                        if (dsTextField2 != null) {
                                            i = R.id.tfProxyServer;
                                            DsTextField dsTextField3 = (DsTextField) yum0.f(view, R.id.tfProxyServer);
                                            if (dsTextField3 != null) {
                                                i = R.id.tfProxyUserName;
                                                DsTextField dsTextField4 = (DsTextField) yum0.f(view, R.id.tfProxyUserName);
                                                if (dsTextField4 != null) {
                                                    return new i3r((ConstraintLayout) view, dsBottomBar, dsCellRightSwitch, dsNavigationBar, dsTextField, dsTextField2, dsTextField3, dsTextField4);
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
