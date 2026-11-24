package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class c1w implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3595a;
    public final MaterialButton b;
    public final jk3 c;
    public final RecyclerView d;

    public c1w(ConstraintLayout constraintLayout, MaterialButton materialButton, jk3 jk3Var, RecyclerView recyclerView) {
        this.f3595a = constraintLayout;
        this.b = materialButton;
        this.c = jk3Var;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3595a;
    }
}
