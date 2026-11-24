package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class o0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f24441a;
    public final RecyclerView b;

    public o0r(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f24441a = recyclerView;
        this.b = recyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24441a;
    }
}
