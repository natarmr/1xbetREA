package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d6q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5562a;
    public final /* synthetic */ i6q b;

    public /* synthetic */ d6q(i6q i6qVar, byte b) {
        this.f5562a = b;
        this.b = i6qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5562a;
        i6q i6qVar = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = i6qVar.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr = i6q.V1;
                i1w0 i1w0Var = i6qVar.H0().g;
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
            case 2:
                iiy[] iiyVarArr2 = i6q.V1;
                r8q r8qVarH0 = i6qVar.H0();
                Object value = r8qVarH0.S.getValue();
                value.getClass();
                r8qVarH0.f.a(r8qVarH0.g, true, ((q7q) value).f28264a.f28916a);
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr3 = i6q.V1;
                r8q r8qVarH1 = i6qVar.H0();
                r8qVarH1.A();
                qjj.W(r8qVarH1.X, r8qVarH1.i.b, null, new q8q(r8qVarH1, null, (byte) 1), 2);
                return Unit.f46060a;
        }
    }
}
