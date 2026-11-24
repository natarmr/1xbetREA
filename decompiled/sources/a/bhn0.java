package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class bhn0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2617a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhn0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f2617a = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = maz.b(new hrf0(context, (byte) 18));
        this.c = maz.b(new hrf0(context, (byte) 19));
        this.d = maz.b(new hrf0(context, (byte) 20));
        this.e = maz.b(new hrf0(context, (byte) 21));
        addView(getCouponImage());
        addView(getBetType());
        addView(getBetNumber());
        addView(getShareButton());
    }

    private final TextView getBetNumber() {
        return (TextView) this.d.getValue();
    }

    private final TextView getBetType() {
        return (TextView) this.c.getValue();
    }

    private final ImageView getCouponImage() {
        return (ImageView) this.b.getValue();
    }

    private final DsButton getShareButton() {
        return (DsButton) this.e.getValue();
    }

    public final void a(String str, String str2, String str3, Function0 function0) {
        str3.getClass();
        getBetType().setText(str);
        getBetNumber().setText(str2);
        getShareButton().l(str3);
        dyb.N(getShareButton(), ymx.INTERVAL_1000, new vpj0(function0, (byte) 6));
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = (measuredHeight - getCouponImage().getMeasuredHeight()) / 2;
        int measuredHeight3 = (measuredHeight - getShareButton().getMeasuredHeight()) / 2;
        int measuredHeight4 = getBetNumber().getMeasuredHeight() + getBetType().getMeasuredHeight();
        int i5 = (measuredHeight - measuredHeight4) / 2;
        jmu0.f(0, measuredHeight2, getCouponImage().getMeasuredWidth(), getCouponImage().getMeasuredHeight() + measuredHeight2, getCouponImage(), this);
        getCouponImage().setLayoutDirection(0);
        getShareButton().layout(getLayoutDirection() == 0 ? getWidth() - getShareButton().getMeasuredWidth() : 0, measuredHeight3, getLayoutDirection() == 0 ? getWidth() : getShareButton().getMeasuredWidth(), getShareButton().getMeasuredHeight() + measuredHeight3);
        int measuredHeight5 = getBetType().getMeasuredHeight() + i5;
        TextView betType = getBetType();
        int measuredWidth = getCouponImage().getMeasuredWidth();
        int i6 = this.f2617a;
        jmu0.f(measuredWidth + i6, i5, getBetType().getMeasuredWidth() + getCouponImage().getMeasuredWidth() + i6, measuredHeight5, betType, this);
        jmu0.f(getCouponImage().getMeasuredWidth() + i6, getBetType().getMeasuredHeight() + i5, getBetNumber().getMeasuredWidth() + getCouponImage().getMeasuredWidth() + i6, i5 + measuredHeight4, getBetNumber(), this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        getCouponImage().measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        getShareButton().measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        int measuredWidth = size - getCouponImage().getMeasuredWidth();
        int i3 = this.f2617a;
        int measuredWidth2 = ((measuredWidth - i3) - getShareButton().getMeasuredWidth()) - i3;
        if (measuredWidth2 < 0) {
            measuredWidth2 = 0;
        }
        getBetType().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, Integer.MIN_VALUE), i2);
        getBetNumber().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, Integer.MIN_VALUE), i2);
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(Math.max(getCouponImage().getMeasuredHeight(), Math.max(getBetNumber().getMeasuredHeight() + getBetType().getMeasuredHeight(), getShareButton().getMeasuredHeight())), i2));
    }
}
