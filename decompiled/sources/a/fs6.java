package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class fs6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10049a;
    public final RecyclerView b;
    public final RecyclerView c;

    public fs6(ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f10049a = constraintLayout;
        this.b = recyclerView;
        this.c = recyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10049a;
    }
}
