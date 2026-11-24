package a;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class pyx implements khe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vyx f27819a;

    public pyx(vyx vyxVar) {
        this.f27819a = vyxVar;
    }

    @Override // a.khe0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) throws JSONException {
        vyx vyxVar = this.f27819a;
        mx2 mx2Var = vyxVar.r;
        vyxVar.w.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = vyxVar.s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (vyxVar.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(vyxVar.l);
        if (iFindPointerIndex >= 0) {
            vyxVar.k(actionMasked, iFindPointerIndex, motionEvent);
        }
        xhe0 xhe0Var = vyxVar.c;
        if (xhe0Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    vyxVar.t(vyxVar.o, iFindPointerIndex, motionEvent);
                    vyxVar.q(xhe0Var);
                    vyxVar.q.removeCallbacks(mx2Var);
                    mx2Var.run();
                    vyxVar.q.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == vyxVar.l) {
                    vyxVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    vyxVar.t(vyxVar.o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = vyxVar.s;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        vyxVar.r(null, 0);
        vyxVar.l = -1;
    }

    @Override // a.khe0
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        vyx vyxVar = this.f27819a;
        vyxVar.w.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        qyx qyxVar = null;
        if (actionMasked == 0) {
            vyxVar.l = motionEvent.getPointerId(0);
            vyxVar.d = motionEvent.getX();
            vyxVar.e = motionEvent.getY();
            VelocityTracker velocityTracker = vyxVar.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            vyxVar.s = VelocityTracker.obtain();
            if (vyxVar.c == null) {
                ArrayList arrayList = vyxVar.p;
                if (!arrayList.isEmpty()) {
                    View viewN = vyxVar.n(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        qyx qyxVar2 = (qyx) arrayList.get(size);
                        if (qyxVar2.e.f40887a == viewN) {
                            qyxVar = qyxVar2;
                            break;
                        }
                    }
                }
                if (qyxVar != null) {
                    xhe0 xhe0Var = qyxVar.e;
                    vyxVar.d -= qyxVar.i;
                    vyxVar.e -= qyxVar.j;
                    vyxVar.m(xhe0Var, true);
                    if (vyxVar.f38271a.remove(xhe0Var.f40887a)) {
                        vyxVar.m.getClass();
                        syx.d(xhe0Var);
                    }
                    vyxVar.r(xhe0Var, qyxVar.f);
                    vyxVar.t(vyxVar.o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            vyxVar.l = -1;
            vyxVar.r(null, 0);
        } else {
            int i = vyxVar.l;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                vyxVar.k(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = vyxVar.s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return vyxVar.c != null;
    }

    @Override // a.khe0
    public final void e(boolean z) {
        if (z) {
            this.f27819a.r(null, 0);
        }
    }
}
