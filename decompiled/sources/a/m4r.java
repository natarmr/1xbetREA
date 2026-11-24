package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import org.xplatform.scratch_card.presentation.views.ScratchCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class m4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21186a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final ContentLoadingProgressBar e;
    public final ScratchCardView f;

    public m4r(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, ContentLoadingProgressBar contentLoadingProgressBar, ScratchCardView scratchCardView) {
        this.f21186a = constraintLayout;
        this.b = view;
        this.c = textView;
        this.d = textView2;
        this.e = contentLoadingProgressBar;
        this.f = scratchCardView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21186a;
    }
}
