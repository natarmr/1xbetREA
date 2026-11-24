package org.xplatform.ui_core.viewcomponents.loader;

import a.a8z;
import a.aqd0;
import a.gms0;
import a.j5d;
import a.maz;
import a.nsr;
import a.rcz;
import a.uhu0;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class LoaderView extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47196a;
    public final Animation b;
    public final a8z c;
    public boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public LoaderView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        wez wezVar = wez.b;
        this.f47196a = maz.a(wezVar, new nsr((Object) this, (Object) this, (byte) 26));
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate);
        this.b = animationLoadAnimation;
        this.c = maz.a(wezVar, new rcz(this, (byte) 27));
        this.d = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aqd0.l);
        typedArrayObtainStyledAttributes.getClass();
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
            getBinding().b.setImageDrawable(drawable);
            if (z) {
                FrameLayout frameLayout = getBinding().d;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.space_32), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                FrameLayout frameLayout2 = getBinding().d;
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 49;
                frameLayout2.setLayoutParams(layoutParams2);
            }
            typedArrayObtainStyledAttributes.recycle();
            setClickable(true);
            setFocusable(true);
            TypedValue typedValue = j5d.f15927a;
            setBackgroundColor(context.getColor(R.color.static_black_20));
            setVisibility(0);
            getBinding().c.startAnimation(animationLoadAnimation);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uhu0 getBinding() {
        return (uhu0) this.f47196a.getValue();
    }

    private final gms0 getVisibilityTransition() {
        return (gms0) this.c.getValue();
    }

    public final boolean getLoading() {
        return this.d;
    }

    public final void setLoading(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        if (!z) {
            setVisibility(8);
        } else {
            setVisibility(0);
            getBinding().c.startAnimation(this.b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoaderView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
