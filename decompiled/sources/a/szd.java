package a;

import android.text.Editable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class szd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33067a;
    public final /* synthetic */ uzd b;

    public /* synthetic */ szd(uzd uzdVar, byte b) {
        this.f33067a = b;
        this.b = uzdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33067a;
        uzd uzdVar = this.b;
        switch (b) {
            case 0:
                Editable editable = (Editable) obj;
                qud qudVar = uzd.S1;
                editable.getClass();
                g1e g1eVarJ0 = uzdVar.J0();
                String string = editable.toString();
                if (string == null) {
                    string = "";
                }
                g1eVarJ0.A = string;
                g1eVarJ0.E("");
                g1eVarJ0.I(g1eVarJ0.B);
                break;
            case 1:
                qud qudVar2 = uzd.S1;
                ((View) obj).getClass();
                ii iiVarG0 = uzdVar.G0();
                String strH = uzdVar.H(R.string.consultant);
                String strH2 = uzdVar.H(R.string.consultant_chat_with_operator_dialog_message);
                String strH3 = uzdVar.H(R.string.consultant_chat_with_operator_dialog_positive_text);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, uzdVar.H(R.string.cancel), (String) null, "REQUEST_CONSULTANT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = uzdVar.C();
                eVarC.getClass();
                iiVarG0.d(dialogFields, eVarC);
                break;
            default:
                iqt0 iqt0Var = (iqt0) obj;
                qud qudVar3 = uzd.S1;
                iqt0Var.getClass();
                uzdVar.J0().i.a(iqt0Var);
                break;
        }
        return Unit.f46060a;
    }
}
