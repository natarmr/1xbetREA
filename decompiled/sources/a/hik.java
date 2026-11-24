package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class hik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f13116a;
    public final RecyclerView b;

    public hik(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f13116a = linearLayout;
        this.b = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13116a;
    }
}
