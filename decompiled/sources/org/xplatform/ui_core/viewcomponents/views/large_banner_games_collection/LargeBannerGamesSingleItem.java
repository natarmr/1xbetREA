package org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection;

import a.akj0;
import a.by7;
import a.cem0;
import a.daf;
import a.jmu0;
import a.k7x;
import a.k9v;
import a.m0x;
import a.m5d;
import a.maz;
import a.n0o0;
import a.n0x;
import a.pvy;
import a.q0;
import a.qzb;
import a.r0x;
import a.rvy;
import a.ujn;
import a.wgg0;
import a.xdx;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesSingleItem;

/* JADX INFO: loaded from: classes6.dex */
public final class LargeBannerGamesSingleItem extends FrameLayout {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f47218a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final ShapeableImageView g;
    public final ShapeableImageView h;
    public final TextView i;
    public final n0o0 j;
    public String k;

    /* JADX WARN: Illegal instructions before constructor call */
    public LargeBannerGamesSingleItem(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b = 0;
        super(context, attributeSet2, 0);
        this.f47218a = maz.b(new Function0(this) { // from class: a.qvy
            public final /* synthetic */ LargeBannerGamesSingleItem b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                LargeBannerGamesSingleItem largeBannerGamesSingleItem = this.b;
                switch (b2) {
                    case 0:
                        int i2 = LargeBannerGamesSingleItem.l;
                        return Integer.valueOf(largeBannerGamesSingleItem.getResources().getDisplayMetrics().widthPixels);
                    default:
                        return new r0x(largeBannerGamesSingleItem.g);
                }
            }
        });
        this.b = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_32);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_80);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_448);
        float dimension = getResources().getDimension(R.dimen.radius_24);
        float dimension2 = getResources().getDimension(R.dimen.text_24);
        this.f = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        daf dafVar = new daf();
        dafVar.S(dimension);
        akj0 akj0VarC = dafVar.c();
        wgg0 wgg0Var = new wgg0();
        wgg0 wgg0Var2 = new wgg0();
        q0 q0Var = new q0(0.0f);
        q0 q0Var2 = new q0(0.0f);
        ujn ujnVar = new ujn(b);
        ujn ujnVar2 = new ujn(b);
        ujn ujnVar3 = new ujn(b);
        ujn ujnVar4 = new ujn(b);
        qzb qzbVarA = k7x.A(0);
        q0 q0Var3 = new q0(dimension);
        qzb qzbVarA2 = k7x.A(0);
        q0 q0Var4 = new q0(dimension);
        akj0 akj0Var = new akj0();
        akj0Var.f1025a = wgg0Var;
        akj0Var.b = wgg0Var2;
        akj0Var.c = qzbVarA2;
        akj0Var.d = qzbVarA;
        akj0Var.e = q0Var;
        akj0Var.f = q0Var2;
        akj0Var.g = q0Var4;
        akj0Var.h = q0Var3;
        akj0Var.i = ujnVar;
        akj0Var.j = ujnVar2;
        akj0Var.k = ujnVar3;
        akj0Var.l = ujnVar4;
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setShapeAppearanceModel(akj0VarC);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        shapeableImageView.setScaleType(scaleType);
        addView(shapeableImageView);
        this.g = shapeableImageView;
        ShapeableImageView shapeableImageView2 = new ShapeableImageView(context);
        shapeableImageView2.setImageResource(R.drawable.bottom_gradient);
        shapeableImageView2.setShapeAppearanceModel(akj0Var);
        shapeableImageView2.setScaleType(scaleType);
        addView(shapeableImageView2);
        this.h = shapeableImageView2;
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Title_Bold_L, textView);
        textView.setTextSize(0, dimension2);
        textView.setTextColor(m5d.b(R.attr.uikitStaticWhite, context));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(by7.c().f3402a ? 8388613 : 8388611);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        addView(textView);
        this.i = textView;
        final byte b2 = 1;
        this.j = maz.b(new Function0(this) { // from class: a.qvy
            public final /* synthetic */ LargeBannerGamesSingleItem b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                LargeBannerGamesSingleItem largeBannerGamesSingleItem = this.b;
                switch (b3) {
                    case 0:
                        int i2 = LargeBannerGamesSingleItem.l;
                        return Integer.valueOf(largeBannerGamesSingleItem.getResources().getDisplayMetrics().widthPixels);
                    default:
                        return new r0x(largeBannerGamesSingleItem.g);
                }
            }
        });
    }

    public static final void a(LargeBannerGamesSingleItem largeBannerGamesSingleItem, n0x n0xVar, n0x n0xVar2) {
        r0x.d(largeBannerGamesSingleItem.getBannerImageLoadHelper(), n0xVar, new m0x(R.drawable.ic_games_placeholder, null, 6), new pvy(largeBannerGamesSingleItem, n0xVar2, (byte) 1), 8);
    }

    private final r0x getBannerImageLoadHelper() {
        return (r0x) this.j.getValue();
    }

    private final int getScreenWidth() {
        return ((Number) this.f47218a.getValue()).intValue();
    }

    public final String getLoadedPictureUrl() {
        return this.k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f;
        jmu0.f(this.f, 0, measuredWidth - i5, getMeasuredHeight(), this.g, this);
        jmu0.f(this.f, getMeasuredHeight() - this.d, getMeasuredWidth() - i5, getMeasuredHeight(), this.h, this);
        int measuredWidth2 = getMeasuredWidth();
        int i6 = this.b;
        int i7 = i5 + i6;
        TextView textView = this.i;
        jmu0.f(i7, (getMeasuredHeight() - i6) - xdx.H(textView, measuredWidth2 - (i7 * 2), 508).getHeight(), (getMeasuredWidth() - i5) - i6, getMeasuredHeight() - i6, textView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f;
        Integer numValueOf = Integer.valueOf(size - (i3 * 2));
        if (numValueOf.intValue() > this.e) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : getScreenWidth() / 2;
        int i4 = (int) (iIntValue / 1.5f);
        this.g.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        this.i.measure(View.MeasureSpec.makeMeasureSpec(iIntValue - this.c, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension((i3 * 2) + iIntValue, i4);
    }

    public final void setLabel(String str) {
        str.getClass();
        this.i.setText(str);
    }

    public final void setModel(rvy rvyVar) {
        rvyVar.getClass();
        setLabel(rvyVar.d);
        n0x n0xVar = rvyVar.b;
        n0x n0xVar2 = rvyVar.c;
        this.k = null;
        getBannerImageLoadHelper().c(n0xVar, new m0x(R.drawable.ic_games_placeholder, null, 6), new pvy(this, n0xVar, (byte) 0), new k9v((Object) this, (Object) n0xVar2, (Object) n0xVar, (byte) 9));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBannerGamesSingleItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBannerGamesSingleItem(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
