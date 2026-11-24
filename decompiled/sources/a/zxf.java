package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.check_box.DsCheckbox;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class zxf extends FrameLayout implements l12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogFields f45154a;
    public int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public bys0 j;
    public final NestedScrollView k;
    public final xxf l;
    public final DsButton m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;

    public zxf(Context context) {
        super(context, null, 0);
        this.f45154a = new DialogFields((CharSequence) null, (CharSequence) null, (CharSequence) "", (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1531);
        this.b = Integer.MAX_VALUE;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_512);
        this.j = bys0.f3435a;
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setId(jmu0.d());
        this.k = nestedScrollView;
        xxf xxfVar = new xxf(context);
        xxfVar.setId(jmu0.d());
        this.l = xxfVar;
        DsButton dsButton = new DsButton(context, null, 6, 0);
        dsButton.setId(jmu0.d());
        dsButton.setTag("topButtonCustomLottie");
        dsButton.setButtonStyle(ful.f);
        dsButton.setButtonSize(eul.MEDIUM);
        this.m = dsButton;
        this.n = maz.b(new yg3(context, (byte) 19));
        this.o = maz.b(new yg3(context, (byte) 20));
        this.p = maz.b(new yg3(context, (byte) 21));
    }

    private final DsButton getNegativeButton() {
        return (DsButton) this.n.getValue();
    }

    private final DsButton getNeutralButton() {
        return (DsButton) this.o.getValue();
    }

    private final View getSeparator() {
        return (View) this.p.getValue();
    }

    @Override // a.l12
    public DsCheckbox getChecker() {
        return this.l.getChecker();
    }

    public String getCheckerText() {
        String string;
        CharSequence charSequence = this.f45154a.g;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    public String getMessage() {
        String string;
        CharSequence charSequence = this.f45154a.b;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    @Override // a.l12
    public View getPositiveButton() {
        return this.m;
    }

    public String getTitle() {
        String string;
        CharSequence charSequence = this.f45154a.f47242a;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CharSequence charSequence;
        NestedScrollView nestedScrollView = this.k;
        int measuredWidth = nestedScrollView.getMeasuredWidth();
        int i5 = this.c;
        jmu0.f(i5, 0, measuredWidth + i5, nestedScrollView.getMeasuredHeight(), nestedScrollView, this);
        int i6 = yxf.f43417a[this.j.ordinal()];
        int i7 = this.c;
        DsButton dsButton = this.m;
        int i8 = this.d;
        if (i6 == 1) {
            int bottom = nestedScrollView.getBottom() + i8;
            int measuredHeight = dsButton.getMeasuredHeight() + bottom;
            int measuredWidth2 = ((getMeasuredWidth() - (i7 * 2)) - i8) / 2;
            CharSequence charSequence2 = this.f45154a.d;
            if (charSequence2 == null || charSequence2.length() == 0) {
                CharSequence charSequence3 = this.f45154a.e;
                if (charSequence3 != null && charSequence3.length() != 0) {
                    DsButton neutralButton = getNeutralButton();
                    int i9 = this.c;
                    jmu0.f(i9, bottom, i9 + measuredWidth2, measuredHeight, neutralButton, this);
                }
            } else {
                DsButton negativeButton = getNegativeButton();
                int i10 = this.c;
                jmu0.f(i10, bottom, i10 + measuredWidth2, measuredHeight, negativeButton, this);
            }
            jmu0.f(measuredWidth2 + i7 + i8, bottom, getMeasuredWidth() - i7, measuredHeight, dsButton, this);
        } else {
            int bottom2 = nestedScrollView.getBottom() + i8;
            int measuredHeight2 = dsButton.getMeasuredHeight() + bottom2;
            int measuredHeight3 = dsButton.getMeasuredHeight() + measuredHeight2 + i8;
            CharSequence charSequence4 = this.f45154a.d;
            if (charSequence4 == null || charSequence4.length() == 0 || (charSequence = this.f45154a.e) == null || charSequence.length() == 0) {
                CharSequence charSequence5 = this.f45154a.d;
                if (charSequence5 == null || charSequence5.length() == 0) {
                    CharSequence charSequence6 = this.f45154a.e;
                    if (charSequence6 == null || charSequence6.length() == 0) {
                        jmu0.f(this.c, bottom2, getMeasuredWidth() - i7, measuredHeight2, dsButton, this);
                    } else {
                        jmu0.f(this.c, bottom2, getMeasuredWidth() - i7, measuredHeight2, dsButton, this);
                        jmu0.f(this.c, dsButton.getBottom() + i8, getMeasuredWidth() - i7, measuredHeight3, getNeutralButton(), this);
                    }
                } else {
                    jmu0.f(this.c, bottom2, getMeasuredWidth() - i7, measuredHeight2, dsButton, this);
                    jmu0.f(this.c, dsButton.getBottom() + i8, getMeasuredWidth() - i7, measuredHeight3, getNegativeButton(), this);
                }
            } else {
                int bottom3 = nestedScrollView.getBottom() + i8;
                int measuredHeight4 = dsButton.getMeasuredHeight() + bottom3;
                int i11 = measuredHeight4 + i8;
                int measuredHeight5 = dsButton.getMeasuredHeight() + i11;
                int i12 = i8 + measuredHeight5;
                int measuredHeight6 = getNegativeButton().getMeasuredHeight() + i12;
                jmu0.f(this.c, bottom3, getMeasuredWidth() - i7, measuredHeight4, dsButton, this);
                jmu0.f(this.c, i11, getMeasuredWidth() - i7, measuredHeight5, getNeutralButton(), this);
                jmu0.f(this.c, i12, getMeasuredWidth() - i7, measuredHeight6, getNegativeButton(), this);
            }
        }
        if (getMeasuredHeight() >= Math.min(this.f, this.b)) {
            jmu0.f(0, nestedScrollView.getBottom(), getMeasuredWidth(), nestedScrollView.getBottom() + this.e, getSeparator(), this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CharSequence charSequence;
        bys0 bys0Var;
        int measuredHeight;
        CharSequence charSequence2;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        int i4 = size - (i3 * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int i5 = this.d;
        int i6 = (i4 - i5) / 2;
        DsButton dsButton = this.m;
        boolean z = dsButton.c(i6) || getNegativeButton().c(i6) || getNeutralButton().c(i6);
        CharSequence charSequence3 = this.f45154a.d;
        if ((charSequence3 == null || charSequence3.length() == 0 || (charSequence2 = this.f45154a.e) == null || charSequence2.length() == 0) && !z) {
            CharSequence charSequence4 = this.f45154a.d;
            bys0Var = (((charSequence4 == null || charSequence4.length() == 0) && ((charSequence = this.f45154a.e) == null || charSequence.length() == 0)) || z) ? bys0.b : bys0.f3435a;
        } else {
            bys0Var = bys0.b;
        }
        this.j = bys0Var;
        xxf xxfVar = this.l;
        xxfVar.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((i4 - i5) / 2, 1073741824);
        bys0 bys0Var2 = this.j;
        int[] iArr = yxf.f43417a;
        if (iArr[bys0Var2.ordinal()] == 1) {
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
            dsButton.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            CharSequence charSequence5 = this.f45154a.d;
            if (charSequence5 == null || charSequence5.length() == 0) {
                CharSequence charSequence6 = this.f45154a.e;
                if (charSequence6 != null && charSequence6.length() != 0) {
                    getNeutralButton().measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                }
            } else {
                getNegativeButton().measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
        } else {
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
            dsButton.measure(iMakeMeasureSpec2, iMakeMeasureSpec5);
            this.g = dsButton.getMeasuredHeight() + i5;
            CharSequence charSequence7 = this.f45154a.d;
            if (charSequence7 != null && charSequence7.length() != 0) {
                getNegativeButton().measure(iMakeMeasureSpec2, iMakeMeasureSpec5);
                this.h = getNegativeButton().getMeasuredHeight() + i5;
            }
            CharSequence charSequence8 = this.f45154a.e;
            if (charSequence8 == null || charSequence8.length() == 0) {
                this.i = i3;
            } else {
                getNeutralButton().measure(iMakeMeasureSpec2, iMakeMeasureSpec5);
                this.i = getNeutralButton().getMeasuredHeight() + i5 + i3;
            }
        }
        if (iArr[this.j.ordinal()] == 1) {
            measuredHeight = dsButton.getMeasuredHeight() + i5;
        } else {
            measuredHeight = this.g + this.h;
            i3 = this.i;
        }
        int i7 = measuredHeight + i3;
        int measuredHeight2 = xxfVar.getMeasuredHeight() + i7;
        int iMin = Math.min(this.f, this.b);
        NestedScrollView nestedScrollView = this.k;
        if (measuredHeight2 > iMin) {
            nestedScrollView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin - i7, 1073741824));
            setMeasuredDimension(size, iMin);
        } else {
            nestedScrollView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(xxfVar.getMeasuredHeight(), 1073741824));
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
        Integer num;
        Integer num2;
        Integer num3;
        dialogFields.getClass();
        this.f45154a = dialogFields;
        removeAllViews();
        NestedScrollView nestedScrollView = this.k;
        nestedScrollView.removeAllViews();
        int i = dialogFields.i;
        CharSequence charSequence = dialogFields.e;
        CharSequence charSequence2 = dialogFields.d;
        CharSequence charSequence3 = dialogFields.f47242a;
        CharSequence charSequence4 = dialogFields.b;
        CharSequence charSequence5 = dialogFields.g;
        xxf xxfVar = this.l;
        xxfVar.a(i, charSequence3, charSequence4, charSequence5);
        nestedScrollView.addView(xxfVar);
        addView(nestedScrollView);
        CharSequence charSequence6 = dialogFields.c;
        DsButton dsButton = this.m;
        dsButton.setButtonLabel(charSequence6);
        ActionDialogButtonStyle actionDialogButtonStyle = dialogFields.h;
        if (actionDialogButtonStyle == null || (num3 = actionDialogButtonStyle.f47243a) == null) {
            dsButton.h();
        } else {
            dsButton.d(num3.intValue());
        }
        addView(dsButton);
        addView(getSeparator());
        if (charSequence2 != null && charSequence2.length() != 0) {
            getNegativeButton().setButtonLabel(charSequence2);
            if (actionDialogButtonStyle == null || (num2 = actionDialogButtonStyle.b) == null) {
                getNegativeButton().h();
            } else {
                getNegativeButton().d(num2.intValue());
            }
            addView(getNegativeButton());
        }
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        getNeutralButton().setButtonLabel(charSequence);
        if (actionDialogButtonStyle == null || (num = actionDialogButtonStyle.c) == null) {
            getNeutralButton().h();
        } else {
            getNeutralButton().d(num.intValue());
        }
        addView(getNeutralButton());
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
