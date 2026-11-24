package a;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public final class nf00 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23412a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nf00(Object obj, byte b) {
        this.f23412a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.f23412a;
        Object obj = this.b;
        switch (b) {
            case 0:
                of00 of00Var = (of00) obj;
                lf00 lf00Var = of00Var.r;
                Handler handler = of00Var.v;
                xd3 xd3Var = of00Var.z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && xd3Var != null && xd3Var.isShowing() && x >= 0 && x < xd3Var.getWidth() && y >= 0 && y < xd3Var.getHeight()) {
                    handler.postDelayed(lf00Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(lf00Var);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
