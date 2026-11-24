package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface mm40 {
    Object a(Object obj, Function2 function2);

    boolean b(Function1 function1);

    default mm40 e(mm40 mm40Var) {
        return mm40Var == jm40.b ? this : new i7d(this, mm40Var);
    }
}
