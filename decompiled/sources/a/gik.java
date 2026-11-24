package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class gik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f11351a;
    public final RecyclerView b;

    public gik(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f11351a = frameLayout;
        this.b = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11351a;
    }
}
