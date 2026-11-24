package a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class nd3 extends ContentFrameLayout {
    public final /* synthetic */ pd3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd3(pd3 pd3Var, tje tjeVar) {
        super(tjeVar);
        this.i = pd3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.L(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                pd3 pd3Var = this.i;
                pd3Var.J(pd3Var.Q(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(epv0.U(i, getContext()));
    }
}
