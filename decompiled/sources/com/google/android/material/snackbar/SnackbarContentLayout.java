package com.google.android.material.snackbar;

import a.g7x;
import a.n73;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f45579a;
    public Button b;
    public Button c;
    public int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g7x.W(context, R.attr.motionEasingEmphasizedInterpolator, n73.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f45579a.getPaddingTop() == i2 && this.f45579a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f45579a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public Button getCloseView() {
        return this.c;
    }

    public TextView getMessageView() {
        return this.f45579a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f45579a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
        this.c = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f45579a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.d = i;
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}
