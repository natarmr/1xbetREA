package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d7q extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ h7q j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7q(h7q h7qVar, int i, int i2, int i3, yje yjeVar) {
        super(2, yjeVar);
        ocq ocqVar = ocq.f25039a;
        this.j = h7qVar;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ocq ocqVar = ocq.f25039a;
        return new d7q(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d7q) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        h7q h7qVar = this.j;
        dvj dvjVar = h7qVar.f.b;
        ocq ocqVar = ocq.f25039a;
        c7q c7qVar = new c7q(h7qVar, this.k, this.l, this.m, null);
        this.i = true;
        Object objD0 = qjj.d0(dvjVar, c7qVar, this);
        return objD0 == wneVar ? wneVar : objD0;
    }
}
