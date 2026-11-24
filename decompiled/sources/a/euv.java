package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class euv implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8441a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ xk80 c;

    public /* synthetic */ euv(byte b, vne vneVar, xk80 xk80Var) {
        this.f8441a = b;
        this.b = vneVar;
        this.c = xk80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8441a;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                qjj.W(this.b, null, null, new u48(this.c, iIntValue, null, (byte) 4), 3);
                break;
            case 1:
                qjj.W(this.b, null, null, new u48(this.c, iIntValue, null, (byte) 8), 3);
                break;
            case 2:
                qjj.W(this.b, null, null, new u48(this.c, iIntValue, null, (byte) 9), 3);
                break;
            default:
                qjj.W(this.b, null, null, new u48(this.c, iIntValue, null, (byte) 10), 3);
                break;
        }
        return Unit.f46060a;
    }
}
