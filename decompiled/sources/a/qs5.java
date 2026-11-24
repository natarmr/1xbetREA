package a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class qs5 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29243a;
    public final int b;
    public final ShapeableImageView c;
    public final ShapeableImageView d;
    public final DsTag e;
    public String f;
    public final n0o0 g;
    public final n0o0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs5(Context context) {
        super(context, null);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_96);
        this.f29243a = dimensionPixelSize;
        this.b = getResources().getDimensionPixelSize(R.dimen.size_40);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_40);
        float dimension = getResources().getDimension(R.dimen.radius_24);
        daf dafVar = new daf();
        dafVar.S(dimension);
        akj0 akj0VarC = dafVar.c();
        wgg0 wgg0Var = new wgg0();
        wgg0 wgg0Var2 = new wgg0();
        q0 q0Var = new q0(0.0f);
        q0 q0Var2 = new q0(0.0f);
        final byte b = 0;
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
        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        shapeableImageView.setShapeAppearanceModel(akj0VarC);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        shapeableImageView.setScaleType(scaleType);
        shapeableImageView.setImageDrawable(epv0.U(R.drawable.ic_banner_sand_clock_square_s, context));
        addView(shapeableImageView);
        this.c = shapeableImageView;
        ShapeableImageView shapeableImageView2 = new ShapeableImageView(context);
        shapeableImageView2.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2, 81));
        shapeableImageView2.setShapeAppearanceModel(akj0Var);
        shapeableImageView2.setScaleType(scaleType);
        addView(shapeableImageView2);
        this.d = shapeableImageView2;
        int i = DsTag.l;
        DsTag dsTagW = sj3.W(R.style.Widget_DSTag_RectangularL_Filled_Outlined_Red, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        dsTagW.setLayoutParams(layoutParams);
        dsTagW.setTextDirection(3);
        final byte b2 = 1;
        dsTagW.setMaxLines(1);
        dsTagW.setEllipsize(TextUtils.TruncateAt.END);
        addView(dsTagW);
        this.e = dsTagW;
        this.g = maz.b(new Function0(this) { // from class: a.ps5
            public final /* synthetic */ qs5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                qs5 qs5Var = this.b;
                switch (b3) {
                    case 0:
                        return new r0x(qs5Var.c);
                    default:
                        return new r0x(qs5Var.d);
                }
            }
        });
        this.h = maz.b(new Function0(this) { // from class: a.ps5
            public final /* synthetic */ qs5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                qs5 qs5Var = this.b;
                switch (b3) {
                    case 0:
                        return new r0x(qs5Var.c);
                    default:
                        return new r0x(qs5Var.d);
                }
            }
        });
    }

    private final r0x getBannerImageHelper() {
        return (r0x) this.g.getValue();
    }

    private final r0x getDecoratorImageHelper() {
        return (r0x) this.h.getValue();
    }

    public final void a(o0x o0xVar, gp5 gp5Var) {
        o0xVar.getClass();
        gp5Var.getClass();
        this.f = null;
        r0x bannerImageHelper = getBannerImageHelper();
        if (!(gp5Var instanceof gp5)) {
            t9f.b();
            return;
        }
        Context context = getContext();
        context.getClass();
        m0x m0xVar = gp5Var.f11667a;
        int i = this.f29243a;
        int i2 = this.b;
        bannerImageHelper.c(o0xVar, f1t0.Y(context, m0xVar, i, i, i2, i2, m5d.b(R.attr.uikitSecondary20, context), m5d.b(R.attr.uikitSecondary40, context)), new qo5(this, o0xVar, (byte) 8), new os5(this, (byte) 0));
        setTag("BannerSquareSView");
    }

    public final String getLoadedImageUrl() {
        return this.f;
    }

    public final void setDecoratorImage(o0x o0xVar) {
        ShapeableImageView shapeableImageView = this.d;
        if (o0xVar == null) {
            shapeableImageView.setVisibility(8);
        } else {
            shapeableImageView.setVisibility(0);
            r0x.d(getDecoratorImageHelper(), o0xVar, null, null, 12);
        }
    }

    public final void setTag(String str) {
        str.getClass();
        int i = str.length() > 0 ? 0 : 8;
        DsTag dsTag = this.e;
        dsTag.setVisibility(i);
        dsTag.setText(str);
    }

    public final void setTagColor(goo0 goo0Var) {
        if (goo0Var != null) {
            goo0.f11641a.getClass();
            this.e.setStyle(s2m0.b(goo0Var));
        }
    }
}
