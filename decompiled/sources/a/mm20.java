package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mm20 extends bnn0 implements Function2 {
    public double i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ on20 l;
    public final /* synthetic */ jdc0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm20(on20 on20Var, jdc0 jdc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = on20Var;
        this.m = jdc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new mm20(this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mm20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        double d;
        wne wneVar = wne.f39444a;
        boolean z2 = this.k;
        jdc0 jdc0Var = this.m;
        on20 on20Var = this.l;
        if (!z2) {
            z1x.P(obj);
            double dG0 = on20Var.g0(on20Var.X.i());
            boolean z3 = on20Var.u.c().f24244a;
            boolean z4 = ((a820) on20Var.D()).e.f27665a.b.p;
            double d2 = jdc0Var.b;
            if (z4) {
                d2 /= 2.0d;
            }
            this.i = dG0;
            this.j = z3;
            this.k = true;
            Object objQ = on20Var.Q(d2, dG0, this);
            if (objQ == wneVar) {
                return wneVar;
            }
            z = z3;
            d = dG0;
            obj = objQ;
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = this.j;
            double d3 = this.i;
            z1x.P(obj);
            d = d3;
            z = z5;
        }
        lm20 lm20Var = new lm20(jdc0Var, z, d, ((Number) obj).doubleValue(), (byte) 2);
        int i = on20.m1;
        on20Var.H(lm20Var);
        return Unit.f46060a;
    }
}
