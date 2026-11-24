package org.xplatform.pin_code.impl.presentation.views.enteringpincode;

import a.dc3;
import a.dpl;
import a.dyb;
import a.hny;
import a.m5d;
import a.maz;
import a.n0o0;
import a.qzn;
import a.ryl;
import a.yhn;
import a.ymx;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class EnteringPinCode extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final dc3 q;
    public final n0o0 r;
    public final n0o0 s;
    public Function1 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public EnteringPinCode(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        LayoutInflater.from(context).inflate(R.layout.view_entering_pin_code, this);
        int i2 = R.id.divider;
        View viewF = yum0.f(this, i2);
        if (viewF != null) {
            i2 = R.id.eightButton;
            PinCodeSymbolButton pinCodeSymbolButton = (PinCodeSymbolButton) yum0.f(this, R.id.eightButton);
            if (pinCodeSymbolButton != null) {
                i2 = R.id.fiveButton;
                PinCodeSymbolButton pinCodeSymbolButton2 = (PinCodeSymbolButton) yum0.f(this, R.id.fiveButton);
                if (pinCodeSymbolButton2 != null) {
                    i2 = R.id.fourButton;
                    PinCodeSymbolButton pinCodeSymbolButton3 = (PinCodeSymbolButton) yum0.f(this, R.id.fourButton);
                    if (pinCodeSymbolButton3 != null) {
                        i2 = R.id.nineButton;
                        PinCodeSymbolButton pinCodeSymbolButton4 = (PinCodeSymbolButton) yum0.f(this, R.id.nineButton);
                        if (pinCodeSymbolButton4 != null) {
                            i2 = R.id.oneButton;
                            PinCodeSymbolButton pinCodeSymbolButton5 = (PinCodeSymbolButton) yum0.f(this, R.id.oneButton);
                            if (pinCodeSymbolButton5 != null) {
                                i2 = R.id.pinCodeInput;
                                PicCodeEditField picCodeEditField = (PicCodeEditField) yum0.f(this, R.id.pinCodeInput);
                                if (picCodeEditField != null) {
                                    i2 = R.id.pinCodeTitle;
                                    TextView textView = (TextView) yum0.f(this, R.id.pinCodeTitle);
                                    if (textView != null) {
                                        i2 = R.id.removeButton;
                                        ImageView imageView = (ImageView) yum0.f(this, R.id.removeButton);
                                        if (imageView != null) {
                                            i2 = R.id.sevenButton;
                                            PinCodeSymbolButton pinCodeSymbolButton6 = (PinCodeSymbolButton) yum0.f(this, R.id.sevenButton);
                                            if (pinCodeSymbolButton6 != null) {
                                                i2 = R.id.sixButton;
                                                PinCodeSymbolButton pinCodeSymbolButton7 = (PinCodeSymbolButton) yum0.f(this, R.id.sixButton);
                                                if (pinCodeSymbolButton7 != null) {
                                                    i2 = R.id.threeButton;
                                                    PinCodeSymbolButton pinCodeSymbolButton8 = (PinCodeSymbolButton) yum0.f(this, R.id.threeButton);
                                                    if (pinCodeSymbolButton8 != null) {
                                                        i2 = R.id.twoButton;
                                                        PinCodeSymbolButton pinCodeSymbolButton9 = (PinCodeSymbolButton) yum0.f(this, R.id.twoButton);
                                                        if (pinCodeSymbolButton9 != null) {
                                                            i2 = R.id.zeroButton;
                                                            PinCodeSymbolButton pinCodeSymbolButton10 = (PinCodeSymbolButton) yum0.f(this, R.id.zeroButton);
                                                            if (pinCodeSymbolButton10 != null) {
                                                                dc3 dc3Var = new dc3(this, viewF, pinCodeSymbolButton, pinCodeSymbolButton2, pinCodeSymbolButton3, pinCodeSymbolButton4, pinCodeSymbolButton5, picCodeEditField, textView, imageView, pinCodeSymbolButton6, pinCodeSymbolButton7, pinCodeSymbolButton8, pinCodeSymbolButton9, pinCodeSymbolButton10);
                                                                this.q = dc3Var;
                                                                this.r = maz.b(new ryl(context, (byte) 12));
                                                                this.s = maz.b(new ryl(context, (byte) 13));
                                                                viewF.setBackgroundColor(getNotActiveDividerState());
                                                                setNumberButtonListener(pinCodeSymbolButton5);
                                                                setNumberButtonListener(pinCodeSymbolButton9);
                                                                setNumberButtonListener(pinCodeSymbolButton8);
                                                                setNumberButtonListener(pinCodeSymbolButton3);
                                                                setNumberButtonListener(pinCodeSymbolButton2);
                                                                setNumberButtonListener(pinCodeSymbolButton7);
                                                                setNumberButtonListener(pinCodeSymbolButton6);
                                                                setNumberButtonListener(pinCodeSymbolButton);
                                                                setNumberButtonListener(pinCodeSymbolButton4);
                                                                setNumberButtonListener(pinCodeSymbolButton10);
                                                                dyb.N(imageView, ymx.INTERVAL_100, new yhn((Object) dc3Var, (byte) 8));
                                                                picCodeEditField.setPinCodeChangedListener(new qzn(this, dc3Var, (byte) 0));
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getActiveDividerState() {
        return ((Number) this.s.getValue()).intValue();
    }

    private final int getNotActiveDividerState() {
        return ((Number) this.r.getValue()).intValue();
    }

    private final void setNumberButtonListener(PinCodeSymbolButton pinCodeSymbolButton) {
        dyb.N(pinCodeSymbolButton, ymx.INTERVAL_100, new dpl((Object) this, (Object) pinCodeSymbolButton, (byte) 29));
    }

    public static final Unit u(EnteringPinCode enteringPinCode, dc3 dc3Var, String str) {
        str.getClass();
        Function1 function1 = enteringPinCode.t;
        if (function1 != null) {
            function1.invoke(str);
        }
        dc3Var.c.setBackgroundColor(str.length() == 0 ? enteringPinCode.getNotActiveDividerState() : enteringPinCode.getActiveDividerState());
        return Unit.f46060a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((PicCodeEditField) this.q.d).h = null;
    }

    public final void setError(String str) {
        str.getClass();
        setTitle(str);
        TextView textView = (TextView) this.q.e;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(m5d.b(R.attr.uikitWarning, context));
    }

    public final void setPinCodeChangedListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.t = function1;
    }

    public final void setTitle(String str) {
        str.getClass();
        dc3 dc3Var = this.q;
        ((TextView) dc3Var.e).setText(str);
        TextView textView = (TextView) dc3Var.e;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(m5d.b(R.attr.uikitSecondary, context));
    }

    public final void setError(int i) {
        String string = getResources().getString(i);
        string.getClass();
        setError(string);
    }

    public final void setTitle(int i) {
        String string = getResources().getString(i);
        string.getClass();
        setTitle(string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnteringPinCode(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnteringPinCode(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
