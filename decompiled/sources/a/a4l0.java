package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class a4l0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f230a;
    public final FrameLayout b;
    public final LoadableShapeableImageView c;
    public final TextView d;

    public a4l0(FrameLayout frameLayout, FrameLayout frameLayout2, LoadableShapeableImageView loadableShapeableImageView, TextView textView) {
        this.f230a = frameLayout;
        this.b = frameLayout2;
        this.c = loadableShapeableImageView;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f230a;
    }
}
