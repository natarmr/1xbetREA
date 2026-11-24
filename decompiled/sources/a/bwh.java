package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bwh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3324a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ vne c;
    public final /* synthetic */ xk80 d;

    public /* synthetic */ bwh(vne vneVar, Function1 function1, xk80 xk80Var, byte b) {
        this.f3324a = b;
        this.c = vneVar;
        this.b = function1;
        this.d = xk80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3324a) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                this.b.invoke(new svh(jLongValue));
                qjj.W(this.c, null, null, new cwh(this.d, jLongValue, null, (byte) 0), 3);
                break;
            case 1:
                long jLongValue2 = ((Long) obj).longValue();
                this.b.invoke(new thv(jLongValue2));
                qjj.W(this.c, null, null, new cwh(this.d, jLongValue2, null, (byte) 1), 3);
                break;
            case 2:
                qjj.W(this.c, null, null, new dkg(this.b, ((Integer) obj).intValue(), this.d, null), 3);
                break;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                qjj.W(this.c, null, null, new u48(this.d, iIntValue, null, (byte) 6), 3);
                this.b.invoke(new kr10(iIntValue));
                break;
            case 4:
                long jLongValue3 = ((Long) obj).longValue();
                this.b.invoke(new nb30(jLongValue3));
                qjj.W(this.c, null, null, new cwh(this.d, jLongValue3, null, (byte) 2), 3);
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                qjj.W(this.c, null, null, new u48(this.d, iIntValue2, null, (byte) 11), 3);
                this.b.invoke(new enp0(iIntValue2));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bwh(Function1 function1, vne vneVar, kwj kwjVar, byte b) {
        this.f3324a = b;
        this.b = function1;
        this.c = vneVar;
        this.d = kwjVar;
    }
}
