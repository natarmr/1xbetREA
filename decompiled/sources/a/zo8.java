package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class zo8 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44707a;
    public final FrameLayout b;
    public final Group c;
    public final RecyclerView d;

    public zo8(ConstraintLayout constraintLayout, FrameLayout frameLayout, Group group, RecyclerView recyclerView) {
        this.f44707a = constraintLayout;
        this.b = frameLayout;
        this.c = group;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44707a;
    }
}
