package org.xplatform.ui_core.viewcomponents.layouts.frame;

import a.a8z;
import a.aqd0;
import a.b4d;
import a.bkb;
import a.h5;
import a.j5d;
import a.kw2;
import a.maz;
import a.q14;
import a.v2x;
import a.vcc;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class CircleBorderImageView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47191a;

    /* JADX WARN: Illegal instructions before constructor call */
    public CircleBorderImageView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47191a = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 18));
        if (attributeSet != null) {
            Context context2 = getContext();
            context2.getClass();
            q14 q14Var = new q14(context2, attributeSet, aqd0.f);
            TypedArray typedArray = q14Var.b;
            try {
                try {
                    int resourceId = typedArray.getResourceId(2, 0);
                    if (resourceId > 0) {
                        setDrawable(resourceId);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    vcc.c0(getBinding().d.getBackground(), context, typedArray.getColor(3, 0));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    vcc.c0(getBinding().b.getBackground(), context, typedArray.getColor(0, 0));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                try {
                    vcc.d0(getBinding().c, typedArray.getColor(1, 0));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                q14Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(q14Var, th);
                    throw th2;
                }
            }
        }
    }

    private final v2x getBinding() {
        return (v2x) this.f47191a.getValue();
    }

    public final void setDrawable(int i) {
        getBinding().c.setImageResource(i);
    }

    public final void setExternalBorderColorByAttr(int i) {
        Drawable background = getBinding().b.getBackground();
        Context context = getContext();
        context.getClass();
        vcc.c0(background, context, i);
    }

    public final void setImageColorByAttr(int i) {
        vcc.d0(getBinding().c, i);
    }

    public final void setImageColorByRes(int i) {
        vcc.e0(getBinding().c, i);
    }

    public final void setInternalBorderColor(int i) {
        Drawable background = getBinding().d.getBackground();
        Context context = getContext();
        context.getClass();
        b4d b4dVar = b4d.f1952a;
        if (Build.VERSION.SDK_INT < 29) {
            if (background != null) {
                TypedValue typedValue = j5d.f15927a;
                background.setColorFilter(context.getColor(i), b4dVar.b());
                return;
            }
            return;
        }
        if (background != null) {
            kw2.g();
            TypedValue typedValue2 = j5d.f15927a;
            background.setColorFilter(kw2.c(context.getColor(i), b4dVar.a()));
        }
    }

    public final void setInternalBorderColorByAttr(int i) {
        Drawable background = getBinding().d.getBackground();
        Context context = getContext();
        context.getClass();
        vcc.c0(background, context, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBorderImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBorderImageView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
