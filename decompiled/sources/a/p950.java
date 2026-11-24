package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class p950 extends FrameLayout implements l12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogFields f26592a;
    public int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public final NestedScrollView j;
    public final o950 k;
    public final TextView l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;

    public p950(Context context) {
        super(context, null, 0);
        this.f26592a = new DialogFields((CharSequence) null, (CharSequence) null, (CharSequence) "", (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1531);
        this.b = Integer.MAX_VALUE;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_512);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setId(jmu0.d());
        this.j = nestedScrollView;
        o950 o950Var = new o950(context);
        o950Var.setId(jmu0.d());
        this.k = o950Var;
        TextView textView = new TextView(context);
        textView.setId(jmu0.d());
        textView.setTag("topButton");
        cem0.n(R.style.TextStyle_Headline_Medium_Primary, textView);
        textView.setTextAlignment(4);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.l = textView;
        this.m = maz.b(new i7q(context, (byte) 23));
        this.n = maz.b(new i7q(context, (byte) 24));
        this.o = maz.b(new i7q(context, (byte) 25));
        this.p = maz.b(new i7q(context, (byte) 26));
        this.q = maz.b(new i7q(context, (byte) 27));
    }

    private final View getBottomSeparator() {
        return (View) this.q.getValue();
    }

    private final View getMiddleSeparator() {
        return (View) this.p.getValue();
    }

    private final TextView getNegativeButton() {
        return (TextView) this.m.getValue();
    }

    private final TextView getNeutralButton() {
        return (TextView) this.n.getValue();
    }

    private final View getTopSeparator() {
        return (View) this.o.getValue();
    }

    public final void a(TextView textView) {
        int bottom = this.l.getBottom();
        int i = this.c;
        int i2 = bottom + i;
        int i3 = this.h + i2;
        jmu0.f(this.d, i2 + i, getMeasuredWidth() - this.d, i3 - i, textView, this);
        jmu0.f(0, i2, getMeasuredWidth(), i2 + this.e, getMiddleSeparator(), this);
    }

    @Override // a.l12
    public DsCheckbox getChecker() {
        return this.k.getChecker();
    }

    public String getCheckerText() {
        String string;
        CharSequence charSequence = this.f26592a.g;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    public String getMessage() {
        String string;
        CharSequence charSequence = this.f26592a.b;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    @Override // a.l12
    public View getPositiveButton() {
        return this.l;
    }

    public String getTitle() {
        String string;
        CharSequence charSequence = this.f26592a.f47242a;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        NestedScrollView nestedScrollView = this.j;
        int measuredWidth = nestedScrollView.getMeasuredWidth();
        int i5 = this.d;
        jmu0.f(i5, 0, measuredWidth + i5, nestedScrollView.getMeasuredHeight(), nestedScrollView, this);
        int bottom = nestedScrollView.getBottom();
        int i6 = this.g + bottom;
        int i7 = this.c;
        int measuredWidth2 = getMeasuredWidth();
        int i8 = this.d;
        int i9 = this.d;
        TextView textView = this.l;
        jmu0.f(i9, bottom + i7, measuredWidth2 - i8, i6 - i7, textView, this);
        View topSeparator = getTopSeparator();
        int measuredWidth3 = getMeasuredWidth();
        int i10 = this.e;
        jmu0.f(0, bottom, measuredWidth3, bottom + i10, topSeparator, this);
        CharSequence charSequence = this.f26592a.d;
        boolean z2 = true;
        boolean z3 = charSequence == null || charSequence.length() == 0;
        CharSequence charSequence2 = this.f26592a.e;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z2 = false;
        }
        if (z3 || z2) {
            if (!z3) {
                a(getNegativeButton());
                return;
            } else {
                if (z2) {
                    return;
                }
                a(getNeutralButton());
                return;
            }
        }
        a(getNeutralButton());
        TextView negativeButton = getNegativeButton();
        int bottom2 = textView.getBottom() + i7 + this.h;
        jmu0.f(this.d, bottom2 + i7, getMeasuredWidth() - i8, (this.i + bottom2) - i7, negativeButton, this);
        jmu0.f(0, bottom2, getMeasuredWidth(), bottom2 + i10, getBottomSeparator(), this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.d * 2), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        o950 o950Var = this.k;
        o950Var.measure(iMakeMeasureSpec, i2);
        TextView textView = this.l;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = textView.getMeasuredHeight();
        int i3 = this.c * 2;
        this.g = measuredHeight + i3;
        CharSequence charSequence = this.f26592a.d;
        boolean z = true;
        boolean z2 = charSequence == null || charSequence.length() == 0;
        CharSequence charSequence2 = this.f26592a.e;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z = false;
        }
        if (!z && !z2) {
            getNeutralButton().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.i = getNeutralButton().getMeasuredHeight() + i3;
            getNegativeButton().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.h = getNegativeButton().getMeasuredHeight() + i3;
        } else if (!z) {
            getNeutralButton().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.h = getNeutralButton().getMeasuredHeight() + i3;
        } else if (!z2) {
            getNegativeButton().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.h = getNegativeButton().getMeasuredHeight() + i3;
        }
        int i4 = this.g + this.h + this.i;
        int measuredHeight2 = o950Var.getMeasuredHeight() + i4;
        int iMin = Math.min(this.f, this.b);
        NestedScrollView nestedScrollView = this.j;
        if (measuredHeight2 > iMin) {
            nestedScrollView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin - i4, 1073741824));
            setMeasuredDimension(size, iMin);
        } else {
            nestedScrollView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(o950Var.getMeasuredHeight(), 1073741824));
            setMeasuredDimension(size, measuredHeight2);
        }
    }

    @Override // a.l12
    public void setMaxContentHeight(int i) {
        this.b = i;
        requestLayout();
    }

    @Override // a.l12
    public void setModel(DialogFields dialogFields) {
        dialogFields.getClass();
        this.f26592a = dialogFields;
        removeAllViews();
        NestedScrollView nestedScrollView = this.j;
        nestedScrollView.removeAllViews();
        CharSequence charSequence = dialogFields.f47242a;
        CharSequence charSequence2 = dialogFields.e;
        CharSequence charSequence3 = dialogFields.b;
        CharSequence charSequence4 = dialogFields.g;
        o950 o950Var = this.k;
        o950Var.a(charSequence, charSequence3, charSequence4);
        nestedScrollView.addView(o950Var);
        addView(nestedScrollView);
        CharSequence charSequence5 = dialogFields.c;
        TextView textView = this.l;
        textView.setText(charSequence5);
        addView(textView);
        addView(getTopSeparator());
        CharSequence charSequence6 = dialogFields.d;
        boolean z = true;
        boolean z2 = charSequence6 == null || charSequence6.length() == 0;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z = false;
        }
        if (!z2) {
            getNegativeButton().setText(charSequence6);
            addView(getNegativeButton());
        }
        if (!z2 && !z) {
            addView(getBottomSeparator());
        }
        if (!z) {
            getNeutralButton().setText(charSequence2);
            addView(getNeutralButton());
        }
        if (z2 && z) {
            return;
        }
        addView(getMiddleSeparator());
    }

    @Override // a.l12
    /* JADX INFO: renamed from: getNegativeButton */
    public View mo5getNegativeButton() {
        return getNegativeButton();
    }

    @Override // a.l12
    /* JADX INFO: renamed from: getNeutralButton */
    public View mo6getNeutralButton() {
        return getNeutralButton();
    }
}
