package a;

import android.text.Editable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tmd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34189a;
    public final /* synthetic */ ymd0 b;

    public /* synthetic */ tmd0(ymd0 ymd0Var, byte b) {
        this.f34189a = b;
        this.b = ymd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34189a;
        ymd0 ymd0Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = ymd0.o2;
                ((View) obj).getClass();
                tod0 tod0Var = (tod0) ymd0Var.j2.getValue();
                sac.V(jiu0.a(tod0Var), new znd0(tod0Var, (byte) 4), null, tod0Var.b.b, new qod0(tod0Var, null), 10);
                break;
            default:
                Editable editable = (Editable) obj;
                fl70 fl70Var2 = ymd0.o2;
                editable.getClass();
                DsPresetTextFieldBasic dsPresetTextFieldBasic = ymd0Var.Q0().c;
                if (wvb.O(editable.toString()) == 0.0d) {
                    dsPresetTextFieldBasic.setSelection(dsPresetTextFieldBasic.getText().length());
                }
                tod0 tod0Var2 = (tod0) ymd0Var.j2.getValue();
                String string = editable.toString();
                string.getClass();
                sac.V(jiu0.a(tod0Var2), new znd0(tod0Var2, (byte) 0), null, tod0Var2.b.b, new pod0(tod0Var2, string, null), 10);
                break;
        }
        return Unit.f46060a;
    }
}
