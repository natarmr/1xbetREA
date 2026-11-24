package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: loaded from: classes3.dex */
public final class i0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f13960a;
    public final AppCompatButton b;

    public i0r(FrameLayout frameLayout, AppCompatButton appCompatButton) {
        this.f13960a = frameLayout;
        this.b = appCompatButton;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13960a;
    }
}
