package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wtv0 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ buv0 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtv0(boolean z, buv0 buv0Var, float f, int i, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = buv0Var;
        this.l = f;
        this.m = i;
        this.n = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        wtv0 wtv0Var = new wtv0(this.j, this.k, this.l, this.m, this.n, yjeVar);
        wtv0Var.i = obj;
        return wtv0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wtv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        buv0 buv0Var = this.k;
        float f = this.l;
        int i = this.m;
        qjj.W(vneVar, null, null, new c4a(buv0Var, f, i, null, (byte) 2), 3);
        if (this.j) {
            qjj.W(vneVar, null, null, new vtv0(buv0Var, this.n, i, null), 3);
        }
        return Unit.f46060a;
    }
}
