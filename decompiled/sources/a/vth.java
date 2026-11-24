package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class vth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38007a;
    public final ComposeView b;

    public vth(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.f38007a = constraintLayout;
        this.b = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38007a;
    }
}
