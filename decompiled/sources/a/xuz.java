package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xuz implements gm80 {
    public xuz(byte b) {
        switch (b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            default:
                v3x v3xVar = b4x.b;
                rcf0 rcf0Var = rcf0.e;
                break;
        }
    }

    public static int a(pb10 pb10Var, int i) {
        pb10Var.getClass();
        int i2 = pb10Var.f26683a;
        return (i == 1 || i != 2) ? i2 : pb10Var.b;
    }

    public static void c(androidx.fragment.app.e eVar, String str, String str2) {
        eVar.getClass();
        str.getClass();
        str2.getClass();
        if (eVar.J("AutoSubBottomSheetDialog") != null) {
            return;
        }
        vv20 vv20Var = new vv20();
        iiy[] iiyVarArr = vv20.n2;
        vv20Var.k2.x(vv20Var, iiyVarArr[0], str);
        vv20Var.l2.x(vv20Var, iiyVarArr[1], str2);
        vv20Var.H0(eVar, "AutoSubBottomSheetDialog");
    }

    @Override // a.gm80
    public fm80 b(List list) {
        list.getClass();
        list.size();
        return new we60();
    }
}
