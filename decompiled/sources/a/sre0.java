package a;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class sre0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tre0 f32672a;

    static {
        tre0 tre0Var = null;
        try {
            tre0Var = (tre0) ure0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tre0Var == null) {
            tre0Var = new tre0();
        }
        f32672a = tre0Var;
    }

    public static kiy a(Class cls) {
        tre0 tre0Var = f32672a;
        return tre0Var.k(tre0Var.b(cls), Collections.EMPTY_LIST, false);
    }
}
