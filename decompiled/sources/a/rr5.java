package a;

import android.content.Context;
import android.text.BidiFormatter;
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
public final class rr5 extends FrameLayout implements gr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30964a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final ShapeableImageView j;
    public final ShapeableImageView k;
    public final View l;
    public final TextView m;
    public final DsTag n;
    public String o;
    public final n0o0 p;
    public final n0o0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr5(Context context) {
        super(context, null);
        context.getClass();
        this.f30964a = getResources().getDimensionPixelSize(R.dimen.size_320);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_116);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_288);
        this.c = dimensionPixelSize;
        this.d = getResources().getDimensionPixelSize(R.dimen.size_104);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_40);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.f = dimensionPixelSize2;
        this.g = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.h = dimensionPixelSize3;
        this.i = context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density;
        boolean zIsRtlContext = BidiFormatter.getInstance().isRtlContext();
        daf dafVar = new daf();
        dafVar.S(getResources().getDimension(R.dimen.radius_16));
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
        float dimension = getResources().getDimension(R.dimen.radius_16);
        qzb qzbVarA = k7x.A(0);
        q0 q0Var3 = new q0(dimension);
        float dimension2 = getResources().getDimension(R.dimen.radius_16);
        qzb qzbVarA2 = k7x.A(0);
        q0 q0Var4 = new q0(dimension2);
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
        shapeableImageView.setTag("BannerRectangleHorizontalView");
        shapeableImageView.setShapeAppearanceModel(akj0VarC);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        shapeableImageView.setScaleType(scaleType);
        addView(shapeableImageView);
        this.j = shapeableImageView;
        ShapeableImageView shapeableImageView2 = new ShapeableImageView(context);
        final byte b2 = 1;
        shapeableImageView2.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize3, 1));
        shapeableImageView2.setShapeAppearanceModel(akj0Var);
        shapeableImageView2.setScaleType(scaleType);
        addView(shapeableImageView2);
        this.k = shapeableImageView2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, dimensionPixelSize2));
        view.setBackground(epv0.U(R.drawable.promo_store_banner_gradient, context));
        addView(view);
        this.l = view;
        TextView textView = new TextView(context);
        textView.setTag("titleRectangleHorizontalTextView");
        cem0.n(R.style.TextStyle_Caption_Bold_L_StaticWhite, textView);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(zIsRtlContext ? 8388613 : 8388611);
        addView(textView);
        this.m = textView;
        int i = DsTag.l;
        DsTag dsTagW = sj3.W(R.style.Widget_DSTag_RectangularL_Filled_Outlined_Red, context);
        dsTagW.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dsTagW.setLayoutDirection(3);
        dsTagW.setTextDirection(3);
        dsTagW.setMaxLines(1);
        dsTagW.setEllipsize(truncateAt);
        addView(dsTagW);
        this.n = dsTagW;
        this.p = maz.b(new Function0(this) { // from class: a.qr5
            public final /* synthetic */ rr5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                rr5 rr5Var = this.b;
                switch (b3) {
                    case 0:
                        return new r0x(rr5Var.j);
                    default:
                        return new r0x(rr5Var.k);
                }
            }
        });
        this.q = maz.b(new Function0(this) { // from class: a.qr5
            public final /* synthetic */ rr5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                rr5 rr5Var = this.b;
                switch (b3) {
                    case 0:
                        return new r0x(rr5Var.j);
                    default:
                        return new r0x(rr5Var.k);
                }
            }
        });
    }

    private final r0x getDecoratorImageHelper() {
        return (r0x) this.q.getValue();
    }

    private final r0x getLoadHelper() {
        return (r0x) this.p.getValue();
    }

    @Override // a.gr5
    public final void a(o0x o0xVar, gp5 gp5Var) {
        o0xVar.getClass();
        gp5Var.getClass();
        this.o = null;
        r0x loadHelper = getLoadHelper();
        if (!(gp5Var instanceof gp5)) {
            t9f.b();
            return;
        }
        Context context = getContext();
        context.getClass();
        m0x m0xVar = gp5Var.f11667a;
        float f = this.i;
        int i = f < 360.0f ? this.c : this.f30964a;
        int i2 = f < 360.0f ? this.d : this.b;
        int i3 = this.e;
        loadHelper.c(o0xVar, f1t0.Y(context, m0xVar, i, i2, i3, i3, m5d.b(R.attr.uikitSecondary20, context), m5d.b(R.attr.uikitSecondary40, context)), new qo5(this, o0xVar, (byte) 1), new b33((Object) this, (byte) 23));
    }

    @Override // a.gr5
    public String getLoadedImageUrl() {
        return this.o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.l;
        if (view.getParent() != null) {
            int height = getHeight() - view.getHeight();
            view.layout(0, height, getWidth(), view.getHeight() + height);
        }
        TextView textView = this.m;
        if (textView.getParent() != null) {
            int width = (getWidth() - textView.getMeasuredWidth()) / 2;
            int height2 = (getHeight() - this.g) - textView.getMeasuredHeight();
            textView.layout(width, height2, textView.getMeasuredWidth() + width, textView.getMeasuredHeight() + height2);
        }
        DsTag dsTag = this.n;
        if (dsTag.getParent() == null) {
            return;
        }
        jmu0.f(0, 0, dsTag.getMeasuredWidth(), dsTag.getMeasuredHeight(), dsTag, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.i;
        int i3 = f < 360.0f ? this.c : this.f30964a;
        int i4 = f < 360.0f ? this.d : this.b;
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
        this.l.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i3 - (this.g * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.n.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    @Override // a.gr5
    public void setDecoratorImage(o0x o0xVar) {
        ShapeableImageView shapeableImageView = this.k;
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
        DsTag dsTag = this.n;
        dsTag.setVisibility(i);
        dsTag.setText(str);
        invalidate();
    }

    @Override // a.gr5
    public void setTagColor(goo0 goo0Var) {
        if (goo0Var != null) {
            goo0.f11641a.getClass();
            this.n.setStyle(s2m0.b(goo0Var));
            invalidate();
        }
    }

    @Override // a.gr5
    public void setTitle(String str) {
        str.getClass();
        this.m.setText(str);
        invalidate();
    }
}
