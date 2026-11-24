package a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class xmd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ymd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmd0(ymd0 ymd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ymd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ymd0 ymd0Var = this.k;
        switch (b) {
            case 0:
                xmd0 xmd0Var = new xmd0(ymd0Var, yjeVar, (byte) 0);
                xmd0Var.j = obj;
                return xmd0Var;
            default:
                xmd0 xmd0Var2 = new xmd0(ymd0Var, yjeVar, (byte) 1);
                xmd0Var2.j = obj;
                return xmd0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xmd0) create((jod0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xmd0) create((nod0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                qek0 qek0Var = qek0.f28589a;
                jod0 jod0Var = (jod0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = jod0Var instanceof iod0;
                ymd0 ymd0Var = this.k;
                if (!z) {
                    fl70 fl70Var = ymd0.o2;
                    ymd0Var.W0(false);
                }
                if (jod0Var != null) {
                    if (jod0Var instanceof fod0) {
                        fl70 fl70Var2 = ymd0.o2;
                        wdk0 wdk0Var = ymd0Var.i2;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH = ymd0Var.H(R.string.one_click_bet_disabled_message);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), ymd0Var, null, null, false, null, 1020);
                    } else if (jod0Var instanceof god0) {
                        god0 god0Var = (god0) jod0Var;
                        double d = god0Var.f11626a;
                        String str = god0Var.b;
                        fl70 fl70Var3 = ymd0.o2;
                        wdk0 wdk0Var2 = ymd0Var.i2;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strI = ymd0Var.I(R.string.one_click_bet_enabled_message_placeholder_v2, pn40.d(d, str, p3u0.c));
                        strI.getClass();
                        wdk0.k(wdk0Var2, new xdk0(qek0Var, strI, null, null, null, null, 124), ymd0Var, null, null, false, null, 1020);
                    } else if (jod0Var instanceof iod0) {
                        fl70 fl70Var4 = ymd0.o2;
                        ymd0Var.W0(true);
                    } else if (jod0Var instanceof cod0) {
                        ymd0Var.x0();
                    } else if (jod0Var instanceof hod0) {
                        wdk0 wdk0Var3 = ymd0Var.i2;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var3, new xdk0(rek0.b, ((hod0) jod0Var).f13390a, null, null, null, null, 124), ymd0Var, null, null, false, null, 1020);
                    } else if (jod0Var instanceof dod0) {
                        fl70 fl70Var5 = ymd0.o2;
                        DsPresetTextFieldBasic dsPresetTextFieldBasic = ymd0Var.Q0().c;
                        dsPresetTextFieldBasic.setErrorText(((dod0) jod0Var).f6410a);
                        Drawable drawable = ymd0Var.o0().getDrawable(R.drawable.ic_glyph_circle_warning);
                        if (drawable != null) {
                            int dimensionPixelSize = dsPresetTextFieldBasic.getResources().getDimensionPixelSize(R.dimen.size_16);
                            dsPresetTextFieldBasic.setEndIconDrawable(new BitmapDrawable(ymd0Var.o0().getResources(), hic.D(drawable, dimensionPixelSize, dimensionPixelSize, 4)));
                        }
                    } else if (jod0Var instanceof eod0) {
                        eod0 eod0Var = (eod0) jod0Var;
                        fl70 fl70Var6 = ymd0.o2;
                        DsPresetTextFieldBasic dsPresetTextFieldBasic2 = ymd0Var.Q0().c;
                        dsPresetTextFieldBasic2.setErrorText(null);
                        dsPresetTextFieldBasic2.setEndIconDrawable(null);
                        dsPresetTextFieldBasic2.setHelperText(eod0Var.f8134a);
                        int identifier = dsPresetTextFieldBasic2.getResources().getIdentifier(eod0Var.b, "drawable", ymd0Var.o0().getPackageName());
                        if (identifier != 0) {
                            dsPresetTextFieldBasic2.setEndIcon(identifier);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                nod0 nod0Var = (nod0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (nod0Var != null) {
                    if (!(nod0Var instanceof lod0)) {
                        boolean z2 = nod0Var instanceof kod0;
                        ymd0 ymd0Var2 = this.k;
                        if (z2) {
                            fl70 fl70Var7 = ymd0.o2;
                            ymd0Var2.W0(false);
                        } else if (nod0Var instanceof mod0) {
                            mod0 mod0Var = (mod0) nod0Var;
                            boolean z3 = mod0Var.b;
                            double d2 = mod0Var.f;
                            fl70 fl70Var8 = ymd0.o2;
                            DsPresetTextFieldBasic dsPresetTextFieldBasic3 = ymd0Var2.Q0().c;
                            if ((dsPresetTextFieldBasic3.getText().length() == 0 || wvb.O(dsPresetTextFieldBasic3.getText()) == 0.0d) && d2 > 0.0d) {
                                pn40 pn40Var2 = pn40.f27267a;
                                dsPresetTextFieldBasic3.setText(pn40.c(d2, p3u0.c));
                            }
                            r3r r3rVarV0 = ymd0Var2.Q0();
                            DsButton dsButton = r3rVarV0.b;
                            LinearLayout linearLayout = r3rVarV0.d;
                            DsPresetTextFieldBasic dsPresetTextFieldBasic4 = r3rVarV0.c;
                            dsButton.setEnabled(mod0Var.c);
                            r3rVarV0.e.setChecked(z3);
                            dsPresetTextFieldBasic4.setEnabled(z3);
                            linearLayout.setFocusable(!z3);
                            linearLayout.setFocusableInTouchMode(!z3);
                            if (z3) {
                                dsPresetTextFieldBasic4.a();
                            } else {
                                DsTextField dsTextField = dsPresetTextFieldBasic4.b;
                                TextView textView = dsTextField.getTextView();
                                if (textView != null) {
                                    textView.clearFocus();
                                }
                                CharSequence text = dsTextField.getText();
                                dsTextField.setSelection(text != null ? text.length() : 0);
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
