package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class b99 extends FrameLayout implements q4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2197a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public int k;
    public final TextView l;
    public final AppCompatImageView m;
    public s4i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b99(Context context) {
        super(context, null);
        context.getClass();
        this.f2197a = R.attr.tabLayoutStyle;
        this.b = getResources().getDimensionPixelSize(R.dimen.size_52);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.e = dimensionPixelSize;
        this.f = getResources().getDimensionPixelOffset(R.dimen.space_4);
        this.g = getResources().getDimensionPixelOffset(R.dimen.space_8);
        this.h = getResources().getDimensionPixelOffset(R.dimen.space_12);
        this.i = m5d.b(R.attr.uikitPrimary, context);
        this.j = m5d.b(R.attr.uikitSecondary, context);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        cem0.n(R.style.TextStyle_Caption_Medium_L, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setMaxLines(2);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        textView.setTag("bubble_selection_label_text_view");
        textView.setTextColor(this.i);
        addView(textView);
        this.l = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appCompatImageView.setTag("bubble_selection_icon_view");
        addView(appCompatImageView);
        this.m = appCompatImageView;
        this.n = new s4i("", 0, null, false, 14);
    }

    @Override // a.q4i
    public final void a(s4i s4iVar, boolean z) {
        s4iVar.getClass();
        this.n = s4iVar;
        String str = s4iVar.f31606a;
        TextView textView = this.l;
        textView.setText(str);
        textView.post(new fy2(this, this.n.f31606a, (byte) 13));
        s4i s4iVar2 = this.n;
        boolean z2 = s4iVar2.d;
        int i = s4iVar2.b;
        AppCompatImageView appCompatImageView = this.m;
        appCompatImageView.setImageResource(i);
        if (z2) {
            appCompatImageView.setColorFilter(this.j);
        }
        Integer num = this.n.c;
        if (num != null) {
            int iIntValue = num.intValue();
            yoe yoeVar = new yoe(appCompatImageView, new vb8((Object) this, (byte) 21));
            yoeVar.b(null, this.f2197a);
            yoeVar.d = r0m.m;
            yoeVar.c(Integer.valueOf(iIntValue));
            int i2 = this.g;
            yoeVar.f = i2;
            int i3 = this.f;
            yoeVar.g = i3;
            DsCounter dsCounter = yoeVar.c;
            if (dsCounter != null) {
                dsCounter.g(yoeVar.e, i2, i3);
            }
        }
    }

    @Override // a.q4i
    public final int b(int i) {
        TextView textView = this.l;
        int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
        int i2 = this.d;
        return Math.min(iMeasureText + i2 + this.e + this.c + i2, i);
    }

    @Override // a.q4i
    public s4i getTabModel() {
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        super.onLayout(z, i, i2, i3, i4);
        AppCompatImageView appCompatImageView = this.m;
        ViewParent parent = appCompatImageView.getParent();
        TextView textView = this.l;
        int i5 = this.c;
        if (parent != null) {
            boolean z2 = getLayoutDirection() == 0;
            boolean zIsSelected = isSelected();
            int measuredWidth5 = this.h;
            if (zIsSelected && z2) {
                int measuredWidth6 = textView.getMeasuredWidth() + appCompatImageView.getMeasuredWidth() + i5;
                int measuredWidth7 = (getMeasuredWidth() - measuredWidth6) / 2;
                if (measuredWidth6 + measuredWidth5 + measuredWidth5 < getMeasuredWidth()) {
                    measuredWidth5 = measuredWidth7;
                }
                measuredWidth4 = appCompatImageView.getMeasuredWidth();
            } else {
                if (isSelected()) {
                    int measuredWidth8 = textView.getMeasuredWidth() + appCompatImageView.getMeasuredWidth() + i5;
                    measuredWidth2 = getMeasuredWidth() - ((getMeasuredWidth() - measuredWidth8) / 2);
                    if (measuredWidth8 + measuredWidth5 + measuredWidth5 >= getMeasuredWidth()) {
                        measuredWidth2 = getMeasuredWidth() - measuredWidth5;
                    }
                    measuredWidth3 = appCompatImageView.getMeasuredWidth();
                } else if (z2) {
                    measuredWidth5 = (getMeasuredWidth() - appCompatImageView.getMeasuredWidth()) / 2;
                    measuredWidth4 = appCompatImageView.getMeasuredWidth();
                } else {
                    measuredWidth2 = getMeasuredWidth() - ((getMeasuredWidth() - appCompatImageView.getMeasuredWidth()) / 2);
                    measuredWidth3 = appCompatImageView.getMeasuredWidth();
                }
                measuredWidth5 = measuredWidth2 - measuredWidth3;
                int measuredHeight = (getMeasuredHeight() - appCompatImageView.getMeasuredHeight()) / 2;
                appCompatImageView.layout(measuredWidth5, measuredHeight, measuredWidth2, appCompatImageView.getMeasuredHeight() + measuredHeight);
            }
            measuredWidth2 = measuredWidth4 + measuredWidth5;
            int measuredHeight2 = (getMeasuredHeight() - appCompatImageView.getMeasuredHeight()) / 2;
            appCompatImageView.layout(measuredWidth5, measuredHeight2, measuredWidth2, appCompatImageView.getMeasuredHeight() + measuredHeight2);
        }
        if (textView.getParent() == null) {
            return;
        }
        if (getLayoutDirection() == 0) {
            measuredWidth = appCompatImageView.getRight() + i5;
            left = textView.getMeasuredWidth() + measuredWidth;
        } else {
            left = appCompatImageView.getLeft() - i5;
            measuredWidth = left - textView.getMeasuredWidth();
        }
        int measuredHeight3 = (getMeasuredHeight() - textView.getMeasuredHeight()) / 2;
        textView.layout(measuredWidth, measuredHeight3, left, textView.getMeasuredHeight() + measuredHeight3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(this.b);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.e;
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        if (isSelected()) {
            int i4 = this.k;
            if (i4 > 0) {
                size2 = i4;
            }
            int i5 = this.d;
            int i6 = (((size2 - i5) - i3) - this.c) - i5;
            if (i6 > 0) {
                TextView textView = this.l;
                textView.measure(View.MeasureSpec.makeMeasureSpec(Math.min((int) textView.getPaint().measureText(textView.getText().toString()), i6), 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    @Override // a.q4i
    public void setActiveColor(int i) {
        Context context = getContext();
        context.getClass();
        this.i = m5d.b(i, context);
    }

    public final void setEndWidth(int i) {
        this.k = i;
    }

    @Override // a.q4i
    public void setInactiveColor(int i) {
        Context context = getContext();
        context.getClass();
        this.j = m5d.b(i, context);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        int i = z ? 0 : 8;
        TextView textView = this.l;
        textView.setVisibility(i);
        if (this.n.d) {
            this.m.setColorFilter(z ? this.i : this.j);
        }
        textView.setTextColor(z ? this.i : this.j);
    }

    @Override // a.q4i
    public void setStyle(aoo0 aoo0Var) {
        aoo0Var.getClass();
    }

    public void setCollapsed(boolean z) {
    }
}
