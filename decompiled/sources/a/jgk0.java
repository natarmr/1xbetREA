package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jgk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nvu f16485a = new nvu((byte) 20);
    public static final nvu b = new nvu((byte) 20);

    public static final xz40 a() {
        nvu nvuVar = b;
        xz40 xz40Var = (xz40) nvuVar.w();
        if (xz40Var != null) {
            return xz40Var;
        }
        xz40 xz40Var2 = new xz40(new eet[0]);
        nvuVar.P(xz40Var2);
        return xz40Var2;
    }

    public static final zbk b(Function0 function0) {
        return new zbk(function0, null);
    }
}
