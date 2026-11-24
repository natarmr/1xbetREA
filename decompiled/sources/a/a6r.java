package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class a6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f330a;
    public final ProgressBar b;
    public final RecyclerView c;

    public a6r(FrameLayout frameLayout, ProgressBar progressBar, RecyclerView recyclerView) {
        this.f330a = frameLayout;
        this.b = progressBar;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f330a;
    }
}
