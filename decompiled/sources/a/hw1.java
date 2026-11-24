package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class hw1 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f13749a;
    public final ComposeView b;

    public hw1(ComposeView composeView, ComposeView composeView2) {
        this.f13749a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13749a;
    }
}
