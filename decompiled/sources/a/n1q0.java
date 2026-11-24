package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n1q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22764a;
    public final /* synthetic */ p1q0 b;

    public /* synthetic */ n1q0(p1q0 p1q0Var, byte b) {
        this.f22764a = b;
        this.b = p1q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22764a;
        p1q0 p1q0Var = this.b;
        switch (b) {
            case 0:
                axi axiVar = p1q0Var.L1;
                if (axiVar != null) {
                    return new q0h0(axiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr = p1q0.Q1;
                return new k1q0(new g0p0(1, p1q0Var.H0(), x1q0.class, "onItemClick", "onItemClick(Lorg/xplatform/feature/office/test_section/impl/presentation/models/TestSectionUiModel;)V", 0, (byte) 24));
            default:
                iiy[] iiyVarArr2 = p1q0.Q1;
                i1w0 i1w0Var = p1q0Var.H0().l;
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
