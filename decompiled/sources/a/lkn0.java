package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lkn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ mkn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lkn0(mkn0 mkn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mkn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mkn0 mkn0Var = this.k;
        switch (b) {
            case 0:
                lkn0 lkn0Var = new lkn0(mkn0Var, yjeVar, (byte) 0);
                lkn0Var.j = ((Boolean) obj).booleanValue();
                return lkn0Var;
            default:
                return new lkn0(mkn0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((lkn0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lkn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        byte b = this.i;
        mkn0 mkn0Var = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mkn0Var.F = z;
                if (z && ((bbyVar = mkn0Var.B) == null || !bbyVar.isActive())) {
                    mkn0Var.B = sac.V(jiu0.a(mkn0Var), new rgn0((byte) 1), null, mkn0Var.c.f22085a, new lkn0(mkn0Var, yjeVar, b2), 10);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    dgu dguVar = mkn0Var.g;
                    this.j = true;
                    if (dguVar.u(this) == wneVar2) {
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
        }
    }
}
