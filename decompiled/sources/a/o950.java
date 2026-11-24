package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes6.dex */
public final class o950 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24864a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public int h;
    public int i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;

    public o950(Context context) {
        super(context, null, 0);
        this.f24864a = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.j = maz.b(new i7q(context, (byte) 19));
        this.k = maz.b(new i7q(context, (byte) 20));
        this.l = maz.b(new i7q(context, (byte) 21));
        this.m = maz.b(new i7q(context, (byte) 22));
    }

    private final DsCheckbox getCheckBox() {
        return (DsCheckbox) this.l.getValue();
    }

    private final TextView getCheckerMessage() {
        return (TextView) this.m.getValue();
    }

    private final TextView getMessage() {
        return (TextView) this.k.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.j.getValue();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        removeAllViews();
        CharSequence charSequence4 = this.e;
        if (charSequence4 != null && charSequence4.length() != 0) {
            TextView title = getTitle();
            CharSequence charSequence5 = this.e;
            title.setText(charSequence5 != null ? f1t0.L(charSequence5) : null);
            addView(getTitle());
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null && charSequence6.length() != 0) {
            TextView message = getMessage();
            CharSequence charSequence7 = this.f;
            message.setText(charSequence7 != null ? f1t0.L(charSequence7) : null);
            addView(getMessage());
        }
        CharSequence charSequence8 = this.g;
        if (charSequence8 == null || charSequence8.length() == 0) {
            return;
        }
        TextView checkerMessage = getCheckerMessage();
        CharSequence charSequence9 = this.g;
        checkerMessage.setText(charSequence9 != null ? f1t0.L(charSequence9) : null);
        addView(getCheckBox());
        addView(getCheckerMessage());
    }

    public final DsCheckbox getChecker() {
        return getCheckBox();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CharSequence charSequence = this.e;
        int i5 = this.f24864a;
        if (charSequence != null && charSequence.length() != 0) {
            TextView title = getTitle();
            jmu0.f(0, this.f24864a, getMeasuredWidth(), getTitle().getMeasuredHeight() + i5, title, this);
        }
        CharSequence charSequence2 = this.f;
        if (charSequence2 != null && charSequence2.length() != 0) {
            TextView message = getMessage();
            jmu0.f(0, i5 + this.h, getMeasuredWidth(), getMessage().getMeasuredHeight() + this.h + i5, message, this);
        }
        CharSequence charSequence3 = this.g;
        if (charSequence3 == null || charSequence3.length() == 0) {
            return;
        }
        int iMax = Math.max(getCheckBox().getMeasuredHeight(), getCheckerMessage().getMeasuredHeight());
        int i6 = i5 + this.h + this.i;
        int i7 = this.d;
        int i8 = i6 + i7 + (iMax / 2);
        DsCheckbox checkBox = getCheckBox();
        jmu0.f(this.d, i8 - (getCheckBox().getMeasuredHeight() / 2), getCheckBox().getMeasuredWidth() + i7, (getCheckBox().getMeasuredHeight() / 2) + i8, checkBox, this);
        jmu0.f(getCheckBox().getMeasuredWidth() + i7 + i7, i8 - (getCheckerMessage().getMeasuredHeight() / 2), getMeasuredWidth(), (getCheckerMessage().getMeasuredHeight() / 2) + i8, getCheckerMessage(), this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        CharSequence charSequence = this.e;
        if (charSequence != null && charSequence.length() != 0) {
            getTitle().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        CharSequence charSequence2 = this.f;
        if (charSequence2 != null && charSequence2.length() != 0) {
            getMessage().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        CharSequence charSequence3 = this.g;
        int i3 = this.d;
        int iMax = 0;
        if (charSequence3 != null && charSequence3.length() != 0) {
            getCheckBox().measure(0, 0);
            getCheckerMessage().measure(View.MeasureSpec.makeMeasureSpec(((size - i3) - getCheckBox().getMeasuredWidth()) - i3, 1073741824), i2);
        }
        CharSequence charSequence4 = this.e;
        this.h = (charSequence4 == null || charSequence4.length() == 0) ? 0 : getTitle().getMeasuredHeight() + this.c;
        CharSequence charSequence5 = this.f;
        int i4 = this.b;
        this.i = (charSequence5 == null || charSequence5.length() == 0) ? 0 : getMessage().getMeasuredHeight() + i4;
        CharSequence charSequence6 = this.g;
        if (charSequence6 != null && charSequence6.length() != 0) {
            iMax = Math.max(getCheckBox().getMeasuredHeight(), getCheckerMessage().getMeasuredHeight()) + i3 + i4;
        }
        setMeasuredDimension(size, this.f24864a + this.h + this.i + iMax);
    }
}
