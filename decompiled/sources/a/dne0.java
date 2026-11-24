package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dne0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6364a;
    public final /* synthetic */ jne0 b;

    public /* synthetic */ dne0(jne0 jne0Var, byte b) {
        this.f6364a = b;
        this.b = jne0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6364a;
        jne0 jne0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = jne0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gne0 gne0Var = jne0.S1;
                pzu pzuVar = jne0Var.H0().g;
                i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                k0w0VarI.c(jh70.i((jh70) pzuVar.e, ((pru) pzuVar.f).a().V0));
                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            default:
                gne0 gne0Var2 = jne0.S1;
                xne0 xne0VarH0 = jne0Var.H0();
                Object value = xne0VarH0.j.getValue();
                one0 one0Var = value instanceof one0 ? (one0) value : null;
                if (one0Var != null) {
                    sac.V(jiu0.a(xne0VarH0), new eme0(xne0VarH0, (byte) 2), null, null, new vne0(null, one0Var, xne0VarH0), 14);
                }
                return Unit.f46060a;
        }
    }
}
