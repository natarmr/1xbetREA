package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class cth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4935a;
    public final RecyclerView b;

    public cth(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f4935a = frameLayout;
        this.b = recyclerView;
    }

    public static cth a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_cs2_round_statistics_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.roundsRecycler);
        if (recyclerView != null) {
            return new cth((FrameLayout) viewInflate, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.roundsRecycler)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4935a;
    }
}
