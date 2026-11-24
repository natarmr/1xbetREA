package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class vgn0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37390a;
    public final int b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgn0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f37390a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = maz.b(new hrf0(context, (byte) 6));
        this.d = maz.b(new hrf0(context, (byte) 7));
        this.e = maz.b(new hrf0(context, (byte) 8));
        addView(getBetType());
        addView(getCouponImage());
        addView(getBetNumber());
    }

    private final TextView getBetNumber() {
        return (TextView) this.e.getValue();
    }

    private final TextView getBetType() {
        return (TextView) this.c.getValue();
    }

    private final ImageView getCouponImage() {
        return (ImageView) this.d.getValue();
    }

    public final void a(String str, String str2) {
        getBetType().setText(str);
        getBetNumber().setText(str2);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int iMax = Math.max(getBetType().getMeasuredHeight(), Math.max(getCouponImage().getMeasuredHeight(), getBetNumber().getMeasuredHeight()));
        int measuredHeight = (iMax - getBetType().getMeasuredHeight()) / 2;
        int measuredHeight2 = (iMax - getCouponImage().getMeasuredHeight()) / 2;
        int measuredHeight3 = (iMax - getBetNumber().getMeasuredHeight()) / 2;
        getCouponImage().layout(getLayoutDirection() == 0 ? 0 : getWidth() - getCouponImage().getMeasuredWidth(), measuredHeight2, getLayoutDirection() == 0 ? getCouponImage().getMeasuredWidth() : getWidth(), getCouponImage().getMeasuredHeight() + measuredHeight2);
        getCouponImage().setLayoutDirection(0);
        int measuredHeight4 = getBetType().getMeasuredHeight() + measuredHeight;
        TextView betType = getBetType();
        int measuredWidth2 = getCouponImage().getMeasuredWidth();
        int i5 = this.f37390a;
        jmu0.f(measuredWidth2 + i5, measuredHeight, getBetType().getMeasuredWidth() + getCouponImage().getMeasuredWidth() + i5, measuredHeight4, betType, this);
        int measuredHeight5 = getBetNumber().getMeasuredHeight() + measuredHeight3;
        if (getLayoutDirection() == 0) {
            measuredWidth = getBetType().getMeasuredWidth() + getCouponImage().getMeasuredWidth() + i5 + this.b;
        } else {
            measuredWidth = 0;
        }
        getBetNumber().layout(measuredWidth, measuredHeight3, getLayoutDirection() == 0 ? getWidth() : getBetNumber().getMeasuredWidth(), measuredHeight5);
        getBetNumber().setLayoutDirection(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) (((double) size) * 0.6d);
        getCouponImage().measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        getBetType().measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        int measuredWidth = getBetType().getMeasuredWidth();
        int i4 = this.f37390a;
        int measuredWidth2 = getCouponImage().getMeasuredWidth() + (measuredWidth + i4) > i3 ? (i3 - getCouponImage().getMeasuredWidth()) - i4 : getBetType().getMeasuredWidth();
        if (measuredWidth2 < 0) {
            measuredWidth2 = 0;
        }
        getBetType().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, Integer.MIN_VALUE), i2);
        int measuredWidth3 = (((size - measuredWidth2) - getCouponImage().getMeasuredWidth()) - i4) - this.b;
        getBetNumber().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3 >= 0 ? measuredWidth3 : 0, Integer.MIN_VALUE), i2);
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(Math.max(getBetType().getMeasuredHeight(), Math.max(getCouponImage().getMeasuredHeight(), getBetNumber().getMeasuredHeight())), i2));
    }
}
