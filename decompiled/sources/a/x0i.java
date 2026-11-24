package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class x0i extends FrameLayout implements w0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40070a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final n0o0 k;
    public final TextView l;
    public final LoadableImageView m;
    public final DsButton n;
    public final DsTag o;
    public final DsBadge p;
    public final DsCounter q;
    public final DsShimmerView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0i(Context context) {
        super(context, null);
        context.getClass();
        AttributeSet attributeSet = null;
        this.f40070a = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_24);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.c = dimensionPixelSize;
        this.d = dimensionPixelSize / 2;
        this.e = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.size_20);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_128);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.space_10);
        this.k = maz.b(new bmh((byte) 11));
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Title_Bold_M_TextPrimary, textView);
        textView.setGravity(8388627);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextAlignment(5);
        textView.setTag("DsHeaderLabelViewTestTag");
        this.l = textView;
        int i = 6;
        int i2 = 0;
        LoadableImageView loadableImageView = new LoadableImageView(context, attributeSet, i, i2);
        loadableImageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        this.m = loadableImageView;
        DsButton dsButton = new DsButton(context, attributeSet, i, i2);
        dsButton.setId(R.id.button);
        dsButton.setTag("tag_button_header_large");
        dsButton.setButtonStyle(ful.h);
        dsButton.setButtonSize(eul.EXTRA_SMALL);
        dsButton.setButtonType(gul.e);
        dsButton.h();
        this.n = dsButton;
        int i3 = DsTag.l;
        DsTag dsTagW = sj3.W(R.style.Widget_DSTag_RectangularL_Outlined_Primary, context);
        dsTagW.setTag("tag_header_large");
        dsTagW.setMaxLines(1);
        this.o = dsTagW;
        Integer[] numArr = DsBadge.e;
        this.p = ahb.B(context, vf5.f37315a);
        DsCounter dsCounter = new DsCounter(context, null, 6);
        this.q = dsCounter;
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.radius_full));
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.r = dsShimmerView;
        removeAllViews();
        jmu0.a(dsShimmerView, this);
        x0x.s(this);
        dsCounter.setComponentStyle(r0m.r);
    }

    private final int getBadgeCounterWidth() {
        DsCounter dsCounter = this.q;
        Integer numValueOf = Integer.valueOf(dsCounter.getMeasuredWidth() + this.f40070a);
        if (!jmu0.e(dsCounter)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getBadgeWidth() {
        DsBadge dsBadge = this.p;
        Integer numValueOf = Integer.valueOf(dsBadge.getMeasuredWidth() + this.f40070a);
        if (!jmu0.e(dsBadge)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getButtonWidth() {
        DsButton dsButton = this.n;
        Integer numValueOf = Integer.valueOf(dsButton.getMeasuredWidth() + this.f);
        if (!jmu0.e(dsButton)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getIconWidth() {
        LoadableImageView loadableImageView = this.m;
        Integer numValueOf = Integer.valueOf(loadableImageView.getMeasuredWidth() + this.e);
        if (!jmu0.e(loadableImageView)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final TextPaint getMeasurePaint() {
        return (TextPaint) this.k.getValue();
    }

    private final int getTagWidth() {
        DsTag dsTag = this.o;
        Integer numValueOf = Integer.valueOf(dsTag.getMeasuredWidth() + this.g);
        if (!jmu0.e(dsTag)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // a.w0i
    public final void a(o0x o0xVar, l0x l0xVar) {
        LoadableImageView loadableImageView = this.m;
        if (o0xVar == null) {
            jmu0.h(loadableImageView);
        } else {
            loadableImageView.a(o0xVar, l0xVar, new w800((byte) 17), new w800((byte) 15));
            jmu0.a(loadableImageView, this);
        }
    }

    @Override // a.w0i
    public final void b(boolean z) {
        TextView textView = this.l;
        DsBadge dsBadge = this.p;
        if (z) {
            jmu0.h(this.o);
            jmu0.h(this.q);
            dsBadge.a(textView, null);
        } else {
            dsBadge.getClass();
            textView.getClass();
            dsBadge.d.c(textView);
        }
        dsBadge.setVisibility(z ? 0 : 8);
    }

    @Override // a.w0i
    public final void c() {
        ful fulVar = ful.k;
        DsButton dsButton = this.n;
        dsButton.setButtonStyle(fulVar);
        dsButton.h();
        Context context = getContext();
        context.getClass();
        this.q.setTextColor(m5d.b(R.attr.uikitStaticWhite60, context));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(getContext().getResources().getDimension(R.dimen.radius_full));
        Context context2 = getContext();
        context2.getClass();
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite60, context2)));
        this.r.setBackground(gradientDrawable);
        Context context3 = getContext();
        context3.getClass();
        this.m.setColorFilter(m5d.b(R.attr.uikitStaticWhite60, context3));
    }

    public final int d(View view) {
        return this.d - (view.getMeasuredHeight() / 2);
    }

    public final int e(int i, int i2, String str) {
        if (i2 <= 10) {
            return 10;
        }
        getMeasurePaint().set(this.l.getPaint());
        getMeasurePaint().setTextSize(TypedValue.applyDimension(2, i2, getResources().getDisplayMetrics()));
        return getMeasurePaint().measureText(str) <= ((float) i) ? i2 : e(i, i2 - 10, str);
    }

    @Override // a.w0i
    public DsButton getButton() {
        DsButton dsButton = this.n;
        if (jmu0.e(dsButton)) {
            return dsButton;
        }
        return null;
    }

    @Override // a.w0i
    public String getLabelText() {
        return this.l.getText().toString();
    }

    @Override // android.view.View
    public DsTag getTag() {
        DsTag dsTag = this.o;
        if (jmu0.e(dsTag)) {
            return dsTag;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        x0i x0iVar;
        DsShimmerView dsShimmerView = this.r;
        if (jmu0.e(dsShimmerView)) {
            int measuredHeight = dsShimmerView.getMeasuredHeight();
            int i5 = this.j;
            x0iVar = this;
            jmu0.f(0, i5, dsShimmerView.getMeasuredWidth(), measuredHeight + i5, dsShimmerView, x0iVar);
        } else {
            x0iVar = this;
            dsShimmerView.layout(0, 0, 0, 0);
        }
        LoadableImageView loadableImageView = x0iVar.m;
        int measuredWidth = 0;
        if (jmu0.e(loadableImageView)) {
            int iD = x0iVar.d(loadableImageView);
            int measuredWidth2 = loadableImageView.getMeasuredWidth();
            jmu0.f(0, iD, measuredWidth2, loadableImageView.getMeasuredHeight() + iD, loadableImageView, x0iVar);
            measuredWidth = measuredWidth2 + x0iVar.e;
        } else {
            loadableImageView.layout(0, 0, 0, 0);
        }
        TextView textView = x0iVar.l;
        if (jmu0.e(textView)) {
            int iD2 = x0iVar.d(textView);
            jmu0.f(measuredWidth, iD2, textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + iD2, textView, x0iVar);
            measuredWidth = textView.getMeasuredWidth() + measuredWidth + x0iVar.f;
        } else {
            textView.layout(0, 0, 0, 0);
        }
        DsBadge dsBadge = x0iVar.p;
        int measuredWidth3 = dsBadge.getMeasuredWidth();
        int i6 = x0iVar.f40070a;
        Integer numValueOf = Integer.valueOf(measuredWidth3 + i6);
        if (!jmu0.e(dsBadge)) {
            numValueOf = null;
        }
        int iIntValue = measuredWidth + (numValueOf != null ? numValueOf.intValue() : 0);
        DsTag dsTag = x0iVar.o;
        if (jmu0.e(dsTag)) {
            int iD3 = x0iVar.d(dsTag);
            int measuredWidth4 = dsTag.getMeasuredWidth() + iIntValue;
            jmu0.f(iIntValue, iD3, measuredWidth4, dsTag.getMeasuredHeight() + iD3, dsTag, x0iVar);
            iIntValue = measuredWidth4 + x0iVar.g;
        } else {
            dsTag.layout(0, 0, 0, 0);
        }
        DsCounter dsCounter = x0iVar.q;
        if (jmu0.e(dsCounter)) {
            int iD4 = x0iVar.d(dsCounter);
            jmu0.f(iIntValue, iD4, dsCounter.getMeasuredWidth() + iIntValue, dsCounter.getMeasuredHeight() + iD4, x0iVar.q, x0iVar);
        } else {
            dsCounter.layout(0, 0, 0, 0);
        }
        DsButton dsButton = x0iVar.n;
        if (jmu0.e(dsButton)) {
            int iD5 = x0iVar.d(dsButton);
            int measuredWidth5 = x0iVar.getMeasuredWidth();
            jmu0.f(measuredWidth5 - dsButton.getMeasuredWidth(), iD5, measuredWidth5, dsButton.getMeasuredHeight() + iD5, dsButton, x0iVar);
        } else {
            dsButton.layout(0, 0, 0, 0);
        }
        if (jmu0.e(dsBadge)) {
            dsBadge.d(8388693, i6 + i6, -i6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) (size * 0.3f);
        DsShimmerView dsShimmerView = this.r;
        if (jmu0.e(dsShimmerView)) {
            dsShimmerView.measure(View.MeasureSpec.makeMeasureSpec(this.i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
        }
        LoadableImageView loadableImageView = this.m;
        if (jmu0.e(loadableImageView)) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.b, 1073741824);
            loadableImageView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        DsTag dsTag = this.o;
        if (jmu0.e(dsTag)) {
            dsTag.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewParent parent = dsTag.getParent();
            parent.getClass();
            wgm0.x(this.d, dsTag, parent);
        }
        DsBadge dsBadge = this.p;
        if (jmu0.e(dsBadge)) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            dsBadge.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        }
        DsCounter dsCounter = this.q;
        if (jmu0.e(dsCounter)) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            dsCounter.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
        }
        DsButton dsButton = this.n;
        if (jmu0.e(dsButton)) {
            dsButton.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dsButton.getButtonHeight(), 1073741824));
        } else {
            dsButton.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int iMax = Math.max(((((size - getIconWidth()) - getTagWidth()) - getBadgeWidth()) - getBadgeCounterWidth()) - getButtonWidth(), 0);
        TextView textView = this.l;
        textView.setTextSize(e(iMax, 20, textView.getText().toString()));
        int iMin = Math.min(iMax, (int) textView.getPaint().measureText(textView.getText().toString()));
        if (jmu0.e(textView)) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(size, this.c);
    }

    @Override // a.w0i
    public void setButtonClickListener(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    public final void setButtonIcon(Integer num) {
        DsButton dsButton = this.n;
        if (num != null) {
            dsButton.setButtonType(num.intValue() == 0 ? gul.e : gul.g);
            dsButton.i(num.intValue());
        } else {
            dsButton.setButtonType(gul.e);
            dsButton.i(0);
        }
    }

    @Override // a.w0i
    public void setButtonLabel(CharSequence charSequence) {
        DsButton dsButton = this.n;
        if (charSequence == null || charSequence.length() == 0) {
            jmu0.h(dsButton);
        } else {
            jmu0.a(dsButton, this);
            dsButton.l(charSequence);
        }
    }

    @Override // a.w0i
    public void setCounter(Integer num) {
        DsCounter dsCounter = this.q;
        if (num == null || num.intValue() <= 0) {
            jmu0.h(dsCounter);
            return;
        }
        jmu0.h(this.o);
        DsBadge dsBadge = this.p;
        dsBadge.getClass();
        TextView textView = this.l;
        textView.getClass();
        dsBadge.d.c(textView);
        jmu0.a(dsCounter, this);
        dsCounter.setCount(num);
    }

    @Override // a.w0i
    public void setIconColor(Integer num) {
        LoadableImageView loadableImageView = this.m;
        if (num != null) {
            loadableImageView.setColorFilter(num.intValue());
        } else {
            loadableImageView.setColorFilter((ColorFilter) null);
        }
    }

    @Override // a.w0i
    public void setLabel(CharSequence charSequence) {
        TextView textView = this.l;
        if (charSequence == null || charSequence.length() == 0) {
            jmu0.h(textView);
            return;
        }
        jmu0.a(textView, this);
        if (!Intrinsics.d(textView.getText(), charSequence)) {
            textView.setText(charSequence.toString());
            requestLayout();
        }
        setContentDescription(charSequence);
    }

    @Override // a.w0i
    public void setLabelClickListener(View.OnClickListener onClickListener) {
        this.l.setOnClickListener(onClickListener);
    }

    @Override // a.w0i
    public void setLabelColor(Integer num) {
        if (num != null) {
            this.l.setTextColor(num.intValue());
        }
    }

    @Override // a.w0i
    public void setModel(prv prvVar) {
        prvVar.getClass();
        boolean z = prvVar instanceof nrv;
        DsShimmerView dsShimmerView = this.r;
        if (!z) {
            removeAllViews();
            jmu0.a(dsShimmerView, this);
            x0x.s(this);
            return;
        }
        nrv nrvVar = (nrv) prvVar;
        setLabel(nrvVar.f24024a);
        setButtonLabel(nrvVar.d);
        setTagLabel(nrvVar.c);
        b(nrvVar.b);
        a(nrvVar.f, null);
        setButtonIcon(nrvVar.e);
        setCounter(nrvVar.g);
        x0x.O(this);
        jmu0.h(dsShimmerView);
    }

    @Override // a.w0i
    public void setTagClickListener(View.OnClickListener onClickListener) {
        this.o.setOnClickListener(onClickListener);
    }

    @Override // a.w0i
    public void setTagColor(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            DsTag dsTag = this.o;
            dsTag.setTextColor(iIntValue);
            Drawable background = dsTag.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.mutate();
                gradientDrawable.setStroke(dsTag.getResources().getDimensionPixelSize(R.dimen.size_1), iIntValue);
            }
        }
    }

    @Override // a.w0i
    public void setTagLabel(CharSequence charSequence) {
        DsTag dsTag = this.o;
        if (charSequence == null || charSequence.length() == 0) {
            jmu0.h(dsTag);
            return;
        }
        jmu0.h(this.q);
        DsBadge dsBadge = this.p;
        dsBadge.getClass();
        TextView textView = this.l;
        textView.getClass();
        dsBadge.d.c(textView);
        jmu0.a(dsTag, this);
        dsTag.setText(charSequence);
        dsTag.requestLayout();
    }

    @Override // a.w0i
    public void setTagStyle(int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(i, bqd0.s0);
        typedArrayObtainStyledAttributes.getClass();
        setTagColor(ktt0.l(typedArrayObtainStyledAttributes, 2));
    }

    public final void setLabel(int i) {
        setLabel(getContext().getString(i));
    }
}
