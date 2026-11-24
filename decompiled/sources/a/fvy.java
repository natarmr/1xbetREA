package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fvy extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10235a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ShapeableImageView f;
    public final ShapeableImageView g;
    public final TextView h;
    public final n0o0 i;
    public String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvy(Context context) {
        super(context, null, 0);
        context.getClass();
        byte b = 0;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_188);
        this.f10235a = dimensionPixelSize;
        this.b = si30.b(dimensionPixelSize * 1.5f);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_32);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_80);
        float dimension = getResources().getDimension(R.dimen.radius_24);
        float dimension2 = getResources().getDimension(R.dimen.text_24);
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
        this.f = shapeableImageView;
        ShapeableImageView shapeableImageView2 = new ShapeableImageView(context);
        shapeableImageView2.setImageResource(R.drawable.bottom_gradient);
        shapeableImageView2.setShapeAppearanceModel(akj0Var);
        shapeableImageView2.setScaleType(scaleType);
        addView(shapeableImageView2);
        this.g = shapeableImageView2;
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
        this.h = textView;
        this.i = maz.b(new zuy(this, (byte) 1));
    }

    public static final void b(fvy fvyVar, n0x n0xVar) {
        r0x.d(fvyVar.getBannerImageLoadHelper(), n0xVar, new m0x(R.drawable.ic_games_placeholder, null, 6), new evy(fvyVar, n0xVar, (byte) 2), 8);
    }

    private final r0x getBannerImageLoadHelper() {
        return (r0x) this.i.getValue();
    }

    public final void a(n0x n0xVar, n0x n0xVar2) {
        this.j = null;
        getBannerImageLoadHelper().c(n0xVar, new m0x(R.drawable.ic_games_placeholder, null, 6), new evy(this, n0xVar, (byte) 0), new evy(this, n0xVar2, (byte) 1));
    }

    public final String getLoadedPictureUrl() {
        return this.j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jmu0.f(0, 0, this.b, this.f10235a, this.f, this);
        int i5 = this.e;
        int i6 = this.f10235a;
        jmu0.f(0, i6 - i5, this.b, i6, this.g, this);
        TextView textView = this.h;
        int i7 = this.b;
        int height = xdx.H(textView, i7, 508).getHeight();
        int i8 = this.f10235a;
        int i9 = this.c;
        int i10 = i8 - i9;
        jmu0.f(i9, i10 - height, i7 - i9, i10, textView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int i4 = this.f10235a;
        this.f.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i3 - this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(i3, i4);
    }

    public final void setLabel(String str) {
        str.getClass();
        this.h.setText(str);
    }

    public final void setModel(rvy rvyVar) {
        rvyVar.getClass();
        setLabel(rvyVar.d);
        a(rvyVar.b, rvyVar.c);
    }
}
