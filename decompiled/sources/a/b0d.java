package a;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b0d extends ConstraintLayout {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0d(Context context) {
        super(context, null, 0);
        context.getClass();
        this.q = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 20));
    }

    private final xfu0 getBinding() {
        return (xfu0) this.q.getValue();
    }

    public final String getText() {
        return getBinding().b.getText().toString();
    }

    public final float getTextSize() {
        return getBinding().b.getTextSize();
    }

    public final void setDrawable(int i) {
        AppCompatTextView appCompatTextView = getBinding().b;
        Context context = getContext();
        context.getClass();
        appCompatTextView.setBackground(context.getDrawable(i));
    }

    public final void setText(String str) {
        str.getClass();
        getBinding().b.setText(str);
    }

    public final void setTextSize(float f) {
        getBinding().b.setTextSize(0, f);
    }

    public final void u() {
        aem0.r(getBinding().b, 2, 48, 2, 2);
    }

    public final void v(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(i, i2, i3, i4);
        getBinding().b.setLayoutParams(layoutParams);
    }
}
