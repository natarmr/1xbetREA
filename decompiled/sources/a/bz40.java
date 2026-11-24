package a;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bz40 {
    public static final bz40 b = new bz40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f3448a = new AtomicReference(new dwb0(new nw20()));

    public final synchronized void a(xvb0 xvb0Var) {
        nw20 nw20Var = new nw20((dwb0) this.f3448a.get());
        HashMap map = (HashMap) nw20Var.f24215a;
        cwb0 cwb0Var = new cwb0(xvb0Var.f41551a, cjc.class);
        if (map.containsKey(cwb0Var)) {
            xvb0 xvb0Var2 = (xvb0) map.get(cwb0Var);
            if (!xvb0Var2.equals(xvb0Var) || xvb0Var != xvb0Var2) {
                ohq.v(cwb0Var, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            map.put(cwb0Var, xvb0Var);
        }
        this.f3448a.set(new dwb0(nw20Var));
    }
}
