package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rtc extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rtc f31071a = new rtc(1, czq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentClientConfigBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
            if (recyclerView != null) {
                return new czq((LinearLayout) view, dsNavigationBarBasic, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
