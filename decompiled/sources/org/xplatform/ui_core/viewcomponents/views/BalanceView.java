package org.xplatform.ui_core.viewcomponents.views;

import a.hny;
import a.qn5;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class BalanceView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn5 f47207a;

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.balance_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.balanceTextView;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.balanceTextView);
        if (textView != null) {
            i2 = R.id.currentBalanceTextView;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.currentBalanceTextView);
            if (textView2 != null) {
                i2 = R.id.iconBalance;
                if (((ImageView) yum0.f(viewInflate, R.id.iconBalance)) != null) {
                    this.f47207a = new qn5((ConstraintLayout) viewInflate, textView, textView2, (byte) 0);
                    setVisibility(8);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalanceView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
