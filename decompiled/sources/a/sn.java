package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class sn implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32470a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final ComposeView d;
    public final ComposeView e;

    public sn(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, ComposeView composeView2) {
        this.f32470a = frameLayout;
        this.b = frameLayout2;
        this.c = frameLayout3;
        this.d = composeView;
        this.e = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32470a;
    }
}
