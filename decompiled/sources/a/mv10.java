package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mv10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22437a;
    public final /* synthetic */ qv10 b;

    public /* synthetic */ mv10(qv10 qv10Var, byte b) {
        this.f22437a = b;
        this.b = qv10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22437a;
        qv10 qv10Var = this.b;
        switch (b) {
            case 0:
                m9i m9iVar = qv10Var.L1;
                if (m9iVar != null) {
                    return new t0h0(m9iVar, a4n0.f(qv10Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                i1w0 i1w0Var = ((rv10) qv10Var.M1.getValue()).b;
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
