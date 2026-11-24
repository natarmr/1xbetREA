package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;

/* JADX INFO: loaded from: classes.dex */
public final class rsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f31053a;
    public final ExpandBtnView b;
    public final LinearLayout c;
    public final RecyclerView d;
    public final TextView e;
    public final TextView f;

    public rsx(LinearLayout linearLayout, ExpandBtnView expandBtnView, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f31053a = linearLayout;
        this.b = expandBtnView;
        this.c = linearLayout2;
        this.d = recyclerView;
        this.e = textView;
        this.f = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31053a;
    }
}
