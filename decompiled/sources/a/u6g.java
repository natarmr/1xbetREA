package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u6g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ w6g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6g(w6g w6gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = w6gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w6g w6gVar = this.j;
        switch (b) {
            case 0:
                return new u6g(w6gVar, yjeVar, (byte) 0);
            default:
                return new u6g(w6gVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u6g) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((u6g) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        w6g w6gVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                w6gVar.x();
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!(w6gVar.n.getValue() instanceof p6g)) {
                    w6gVar.q = null;
                    sac.V(jiu0.a(w6gVar), new s6g(w6gVar, (byte) 1), null, w6gVar.j.f22085a, new igb((Object) w6gVar, (yje) null, (byte) 18), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
