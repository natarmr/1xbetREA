package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vwc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38144a;
    public final /* synthetic */ ywc b;

    public /* synthetic */ vwc(ywc ywcVar, byte b) {
        this.f38144a = b;
        this.b = ywcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38144a;
        ywc ywcVar = this.b;
        switch (b) {
            case 0:
                kl5 kl5Var = ywc.W1;
                i1w0 i1w0Var = ywcVar.H0().f;
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
            case 1:
                kl5 kl5Var2 = ywc.W1;
                fiu0 fiu0Var = ywcVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kl5 kl5Var3 = ywc.W1;
                ywcVar.H0().x();
                return Unit.f46060a;
        }
    }
}
