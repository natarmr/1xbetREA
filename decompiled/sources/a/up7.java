package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class up7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36048a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;

    public up7(j1k0 j1k0Var, g1k0 g1k0Var, boolean z, Function1 function1) {
        this.d = j1k0Var;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36048a;
        Object obj2 = this.d;
        Function1 function1 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                j1k0 j1k0Var = (j1k0) obj2;
                if (bemVar instanceof wdm) {
                    if (z) {
                        function1.invoke(new ep7(j1k0Var.l, j1k0Var.p, j1k0Var.r, j1k0Var.h, j1k0Var.m, j1k0Var.n));
                    }
                } else if (bemVar instanceof aem) {
                    function1.invoke(new ip7(j1k0Var.l, j1k0Var.i, j1k0Var.p, j1k0Var.r, j1k0Var.h, j1k0Var.m));
                }
                break;
            default:
                ((Number) obj).longValue();
                if (z) {
                    function1.invoke(Long.valueOf(((ezh) obj2).f8671a));
                }
                break;
        }
        return Unit.f46060a;
    }

    public up7(boolean z, Function1 function1, ezh ezhVar) {
        this.b = z;
        this.c = function1;
        this.d = ezhVar;
    }
}
