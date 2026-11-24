package org.xplatform.ui_core.viewcomponents.views;

import a.a13;
import a.ay5;
import a.i120;
import a.j5d;
import a.maz;
import a.n0o0;
import a.q8d;
import a.trb;
import a.w1;
import a.w63;
import a.x63;
import a.y63;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class AnimatingPasswordTextView extends ay5 {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f47206a;
    public final n0o0 b;
    public ArrayList c;
    public ArrayList d;
    public final String e;
    public AnimatorSet f;
    public y63 g;
    public Function1 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public AnimatingPasswordTextView(Context context, AttributeSet attributeSet, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        this.f47206a = (byte) 4;
        this.b = maz.b(new a13(this, (byte) 5));
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = "•";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringBuilder getStringBuilder() {
        return (StringBuilder) this.b.getValue();
    }

    @Override // a.ay5
    public final void a() {
        if (isInEditMode()) {
            return;
        }
        Context context = getContext();
        byte b = this.f47206a;
        this.c = new ArrayList(b);
        this.d = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            TextView textView = new TextView(context);
            TypedValue typedValue = j5d.f15927a;
            context.getClass();
            textView.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(i120.Y(context, 25.0f));
            textView.setPivotY(i120.Y(context, 25.0f));
            addView(textView);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = i120.Y(context, 50.0f);
            layoutParams2.height = i120.Y(context, 50.0f);
            layoutParams2.gravity = 51;
            textView.setLayoutParams(layoutParams2);
            this.c.add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText(this.e);
            textView2.setPivotX(i120.Y(context, 25.0f));
            textView2.setPivotY(i120.Y(context, 25.0f));
            addView(textView2);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            layoutParams3.getClass();
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.width = i120.Y(context, 50.0f);
            layoutParams4.height = i120.Y(context, 50.0f);
            layoutParams4.gravity = 51;
            textView2.setLayoutParams(layoutParams4);
            this.d.add(textView2);
        }
    }

    public final void c(String str) {
        int length = getStringBuilder().length();
        byte b = this.f47206a;
        if (length == b) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        int length2 = getStringBuilder().length();
        getStringBuilder().append(str);
        Object obj = this.c.get(length2);
        obj.getClass();
        TextView textView = (TextView) obj;
        textView.setText(str);
        textView.setTranslationX(f(length2));
        arrayList.add(ObjectAnimator.ofFloat(textView, "scaleX", 0.0f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(textView, "scaleY", 0.0f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f));
        Context context = getContext();
        context.getClass();
        float fCeil = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 20.0f);
        byte b2 = 0;
        byte b3 = 1;
        arrayList.add(ObjectAnimator.ofFloat(textView, "translationY", fCeil, 0.0f));
        Object obj2 = this.d.get(length2);
        obj2.getClass();
        TextView textView2 = (TextView) obj2;
        textView2.setTranslationX(f(length2));
        textView2.setAlpha(0.0f);
        arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleX", 0.0f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleY", 0.0f, 1.0f));
        Context context2 = getContext();
        context2.getClass();
        arrayList.add(ObjectAnimator.ofFloat(textView2, "translationY", (int) Math.ceil(context2.getResources().getDisplayMetrics().density * 20.0f), 0.0f));
        for (int i2 = length2 + 1; i2 < b; i2++) {
            Object obj3 = this.c.get(i2);
            obj3.getClass();
            TextView textView3 = (TextView) obj3;
            if (textView3.getAlpha() != 0.0f) {
                arrayList.add(ObjectAnimator.ofFloat(textView3, "scaleX", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView3, "scaleY", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView3, "alpha", 0.0f));
            }
            Object obj4 = this.d.get(i2);
            obj4.getClass();
            TextView textView4 = (TextView) obj4;
            if (textView4.getAlpha() != 0.0f) {
                arrayList.add(ObjectAnimator.ofFloat(textView4, "scaleX", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView4, "scaleY", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView4, "alpha", 0.0f));
            }
        }
        y63 y63Var = this.g;
        if (y63Var != null) {
            y63Var.run();
        }
        y63 y63Var2 = new y63(this, length2, b2);
        this.g = y63Var2;
        byte b4 = 6;
        new Handler(Looper.getMainLooper()).postDelayed(new w1(new a13(y63Var2, b4), b4), 1500L);
        for (int i3 = 0; i3 < length2; i3++) {
            Object obj5 = this.c.get(i3);
            obj5.getClass();
            TextView textView5 = (TextView) obj5;
            arrayList.add(ObjectAnimator.ofFloat(textView5, "translationX", f(i3)));
            arrayList.add(ObjectAnimator.ofFloat(textView5, "scaleX", 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView5, "scaleY", 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView5, "alpha", 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView5, "translationY", 0.0f));
            Object obj6 = this.d.get(i3);
            obj6.getClass();
            TextView textView6 = (TextView) obj6;
            arrayList.add(ObjectAnimator.ofFloat(textView6, "translationX", f(i3)));
            arrayList.add(ObjectAnimator.ofFloat(textView6, "scaleX", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView6, "scaleY", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView6, "alpha", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView6, "translationY", 0.0f));
        }
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(150L);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new x63(this, b3));
        animatorSet2.start();
        this.f = animatorSet2;
    }

    public final void d() {
        byte b;
        if (getStringBuilder().length() == 0) {
            return;
        }
        if (this.g != null) {
            this.g = null;
        }
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        getStringBuilder().delete(0, getStringBuilder().length());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            b = 1;
            if (i2 >= this.f47206a) {
                break;
            }
            Object obj = this.c.get(i2);
            obj.getClass();
            TextView textView = (TextView) obj;
            if (textView.getAlpha() != 0.0f) {
                arrayList.add(ObjectAnimator.ofFloat(textView, "scaleX", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, "scaleY", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", 0.0f));
            }
            Object obj2 = this.d.get(i2);
            obj2.getClass();
            TextView textView2 = (TextView) obj2;
            if (textView2.getAlpha() != 0.0f) {
                arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleX", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleY", 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", 0.0f));
            }
            i2++;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(150L);
        AnimatorSet animatorSet3 = this.f;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(arrayList);
        }
        AnimatorSet animatorSet4 = this.f;
        if (animatorSet4 != null) {
            w63 w63Var = new w63(this, b);
            q8d q8dVar = new q8d();
            q8dVar.f28293a = new trb(w63Var, (byte) 15);
            animatorSet4.addListener(q8dVar);
        }
        AnimatorSet animatorSet5 = this.f;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void e() {
        ArrayList arrayList;
        int i2;
        byte b;
        if (getStringBuilder().length() == 0) {
            return;
        }
        try {
            performHapticFeedback(3);
            while (true) {
                b = 0;
                if (i2 >= this.f47206a) {
                    break;
                }
                Object obj = this.c.get(i2);
                obj.getClass();
                TextView textView = (TextView) obj;
                if (textView.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView, "scaleX", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, "scaleY", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, "translationY", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, "translationX", f(i2)));
                }
                Object obj2 = this.d.get(i2);
                obj2.getClass();
                TextView textView2 = (TextView) obj2;
                if (textView2.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleX", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleY", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "translationY", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "translationX", f(i2)));
                }
                i2++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        arrayList = new ArrayList();
        int length = getStringBuilder().length() - 1;
        if (length != 0) {
            getStringBuilder().deleteCharAt(length);
        }
        i2 = length;
        if (length == 0) {
            getStringBuilder().deleteCharAt(length);
        }
        for (int i3 = 0; i3 < length; i3++) {
            Object obj3 = this.c.get(i3);
            obj3.getClass();
            arrayList.add(ObjectAnimator.ofFloat((TextView) obj3, "translationX", f(i3)));
            Object obj4 = this.d.get(i3);
            obj4.getClass();
            arrayList.add(ObjectAnimator.ofFloat((TextView) obj4, "translationX", f(i3)));
        }
        if (this.g != null) {
            this.g = null;
        }
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(150L);
        AnimatorSet animatorSet3 = this.f;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(arrayList);
        }
        AnimatorSet animatorSet4 = this.f;
        if (animatorSet4 != null) {
            w63 w63Var = new w63(this, b);
            q8d q8dVar = new q8d();
            q8dVar.f28293a = new trb(w63Var, (byte) 15);
            animatorSet4.addListener(q8dVar);
        }
        AnimatorSet animatorSet5 = this.f;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final float f(int i2) {
        int measuredWidth = getMeasuredWidth();
        int length = getStringBuilder().length();
        Context context = getContext();
        context.getClass();
        int iY = (measuredWidth - (i120.Y(context, 30.0f) * length)) / 2;
        Context context2 = getContext();
        context2.getClass();
        float fY = (i120.Y(context2, 30.0f) * i2) + iY;
        Context context3 = getContext();
        context3.getClass();
        return fY - i120.Y(context3, 10.0f);
    }

    @Override // a.ay5
    public int getLayoutView() {
        return R.layout.empty_frame_layout;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.g != null) {
            this.g = null;
        }
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        for (int i6 = 0; i6 < this.f47206a; i6++) {
            int length = getStringBuilder().length();
            ArrayList arrayList = this.c;
            if (i6 < length) {
                Object obj = arrayList.get(i6);
                obj.getClass();
                TextView textView = (TextView) obj;
                textView.setAlpha(0.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
                textView.setTranslationY(0.0f);
                textView.setTranslationX(f(i6));
                Object obj2 = this.d.get(i6);
                obj2.getClass();
                TextView textView2 = (TextView) obj2;
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView2.setTranslationY(0.0f);
                textView2.setTranslationX(f(i6));
            } else {
                ((TextView) arrayList.get(i6)).setAlpha(0.0f);
                ((TextView) this.d.get(i6)).setAlpha(0.0f);
            }
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    public final void setPasswordFinishedInterface(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.h = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatingPasswordTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatingPasswordTextView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
