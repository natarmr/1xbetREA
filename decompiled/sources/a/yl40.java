package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42823a = 0;
    public final /* synthetic */ xpj0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ vne d;

    public /* synthetic */ yl40(xpj0 xpj0Var, vne vneVar, Function0 function0) {
        this.b = xpj0Var;
        this.d = vneVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42823a;
        yje yjeVar = null;
        vne vneVar = this.d;
        Function0 function0 = this.c;
        xpj0 xpj0Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) ((Function1) xpj0Var.e.e).invoke(ypj0.f43033a)).booleanValue()) {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, yjeVar, (byte) 10), 3).invokeOnCompletion(new am40(xpj0Var, function0, (byte) 0));
                }
                break;
            default:
                int iOrdinal = xpj0Var.c().ordinal();
                if (iOrdinal == 1) {
                    function0.invoke();
                } else if (iOrdinal != 2) {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, yjeVar, (byte) 12), 3);
                } else {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, yjeVar, (byte) 11), 3);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yl40(xpj0 xpj0Var, Function0 function0, vne vneVar) {
        this.b = xpj0Var;
        this.c = function0;
        this.d = vneVar;
    }
}
