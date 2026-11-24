package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23214a;
    public final /* synthetic */ b8j0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ nb(Function1 function1, b8j0 b8j0Var) {
        this.f23214a = (byte) 0;
        this.c = function1;
        this.b = b8j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23214a;
        Function1 function1 = this.c;
        b8j0 b8j0Var = this.b;
        switch (b) {
            case 0:
                ((hej0) obj).getClass();
                function1.invoke(new oyi0(b8j0Var));
                break;
            case 1:
                jxx jxxVar = (jxx) obj;
                jxxVar.getClass();
                DsSettingsCell dsSettingsCell = jxxVar.e;
                dsSettingsCell.getClass();
                dyb.N(dsSettingsCell, ymx.INTERVAL_400, new nb(b8j0Var, function1, (byte) 3));
                DsSettingsCell dsSettingsCell2 = jxxVar.f17332a;
                dsSettingsCell2.setFirst(b8j0Var.getFirst());
                dsSettingsCell2.setLast(b8j0Var.getLast());
                dsSettingsCell.setAllowClickWhenDisabled(true);
                dsSettingsCell.setEnabled(b8j0Var.i());
                jxxVar.b.setImageResource(b8j0Var.b());
                jxxVar.c.setTitle(b8j0Var.getTitle());
                DsCellRightLabel dsCellRightLabel = jxxVar.d;
                dsCellRightLabel.setVisibility(0);
                dsCellRightLabel.setText(b8j0Var.l());
                break;
            case 2:
                ixx ixxVar = (ixx) obj;
                ixxVar.getClass();
                DsSettingsCell dsSettingsCell3 = ixxVar.d;
                dsSettingsCell3.getClass();
                dyb.N(dsSettingsCell3, ymx.INTERVAL_400, new nb(b8j0Var, function1, (byte) 4));
                DsSettingsCell dsSettingsCell4 = ixxVar.f15563a;
                dsSettingsCell4.setFirst(b8j0Var.getFirst());
                dsSettingsCell4.setLast(b8j0Var.getLast());
                dsSettingsCell3.setAllowClickWhenDisabled(true);
                dsSettingsCell3.setEnabled(b8j0Var.i());
                ixxVar.b.setImageResource(b8j0Var.b());
                ixxVar.c.setTitle(b8j0Var.getTitle());
                break;
            case 3:
                ((View) obj).getClass();
                if (b8j0Var.k()) {
                    function1.invoke(b8j0Var);
                }
                break;
            case 4:
                ((View) obj).getClass();
                if (b8j0Var.k()) {
                    function1.invoke(b8j0Var);
                }
                break;
            case 5:
                kxx kxxVar = (kxx) obj;
                kxxVar.getClass();
                DsSettingsCell dsSettingsCell5 = kxxVar.e;
                dsSettingsCell5.getClass();
                dyb.N(dsSettingsCell5, ymx.INTERVAL_400, new nb(b8j0Var, function1, (byte) 6));
                DsSettingsCell dsSettingsCell6 = kxxVar.f19081a;
                dsSettingsCell6.setFirst(b8j0Var.getFirst());
                dsSettingsCell6.setLast(b8j0Var.getLast());
                dsSettingsCell5.setAllowClickWhenDisabled(true);
                dsSettingsCell5.setEnabled(b8j0Var.i());
                kxxVar.b.setImageResource(b8j0Var.b());
                kxxVar.c.setTitle(b8j0Var.getTitle());
                int length = b8j0Var.l().length();
                DsCellRightLabel dsCellRightLabel2 = kxxVar.d;
                if (length > 0) {
                    dsCellRightLabel2.setText(b8j0Var.l());
                    dsCellRightLabel2.setVisibility(0);
                } else {
                    dsCellRightLabel2.setVisibility(8);
                }
                break;
            default:
                ((View) obj).getClass();
                if (b8j0Var.k()) {
                    function1.invoke(b8j0Var);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ nb(b8j0 b8j0Var, Function1 function1, byte b) {
        this.f23214a = b;
        this.b = b8j0Var;
        this.c = function1;
    }
}
