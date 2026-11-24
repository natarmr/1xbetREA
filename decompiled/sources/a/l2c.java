package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class l2c extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ m2c j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2c(long j, m2c m2cVar, yje yjeVar, boolean z, boolean z2) {
        super(2, yjeVar);
        this.j = m2cVar;
        this.k = z;
        this.l = z2;
        this.m = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new l2c(this.m, this.j, yjeVar, this.k, this.l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2c) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
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
        m2c m2cVar = this.j;
        m2cVar.getClass();
        k2c k2cVar = new k2c(bkb.i0(new vsg0(new e2c(this.m, m2cVar, null, this.k, this.l)), "", 5, 5L, kotlin.collections.a.c(oqt0.class), null, null, 48), (byte) 0);
        this.i = true;
        Object objK = ntb.K(k2cVar, this);
        return objK == wneVar ? wneVar : objK;
    }
}
