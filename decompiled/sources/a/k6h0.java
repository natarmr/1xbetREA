package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.scratch_card.presentation.views.ScratchCardView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k6h0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k6h0 f17770a = new k6h0(1, m4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/scratch_card/databinding/FragmentScratchCardBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.backgroundOverlapView;
        View viewF = yum0.f(view, R.id.backgroundOverlapView);
        if (viewF != null) {
            i = R.id.eraseLayerTextView;
            TextView textView = (TextView) yum0.f(view, R.id.eraseLayerTextView);
            if (textView != null) {
                i = R.id.placeBetTextView;
                TextView textView2 = (TextView) yum0.f(view, R.id.placeBetTextView);
                if (textView2 != null) {
                    i = R.id.progressBar;
                    ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) yum0.f(view, R.id.progressBar);
                    if (contentLoadingProgressBar != null) {
                        i = R.id.scratchCardView;
                        ScratchCardView scratchCardView = (ScratchCardView) yum0.f(view, R.id.scratchCardView);
                        if (scratchCardView != null) {
                            return new m4r((ConstraintLayout) view, viewF, textView, textView2, contentLoadingProgressBar, scratchCardView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
