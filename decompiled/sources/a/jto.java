package a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jto implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f17109a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ jto(RecyclerView recyclerView, View view, boolean z, int i) {
        this.f17109a = recyclerView;
        this.b = view;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.b layoutManager = this.f17109a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        this.b.setVisibility((!this.c && this.d - (linearLayoutManager.g1() + 1) <= 0 && linearLayoutManager.c1() == 0) ? 8 : 0);
    }
}
