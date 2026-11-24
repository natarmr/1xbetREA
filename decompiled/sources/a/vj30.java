package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface vj30 extends cnx {
    static uj30 x(vj30 vj30Var, int i, int i2, Function1 function1) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return vj30Var.i0(i, i2, lunVar, function1);
    }

    uj30 D0(int i, int i2, Map map, Function1 function1, Function1 function2);

    default uj30 i0(int i, int i2, Map map, Function1 function1) {
        return D0(i, i2, map, null, function1);
    }
}
