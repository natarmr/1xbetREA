package a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class l63 extends e4u0 implements Animatable {
    public final Context c;
    public xh d = null;
    public ArrayList e = null;
    public final i63 f = new i63(this, 0);
    public final j63 b = new j63();

    public l63(Context context) {
        this.c = context;
    }

    @Override // a.e4u0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        j63 j63Var = this.b;
        j63Var.f15965a.draw(canvas);
        if (j63Var.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getAlpha() : this.b.f15965a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getColorFilter() : this.b.f15965a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7201a != null) {
            return new k63(this.f7201a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.f15965a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.f15965a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getOpacity() : this.b.f15965a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        j63 j63Var;
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            j63Var = this.b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayS = zsm0.s(resources, theme, attributeSet, cfx0.e);
                    int resourceId = typedArrayS.getResourceId(0, 0);
                    if (resourceId != 0) {
                        n4u0 n4u0Var = new n4u0();
                        ThreadLocal threadLocal = itf0.f15351a;
                        n4u0Var.f7201a = resources.getDrawable(resourceId, theme);
                        new m4u0(n4u0Var.f7201a.getConstantState());
                        n4u0Var.f = false;
                        n4u0Var.setCallback(this.f);
                        n4u0 n4u0Var2 = j63Var.f15965a;
                        if (n4u0Var2 != null) {
                            n4u0Var2.setCallback(null);
                        }
                        j63Var.f15965a = n4u0Var;
                    }
                    typedArrayS.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, cfx0.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            jf4.n("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(j63Var.f15965a.b.b.o.get(string));
                        if (j63Var.c == null) {
                            j63Var.c = new ArrayList();
                            j63Var.d = new gx3(0);
                        }
                        j63Var.c.add(animatorLoadAnimator);
                        j63Var.d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        AnimatorSet animatorSet = j63Var.b;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            j63Var.b = animatorSet;
        }
        animatorSet.playTogether(j63Var.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.f15965a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f7201a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.isStateful() : this.b.f15965a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.f15965a.setBounds(rect);
        }
    }

    @Override // a.e4u0, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.setLevel(i) : this.b.f15965a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.setState(iArr) : this.b.f15965a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.f15965a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.f15965a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.f15965a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.b.f15965a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.b.f15965a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.b.f15965a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.f15965a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        j63 j63Var = this.b;
        if (j63Var.b.isStarted()) {
            return;
        }
        j63Var.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
