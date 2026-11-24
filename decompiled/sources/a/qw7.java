package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qw7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public zsf j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ t33 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw7(t33 t33Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = t33Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                qw7 qw7Var = new qw7(this.m, yjeVar, (byte) 0);
                qw7Var.l = obj;
                return qw7Var;
            default:
                qw7 qw7Var2 = new qw7(this.m, yjeVar, (byte) 1);
                qw7Var2.l = obj;
                return qw7Var2;
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
        return ((qw7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zsf zsfVar;
        zsf zsfVar2;
        byte b = this.i;
        t33 t33Var = this.m;
        yje yjeVar = null;
        switch (b) {
            case 0:
                vne vneVar = (vne) this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    zsfVar = new zsf(0.0f, 0.0f, 0.58f, 1.0f);
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zsfVar = this.j;
                    z1x.P(obj);
                }
                while (d5c.R(vneVar)) {
                    z560 z560Var = z560.b;
                    o73 o73Var = new o73(t33Var, zsfVar, yjeVar, (byte) 2);
                    this.l = vneVar;
                    this.j = zsfVar;
                    this.k = true;
                    if (qjj.d0(z560Var, o73Var, this) == wneVar) {
                        return wneVar;
                    }
                }
                return Unit.f46060a;
            default:
                vne vneVar2 = (vne) this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    zsfVar2 = new zsf(0.0f, 0.0f, 0.58f, 1.0f);
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zsfVar2 = this.j;
                    z1x.P(obj);
                }
                while (d5c.R(vneVar2)) {
                    z560 z560Var2 = z560.b;
                    o73 o73Var2 = new o73(t33Var, zsfVar2, yjeVar, (byte) 3);
                    this.l = vneVar2;
                    this.j = zsfVar2;
                    this.k = true;
                    if (qjj.d0(z560Var2, o73Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                }
                return Unit.f46060a;
        }
    }
}
