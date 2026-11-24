package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class n6q implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f23007a;
    public final RecyclerView b;

    public n6q(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f23007a = linearLayout;
        this.b = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23007a;
    }
}
