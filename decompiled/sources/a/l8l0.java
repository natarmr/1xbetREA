package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l8l0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8l0(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i = 3;
        ynq0 ynq0Var = (ynq0) obj;
        switch (this.i) {
            case 0:
                long j = ynq0Var.f42952a;
                long j2 = ((ynq0) obj2).f42952a;
                l8l0 l8l0Var = new l8l0(i, (yje) obj3, (byte) 0);
                l8l0Var.j = j;
                l8l0Var.k = j2;
                return l8l0Var.invokeSuspend(Unit.f46060a);
            default:
                long j3 = ynq0Var.f42952a;
                long j4 = ((ynq0) obj2).f42952a;
                l8l0 l8l0Var2 = new l8l0(i, (yje) obj3, (byte) 1);
                l8l0Var2.j = j3;
                l8l0Var2.k = j4;
                return l8l0Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                long j = this.j;
                long j2 = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new wgq0(j, j2);
            default:
                long j3 = this.j;
                long j4 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new xgq0(ynq0.f(j3), ynq0.f(j4));
        }
    }
}
