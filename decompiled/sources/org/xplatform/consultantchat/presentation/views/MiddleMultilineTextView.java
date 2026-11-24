package org.xplatform.consultantchat.presentation.views;

import a.kng0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class MiddleMultilineTextView extends TextView {
    public MiddleMultilineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final int getVisibleLength() {
        return getText().toString().substring(getLayout().getLineStart(0), getLayout().getLineEnd(getMaxLines() - 1)).length();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMaxLines() > 1) {
            int length = getText().length();
            int visibleLength = getVisibleLength();
            if (length > visibleLength) {
                String string = getText().toString();
                int i3 = visibleLength - 3;
                if (string == null) {
                    string = null;
                } else if (i3 >= 1 && string.length() > i3) {
                    if (i3 == 1) {
                        string = string.substring(0, 1).concat("...");
                    } else {
                        int iCeil = (int) Math.ceil(string.length() / 2);
                        int length2 = string.length() - i3;
                        int iCeil2 = (int) Math.ceil(length2 / 2);
                        string = kng0.l(string.substring(0, iCeil - iCeil2), "...", string.substring(iCeil + (length2 - iCeil2)));
                    }
                }
                setText(string);
            }
        }
    }
}
