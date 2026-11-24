package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class ijp0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f14886a;
    public final RecyclerView b;

    public ijp0(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f14886a = linearLayout;
        this.b = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14886a;
    }
}
