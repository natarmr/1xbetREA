package a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class lwq implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20776a;
    public final int b;
    public final int c;
    public final View d;
    public kwq e;
    public kwq f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public lwq(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f20776a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        kwq kwqVar = this.f;
        View view = this.d;
        if (kwqVar != null) {
            view.removeCallbacks(kwqVar);
        }
        kwq kwqVar2 = this.e;
        if (kwqVar2 != null) {
            view.removeCallbacks(kwqVar2);
        }
    }

    public abstract tsj0 b();

    public abstract boolean c();

    public boolean d() {
        tsj0 tsj0VarB = b();
        if (tsj0VarB == null || !tsj0VarB.f()) {
            return true;
        }
        tsj0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        hil hilVarR;
        boolean z2 = this.g;
        View view2 = this.d;
        if (z2) {
            tsj0 tsj0VarB = b();
            if (tsj0VarB != null && tsj0VarB.f() && (hilVarR = tsj0VarB.r()) != null && hilVarR.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                hilVarR.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = hilVarR.b(motionEventObtainNoHistory, this.h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.h = motionEvent.getPointerId(0);
                    kwq kwqVar = this.e;
                    if (kwqVar == null) {
                        kwqVar = new kwq(this, (byte) 0);
                        this.e = kwqVar;
                    }
                    view2.postDelayed(kwqVar, this.b);
                    kwq kwqVar2 = this.f;
                    if (kwqVar2 == null) {
                        kwqVar2 = new kwq(this, (byte) 1);
                        this.f = kwqVar2;
                    }
                    view2.postDelayed(kwqVar2, this.c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f20776a;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        kwq kwqVar = this.e;
        if (kwqVar != null) {
            this.d.removeCallbacks(kwqVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
