package a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class x4d extends FrameLayout implements q4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40259a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public final TextView i;
    public final AppCompatImageView j;
    public DsCounter k;
    public int l;
    public aoo0 m;
    public boolean n;
    public ValueAnimator o;
    public s4i p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4d(Context context) {
        super(context, null);
        context.getClass();
        this.f40259a = R.attr.tabLayoutStyle;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.b = dimensionPixelSize;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.d = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.e = getResources().getDimensionPixelOffset(R.dimen.space_4);
        this.f = getResources().getDimensionPixelOffset(R.dimen.space_8);
        this.g = getResources().getDimensionPixelOffset(R.dimen.space_10);
        this.h = m5d.b(R.attr.uikitSecondary, context);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        cem0.n(R.style.TextStyle_Caption_Medium_M, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setMaxLines(2);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        textView.setTag("color_selection_label_text_view");
        textView.setTextColor(this.h);
        addView(textView);
        this.i = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appCompatImageView.setTag("color_selection_icon_view");
        addView(appCompatImageView);
        this.j = appCompatImageView;
        this.l = m5d.b(R.attr.uikitPrimary, context);
        this.m = aoo0.b;
        this.n = true;
        this.p = new s4i("", 0, null, false, 14);
    }

    @Override // a.q4i
    public final void a(s4i s4iVar, boolean z) {
        s4iVar.getClass();
        this.n = z;
        this.p = s4iVar;
        setTag(s4iVar.f31606a);
        int i = this.n ? 2 : 1;
        TextView textView = this.i;
        textView.setMaxLines(i);
        textView.setText(this.p.f31606a);
        boolean z2 = s4iVar.d;
        int i2 = this.p.b;
        AppCompatImageView appCompatImageView = this.j;
        appCompatImageView.setImageResource(i2);
        if (z2) {
            appCompatImageView.setColorFilter(this.h);
        }
        Integer num = this.p.c;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = textView;
            if (!c()) {
                view = appCompatImageView;
            }
            yoe yoeVar = new yoe(view, new h8a(this, (byte) 22));
            yoeVar.b(null, this.f40259a);
            yoeVar.d = r0m.m;
            yoeVar.c(Integer.valueOf(iIntValue));
            this.k = yoeVar.c;
        }
    }

    @Override // a.q4i
    public final int b(int i) {
        return getMeasuredWidth();
    }

    public final boolean c() {
        return this.m == aoo0.d;
    }

    @Override // a.q4i
    public s4i getTabModel() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        this.o = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width;
        float x;
        float f;
        float fA;
        float y;
        float fA2;
        float x2;
        float f2;
        super.onLayout(z, i, i2, i3, i4);
        AppCompatImageView appCompatImageView = this.j;
        ViewParent parent = appCompatImageView.getParent();
        int i5 = this.c;
        if (parent != null && appCompatImageView.getVisibility() == 0) {
            int measuredWidth = (getMeasuredWidth() / 2) - (appCompatImageView.getMeasuredWidth() / 2);
            appCompatImageView.layout(measuredWidth, i5, appCompatImageView.getMeasuredWidth() + measuredWidth, appCompatImageView.getMeasuredHeight() + i5);
        }
        TextView textView = this.i;
        ViewParent parent2 = textView.getParent();
        int i6 = this.f;
        if (parent2 != null) {
            int measuredHeight = (getMeasuredHeight() - textView.getMeasuredHeight()) - i6;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.o;
                Object animatedValue = valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null;
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                measuredHeight = c() ? measuredHeight + (((getMeasuredHeight() - textView.getMeasuredHeight()) - i6) * ((int) fFloatValue)) : measuredHeight - (((getMeasuredHeight() - textView.getMeasuredHeight()) - i6) * ((int) (1.0f - fFloatValue)));
            }
            int measuredHeight2 = getMeasuredHeight() - i6;
            int measuredWidth2 = (getMeasuredWidth() - textView.getMeasuredWidth()) / 2;
            textView.layout(measuredWidth2, measuredHeight, textView.getMeasuredWidth() + measuredWidth2, measuredHeight2);
        }
        DsCounter dsCounter = this.k;
        if (dsCounter != null) {
            ValueAnimator valueAnimator3 = this.o;
            int i7 = this.g;
            int i8 = this.e;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                if (c() && getLayoutDirection() == 1) {
                    x = textView.getX() - dsCounter.getMeasuredWidth();
                    f = i8;
                } else {
                    if (c() && getLayoutDirection() == 0) {
                        width = textView.getWidth() + textView.getLeft() + i8;
                    } else {
                        if (!c() && getLayoutDirection() == 1) {
                            x = appCompatImageView.getX();
                        } else if (c() || getLayoutDirection() != 0) {
                            width = 0.0f;
                        } else {
                            x = appCompatImageView.getX() + appCompatImageView.getWidth();
                        }
                        f = i6;
                    }
                    fA = width;
                    if (c()) {
                        y = (textView.getY() + (textView.getHeight() / 2)) - (dsCounter.getHeight() / 2);
                    } else {
                        y = appCompatImageView.getY() + i7;
                    }
                    fA2 = y;
                }
                width = x - f;
                fA = width;
                if (c()) {
                    y = (textView.getY() + (textView.getHeight() / 2)) - (dsCounter.getHeight() / 2);
                } else {
                    y = appCompatImageView.getY() + i7;
                }
                fA2 = y;
            } else {
                ValueAnimator valueAnimator4 = this.o;
                Object animatedValue2 = valueAnimator4 != null ? valueAnimator4.getAnimatedValue() : null;
                animatedValue2.getClass();
                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                boolean z2 = this.n;
                int i9 = this.b;
                if (z2) {
                    x2 = ((getX() + (getMeasuredWidth() / 2)) + (i9 / 2)) - i6;
                    f2 = this.d;
                } else {
                    x2 = getX() + (getMeasuredWidth() / 2) + (i9 / 2);
                    f2 = i6;
                }
                float f3 = x2 - f2;
                float f4 = i8;
                float x3 = ((getX() + getMeasuredWidth()) - dsCounter.getWidth()) - f4;
                float x4 = textView.getX() + textView.getMeasuredWidth() + f4;
                if (x4 <= x3) {
                    x3 = x4;
                }
                float y2 = getY() + ((getMeasuredHeight() - dsCounter.getHeight()) / 2);
                float f5 = x3 - f3;
                float f6 = i5 + i7;
                float f7 = y2 - f6;
                fA2 = c() ? y2 - (f7 * fFloatValue2) : rw2.a(1.0f, fFloatValue2, f7, f6);
                fA = !c() ? x3 - (f5 * fFloatValue2) : rw2.a(1.0f, fFloatValue2, f5, f3);
            }
            dsCounter.setX(fA);
            dsCounter.setY(fA2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (!c()) {
            int i3 = this.b;
            this.j.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        int size3 = View.MeasureSpec.getSize(i);
        int i4 = this.e;
        int i5 = (size3 - i4) - i4;
        int size4 = View.MeasureSpec.getSize(i2);
        if (i5 >= 0 && size4 >= 0) {
            TextView textView = this.i;
            int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
            if (this.p.c == null || !c()) {
                this.q = false;
                measuredWidth = 0;
            } else {
                DsCounter dsCounter = this.k;
                measuredWidth = (dsCounter != null ? dsCounter.getMeasuredWidth() : 0) + i4;
                this.q = iMeasureText + measuredWidth > i5;
            }
            int iMin = Math.min(iMeasureText, i5);
            if (this.q) {
                iMin -= measuredWidth;
            }
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), iMin).build();
            staticLayoutBuild.getClass();
            textView.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(staticLayoutBuild.getHeight(), size4), Integer.MIN_VALUE));
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // a.q4i
    public void setActiveColor(int i) {
        Context context = getContext();
        context.getClass();
        this.l = m5d.b(i, context);
    }

    public void setCollapsed(boolean z) {
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        byte b = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new fd5(this, (byte) 4));
            valueAnimatorOfFloat.addListener(new ht8(this, z, b));
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat = null;
        }
        this.o = valueAnimatorOfFloat;
    }

    @Override // a.q4i
    public void setInactiveColor(int i) {
        Context context = getContext();
        context.getClass();
        this.h = m5d.b(i, context);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (this.p.d) {
            this.j.setColorFilter(z ? this.l : this.h);
        }
        this.i.setTextColor(z ? this.l : this.h);
    }

    @Override // a.q4i
    public void setStyle(aoo0 aoo0Var) {
        aoo0Var.getClass();
        this.m = aoo0Var;
        this.j.setVisibility(!c() ? 0 : 8);
    }
}
