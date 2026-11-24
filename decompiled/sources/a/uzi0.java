package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class uzi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wzi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzi0(wzi0 wzi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wzi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wzi0 wzi0Var = this.k;
        switch (b) {
            case 0:
                return new uzi0(wzi0Var, yjeVar, (byte) 0);
            default:
                return new uzi0(wzi0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((uzi0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wzi0 wzi0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq data = wzi0Var.c.getData();
                    jz6 jz6Var = new jz6(wzi0Var.d, (byte) 11);
                    this.j = true;
                    if (data.c(jz6Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                gmq data2 = wzi0Var.c.getData();
                this.j = true;
                Object objK = ntb.K(data2, this);
                return objK == wneVar2 ? wneVar2 : objK;
        }
    }
}
