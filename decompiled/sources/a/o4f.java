package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class o4f implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f24631a;
    public final RecyclerView b;

    public o4f(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f24631a = recyclerView;
        this.b = recyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24631a;
    }
}
