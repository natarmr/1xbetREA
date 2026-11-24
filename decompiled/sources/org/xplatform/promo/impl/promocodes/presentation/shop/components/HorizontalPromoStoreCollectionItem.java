package org.xplatform.promo.impl.promocodes.presentation.shop.components;

import a.akj0;
import a.bdv;
import a.cem0;
import a.euc0;
import a.jmu0;
import a.kuc0;
import a.m0x;
import a.m5d;
import a.maz;
import a.n0o0;
import a.n0x;
import a.o0x;
import a.okw;
import a.r0m;
import a.ulw;
import a.x0x;
import a.yoe;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class HorizontalPromoStoreCollectionItem extends FrameLayout implements kuc0 {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46832a;
    public final DsShimmerView b;
    public final LoadableShapeableImageView c;
    public final View d;
    public final AppCompatTextView e;
    public final int f;
    public final n0o0 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public HorizontalPromoStoreCollectionItem(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46832a = getResources().getDimensionPixelSize(R.dimen.space_12);
        akj0 akj0VarC = akj0.g(context, R.style.ShapeAppearance_Radius16, 0).c();
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        jmu0.i(dsShimmerView, context.getResources().getDimensionPixelSize(R.dimen.radius_16));
        this.b = dsShimmerView;
        LoadableShapeableImageView loadableShapeableImageView = new LoadableShapeableImageView(context, null, 6);
        loadableShapeableImageView.setTag("promoShopImage");
        loadableShapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        loadableShapeableImageView.setShapeAppearanceModel(akj0VarC);
        this.c = loadableShapeableImageView;
        View view = new View(context);
        view.setBackgroundResource(R.drawable.promo_store_item_gradient);
        this.d = view;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTag("promoShopName");
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAlignment(5);
        cem0.n(R.style.TextStyle_Text_Bold_StaticWhite, appCompatTextView);
        this.e = appCompatTextView;
        this.f = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_36), Integer.MIN_VALUE);
        this.g = maz.b(new bdv(this, (byte) 17));
        addView(dsShimmerView);
        addView(loadableShapeableImageView);
        addView(view);
        addView(appCompatTextView);
        getCounterHelper().b(attributeSet, 0);
        yoe counterHelper = getCounterHelper();
        r0m r0mVar = r0m.p;
        counterHelper.getClass();
        counterHelper.d = r0mVar;
        getCounterHelper().f(m5d.b(R.attr.uikitBackground, context));
    }

    private final yoe getCounterHelper() {
        return (yoe) this.g.getValue();
    }

    @Override // a.kuc0
    public final void a(euc0 euc0Var, m0x m0xVar) {
        euc0Var.getClass();
        m0xVar.getClass();
        if (euc0Var instanceof euc0) {
            b(euc0Var.c, m0xVar, euc0Var.e, euc0Var.f);
            setLabel(euc0Var.b);
            getCounterHelper().d(0, "");
        }
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.b.setVisibility(8);
        x0x.O(this);
    }

    @Override // a.kuc0
    public final void b(n0x n0xVar, o0x o0xVar, Function2 function2, Function1 function1) {
        o0xVar.getClass();
        this.c.h(n0xVar, o0xVar, new okw(function2, this, (byte) 3), new ulw(function1, this, o0xVar, function2, (byte) 0));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LoadableShapeableImageView loadableShapeableImageView = this.c;
        loadableShapeableImageView.layout(0, 0, loadableShapeableImageView.getMeasuredWidth(), loadableShapeableImageView.getMeasuredHeight());
        this.d.layout(0, 0, loadableShapeableImageView.getMeasuredWidth(), loadableShapeableImageView.getMeasuredHeight());
        this.b.layout(0, 0, loadableShapeableImageView.getMeasuredWidth(), loadableShapeableImageView.getMeasuredHeight());
        AppCompatTextView appCompatTextView = this.e;
        int measuredHeight = appCompatTextView.getMeasuredHeight();
        int i5 = this.f46832a;
        int i6 = ((i4 - i2) - measuredHeight) - i5;
        jmu0.f(i5, i6, (i3 - i) - i5, i6 + measuredHeight, appCompatTextView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.e.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (this.f46832a * 2), 1073741824), this.f);
        measureChild(this.c, i, i2);
        measureChild(this.b, i, i2);
        measureChild(this.d, i, i2);
        setMeasuredDimension(i, i2);
    }

    @Override // a.kuc0
    public void setLabel(String str) {
        str.getClass();
        AppCompatTextView appCompatTextView = this.e;
        appCompatTextView.setText(str);
        this.d.setVisibility(str.length() > 0 ? 0 : 8);
        setContentDescription(appCompatTextView.getText());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalPromoStoreCollectionItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalPromoStoreCollectionItem(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
