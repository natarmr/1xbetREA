package org.xplatform.feature.balance_management_old.impl.presentation.view;

import a.epv0;
import a.hny;
import a.uk5;
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
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionCell extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk5 f46644a;

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionCell(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.balance_management_transaction_cell_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.money;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.money);
        if (textView != null) {
            i2 = R.id.separator;
            DsSeparator dsSeparator = (DsSeparator) yum0.f(viewInflate, R.id.separator);
            if (dsSeparator != null) {
                i2 = R.id.statusIcon;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.statusIcon);
                if (imageView != null) {
                    i2 = R.id.transactionDescription;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.transactionDescription);
                    if (textView2 != null) {
                        i2 = R.id.transactionTime;
                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.transactionTime);
                        if (textView3 != null) {
                            this.f46644a = new uk5((ConstraintLayout) viewInflate, textView, dsSeparator, imageView, textView2, textView3);
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setAmountColor(int i) {
        ((TextView) this.f46644a.c).setTextColor(i);
    }

    public final void setAmountText(String str) {
        str.getClass();
        ((TextView) this.f46644a.c).setText(str);
    }

    public final void setTransactionDate(String str) {
        str.getClass();
        ((TextView) this.f46644a.e).setText(str);
    }

    public final void setTransactionDescription(String str) {
        str.getClass();
        ((TextView) this.f46644a.d).setText(str);
    }

    public final void setTransactionIcon(int i) {
        ((ImageView) this.f46644a.g).setImageDrawable(epv0.U(i, getContext()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionCell(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
