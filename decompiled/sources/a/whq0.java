package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class whq0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39178a;
    public final RecyclerView b;

    public whq0(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f39178a = constraintLayout;
        this.b = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39178a;
    }
}
