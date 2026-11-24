package org.xplatform.lucky_wheel.presentation.views;

import a.dc3;
import a.hny;
import a.xmq0;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LuckyWheelTimerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc3 f46764a;

    /* JADX WARN: Illegal instructions before constructor call */
    public LuckyWheelTimerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_lucky_wheel_timer, this);
        int i2 = R.id.tvDividerHoursMinutes;
        if (((TextView) yum0.f(this, R.id.tvDividerHoursMinutes)) != null) {
            i2 = R.id.tvDividerMinutesSeconds;
            if (((TextView) yum0.f(this, R.id.tvDividerMinutesSeconds)) != null) {
                i2 = R.id.tvHours;
                TextView textView = (TextView) yum0.f(this, R.id.tvHours);
                if (textView != null) {
                    i2 = R.id.tvMinutes;
                    TextView textView2 = (TextView) yum0.f(this, R.id.tvMinutes);
                    if (textView2 != null) {
                        i2 = R.id.tvSeconds;
                        TextView textView3 = (TextView) yum0.f(this, R.id.tvSeconds);
                        if (textView3 != null) {
                            this.f46764a = new dc3((ViewGroup) this, textView, (View) textView2, (View) textView3, (byte) 18);
                            setGravity(1);
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static String a(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public final void b(xmq0 xmq0Var) {
        dc3 dc3Var = this.f46764a;
        ((TextView) dc3Var.e).setText(a(xmq0Var.f41141a));
        ((TextView) dc3Var.c).setText(a(xmq0Var.b));
        ((TextView) dc3Var.d).setText(a(xmq0Var.c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyWheelTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyWheelTimerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
