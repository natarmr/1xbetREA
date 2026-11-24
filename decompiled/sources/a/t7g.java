package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class t7g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33464a;
    public final ComposeView b;
    public final ComposeView c;
    public final FrameLayout d;

    public t7g(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, FrameLayout frameLayout) {
        this.f33464a = constraintLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33464a;
    }
}
