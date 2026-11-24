package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x96 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40494a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ x96(Function1 function1, pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f40494a = b;
        this.b = function1;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40494a;
        pz40 pz40Var = this.d;
        pz40 pz40Var2 = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                a8q0 a8q0Var = (a8q0) obj;
                pz40Var2.setValue(a8q0Var);
                boolean zD = Intrinsics.d((String) pz40Var.getValue(), a8q0Var.f440a.b);
                j83 j83Var = a8q0Var.f440a;
                pz40Var.setValue(j83Var.b);
                if (!zD) {
                    function1.invoke(j83Var.b);
                }
                break;
            default:
                u3i u3iVar = (u3i) obj;
                u3iVar.getClass();
                if (u3iVar instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var2.getValue()).longValue(), ((Boolean) pz40Var.getValue()).booleanValue(), (v3i) u3iVar));
                } else if (u3iVar instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var2.getValue()).longValue(), ((Boolean) pz40Var.getValue()).booleanValue(), (x3i) u3iVar));
                } else if (u3iVar instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var2.getValue()).longValue(), ((Boolean) pz40Var.getValue()).booleanValue(), (z3i) u3iVar));
                }
                break;
        }
        return Unit.f46060a;
    }
}
