package a;

import android.gov.nist.core.Separators;
import android.text.Editable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c7n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3873a;
    public final /* synthetic */ DsTextField b;

    public /* synthetic */ c7n(DsTextField dsTextField, byte b) {
        this.f3873a = b;
        this.b = dsTextField;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3873a;
        DsTextField dsTextField = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                org.xplatform.uikit.components.text_field.middle.b bVar = dsTextField.B;
                if (bVar != null) {
                    bVar.h(!zBooleanValue);
                }
                break;
            default:
                Editable editable = (Editable) obj;
                List list = z7q0.f43931a;
                editable.getClass();
                int selectionStart = dsTextField.getSelectionStart();
                if (selectionStart < 0) {
                    selectionStart = 0;
                }
                int length = editable.length();
                if (selectionStart > length) {
                    selectionStart = length;
                }
                String string = editable.subSequence(0, selectionStart).toString();
                StringBuilder sb = new StringBuilder();
                int length2 = string.length();
                for (int i = 0; i < length2; i++) {
                    char cCharAt = string.charAt(i);
                    if (Character.isLetterOrDigit(cCharAt) || list.contains(Character.valueOf(cCharAt))) {
                        sb.append(cCharAt);
                    }
                }
                String strP = twn.p(" +", sb.toString(), Separators.SP);
                if (selectionStart < 0) {
                    selectionStart = 0;
                }
                String string2 = editable.subSequence(selectionStart, editable.length()).toString();
                StringBuilder sb2 = new StringBuilder();
                int length3 = string2.length();
                for (int i2 = 0; i2 < length3; i2++) {
                    char cCharAt2 = string2.charAt(i2);
                    if (Character.isLetterOrDigit(cCharAt2) || list.contains(Character.valueOf(cCharAt2))) {
                        sb2.append(cCharAt2);
                    }
                }
                String strP2 = twn.p(" +", sb2.toString(), Separators.SP);
                if (kotlin.text.c.n(strP, Separators.SP, false) && kotlin.text.c.x(strP2, Separators.SP, false)) {
                    strP2 = strP2.substring(1);
                }
                String strK = kng0.k(strP, strP2);
                if (!Intrinsics.d(editable.toString(), strK)) {
                    dsTextField.setText(strK);
                    dsTextField.setSelection(strP.length());
                }
                break;
        }
        return Unit.f46060a;
    }
}
