package a;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class jlf extends phe0 {
    @Override // a.khe0
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getAction() != 2) {
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
