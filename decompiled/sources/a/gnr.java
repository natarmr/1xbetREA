package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class gnr implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f11601a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ t33 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ agk0 e;

    public gnr(float f, vne vneVar, t33 t33Var, pz40 pz40Var, agk0 agk0Var) {
        this.f11601a = f;
        this.b = vneVar;
        this.c = t33Var;
        this.d = pz40Var;
        this.e = agk0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Pair pair = (Pair) obj;
        float fFloatValue = ((Number) pair.b).floatValue();
        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
        float fC = l1e0.c(fFloatValue / this.f11601a, 0.0f, 1.0f);
        if (!zBooleanValue && fFloatValue != 0.0f) {
            float f = this.f11601a;
            if (fFloatValue != f) {
                qjj.W(this.b, null, null, new fnr(this.c, this.d, fC, this.e, f, null), 3);
                return Unit.f46060a;
            }
        }
        Object objF = this.c.f(yjeVar, new Float(fC));
        return objF == wne.f39444a ? objF : Unit.f46060a;
    }
}
