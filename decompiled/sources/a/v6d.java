package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v6d extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6d(gmq gmqVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = gmqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gmq gmqVar = this.l;
        switch (b) {
            case 0:
                v6d v6dVar = new v6d(gmqVar, yjeVar, (byte) 0);
                v6dVar.k = obj;
                return v6dVar;
            case 1:
                v6d v6dVar2 = new v6d(gmqVar, yjeVar, (byte) 1);
                v6dVar2.k = obj;
                return v6dVar2;
            case 2:
                v6d v6dVar3 = new v6d(gmqVar, yjeVar, (byte) 2);
                v6dVar3.k = obj;
                return v6dVar3;
            default:
                v6d v6dVar4 = new v6d(gmqVar, yjeVar, (byte) 3);
                v6dVar4.k = obj;
                return v6dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((v6d) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((v6d) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((v6d) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((v6d) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gmq gmqVar = this.l;
        switch (b) {
            case 0:
                hzb0 hzb0Var = (hzb0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u6d u6dVar = new u6d(hzb0Var, (byte) 0);
                    this.k = null;
                    this.j = true;
                    if (gmqVar.c(u6dVar, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    k0f k0fVar = new k0f((kmq) this.k, (byte) 13);
                    this.k = null;
                    this.j = true;
                    if (gmqVar.c(k0fVar, this) == wneVar2) {
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
            case 2:
                hzb0 hzb0Var2 = (hzb0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    u6d u6dVar2 = new u6d(hzb0Var2, (byte) 2);
                    this.k = null;
                    this.j = true;
                    if (gmqVar.c(u6dVar2, this) == wneVar3) {
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
            default:
                kmq kmqVar = (kmq) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    uap uapVar = new uap(kmqVar, (byte) 11);
                    this.k = null;
                    this.j = true;
                    if (gmqVar.c(uapVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
