package org.xplatform.pin_code.impl.presentation.views.enteringpincode;

import a.bqd0;
import a.dw9;
import a.m5d;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class PinCodeSymbolButton extends AppCompatTextView {
    public final int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public PinCodeSymbolButton(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.i = -1;
        setLayoutDirection(0);
        setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.Y, 0, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(0, -1);
        this.i = i2;
        setSymbol(i2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setSymbol(int i) {
        int i2;
        String string;
        if (i == 1) {
            string = "";
        } else {
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = R.string.two_button_text;
                        break;
                    case 3:
                        i2 = R.string.three_button_text;
                        break;
                    case 4:
                        i2 = R.string.four_button_text;
                        break;
                    case 5:
                        i2 = R.string.five_button_text;
                        break;
                    case 6:
                        i2 = R.string.six_button_text;
                        break;
                    case 7:
                        i2 = R.string.seven_button_text;
                        break;
                    case 8:
                        i2 = R.string.eight_button_text;
                        break;
                    case 9:
                        i2 = R.string.nine_button_text;
                        break;
                    default:
                        i2 = R.string.one_button_text;
                        break;
                }
            } else {
                i2 = R.string.zero_button_text;
            }
            string = getResources().getString(i2);
            string.getClass();
        }
        SpannableString spannableString = new SpannableString(dw9.m(i, Separators.RETURN, string));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.text_32);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_Regular), 0, 1, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, 1, 33);
        Context context = getContext();
        context.getClass();
        spannableString.setSpan(new ForegroundColorSpan(m5d.b(R.attr.uikitTextPrimary, context)), 0, 1, 33);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.TextAppearance_Caption_Medium_L), 2, spannableString.length(), 33);
        Context context2 = getContext();
        context2.getClass();
        spannableString.setSpan(new ForegroundColorSpan(m5d.b(R.attr.uikitSecondary, context2)), 2, spannableString.length(), 33);
        setText(spannableString);
        if (i == 1) {
            setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.ic_voicemail);
        }
    }

    public final int getNumberValue() {
        return this.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCodeSymbolButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCodeSymbolButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
