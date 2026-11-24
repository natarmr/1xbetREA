package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o1q0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1q0 f24494a = new o1q0(1, u5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentTestSectionNewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            i = R.id.rvTestSections;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvTestSections);
            if (recyclerView != null) {
                return new u5r((LinearLayout) view, dsNavigationBarBasic, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
