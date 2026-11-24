package org.xplatform.games_section.feature.cashback.presentation.custom_view;

import a.aqd0;
import a.bkb;
import a.dc3;
import a.hny;
import a.q14;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CashbackCardView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc3 f46726a;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashbackCardView(Context context, AttributeSet attributeSet, int i) {
        String string;
        String string2 = "";
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_cashback_card, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.progress_percent;
        ProgressBar progressBar = (ProgressBar) yum0.f(viewInflate, R.id.progress_percent);
        if (progressBar != null) {
            i2 = R.id.tv_cash_all;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tv_cash_all);
            if (textView != null) {
                i2 = R.id.tv_cash_current;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tv_cash_current);
                if (textView2 != null) {
                    i2 = R.id.tvCashDivider;
                    if (((TextView) yum0.f(viewInflate, R.id.tvCashDivider)) != null) {
                        i2 = R.id.tv_from_percent;
                        if (((TextView) yum0.f(viewInflate, R.id.tv_from_percent)) != null) {
                            i2 = R.id.tv_progress;
                            if (((TextView) yum0.f(viewInflate, R.id.tv_progress)) != null) {
                                i2 = R.id.tv_to_percent;
                                if (((TextView) yum0.f(viewInflate, R.id.tv_to_percent)) != null) {
                                    this.f46726a = new dc3((ViewGroup) viewInflate, (View) progressBar, textView, textView2, (byte) 16);
                                    if (attributeSet != null) {
                                        q14 q14Var = new q14(context, attributeSet, aqd0.b);
                                        TypedArray typedArray = q14Var.b;
                                        try {
                                            try {
                                                typedArray.getClass();
                                                if (typedArray.getResourceId(1, 0) == 0) {
                                                    string = "";
                                                } else {
                                                    string = context.getString(typedArray.getResourceId(1, 0));
                                                    string.getClass();
                                                }
                                                ((TextView) this.f46726a.d).setText(string);
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    bkb.E(q14Var, th);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        try {
                                            typedArray.getClass();
                                            if (typedArray.getResourceId(0, 0) != 0) {
                                                string2 = q14Var.f27932a.getString(typedArray.getResourceId(0, 0));
                                                string2.getClass();
                                            }
                                            ((TextView) this.f46726a.e).setText(string2);
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                        q14Var.close();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackCardView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
