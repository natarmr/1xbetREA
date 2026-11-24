package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes6.dex */
public final class xxf extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41656a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public int i;
    public int j;
    public int k;
    public final LottieAnimationView l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;

    public xxf(Context context) {
        super(context, null, 0);
        this.f41656a = getResources().getDimensionPixelSize(R.dimen.size_128);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_4);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setId(jmu0.d());
        lottieAnimationView.setTag("alertLottieCustom");
        lottieAnimationView.setRepeatCount(-1);
        this.l = lottieAnimationView;
        this.m = maz.b(new yg3(context, (byte) 15));
        this.n = maz.b(new yg3(context, (byte) 16));
        this.o = maz.b(new yg3(context, (byte) 17));
        this.p = maz.b(new yg3(context, (byte) 18));
    }

    private final DsCheckbox getCheckBox() {
        return (DsCheckbox) this.o.getValue();
    }

    private final TextView getCheckerMessage() {
        return (TextView) this.p.getValue();
    }

    private final TextView getMessage() {
        return (TextView) this.n.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.m.getValue();
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f = charSequence;
        this.g = charSequence2;
        this.h = charSequence3;
        removeAllViews();
        LottieAnimationView lottieAnimationView = this.l;
        addView(lottieAnimationView);
        if (i != 0) {
            lottieAnimationView.setAnimation(i);
        }
        CharSequence charSequence4 = this.f;
        if (charSequence4 != null && charSequence4.length() != 0) {
            TextView title = getTitle();
            CharSequence charSequence5 = this.f;
            title.setText(charSequence5 != null ? f1t0.L(charSequence5) : null);
            addView(getTitle());
        }
        CharSequence charSequence6 = this.g;
        if (charSequence6 != null && charSequence6.length() != 0) {
            TextView message = getMessage();
            CharSequence charSequence7 = this.g;
            message.setText(charSequence7 != null ? f1t0.L(charSequence7) : null);
            addView(getMessage());
        }
        CharSequence charSequence8 = this.h;
        if (charSequence8 == null || charSequence8.length() == 0) {
            return;
        }
        TextView checkerMessage = getCheckerMessage();
        CharSequence charSequence9 = this.h;
        checkerMessage.setText(charSequence9 != null ? f1t0.L(charSequence9) : null);
        addView(getCheckBox());
        addView(getCheckerMessage());
    }

    public final DsCheckbox getChecker() {
        return getCheckBox();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l.a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        LottieAnimationView lottieAnimationView = this.l;
        int measuredWidth2 = (measuredWidth - lottieAnimationView.getMeasuredWidth()) / 2;
        jmu0.f(measuredWidth2, this.d, lottieAnimationView.getMeasuredWidth() + measuredWidth2, lottieAnimationView.getMeasuredHeight() + this.d, lottieAnimationView, this);
        CharSequence charSequence = this.f;
        int i5 = this.b;
        if (charSequence != null && charSequence.length() != 0) {
            int bottom = lottieAnimationView.getBottom() + i5;
            jmu0.f(0, bottom, getMeasuredWidth(), getTitle().getMeasuredHeight() + bottom, getTitle(), this);
        }
        CharSequence charSequence2 = this.g;
        if (charSequence2 != null && charSequence2.length() != 0) {
            int bottom2 = this.i + lottieAnimationView.getBottom() + i5;
            jmu0.f(0, bottom2, getMeasuredWidth(), getMessage().getMeasuredHeight() + bottom2, getMessage(), this);
        }
        CharSequence charSequence3 = this.h;
        if (charSequence3 == null || charSequence3.length() == 0) {
            return;
        }
        int iMax = Math.max(getCheckBox().getMeasuredHeight(), getCheckerMessage().getMeasuredHeight());
        int bottom3 = lottieAnimationView.getBottom() + i5 + this.i + this.j;
        int i6 = this.e;
        int i7 = (iMax / 2) + bottom3 + i6;
        jmu0.f(0, i7 - (getCheckBox().getMeasuredHeight() / 2), getCheckBox().getMeasuredWidth(), (getCheckBox().getMeasuredHeight() / 2) + i7, getCheckBox(), this);
        jmu0.f(getCheckBox().getMeasuredWidth() + i6, i7 - (getCheckerMessage().getMeasuredHeight() / 2), getMeasuredWidth(), (getCheckerMessage().getMeasuredHeight() / 2) + i7, getCheckerMessage(), this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f41656a, 1073741824);
        LottieAnimationView lottieAnimationView = this.l;
        lottieAnimationView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        CharSequence charSequence = this.f;
        if (charSequence != null && charSequence.length() != 0) {
            getTitle().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        CharSequence charSequence2 = this.g;
        if (charSequence2 != null && charSequence2.length() != 0) {
            getMessage().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        CharSequence charSequence3 = this.h;
        int i3 = this.e;
        int iMax = 0;
        if (charSequence3 != null && charSequence3.length() != 0) {
            getCheckBox().measure(0, 0);
            getCheckerMessage().measure(View.MeasureSpec.makeMeasureSpec((size - getCheckBox().getMeasuredWidth()) - i3, 1073741824), i2);
        }
        CharSequence charSequence4 = this.f;
        this.i = (charSequence4 == null || charSequence4.length() == 0) ? 0 : getTitle().getMeasuredHeight() + i3;
        CharSequence charSequence5 = this.g;
        int i4 = this.c;
        this.j = (charSequence5 == null || charSequence5.length() == 0) ? 0 : getMessage().getMeasuredHeight() + i4;
        CharSequence charSequence6 = this.h;
        if (charSequence6 != null && charSequence6.length() != 0) {
            iMax = Math.max(getCheckBox().getMeasuredHeight(), getCheckerMessage().getMeasuredHeight()) + i3 + i4;
        }
        this.k = iMax;
        int measuredHeight = lottieAnimationView.getMeasuredHeight() + this.d + this.b + this.i + this.j + this.k;
        setTag("DSBaseCustomLottieAlert");
        setMeasuredDimension(size, measuredHeight);
    }
}
