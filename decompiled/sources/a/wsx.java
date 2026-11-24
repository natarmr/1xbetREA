package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;

/* JADX INFO: loaded from: classes5.dex */
public final class wsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39713a;
    public final ExpandBtnView b;
    public final RecyclerView c;
    public final jk3 d;
    public final jk3 e;

    public wsx(ConstraintLayout constraintLayout, ExpandBtnView expandBtnView, RecyclerView recyclerView, jk3 jk3Var, jk3 jk3Var2) {
        this.f39713a = constraintLayout;
        this.b = expandBtnView;
        this.c = recyclerView;
        this.d = jk3Var;
        this.e = jk3Var2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39713a;
    }
}
