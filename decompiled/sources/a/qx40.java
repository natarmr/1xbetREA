package a;

import android.app.Application;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qx40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static chf0 f29464a;
    public static final LinkedHashSet b = new LinkedHashSet();

    public static void a(String str) {
        LinkedHashSet linkedHashSet = b;
        linkedHashSet.remove(str);
        if (linkedHashSet.isEmpty()) {
            f29464a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static chf0 b(Application application, Set set) {
        application.getClass();
        set.getClass();
        b.addAll(set);
        chf0 chf0Var = f29464a;
        if (chf0Var != null) {
            return chf0Var;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tx40.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof tx40)) {
                ze3Var = null;
            }
            if (((tx40) ze3Var) != null) {
                chf0 chf0Var2 = new chf0((byte) 28);
                chf0Var2.b = mbl.b(new gji(chf0Var2, 1, (byte) 9));
                chf0Var2.c = mbl.b(new gji(chf0Var2, 0, (byte) 9));
                f29464a = chf0Var2;
                return chf0Var2;
            }
        }
        jf4.n(b1j.i(tx40.class, "Cannot create dependency "));
        return null;
    }
}
