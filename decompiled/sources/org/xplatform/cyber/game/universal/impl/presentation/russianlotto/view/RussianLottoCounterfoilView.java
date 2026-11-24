package org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view;

import a.hny;
import a.mzq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class RussianLottoCounterfoilView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzq f46538a;

    /* JADX WARN: Illegal instructions before constructor call */
    public RussianLottoCounterfoilView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.synthetic_russian_lotto_counterfoil_title, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            this.f46538a = new mzq((RussianLottoVerticalTextView) viewInflate, (byte) 6);
        } else {
            hny.u("rootView");
            throw null;
        }
    }

    public final void a(int i, int i2, String str) {
        str.getClass();
        mzq mzqVar = this.f46538a;
        ((RussianLottoVerticalTextView) mzqVar.b).setText(str);
        RussianLottoVerticalTextView russianLottoVerticalTextView = (RussianLottoVerticalTextView) mzqVar.b;
        Context context = getContext();
        context.getClass();
        russianLottoVerticalTextView.setTextColor(context.getColor(i));
        Context context2 = getContext();
        context2.getClass();
        setBackground(context2.getDrawable(i2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoCounterfoilView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoCounterfoilView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
