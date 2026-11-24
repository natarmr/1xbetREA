package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class ur5 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36147a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final DsShimmerView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur5(Context context, byte b) {
        super(context, null);
        this.f36147a = b;
        switch (b) {
            case 1:
                context.getClass();
                super(context, null);
                this.b = getResources().getDimensionPixelSize(R.dimen.size_320);
                this.c = getResources().getDimensionPixelSize(R.dimen.size_116);
                this.d = getResources().getDimensionPixelSize(R.dimen.size_288);
                this.e = getResources().getDimensionPixelSize(R.dimen.size_104);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.radius_16);
                this.f = context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density;
                DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
                addView(dsShimmerView);
                jmu0.i(dsShimmerView, dimensionPixelSize);
                this.g = dsShimmerView;
                break;
            default:
                context.getClass();
                this.b = getResources().getDimensionPixelSize(R.dimen.size_320);
                this.c = getResources().getDimensionPixelSize(R.dimen.size_116);
                this.d = getResources().getDimensionPixelSize(R.dimen.size_288);
                this.e = getResources().getDimensionPixelSize(R.dimen.size_104);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.radius_16);
                this.f = context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density;
                DsShimmerView dsShimmerView2 = new DsShimmerView(context, null, 6);
                addView(dsShimmerView2);
                jmu0.i(dsShimmerView2, dimensionPixelSize2);
                this.g = dsShimmerView2;
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.f36147a) {
            case 0:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
            default:
                super.onAttachedToWindow();
                x0x.s(this);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.f36147a) {
            case 0:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
            default:
                super.onDetachedFromWindow();
                x0x.O(this);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.f36147a) {
            case 0:
                float f = this.f;
                int i3 = f < 360.0f ? this.d : this.b;
                int i4 = f < 360.0f ? this.e : this.c;
                this.g.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                break;
            default:
                float f2 = this.f;
                int i5 = f2 < 360.0f ? this.d : this.b;
                int i6 = f2 < 360.0f ? this.e : this.c;
                this.g.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                break;
        }
    }
}
