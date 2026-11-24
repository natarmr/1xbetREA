package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vi1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vsg0 l;
    public final /* synthetic */ d9z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi1(vsg0 vsg0Var, yje yjeVar, d9z d9zVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = vsg0Var;
        this.m = d9zVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d9z d9zVar = this.m;
        vsg0 vsg0Var = this.l;
        switch (b) {
            case 0:
                vi1 vi1Var = new vi1(vsg0Var, yjeVar, d9zVar, (byte) 0);
                vi1Var.k = obj;
                return vi1Var;
            case 1:
                vi1 vi1Var2 = new vi1(vsg0Var, yjeVar, d9zVar, (byte) 1);
                vi1Var2.k = obj;
                return vi1Var2;
            case 2:
                vi1 vi1Var3 = new vi1(vsg0Var, yjeVar, d9zVar, (byte) 2);
                vi1Var3.k = obj;
                return vi1Var3;
            case 3:
                vi1 vi1Var4 = new vi1(vsg0Var, yjeVar, d9zVar, (byte) 3);
                vi1Var4.k = obj;
                return vi1Var4;
            default:
                vi1 vi1Var5 = new vi1(vsg0Var, yjeVar, d9zVar, (byte) 4);
                vi1Var5.k = obj;
                return vi1Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((vi1) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        d9z d9zVar = this.m;
        vsg0 vsg0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ui1 ui1Var = new ui1((kmq) this.k, d9zVar, (byte) 0);
                    this.k = null;
                    this.j = true;
                    if (vsg0Var.c(ui1Var, this) == wneVar) {
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
                    ui1 ui1Var2 = new ui1((kmq) this.k, d9zVar, (byte) 1);
                    this.k = null;
                    this.j = true;
                    if (vsg0Var.c(ui1Var2, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    ui1 ui1Var3 = new ui1((kmq) this.k, d9zVar, (byte) 2);
                    this.k = null;
                    this.j = true;
                    if (vsg0Var.c(ui1Var3, this) == wneVar3) {
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
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ui1 ui1Var4 = new ui1((kmq) this.k, d9zVar, (byte) 3);
                    this.k = null;
                    this.j = true;
                    if (vsg0Var.c(ui1Var4, this) == wneVar4) {
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
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ui1 ui1Var5 = new ui1((kmq) this.k, d9zVar, (byte) 4);
                    this.k = null;
                    this.j = true;
                    if (vsg0Var.c(ui1Var5, this) == wneVar5) {
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
