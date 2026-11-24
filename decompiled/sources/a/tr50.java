package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tr50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34409a;
    public final /* synthetic */ wr50 b;

    public /* synthetic */ tr50(wr50 wr50Var, byte b) {
        this.f34409a = b;
        this.b = wr50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34409a;
        wr50 wr50Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = wr50.S1;
                fiu0 fiu0Var = wr50Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                wsz wszVar2 = wr50.S1;
                return new tn50(new p0z(wr50Var, (byte) 19), new b530(wr50Var, (byte) 21));
            default:
                wsz wszVar3 = wr50.S1;
                i1w0 i1w0Var = ((ut50) wr50Var.M1.getValue()).l;
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
