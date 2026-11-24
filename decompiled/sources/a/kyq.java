package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: loaded from: classes3.dex */
public final class kyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f19118a;
    public final AppCompatButton b;

    public kyq(FrameLayout frameLayout, AppCompatButton appCompatButton) {
        this.f19118a = frameLayout;
        this.b = appCompatButton;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19118a;
    }
}
