package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ylg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42840a;
    public final /* synthetic */ bmg0 b;

    public /* synthetic */ ylg0(bmg0 bmg0Var, byte b) {
        this.f42840a = b;
        this.b = bmg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42840a;
        bmg0 bmg0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = bmg0.Z1;
                if (qcc.c0(bmg0Var) == null) {
                    i1w0 i1w0Var = bmg0Var.H0().n;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                zie0 zie0Var2 = bmg0.Z1;
                i1w0 i1w0VarF = a4n0.f(bmg0Var);
                lsi lsiVar = bmg0Var.M1;
                if (lsiVar != null) {
                    return new ry3(i1w0VarF, lsiVar);
                }
                Intrinsics.h("rulesViewModelFactory");
                throw null;
            default:
                zie0 zie0Var3 = bmg0.Z1;
                return new plg0(new dke0(bmg0Var, (byte) 23));
        }
    }
}
