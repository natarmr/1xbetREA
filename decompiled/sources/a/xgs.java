package a;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Pair;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/xgs;", "La/u0i;", "<init>", "()V", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xgs extends u0i {
    public static final /* synthetic */ int f2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // a.u0i
    public final void M0() {
        boolean z;
        String str = K0().f;
        if (str == null) {
            str = "";
        }
        DsCheckbox dsCheckboxJ0 = J0();
        if (dsCheckboxJ0 != null) {
            z = dsCheckboxJ0.isChecked();
        }
        vcc.f0(i120.V(new Pair("GameIsNotFinishedDialog.RESULT_KEY_EXIT", Boolean.valueOf(z))), this, str);
        z0(false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // a.u0i
    public final void O0() {
        boolean z;
        String str = K0().f;
        if (str == null) {
            str = "";
        }
        DsCheckbox dsCheckboxJ0 = J0();
        if (dsCheckboxJ0 != null) {
            z = dsCheckboxJ0.isChecked();
        }
        vcc.f0(i120.V(new Pair("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE", Boolean.valueOf(z))), this, str);
        z0(false, false, false);
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
    }
}
