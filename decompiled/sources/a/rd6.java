package a;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30276a;
    public final /* synthetic */ wd6 b;

    public /* synthetic */ rd6(wd6 wd6Var, byte b) {
        this.f30276a = b;
        this.b = wd6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30276a;
        wd6 wd6Var = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = wd6.o2;
                ((View) obj).getClass();
                int i = wd6Var.o0().getResources().getDisplayMetrics().heightPixels;
                kxq kxqVarB = wd6Var.B();
                int iN = kxqVarB != null ? b8k0.N(kxqVarB) : 0;
                kxq kxqVarB2 = wd6Var.B();
                vcc.f0(i120.V(new Pair("RESULT_OK", Boolean.TRUE), new Pair("RESULT_KEYBOARD_WAS_OPEN", Boolean.valueOf(kxqVarB2 != null ? b8k0.S(kxqVarB2, i, iN) : false))), wd6Var, wd6Var.i2.n(wd6Var, wd6.p2[2]));
                wd6Var.x0();
                break;
            default:
                String str = (String) obj;
                DsPresetTextFieldBasic dsPresetTextFieldBasic = wd6Var.V0().b;
                dsPresetTextFieldBasic.setText(str);
                dsPresetTextFieldBasic.setSelection(str.length());
                break;
        }
        return Unit.f46060a;
    }
}
