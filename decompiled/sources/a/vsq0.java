package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vsq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vsq0 f37964a = new vsq0(1, a6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/main_menu/impl/databinding/FragmentTitledGridMenuBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
        if (progressBar != null) {
            i = R.id.titledGridRecycler;
            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.titledGridRecycler);
            if (recyclerView != null) {
                return new a6r((FrameLayout) view, progressBar, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
