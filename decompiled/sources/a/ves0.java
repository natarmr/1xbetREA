package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ves0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37300a;
    public final /* synthetic */ zes0 b;

    public /* synthetic */ ves0(zes0 zes0Var, byte b) {
        this.f37300a = b;
        this.b = zes0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37300a;
        zes0 zes0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = zes0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                m6m0 m6m0Var = zes0.b2;
                String strN = zes0Var.X1.n(zes0Var, zes0.c2[9]);
                strN.getClass();
                les0 les0Var = new les0(les0.f);
                les0Var.d.b(new gbn(new efr0((byte) 19), new d8q0(3, (byte) 15), new ka6(strN, (byte) 17), pfo0.x));
                return les0Var;
            default:
                m6m0 m6m0Var2 = zes0.b2;
                i1w0 i1w0Var = ((vfs0) zes0Var.N1.getValue()).d;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
