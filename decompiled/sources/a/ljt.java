package a;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ljt extends z3 implements Serializable {
    public static ijt h(z3 z3Var, z3 z3Var2, int i, eov0 eov0Var, Class cls) {
        return new ijt(z3Var, Collections.EMPTY_LIST, z3Var2, new hjt(i, eov0Var, true), cls);
    }

    public static ijt i(z3 z3Var, Object obj, z3 z3Var2, int i, eov0 eov0Var, Class cls) {
        return new ijt(z3Var, obj, z3Var2, new hjt(i, eov0Var, false), cls);
    }
}
