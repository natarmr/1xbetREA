package a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class tyx extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34778a = true;
    public final /* synthetic */ vyx b;

    public tyx(vyx vyxVar) {
        this.b = vyxVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewN;
        xhe0 xhe0VarW;
        vyx vyxVar = this.b;
        syx syxVar = vyxVar.m;
        if (!this.f34778a || (viewN = vyxVar.n(motionEvent)) == null || (xhe0VarW = vyxVar.q.W(viewN)) == null) {
            return;
        }
        RecyclerView recyclerView = vyxVar.q;
        if ((syx.f(syxVar.n(recyclerView, xhe0VarW), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = vyxVar.l;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                vyxVar.d = x;
                vyxVar.e = y;
                vyxVar.i = 0.0f;
                vyxVar.h = 0.0f;
                if (syxVar.p()) {
                    vyxVar.r(xhe0VarW, 2);
                }
            }
        }
    }
}
