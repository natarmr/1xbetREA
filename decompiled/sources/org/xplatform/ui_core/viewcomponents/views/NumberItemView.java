package org.xplatform.ui_core.viewcomponents.views;

import a.a8z;
import a.aqd0;
import a.ha30;
import a.maz;
import a.u860;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class NumberItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberItemView(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        context.getClass();
        this.f47209a = maz.a(wez.b, new ha30(this, this, (byte) 10));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aqd0.p);
            typedArrayObtainStyledAttributes.getClass();
            int i2 = typedArrayObtainStyledAttributes.getInt(0, -1);
            getBinding().b.setText(String.valueOf(i2));
            TextView textView = getBinding().c;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        i = R.string.two_button_alphabet_;
                        break;
                    case 3:
                        i = R.string.three_button_alphabet_;
                        break;
                    case 4:
                        i = R.string.four_button_alphabet_;
                        break;
                    case 5:
                        i = R.string.five_button_alphabet_;
                        break;
                    case 6:
                        i = R.string.six_button_alphabet_;
                        break;
                    case 7:
                        i = R.string.seven_button_alphabet_;
                        break;
                    case 8:
                        i = R.string.eight_button_alphabet_;
                        break;
                    case 9:
                        i = R.string.nine_button_alphabet_;
                        break;
                    default:
                        i = R.string.one_button_alphabet_;
                        break;
                }
            } else {
                i = R.string.zero_button_alphabet_;
            }
            textView.setText(i);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final u860 getBinding() {
        return (u860) this.f47209a.getValue();
    }

    public final int a() {
        try {
            return Integer.parseInt(getBinding().b.getText().toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
