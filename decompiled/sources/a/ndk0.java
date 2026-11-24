package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public interface ndk0 {
    default boolean a() {
        boolean zB;
        rrm rrmVarC = c();
        rrmVarC.getClass();
        n660 n660VarQ = n660.q();
        d46 d46Var = rrmVarC.u;
        synchronized (n660VarQ.f22981a) {
            zB = n660VarQ.B(d46Var);
        }
        return zB;
    }

    Function1 b();

    rrm c();

    default void dismiss() {
        c().a(3);
    }
}
