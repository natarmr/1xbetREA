package org.xplatform.ui_core.viewcomponents.layouts.linear;

import a.aqd0;
import a.bkb;
import a.dgh0;
import a.dyb;
import a.j5d;
import a.j8q0;
import a.juc;
import a.maz;
import a.n0o0;
import a.q14;
import a.q3d;
import a.t6q0;
import a.tpb;
import a.ud7;
import a.vpj0;
import a.w6q0;
import a.yip0;
import a.ymx;
import a.zxb;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class TextInputEditTextNew extends TextInputLayout {
    public static final /* synthetic */ int j2 = 0;
    public Function1 f2;
    public final tpb g2;
    public final ArrayList h2;
    public final n0o0 i2;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputEditTextNew(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f2 = new t6q0((byte) 8);
        tpb tpbVar = new tpb((byte) 4);
        this.g2 = tpbVar;
        this.h2 = q3d.l(tpbVar);
        this.i2 = maz.b(new yip0(context, this, (byte) 9));
        if (attributeSet != null) {
            q14 q14Var = new q14(context, attributeSet, aqd0.y);
            TypedArray typedArray = q14Var.b;
            try {
                try {
                    getEditText().setInputType(typedArray.getInt(2, 0));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                TypedValue typedValue = j5d.f15927a;
                Context context2 = getContext();
                context2.getClass();
                try {
                    new w6q0(1, getEditText(), juc.class, "setTextColor", "setTextColor(I)V", 0, (byte) 1).invoke(Integer.valueOf(typedArray.getInt(3, j5d.a(context2, R.attr.uikitTextPrimary, false))));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    getEditText().setClickable(typedArray.getBoolean(1, false));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                try {
                    getEditText().setFocusable(typedArray.getBoolean(0, true));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                try {
                    if (typedArray.getBoolean(4, false)) {
                        getEditText().setFilters(new InputFilter[]{this.g2});
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                q14Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(q14Var, th);
                    throw th2;
                }
            }
        }
    }

    public static final juc A(Context context, TextInputEditTextNew textInputEditTextNew) {
        context.getClass();
        juc jucVar = new juc(context);
        jucVar.h = new zxb((byte) 21);
        jucVar.i = new zxb((byte) 22);
        jucVar.j = new zxb((byte) 23);
        TypedValue typedValue = j5d.f15927a;
        jucVar.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
        jucVar.setBackgroundTintList(j5d.d(context, R.attr.uikitSecondary, R.attr.uikitSecondary));
        jucVar.setSingleLine();
        jucVar.setTextAlignment(5);
        jucVar.setEllipsize(TextUtils.TruncateAt.END);
        textInputEditTextNew.setCursorDrawable(jucVar);
        jucVar.addTextChangedListener(new j8q0(textInputEditTextNew, (byte) 1));
        jucVar.addTextChangedListener(new j8q0(textInputEditTextNew, (byte) 0));
        jucVar.addTextChangedListener(new ud7((byte) 1, jucVar, context));
        jucVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return jucVar;
    }

    private final void setCursorDrawable(EditText editText) {
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(R.drawable.primary_cursor_new);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(editText, Integer.valueOf(R.drawable.primary_cursor_new));
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public final juc getEditText() {
        return (juc) this.i2.getValue();
    }

    public final List<InputFilter> getFilters() {
        return this.h2;
    }

    public final Function1<String, Unit> getOnTextChanged() {
        return this.f2;
    }

    public final String getText() {
        return String.valueOf(getEditText().getText());
    }

    public final InputFilter getWhitespaceFilter() {
        return this.g2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getEditText().getParent() == null) {
            addView(getEditText(), 0, new LinearLayout.LayoutParams(getEditText().getLayoutParams()));
        }
    }

    public final void setOnClickListenerEditText(Function0<Unit> function0) {
        function0.getClass();
        dyb.N(getEditText(), ymx.INTERVAL_500, new vpj0(function0, (byte) 8));
    }

    public final void setOnFocusListenerEditText(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        getEditText().setOnFocusChangeListener(new dgh0(function1, (byte) 1));
    }

    public final void setOnTextChanged(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.f2 = function1;
    }

    public final void setSelection(int i) {
        getEditText().setSelection(i);
    }

    public final void setText(String str) {
        str.getClass();
        getEditText().setText(str);
    }

    public final void setTextColor(int i) {
        getEditText().setTextColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputEditTextNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputEditTextNew(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
