package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class isb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15297a;
    public final String b;

    public /* synthetic */ isb0(String str, byte b) {
        this.f15297a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15297a;
        String str = this.b;
        euj0 euj0Var = (euj0) obj;
        switch (b) {
            case 0:
                euj0Var.getClass();
                euj0Var.c(str, jsb0.b);
                break;
            case 1:
                euj0Var.getClass();
                iay iayVar = jsb0.b;
                euj0Var.c(str, iayVar, iayVar);
                nag0 nag0Var = nag0.f23190a;
                break;
            case 2:
                euj0Var.getClass();
                iay iayVar2 = jsb0.b;
                euj0Var.a(str, iayVar2, iayVar2);
                break;
            case 3:
                euj0Var.getClass();
                euj0Var.a(str, jsb0.b);
                break;
            case 4:
                euj0Var.getClass();
                euj0Var.a(str, jsb0.b);
                break;
            case 5:
                euj0Var.getClass();
                euj0Var.c(str, jsb0.b);
                break;
            default:
                euj0Var.getClass();
                euj0Var.c(str, jsb0.b);
                break;
        }
        return Unit.f46060a;
    }
}
