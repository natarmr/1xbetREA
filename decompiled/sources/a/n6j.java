package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n6j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ o6j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6j(o6j o6jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o6jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o6j o6jVar = this.k;
        switch (b) {
            case 0:
                return new n6j(o6jVar, yjeVar, (byte) 0);
            default:
                n6j n6jVar = new n6j(o6jVar, yjeVar, (byte) 1);
                n6jVar.j = ((Boolean) obj).booleanValue();
                return n6jVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((n6j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((n6j) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        byte b = this.i;
        yje yjeVar = null;
        o6j o6jVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    v4v v4vVar = o6jVar.b;
                    this.j = true;
                    if (v4vVar.a(this) == wneVar) {
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
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2 && ((bbyVar = o6jVar.i) == null || !bbyVar.isActive())) {
                    o6jVar.i = sac.V(jiu0.a(o6jVar), new y6h(1, o6jVar.g, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, o6jVar.e.b, new n6j(o6jVar, yjeVar, (byte) 0), 10);
                }
                return Unit.f46060a;
        }
    }
}
