package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class nnm extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f23830a;
    public final TextView b;
    public final int c;
    public final int d;
    public final int e;
    public q00 f;

    public nnm(Context context) {
        super(context, null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setTag("PresetAdditionalTopStartTextView");
        appCompatTextView.setContentDescription(appCompatTextView.getText());
        appCompatTextView.setGravity(16);
        cem0.n(R.style.TextStyle_Text_Regular_StaticWhite, appCompatTextView);
        appCompatTextView.setCompoundDrawablePadding(appCompatTextView.getResources().getDimensionPixelOffset(R.dimen.space_6));
        appCompatTextView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        aem0.r(appCompatTextView, 12, 14, 1, 2);
        this.f23830a = appCompatTextView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setTag("PresetAdditionalTopEndTextView");
        textView.setGravity(16);
        cem0.n(R.style.TextStyle_Text_Regular_StaticWhite, textView);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.space_6));
        textView.setMaxLines(2);
        textView.setEllipsize(truncateAt);
        aem0.r(textView, 12, 14, 1, 2);
        this.b = textView;
        this.c = getResources().getDimensionPixelSize(R.dimen.size_36);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.f = new q00(true, true, "", "", "", "", 0, 0, 0, 0);
        addView(appCompatTextView);
        addView(textView);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth() / 4;
        AppCompatTextView appCompatTextView = this.f23830a;
        int measuredWidth2 = measuredWidth - (appCompatTextView.getMeasuredWidth() / 2);
        jmu0.f(measuredWidth2, 0, appCompatTextView.getMeasuredWidth() + measuredWidth2, measuredHeight, appCompatTextView, this);
        int measuredWidth3 = (getMeasuredWidth() * 3) / 4;
        TextView textView = this.b;
        int measuredWidth4 = measuredWidth3 - (textView.getMeasuredWidth() / 2);
        jmu0.f(measuredWidth4, 0, textView.getMeasuredWidth() + measuredWidth4, measuredHeight, textView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size / 2;
        int i4 = this.e;
        int i5 = this.d;
        int i6 = (i3 - i4) - (i5 / 2);
        int i7 = (i3 - i4) - (i5 / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int i8 = this.c;
        this.f23830a.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
        setMeasuredDimension(size, i8);
    }

    public final void setEndClickListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        dyb.O(this.b, new mnm(function1, this, (byte) 1));
    }

    public final void setEndState(boolean z) {
        q00 q00VarA = q00.a(this.f, false, z, 1021);
        this.f = q00VarA;
        int i = z ? q00VarA.i : q00VarA.j;
        TextView textView = this.b;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        q00 q00Var = this.f;
        textView.setText(z ? q00Var.e : q00Var.f);
    }

    public final void setModel(q00 q00Var) {
        q00Var.getClass();
        this.f = q00Var;
        boolean z = q00Var.f27870a;
        boolean z2 = q00Var.b;
        String str = z ? q00Var.c : q00Var.d;
        AppCompatTextView appCompatTextView = this.f23830a;
        appCompatTextView.setText(str);
        String str2 = z2 ? q00Var.e : q00Var.f;
        TextView textView = this.b;
        textView.setText(str2);
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(q00Var.f27870a ? q00Var.g : q00Var.h, 0, 0, 0);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(z2 ? q00Var.i : q00Var.j, 0, 0, 0);
    }

    public final void setStartClickListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        dyb.O(this.f23830a, new mnm(function1, this, (byte) 0));
    }

    public final void setStartState(boolean z) {
        q00 q00VarA = q00.a(this.f, z, false, 1022);
        this.f = q00VarA;
        int i = z ? q00VarA.g : q00VarA.h;
        AppCompatTextView appCompatTextView = this.f23830a;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        q00 q00Var = this.f;
        appCompatTextView.setText(z ? q00Var.c : q00Var.d);
    }
}
