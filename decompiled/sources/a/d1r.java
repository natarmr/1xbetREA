package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class d1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f5323a;
    public final RecyclerView b;
    public final ProgressBar c;

    public d1r(FrameLayout frameLayout, ProgressBar progressBar, RecyclerView recyclerView) {
        this.f5323a = frameLayout;
        this.b = recyclerView;
        this.c = progressBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5323a;
    }
}
