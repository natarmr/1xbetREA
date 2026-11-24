package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n620 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22975a;
    public final /* synthetic */ c720 b;

    public /* synthetic */ n620(c720 c720Var, byte b) {
        this.f22975a = b;
        this.b = c720Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22975a;
        yje yjeVar = null;
        c720 c720Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = c720Var.o2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                wsz wszVar = c720.p2;
                i1w0 i1w0Var = ((kn20) c720Var.i2.getValue()).d;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        dyb.u0();
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                wsz wszVar2 = c720.p2;
                kn20 kn20Var = (kn20) c720Var.i2.getValue();
                sac.V(jiu0.a(kn20Var), om20.f25484a, null, kn20Var.e.b, new z210(kn20Var, yjeVar, (byte) 10), 10);
                dyb.u0();
                break;
        }
        return Boolean.TRUE;
    }
}
