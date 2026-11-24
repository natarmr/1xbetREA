package org.xplatform.pin_code.impl.presentation.views.enteringpincode;

import a.m5d;
import a.maz;
import a.n0o0;
import a.wm90;
import a.xm90;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class PicCodeEditField extends FrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f46822a;
    public final float b;
    public final float c;
    public final float d;
    public ArrayList e;
    public ArrayList f;
    public AnimatorSet g;
    public Function1 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public PicCodeEditField(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46822a = maz.b(new wm90((byte) 0));
        this.b = getResources().getDimensionPixelSize(R.dimen.size_16);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_18);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public static ArrayList d(TextView textView, float... fArr) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "scaleX", Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.getClass();
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "scaleY", Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat2.getClass();
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "alpha", Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat3.getClass();
        arrayList.add(objectAnimatorOfFloat3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringBuilder getStringBuilder() {
        return (StringBuilder) this.f46822a.getValue();
    }

    public final void b(String str) {
        str.getClass();
        if (getStringBuilder().length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        getStringBuilder().append(str);
        int length = getStringBuilder().length();
        int i2 = length - 1;
        ArrayList arrayList2 = new ArrayList();
        TextView textView = (TextView) CollectionsKt.W(i2, this.e);
        byte b = 0;
        float f = this.d;
        if (textView != null) {
            textView.setText(str);
            textView.setTranslationX(f(i2));
            arrayList2.addAll(d(textView, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", f, 0.0f);
            objectAnimatorOfFloat.getClass();
            arrayList2.add(objectAnimatorOfFloat);
        }
        TextView textView2 = (TextView) CollectionsKt.W(i2, this.f);
        if (textView2 != null) {
            textView2.setTranslationX(f(i2));
            textView2.setAlpha(0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat2.getClass();
            arrayList2.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat3.getClass();
            arrayList2.add(objectAnimatorOfFloat3);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView2, "translationY", f, 0.0f);
            objectAnimatorOfFloat4.getClass();
            arrayList2.add(objectAnimatorOfFloat4);
        }
        arrayList.addAll(arrayList2);
        while (length < 4) {
            TextView textView3 = (TextView) CollectionsKt.W(length, this.e);
            if (getAlpha() != 0.0f) {
                arrayList.addAll(d(textView3, 0.0f));
            }
            TextView textView4 = (TextView) CollectionsKt.W(length, this.f);
            if (getAlpha() != 0.0f) {
                arrayList.addAll(d(textView4, 0.0f));
            }
            length++;
        }
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.start();
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(d((TextView) CollectionsKt.W(i2, this.e), 0.0f));
        arrayList3.addAll(d((TextView) CollectionsKt.W(i2, this.f), 1.0f));
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            TextView textView5 = (TextView) CollectionsKt.W(i3, this.e);
            if (textView5 != null) {
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textView5, "translationX", f(i3));
                objectAnimatorOfFloat5.getClass();
                arrayList4.add(objectAnimatorOfFloat5);
                arrayList4.addAll(d(textView5, 0.0f));
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textView5, "translationY", 0.0f);
                objectAnimatorOfFloat6.getClass();
                arrayList4.add(objectAnimatorOfFloat6);
            }
            TextView textView6 = (TextView) CollectionsKt.W(i3, this.f);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(textView6, "translationX", f(i3));
            objectAnimatorOfFloat7.getClass();
            arrayList4.add(objectAnimatorOfFloat7);
            arrayList4.addAll(d(textView6, 1.0f));
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(textView6, "translationY", 0.0f);
            objectAnimatorOfFloat8.getClass();
            arrayList4.add(objectAnimatorOfFloat8);
        }
        arrayList.addAll(arrayList4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(50L);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new xm90(this, b));
        animatorSet2.start();
        this.g = animatorSet2;
    }

    public final TextView c(int i2, float f, int i3) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(i2);
        textView.setTextSize(0, f);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        float f2 = i3 / 2.0f;
        textView.setPivotX(f2);
        textView.setPivotY(f2);
        addView(textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i3;
        }
        if (layoutParams2 != null) {
            layoutParams2.height = i3;
        }
        if (layoutParams2 != null) {
            layoutParams2.gravity = 51;
        }
        textView.setLayoutParams(layoutParams2);
        return textView;
    }

    public final void e() {
        if (getStringBuilder().length() == 0) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        byte b = 1;
        int length = getStringBuilder().length() - 1;
        if (length != 0) {
            getStringBuilder().deleteCharAt(length);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = length; i2 < 4; i2++) {
            TextView textView = (TextView) CollectionsKt.W(i2, this.e);
            if (textView != null && textView.getAlpha() != 0.0f) {
                arrayList2.addAll(d(textView, 0.0f));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", 0.0f);
                objectAnimatorOfFloat.getClass();
                arrayList2.add(objectAnimatorOfFloat);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationX", f(i2));
                objectAnimatorOfFloat2.getClass();
                arrayList2.add(objectAnimatorOfFloat2);
            }
            TextView textView2 = (TextView) CollectionsKt.W(i2, this.f);
            if (textView2 != null && textView2.getAlpha() != 0.0f) {
                arrayList2.addAll(d(textView2, 0.0f));
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, "translationY", 0.0f);
                objectAnimatorOfFloat3.getClass();
                arrayList2.add(objectAnimatorOfFloat3);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView2, "translationX", f(i2));
                objectAnimatorOfFloat4.getClass();
                arrayList2.add(objectAnimatorOfFloat4);
            }
        }
        arrayList.addAll(arrayList2);
        if (length == 0) {
            getStringBuilder().deleteCharAt(length);
        }
        for (int i3 = 0; i3 < length; i3++) {
            arrayList.add(ObjectAnimator.ofFloat((TextView) CollectionsKt.W(i3, this.e), "translationX", f(i3)));
            arrayList.add(ObjectAnimator.ofFloat((TextView) CollectionsKt.W(i3, this.f), "translationX", f(i3)));
        }
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.g != null) {
            this.g = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g = animatorSet2;
        animatorSet2.setDuration(50L);
        AnimatorSet animatorSet3 = this.g;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(arrayList);
        }
        AnimatorSet animatorSet4 = this.g;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new xm90(this, b));
        }
        AnimatorSet animatorSet5 = this.g;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final float f(int i2) {
        float measuredWidth = getMeasuredWidth();
        float length = getStringBuilder().length();
        float f = this.b;
        return ((i2 * f) + ((measuredWidth - (length * f)) / 2.0f)) - this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.e = new ArrayList(4);
        this.f = new ArrayList(4);
        float dimension = getResources().getDimension(R.dimen.text_32);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_50);
        Context context = getContext();
        context.getClass();
        int iB = m5d.b(R.attr.uikitTextPrimary, context);
        for (int i2 = 0; i2 < 4; i2++) {
            this.e.add(c(iB, dimension, dimensionPixelSize));
            TextView textViewC = c(iB, dimension, dimensionPixelSize);
            textViewC.setText("•");
            this.f.add(textViewC);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.g = null;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            int length = getStringBuilder().length();
            ArrayList arrayList = this.e;
            if (i4 < length) {
                setAlpha(0.0f);
                setScaleX(1.0f);
                setScaleY(1.0f);
                setTranslationY(0.0f);
                setTranslationX(f(i4));
                setAlpha(1.0f);
                setScaleX(1.0f);
                setScaleY(1.0f);
                setTranslationY(0.0f);
                setTranslationX(f(i4));
            } else {
                TextView textView = (TextView) CollectionsKt.W(i4, arrayList);
                if (textView != null) {
                    textView.setAlpha(0.0f);
                }
                TextView textView2 = (TextView) CollectionsKt.W(i4, this.f);
                if (textView2 != null) {
                    textView2.setAlpha(0.0f);
                }
            }
        }
        super.onMeasure(i2, i3);
    }

    public final void setPinCodeChangedListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.h = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PicCodeEditField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PicCodeEditField(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
