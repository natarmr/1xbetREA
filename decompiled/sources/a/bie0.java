package a;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class bie0 extends phe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2656a;

    public bie0(RecyclerView recyclerView) {
        this.f2656a = recyclerView;
    }

    @Override // a.khe0
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
        RecyclerView recyclerView2 = this.f2656a;
        if (!recyclerView2.canScrollHorizontally(1) && !recyclerView2.canScrollHorizontally(-1)) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        if (action == 1) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        if (action == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        if (action != 10) {
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
