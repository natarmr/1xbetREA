package a;

import android.view.View;
import android.widget.ImageView;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSandClockNew;

/* JADX INFO: loaded from: classes6.dex */
public final class h3c0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBarWithSandClockNew f12378a;
    public final ImageView b;
    public final ImageView c;

    public h3c0(ProgressBarWithSandClockNew progressBarWithSandClockNew, ImageView imageView, ImageView imageView2) {
        this.f12378a = progressBarWithSandClockNew;
        this.b = imageView;
        this.c = imageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12378a;
    }
}
