package a;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t8x extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8x f33534a = new t8x(1, t0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/info/impl/databinding/FragmentInfoNewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.navigationBar;
        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBar != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
            if (recyclerView != null) {
                return new t0r((LinearLayoutCompat) view, dsNavigationBar, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
