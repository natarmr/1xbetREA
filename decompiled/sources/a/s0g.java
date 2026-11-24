package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class s0g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ g1g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0g(g1g g1gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = g1gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g1g g1gVar = this.j;
        switch (b) {
            case 0:
                return new s0g(g1gVar, yjeVar, (byte) 0);
            default:
                return new s0g(g1gVar, yjeVar, (byte) 1);
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
        return ((s0g) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        g1g g1gVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g1gVar.z.f(q9o.f28359a);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                g1gVar.z.f(x9o.f40517a);
                break;
        }
        return Unit.f46060a;
    }
}
