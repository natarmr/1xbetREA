package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fdi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ldi0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdi0(ldi0 ldi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = ldi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ldi0 ldi0Var = this.l;
        switch (b) {
            case 0:
                fdi0 fdi0Var = new fdi0(ldi0Var, yjeVar, (byte) 0);
                fdi0Var.k = obj;
                return fdi0Var;
            case 1:
                fdi0 fdi0Var2 = new fdi0(ldi0Var, yjeVar, (byte) 1);
                fdi0Var2.k = obj;
                return fdi0Var2;
            default:
                fdi0 fdi0Var3 = new fdi0(ldi0Var, yjeVar, (byte) 2);
                fdi0Var3.k = obj;
                return fdi0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fdi0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fdi0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fdi0) create((ynb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ldi0 ldi0Var = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Long l = new Long(ldi0Var.f.a());
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(l, this) == wneVar) {
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
                Pair pair = (Pair) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    e7a e7aVar = (e7a) pair.f46059a;
                    if (e7aVar instanceof d7a) {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        bai0 bai0Var = new bai0(ldi0Var, e7aVar, null, (byte) 2);
                        this.k = null;
                        this.j = true;
                        if (qjj.d0(vs10Var, bai0Var, this) == wneVar2) {
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
            default:
                ynb0 ynb0Var = (ynb0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.k = null;
                this.j = true;
                Object objG = ldi0Var.G(ynb0Var, this);
                return objG == wneVar3 ? wneVar3 : objG;
        }
    }
}
