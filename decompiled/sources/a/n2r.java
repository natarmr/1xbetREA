package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class n2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f22816a;
    public final RecyclerView b;

    public n2r(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f22816a = recyclerView;
        this.b = recyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22816a;
    }
}
