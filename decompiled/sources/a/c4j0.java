package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c4j0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c4j0 f3728a = new c4j0(1, t4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/office/make_bet_settings/impl/databinding/FragmentSettingsMakeBetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.settingsMakeBetProgressBar;
        ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.settingsMakeBetProgressBar);
        if (progressBar != null) {
            i = R.id.settingsMakeBetRv;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.settingsMakeBetRv);
            if (recyclerView != null) {
                i = R.id.settingsMakeBetToolbar;
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.settingsMakeBetToolbar);
                if (dsNavigationBar != null) {
                    return new t4r(linearLayout, progressBar, recyclerView, dsNavigationBar);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
