package org.xplatform.cyber.game.universal.impl.presentation.powerofpower.timer;

import a.a8z;
import a.bcm0;
import a.cww;
import a.maz;
import a.s1g;
import a.sj3;
import a.tkz;
import a.wez;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.timer.PowerOfPowerTimerView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class PowerOfPowerTimerView extends FrameLayout {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46535a;
    public final int b;
    public final a8z c;
    public final a8z d;
    public final a8z e;
    public final s1g f;

    /* JADX WARN: Illegal instructions before constructor call */
    public PowerOfPowerTimerView(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        this.f46535a = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_20);
        Function0 function0 = new Function0() { // from class: a.wqb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                PowerOfPowerTimerView powerOfPowerTimerView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = PowerOfPowerTimerView.g;
                        TextView textView = new TextView(context2);
                        textView.setTextAppearance(R.style.TextAppearance_Caption_Regular_L);
                        Context context3 = textView.getContext();
                        context3.getClass();
                        textView.setTextColor(context3.getColor(R.color.static_white));
                        textView.setGravity(17);
                        textView.setMaxLines(1);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        powerOfPowerTimerView.addView(textView);
                        return textView;
                    case 1:
                        int i3 = PowerOfPowerTimerView.g;
                        ImageView imageView = new ImageView(context2);
                        powerOfPowerTimerView.addView(imageView);
                        return imageView;
                    default:
                        int i4 = PowerOfPowerTimerView.g;
                        SyntheticTimerView syntheticTimerView = new SyntheticTimerView(context2, null, 6);
                        powerOfPowerTimerView.addView(syntheticTimerView);
                        return syntheticTimerView;
                }
            }
        };
        wez wezVar = wez.b;
        this.c = maz.a(wezVar, function0);
        final byte b3 = 1;
        this.d = maz.a(wezVar, new Function0() { // from class: a.wqb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                PowerOfPowerTimerView powerOfPowerTimerView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = PowerOfPowerTimerView.g;
                        TextView textView = new TextView(context2);
                        textView.setTextAppearance(R.style.TextAppearance_Caption_Regular_L);
                        Context context3 = textView.getContext();
                        context3.getClass();
                        textView.setTextColor(context3.getColor(R.color.static_white));
                        textView.setGravity(17);
                        textView.setMaxLines(1);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        powerOfPowerTimerView.addView(textView);
                        return textView;
                    case 1:
                        int i3 = PowerOfPowerTimerView.g;
                        ImageView imageView = new ImageView(context2);
                        powerOfPowerTimerView.addView(imageView);
                        return imageView;
                    default:
                        int i4 = PowerOfPowerTimerView.g;
                        SyntheticTimerView syntheticTimerView = new SyntheticTimerView(context2, null, 6);
                        powerOfPowerTimerView.addView(syntheticTimerView);
                        return syntheticTimerView;
                }
            }
        });
        this.e = maz.a(wezVar, new Function0() { // from class: a.wqb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                PowerOfPowerTimerView powerOfPowerTimerView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = PowerOfPowerTimerView.g;
                        TextView textView = new TextView(context2);
                        textView.setTextAppearance(R.style.TextAppearance_Caption_Regular_L);
                        Context context3 = textView.getContext();
                        context3.getClass();
                        textView.setTextColor(context3.getColor(R.color.static_white));
                        textView.setGravity(17);
                        textView.setMaxLines(1);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        powerOfPowerTimerView.addView(textView);
                        return textView;
                    case 1:
                        int i3 = PowerOfPowerTimerView.g;
                        ImageView imageView = new ImageView(context2);
                        powerOfPowerTimerView.addView(imageView);
                        return imageView;
                    default:
                        int i4 = PowerOfPowerTimerView.g;
                        SyntheticTimerView syntheticTimerView = new SyntheticTimerView(context2, null, 6);
                        powerOfPowerTimerView.addView(syntheticTimerView);
                        return syntheticTimerView;
                }
            }
        });
        s1g s1gVar = new s1g(this, R.color.static_black_40);
        s1gVar.c(getResources().getDimension(R.dimen.corner_radius_8));
        this.f = s1gVar;
        setWillNotDraw(false);
    }

    private final ImageView getIvTimerIcon() {
        return (ImageView) this.d.getValue();
    }

    private final TextView getTvDescription() {
        return (TextView) this.c.getValue();
    }

    private final SyntheticTimerView getVTimer() {
        return (SyntheticTimerView) this.e.getValue();
    }

    public final void a(long j, tkz tkzVar) {
        SyntheticTimerView.b(getVTimer(), j, tkzVar, null, 8);
        getVTimer().setTimerDescription("");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.f.a(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.b(0, 0, getMeasuredWidth(), getMeasuredHeight());
        bcm0.s(getTvDescription(), (getMeasuredWidth() - getTvDescription().getMeasuredWidth()) / 2, (getMeasuredHeight() - getTvDescription().getMeasuredHeight()) / 2);
        ImageView ivTimerIcon = getIvTimerIcon();
        int measuredWidth = getMeasuredWidth();
        int i5 = this.b;
        cww.A(ivTimerIcon, this, ((measuredWidth - i5) - getVTimer().getMeasuredWidth()) / 2, (getMeasuredHeight() - i5) / 2);
        cww.A(getVTimer(), this, ((getMeasuredWidth() + i5) - getVTimer().getMeasuredWidth()) / 2, (getMeasuredHeight() - getVTimer().getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        TextView tvDescription = getTvDescription();
        int i3 = this.f46535a;
        bcm0.t(tvDescription, size - (i3 * 2), size2 - (i3 * 2));
        ImageView ivTimerIcon = getIvTimerIcon();
        int i4 = this.b;
        bcm0.t(ivTimerIcon, i4, i4);
        bcm0.u(getVTimer());
        setMeasuredDimension(size, size2);
    }

    public final void setDescription(String str) {
        str.getClass();
        getTvDescription().setText(str);
    }

    public final void setIcon(int i) {
        ImageView ivTimerIcon = getIvTimerIcon();
        Context context = getContext();
        context.getClass();
        ivTimerIcon.setImageDrawable(sj3.U(i, context));
    }

    public final void setTimerVisibility(boolean z) {
        getVTimer().setVisibility(z ? 0 : 8);
        getIvTimerIcon().setVisibility(z ? 0 : 8);
        getTvDescription().setVisibility(z ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerOfPowerTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerOfPowerTimerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
