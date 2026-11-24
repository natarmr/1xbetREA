package a;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ni9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f23572a;

    public /* synthetic */ ni9(g45 g45Var) {
        this.f23572a = g45Var;
    }

    public g0f a(int i) {
        Object next;
        Iterator it = ((m0f) this.f23572a.b).f20951a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            hf6 hf6Var = (hf6) CollectionsKt.W(0, ((g0f) next).b);
            if (hf6Var != null && hf6Var.f12958a == i) {
                break;
            }
        }
        g0f g0fVar = (g0f) next;
        if (g0fVar != null) {
            return g0fVar;
        }
        iun iunVar = iun.f15405a;
        return new g0f(0L, iunVar, 0.0d, iunVar, 0.0d, 0L, 0.0d, 0.0d, false, 0.0d, false, 0, "", false, 0, "", iunVar, 0.0d, 0.0d, false);
    }

    public void b() {
        q7d0 q7d0Var = (q7d0) this.f23572a.f;
        q7d0Var.h("COUPON_KEY_PREFERENCE");
        q7d0Var.h("COUPON_TYPE_KEY_PREFERENCE");
    }

    public boolean c() {
        return System.currentTimeMillis() - ((ave) this.f23572a.c).b < 120000;
    }
}
