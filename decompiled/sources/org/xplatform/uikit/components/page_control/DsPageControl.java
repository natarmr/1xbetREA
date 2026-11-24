package org.xplatform.uikit.components.page_control;

import a.bqd0;
import a.ccf;
import a.gbn;
import a.gkz;
import a.iv60;
import a.jmu0;
import a.l5g;
import a.m900;
import a.msj;
import a.pmk0;
import a.r580;
import a.the0;
import a.wi80;
import a.xk60;
import a.xp6;
import a.yge0;
import a.yz3;
import a.zc70;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsPageControl extends RecyclerView {
    public static final /* synthetic */ int y2 = 0;
    public final gkz m2;
    public final xp6 n2;
    public final l5g o2;
    public ViewPager2 p2;
    public int q2;
    public int r2;
    public final int s2;
    public final int t2;
    public int u2;
    public final int v2;
    public final int w2;
    public int x2;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsPageControl(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.pageControlStyle);
        final gkz gkzVar = new gkz(gkz.g);
        byte b = 16;
        byte b2 = 1;
        gkzVar.d.b(new gbn(new zc70(b), new iv60(3, b2), new r580(b), xk60.d));
        this.m2 = gkzVar;
        this.n2 = new xp6(this, (byte) 5);
        this.o2 = new l5g(this, b2);
        this.q2 = -1;
        this.r2 = -1;
        this.s2 = -1;
        this.t2 = -1;
        this.u2 = -1;
        this.v2 = -1;
        this.w2 = -1;
        this.x2 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.V, R.attr.pageControlStyle, 0);
        this.s2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.t2 = dimensionPixelSize;
        this.u2 = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.v2 = typedArrayObtainStyledAttributes.getColor(0, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.w2 = dimensionPixelSize2;
        typedArrayObtainStyledAttributes.recycle();
        m(new pmk0(dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize2, 0, 0, 192));
        jmu0.i(this, ((getPaddingTop() + getPaddingBottom()) + dimensionPixelSize) / 2);
        setItemAnimator(null);
        setAdapter(gkzVar);
        final Context context2 = getContext();
        setLayoutManager(new LinearLayoutManager(context2) { // from class: org.xplatform.uikit.components.page_control.DsPageControl$obtainLinearLayoutManager$1
            public final float g1;
            public final float h1;

            {
                int i2 = this.i1.t2;
                int i3 = this.i1.w2;
                this.g1 = ((i2 + i3) * 2.0f) + i3;
                this.h1 = 1.0f;
            }

            /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
            public final void C1() {
                char c;
                char c2;
                Pair pair;
                Number number;
                yz3 yz3Var = gkzVar.e;
                int i2 = -1;
                char c3 = 1;
                if (p1()) {
                    int iS = S();
                    List list = yz3Var.f;
                    list.getClass();
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        if (((wi80) it.next()).b) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                    i2 = (iS - i2) - 1;
                } else {
                    List list2 = yz3Var.f;
                    list2.getClass();
                    Iterator it2 = list2.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        if (((wi80) it2.next()).b) {
                            i2 = i4;
                            break;
                        }
                        i4++;
                    }
                }
                int I = I();
                int i5 = 0;
                while (i5 < I) {
                    View viewH = H(i5);
                    if (viewH != null) {
                        int right = (viewH.getRight() + viewH.getLeft()) / 2;
                        int iS2 = S();
                        float f = this.h1;
                        if (iS2 <= 9) {
                            pair = new Pair(Float.valueOf(f), Boolean.FALSE);
                        } else {
                            DsPageControl dsPageControl = this;
                            if (dsPageControl.getWidth() == 0) {
                                pair = new Pair(Float.valueOf(f), Boolean.FALSE);
                            } else {
                                float f2 = this.g1;
                                if (i2 == 5) {
                                    c2 = 0;
                                    float f3 = right;
                                    if ((f2 / 2.0f) - f3 >= 0.0f) {
                                        pair = new Pair(Float.valueOf((f3 / f2) * 2.0f), Boolean.FALSE);
                                    }
                                    c = c3;
                                } else {
                                    c2 = 0;
                                }
                                if (i2 > 5) {
                                    float f4 = right;
                                    if (f2 - f4 >= 0.0f) {
                                        pair = new Pair(Float.valueOf(f4 / f2), Boolean.FALSE);
                                        c = c3;
                                    }
                                }
                                if (S() - i2 == 6) {
                                    c = c3;
                                    if (right - (dsPageControl.getWidth() - (f2 / 2.0f)) >= 0.0f) {
                                        pair = new Pair(Float.valueOf((1.0f - (((right - dsPageControl.getWidth()) + f2) / f2)) * 2.0f), Boolean.FALSE);
                                    }
                                } else {
                                    c = c3;
                                }
                                pair = (S() - i2 <= 6 || ((float) right) - (((float) dsPageControl.getWidth()) - f2) < 0.0f) ? new Pair(Float.valueOf(f), Boolean.TRUE) : new Pair(Float.valueOf(1.0f - (((right - dsPageControl.getWidth()) + f2) / f2)), Boolean.FALSE);
                            }
                            number = (Number) pair.f46059a;
                            if (Math.abs(number.floatValue() - viewH.getScaleX()) > 0.3f || !((Boolean) pair.b).booleanValue()) {
                                viewH.setScaleX(number.floatValue());
                                viewH.setScaleY(number.floatValue());
                            } else {
                                float fFloatValue = number.floatValue();
                                Object tag = viewH.getTag();
                                AnimatorSet animatorSet = tag instanceof AnimatorSet ? (AnimatorSet) tag : null;
                                if (animatorSet != null) {
                                    animatorSet.pause();
                                    animatorSet.cancel();
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                Property property = ViewGroup.SCALE_X;
                                float[] fArr = new float[2];
                                fArr[c2] = viewH.getScaleX();
                                fArr[c] = fFloatValue;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewH, (Property<View, Float>) property, fArr);
                                Property property2 = ViewGroup.SCALE_Y;
                                float[] fArr2 = new float[2];
                                fArr2[c2] = viewH.getScaleY();
                                fArr2[c] = fFloatValue;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewH, (Property<View, Float>) property2, fArr2);
                                Animator[] animatorArr = new Animator[2];
                                animatorArr[c2] = objectAnimatorOfFloat;
                                animatorArr[c] = objectAnimatorOfFloat2;
                                animatorSet2.playTogether(animatorArr);
                                animatorSet2.setDuration(20L);
                                animatorSet2.setInterpolator(new AccelerateInterpolator());
                                animatorSet2.start();
                                viewH.setTag(animatorSet2);
                            }
                        }
                        c = c3;
                        c2 = 0;
                        number = (Number) pair.f46059a;
                        if (Math.abs(number.floatValue() - viewH.getScaleX()) > 0.3f) {
                            viewH.setScaleX(number.floatValue());
                            viewH.setScaleY(number.floatValue());
                        } else {
                            viewH.setScaleX(number.floatValue());
                            viewH.setScaleY(number.floatValue());
                        }
                    } else {
                        c = c3;
                    }
                    i5++;
                    c3 = c;
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
            public final int G0(int i2, msj msjVar, the0 the0Var) {
                int iG0 = super.G0(i2, msjVar, the0Var);
                C1();
                return iG0;
            }

            @Override // androidx.recyclerview.widget.b
            public final void R0(RecyclerView recyclerView, the0 the0Var, int i2) {
                the0Var.getClass();
                if (i2 != -1) {
                    Context context3 = this.i1.getContext();
                    context3.getClass();
                    m900 m900Var = new m900(context3);
                    m900Var.f32207a = i2;
                    S0(m900Var);
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
            public final void s0(msj msjVar, the0 the0Var) {
                msjVar.getClass();
                the0Var.getClass();
                super.s0(msjVar, the0Var);
                C1();
            }
        });
    }

    public final void H0() {
        setVisibility(this.x2 >= 2 ? 0 : 8);
        ArrayList arrayList = new ArrayList();
        if (getVisibility() == 0) {
            this.q2 = this.r2;
            int i = this.x2;
            int i2 = 0;
            while (i2 < i) {
                boolean z = this.r2 == i2;
                arrayList.add(new wi80(i2, z ? this.u2 : this.v2, z));
                i2++;
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iMin = Math.min(this.s2, this.x2);
        int i3 = this.t2;
        int i4 = this.w2;
        layoutParams.width = ((i3 + i4) * iMin) + i4;
        this.m2.B(arrayList, new ccf((Object) this, (byte) 15));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewPager2 viewPager2 = this.p2;
        if (viewPager2 != null) {
            viewPager2.g(this.n2);
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setSelectedIndicatorColor(int i) {
        this.u2 = i;
    }

    public final void setViewPager2(ViewPager2 viewPager2) {
        viewPager2.getClass();
        this.p2 = viewPager2;
        yge0 adapter = viewPager2.getAdapter();
        if (adapter != null) {
            adapter.v(this.o2);
            this.q2 = -1;
            this.x2 = adapter.d();
            this.r2 = viewPager2.getCurrentItem();
            H0();
            xp6 xp6Var = this.n2;
            viewPager2.c(xp6Var);
            xp6Var.c(viewPager2.getCurrentItem());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPageControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPageControl(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
