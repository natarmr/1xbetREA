package org.xplatform.games_section.feature.cashback.presentation.custom_view;

import a.a8z;
import a.ay5;
import a.bgu0;
import a.h5;
import a.j5d;
import a.knm0;
import a.maz;
import a.wez;
import a.wg;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackChoiceView;

/* JADX INFO: loaded from: classes4.dex */
public final class CashbackChoiceView extends ay5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f46727a;
    public int b;
    public final a8z c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashbackChoiceView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        this.c = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 13));
        knm0.h(getBinding().b, false);
    }

    private final bgu0 getBinding() {
        return (bgu0) this.c.getValue();
    }

    public final void b() {
        if (this.b == this.f46727a) {
            getBinding().c.setVisibility(8);
            getBinding().d.setVisibility(0);
            return;
        }
        getBinding().c.setVisibility(0);
        getBinding().d.setVisibility(8);
        TextView textView = getBinding().e;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) getContext().getString(R.string.selected)).append((CharSequence) ": ");
        spannableStringBuilderAppend.getClass();
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(j5d.a(context, R.attr.uikitTextPrimary, false));
        int length = spannableStringBuilderAppend.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) (this.b + Separators.SLASH + ((int) this.f46727a)));
        spannableStringBuilderAppend.setSpan(styleSpan, length2, spannableStringBuilderAppend.length(), 17);
        spannableStringBuilderAppend.setSpan(foregroundColorSpan, length, spannableStringBuilderAppend.length(), 17);
        textView.setText(spannableStringBuilderAppend);
    }

    @Override // a.ay5
    public int getLayoutView() {
        return R.layout.view_cashback_choice;
    }

    public final void setOnCancelClickListener(Function0<Unit> function0) {
        function0.getClass();
        getBinding().b.setOnClickListener(new wg(this, function0, (byte) 7));
    }

    public final void setOnSaveClickListener(final Function2<? super Integer, ? super Integer, Unit> function2) {
        function2.getClass();
        final byte b = 0;
        getBinding().d.setOnClickListener(new View.OnClickListener() { // from class: a.exa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                CashbackChoiceView cashbackChoiceView = this;
                Function2 function3 = function2;
                switch (b2) {
                    case 0:
                        function3.invoke(Integer.valueOf(cashbackChoiceView.b), Integer.valueOf(cashbackChoiceView.f46727a));
                        break;
                    default:
                        function3.invoke(Integer.valueOf(cashbackChoiceView.b), Integer.valueOf(cashbackChoiceView.f46727a));
                        break;
                }
            }
        });
        final byte b2 = 1;
        getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: a.exa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                CashbackChoiceView cashbackChoiceView = this;
                Function2 function3 = function2;
                switch (b3) {
                    case 0:
                        function3.invoke(Integer.valueOf(cashbackChoiceView.b), Integer.valueOf(cashbackChoiceView.f46727a));
                        break;
                    default:
                        function3.invoke(Integer.valueOf(cashbackChoiceView.b), Integer.valueOf(cashbackChoiceView.f46727a));
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackChoiceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashbackChoiceView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
