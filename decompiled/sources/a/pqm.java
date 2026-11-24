package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pqm extends bnn0 implements Function2 {
    public final /* synthetic */ rwh0 i;
    public final /* synthetic */ vne j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ Function0 o;
    public final /* synthetic */ pz40 p;
    public final /* synthetic */ agk0 q;
    public final /* synthetic */ agk0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqm(rwh0 rwh0Var, vne vneVar, t33 t33Var, t33 t33Var2, int i, Function0 function0, Function0 function1, pz40 pz40Var, agk0 agk0Var, agk0 agk0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = rwh0Var;
        this.j = vneVar;
        this.k = t33Var;
        this.l = t33Var2;
        this.m = i;
        this.n = function0;
        this.o = function1;
        this.p = pz40Var;
        this.q = agk0Var;
        this.r = agk0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pqm(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pqm) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        c4m0 c4m0VarW;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        pz40 pz40Var = this.p;
        bby bbyVar = (bby) pz40Var.getValue();
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        t33 t33Var = this.l;
        t33 t33Var2 = this.k;
        mr0 mr0Var = new mr0(t33Var, t33Var2, this.q, this.r, (byte) 9);
        int iOrdinal = this.i.ordinal();
        vne vneVar = this.j;
        if (iOrdinal == 0) {
            vneVar.getClass();
            t33Var2.getClass();
            t33Var.getClass();
            Function0 function0 = this.n;
            function0.getClass();
            c4m0VarW = qjj.W(vneVar, null, null, new iq3(t33Var2, t33Var, this.m, function0, mr0Var, null), 3);
        } else if (iOrdinal == 1) {
            vneVar.getClass();
            t33Var2.getClass();
            t33Var.getClass();
            c4m0VarW = qjj.W(vneVar, null, null, new xvh0(t33Var2, t33Var, mr0Var, yjeVar, (byte) 1), 3);
        } else if (iOrdinal == 2) {
            vneVar.getClass();
            t33Var2.getClass();
            t33Var.getClass();
            c4m0VarW = qjj.W(vneVar, null, null, new xvh0(t33Var2, t33Var, mr0Var, yjeVar, (byte) 2), 3);
        } else if (iOrdinal == 3) {
            vneVar.getClass();
            t33Var2.getClass();
            t33Var.getClass();
            c4m0VarW = qjj.W(vneVar, null, null, new xvh0(t33Var2, t33Var, mr0Var, yjeVar, (byte) 0), 3);
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            vneVar.getClass();
            t33Var2.getClass();
            t33Var.getClass();
            Function0 function1 = this.o;
            function1.getClass();
            c4m0VarW = qjj.W(vneVar, null, null, new pnd0(t33Var2, t33Var, function1, mr0Var, null, (byte) 10), 3);
        }
        pz40Var.setValue(c4m0VarW);
        return Unit.f46060a;
    }
}
