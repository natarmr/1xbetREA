package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class s4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f31621a;
    public final FrameLayout b;
    public final RecyclerView c;

    public s4r(FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView) {
        this.f31621a = frameLayout;
        this.b = frameLayout2;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31621a;
    }
}
