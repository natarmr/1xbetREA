package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
public final class ud7 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35465a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;

    public /* synthetic */ ud7(byte b, View view, Object obj) {
        this.f35465a = b;
        this.b = obj;
        this.c = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ClipData primaryClip;
        byte b = this.f35465a;
        View view = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj;
                BetInputView betInputView = (BetInputView) view;
                vd7 vd7Var = betInputView.r;
                String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    boolean zX = kotlin.text.c.x(string, Separators.DOT, false);
                    boolean zN = kotlin.text.c.n(string, Separators.DOT, false);
                    Object[] objArr = (string.length() <= 0 || zX || Intrinsics.d(betInputView.t, BigDecimal.ZERO)) ? false : true;
                    Object[] objArr2 = objArr == true && new BigDecimal(string).compareTo(betInputView.t) == 0;
                    boolean z = objArr == true && new BigDecimal(string).compareTo(betInputView.t) > 0;
                    if (zX) {
                        ((DsTextField) vd7Var.d).setText("0".concat(string));
                        DsTextField dsTextField = (DsTextField) vd7Var.d;
                        CharSequence text = dsTextField.getText();
                        dsTextField.setSelection(text != null ? text.length() : 0);
                    } else if (z || (objArr2 == true && zN)) {
                        DsTextField dsTextField2 = (DsTextField) vd7Var.d;
                        BigDecimal bigDecimal = betInputView.t;
                        dsTextField2.setText((bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString());
                        DsTextField dsTextField3 = (DsTextField) vd7Var.d;
                        CharSequence text2 = dsTextField3.getText();
                        dsTextField3.setSelection(text2 != null ? text2.length() : 0);
                    } else {
                        function1.invoke(string);
                    }
                } else {
                    function1.invoke("");
                }
                break;
            default:
                Object systemService = ((Context) obj).getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && Intrinsics.d(primaryClip.getItemAt(0).getText(), String.valueOf(editable))) {
                    ((juc) view).getOnTextPaste().invoke();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.f35465a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.f35465a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
