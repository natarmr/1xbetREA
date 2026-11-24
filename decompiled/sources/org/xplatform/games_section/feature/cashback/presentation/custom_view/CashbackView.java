package org.xplatform.games_section.feature.cashback.presentation.custom_view;

import a.dyb;
import a.e0b;
import a.hny;
import a.jk3;
import a.lya;
import a.ymx;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.TimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class CashbackView extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk3 f46729a;
    public Function0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashbackView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_cashback, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.btn_take_cashback;
        Button button = (Button) yum0.f(viewInflate, R.id.btn_take_cashback);
        if (button != null) {
            i2 = R.id.ll_time;
            LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.ll_time);
            if (linearLayout != null) {
                i2 = R.id.tv_cashback;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.tv_cashback);
                if (textView != null) {
                    i2 = R.id.tv_cashback_text;
                    if (((TextView) yum0.f(viewInflate, R.id.tv_cashback_text)) != null) {
                        i2 = R.id.tv_timer;
                        TimerView timerView = (TimerView) yum0.f(viewInflate, R.id.tv_timer);
                        if (timerView != null) {
                            this.f46729a = new jk3((ConstraintLayout) viewInflate, button, linearLayout, textView, timerView, (byte) 16);
                            this.b = new e0b((byte) 2);
                            dyb.N(button, ymx.INTERVAL_2500, new lya(this, (byte) 2));
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(boolean z, boolean z2) {
        jk3 jk3Var = this.f46729a;
        boolean z3 = false;
        ((LinearLayout) jk3Var.d).setVisibility(z ? 0 : 8);
        Button button = (Button) jk3Var.c;
        if (!z && z2) {
            z3 = true;
        }
        button.setEnabled(z3);
    }

    public final Function0<Unit> getButtonClick() {
        return this.b;
    }

    public final void setButtonClick(Function0<Unit> function0) {
        function0.getClass();
        this.b = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
