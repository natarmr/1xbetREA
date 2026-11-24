package a;

import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.collections.CollectionsKt;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketLineView;

/* JADX INFO: loaded from: classes6.dex */
public final class it8 extends BracketLineView {
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public AnimatorSet l;
    public VelocityTracker m;
    public gt8 n;

    public static ValueAnimator a(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setEvaluator(new IntEvaluator());
        return valueAnimatorOfInt;
    }

    public final void b(int i, int i2, boolean z, final boolean z2, final boolean z3) {
        if (!z) {
            gt8 gt8Var = this.n;
            if (gt8Var != null) {
                ((BracketItemView) gt8Var).b(i, i2, true, z3);
                return;
            }
            return;
        }
        final kie0 kie0Var = new kie0();
        final kie0 kie0Var2 = new kie0();
        final ValueAnimator valueAnimatorA = a(i);
        final ValueAnimator valueAnimatorA2 = a(i2);
        valueAnimatorA.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.ft8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimatorA.getAnimatedValue();
                animatedValue.getClass();
                int iIntValue = ((Integer) animatedValue).intValue();
                Object animatedValue2 = valueAnimatorA2.getAnimatedValue();
                animatedValue2.getClass();
                int iIntValue2 = ((Integer) animatedValue2).intValue();
                kie0 kie0Var3 = kie0Var;
                int i3 = iIntValue - kie0Var3.f18333a;
                kie0 kie0Var4 = kie0Var2;
                int i4 = iIntValue2 - kie0Var4.f18333a;
                kie0Var3.f18333a = iIntValue;
                kie0Var4.f18333a = iIntValue2;
                gt8 gt8Var2 = this.n;
                if (gt8Var2 != null) {
                    ((BracketItemView) gt8Var2).b(i3, i4, !z2, z3);
                }
            }
        });
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.l = animatorSet2;
        byte b = 0;
        animatorSet2.playTogether(valueAnimatorA, valueAnimatorA2);
        AnimatorSet animatorSet3 = this.l;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(500L);
        }
        AnimatorSet animatorSet4 = this.l;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new ht8(this, z3, b));
        }
        AnimatorSet animatorSet5 = this.l;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gt8 gt8Var;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.d = x;
            this.f = x;
            this.e = y;
            this.g = y;
        } else if (action == 2) {
            float f = x - this.d;
            float f2 = y - this.e;
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(y - this.g);
            if (fAbs > this.j && fAbs * 0.5f > fAbs2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                float f3 = this.f;
                int i = this.j;
                this.d = f > 0.0f ? f3 + i : f3 - i;
                this.e = y;
                this.k = true;
                gt8 gt8Var2 = this.n;
                if (gt8Var2 != null) {
                    BracketItemView bracketItemView = (BracketItemView) gt8Var2;
                    bracketItemView.u = bracketItemView.getPage();
                    bracketItemView.l1 = true;
                    bracketItemView.m1 = true;
                }
            }
            if (this.k && (gt8Var = this.n) != null) {
                ((BracketItemView) gt8Var).b((int) f, (int) f2, true, true);
            }
        }
        VelocityTracker velocityTrackerObtain = this.m;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.m = velocityTrackerObtain;
        }
        if (velocityTrackerObtain != null) {
            velocityTrackerObtain.addMovement(motionEvent);
        }
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int xVelocity;
        VelocityTracker velocityTracker3;
        int yVelocity;
        gt8 gt8Var;
        int i;
        VelocityTracker velocityTracker4;
        BracketItemView bracketItemView;
        int page;
        int page2;
        int size;
        is8 is8Var;
        boolean z;
        int i2;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        VelocityTracker velocityTrackerObtain = this.m;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.m = velocityTrackerObtain;
        }
        if (velocityTrackerObtain != null) {
            velocityTrackerObtain.addMovement(motionEvent);
        }
        if (action == 0) {
            this.d = x;
            this.f = x;
            this.e = y;
            this.g = y;
            return true;
        }
        if (action == 1) {
            if (this.k) {
                velocityTracker = this.m;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1000, this.i);
                }
                velocityTracker2 = this.m;
                if (velocityTracker2 != null) {
                    xVelocity = (int) velocityTracker2.getXVelocity();
                } else {
                    xVelocity = 0;
                }
                velocityTracker3 = this.m;
                if (velocityTracker3 != null) {
                    yVelocity = (int) velocityTracker3.getYVelocity();
                } else {
                    yVelocity = 0;
                }
                if (yVelocity < this.h) {
                    yVelocity = 0;
                }
                gt8Var = this.n;
                if (gt8Var != null) {
                    bracketItemView = (BracketItemView) gt8Var;
                    bracketItemView.m1 = false;
                    if (xVelocity < -900) {
                        page2 = bracketItemView.u;
                    } else {
                        if (xVelocity > 900) {
                            page = bracketItemView.u - 1;
                        } else if (bracketItemView.getFractionalPage() % 1.0f > 0.5d) {
                            page2 = bracketItemView.getPage();
                        } else {
                            page = bracketItemView.getPage();
                        }
                        size = bracketItemView.i1.size() - 1;
                        if (page > size) {
                            page = size;
                        }
                        if (page <= 0) {
                            page = 0;
                        }
                        float f = page;
                        int i3 = (int) f;
                        float f2 = -bracketItemView.g(i3);
                        is8Var = (is8) CollectionsKt.W(i3 + 1, bracketItemView.t);
                        if (is8Var != null) {
                            z = is8Var.f15291a;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i2 = bracketItemView.d;
                        } else {
                            i2 = bracketItemView.v;
                        }
                        i = (-((int) rw2.a(f, i3, i2, f2))) - ((int) bracketItemView.x);
                    }
                    page = page2 + 1;
                    size = bracketItemView.i1.size() - 1;
                    if (page > size) {
                        page = size;
                    }
                    if (page <= 0) {
                        page = 0;
                    }
                    float f3 = page;
                    int i4 = (int) f3;
                    float f4 = -bracketItemView.g(i4);
                    is8Var = (is8) CollectionsKt.W(i4 + 1, bracketItemView.t);
                    if (is8Var != null) {
                        z = is8Var.f15291a;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2 = bracketItemView.d;
                    } else {
                        i2 = bracketItemView.v;
                    }
                    i = (-((int) rw2.a(f3, i4, i2, f4))) - ((int) bracketItemView.x);
                } else {
                    i = xVelocity * 500;
                }
                b(i, yVelocity * 500, true, false, true);
                this.k = false;
                velocityTracker4 = this.m;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                }
                this.m = null;
            }
        } else if (action == 2) {
            float f5 = x - this.d;
            float f6 = y - this.e;
            if (this.k) {
                this.d = x;
                this.e = y;
                gt8 gt8Var2 = this.n;
                if (gt8Var2 != null) {
                    ((BracketItemView) gt8Var2).b((int) f5, (int) f6, true, true);
                    return true;
                }
            } else {
                float fAbs = Math.abs(f5);
                float fAbs2 = Math.abs(y - this.g);
                if (fAbs > this.j && fAbs * 0.5f > fAbs2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    float f7 = this.f;
                    int i5 = this.j;
                    this.d = f5 > 0.0f ? f7 + i5 : f7 - i5;
                    this.e = y;
                    this.k = true;
                    gt8 gt8Var3 = this.n;
                    if (gt8Var3 != null) {
                        BracketItemView bracketItemView2 = (BracketItemView) gt8Var3;
                        bracketItemView2.u = bracketItemView2.getPage();
                        bracketItemView2.l1 = true;
                        bracketItemView2.m1 = true;
                        return true;
                    }
                }
            }
        } else if (action == 3) {
            if (this.k) {
                velocityTracker = this.m;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1000, this.i);
                }
                velocityTracker2 = this.m;
                if (velocityTracker2 != null) {
                    xVelocity = (int) velocityTracker2.getXVelocity();
                } else {
                    xVelocity = 0;
                }
                velocityTracker3 = this.m;
                if (velocityTracker3 != null) {
                    yVelocity = (int) velocityTracker3.getYVelocity();
                } else {
                    yVelocity = 0;
                }
                if (yVelocity < this.h) {
                    yVelocity = 0;
                }
                gt8Var = this.n;
                if (gt8Var != null) {
                    bracketItemView = (BracketItemView) gt8Var;
                    bracketItemView.m1 = false;
                    if (xVelocity < -900) {
                        page2 = bracketItemView.u;
                    } else {
                        if (xVelocity > 900) {
                            page = bracketItemView.u - 1;
                        } else if (bracketItemView.getFractionalPage() % 1.0f > 0.5d) {
                            page2 = bracketItemView.getPage();
                        } else {
                            page = bracketItemView.getPage();
                        }
                        size = bracketItemView.i1.size() - 1;
                        if (page > size) {
                            page = size;
                        }
                        if (page <= 0) {
                            page = 0;
                        }
                        float f8 = page;
                        int i6 = (int) f8;
                        float f9 = -bracketItemView.g(i6);
                        is8Var = (is8) CollectionsKt.W(i6 + 1, bracketItemView.t);
                        if (is8Var != null) {
                            z = is8Var.f15291a;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i2 = bracketItemView.d;
                        } else {
                            i2 = bracketItemView.v;
                        }
                        i = (-((int) rw2.a(f8, i6, i2, f9))) - ((int) bracketItemView.x);
                    }
                    page = page2 + 1;
                    size = bracketItemView.i1.size() - 1;
                    if (page > size) {
                        page = size;
                    }
                    if (page <= 0) {
                        page = 0;
                    }
                    float f10 = page;
                    int i7 = (int) f10;
                    float f11 = -bracketItemView.g(i7);
                    is8Var = (is8) CollectionsKt.W(i7 + 1, bracketItemView.t);
                    if (is8Var != null) {
                        z = is8Var.f15291a;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2 = bracketItemView.d;
                    } else {
                        i2 = bracketItemView.v;
                    }
                    i = (-((int) rw2.a(f10, i7, i2, f11))) - ((int) bracketItemView.x);
                } else {
                    i = xVelocity * 500;
                }
                b(i, yVelocity * 500, true, false, true);
                this.k = false;
                velocityTracker4 = this.m;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                }
                this.m = null;
            }
        }
        return true;
    }

    public final void setScrollDelegate(gt8 gt8Var) {
        this.n = gt8Var;
    }
}
