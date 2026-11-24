package org.xplatform.cyber.game.core;

import a.clz;
import a.djx;
import a.g6u0;
import a.ne60;
import a.qjj;
import a.s7n0;
import a.si30;
import a.slx;
import a.vj50;
import a.wpm0;
import a.x0x;
import a.xhe0;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class InterceptTouchRecyclerView extends RecyclerView {
    public static final /* synthetic */ int w2 = 0;
    public Function1 m2;
    public vj50 n2;
    public final int[] o2;
    public int p2;
    public int q2;
    public VelocityTracker r2;
    public int s2;
    public long t2;
    public int u2;
    public boolean v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.m2 = new djx((byte) 4);
        this.o2 = new int[2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean A(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        long jC;
        vj50 vj50Var = this.n2;
        if (vj50Var == null) {
            return super.A(i, i2, i3, iArr, iArr2);
        }
        int i4 = i3 == 0 ? this.q2 : 0;
        int i5 = i2 + i4;
        this.q2 = 0;
        int[] iArr3 = {0, 0};
        boolean zA = super.A(i, i5, i3, iArr3, iArr2);
        int i6 = i5 - iArr3[1];
        if (i6 > 0) {
            jC = vj50Var.C(1, (((long) Float.floatToRawIntBits(-i6)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
        } else {
            jC = 0;
        }
        int iB = si30.b(-Float.intBitsToFloat((int) (4294967295L & jC)));
        if (iArr != null) {
            iArr[0] = iArr3[0];
            iArr[1] = (iArr3[1] + iB) - i4;
        }
        return (!zA && ne60.c(jC, 0L) && i4 == 0) ? false : true;
    }

    public final g6u0 H0() {
        VelocityTracker velocityTracker = this.r2;
        if (SystemClock.uptimeMillis() - this.t2 > 100 || velocityTracker == null) {
            return null;
        }
        velocityTracker.computeCurrentVelocity(1000, getMaxFlingVelocity());
        return new g6u0(wpm0.g(-velocityTracker.getXVelocity(this.s2), -velocityTracker.getYVelocity(this.s2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean Q(int i, int i2) {
        boolean z;
        if (this.n2 != null) {
            z = getScrollState() == 1;
        }
        g6u0 g6u0VarH0 = z ? H0() : null;
        if (!z || g6u0VarH0 == null) {
            return super.Q(i, i2);
        }
        long j = g6u0VarH0.f10786a;
        boolean zQ = super.Q(si30.b(g6u0.b(j)), si30.b(g6u0.c(j)));
        this.v2 = zQ;
        return zQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int[] iArr = this.o2;
        getLocationOnScreen(iArr);
        int i = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.q2 = 0;
        } else {
            this.q2 = (this.p2 - i) + this.q2;
        }
        this.p2 = i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s2 = motionEvent.getPointerId(0);
            this.v2 = false;
            VelocityTracker velocityTracker = this.r2;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (actionMasked == 5) {
            this.s2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        } else if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.s2) {
            this.s2 = motionEvent.getPointerId(motionEvent.getActionIndex() != 0 ? 0 : 1);
        }
        VelocityTracker velocityTrackerObtain = this.r2;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.r2 = velocityTrackerObtain;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
        velocityTrackerObtain.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.t2 = motionEvent.getEventTime();
        this.u2 = motionEvent.getActionMasked();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final vj50 getNestedScrollConnection() {
        return this.n2;
    }

    public final Function1<Integer, Boolean> getShouldInterceptTouch() {
        return this.m2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i) {
        vj50 vj50Var;
        boolean zQ;
        if (i != 0 || (vj50Var = this.n2) == null) {
            return;
        }
        byte b = 0;
        if (!this.v2 && this.u2 == 1) {
            g6u0 g6u0VarH0 = H0();
            if (g6u0VarH0 != null) {
                long j = g6u0VarH0.f10786a;
                zQ = Q(si30.b(g6u0.b(j)), si30.b(g6u0.c(j)));
                this.v2 = zQ;
            } else {
                zQ = false;
            }
            if (zQ) {
                return;
            }
        }
        clz clzVarL = s7n0.l(this);
        if (clzVarL != null) {
            qjj.W(x0x.Q(clzVarL.x()), null, null, new slx(vj50Var, null, b), 3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        View viewJ = J(motionEvent.getX(), motionEvent.getY());
        if (viewJ != null) {
            View viewK = K(viewJ);
            xhe0 xhe0VarW = viewK == null ? null : W(viewK);
            if (xhe0VarW != null) {
                if (!((Boolean) this.m2.invoke(Integer.valueOf(xhe0VarW.c()))).booleanValue()) {
                    return false;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setNestedScrollConnection(vj50 vj50Var) {
        this.n2 = vj50Var;
    }

    public final void setShouldInterceptTouch(Function1<? super Integer, Boolean> function1) {
        function1.getClass();
        this.m2 = function1;
    }
}
