package org.xplatform.uikit.components.chips;

import a.bqd0;
import a.e1e0;
import a.f1e0;
import a.hny;
import a.ivb0;
import a.jmu0;
import a.ktt0;
import a.m5d;
import a.q10;
import a.q3d;
import a.tbc;
import a.xoe;
import a.ymx;
import a.yoe;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class Chip extends FrameLayout implements xoe {
    public static int j = -1;
    public static final List k = q3d.j(Integer.valueOf(R.attr.uikitStaticTeal), Integer.valueOf(R.attr.uikitStaticBlue), Integer.valueOf(R.attr.uikitStaticViolet), Integer.valueOf(R.attr.uikitStaticDarkOrange), Integer.valueOf(R.attr.uikitStaticOrange), Integer.valueOf(R.attr.uikitStaticYellow), Integer.valueOf(R.attr.uikitStaticLightBrown), Integer.valueOf(R.attr.uikitStaticPink), Integer.valueOf(R.attr.uikitStaticDarkPink));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbc f47238a;
    public final yoe b;
    public Function2 c;
    public Function2 d;
    public ColorStateList e;
    public ColorStateList f;
    public boolean g;
    public final ymx h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Chip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.chip_view, this);
        int i = R.id.action;
        ImageView imageView = (ImageView) yum0.f(this, R.id.action);
        if (imageView != null) {
            i = R.id.chipsContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(this, R.id.chipsContainer);
            if (constraintLayout != null) {
                i = R.id.icon;
                ImageView imageView2 = (ImageView) yum0.f(this, R.id.icon);
                if (imageView2 != null) {
                    i = R.id.icon_right;
                    CardView cardView = (CardView) yum0.f(this, R.id.icon_right);
                    if (cardView != null) {
                        i = R.id.left_icon;
                        CardView cardView2 = (CardView) yum0.f(this, R.id.left_icon);
                        if (cardView2 != null) {
                            i = R.id.secondaryText;
                            TextView textView = (TextView) yum0.f(this, R.id.secondaryText);
                            if (textView != null) {
                                i = R.id.text;
                                TextView textView2 = (TextView) yum0.f(this, R.id.text);
                                if (textView2 != null) {
                                    i = R.id.texts;
                                    LinearLayout linearLayout = (LinearLayout) yum0.f(this, R.id.texts);
                                    if (linearLayout != null) {
                                        this.f47238a = new tbc(this, imageView, constraintLayout, imageView2, cardView, cardView2, textView, textView2, linearLayout);
                                        yoe yoeVar = new yoe(this, null);
                                        this.b = yoeVar;
                                        this.h = ivb0.b;
                                        yoeVar.b(attributeSet, 0);
                                        yoeVar.f(m5d.b(R.attr.uikitBackground, context));
                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.u, 0, 0);
                                        a(typedArrayObtainStyledAttributes);
                                        typedArrayObtainStyledAttributes.recycle();
                                        jmu0.j(constraintLayout, constraintLayout.getBackgroundTintList());
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final int getRandomColor() {
        List list;
        int iF;
        do {
            e1e0 e1e0Var = f1e0.f8761a;
            list = k;
            int size = list.size();
            e1e0Var.getClass();
            iF = f1e0.b.f(size);
        } while (iF == j);
        j = iF;
        return ((Number) list.get(iF)).intValue();
    }

    public final void a(TypedArray typedArray) {
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(28, 0);
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(19, 0);
        boolean zIsRtlContext = BidiFormatter.getInstance().isRtlContext();
        tbc tbcVar = this.f47238a;
        Chip chip = (Chip) tbcVar.f;
        int i = zIsRtlContext ? dimensionPixelOffset2 : dimensionPixelOffset;
        if (!zIsRtlContext) {
            dimensionPixelOffset = dimensionPixelOffset2;
        }
        chip.setPadding(i, chip.getPaddingTop(), dimensionPixelOffset, chip.getPaddingBottom());
        setUnchangeableOnClick(typedArray.getBoolean(60, this.i));
        ConstraintLayout constraintLayout = (ConstraintLayout) tbcVar.b;
        boolean z = true;
        constraintLayout.setBackgroundTintList(b(typedArray, 12, 11, true));
        setIconTint(b(typedArray, 24, 21, false));
        setIcon(typedArray.getDrawable(20));
        Drawable drawable = typedArray.getDrawable(47);
        Drawable drawable2 = typedArray.getDrawable(46);
        if (drawable != null || drawable2 != null) {
            if (drawable != null || drawable2 != null) {
                this.g = false;
            }
            c(drawable, drawable2, this.e);
        }
        Drawable drawable3 = typedArray.getDrawable(9);
        Drawable drawable4 = typedArray.getDrawable(8);
        if (drawable3 != null || drawable4 != null) {
            if (drawable3 == null && drawable4 == null) {
                z = false;
            }
            this.g = z;
            c(drawable3, drawable4, this.f);
        }
        setActionTint(typedArray.getColorStateList(10));
        setLeftIconRadius(typedArray.getDimension(45, 0.0f));
        setRightIconRadius(typedArray.getDimension(48, 0.0f));
        Context context = getContext();
        context.getClass();
        setText(ktt0.p(typedArray, context, 5));
        setTextColor(b(typedArray, 2, 56, false));
        Context context2 = getContext();
        context2.getClass();
        setSecondaryText(ktt0.p(typedArray, context2, 50));
        setSecondaryTextColor(b(typedArray, 52, 51, false));
        setSelectedInternal(isSelected());
        setSelectedForUnchangeable(typedArray.getBoolean(59, false));
    }

    public final ColorStateList b(TypedArray typedArray, int i, Integer num, boolean z) {
        int iB;
        Integer numL = ktt0.l(typedArray, Integer.valueOf(i));
        Integer numL2 = ktt0.l(typedArray, num);
        if (numL == null || (numL2 == null && !z)) {
            if (numL != null) {
                return ColorStateList.valueOf(numL.intValue());
            }
            return null;
        }
        int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
        if (numL2 != null) {
            iB = numL2.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iB = m5d.b(getRandomColor(), context);
        }
        return new ColorStateList(iArr, new int[]{iB, numL.intValue()});
    }

    public final void c(Drawable drawable, Drawable drawable2, ColorStateList colorStateList) {
        StateListDrawable stateListDrawable;
        tbc tbcVar = this.f47238a;
        ImageView imageView = (ImageView) tbcVar.c;
        if (drawable != null && drawable2 != null) {
            stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, drawable2);
            stateListDrawable.addState(new int[0], drawable);
        } else if (drawable != null) {
            stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[0], drawable);
        } else {
            stateListDrawable = null;
        }
        imageView.setImageDrawable(stateListDrawable);
        imageView.setImageTintList(colorStateList);
        byte b = 8;
        imageView.setVisibility((drawable == null && drawable2 == null) ? 8 : 0);
        imageView.setOnClickListener(new q10(this, b));
        ((CardView) tbcVar.h).setSelected((drawable == null && drawable2 == null) ? false : true);
    }

    public final CharSequence getText() {
        return this.f47238a.e.getText();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.g ? ((ImageView) this.f47238a.c).isSelected() : super.isSelected();
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.g) {
            return false;
        }
        ymx ymxVar = this.h;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c > ymxVar.f42912a) {
            return super.performClick();
        }
        return false;
    }

    public final void setActionTint(ColorStateList colorStateList) {
        this.f = colorStateList;
        ImageView imageView = (ImageView) this.f47238a.c;
        if (!this.g) {
            colorStateList = this.e;
        }
        imageView.setImageTintList(colorStateList);
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        this.b.c(num);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        jmu0.b(this, z);
    }

    public final void setIcon(Drawable drawable) {
        tbc tbcVar = this.f47238a;
        ((ImageView) tbcVar.g).setImageDrawable(drawable);
        ((ImageView) tbcVar.g).setVisibility(drawable != null ? 0 : 8);
        ((CardView) tbcVar.i).setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.e = colorStateList;
        ((ImageView) this.f47238a.g).setImageTintList(colorStateList);
    }

    public final void setLeftIconRadius(float f) {
        ((CardView) this.f47238a.i).setRadius(f);
    }

    public final void setOnSelectInternalListener(Function2<? super Chip, ? super Boolean, Unit> function2) {
        this.d = function2;
    }

    public final void setOnSelectListener(Function2<? super Chip, ? super Boolean, Unit> function2) {
        this.c = function2;
    }

    public final void setRightIconRadius(float f) {
        ((CardView) this.f47238a.h).setRadius(f);
    }

    public final void setSecondaryText(CharSequence charSequence) {
        tbc tbcVar = this.f47238a;
        tbcVar.d.setText(charSequence);
        TextView textView = tbcVar.d;
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((LinearLayout) tbcVar.j).setVisibility((tbcVar.e.getVisibility() == 0 || textView.getVisibility() == 0) ? 0 : 8);
    }

    public final void setSecondaryTextColor(ColorStateList colorStateList) {
        TextView textView = this.f47238a.d;
        if (colorStateList == null) {
            Context context = getContext();
            context.getClass();
            colorStateList = ColorStateList.valueOf(m5d.b(R.attr.secondaryTextColor, context));
            colorStateList.getClass();
        }
        textView.setTextColor(colorStateList);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        setSelectedInternal(z);
        Function2 function2 = this.c;
        if (function2 != null) {
            function2.invoke(this, Boolean.valueOf(z));
        }
        Function2 function3 = this.d;
        if (function3 != null) {
            function3.invoke(this, Boolean.valueOf(z));
        }
    }

    public final void setSelectedForUnchangeable(boolean z) {
        super.setSelected(z);
    }

    public final void setSelectedInternal(boolean z) {
        if (this.i) {
            return;
        }
        boolean z2 = this.g;
        tbc tbcVar = this.f47238a;
        if (z2) {
            ((ImageView) tbcVar.c).setSelected(z);
            return;
        }
        super.setSelected(z);
        ConstraintLayout constraintLayout = (ConstraintLayout) tbcVar.b;
        jmu0.j(constraintLayout, constraintLayout.getBackgroundTintList());
    }

    public final void setStyle(int i) {
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.u);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setText(CharSequence charSequence) {
        tbc tbcVar = this.f47238a;
        tbcVar.e.setText(charSequence);
        TextView textView = tbcVar.e;
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((LinearLayout) tbcVar.j).setVisibility((textView.getVisibility() == 0 || tbcVar.d.getVisibility() == 0) ? 0 : 8);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        TextView textView = this.f47238a.e;
        if (colorStateList == null) {
            Context context = getContext();
            context.getClass();
            colorStateList = ColorStateList.valueOf(m5d.b(android.R.attr.textColor, context));
            colorStateList.getClass();
        }
        textView.setTextColor(colorStateList);
    }

    public final void setUnchangeableOnClick(boolean z) {
        this.i = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Chip(Context context) {
        this(context, null);
        context.getClass();
    }
}
