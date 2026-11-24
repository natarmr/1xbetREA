package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class wwk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yhi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwk0(yhi yhiVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = yhiVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                wwk0 wwk0Var = new wwk0(this.l, yjeVar, (byte) 0);
                wwk0Var.k = obj;
                return wwk0Var;
            case 1:
                wwk0 wwk0Var2 = new wwk0(this.l, yjeVar, (byte) 1);
                wwk0Var2.k = obj;
                return wwk0Var2;
            case 2:
                wwk0 wwk0Var3 = new wwk0(this.l, yjeVar, (byte) 2);
                wwk0Var3.k = obj;
                return wwk0Var3;
            case 3:
                wwk0 wwk0Var4 = new wwk0(this.l, yjeVar, (byte) 3);
                wwk0Var4.k = obj;
                return wwk0Var4;
            default:
                wwk0 wwk0Var5 = new wwk0(this.l, yjeVar, (byte) 4);
                wwk0Var5.k = obj;
                return wwk0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wwk0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wwk0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wwk0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wwk0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wwk0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yhi yhiVar = this.l;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (((zpx) yhiVar.m).f44782a.b.f36841a.I()) {
                        zpx zpxVar = (zpx) yhiVar.j;
                        bqk0 bqk0Var = new bqk0(th);
                        n0w n0wVar = (n0w) yhiVar.v;
                        this.k = null;
                        this.j = true;
                        if (zpxVar.a(bqk0Var, n0wVar, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (((aqx) yhiVar.l).f1317a.b.f23010a.I()) {
                        aqx aqxVar = (aqx) yhiVar.h;
                        bqk0 bqk0Var2 = new bqk0(th2);
                        this.k = null;
                        this.j = true;
                        if (aqxVar.a(bqk0Var2, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                List list = (List) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    aqx aqxVar2 = (aqx) yhiVar.h;
                    cqk0 cqk0Var = new cqk0(list);
                    this.k = null;
                    this.j = true;
                    if (aqxVar2.a(cqk0Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (((bqx) yhiVar.k).f3054a.b.f31721a.I()) {
                        bqx bqxVar = (bqx) yhiVar.i;
                        bqk0 bqk0Var3 = new bqk0(th3);
                        this.k = null;
                        this.j = true;
                        if (bqxVar.a(bqk0Var3, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                List list2 = (List) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bqx bqxVar2 = (bqx) yhiVar.i;
                    cqk0 cqk0Var2 = new cqk0(list2);
                    this.k = null;
                    this.j = true;
                    if (bqxVar2.a(cqk0Var2, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
