package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qmq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gmq l;
    public final /* synthetic */ xdr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmq(gmq gmqVar, xdr xdrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = gmqVar;
        this.m = xdrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xdr xdrVar = this.m;
        gmq gmqVar = this.l;
        switch (b) {
            case 0:
                qmq qmqVar = new qmq(gmqVar, xdrVar, yjeVar, (byte) 0);
                qmqVar.k = obj;
                return qmqVar;
            default:
                qmq qmqVar2 = new qmq(gmqVar, xdrVar, yjeVar, (byte) 1);
                qmqVar2.k = obj;
                return qmqVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qmq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qmq) create((yyj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xdr xdrVar = this.m;
        gmq gmqVar = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.k;
                    mie0 mie0Var = new mie0();
                    mie0Var.f21842a = lv00.i;
                    pmq pmqVar = new pmq(mie0Var, xdrVar, kmqVar, (byte) 0);
                    this.j = true;
                    if (gmqVar.c(pmqVar, this) == wneVar) {
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
                if (!z2) {
                    z1x.P(obj);
                    g6q g6qVar = new g6q((Object) xdrVar, (Object) new f5b((yyj0) this.k), yjeVar, (byte) 9);
                    this.j = true;
                    if (slb.O(gmqVar, g6qVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
