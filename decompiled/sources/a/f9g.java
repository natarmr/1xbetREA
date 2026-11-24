package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f9g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ g9g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9g(g9g g9gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = g9gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g9g g9gVar = this.j;
        switch (b) {
            case 0:
                return new f9g(g9gVar, yjeVar, (byte) 0);
            default:
                return new f9g(g9gVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((f9g) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((f9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        g9g g9gVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = g9gVar.l;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                g9gVar.l = sac.V(jiu0.a(g9gVar), new d9g(g9gVar, (byte) 0), null, g9gVar.i.f22085a, new igb(g9gVar, (yje) null, (byte) 21), 10);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                g9gVar.n = null;
                g9gVar.m = iun.f15405a;
                break;
        }
        return Unit.f46060a;
    }
}
