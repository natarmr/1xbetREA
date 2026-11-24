package a;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;

/* JADX INFO: loaded from: classes.dex */
public final class fu5 extends ywb {
    public Matrix e;
    public Matrix f;
    public cp10 g;
    public cp10 h;
    public float i;
    public float j;
    public float k;
    public v500 l;
    public VelocityTracker m;
    public long n;
    public cp10 o;
    public cp10 p;
    public float q;
    public float r;

    public static float d(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final cp10 a(float f, float f2) {
        FinBetChartView finBetChartView = this.d;
        xju0 viewPortHandler = finBetChartView.getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return cp10.b(f3, -((finBetChartView.getMeasuredHeight() - f2) - (viewPortHandler.d - viewPortHandler.b.bottom)));
    }

    public final void b() {
        FinBetChartView finBetChartView = this.d;
        if (this.l == null) {
            finBetChartView.v1.getClass();
            finBetChartView.w1.getClass();
        }
        v500 v500Var = this.l;
        if (v500Var != null) {
            (v500Var.d == 1 ? finBetChartView.v1 : finBetChartView.w1).getClass();
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.f.set(this.e);
        cp10 cp10Var = this.g;
        cp10Var.b = motionEvent.getX();
        cp10Var.c = motionEvent.getY();
        FinBetChartView finBetChartView = this.d;
        vxv vxvVarB = finBetChartView.b(motionEvent.getX(), motionEvent.getY());
        this.l = vxvVarB != null ? (v500) ((gu5) finBetChartView.b).c(vxvVarB.e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        FinBetChartView finBetChartView = this.d;
        finBetChartView.getOnChartGestureListener();
        if (finBetChartView.i1 && ((gu5) finBetChartView.getData()).d() > 0) {
            cp10 cp10VarA = a(motionEvent.getX(), motionEvent.getY());
            float f = finBetChartView.m1 ? 1.4f : 1.0f;
            float f2 = finBetChartView.n1 ? 1.4f : 1.0f;
            float f3 = cp10VarA.b;
            float f4 = cp10VarA.c;
            xju0 xju0Var = finBetChartView.r;
            Matrix matrix = finBetChartView.F1;
            xju0Var.getClass();
            matrix.reset();
            matrix.set(xju0Var.f41005a);
            matrix.postScale(f, f2, f3, -f4);
            xju0Var.e(matrix, finBetChartView, false);
            finBetChartView.a();
            finBetChartView.postInvalidate();
            if (finBetChartView.f18993a) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + cp10VarA.b + ", y: " + cp10VarA.c);
            }
            cp10.d.c(cp10VarA);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d.getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.d.getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        vxv vxvVar;
        FinBetChartView finBetChartView = this.d;
        finBetChartView.getOnChartGestureListener();
        if (!finBetChartView.c) {
            return false;
        }
        vxv vxvVarB = finBetChartView.b(motionEvent.getX(), motionEvent.getY());
        if (vxvVarB == null || ((vxvVar = this.b) != null && vxvVarB.e == vxvVar.e && vxvVarB.f38220a == vxvVar.f38220a)) {
            finBetChartView.c(null);
            this.b = null;
        } else {
            finBetChartView.c(vxvVarB);
            this.b = vxvVarB;
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vxv vxvVarB;
        vxv vxvVar;
        VelocityTracker velocityTracker;
        Matrix matrix = this.f;
        cp10 cp10Var = this.p;
        cp10 cp10Var2 = this.o;
        cp10 cp10Var3 = this.h;
        cp10 cp10Var4 = this.g;
        FinBetChartView finBetChartView = this.d;
        VelocityTracker velocityTrackerObtain = this.m;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.m = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.m) != null) {
            velocityTracker.recycle();
            this.m = null;
        }
        if (this.f43363a == 0) {
            this.c.onTouchEvent(motionEvent);
        }
        if (!finBetChartView.k1 && !finBetChartView.l1 && !finBetChartView.m1 && !finBetChartView.n1) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.m;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, dut0.c);
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > dut0.b || Math.abs(yVelocity) > dut0.b) && this.f43363a == 1 && finBetChartView.d) {
                    cp10Var.b = 0.0f;
                    cp10Var.c = 0.0f;
                    this.n = AnimationUtils.currentAnimationTimeMillis();
                    cp10Var2.b = motionEvent.getX();
                    cp10Var2.c = motionEvent.getY();
                    cp10Var.b = xVelocity;
                    cp10Var.c = yVelocity;
                    finBetChartView.postInvalidateOnAnimation();
                }
                int i2 = this.f43363a;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    finBetChartView.a();
                    finBetChartView.postInvalidate();
                }
                this.f43363a = 0;
                ViewParent parent = finBetChartView.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.m = null;
                }
                finBetChartView.getOnChartGestureListener();
            } else if (action == 2) {
                int i3 = this.f43363a;
                if (i3 == 1) {
                    ViewParent parent2 = finBetChartView.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    float x = finBetChartView.k1 ? motionEvent.getX() - cp10Var4.b : 0.0f;
                    float y = finBetChartView.l1 ? motionEvent.getY() - cp10Var4.c : 0.0f;
                    this.e.set(matrix);
                    finBetChartView.getOnChartGestureListener();
                    b();
                    this.e.postTranslate(x, y);
                } else {
                    if (i3 == 2 || i3 == 3 || i3 == 4) {
                        ViewParent parent3 = finBetChartView.getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        if ((finBetChartView.m1 || finBetChartView.n1) && motionEvent.getPointerCount() >= 2) {
                            finBetChartView.getOnChartGestureListener();
                            float fD = d(motionEvent);
                            if (fD > this.r) {
                                cp10 cp10VarA = a(cp10Var3.b, cp10Var3.c);
                                xju0 viewPortHandler = finBetChartView.getViewPortHandler();
                                int i4 = this.f43363a;
                                if (i4 == 4) {
                                    float f = fD / this.k;
                                    boolean z = f < 1.0f;
                                    boolean z2 = !z ? viewPortHandler.g >= viewPortHandler.f : viewPortHandler.g <= viewPortHandler.e;
                                    if (!z ? viewPortHandler.h < Float.MAX_VALUE : viewPortHandler.h > 1.0f) {
                                        i = 1;
                                    }
                                    float f2 = finBetChartView.m1 ? f : 1.0f;
                                    float f3 = finBetChartView.n1 ? f : 1.0f;
                                    if (i != 0 || z2) {
                                        this.e.set(matrix);
                                        this.e.postScale(f2, f3, cp10VarA.b, cp10VarA.c);
                                    }
                                } else if (i4 == 2 && finBetChartView.m1) {
                                    float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.i;
                                    if (fAbs >= 1.0f ? viewPortHandler.g < viewPortHandler.f : viewPortHandler.g > viewPortHandler.e) {
                                        this.e.set(matrix);
                                        this.e.postScale(fAbs, 1.0f, cp10VarA.b, cp10VarA.c);
                                    }
                                } else if (i4 == 3 && finBetChartView.n1) {
                                    float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.j;
                                    if (fAbs2 >= 1.0f ? viewPortHandler.h < Float.MAX_VALUE : viewPortHandler.h > 1.0f) {
                                        this.e.set(matrix);
                                        this.e.postScale(1.0f, fAbs2, cp10VarA.b, cp10VarA.c);
                                    }
                                }
                                cp10.d.c(cp10VarA);
                            }
                        }
                    } else if (i3 == 0) {
                        float x2 = motionEvent.getX() - cp10Var4.b;
                        float y2 = motionEvent.getY() - cp10Var4.c;
                        if (Math.abs((float) Math.sqrt((y2 * y2) + (x2 * x2))) > this.q && (finBetChartView.k1 || finBetChartView.l1)) {
                            xju0 xju0Var = finBetChartView.r;
                            float f4 = xju0Var.g;
                            float f5 = xju0Var.e;
                            if (f4 > f5 || f5 > 1.0f || xju0Var.h > 1.0f || xju0Var.j > 0.0f || xju0Var.k > 0.0f) {
                                float fAbs3 = Math.abs(motionEvent.getX() - cp10Var4.b);
                                float fAbs4 = Math.abs(motionEvent.getY() - cp10Var4.c);
                                if ((finBetChartView.k1 || fAbs4 >= fAbs3) && (finBetChartView.l1 || fAbs4 <= fAbs3)) {
                                    this.f43363a = 1;
                                }
                            } else {
                                boolean z3 = finBetChartView.j1;
                                if (z3 && z3 && (vxvVarB = finBetChartView.b(motionEvent.getX(), motionEvent.getY())) != null && ((vxvVar = this.b) == null || vxvVarB.e != vxvVar.e || vxvVarB.f38220a != vxvVar.f38220a)) {
                                    this.b = vxvVarB;
                                    finBetChartView.c(vxvVarB);
                                }
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.f43363a = 0;
                finBetChartView.getOnChartGestureListener();
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker4 = this.m;
                    velocityTracker4.computeCurrentVelocity(1000, dut0.c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float xVelocity2 = velocityTracker4.getXVelocity(pointerId2);
                    float yVelocity2 = velocityTracker4.getYVelocity(pointerId2);
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        if (i != actionIndex) {
                            int pointerId3 = motionEvent.getPointerId(i);
                            if ((velocityTracker4.getYVelocity(pointerId3) * yVelocity2) + (velocityTracker4.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                velocityTracker4.clear();
                                break;
                            }
                        }
                        i++;
                    }
                    this.f43363a = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent4 = finBetChartView.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(true);
                }
                c(motionEvent);
                this.i = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.j = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float fD2 = d(motionEvent);
                this.k = fD2;
                if (fD2 > 10.0f) {
                    if (finBetChartView.h1) {
                        this.f43363a = 4;
                    } else {
                        boolean z4 = finBetChartView.m1;
                        if (z4 != finBetChartView.n1) {
                            this.f43363a = z4 ? 2 : 3;
                        } else {
                            this.f43363a = this.i > this.j ? 2 : 3;
                        }
                    }
                }
                float x3 = motionEvent.getX(1) + motionEvent.getX(0);
                float y3 = motionEvent.getY(1) + motionEvent.getY(0);
                cp10Var3.b = x3 / 2.0f;
                cp10Var3.c = y3 / 2.0f;
            }
        } else {
            finBetChartView.getOnChartGestureListener();
            cp10Var.b = 0.0f;
            cp10Var.c = 0.0f;
            c(motionEvent);
        }
        xju0 viewPortHandler2 = finBetChartView.getViewPortHandler();
        Matrix matrix2 = this.e;
        viewPortHandler2.e(matrix2, finBetChartView, true);
        this.e = matrix2;
        return true;
    }
}
