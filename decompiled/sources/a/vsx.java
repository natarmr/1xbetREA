package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;

/* JADX INFO: loaded from: classes4.dex */
public final class vsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f37974a;
    public final ExpandBtnView b;
    public final ComposeView c;

    public vsx(ConstraintLayout constraintLayout, ExpandBtnView expandBtnView, ComposeView composeView) {
        this.f37974a = constraintLayout;
        this.b = expandBtnView;
        this.c = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37974a;
    }
}
