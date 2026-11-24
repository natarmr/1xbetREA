package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x9u extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ a6u j;
    public final /* synthetic */ c3c0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ c3c0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9u(a6u a6uVar, c3c0 c3c0Var, long j, boolean z, boolean z2, c3c0 c3c0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = a6uVar;
        this.k = c3c0Var;
        this.l = j;
        this.m = z;
        this.n = z2;
        this.o = c3c0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        x9u x9uVar = new x9u(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
        x9uVar.i = obj;
        return x9uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x9u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        a6u a6uVar = this.j;
        long j = this.l;
        kzj kzjVarM = qjj.M(vneVar, null, new w9u(a6uVar, j, null, (byte) 0), 3);
        kzj kzjVarM2 = qjj.M(vneVar, null, new w9u(a6uVar, j, null, (byte) 1), 3);
        return new p6d(this.j.h(sip.c, this.k, this.l, this.m, this.n), this.j.h(sip.b, this.o, this.l, this.m, this.n), new ymq(kzjVarM, kzjVarM2, null, (byte) 1), (byte) 1);
    }
}
