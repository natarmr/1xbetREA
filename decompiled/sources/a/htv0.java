package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class htv0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ywv0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ htv0(ywv0 ywv0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = ywv0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ne60 ne60Var = (ne60) obj2;
        switch (this.i) {
            case 0:
                long j = ne60Var.f23370a;
                return new htv0(this.j, (yje) obj3, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                long j2 = ne60Var.f23370a;
                return new htv0(this.j, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ywv0 ywv0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ywv0Var.l.b();
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hgk0 hgk0Var = (hgk0) ((pz40) ((mkt0) ywv0Var.m.c).b);
                if (!((Boolean) hgk0Var.getValue()).booleanValue()) {
                    hgk0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f46060a;
    }
}
