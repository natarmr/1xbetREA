package a;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalGlowView;

/* JADX INFO: loaded from: classes4.dex */
public final class egf extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7761a;
    public int b;
    public bgf c;
    public final a8z d;
    public final ObjectAnimator e;
    public final ObjectAnimator f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egf(Context context) {
        super(context, null, 0);
        context.getClass();
        this.c = bgf.f2552a;
        this.d = maz.a(wez.b, new vzv0(this, this, (byte) 1));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(getBinding().c, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 1.0f, 1.3f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 1.0f, 1.3f));
        objectAnimatorOfPropertyValuesHolder.getClass();
        this.e = objectAnimatorOfPropertyValuesHolder;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBinding().d, (Property<CrystalGlowView, Float>) FrameLayout.ALPHA, 0.5f, 1.0f);
        objectAnimatorOfFloat.getClass();
        this.f = objectAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c1o0 getBinding() {
        return (c1o0) this.d.getValue();
    }

    private final void setCrystalModel(cgf cgfVar) {
        if (cgfVar != null) {
            getBinding().c.setImageResource(cgfVar.c.f23529a);
            this.f7761a = cgfVar.f4309a;
            this.b = cgfVar.b;
            setStatus(cgfVar.d);
        }
    }

    private final void setStatus(bgf bgfVar) {
        int iOrdinal = bgfVar.ordinal();
        byte b = 1;
        if (iOrdinal == 1) {
            c();
        } else if (iOrdinal == 2) {
            getBinding().d.setAlpha(0.0f);
            getBinding().b.setVisibility(0);
            getBinding().c.setVisibility(0);
            getBinding().c.setScaleX(1.0f);
            getBinding().c.setScaleY(1.0f);
        } else if (iOrdinal == 3) {
            getBinding().b.setVisibility(0);
            getBinding().c.setVisibility(0);
            ObjectAnimator objectAnimator = this.e;
            objectAnimator.setDuration(600L);
            objectAnimator.setRepeatCount(4);
            objectAnimator.setRepeatMode(2);
            objectAnimator.start();
            ObjectAnimator objectAnimator2 = this.f;
            objectAnimator2.setDuration(600L);
            objectAnimator2.setRepeatCount(4);
            objectAnimator2.setRepeatMode(2);
            objectAnimator2.start();
            objectAnimator2.addListener(new dgf(this, b));
        }
        this.c = bgfVar;
    }

    public final void b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBinding().c, (Property<ImageView, Float>) FrameLayout.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(new dgf(this, (byte) 0));
        objectAnimatorOfFloat.start();
    }

    public final void c() {
        getBinding().d.setAlpha(0.0f);
        getBinding().c.setVisibility(4);
        getBinding().b.setVisibility(0);
        getBinding().c.setScaleX(1.0f);
        getBinding().c.setScaleY(1.0f);
    }

    public final int getColumn() {
        return this.f7761a;
    }

    public final int getRow() {
        return this.b;
    }

    public final bgf getStatus() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(si30.b(getMeasuredWidth() * 0.54f), 1073741824);
        getBinding().c.measure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void setCrystal(cgf cgfVar) {
        cgfVar.getClass();
        getBinding().c.setAlpha(1.0f);
        setAlpha(1.0f);
        setCrystalModel(cgfVar);
    }
}
