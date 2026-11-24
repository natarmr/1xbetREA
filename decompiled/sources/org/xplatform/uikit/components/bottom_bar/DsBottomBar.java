package org.xplatform.uikit.components.bottom_bar;

import a.bqd0;
import a.cjl;
import a.dyb;
import a.igu0;
import a.ivb0;
import a.jf4;
import a.ktt0;
import a.maz;
import a.n0o0;
import a.rgu0;
import a.twn;
import a.ymx;
import a.z9f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final class DsBottomBar extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final int t;
    public int u;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsBottomBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.bottomBarStyle);
        final byte b2 = 0;
        this.q = maz.b(new Function0(this) { // from class: a.htl
            public final /* synthetic */ DsBottomBar b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                DsBottomBar dsBottomBar = this.b;
                switch (b3) {
                    case 0:
                        int i3 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarFirstButton);
                    case 1:
                        int i4 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarSecondButton);
                    default:
                        int i5 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarThirdButton);
                }
            }
        });
        final byte b3 = 1;
        this.r = maz.b(new Function0(this) { // from class: a.htl
            public final /* synthetic */ DsBottomBar b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                DsBottomBar dsBottomBar = this.b;
                switch (b4) {
                    case 0:
                        int i3 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarFirstButton);
                    case 1:
                        int i4 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarSecondButton);
                    default:
                        int i5 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarThirdButton);
                }
            }
        });
        this.s = maz.b(new Function0(this) { // from class: a.htl
            public final /* synthetic */ DsBottomBar b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                DsBottomBar dsBottomBar = this.b;
                switch (b4) {
                    case 0:
                        int i3 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarFirstButton);
                    case 1:
                        int i4 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarSecondButton);
                    default:
                        int i5 = DsBottomBar.v;
                        return (DsButton) dsBottomBar.findViewById(R.id.bottomBarThirdButton);
                }
            }
        });
        this.t = getPaddingBottom();
        setElevation(getResources().getDimension(R.dimen.space_28));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.j, R.attr.bottomBarStyle, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i3 == 0) {
            i2 = R.layout.bottom_bar_one_button_layout;
        } else if (i3 == 1) {
            i2 = R.layout.bottom_bar_two_horizontal_buttons_view;
        } else if (i3 == 2) {
            i2 = R.layout.bottom_bar_two_vertical_buttons_view;
        } else {
            if (i3 != 3) {
                jf4.o(twn.m(i3, "Unknown style value: "));
                throw null;
            }
            i2 = R.layout.bottom_bar_three_vertical_buttons_view;
        }
        if (i3 == 3) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        }
        LayoutInflater.from(context).inflate(i2, (ViewGroup) this, true);
        setFirstButtonStyle(typedArrayObtainStyledAttributes.getResourceId(1, R.style.DSButton_Large_Primary));
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 2);
        setFirstButtonText(strP == null ? "" : strP);
        setSecondButtonStyle(typedArrayObtainStyledAttributes.getResourceId(3, R.style.DSButton_Large_Primary));
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 4);
        setSecondButtonText(strP2 == null ? "" : strP2);
        setThirdButtonStyle(typedArrayObtainStyledAttributes.getResourceId(5, R.style.DSButton_Large_Primary));
        String strP3 = ktt0.p(typedArrayObtainStyledAttributes, context, 6);
        setThirdButtonText(strP3 != null ? strP3 : "");
        typedArrayObtainStyledAttributes.recycle();
        z9f z9fVar = new z9f(this, (byte) 14);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(this, z9fVar);
    }

    private final DsButton getFirstButton() {
        Object value = this.q.getValue();
        value.getClass();
        return (DsButton) value;
    }

    private final DsButton getSecondButton() {
        return (DsButton) this.r.getValue();
    }

    private final DsButton getThirdButton() {
        return (DsButton) this.s.getValue();
    }

    public static void u(DsBottomBar dsBottomBar, Function0 function0) {
        ymx ymxVar = ivb0.b;
        dsBottomBar.getClass();
        ymxVar.getClass();
        dyb.b0(dsBottomBar.getFirstButton(), ymxVar, new cjl(function0, (byte) 6));
    }

    public static void v(DsBottomBar dsBottomBar, Function0 function0) {
        ymx ymxVar = ivb0.b;
        dsBottomBar.getClass();
        ymxVar.getClass();
        DsButton secondButton = dsBottomBar.getSecondButton();
        if (secondButton != null) {
            dyb.b0(secondButton, ymxVar, new cjl(function0, (byte) 5));
        }
    }

    public static void w(DsBottomBar dsBottomBar, Function0 function0) {
        ymx ymxVar = ivb0.b;
        ymxVar.getClass();
        DsButton thirdButton = dsBottomBar.getThirdButton();
        if (thirdButton != null) {
            dyb.b0(thirdButton, ymxVar, new cjl(function0, (byte) 4));
        }
    }

    public final DsButton getFirst() {
        return getFirstButton();
    }

    public final DsButton getSecond() {
        return getSecondButton();
    }

    public final DsButton getThird() {
        return getThirdButton();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = rgu0.f30456a;
        requestApplyInsets();
    }

    public final void setFirstButtonEnabled(boolean z) {
        getFirstButton().setEnabled(z);
    }

    public final void setFirstButtonLoading(boolean z) {
        getFirstButton().setLoading(z);
    }

    public final void setFirstButtonPaddingHorizontal(int i) {
        DsButton firstButton = getFirstButton();
        firstButton.setPadding(i, firstButton.getPaddingTop(), i, firstButton.getPaddingBottom());
    }

    public final void setFirstButtonStyle(int i) {
        getFirstButton().d(i);
    }

    public final void setFirstButtonText(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setFirstButtonText(string);
    }

    public final void setFirstButtonVisibility(boolean z) {
        getFirstButton().setVisibility(z ? 0 : 8);
    }

    public final void setSecondButtonEnabled(boolean z) {
        DsButton secondButton = getSecondButton();
        if (secondButton != null) {
            secondButton.setEnabled(z);
        }
    }

    public final void setSecondButtonLoading(boolean z) {
        DsButton secondButton = getSecondButton();
        if (secondButton != null) {
            secondButton.setLoading(z);
        }
    }

    public final void setSecondButtonStyle(int i) {
        DsButton secondButton = getSecondButton();
        if (secondButton != null) {
            secondButton.d(i);
        }
    }

    public final void setSecondButtonText(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setSecondButtonText(string);
    }

    public final void setSecondButtonVisibility(boolean z) {
        DsButton secondButton = getSecondButton();
        if (secondButton != null) {
            secondButton.setVisibility(z ? 0 : 8);
        }
    }

    public final void setThirdButtonEnabled(boolean z) {
        DsButton thirdButton = getThirdButton();
        if (thirdButton != null) {
            thirdButton.setEnabled(z);
        }
    }

    public final void setThirdButtonLoading(boolean z) {
        DsButton thirdButton = getThirdButton();
        if (thirdButton != null) {
            thirdButton.setLoading(z);
        }
    }

    public final void setThirdButtonStyle(int i) {
        DsButton thirdButton = getThirdButton();
        if (thirdButton != null) {
            thirdButton.d(i);
        }
    }

    public final void setThirdButtonText(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setThirdButtonText(string);
    }

    public final void setThirdButtonVisibility(boolean z) {
        DsButton thirdButton = getThirdButton();
        if (thirdButton != null) {
            thirdButton.setVisibility(z ? 0 : 8);
        }
    }

    public final void setFirstButtonText(CharSequence charSequence) {
        charSequence.getClass();
        getFirstButton().l(charSequence);
    }

    public final void setSecondButtonText(CharSequence charSequence) {
        charSequence.getClass();
        DsButton secondButton = getSecondButton();
        if (secondButton != null) {
            secondButton.l(charSequence);
        }
    }

    public final void setThirdButtonText(CharSequence charSequence) {
        charSequence.getClass();
        DsButton thirdButton = getThirdButton();
        if (thirdButton != null) {
            thirdButton.l(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBottomBar(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
