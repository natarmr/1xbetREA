package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a2x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gx3 f146a = new gx3(0);

    public static synchronized void a() {
        gx3 gx3Var = f146a;
        Iterator it = ((ex3) gx3Var.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        gx3Var.clear();
    }
}
