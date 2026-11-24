package org.xplatform.uikit.components.cells.middle;

import a.bqd0;
import a.e0g0;
import a.hny;
import a.i8m0;
import a.j0g0;
import a.jk3;
import a.jmu0;
import a.ktt0;
import a.qx3;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCellMiddleTitle extends ConstraintLayout {
    public final jk3 q;
    public final boolean r;
    public boolean s;
    public int t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellMiddleTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.cell_middle_title_layout, this);
        int i = R.id.barrier;
        if (((Barrier) yum0.f(this, R.id.barrier)) != null) {
            i = R.id.caption;
            TextView textView = (TextView) yum0.f(this, R.id.caption);
            if (textView != null) {
                i = R.id.subtitle;
                TextView textView2 = (TextView) yum0.f(this, R.id.subtitle);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) yum0.f(this, R.id.title);
                    if (textView3 != null) {
                        i = R.id.topSubtitle;
                        TextView textView4 = (TextView) yum0.f(this, R.id.topSubtitle);
                        if (textView4 != null) {
                            this.q = new jk3(this, textView, textView2, textView3, textView4, (byte) 2);
                            this.s = true;
                            this.t = 1;
                            this.u = 1;
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.m, 0, 0);
                            this.r = typedArrayObtainStyledAttributes.getBoolean(5, this.r);
                            ktt0.h(typedArrayObtainStyledAttributes, textView4, 7);
                            ktt0.h(typedArrayObtainStyledAttributes, textView3, 12);
                            ktt0.h(typedArrayObtainStyledAttributes, textView2, 7);
                            setTitle(ktt0.p(typedArrayObtainStyledAttributes, context, 10));
                            setCaption(ktt0.p(typedArrayObtainStyledAttributes, context, 0));
                            setSubtitleVisible(typedArrayObtainStyledAttributes.getBoolean(8, this.s));
                            setSubtitle(ktt0.p(typedArrayObtainStyledAttributes, context, 4));
                            setCaptionVisible(typedArrayObtainStyledAttributes.getBoolean(2, false));
                            setTitleTextColor(ktt0.m(11, context, typedArrayObtainStyledAttributes));
                            setSubtitleTextColor(ktt0.m(6, context, typedArrayObtainStyledAttributes));
                            setCaptionTextColor(ktt0.m(1, context, typedArrayObtainStyledAttributes));
                            try {
                                e0g0 e0g0Var = j0g0.b;
                                setStatus((i8m0) i8m0.h.get(typedArrayObtainStyledAttributes.getInt(3, -1)));
                            } catch (Throwable unused) {
                                e0g0 e0g0Var2 = j0g0.b;
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final CharSequence getSubtitle() {
        boolean z = this.r;
        jk3 jk3Var = this.q;
        return ((TextView) (z ? jk3Var.f : jk3Var.d)).getText();
    }

    public final CharSequence getTitle() {
        return ((TextView) this.q.e).getText();
    }

    public final void setCaption(CharSequence charSequence) {
        jk3 jk3Var = this.q;
        ((TextView) jk3Var.c).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        ((TextView) jk3Var.c).setText(charSequence);
    }

    public final void setCaptionTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ((TextView) this.q.c).setTextColor(colorStateList);
        }
    }

    public final void setCaptionVisible(boolean z) {
        ((TextView) this.q.c).setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int i = isEnabled() ? 255 : 128;
        jk3 jk3Var = this.q;
        TextView textView = (TextView) jk3Var.f;
        TextView textView2 = (TextView) jk3Var.c;
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        Drawable[] compoundDrawablesRelative2 = ((TextView) jk3Var.d).getCompoundDrawablesRelative();
        compoundDrawablesRelative2.getClass();
        Object[] objArrR = qx3.r(compoundDrawablesRelative, compoundDrawablesRelative2);
        Drawable[] compoundDrawablesRelative3 = textView2.getCompoundDrawablesRelative();
        compoundDrawablesRelative3.getClass();
        for (Object obj : qx3.r(objArrR, compoundDrawablesRelative3)) {
            Drawable drawable = (Drawable) obj;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
        jmu0.b(textView2, z);
    }

    public final void setStatus(i8m0 i8m0Var) {
        Drawable drawable;
        if (i8m0Var == null || (drawable = getContext().getDrawable(i8m0Var.f14347a)) == null) {
            drawable = null;
        } else {
            drawable.mutate();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_14);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        boolean z = this.r;
        jk3 jk3Var = this.q;
        if (z) {
            ((TextView) jk3Var.f).setCompoundDrawablesRelative(drawable, null, null, null);
        } else {
            ((TextView) jk3Var.d).setCompoundDrawablesRelative(drawable, null, null, null);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        boolean z = this.r;
        jk3 jk3Var = this.q;
        if (z) {
            ((TextView) jk3Var.f).setText(charSequence);
            ((TextView) jk3Var.f).setVisibility((!this.s || charSequence == null || charSequence.length() == 0) ? 8 : 0);
            ((TextView) jk3Var.d).setVisibility(8);
        } else {
            ((TextView) jk3Var.d).setText(charSequence);
            ((TextView) jk3Var.d).setVisibility((!this.s || charSequence == null || charSequence.length() == 0) ? 8 : 0);
            ((TextView) jk3Var.f).setVisibility(8);
        }
    }

    public final void setSubtitleMaxLines(int i) {
        jk3 jk3Var = this.q;
        ((TextView) jk3Var.f).setMaxLines(i);
        ((TextView) jk3Var.d).setMaxLines(i);
    }

    public final void setSubtitleTextChangeListener$uikit(TextWatcher textWatcher) {
        textWatcher.getClass();
        ((TextView) this.q.d).addTextChangedListener(textWatcher);
    }

    public final void setSubtitleTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            boolean z = this.r;
            jk3 jk3Var = this.q;
            if (z) {
                ((TextView) jk3Var.f).setTextColor(colorStateList);
            } else {
                ((TextView) jk3Var.d).setTextColor(colorStateList);
            }
        }
    }

    public final void setSubtitleVisible(boolean z) {
        this.s = z;
        boolean z2 = this.r;
        jk3 jk3Var = this.q;
        if (z2) {
            ((TextView) jk3Var.f).setVisibility(z ? 0 : 8);
        } else {
            ((TextView) jk3Var.d).setVisibility(z ? 0 : 8);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        jk3 jk3Var = this.q;
        ((TextView) jk3Var.e).setText(charSequence);
        ((TextView) jk3Var.e).setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setTitleMaxLines(int i) {
        this.t = i;
        u(false);
    }

    public final void setTitleMaxLinesForce(int i) {
        this.t = i;
        u(true);
    }

    public final void setTitleMinLines(int i) {
        this.u = i;
        u(false);
    }

    public final void setTitleMinLinesForce(int i) {
        this.u = i;
        u(true);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ((TextView) this.q.e).setTextColor(colorStateList);
        }
    }

    public final void u(boolean z) {
        jk3 jk3Var = this.q;
        TextView textView = (TextView) jk3Var.f;
        TextView textView2 = (TextView) jk3Var.e;
        int i = (!(textView.getVisibility() == 0 || ((TextView) jk3Var.d).getVisibility() == 0) || z) ? this.t : this.u;
        if (textView2.getMaxLines() != i) {
            textView2.setMaxLines(i);
        }
        int minLines = textView2.getMinLines();
        int i2 = this.u;
        if (minLines != i2) {
            textView2.setMinLines(i2);
        }
    }

    public final void setCaptionTextColor(int i) {
        setCaptionTextColor(ColorStateList.valueOf(i));
    }

    public final void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public final void setCaption(int i) {
        setCaption(getContext().getString(i));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setSubtitle(int i) {
        setSubtitle(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCellMiddleTitle(Context context) {
        this(context, null);
        context.getClass();
    }
}
