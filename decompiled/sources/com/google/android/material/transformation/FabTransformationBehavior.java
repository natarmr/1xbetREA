package com.google.android.material.transformation;

import a.au40;
import a.ble;
import a.ccq0;
import a.jf4;
import a.n73;
import a.nac;
import a.wti;
import a.xi70;
import a.zmo;
import a.zt40;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static float C(wti wtiVar, au40 au40Var, float f) {
        long j = au40Var.f1461a;
        long j2 = au40Var.b;
        au40 au40VarD = ((zt40) wtiVar.b).d("expansion");
        return n73.a(f, 0.0f, au40Var.b().getInterpolation((((au40VarD.f1461a + au40VarD.b) + 17) - j) / j2));
    }

    public static Pair z(float f, float f2, boolean z, wti wtiVar) {
        au40 au40VarD;
        au40 au40VarD2;
        if (f == 0.0f || f2 == 0.0f) {
            au40VarD = ((zt40) wtiVar.b).d("translationXLinear");
            au40VarD2 = ((zt40) wtiVar.b).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            au40VarD = ((zt40) wtiVar.b).d("translationXCurveDownwards");
            au40VarD2 = ((zt40) wtiVar.b).d("translationYCurveDownwards");
        } else {
            au40VarD = ((zt40) wtiVar.b).d("translationXCurveUpwards");
            au40VarD2 = ((zt40) wtiVar.b).d("translationYCurveUpwards");
        }
        return new Pair(au40VarD, au40VarD2);
    }

    public final float A(View view, View view2, xi70 xi70Var) {
        RectF rectF = this.d;
        D(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        D(view2, rectF2);
        xi70Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float B(View view, View view2, xi70 xi70Var) {
        RectF rectF = this.d;
        D(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        D(view2, rectF2);
        xi70Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void D(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract wti E(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, a.yke
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        jf4.n("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // a.yke
    public final void g(ble bleVar) {
        if (bleVar.h == 0) {
            bleVar.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet y(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        Property property = View.TRANSLATION_Y;
        Property property2 = View.TRANSLATION_X;
        wti wtiVarE = E(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((zt40) wtiVarE.b).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fA = A(view, view2, (xi70) wtiVarE.c);
        float fB = B(view, view2, (xi70) wtiVarE.c);
        Pair pairZ = z(fA, fB, z, wtiVarE);
        au40 au40Var = (au40) pairZ.first;
        au40 au40Var2 = (au40) pairZ.second;
        RectF rectF = this.d;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-fA);
                view2.setTranslationY(-fB);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f);
            float fC = C(wtiVarE, au40Var, -fA);
            float fC2 = C(wtiVarE, au40Var2, -fB);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            D(view2, rectF2);
            rectF2.offset(fC, fC2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, -fA);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, -fB);
        }
        au40Var.a(objectAnimatorOfFloat2);
        au40Var2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fA2 = A(view, view2, (xi70) wtiVarE.c);
        float fB2 = B(view, view2, (xi70) wtiVarE.c);
        Pair pairZ2 = z(fA2, fB2, z, wtiVarE);
        au40 au40Var3 = (au40) pairZ2.first;
        au40 au40Var4 = (au40) pairZ2.second;
        if (!z) {
            fA2 = this.g;
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fA2);
        if (!z) {
            fB2 = this.h;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fB2);
        au40Var3.a(objectAnimatorOfFloat7);
        au40Var4.a(objectAnimatorOfFloat8);
        arrayList.add(objectAnimatorOfFloat7);
        arrayList.add(objectAnimatorOfFloat8);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        nac.f23183a.set(viewGroup, Float.valueOf(f));
                    }
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, nac.f23183a, 1.0f);
                } else {
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, nac.f23183a, f);
                }
                ((zt40) wtiVarE.b).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ccq0.W(animatorSet, arrayList);
        animatorSet.addListener(new zmo(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
