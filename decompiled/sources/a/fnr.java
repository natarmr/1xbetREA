package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fnr extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ agk0 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnr(t33 t33Var, pz40 pz40Var, float f, agk0 agk0Var, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = pz40Var;
        this.l = f;
        this.m = agk0Var;
        this.n = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new fnr(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fnr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        uts0 uts0VarM0;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            pz40 pz40Var = this.k;
            fah0 fah0Var = (fah0) pz40Var.getValue();
            float f = 0.0f;
            if (fah0Var != null && !(fah0Var instanceof z9h0)) {
                if (!(fah0Var instanceof cah0)) {
                    t9f.b();
                    return null;
                }
                f = 1.0f;
            }
            Float f2 = new Float(f);
            fah0 fah0Var2 = (fah0) pz40Var.getValue();
            float f3 = this.l;
            if (fah0Var2 == null || (fah0Var2 instanceof z9h0)) {
                uts0VarM0 = ro4.m0((int) (300.0f * f3), 0, null, 6);
            } else {
                if (!(fah0Var2 instanceof cah0)) {
                    t9f.b();
                    return null;
                }
                uts0VarM0 = ro4.m0((int) ((1.0f - f3) * 300.0f), 0, null, 6);
            }
            uts0 uts0Var = uts0VarM0;
            ny2 ny2Var = new ny2(this.m, pz40Var, this.n, (byte) 4);
            this.i = true;
            if (t33.a(this.j, f2, uts0Var, null, ny2Var, this, 4) == wneVar) {
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
    }
}
