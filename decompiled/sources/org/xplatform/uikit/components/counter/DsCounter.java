package org.xplatform.uikit.components.counter;

import a.a8z;
import a.bqd0;
import a.cem0;
import a.e0g0;
import a.f140;
import a.g0g0;
import a.gq80;
import a.j0g0;
import a.jmu0;
import a.k14;
import a.ktt0;
import a.lrk;
import a.m5d;
import a.maz;
import a.n0o0;
import a.ntl;
import a.q3d;
import a.r0m;
import a.ryl;
import a.wez;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCounter extends ViewGroup {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47241a;
    public final int b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public r0m g;
    public int h;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCounter(Context context, AttributeSet attributeSet, int i2) {
        byte b = 2;
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47241a = maz.a(wez.b, new ntl(this, b));
        this.b = getResources().getDimensionPixelOffset(R.dimen.space_2);
        this.c = maz.b(new ryl(context, (byte) 1));
        this.d = maz.b(new ryl(context, b));
        this.e = maz.b(new ryl(context, (byte) 3));
        this.f = maz.b(new lrk(context, this, (byte) 13));
        this.g = r0m.n;
        addView(getCounterTextView());
        addView(getAccordionImageView());
        getAttachHelper().f = false;
        getAttachHelper().a(attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.x, 0, 0);
        setComponentStyle((r0m) r0m.t.get(typedArrayObtainStyledAttributes.getInt(3, 0)));
        int i3 = typedArrayObtainStyledAttributes.getInt(1, 0);
        Integer numValueOf = Integer.valueOf(i3);
        int i4 = typedArrayObtainStyledAttributes.getInt(2, 0);
        Integer numValueOf2 = Integer.valueOf(i4);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 8);
        String string = strP != null ? strP.toString() : null;
        if (i3 < 1) {
            setVisibility(8);
            j();
        } else if (string == null) {
            e(numValueOf, numValueOf2);
        } else {
            if (i4 > 0) {
                StringBuilder sb = new StringBuilder();
                this.g.getClass();
                sb.append(c(i3, 99));
                sb.append(Separators.SLASH);
                this.g.getClass();
                sb.append(c(i4, 99));
                getCounterTextView().setText(String.format("%s %s", Arrays.copyOf(new Object[]{sb.toString(), string}, 2)));
            } else {
                getCounterTextView().setText(String.format("%s %s", Arrays.copyOf(new Object[]{c(i3, this.g.f29637a), string}, 2)));
            }
            setActivated(true);
            setVisibility(0);
            j();
        }
        f(this, typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        setTag("Counter");
    }

    public static final AppCompatImageView a(Context context, DsCounter dsCounter) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(jmu0.d());
        appCompatImageView.setImageDrawable(dsCounter.getArrowDownDrawable());
        appCompatImageView.setVisibility(8);
        return appCompatImageView;
    }

    public static String c(int i2, int i3) {
        return i2 <= i3 ? String.valueOf(i2) : f140.i(i3, "+");
    }

    public static void f(DsCounter dsCounter, boolean z) {
        dsCounter.getAccordionImageView().setImageDrawable(z ? dsCounter.getArrowUpDrawable() : dsCounter.getArrowDownDrawable());
    }

    private final AppCompatImageView getAccordionImageView() {
        return (AppCompatImageView) this.f.getValue();
    }

    private final Drawable getArrowDownDrawable() {
        return (Drawable) this.d.getValue();
    }

    private final Drawable getArrowUpDrawable() {
        return (Drawable) this.c.getValue();
    }

    private final k14 getAttachHelper() {
        return (k14) this.f47241a.getValue();
    }

    private final AppCompatTextView getCounterTextView() {
        return (AppCompatTextView) this.e.getValue();
    }

    public final DsCounter b(View view, Function0 function0) {
        view.getClass();
        return (DsCounter) getAttachHelper().b(view, function0);
    }

    public final void d(Integer num, String str) {
        if (num == null || num.intValue() < 1) {
            setVisibility(8);
            j();
        } else {
            if (str == null) {
                setCount(num);
                return;
            }
            AppCompatTextView counterTextView = getCounterTextView();
            int iIntValue = num.intValue();
            short s = this.g.f29637a;
            counterTextView.setText(String.format("%s %s", Arrays.copyOf(new Object[]{iIntValue <= s ? String.valueOf(num.intValue()) : f140.i(s, "+"), str}, 2)));
            setActivated(true);
            setVisibility(0);
            j();
        }
    }

    public final void e(Integer num, Integer num2) {
        String strC;
        if (num.intValue() < 1) {
            setVisibility(8);
            j();
            return;
        }
        AppCompatTextView counterTextView = getCounterTextView();
        int iIntValue = num2.intValue();
        r0m r0mVar = this.g;
        if (iIntValue > 0) {
            StringBuilder sb = new StringBuilder();
            int iIntValue2 = num.intValue();
            r0mVar.getClass();
            sb.append(c(iIntValue2, 99));
            sb.append(Separators.SLASH);
            int iIntValue3 = num2.intValue();
            this.g.getClass();
            sb.append(c(iIntValue3, 99));
            strC = sb.toString();
        } else {
            strC = c(num.intValue(), r0mVar.f29637a);
        }
        counterTextView.setText(strC);
        setActivated(true);
        setVisibility(0);
        j();
    }

    public final void g(int i2, int i3, int i4) {
        getAttachHelper().d(i2, i3, i4);
    }

    public final r0m getComponentStyle() {
        return this.g;
    }

    public final Integer getCount() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Integer.valueOf(Integer.parseInt(getCounterTextView().getText().toString()));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        return (Integer) g0g0Var;
    }

    public final void h(Integer num) {
        Drawable background = getAttachHelper().f17500a.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(num != null ? ColorStateList.valueOf(num.intValue()) : null);
        }
    }

    public final void i(int i2) {
        getAttachHelper().e(i2);
    }

    public final void j() {
        setContentDescription(String.valueOf(getCount()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int dimensionPixelSize;
        if (getAccordionImageView().getVisibility() == 0) {
            Integer num = this.g.j;
            if (num != null) {
                Resources resources = getResources();
                resources.getClass();
                dimensionPixelSize = resources.getDimensionPixelSize(num.intValue());
            } else {
                dimensionPixelSize = 0;
            }
        } else {
            dimensionPixelSize = ((i4 - i2) - this.h) / 2;
        }
        int i6 = (i5 - i3) / 2;
        List listJ = q3d.j(getCounterTextView(), getAccordionImageView());
        ArrayList<View> arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        int i7 = dimensionPixelSize;
        for (View view : arrayList) {
            int measuredWidth = view.getMeasuredWidth() + i7;
            DsCounter dsCounter = this;
            jmu0.f(i7, i6 - (view.getMeasuredHeight() / 2), measuredWidth, (view.getMeasuredHeight() / 2) + i6, view, dsCounter);
            i7 = measuredWidth + dsCounter.b;
            this = dsCounter;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        this.h = 0;
        if (getAccordionImageView().getVisibility() == 0) {
            jmu0.g(getAccordionImageView());
            this.h = getAccordionImageView().getMeasuredWidth() + this.b + this.h;
        }
        Integer num = this.g.j;
        if (num != null) {
            Resources resources = getResources();
            resources.getClass();
            dimensionPixelSize = resources.getDimensionPixelSize(num.intValue());
        } else {
            dimensionPixelSize = 0;
        }
        Integer num2 = this.g.k;
        if (num2 != null) {
            Resources resources2 = getResources();
            resources2.getClass();
            dimensionPixelSize2 = resources2.getDimensionPixelSize(num2.intValue());
        } else {
            dimensionPixelSize2 = 0;
        }
        int i4 = dimensionPixelSize + dimensionPixelSize2;
        if (!this.g.g) {
            jmu0.g(getCounterTextView());
            this.h = getCounterTextView().getMeasuredWidth() + this.h;
            setMeasuredDimension(Math.max(getPaddingEnd() + getPaddingStart() + this.h + i4, getSuggestedMinimumWidth()), getSuggestedMinimumHeight());
            return;
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        getCounterTextView().measure(View.MeasureSpec.makeMeasureSpec((suggestedMinimumWidth - i4) - this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.h = getCounterTextView().getMeasuredWidth() + this.h;
        setMeasuredDimension(suggestedMinimumWidth, getSuggestedMinimumHeight());
    }

    public final void setComponentStyle(r0m r0mVar) {
        Integer numValueOf;
        int dimensionPixelSize;
        r0mVar.getClass();
        this.g = r0mVar;
        AppCompatTextView counterTextView = getCounterTextView();
        int i2 = r0mVar.b;
        Integer num = r0mVar.f;
        Integer num2 = r0mVar.d;
        cem0.n(i2, counterTextView);
        setMinimumWidth(getResources().getDimensionPixelOffset(r0mVar.i));
        setMinimumHeight(getResources().getDimensionPixelSize(r0mVar.h));
        setBackgroundResource(r0mVar.c.intValue());
        if (num2 != null) {
            Context context = getContext();
            context.getClass();
            numValueOf = Integer.valueOf(m5d.b(num2.intValue(), context));
        } else {
            numValueOf = null;
        }
        h(numValueOf);
        Integer num3 = r0mVar.e;
        if (num3 != null) {
            Resources resources = getResources();
            resources.getClass();
            dimensionPixelSize = resources.getDimensionPixelSize(num3.intValue());
        } else {
            dimensionPixelSize = 0;
        }
        k14 attachHelper = getAttachHelper();
        attachHelper.e = dimensionPixelSize;
        Integer num4 = attachHelper.g;
        if (num4 != null) {
            int iIntValue = num4.intValue();
            Drawable background = attachHelper.f17500a.getBackground();
            if (background != null) {
                gq80.m0(background, iIntValue, dimensionPixelSize);
            }
        }
        if (num != null) {
            Context context2 = getContext();
            context2.getClass();
            i(m5d.b(num.intValue(), context2));
        }
        getAccordionImageView().setVisibility(r0mVar != r0m.o ? 8 : 0);
        requestLayout();
        invalidate();
    }

    public final void setCount(Integer num) {
        if (num == null || num.intValue() < 1) {
            getCounterTextView().setText("");
            setVisibility(8);
            j();
            return;
        }
        AppCompatTextView counterTextView = getCounterTextView();
        int iIntValue = num.intValue();
        short s = this.g.f29637a;
        counterTextView.setText(iIntValue <= s ? String.valueOf(num.intValue()) : f140.i(s, "+"));
        setActivated(true);
        setVisibility(0);
        j();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        jmu0.b(this, z);
    }

    public final void setTextColor(int i2) {
        getCounterTextView().setTextColor(i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCounter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCounter(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
