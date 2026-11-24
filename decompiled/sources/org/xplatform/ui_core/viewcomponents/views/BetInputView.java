package org.xplatform.ui_core.viewcomponents.views;

import a.aqd0;
import a.c4m0;
import a.dyb;
import a.e0g0;
import a.g0g0;
import a.hny;
import a.hxm0;
import a.i120;
import a.i5i;
import a.j0g0;
import a.kng0;
import a.qd7;
import a.rd7;
import a.sd7;
import a.sj3;
import a.tjj;
import a.tq;
import a.ud7;
import a.vd7;
import a.vqd;
import a.wvb;
import a.y;
import a.ymx;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.text_field.middle.b;

/* JADX INFO: loaded from: classes6.dex */
public final class BetInputView extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public boolean q;
    public final vd7 r;
    public TextWatcher s;
    public BigDecimal t;
    public c4m0 u;

    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Illegal instructions before constructor call */
    public BetInputView(Context context, AttributeSet attributeSet, int i) {
        Object g0g0Var;
        CharSequence text;
        Editable text2;
        String string;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        byte b = 0;
        super(context, attributeSet, 0);
        this.q = true;
        LayoutInflater.from(context).inflate(R.layout.bet_input_view, this);
        int i2 = R.id.btnMakeBet;
        DsButton dsButton = (DsButton) yum0.f(this, R.id.btnMakeBet);
        if (dsButton != null) {
            i2 = R.id.tfBetInput;
            DsTextField dsTextField = (DsTextField) yum0.f(this, R.id.tfBetInput);
            if (dsTextField != null) {
                vd7 vd7Var = new vd7(this, dsButton, dsTextField, (byte) 0);
                this.r = vd7Var;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                bigDecimal.getClass();
                this.t = bigDecimal;
                Context context2 = getContext();
                context2.getClass();
                TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, aqd0.v, 0, 0);
                dsButton.setVisibility(typedArrayObtainStyledAttributes.getBoolean(3, true) ? 0 : 8);
                dsButton.setEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = getContext().getString(typedArrayObtainStyledAttributes.getResourceId(0, 0));
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                String str = (String) (g0g0Var instanceof g0g0 ? null : g0g0Var);
                String str2 = "";
                ((DsTextField) vd7Var.d).setPlaceholderText(str == null ? "" : str);
                setVisibilityStepButtons(typedArrayObtainStyledAttributes.getBoolean(4, true));
                typedArrayObtainStyledAttributes.recycle();
                DsTextField dsTextField2 = (DsTextField) this.r.d;
                qd7 qd7Var = new qd7(this, b);
                b bVar = dsTextField2.B;
                if (bVar != null) {
                    bVar.setOnFocusChangeListener(qd7Var);
                }
                b bVar2 = ((DsTextField) this.r.d).B;
                if (bVar2 != null) {
                    bVar2.h = bVar2.l == i5i.FILLED && bVar2.u;
                    bVar2.d();
                    if (bVar2.h) {
                        bVar2.t = false;
                        if (!bVar2.isFocused() && (text2 = bVar2.getText()) != null && bVar2.g(bVar2.getWidth(), text2)) {
                            bVar2.t = true;
                            Editable text3 = bVar2.getText();
                            if (text3 != null && (string = text3.toString()) != null) {
                                str2 = string;
                            }
                            bVar2.s = str2;
                            text = TextUtils.ellipsize(bVar2.getText(), bVar2.getPaint(), bVar2.getWidth(), TextUtils.TruncateAt.END);
                        } else if (bVar2.isFocused() && (text = bVar2.s) != null) {
                            text = StringsKt.W(text) ? bVar2.getText() : text;
                            if (text == null) {
                                text = bVar2.getText();
                            }
                        } else {
                            text = bVar2.getText();
                        }
                        bVar2.setText(text);
                    }
                }
                ((DsTextField) this.r.d).setSaveEnabled(false);
                TextWatcher textWatcher = this.s;
                if (textWatcher != null) {
                    ((DsTextField) this.r.d).a(textWatcher);
                    return;
                }
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static String v(String str, boolean z, sd7 sd7Var) {
        byte b = sd7Var.f32019a;
        if (str.length() <= 0 || str.charAt(0) != '.') {
            int iU = StringsKt.U('.', 0, 6, str);
            if (iU != -1) {
                int i = iU + 1;
                str = str.substring(0, i).concat(c.r(str.substring(i), Separators.DOT, "", false));
            }
        } else {
            str = "0".concat(str);
        }
        if (StringsKt.P(str, '.')) {
            String strQ0 = StringsKt.q0(str, '.');
            String strN0 = StringsKt.n0(str, '.');
            if (strQ0.length() > b) {
                strQ0 = strQ0.substring(0, b);
            }
            int length = strN0.length();
            byte b2 = sd7Var.b;
            if (length > b2) {
                strN0 = strN0.substring(0, b2);
            }
            str = kng0.l(strQ0, Separators.DOT, strN0);
        } else if (str.length() > b) {
            str = str.substring(0, b);
        }
        if (str.length() > 1 && str.charAt(0) == '0' && str.charAt(1) != '.') {
            str = str.substring(1);
        }
        return (z && c.n(str, ".0", false)) ? vqd.k(2, 0, str) : str;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("etStep");
            if (string != null) {
                w(null, string);
            }
            this.q = bundle.getBoolean("focusFlag");
            super.onRestoreInstanceState(bundle.getBundle("superState"));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return i120.V(new Pair("superState", super.onSaveInstanceState()), new Pair("etStep", String.valueOf(((DsTextField) this.r.d).getText())), new Pair("focusFlag", Boolean.valueOf(this.q)));
    }

    public final void setAfterTextChangedListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        DsTextField dsTextField = (DsTextField) this.r.d;
        ud7 ud7Var = new ud7((byte) 0, this, function1);
        this.s = ud7Var;
        dsTextField.a(ud7Var);
    }

    public final void setBetLimitsText(Spannable spannable) {
        spannable.getClass();
        ((DsTextField) this.r.d).setHelperText(spannable.toString());
    }

    public final void setEachWayBadge(String str) {
        ((DsTextField) this.r.d).setTrailingText(str);
    }

    public final void setEditFieldEnabled(boolean z) {
        ((DsTextField) this.r.d).setEnabled(z);
    }

    public final void setFormatParams(sd7 sd7Var) {
        sd7Var.getClass();
        ((DsTextField) this.r.d).setFilters(new InputFilter[]{new tjj(sd7Var.f32019a, sd7Var.b)});
    }

    public final void setIsNeedClearText(boolean z) {
        this.q = z;
    }

    public final void setMakeBetButtonEnabled(boolean z) {
        vd7 vd7Var = this.r;
        ((DsButton) vd7Var.c).setEnabled(z);
        ((DsButton) vd7Var.c).setAlpha(z ? 1.0f : 0.5f);
    }

    public final void setMaxValue(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.t = bigDecimal;
        vd7 vd7Var = this.r;
        DsTextField dsTextField = (DsTextField) vd7Var.d;
        DsTextField dsTextField2 = (DsTextField) vd7Var.d;
        CharSequence text = dsTextField.getText();
        if (text == null || text.length() <= 0 || wvb.L(String.valueOf(dsTextField2.getText())).compareTo(bigDecimal) <= 0) {
            return;
        }
        dsTextField2.setText((bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString());
        CharSequence text2 = dsTextField2.getText();
        dsTextField2.setSelection(text2 != null ? text2.length() : 0);
    }

    public final void setMinusButtonClickListener(Function0<Unit> function0) {
        function0.getClass();
        ((DsTextField) this.r.d).setEndStepperMinusClickListener(new tq(function0, (byte) 19));
    }

    public final void setMinusButtonEnabled(boolean z) {
        ((DsTextField) this.r.d).setMinusButtonEnabled(z);
    }

    public final void setOnMakeBetButtonClickListener(Function0<Unit> function0) {
        function0.getClass();
        DsButton dsButton = (DsButton) this.r.c;
        dsButton.setVisibility(0);
        dyb.N(dsButton, ymx.INTERVAL_1500, new y(function0, (byte) 8));
    }

    public final void setPlaceholder(String str) {
        str.getClass();
        ((DsTextField) this.r.d).setPlaceholderText(str);
    }

    public final void setPlusButtonClickListener(Function0<Unit> function0) {
        function0.getClass();
        ((DsTextField) this.r.d).setEndStepperPlusClickListener(new tq(function0, (byte) 18));
    }

    public final void setPlusButtonEnabled(boolean z) {
        ((DsTextField) this.r.d).setPlusButtonEnabled(z);
    }

    public final void setVisibilityStepButtons(boolean z) {
        DsTextField dsTextField = (DsTextField) this.r.d;
        dsTextField.setPlusButtonVisible(z);
        dsTextField.setMinusButtonVisible(z);
    }

    public final void u() {
        ((DsTextField) this.r.d).clearFocus();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public final void w(Integer num, String str) {
        int length;
        str.getClass();
        TextWatcher textWatcher = this.s;
        vd7 vd7Var = this.r;
        if (textWatcher != null) {
            ((DsTextField) vd7Var.d).c(textWatcher);
        }
        DsTextField dsTextField = (DsTextField) vd7Var.d;
        DsTextField dsTextField2 = (DsTextField) vd7Var.d;
        dsTextField.setText(str);
        CharSequence text = dsTextField2.getText();
        if (text == null || text.length() == 0) {
            length = 0;
        } else if (num != null) {
            int length2 = text.length();
            int iIntValue = num.intValue();
            if (iIntValue < 0 || iIntValue > length2) {
                length = text.length();
            } else {
                length = num.intValue();
            }
        } else {
            length = text.length();
        }
        dsTextField2.setSelection(length);
        TextWatcher textWatcher2 = this.s;
        if (textWatcher2 != null) {
            dsTextField2.a(textWatcher2);
        }
    }

    public final void x(String str, boolean z) {
        str.getClass();
        vd7 vd7Var = this.r;
        if (z) {
            ((DsTextField) vd7Var.d).setErrorText(str);
        } else {
            ((DsTextField) vd7Var.d).setErrorText("");
        }
        ((DsTextField) vd7Var.d).f(z);
    }

    public final void y(boolean z) {
        c4m0 c4m0Var = this.u;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        boolean z2 = !z;
        setMakeBetButtonEnabled(z2);
        setEditFieldEnabled(z2);
        setPlusButtonEnabled(z2);
        setMinusButtonEnabled(z2);
        this.u = hxm0.l(this, 300L, new rd7((Object) this, z, (byte) 0));
    }

    public final void z(boolean z) {
        Drawable drawable = z ? getContext().getDrawable(R.drawable.ic_glyph_vip) : null;
        if (drawable != null) {
            Context context = getContext();
            context.getClass();
            sj3.B0(drawable, context, R.attr.uikitPrimary);
        }
        ((DsTextField) this.r.d).setHelperIconDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetInputView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
