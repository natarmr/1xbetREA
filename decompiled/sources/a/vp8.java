package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vp8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37794a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ xpj0 c;

    public /* synthetic */ vp8(vne vneVar, xpj0 xpj0Var, byte b) {
        this.f37794a = b;
        this.b = vneVar;
        this.c = xpj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37794a;
        vne vneVar = this.b;
        xpj0 xpj0Var = this.c;
        yje yjeVar = null;
        switch (b) {
            case 0:
                int iOrdinal = xpj0Var.c().ordinal();
                if (iOrdinal == 1) {
                    qjj.W(vneVar, null, null, new ya(xpj0Var, yjeVar, (byte) 11), 3);
                } else if (iOrdinal != 2) {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 1), 3);
                } else {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 0), 3);
                }
                return Unit.f46060a;
            case 1:
                qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 2), 3);
                break;
            case 2:
                qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 3), 3);
                break;
            case 3:
                qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 4), 3);
                break;
            default:
                if (((Boolean) ((Function1) xpj0Var.e.e).invoke(ypj0.c)).booleanValue()) {
                    qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 14), 3);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ vp8(xpj0 xpj0Var, vne vneVar, byte b) {
        this.f37794a = b;
        this.c = xpj0Var;
        this.b = vneVar;
    }
}
