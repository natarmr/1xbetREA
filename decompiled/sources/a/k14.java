package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class k14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f17500a;
    public int c;
    public int d;
    public int e;
    public Integer g;
    public final g14 j;
    public final h14 k;
    public int b = 8388661;
    public boolean f = true;
    public WeakReference h = new WeakReference(null);
    public WeakReference i = new WeakReference(null);
    public final b33 l = new b33((Object) this, (byte) 11);

    public k14(View view) {
        this.f17500a = view;
        byte b = 0;
        this.j = new g14(this, b);
        this.k = new h14(this, b);
    }

    public final void a(AttributeSet attributeSet) {
        Context context = this.f17500a.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.w, 0, 0);
        this.l.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final View b(View view, Function0 function0) {
        View view2;
        view.getClass();
        this.i = new WeakReference(view);
        view.addOnLayoutChangeListener(this.j);
        WeakHashMap weakHashMap = rgu0.f30456a;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        View view3 = this.f17500a;
        if (zIsAttachedToWindow) {
            View view4 = function0 != null ? (View) function0.invoke() : null;
            this.h = new WeakReference(view4);
            view2 = view;
            gq80.b0(view3, view2, view4, this.b, this.c, this.d);
            Integer num = this.g;
            if (num != null) {
                e(num.intValue());
            } else {
                Object parent = view2.getParent();
                f(parent instanceof View ? (View) parent : null, view4);
            }
            view2.getViewTreeObserver().addOnPreDrawListener(this.k);
            if (view2.isAttachedToWindow()) {
                view2.addOnAttachStateChangeListener(new i14(view2, this, view2));
            } else {
                c(view2);
            }
        } else {
            view2 = view;
        }
        view2.addOnAttachStateChangeListener(new i14(function0, this, view2));
        return view3;
    }

    public final void c(View view) {
        ViewGroupOverlay overlay;
        view.getClass();
        view.removeOnLayoutChangeListener(this.j);
        view.getViewTreeObserver().removeOnPreDrawListener(this.k);
        View view2 = (View) this.h.get();
        if (view2 == null) {
            ViewParent parent = view.getParent();
            view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        }
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup == null || (overlay = viewGroup.getOverlay()) == null) {
            return;
        }
        overlay.remove(this.f17500a);
    }

    public final void d(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        View view = (View) this.i.get();
        if (view != null) {
            gq80.l0(this.f17500a, view, (View) this.h.get(), this.b, this.c, this.d);
        }
    }

    public final void e(int i) {
        this.g = Integer.valueOf(i);
        Drawable background = this.f17500a.getBackground();
        if (background != null) {
            gq80.m0(background, i, this.e);
        }
    }

    public final void f(View view, View view2) {
        int i;
        this.h = new WeakReference(view2);
        Drawable background = this.f17500a.getBackground();
        if (background == null || (i = this.e) <= 0) {
            return;
        }
        Integer numE0 = gq80.e0(view2);
        if (numE0 == null) {
            numE0 = gq80.e0(view);
        }
        if (numE0 != null) {
            gq80.m0(background, numE0.intValue(), i);
        }
    }
}
