package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zbe implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44111a;
    public final /* synthetic */ dce b;

    public /* synthetic */ zbe(dce dceVar, byte b) {
        this.f44111a = b;
        this.b = dceVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44111a;
        dce dceVar = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = dce.Q1;
                ((pce) dceVar.N1.getValue()).w(wbe.f38873a);
                return Unit.f46060a;
            case 1:
                fiu0 fiu0Var = dceVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kwd kwdVar2 = dce.Q1;
                i1w0 i1w0Var = ((pce) dceVar.N1.getValue()).d;
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
