package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class y0i extends FrameLayout implements w0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41806a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final TextView i;
    public final LoadableImageView j;
    public final DsButton k;
    public final DsShimmerView l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0i(Context context) {
        super(context, null);
        context.getClass();
        AttributeSet attributeSet = null;
        this.f41806a = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_36);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_16);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_96);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.size_12);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.space_12);
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Text_Medium, textView);
        textView.setTextColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context)));
        textView.setGravity(8388627);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(2);
        textView.setTextAlignment(5);
        textView.setTag("DSHeaderSmall");
        this.i = textView;
        int i = 6;
        int i2 = 0;
        LoadableImageView loadableImageView = new LoadableImageView(context, attributeSet, i, i2);
        loadableImageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        this.j = loadableImageView;
        DsButton dsButton = new DsButton(context, attributeSet, i, i2);
        dsButton.setId(R.id.button);
        dsButton.setTag("tag_button_header_small");
        dsButton.setOnClickListener(null);
        dsButton.setButtonStyle(ful.g);
        dsButton.setButtonSize(eul.MEDIUM);
        dsButton.setButtonType(gul.e);
        dsButton.h();
        this.k = dsButton;
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.radius_full));
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.l = dsShimmerView;
        removeAllViews();
        jmu0.a(dsShimmerView, this);
        x0x.s(this);
    }

    private final int getButtonWidth() {
        DsButton dsButton = this.k;
        Integer numValueOf = Integer.valueOf(dsButton.getMeasuredWidth());
        if (!jmu0.e(dsButton)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getIconWidth() {
        LoadableImageView loadableImageView = this.j;
        Integer numValueOf = Integer.valueOf(loadableImageView.getMeasuredWidth() + this.c);
        if (!jmu0.e(loadableImageView)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // a.w0i
    public final void a(o0x o0xVar, l0x l0xVar) {
        LoadableImageView loadableImageView = this.j;
        if (o0xVar == null) {
            jmu0.h(loadableImageView);
        } else {
            loadableImageView.a(o0xVar, l0xVar, new w800((byte) 17), new w800((byte) 15));
            jmu0.a(loadableImageView, this);
        }
    }

    @Override // a.w0i
    public final void c() {
        ful fulVar = ful.k;
        DsButton dsButton = this.k;
        dsButton.setButtonStyle(fulVar);
        dsButton.h();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(getContext().getResources().getDimension(R.dimen.radius_full));
        Context context = getContext();
        context.getClass();
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite60, context)));
        this.l.setBackground(gradientDrawable);
        Context context2 = getContext();
        context2.getClass();
        this.j.setColorFilter(m5d.b(R.attr.uikitStaticWhite60, context2));
    }

    @Override // a.w0i
    public DsButton getButton() {
        DsButton dsButton = this.k;
        if (jmu0.e(dsButton)) {
            return dsButton;
        }
        return null;
    }

    @Override // a.w0i
    public String getLabelText() {
        return this.i.getText().toString();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y0i y0iVar;
        DsShimmerView dsShimmerView = this.l;
        if (jmu0.e(dsShimmerView)) {
            int measuredHeight = dsShimmerView.getMeasuredHeight();
            int i5 = this.h;
            y0iVar = this;
            jmu0.f(0, i5, dsShimmerView.getMeasuredWidth(), measuredHeight + i5, dsShimmerView, y0iVar);
        } else {
            y0iVar = this;
            dsShimmerView.layout(0, 0, 0, 0);
        }
        LoadableImageView loadableImageView = y0iVar.j;
        int i6 = 0;
        if (jmu0.e(loadableImageView)) {
            int measuredHeight2 = (y0iVar.getMeasuredHeight() / 2) - (loadableImageView.getMeasuredHeight() / 2);
            int measuredWidth = loadableImageView.getMeasuredWidth();
            jmu0.f(0, measuredHeight2, measuredWidth, loadableImageView.getMeasuredHeight() + measuredHeight2, loadableImageView, y0iVar);
            i6 = measuredWidth + y0iVar.c;
        } else {
            loadableImageView.layout(0, 0, 0, 0);
        }
        TextView textView = y0iVar.i;
        if (jmu0.e(textView)) {
            int measuredHeight3 = (y0iVar.getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
            jmu0.f(i6, measuredHeight3, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight() + measuredHeight3, textView, y0iVar);
            textView.getMeasuredWidth();
        } else {
            textView.layout(0, 0, 0, 0);
        }
        DsButton dsButton = y0iVar.k;
        if (!jmu0.e(dsButton)) {
            dsButton.layout(0, 0, 0, 0);
            return;
        }
        int measuredHeight4 = (y0iVar.getMeasuredHeight() / 2) - (dsButton.getMeasuredHeight() / 2);
        int measuredWidth2 = y0iVar.getMeasuredWidth();
        jmu0.f(measuredWidth2 - dsButton.getMeasuredWidth(), measuredHeight4, measuredWidth2, dsButton.getMeasuredHeight() + measuredHeight4, dsButton, y0iVar);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        DsShimmerView dsShimmerView = this.l;
        if (jmu0.e(dsShimmerView)) {
            dsShimmerView.measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        }
        LoadableImageView loadableImageView = this.j;
        if (jmu0.e(loadableImageView)) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f41806a, 1073741824);
            loadableImageView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        int iconWidth = size - getIconWidth();
        DsButton dsButton = this.k;
        if (jmu0.e(dsButton)) {
            dsButton.measure(View.MeasureSpec.makeMeasureSpec(iconWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dsButton.getButtonHeight(), 1073741824));
        }
        int buttonWidth = iconWidth - (getButtonWidth() + this.d);
        TextView textView = this.i;
        if (jmu0.e(textView)) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(buttonWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        boolean zE = jmu0.e(textView);
        int i3 = this.b;
        if (zE && textView.getLineCount() > 1) {
            i3 += this.e;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // a.w0i
    public void setButtonClickListener(View.OnClickListener onClickListener) {
        this.k.setOnClickListener(onClickListener);
    }

    public final void setButtonIcon(Integer num) {
        DsButton dsButton = this.k;
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
        DsButton dsButton = this.k;
        if (charSequence == null || charSequence.length() == 0) {
            jmu0.h(dsButton);
        } else {
            jmu0.a(dsButton, this);
            dsButton.l(charSequence);
        }
    }

    @Override // a.w0i
    public void setIconColor(Integer num) {
        LoadableImageView loadableImageView = this.j;
        if (num != null) {
            loadableImageView.setColorFilter(num.intValue());
        } else {
            loadableImageView.setColorFilter((ColorFilter) null);
        }
    }

    @Override // a.w0i
    public void setLabel(CharSequence charSequence) {
        TextView textView = this.i;
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
        this.i.setOnClickListener(onClickListener);
    }

    @Override // a.w0i
    public void setLabelColor(Integer num) {
        if (num != null) {
            this.i.setTextColor(num.intValue());
        }
    }

    @Override // a.w0i
    public void setModel(prv prvVar) {
        prvVar.getClass();
        boolean z = prvVar instanceof nrv;
        DsShimmerView dsShimmerView = this.l;
        if (!z) {
            removeAllViews();
            jmu0.a(dsShimmerView, this);
            x0x.s(this);
            return;
        }
        nrv nrvVar = (nrv) prvVar;
        setLabel(nrvVar.f24024a);
        setButtonLabel(nrvVar.d);
        a(nrvVar.f, null);
        setButtonIcon(nrvVar.e);
        x0x.O(this);
        jmu0.h(dsShimmerView);
    }

    @Override // android.view.View
    public DsTag getTag() {
        return null;
    }

    @Override // a.w0i
    public final void b(boolean z) {
    }

    @Override // a.w0i
    public void setCounter(Integer num) {
    }

    @Override // a.w0i
    public void setTagClickListener(View.OnClickListener onClickListener) {
    }

    @Override // a.w0i
    public void setTagColor(Integer num) {
    }

    @Override // a.w0i
    public void setTagLabel(CharSequence charSequence) {
    }

    @Override // a.w0i
    public void setTagStyle(int i) {
    }

    public final void setLabel(int i) {
        setLabel(getContext().getString(i));
    }
}
