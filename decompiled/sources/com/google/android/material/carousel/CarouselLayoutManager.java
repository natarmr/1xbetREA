package com.google.android.material.carousel;

import a.g14;
import a.hhe0;
import a.jf4;
import a.jva;
import a.kva;
import a.lva;
import a.msj;
import a.mva;
import a.rhe0;
import a.rpd0;
import a.the0;
import a.twn;
import a.yx3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends b implements rhe0 {
    public final yx3 p;
    public mva q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new kva();
        this.r = new g14(this, (byte) 1);
        this.p = new yx3();
        F0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.f);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            F0();
            X0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final int A(the0 the0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final int B(the0 the0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 E() {
        return new hhe0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.b
    public final int G0(int i, msj msjVar, the0 the0Var) {
        if (!V0() || I() == 0 || i == 0) {
            return 0;
        }
        b0(msjVar.e(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.b
    public final int I0(int i, msj msjVar, the0 the0Var) {
        if (!r() || I() == 0 || i == 0) {
            return 0;
        }
        b0(msjVar.e(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.b
    public final void M(Rect rect, View view) {
        RecyclerView.Y(rect, view);
        rect.centerY();
        if (V0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        jva jvaVar = new jva(this, recyclerView.getContext());
        jvaVar.f32207a = i;
        S0(jvaVar);
    }

    public final float U0(float f, float f2) {
        return W0() ? f - f2 : f + f2;
    }

    public final boolean V0() {
        return !this.q.f22447a;
    }

    public final boolean W0() {
        return V0() && this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean X() {
        return true;
    }

    public final void X0(int i) {
        lva lvaVar;
        if (i != 0 && i != 1) {
            jf4.o(twn.m(i, "invalid orientation:"));
            return;
        }
        n(null);
        mva mvaVar = this.q;
        if (mvaVar == null || i != mvaVar.f22447a) {
            if (i == 0) {
                lvaVar = new lva(this, (byte) 1);
            } else {
                if (i != 1) {
                    jf4.o("invalid orientation");
                    return;
                }
                lvaVar = new lva(this, (byte) 0);
            }
            this.q = lvaVar;
            F0();
        }
    }

    @Override // a.rhe0
    public final PointF a(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.b
    public final void b0(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.b
    public final void f0(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        yx3 yx3Var = this.p;
        float dimension = yx3Var.f43402a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        yx3Var.f43402a = dimension;
        float dimension2 = yx3Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        yx3Var.b = dimension2;
        F0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // androidx.recyclerview.widget.b
    public final void g0(RecyclerView recyclerView, msj msjVar) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // androidx.recyclerview.widget.b
    public final View h0(View view, int i, msj msjVar, the0 the0Var) {
        byte b;
        if (I() != 0) {
            boolean z = this.q.f22447a;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        } else if (z) {
                            b = 1;
                        }
                        b = -2147483648;
                    } else if (z) {
                        b = -2147483648;
                    } else if (W0()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (z) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (z) {
                b = -2147483648;
            } else if (W0()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (b.T(view) != 0) {
                        int iT = b.T(H(0)) - 1;
                        if (iT < 0 || iT >= S()) {
                            return H(W0() ? I() - 1 : 0);
                        }
                        this.q.d();
                        throw null;
                    }
                } else if (b.T(view) != S() - 1) {
                    int iT2 = b.T(H(I() - 1)) + 1;
                    if (iT2 < 0 || iT2 >= S()) {
                        return H(W0() ? 0 : I() - 1);
                    }
                    this.q.d();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b
    public final void i0(AccessibilityEvent accessibilityEvent) {
        super.i0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(b.T(H(0)));
            accessibilityEvent.setToIndex(b.T(H(I() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void m0(RecyclerView recyclerView, int i, int i2) {
        S();
    }

    @Override // androidx.recyclerview.widget.b
    public final void n0() {
        S();
    }

    @Override // androidx.recyclerview.widget.b
    public final void p0(int i, int i2) {
        S();
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean q() {
        return V0();
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean r() {
        return !V0();
    }

    @Override // androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        if (the0Var.b() > 0) {
            if ((V0() ? this.n : this.o) > 0.0f) {
                W0();
                b0(msjVar.e(0));
                throw null;
            }
        }
        A0(msjVar);
    }

    @Override // androidx.recyclerview.widget.b
    public final void t0(the0 the0Var) {
        if (I() == 0) {
            return;
        }
        b.T(H(0));
    }

    @Override // androidx.recyclerview.widget.b
    public final int w(the0 the0Var) {
        I();
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final int x(the0 the0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final int y(the0 the0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final int z(the0 the0Var) {
        I();
        return 0;
    }

    public CarouselLayoutManager() {
        yx3 yx3Var = new yx3();
        new kva();
        this.r = new g14(this, (byte) 1);
        this.p = yx3Var;
        F0();
        X0(0);
    }
}
