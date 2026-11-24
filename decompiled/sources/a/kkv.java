package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kkv extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kkv f18459a = new kkv(1, p0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/shake/impl/databinding/FragmentHandshakeSettingsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.navigationBar;
        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBar != null) {
            i = R.id.rvShakeSettings;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvShakeSettings);
            if (recyclerView != null) {
                return new p0r((ConstraintLayout) view, dsNavigationBar, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
