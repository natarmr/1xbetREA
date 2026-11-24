package a;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import org.xplatform.related.api.presentation.RelatedContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class hku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelatedContainerView f13225a;
    public final ComposeView b;
    public final Group c;
    public final TextView d;
    public final TextView e;

    public hku0(RelatedContainerView relatedContainerView, ComposeView composeView, Group group, TextView textView, TextView textView2) {
        this.f13225a = relatedContainerView;
        this.b = composeView;
        this.c = group;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13225a;
    }
}
