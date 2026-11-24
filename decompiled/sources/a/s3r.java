package a;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes5.dex */
public final class s3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31573a;
    public final Button b;
    public final nq8 c;
    public final RecyclerView d;
    public final MaterialToolbar e;

    public s3r(ConstraintLayout constraintLayout, Button button, nq8 nq8Var, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f31573a = constraintLayout;
        this.b = button;
        this.c = nq8Var;
        this.d = recyclerView;
        this.e = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31573a;
    }
}
