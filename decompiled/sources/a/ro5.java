package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class ro5 extends FrameLayout implements gr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30820a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final ShapeableImageView h;
    public final ShapeableImageView i;
    public final to5 j;
    public final DsTag k;
    public String l;
    public final n0o0 m;
    public final n0o0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro5(Context context) {
        super(context, null);
        context.getClass();
        this.f30820a = getResources().getDimensionPixelSize(R.dimen.size_272);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_172);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_256);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_92);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_40);
        float dimension = getResources().getDimension(R.dimen.radius_16);
        daf dafVar = new daf();
        dafVar.S(dimension);
        akj0 akj0VarC = dafVar.c();
        wgg0 wgg0Var = new wgg0();
        wgg0 wgg0Var2 = new wgg0();
        q0 q0Var = new q0(0.0f);
        q0 q0Var2 = new q0(0.0f);
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
        shapeableImageView.setShapeAppearanceModel(akj0VarC);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        shapeableImageView.setScaleType(scaleType);
        addView(shapeableImageView);
        this.h = shapeableImageView;
        ShapeableImageView shapeableImageView2 = new ShapeableImageView(context);
        shapeableImageView2.setShapeAppearanceModel(akj0Var);
        shapeableImageView2.setScaleType(scaleType);
        addView(shapeableImageView2);
        this.i = shapeableImageView2;
        to5 to5Var = new to5(context);
        to5Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(to5Var);
        this.j = to5Var;
        int i = DsTag.l;
        DsTag dsTagW = sj3.W(R.style.Widget_DSTag_RectangularL_Filled_Outlined_Red, context);
        dsTagW.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dsTagW.setLayoutDirection(3);
        dsTagW.setTextDirection(3);
        dsTagW.setMaxLines(1);
        dsTagW.setEllipsize(TextUtils.TruncateAt.END);
        this.k = dsTagW;
        this.m = maz.b(new po5(this, (byte) 1));
        this.n = maz.b(new po5(this, (byte) 2));
        setBackground(context.getDrawable(R.drawable.banner_card_horizontal_bg));
        jmu0.j(this, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundContent, context)));
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
        int i = this.d;
        int i2 = this.e;
        loadHelper.c(o0xVar, f1t0.Y(context, m0xVar, this.c, i, i2, i2, m5d.b(R.attr.uikitSecondary20, context), m5d.b(R.attr.uikitSecondary40, context)), new qo5(this, o0xVar, (byte) 0), new b33(this, (byte) 22));
    }

    @Override // a.gr5
    public String getLoadedImageUrl() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.j(this.h, new po5(this, (byte) 0));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ShapeableImageView shapeableImageView = this.h;
        ViewParent parent = shapeableImageView.getParent();
        int i5 = this.d;
        int i6 = this.f;
        if (parent != null) {
            shapeableImageView.layout(i6, i6, getMeasuredWidth() - i6, i6 + i5);
        }
        ShapeableImageView shapeableImageView2 = this.i;
        if (shapeableImageView2.getParent() != null) {
            int i7 = i5 + i6;
            shapeableImageView2.layout(i6, i7 - this.g, getMeasuredWidth() - i6, i7);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_64);
        jmu0.f(0, this.b - Math.max(this.j.getMeasuredHeight(), dimensionPixelSize), getMeasuredWidth(), this.b, this.j, this);
        DsTag dsTag = this.k;
        if (dsTag.getParent() == null) {
            return;
        }
        int measuredWidth = dsTag.getMeasuredWidth();
        int measuredHeight = dsTag.getMeasuredHeight();
        int i8 = this.f;
        jmu0.f(i8, i8, measuredWidth + i8, i8 + measuredHeight, dsTag, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        int i4 = this.f30820a;
        measureChild(this.j, View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }

    @Override // a.gr5
    public void setDecoratorImage(o0x o0xVar) {
        ShapeableImageView shapeableImageView = this.i;
        if (o0xVar == null) {
            shapeableImageView.setVisibility(8);
        } else {
            shapeableImageView.setVisibility(0);
            r0x.d(getDecoratorImageHelper(), o0xVar, null, null, 12);
        }
    }

    public final void setSubtitle(String str) {
        str.getClass();
        this.j.setSubtitle(str);
        invalidate();
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
        this.j.setTitle(str);
        invalidate();
    }
}
