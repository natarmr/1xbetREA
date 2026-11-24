package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class af implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f755a;
    public final /* synthetic */ df b;

    public /* synthetic */ af(df dfVar, byte b) {
        this.f755a = b;
        this.b = dfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f755a;
        df dfVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = df.N1;
                i1w0 i1w0Var = ((uf) dfVar.L1.getValue()).b;
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
            default:
                u5i u5iVar = dfVar.K1;
                if (u5iVar != null) {
                    return new t0h0(u5iVar, a4n0.f(dfVar));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
