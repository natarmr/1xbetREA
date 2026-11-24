package a;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class qz30 extends FrameLayout implements o1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f29562a;

    /* JADX WARN: Multi-variable type inference failed */
    public qz30(View view) {
        super(view.getContext());
        this.f29562a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // a.o1d
    public final void onActionViewCollapsed() {
        this.f29562a.onActionViewCollapsed();
    }

    @Override // a.o1d
    public final void onActionViewExpanded() {
        this.f29562a.onActionViewExpanded();
    }
}
