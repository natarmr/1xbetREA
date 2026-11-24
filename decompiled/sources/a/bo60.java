package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bo60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bo60 f2917a = new bo60(1, rm70.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/OnexGameTitleFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.game_title;
        TextView textView = (TextView) yum0.f(view, R.id.game_title);
        if (textView != null) {
            i = R.id.title_shimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) yum0.f(view, R.id.title_shimmer);
            if (shimmerFrameLayout != null) {
                return new rm70((FrameLayout) view, textView, shimmerFrameLayout);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
