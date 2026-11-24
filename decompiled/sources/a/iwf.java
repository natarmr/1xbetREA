package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes6.dex */
public final class iwf extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15487a;
    public final int b;
    public final int c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public int g;
    public int h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;

    public iwf(Context context) {
        super(context, null, 0);
        this.f15487a = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.i = maz.b(new yg3(context, (byte) 8));
        this.j = maz.b(new yg3(context, (byte) 9));
        this.k = maz.b(new yg3(context, (byte) 10));
        this.l = maz.b(new yg3(context, (byte) 11));
    }

    private final DsCheckbox getCheckBox() {
        return (DsCheckbox) this.k.getValue();
    }

    private final TextView getCheckerMessage() {
        return (TextView) this.l.getValue();
    }

    private final TextView getMessage() {
        return (TextView) this.j.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.i.getValue();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        removeAllViews();
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null && charSequence4.length() != 0) {
            TextView title = getTitle();
            CharSequence charSequence5 = this.d;
            title.setText(charSequence5 != null ? f1t0.L(charSequence5) : null);
            addView(getTitle());
        }
        CharSequence charSequence6 = this.e;
        if (charSequence6 != null && charSequence6.length() != 0) {
            TextView message = getMessage();
            CharSequence charSequence7 = this.e;
            message.setText(charSequence7 != null ? f1t0.L(charSequence7) : null);
            addView(getMessage());
        }
        CharSequence charSequence8 = this.f;
        if (charSequence8 == null || charSequence8.length() == 0) {
            return;
        }
        TextView checkerMessage = getCheckerMessage();
        CharSequence charSequence9 = this.f;
        checkerMessage.setText(charSequence9 != null ? f1t0.L(charSequence9) : null);
        addView(getCheckBox());
        addView(getCheckerMessage());
    }

    public final DsCheckbox getChecker() {
        return getCheckBox();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CharSequence charSequence = this.d;
        int i5 = this.f15487a;
        if (charSequence != null && charSequence.length() != 0) {
            TextView title = getTitle();
            jmu0.f(0, this.f15487a, getMeasuredWidth(), getTitle().getMeasuredHeight() + i5, title, this);
        }
        CharSequence charSequence2 = this.e;
        if (charSequence2 != null && charSequence2.length() != 0) {
            TextView message = getMessage();
            jmu0.f(0, i5 + this.g, getMeasuredWidth(), getMessage().getMeasuredHeight() + this.g + i5, message, this);
        }
        CharSequence charSequence3 = this.f;
        if (charSequence3 == null || charSequence3.length() == 0) {
            return;
        }
        int iMax = Math.max(getCheckBox().getMeasuredHeight(), getCheckerMessage().getMeasuredHeight());
        int i6 = i5 + this.g + this.h;
        int i7 = this.c;
        int i8 = i6 + i7 + (iMax / 2);
        jmu0.f(0, i8 - (getCheckBox().getMeasuredHeight() / 2), getCheckBox().getMeasuredWidth(), (getCheckBox().getMeasuredHeight() / 2) + i8, getCheckBox(), this);
        jmu0.f(getCheckBox().getMeasuredWidth() + i7, i8 - (getCheckerMessage().getMeasuredHeight() / 2), getMeasuredWidth(), (getCheckerMessage().getMeasuredHeight() / 2) + i8, getCheckerMessage(), this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        CharSequence charSequence = this.d;
        if (charSequence != null && charSequence.length() != 0) {
            getTitle().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        CharSequence charSequence2 = this.e;
        if (charSequence2 != null && charSequence2.length() != 0) {
            getMessage().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        CharSequence charSequence3 = this.f;
        int i3 = this.c;
        int iMax = 0;
        if (charSequence3 != null && charSequence3.length() != 0) {
            getCheckBox().measure(0, 0);
            getCheckerMessage().measure(View.MeasureSpec.makeMeasureSpec((size - getCheckBox().getMeasuredWidth()) - i3, 1073741824), i2);
        }
        CharSequence charSequence4 = this.d;
        this.g = (charSequence4 == null || charSequence4.length() == 0) ? 0 : getTitle().getMeasuredHeight() + i3;
        CharSequence charSequence5 = this.e;
        int i4 = this.b;
        this.h = (charSequence5 == null || charSequence5.length() == 0) ? 0 : getMessage().getMeasuredHeight() + i4;
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null && charSequence6.length() != 0) {
            iMax = Math.max(getCheckBox().getMeasuredHeight(), getCheckerMessage().getMeasuredHeight()) + i3 + i4;
        }
        setMeasuredDimension(size, this.f15487a + this.g + this.h + iMax);
    }
}
