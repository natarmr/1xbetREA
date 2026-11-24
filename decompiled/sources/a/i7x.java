package a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class i7x implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qo8 f14315a;

    public i7x(qo8 qo8Var) {
        this.f14315a = qo8Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        qo8 qo8Var = this.f14315a;
        ax2 ax2Var = (ax2) qo8Var.d;
        if (!qo8Var.c) {
            int i2 = qo8Var.b;
            if (i2 == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    i = f > 0.0f ? 1 : 2;
                    AndroidComposeView androidComposeView = ax2Var.b;
                    Class cls = AndroidComposeView.j2;
                    ((ypq) androidComposeView.getFocusOwner()).i(i, false);
                    return true;
                }
            } else if (i2 == 2 && Math.abs(f2) > Math.abs(f)) {
                i = f2 > 0.0f ? 1 : 2;
                AndroidComposeView androidComposeView2 = ax2Var.b;
                Class cls2 = AndroidComposeView.j2;
                ((ypq) androidComposeView2.getFocusOwner()).i(i, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
