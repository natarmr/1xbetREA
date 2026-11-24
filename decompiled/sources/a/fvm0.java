package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fvm0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fvm0 f10223a = new fvm0(1, njk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/sportgame/filters/impl/databinding/DialogSubGameFiltersBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_sub_game_filters, (ViewGroup) null, false);
        int i = R.id.lottieEmptyView;
        LottieView lottieView = (LottieView) yum0.f(viewInflate, R.id.lottieEmptyView);
        if (lottieView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.rvSubGames;
            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvSubGames);
            if (recyclerView != null) {
                i = R.id.searchView;
                DsSearchField dsSearchField = (DsSearchField) yum0.f(viewInflate, R.id.searchView);
                if (dsSearchField != null) {
                    i = R.id.separator;
                    View viewF = yum0.f(viewInflate, R.id.separator);
                    if (viewF != null) {
                        return new njk(constraintLayout, lottieView, recyclerView, dsSearchField, viewF);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
