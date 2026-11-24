package org.xplatform.bonus_games.impl.lottery.presentation.views;

import a.de3;
import a.h910;
import a.l910;
import a.n910;
import a.qdq0;
import a.rdq0;
import a.sdq0;
import a.twn;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LotteryView extends FrameLayout implements h910 {
    public static final float[] j = {0.1f, 0.2f, 0.9f, 1.0f, 0.2f, 0.9f, 0.3f, 0.9f};
    public static final float[] k = {0.05f, 0.3f, 0.06f, 0.2f, 1.0f, 0.9f, 0.6f, 0.7f};
    public static final float[] l = {10.0f, 20.0f, -30.0f, -35.0f, 90.0f, 30.0f, -20.0f, 10.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sdq0[] f46440a;
    public sdq0 b;
    public int c;
    public AnimatorSet d;
    public h910 e;
    public n910 f;
    public View g;
    public View h;
    public final l910 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.rdq0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.sdq0, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.qdq0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.sdq0[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.h910, android.view.View, android.view.ViewGroup, java.lang.Object, org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public LotteryView(Context context, AttributeSet attributeSet, int i) {
        ?? rdq0Var;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        int i2 = 0;
        super(context, attributeSet, 0);
        this.f46440a = new sdq0[8];
        this.f = n910.f23116a;
        SparseArray sparseArray = new SparseArray();
        this.i = new l910(this, 0 == true ? 1 : 0);
        if (isInEditMode()) {
            return;
        }
        while (true) {
            byte b = 5;
            if (i2 >= 8) {
                getViewTreeObserver().addOnGlobalLayoutListener(new de3(this, b));
                this.f = n910.b;
                return;
            }
            if (i2 == 0 || i2 == 3 || i2 == 5 || i2 == 6) {
                Context context2 = getContext();
                context2.getClass();
                rdq0Var = new rdq0(context2, sparseArray);
            } else {
                Context context3 = getContext();
                context3.getClass();
                rdq0Var = new qdq0(context3, sparseArray);
            }
            rdq0Var.setListener(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            addView(rdq0Var, layoutParams);
            this.f46440a[i2] = rdq0Var;
            rdq0Var.setOnClickListener(this.i);
            i2++;
        }
    }

    public final void a(View view, int i) {
        int measuredHeight = getMeasuredHeight() / 2;
        int measuredWidth = getMeasuredWidth() / 2;
        View view2 = this.g;
        int height = view2 != null ? view2.getHeight() : 0;
        View view3 = this.h;
        int width = view3 != null ? view3.getWidth() : 0;
        Context context = getContext();
        context.getClass();
        context.getClass();
        boolean z = context.getResources().getBoolean(R.bool.isLand);
        int height2 = view.getHeight();
        float width2 = measuredWidth - (view.getWidth() * 0.7f);
        int i2 = (int) (width2 - width);
        float f = measuredHeight - (height2 * 0.7f);
        int i3 = (int) (f - height);
        int i4 = (int) (f * 0.5f);
        int i5 = (int) (width2 * 0.5f);
        float[] fArr = j;
        float[] fArr2 = k;
        if (z) {
            view.setTranslationY((-i4) + ((int) (i3 * fArr[i])));
            view.setTranslationX((-i5) + ((int) (i2 * fArr2[i])));
        } else {
            view.setTranslationY((-i4) + ((int) (i3 * fArr2[i])));
            view.setTranslationX((-i5) + ((int) (i2 * fArr[i])));
        }
        view.setRotation(l[i]);
        view.setScaleY(0.7f);
        view.setScaleX(0.7f);
    }

    @Override // a.h910
    public final void b(int i) {
        h910 h910Var = this.e;
        if (h910Var != null) {
            h910Var.b(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle c() {
        Bundle bundle = new Bundle();
        int i = -1;
        for (int i2 = 0; i2 < 8; i2++) {
            String strM = twn.m(i2, "_ticket_");
            sdq0[] sdq0VarArr = this.f46440a;
            rdq0 rdq0Var = sdq0VarArr[i2];
            bundle.putBundle(strM, rdq0Var != 0 ? rdq0Var.e() : null);
            String str = "_ticket_visibility" + i2;
            Object[] objArr = sdq0VarArr[i2];
            objArr.getClass();
            bundle.putBoolean(str, ((View) objArr).getVisibility() == 8);
            sdq0 sdq0Var = this.b;
            if (sdq0Var != null && sdq0Var == sdq0VarArr[i2]) {
                i = i2;
            }
        }
        bundle.putInt("_selected", i);
        return bundle;
    }

    @Override // a.h910
    public final void d() {
        h910 h910Var = this.e;
        if (h910Var != null) {
            h910Var.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        view.getClass();
        super.onViewAdded(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
        if (i == 80) {
            this.g = view;
        }
        if (i == 5 || i == 21) {
            this.h = view;
        }
    }

    public final void setListener(h910 h910Var) {
        h910Var.getClass();
        this.e = h910Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LotteryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LotteryView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
