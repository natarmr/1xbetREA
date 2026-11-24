package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class wr5 extends FrameLayout implements gr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39623a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final ShapeableImageView g;
    public final ShapeableImageView h;
    public final View i;
    public final TextView j;
    public final DsTag k;
    public String l;
    public final n0o0 m;
    public final n0o0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr5(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.f39623a = dimensionPixelSize;
        this.b = getResources().getDimensionPixelSize(R.dimen.size_128);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_32);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.d = dimensionPixelSize2;
        this.e = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.f = dimensionPixelSize3;
        float dimension = getResources().getDimension(R.dimen.radius_16);
        daf dafVar = new daf();
        dafVar.S(dimension);
        akj0 akj0VarC = dafVar.c();
        wgg0 wgg0Var = new wgg0();
        wgg0 wgg0Var2 = new wgg0();
        q0 q0Var = new q0(0.0f);
        q0 q0Var2 = new q0(0.0f);
        final byte b = 0;
        ujn ujnVar = new ujn((byte) 0);
        ujn ujnVar2 = new ujn((byte) 0);
        ujn ujnVar3 = new ujn((byte) 0);
        ujn ujnVar4 = new ujn((byte) 0);
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
        shapeableImageView.setTag("BannerRectangleVerticalView");
        shapeableImageView.setShapeAppearanceModel(akj0VarC);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        shapeableImageView.setScaleType(scaleType);
        addView(shapeableImageView);
        this.g = shapeableImageView;
        ShapeableImageView shapeableImageView2 = new ShapeableImageView(context);
        final byte b2 = 1;
        shapeableImageView2.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize3, 1));
        shapeableImageView2.setShapeAppearanceModel(akj0Var);
        shapeableImageView2.setScaleType(scaleType);
        addView(shapeableImageView2);
        this.h = shapeableImageView2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, dimensionPixelSize2));
        view.setBackground(epv0.U(R.drawable.promo_store_banner_gradient, context));
        addView(view);
        this.i = view;
        TextView textView = new TextView(context);
        textView.setTag("titleRectangleVerticalTextView");
        cem0.n(R.style.TextStyle_Caption_Bold_L_StaticWhite, textView);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(by7.c().f3402a ? 8388613 : 8388611);
        textView.setLayoutDirection(3);
        textView.setTextDirection(3);
        addView(textView);
        this.j = textView;
        int i = DsTag.l;
        DsTag dsTagW = sj3.W(R.style.Widget_DSTag_RectangularL_Filled_Outlined_Red, context);
        dsTagW.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dsTagW.setLayoutDirection(3);
        dsTagW.setTextDirection(3);
        dsTagW.setMaxLines(1);
        dsTagW.setEllipsize(truncateAt);
        addView(dsTagW);
        this.k = dsTagW;
        this.m = maz.b(new Function0(this) { // from class: a.vr5
            public final /* synthetic */ wr5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                wr5 wr5Var = this.b;
                switch (b3) {
                    case 0:
                        return new r0x(wr5Var.g);
                    default:
                        return new r0x(wr5Var.h);
                }
            }
        });
        this.n = maz.b(new Function0(this) { // from class: a.vr5
            public final /* synthetic */ wr5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                wr5 wr5Var = this.b;
                switch (b3) {
                    case 0:
                        return new r0x(wr5Var.g);
                    default:
                        return new r0x(wr5Var.h);
                }
            }
        });
    }

    private final r0x getDecoratorImageHelper() {
        return (r0x) this.n.getValue();
    }

    private final r0x getLoadHelper() {
        return (r0x) this.m.getValue();
    }

    @Override // a.gr5
    public final void a(o0x o0xVar, gp5 gp5Var) {
        o0xVar.getClass();
        gp5Var.getClass();
        this.l = null;
        r0x loadHelper = getLoadHelper();
        if (!(gp5Var instanceof gp5)) {
            t9f.b();
            return;
        }
        Context context = getContext();
        context.getClass();
        m0x m0xVar = gp5Var.f11667a;
        int i = this.b;
        int i2 = this.c;
        loadHelper.c(o0xVar, f1t0.Y(context, m0xVar, this.f39623a, i, i2, i2, m5d.b(R.attr.uikitSecondary20, context), m5d.b(R.attr.uikitSecondary40, context)), new qo5(this, o0xVar, (byte) 3), new b33(this, (byte) 25));
    }

    @Override // a.gr5
    public String getLoadedImageUrl() {
        return this.l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.i;
        if (view.getParent() != null) {
            int measuredHeight = getMeasuredHeight() - view.getMeasuredHeight();
            view.layout(0, measuredHeight, getMeasuredWidth(), view.getMeasuredHeight() + measuredHeight);
        }
        TextView textView = this.j;
        if (textView.getParent() != null) {
            int measuredHeight2 = getMeasuredHeight();
            int i5 = this.e;
            int measuredHeight3 = (measuredHeight2 - i5) - textView.getMeasuredHeight();
            textView.layout(i5, measuredHeight3, getMeasuredWidth() - i5, textView.getMeasuredHeight() + measuredHeight3);
        }
        DsTag dsTag = this.k;
        if (dsTag.getParent() == null) {
            return;
        }
        jmu0.f(0, 0, dsTag.getMeasuredWidth(), dsTag.getMeasuredHeight(), dsTag, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f39623a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int i4 = this.b;
        this.g.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i3 - (this.e * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    @Override // a.gr5
    public void setDecoratorImage(o0x o0xVar) {
        ShapeableImageView shapeableImageView = this.h;
        if (o0xVar == null) {
            shapeableImageView.setVisibility(8);
        } else {
            shapeableImageView.setVisibility(0);
            r0x.d(getDecoratorImageHelper(), o0xVar, null, null, 12);
        }
    }

    @Override // a.gr5
    public void setTag(String str) {
        str.getClass();
        int i = str.length() > 0 ? 0 : 8;
        DsTag dsTag = this.k;
        dsTag.setVisibility(i);
        dsTag.setText(str);
        invalidate();
    }

    @Override // a.gr5
    public void setTagColor(goo0 goo0Var) {
        if (goo0Var != null) {
            goo0.f11641a.getClass();
            this.k.setStyle(s2m0.b(goo0Var));
            invalidate();
        }
    }

    @Override // a.gr5
    public void setTitle(String str) {
        str.getClass();
        this.j.setText(str);
        invalidate();
    }
}
