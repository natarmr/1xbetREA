package org.xplatform.uikit.components.cells.left;

import a.a8z;
import a.bqd0;
import a.epv0;
import a.fjc;
import a.gbe0;
import a.if5;
import a.ivl;
import a.iwk;
import a.jmu0;
import a.jvl;
import a.k1x;
import a.kki;
import a.ktt0;
import a.kuo;
import a.lls0;
import a.m5d;
import a.maz;
import a.mqd0;
import a.o5k0;
import a.phf0;
import a.pmi;
import a.q1x;
import a.sbx0;
import a.t1x;
import a.tx3;
import a.vf5;
import a.w23;
import a.wez;
import a.xoe;
import a.yg3;
import a.yoe;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellLeftIcon extends LoadableImageView implements xoe {
    public static final /* synthetic */ int s = 0;
    public final yoe j;
    public final if5 k;
    public final if5 l;
    public final a8z m;
    public final a8z n;
    public iwk o;
    public iwk p;
    public final ColorStateList q;
    public phf0 r;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCellLeftIcon(Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        yoe yoeVar = new yoe(this, new Function0(this) { // from class: a.hvl
            public final /* synthetic */ DsCellLeftIcon b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                DsCellLeftIcon dsCellLeftIcon = this.b;
                switch (b3) {
                    case 0:
                        int i2 = DsCellLeftIcon.s;
                        Object parent = dsCellLeftIcon.getParent();
                        parent.getClass();
                        return (View) parent;
                    case 1:
                        int i3 = DsCellLeftIcon.s;
                        Object parent2 = dsCellLeftIcon.getParent();
                        parent2.getClass();
                        return (View) parent2;
                    default:
                        int i4 = DsCellLeftIcon.s;
                        Object parent3 = dsCellLeftIcon.getParent();
                        parent3.getClass();
                        return (View) parent3;
                }
            }
        });
        this.j = yoeVar;
        final byte b3 = 1;
        if5 if5Var = new if5(this, new Function0(this) { // from class: a.hvl
            public final /* synthetic */ DsCellLeftIcon b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                DsCellLeftIcon dsCellLeftIcon = this.b;
                switch (b4) {
                    case 0:
                        int i2 = DsCellLeftIcon.s;
                        Object parent = dsCellLeftIcon.getParent();
                        parent.getClass();
                        return (View) parent;
                    case 1:
                        int i3 = DsCellLeftIcon.s;
                        Object parent2 = dsCellLeftIcon.getParent();
                        parent2.getClass();
                        return (View) parent2;
                    default:
                        int i4 = DsCellLeftIcon.s;
                        Object parent3 = dsCellLeftIcon.getParent();
                        parent3.getClass();
                        return (View) parent3;
                }
            }
        });
        this.k = if5Var;
        if5 if5Var2 = new if5(this, new Function0(this) { // from class: a.hvl
            public final /* synthetic */ DsCellLeftIcon b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                DsCellLeftIcon dsCellLeftIcon = this.b;
                switch (b4) {
                    case 0:
                        int i2 = DsCellLeftIcon.s;
                        Object parent = dsCellLeftIcon.getParent();
                        parent.getClass();
                        return (View) parent;
                    case 1:
                        int i3 = DsCellLeftIcon.s;
                        Object parent2 = dsCellLeftIcon.getParent();
                        parent2.getClass();
                        return (View) parent2;
                    default:
                        int i4 = DsCellLeftIcon.s;
                        Object parent3 = dsCellLeftIcon.getParent();
                        parent3.getClass();
                        return (View) parent3;
                }
            }
        });
        this.l = if5Var2;
        wez wezVar = wez.b;
        this.m = maz.a(wezVar, new yg3(context, (byte) 27));
        this.n = maz.a(wezVar, new yg3(context, (byte) 28));
        yoeVar.b(attributeSet, 0);
        if5Var.f(attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.I, 0, 0);
        setTag("DsCellLeftIcon");
        if5Var2.d = typedArrayObtainStyledAttributes.getInt(2, 8388693);
        if5Var2.e = ktt0.q(typedArrayObtainStyledAttributes, 3, 6);
        if5Var2.f = ktt0.q(typedArrayObtainStyledAttributes, 4, 7);
        setIconStrokeColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(5, 0)));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mqd0.f, 0, 0);
        this.q = ktt0.m(2, context, typedArrayObtainStyledAttributes2);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final Drawable getDefaultBackground() {
        return (Drawable) this.m.getValue();
    }

    private final int getDefaultBackgroundTint() {
        return ((Number) this.n.getValue()).intValue();
    }

    public static final void n(DsCellLeftIcon dsCellLeftIcon, gbe0 gbe0Var, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        int measuredWidth = (dsCellLeftIcon.getMeasuredWidth() - dsCellLeftIcon.getPaddingStart()) - dsCellLeftIcon.getPaddingEnd();
        int measuredHeight = (dsCellLeftIcon.getMeasuredHeight() - dsCellLeftIcon.getPaddingTop()) - dsCellLeftIcon.getPaddingBottom();
        Context applicationContext = dsCellLeftIcon.getContext().getApplicationContext();
        applicationContext.getClass();
        k1x k1xVar = new k1x(applicationContext);
        k1xVar.c = str;
        k1xVar.d(measuredWidth, measuredHeight);
        k1xVar.e = new kki(dsCellLeftIcon, num, num2, num3, num4, (byte) 16);
        dsCellLeftIcon.p = gbe0Var.a(k1xVar.a());
    }

    public static final void p(DsCellLeftIcon dsCellLeftIcon, gbe0 gbe0Var, String str, int i, Integer num, Integer num2) {
        int measuredWidth = (dsCellLeftIcon.getMeasuredWidth() - dsCellLeftIcon.getPaddingStart()) - dsCellLeftIcon.getPaddingEnd();
        int measuredHeight = (dsCellLeftIcon.getMeasuredHeight() - dsCellLeftIcon.getPaddingTop()) - dsCellLeftIcon.getPaddingBottom();
        Context applicationContext = dsCellLeftIcon.getContext().getApplicationContext();
        applicationContext.getClass();
        k1x k1xVar = new k1x(applicationContext);
        k1xVar.c = str;
        t1x.f(k1xVar, i);
        k1xVar.d(measuredWidth, measuredHeight);
        k1xVar.e = new sbx0((Object) dsCellLeftIcon, i, (Object) num, (Object) num2, (byte) 6);
        dsCellLeftIcon.p = gbe0Var.a(k1xVar.a());
    }

    public final void m(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4) {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        gbe0 gbe0VarA = o5k0.a(applicationContext);
        Context applicationContext2 = getContext().getApplicationContext();
        applicationContext2.getClass();
        k1x k1xVar = new k1x(applicationContext2);
        k1xVar.c = str;
        lls0[] lls0VarArr = {new fjc((byte) 0)};
        kuo kuoVar = q1x.f27974a;
        q1x.b(k1xVar, tx3.g0(lls0VarArr));
        k1xVar.e = new pmi((Object) this, (Object) num2, (Object) num3, (Object) num4, (byte) 12);
        this.o = gbe0VarA.a(k1xVar.a());
        if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            n(this, gbe0VarA, str2, num2, num3, num4, num);
        } else if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new ivl(this, gbe0VarA, str2, num2, num3, num4, num));
        } else {
            n(this, gbe0VarA, str2, num2, num3, num4, num);
        }
    }

    public final void o(int i, Integer num, Integer num2, String str) {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        gbe0 gbe0VarA = o5k0.a(applicationContext);
        if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            p(this, gbe0VarA, str, i, num2, num);
        } else if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new jvl(this, gbe0VarA, str, i, num2, num));
        } else {
            p(this, gbe0VarA, str, i, num2, num);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        phf0 phf0Var = this.r;
        if (phf0Var != null) {
            canvas.getClass();
            canvas.drawPath((Path) phf0Var.f26994a, (Paint) phf0Var.b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        phf0 phf0Var = this.r;
        if (phf0Var != null) {
            float strokeWidth = ((Paint) phf0Var.b).getStrokeWidth();
            DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) phf0Var.c;
            float measuredWidth = dsCellLeftIcon.getMeasuredWidth() / 2;
            float measuredHeight = dsCellLeftIcon.getMeasuredHeight() / 2;
            float fMin = Math.min(measuredWidth, measuredHeight) - strokeWidth;
            Path path = (Path) phf0Var.f26994a;
            path.reset();
            path.addCircle(measuredWidth, measuredHeight, fMin, Path.Direction.CW);
        }
    }

    public final void q(Integer num, Integer num2, Integer num3) {
        setBackground(getDefaultBackground());
        jmu0.j(this, ColorStateList.valueOf(num.intValue()));
        setImageTintList(ColorStateList.valueOf(num3.intValue()));
        setIconResource(num2.intValue());
    }

    public final void setBackgroundDrawableRes(int i) {
        setBackground(getContext().getDrawable(i));
        setBackgroundTintList(null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w23(this, (byte) 6));
        } else {
            this.k.k();
        }
    }

    public final void setBackgroundWithDrawable(Drawable drawable) {
        setBackground(drawable);
        setBackgroundTintList(null);
    }

    public void setBadgeBackgroundTint(int i) {
        this.k.j(i);
    }

    public void setBadgeVisible(boolean z) {
        DsBadge dsBadge = this.k.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
    }

    public final void setBottomIcon(Drawable drawable) {
        if5 if5Var = this.l;
        if (drawable == null) {
            if5Var.a(null);
            return;
        }
        if (if5Var.c == null) {
            if5Var.a(vf5.j);
        }
        DsBadge dsBadge = if5Var.c;
        if (dsBadge != null) {
            dsBadge.setImageDrawable(drawable);
        }
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        this.j.c(num);
        DsBadge dsBadge = this.l.c;
        if (dsBadge != null) {
            dsBadge.d.c(this);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ColorStateList imageTintList = getImageTintList();
        if (imageTintList == null || !imageTintList.isStateful()) {
            jmu0.b(this, z);
        }
        DsBadge dsBadge = this.k.c;
        if (dsBadge != null) {
            dsBadge.setEnabled(z);
        }
        phf0 phf0Var = this.r;
        if (phf0Var != null) {
            ((Paint) phf0Var.b).setAlpha(z ? 255 : 127);
        }
    }

    public final void setIconBackgroundTint(int i) {
        Context context = getContext();
        context.getClass();
        jmu0.j(this, ColorStateList.valueOf(m5d.b(i, context)));
    }

    public final void setIconDrawable(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public final void setIconResource(int i) {
        setImageResource(i);
    }

    public final void setIconStrokeColor(Integer num) {
        phf0 phf0Var;
        if (num == null || num.intValue() == 0) {
            phf0Var = null;
        } else {
            int iIntValue = num.intValue();
            phf0Var = new phf0();
            phf0Var.c = this;
            phf0Var.f26994a = new Path();
            Paint paint = new Paint();
            paint.setColor(iIntValue);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(getResources().getDimension(R.dimen.size_1));
            phf0Var.b = paint;
        }
        this.r = phf0Var;
        requestLayout();
    }

    public final void setIconTint(int i) {
        setIconTint(ColorStateList.valueOf(i));
    }

    public final void setIconTint(ColorStateList colorStateList) {
        setImageTintList(colorStateList);
    }

    public final void setBottomIcon(int i) {
        setBottomIcon(epv0.U(i, getContext()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellLeftIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellLeftIcon(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
