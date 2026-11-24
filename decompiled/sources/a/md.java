package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class md extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final md f21571a = new md(1, gxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentAccountChoiceBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.recycler;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler);
                if (recyclerView != null) {
                    return new gxq((ConstraintLayout) view, recyclerView, dsBottomBar, dsNavigationBarBasic);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
