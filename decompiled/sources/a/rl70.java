package a;

import java.io.File;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.statistic.player.impl.player.player_menu.presentation.screen.PlayerMainScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class rl70 implements yi80, gw90 {
    public static y190 b(String str) {
        str.getClass();
        qg9 qg9Var = c.f3497a;
        f99 f99Var = new f99();
        f99Var.c0(str);
        return c.d(f99Var, false);
    }

    public static y190 c(File file) {
        String str = y190.b;
        String string = file.toString();
        string.getClass();
        return b(string);
    }

    public static PlayerMainScreen d(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new PlayerMainScreen(str, j, str2, oaa0.f24920a);
    }

    @Override // a.yi80
    public int a(w6k w6kVar, int i) {
        return (int) (i * 0.85f);
    }

    public void e(androidx.fragment.app.e eVar, PickerParams pickerParams, AnalyticsEntryPoint analyticsEntryPoint) {
        eVar.getClass();
        zo90.p2.getClass();
        if (eVar.J("PICKER_DIALOG_TAG") != null) {
            return;
        }
        zo90 zo90Var = new zo90();
        iiy[] iiyVarArr = zo90.q2;
        zo90Var.m2.J(zo90Var, iiyVarArr[1], pickerParams);
        zo90Var.o2.J(zo90Var, iiyVarArr[3], analyticsEntryPoint);
        zo90Var.H0(eVar, "PICKER_DIALOG_TAG");
    }

    public void g(androidx.fragment.app.e eVar, PickerParams.Language language) {
        AnalyticsEntryPoint analyticsEntryPoint = AnalyticsEntryPoint.f46800a;
        eVar.getClass();
        ao90.o2.getClass();
        if (eVar.J("PICKER_DIALOG_TAG") != null) {
            return;
        }
        ao90 ao90Var = new ao90();
        iiy[] iiyVarArr = ao90.p2;
        ao90Var.m2.J(ao90Var, iiyVarArr[0], language);
        ao90Var.n2.J(ao90Var, iiyVarArr[1], analyticsEntryPoint);
        ao90Var.H0(eVar, "PICKER_DIALOG_TAG");
    }
}
