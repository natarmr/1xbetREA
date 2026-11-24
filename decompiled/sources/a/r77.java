package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class r77 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29965a;
    public final View b;
    public final LinearLayout c;
    public final RecyclerView d;
    public final TextView e;

    public r77(ConstraintLayout constraintLayout, View view, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f29965a = constraintLayout;
        this.b = view;
        this.c = linearLayout;
        this.d = recyclerView;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29965a;
    }
}
