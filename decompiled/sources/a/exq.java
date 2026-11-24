package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class exq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8591a;
    public final RecyclerView b;
    public final ProgressBar c;

    public exq(FrameLayout frameLayout, ProgressBar progressBar, RecyclerView recyclerView) {
        this.f8591a = frameLayout;
        this.b = recyclerView;
        this.c = progressBar;
    }

    public static exq a(View view) {
        int i = R.id.accordionRecycler;
        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.accordionRecycler);
        if (recyclerView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
            if (progressBar != null) {
                return new exq((FrameLayout) view, progressBar, recyclerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8591a;
    }
}
