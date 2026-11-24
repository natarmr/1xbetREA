package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class y3l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41957a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ ngk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ y3l0(pz40 pz40Var, ngk0 ngk0Var, String str, byte b) {
        this.f41957a = b;
        this.b = pz40Var;
        this.c = ngk0Var;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41957a;
        String str = this.d;
        ngk0 ngk0Var = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                pz40Var.setValue(Long.valueOf(((Number) pz40Var.getValue()).longValue() + 1));
                ngk0Var.put(str, j6zVar);
                break;
            case 1:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                pz40Var.setValue(Long.valueOf(((Number) pz40Var.getValue()).longValue() + 1));
                ngk0Var.put(str, j6zVar2);
                break;
            case 2:
                j6z j6zVar3 = (j6z) obj;
                j6zVar3.getClass();
                pz40Var.setValue(Long.valueOf(((Number) pz40Var.getValue()).longValue() + 1));
                ngk0Var.put(str, j6zVar3);
                break;
            default:
                j6z j6zVar4 = (j6z) obj;
                j6zVar4.getClass();
                pz40Var.setValue(Long.valueOf(((Number) pz40Var.getValue()).longValue() + 1));
                ngk0Var.put(str, j6zVar4);
                break;
        }
        return Unit.f46060a;
    }
}
