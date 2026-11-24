package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class sp5 extends q4 {
    public static final ek5 g = new ek5((byte) 10);
    public final dp5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp5(dp5 dp5Var) {
        super(g);
        dp5Var.getClass();
        this.f = dp5Var;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        switch (((up5) A(i)).f36046a) {
            case RectangleHorizontal:
                return 1;
            case RectangleVertical:
                return 2;
            case SquareL:
                return 3;
            case SquareS:
                return 4;
            case CardHorizontal:
                return 5;
            case RectangleHorizontalNoTitle:
                return 8;
            case RectangleVerticalNoTitle:
                return 9;
            case SquareLNoTitle:
                return 10;
            case SquareSNoTitle:
                return 6;
            default:
                t9f.b();
                return 0;
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        byte b = 0;
        AttributeSet attributeSet = null;
        byte b2 = 1;
        dp5 dp5Var = this.f;
        switch (i) {
            case 1:
                Context context = viewGroup.getContext();
                context.getClass();
                return new qp5(new ur5(context, (byte) 1));
            case 2:
                Context context2 = viewGroup.getContext();
                context2.getClass();
                so5 so5Var = new so5(context2, attributeSet, (byte) 3);
                int dimensionPixelSize = so5Var.getResources().getDimensionPixelSize(R.dimen.size_96);
                int dimensionPixelSize2 = so5Var.getResources().getDimensionPixelSize(R.dimen.size_128);
                int dimensionPixelSize3 = so5Var.getResources().getDimensionPixelSize(R.dimen.radius_16);
                DsShimmerView dsShimmerView = new DsShimmerView(context2, null, 6);
                dsShimmerView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
                jmu0.i(dsShimmerView, dimensionPixelSize3);
                so5Var.addView(dsShimmerView);
                return new qp5(so5Var);
            case 3:
                Context context3 = viewGroup.getContext();
                context3.getClass();
                so5 so5Var2 = new so5(context3, attributeSet, (byte) 5);
                int dimensionPixelSize4 = so5Var2.getResources().getDimensionPixelSize(R.dimen.size_128);
                int dimensionPixelSize5 = so5Var2.getResources().getDimensionPixelSize(R.dimen.size_128);
                int dimensionPixelSize6 = so5Var2.getResources().getDimensionPixelSize(R.dimen.radius_16);
                DsShimmerView dsShimmerView2 = new DsShimmerView(context3, null, 6);
                dsShimmerView2.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize4, dimensionPixelSize5));
                jmu0.i(dsShimmerView2, dimensionPixelSize6);
                so5Var2.addView(dsShimmerView2);
                return new qp5(so5Var2);
            case 4:
                if (rp5.f30870a[dp5Var.ordinal()] == 1) {
                    Context context4 = viewGroup.getContext();
                    context4.getClass();
                    return new qp5(new yp5(context4));
                }
                Context context5 = viewGroup.getContext();
                context5.getClass();
                return new qp5(new wp5(context5));
            case 5:
                Context context6 = viewGroup.getContext();
                context6.getClass();
                so5 so5Var3 = new so5(context6, attributeSet, b);
                int dimensionPixelSize7 = so5Var3.getResources().getDimensionPixelSize(R.dimen.size_272);
                int dimensionPixelSize8 = so5Var3.getResources().getDimensionPixelSize(R.dimen.size_172);
                int dimensionPixelSize9 = so5Var3.getResources().getDimensionPixelSize(R.dimen.radius_16);
                DsShimmerView dsShimmerView3 = new DsShimmerView(context6, null, 6);
                dsShimmerView3.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize7, dimensionPixelSize8));
                jmu0.i(dsShimmerView3, dimensionPixelSize9);
                so5Var3.addView(dsShimmerView3);
                return new qp5(so5Var3);
            case 6:
                if (rp5.f30870a[dp5Var.ordinal()] == 1) {
                    Context context7 = viewGroup.getContext();
                    context7.getClass();
                    xp5 xp5Var = new xp5(context7, null);
                    int dimensionPixelSize10 = xp5Var.getResources().getDimensionPixelSize(R.dimen.size_96);
                    int dimensionPixelSize11 = xp5Var.getResources().getDimensionPixelSize(R.dimen.size_96);
                    float dimension = xp5Var.getResources().getDimension(R.dimen.radius_24);
                    View dsShimmerView4 = new DsShimmerView(context7, null, 6);
                    dsShimmerView4.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize10, dimensionPixelSize11));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context7)));
                    dsShimmerView4.setBackground(gradientDrawable);
                    xp5Var.addView(dsShimmerView4);
                    xp5Var.setContentDescription("shimmerBanner");
                    return new qp5(xp5Var);
                }
                Context context8 = viewGroup.getContext();
                context8.getClass();
                vp5 vp5Var = new vp5(context8, null);
                int dimensionPixelSize12 = vp5Var.getResources().getDimensionPixelSize(R.dimen.size_96);
                int dimensionPixelSize13 = vp5Var.getResources().getDimensionPixelSize(R.dimen.size_96);
                float dimension2 = vp5Var.getResources().getDimension(R.dimen.radius_24);
                View dsShimmerView5 = new DsShimmerView(context8, null, 6);
                dsShimmerView5.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize12, dimensionPixelSize13));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(dimension2);
                gradientDrawable2.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite20, context8)));
                dsShimmerView5.setBackground(gradientDrawable2);
                vp5Var.addView(dsShimmerView5);
                vp5Var.setContentDescription("shimmerBanner");
                return new qp5(vp5Var);
            case 7:
                Context context9 = viewGroup.getContext();
                context9.getClass();
                so5 so5Var4 = new so5(context9, attributeSet, b2);
                int dimensionPixelSize14 = so5Var4.getResources().getDimensionPixelSize(R.dimen.size_272);
                int dimensionPixelSize15 = so5Var4.getResources().getDimensionPixelSize(R.dimen.size_108);
                int dimensionPixelSize16 = so5Var4.getResources().getDimensionPixelSize(R.dimen.radius_16);
                DsShimmerView dsShimmerView6 = new DsShimmerView(context9, null, 6);
                dsShimmerView6.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize14, dimensionPixelSize15));
                jmu0.i(dsShimmerView6, dimensionPixelSize16);
                so5Var4.addView(dsShimmerView6);
                return new qp5(so5Var4);
            case 8:
                Context context10 = viewGroup.getContext();
                context10.getClass();
                return new qp5(new ur5(context10, (byte) 0));
            case 9:
                Context context11 = viewGroup.getContext();
                context11.getClass();
                so5 so5Var5 = new so5(context11, attributeSet, (byte) 2);
                int dimensionPixelSize17 = so5Var5.getResources().getDimensionPixelSize(R.dimen.size_96);
                int dimensionPixelSize18 = so5Var5.getResources().getDimensionPixelSize(R.dimen.size_128);
                int dimensionPixelSize19 = so5Var5.getResources().getDimensionPixelSize(R.dimen.radius_16);
                DsShimmerView dsShimmerView7 = new DsShimmerView(context11, null, 6);
                dsShimmerView7.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize17, dimensionPixelSize18));
                jmu0.i(dsShimmerView7, dimensionPixelSize19);
                so5Var5.addView(dsShimmerView7);
                return new qp5(so5Var5);
            case 10:
                Context context12 = viewGroup.getContext();
                context12.getClass();
                so5 so5Var6 = new so5(context12, attributeSet, (byte) 4);
                int dimensionPixelSize20 = so5Var6.getResources().getDimensionPixelSize(R.dimen.size_128);
                int dimensionPixelSize21 = so5Var6.getResources().getDimensionPixelSize(R.dimen.size_128);
                int dimensionPixelSize22 = so5Var6.getResources().getDimensionPixelSize(R.dimen.radius_16);
                DsShimmerView dsShimmerView8 = new DsShimmerView(context12, null, 6);
                dsShimmerView8.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize20, dimensionPixelSize21));
                jmu0.i(dsShimmerView8, dimensionPixelSize22);
                so5Var6.addView(dsShimmerView8);
                return new qp5(so5Var6);
            default:
                jf4.o(twn.m(i, "Unknown view type "));
                return null;
        }
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
    }
}
