package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class mhf implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21790a;
    public final TextView b;
    public final RecyclerView c;

    public mhf(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView) {
        this.f21790a = constraintLayout;
        this.b = textView;
        this.c = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21790a;
    }
}
