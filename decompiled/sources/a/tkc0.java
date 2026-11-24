package a;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tkc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tkc0 f34089a = new tkc0(1, tuc0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/PromoToolbarBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBar != null) {
            return new tuc0((LinearLayout) view, dsNavigationBar);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.navigationBar)));
        return null;
    }
}
