package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class ssx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32748a;
    public final ExpandBtnView b;
    public final FrozenRecyclerView c;
    public final RecyclerView d;

    public ssx(LinearLayout linearLayout, ExpandBtnView expandBtnView, FrozenRecyclerView frozenRecyclerView, RecyclerView recyclerView) {
        this.f32748a = linearLayout;
        this.b = expandBtnView;
        this.c = frozenRecyclerView;
        this.d = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32748a;
    }
}
