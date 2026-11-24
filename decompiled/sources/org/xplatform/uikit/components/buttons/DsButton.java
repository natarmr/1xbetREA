package org.xplatform.uikit.components.buttons;

import a.bqd0;
import a.cem0;
import a.epv0;
import a.eul;
import a.ful;
import a.gul;
import a.ihu0;
import a.jhu0;
import a.jmu0;
import a.ktt0;
import a.lrk;
import a.m5d;
import a.maz;
import a.n0o0;
import a.qzb;
import a.t9f;
import a.uzb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.loader.DsLoader;

/* JADX INFO: loaded from: classes6.dex */
public class DsButton extends FrameLayout {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47230a;
    public boolean b;
    public eul c;
    public ful d;
    public gul e;
    public CharSequence f;
    public int g;
    public int h;
    public int i;
    public final View j;
    public final n0o0 k;
    public AppCompatImageView l;
    public DsLoader m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        context.getClass();
        this.f47230a = getResources().getDimensionPixelSize(R.dimen.size_24);
        eul eulVar = eul.LARGE;
        this.c = eulVar;
        this.d = ful.e;
        this.e = gul.e;
        this.f = "";
        this.i = -1;
        View view = new View(context);
        view.setBackgroundTintList(m5d.a(context, m5d.b(this.d.f10169a, context), m5d.b(this.d.b, context)));
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(m5d.b(R.attr.uikitRipple, context)), context.getDrawable(this.e.b), null));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(this.c.f8424a);
        view.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
        addView(view);
        this.j = view;
        this.k = maz.b(new lrk(context, this, (byte) 11));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.A, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                eulVar = eul.MEDIUM;
            } else if (i2 == 2) {
                eulVar = eul.SMALL;
            } else if (i2 == 3) {
                eulVar = eul.EXTRA_SMALL;
            }
        }
        this.c = eulVar;
        this.d = qzb.e1(typedArrayObtainStyledAttributes.getInt(3, 0));
        this.e = uzb.H0(typedArrayObtainStyledAttributes.getInt(4, 0));
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 1);
        this.f = strP == null ? String.valueOf(typedArrayObtainStyledAttributes.getString(1)) : strP;
        this.g = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.h = getResources().getDimensionPixelSize(this.c.f8424a);
        setClickable(true);
        g();
        if (this.e.c) {
            a();
        }
        Context context2 = getContext();
        context2.getClass();
        DsLoader dsLoader = new DsLoader(context2, null, 6);
        int dimensionPixelSize2 = dsLoader.getResources().getDimensionPixelSize(this.c.d);
        dsLoader.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17));
        dsLoader.setVisibility(8);
        dsLoader.setIndeterminateTintList(getContentColorStateList());
        dsLoader.setTag("DS_LOADER");
        this.m = dsLoader;
        addView(dsLoader);
        h();
        setTag("dsButton");
    }

    private final ColorStateList getContentColorStateList() {
        Context context = getContext();
        context.getClass();
        Context context2 = getContext();
        context2.getClass();
        int iB = m5d.b(this.d.c, context2);
        Context context3 = getContext();
        context3.getClass();
        return m5d.a(context, iB, m5d.b(this.d.d, context3));
    }

    private final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    public final void a() {
        jhu0 jhu0Var;
        Drawable drawableU;
        Iterator it = new ihu0(this).iterator();
        do {
            jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                gul gulVar = this.e;
                boolean z = gulVar == gul.h || gulVar == gul.i;
                Resources resources = getResources();
                int iOrdinal = this.c.ordinal();
                int i = R.dimen.space_8;
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return;
                        } else if (z) {
                            i = R.dimen.space_4;
                        } else {
                            i = R.dimen.space_6;
                        }
                    } else if (z) {
                        i = R.dimen.space_6;
                    }
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(this.c.b);
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                appCompatImageView.setTag("TAG_ICON");
                int i2 = this.g;
                if (i2 == 0) {
                    drawableU = null;
                } else {
                    drawableU = epv0.U(i2, getContext());
                    if (drawableU != null) {
                        drawableU.setAutoMirrored(this.b);
                    }
                }
                appCompatImageView.setImageDrawable(drawableU);
                appCompatImageView.setImageTintList(getContentColorStateList());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, this.e.f11934a);
                layoutParams.setMarginStart(dimensionPixelSize);
                layoutParams.setMarginEnd(dimensionPixelSize);
                appCompatImageView.setLayoutParams(layoutParams);
                this.l = appCompatImageView;
                addView(appCompatImageView);
                return;
            }
        } while (!Intrinsics.d(((View) jhu0Var.next()).getTag(), "TAG_ICON"));
    }

    public final void b(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.c.e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(this.c.f);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.text_8);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(this.c.c);
        gul gulVar = this.e;
        int i2 = gulVar == gul.f ? dimensionPixelSize2 : dimensionPixelSize;
        if (gulVar == gul.g) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        AppCompatTextView textView = getTextView();
        int i3 = (i - i2) - dimensionPixelSize;
        float f = dimensionPixelSize3;
        float f2 = dimensionPixelSize4;
        String string = this.f.toString();
        textView.getClass();
        string.getClass();
        float dimension = textView.getResources().getDimension(R.dimen.text_1);
        int i4 = (int) ((f2 - f) / dimension);
        int i5 = 1;
        if (1 > i4) {
            return;
        }
        while (true) {
            float f3 = (i5 * dimension) + f;
            textView.getPaint().setTextSize(f3);
            if (textView.getPaint().measureText(string) > i3) {
                textView.getPaint().setTextSize(f3 - dimension);
                textView.getPaint().measureText(textView.getText().toString());
                return;
            } else if (i5 == i4) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final boolean c(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.c.e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(this.c.f);
        gul gulVar = this.e;
        int i2 = gulVar == gul.f ? dimensionPixelSize2 : dimensionPixelSize;
        if (gulVar == gul.g) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        int i3 = (i - i2) - dimensionPixelSize;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(this.c.c);
        TextPaint paint = getTextView().getPaint();
        float textSize = paint.getTextSize();
        paint.setTextSize(dimensionPixelSize3);
        float fMeasureText = paint.measureText(getTextView().getText().toString());
        paint.setTextSize(textSize);
        return ((float) i3) < fMeasureText;
    }

    public final void d(int i) {
        eul eulVar;
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.A);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i2 == 0) {
            eulVar = eul.LARGE;
        } else if (i2 == 1) {
            eulVar = eul.MEDIUM;
        } else if (i2 != 2) {
            eulVar = i2 != 3 ? eul.LARGE : eul.EXTRA_SMALL;
        } else {
            eulVar = eul.SMALL;
        }
        this.c = eulVar;
        this.d = qzb.e1(typedArrayObtainStyledAttributes.getInt(3, 0));
        this.e = uzb.H0(typedArrayObtainStyledAttributes.getInt(4, 0));
        typedArrayObtainStyledAttributes.recycle();
        h();
    }

    public final void g() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.c.e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(this.c.f);
        AppCompatTextView textView = getTextView();
        cem0.n(R.style.TextStyle_Headline_Medium_TextPrimary, textView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 16);
        layoutParams.setMarginStart(this.e == gul.f ? dimensionPixelSize2 : dimensionPixelSize);
        if (this.e == gul.g) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.setMarginEnd(dimensionPixelSize);
        textView.setMinWidth(textView.getResources().getDimensionPixelSize(this.c == eul.EXTRA_SMALL ? R.dimen.size_24 : R.dimen.size_32));
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(getContentColorStateList());
        textView.setMaxLines(1);
        textView.setGravity(17);
        b(getMeasuredWidth());
        textView.setText(this.f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        gul gulVar = this.e;
        textView.setVisibility((gulVar == gul.h || gulVar == gul.i) ? false : true ? 0 : 8);
    }

    public final View getBackgroundView() {
        return this.j;
    }

    public final int getButtonHeight() {
        return this.h;
    }

    public final CharSequence getButtonLabel() {
        return this.f;
    }

    public final eul getButtonSize() {
        return this.c;
    }

    public final ful getButtonStyle() {
        return this.d;
    }

    public final gul getButtonType() {
        return this.e;
    }

    public final AppCompatImageView getIcon() {
        return this.l;
    }

    public final int getIconRes() {
        return this.g;
    }

    public final CharSequence getLabel() {
        return this.f;
    }

    public final DsLoader getLoader() {
        return this.m;
    }

    public final int getMaxWidth() {
        return this.i;
    }

    public final void h() {
        Context context = getContext();
        context.getClass();
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(m5d.b(R.attr.uikitRipple, context)), context.getDrawable(this.e.b), null);
        View view = this.j;
        view.setBackground(rippleDrawable);
        Context context2 = getContext();
        context2.getClass();
        jmu0.j(view, m5d.a(context2, m5d.b(this.d.f10169a, context2), m5d.b(this.d.b, context2)));
        this.h = getResources().getDimensionPixelSize(this.c.f8424a);
        g();
        AppCompatImageView appCompatImageView = this.l;
        if (appCompatImageView != null) {
            appCompatImageView.setImageTintList(getContentColorStateList());
        }
        DsLoader dsLoader = this.m;
        if (dsLoader != null) {
            dsLoader.setIndeterminateTintList(getContentColorStateList());
        }
        if (this.e.c) {
            a();
            return;
        }
        AppCompatImageView appCompatImageView2 = this.l;
        if (appCompatImageView2 != null) {
            removeView(appCompatImageView2);
            this.l = null;
        }
    }

    public final void i(int i) {
        Drawable drawable;
        if (this.g == i) {
            return;
        }
        this.g = i;
        AppCompatImageView appCompatImageView = this.l;
        if (appCompatImageView == null) {
            h();
            return;
        }
        if (i == 0) {
            drawable = null;
        } else {
            Drawable drawableU = epv0.U(i, getContext());
            if (drawableU != null) {
                drawableU.setAutoMirrored(this.b);
            }
            drawable = drawableU;
        }
        appCompatImageView.setImageDrawable(drawable);
    }

    public final void l(CharSequence charSequence) {
        charSequence.getClass();
        this.f = charSequence;
        getTextView().setText(charSequence);
        setContentDescription(charSequence);
        g();
    }

    public final void m(int i) {
        getTextView().setTextColor(i);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        gul gulVar = this.e;
        gul gulVar2 = gul.i;
        boolean z = gulVar == gulVar2 || gulVar == gul.h;
        int size = View.MeasureSpec.getSize(i);
        if (z) {
            i = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        } else {
            int i3 = this.i;
            if (i3 != -1) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), Integer.MIN_VALUE);
            }
        }
        b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth = getTextView().getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = getTextView().getLayoutParams();
        int marginEnd = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams2 = getTextView().getLayoutParams();
        float measuredWidth2 = (getMeasuredWidth() - (marginEnd + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0))) / 2;
        boolean z2 = getLayoutDirection() == 0;
        getTextView().setTranslationX(measuredWidth2);
        AppCompatImageView appCompatImageView = this.l;
        if (appCompatImageView != null) {
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 0) {
                measuredWidth2 = 0.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        t9f.b();
                        return;
                    }
                    measuredWidth2 = 0.0f;
                } else if (z2) {
                    measuredWidth2 = -measuredWidth2;
                }
            } else if (!z2) {
                measuredWidth2 = -measuredWidth2;
            }
            appCompatImageView.setTranslationX(measuredWidth2);
        }
        gul gulVar3 = this.e;
        gul gulVar4 = gul.h;
        int i4 = this.f47230a;
        if (((gulVar3 != gulVar4 && gulVar3 != gulVar2) || this.c != eul.EXTRA_SMALL) && this.c != eul.EXTRA_SMALL) {
            i4 = this.h;
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public final void setButtonHeight(int i) {
        this.h = i;
    }

    public final void setButtonLabel(CharSequence charSequence) {
        charSequence.getClass();
        this.f = charSequence;
    }

    public final void setButtonSize(eul eulVar) {
        eulVar.getClass();
        this.c = eulVar;
    }

    public final void setButtonStyle(ful fulVar) {
        fulVar.getClass();
        this.d = fulVar;
    }

    public final void setButtonType(gul gulVar) {
        gulVar.getClass();
        this.e = gulVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        AppCompatImageView appCompatImageView = this.l;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(z);
        }
        getTextView().setEnabled(z);
        DsLoader dsLoader = this.m;
        if (dsLoader != null) {
            dsLoader.setEnabled(z);
        }
        this.j.setEnabled(z);
    }

    public final void setIcon(AppCompatImageView appCompatImageView) {
        this.l = appCompatImageView;
    }

    public final void setIconAutoMirrored(boolean z) {
        this.b = z;
    }

    public final void setIconRes(int i) {
        this.g = i;
    }

    public final void setLoader(DsLoader dsLoader) {
        this.m = dsLoader;
    }

    public final void setLoading(boolean z) {
        setClickable(!z);
        getTextView().setVisibility((!this.e.d || z) ? 4 : 0);
        AppCompatImageView appCompatImageView = this.l;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(z ? 4 : 0);
        }
        DsLoader dsLoader = this.m;
        if (dsLoader != null) {
            dsLoader.setVisibility(z ? 0 : 8);
        }
    }

    public final void setMaxWidth(int i) {
        this.i = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsButton(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DsButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
