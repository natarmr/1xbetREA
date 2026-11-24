package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m7g0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m7g0 f21320a = new m7g0(1, nq8.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/statistic/stat_results/impl/databinding/BottomsheetResultsGridNavigationBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.rvGames;
        if (((RecyclerView) yum0.f(view, R.id.rvGames)) != null) {
            i = R.id.topView;
            View viewF = yum0.f(view, R.id.topView);
            if (viewF != null) {
                i = R.id.tvTitle;
                if (((TextView) yum0.f(view, R.id.tvTitle)) != null) {
                    return new nq8((LinearLayout) view, viewF, (byte) 0);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
