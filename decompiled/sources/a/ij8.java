package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ij8 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ij8 f14861a = new ij8(1, ajk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/games_section/feature/bonuses_info/impl/databinding/DialogOneXGamesBonusesInfoBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_one_x_games_bonuses_info, (ViewGroup) null, false);
        int i = R.id.contentLayout;
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.contentLayout);
        if (linearLayout != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            i = R.id.lottieEmptyView;
            LottieView lottieView = (LottieView) yum0.f(viewInflate, R.id.lottieEmptyView);
            if (lottieView != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.recyclerView);
                    if (recyclerView != null) {
                        i = R.id.titleTextView;
                        if (((TextView) yum0.f(viewInflate, R.id.titleTextView)) != null) {
                            return new ajk(frameLayout, linearLayout, lottieView, progressBar, recyclerView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
