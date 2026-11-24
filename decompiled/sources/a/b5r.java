package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class b5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f2017a;
    public final RecyclerView b;

    public b5r(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f2017a = recyclerView;
        this.b = recyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2017a;
    }
}
