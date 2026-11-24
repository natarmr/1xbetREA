package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class vrk0 {
    public final void a(mm40 mm40Var, yx5 yx5Var, SpecialEventTabScreenParams specialEventTabScreenParams, ebo0 ebo0Var, Function1 function1, Function0 function0, xdr xdrVar, fet fetVar, int i) {
        mm40Var.getClass();
        specialEventTabScreenParams.getClass();
        function1.getClass();
        function0.getClass();
        xdrVar.getClass();
        fetVar.g0(-692947244);
        int i2 = i | (fetVar.g(yx5Var) ? 32 : 16) | (fetVar.g(specialEventTabScreenParams) ? 256 : 128) | (fetVar.g(ebo0Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(xdrVar) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            bbo0.a(mm40Var, yx5Var, specialEventTabScreenParams, ebo0Var, function1, function0, xdrVar, fetVar, (i2 & 3670016) | (i2 & 112) | 70 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6(this, mm40Var, yx5Var, specialEventTabScreenParams, ebo0Var, function1, function0, xdrVar, i);
        }
    }
}
