package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class z3d implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t33 f43712a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public z3d(t33 t33Var, long j, long j2) {
        this.f43712a = t33Var;
        this.b = j;
        this.c = j2;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Float f = (Float) obj;
        long j = this.c;
        long j2 = this.b;
        t33 t33Var = this.f43712a;
        if (f != null) {
            Object objF = t33Var.f(yjeVar, new y3d(fbc.P(f.floatValue(), j2, j)));
            return objF == wne.f39444a ? objF : Unit.f46060a;
        }
        long j3 = ((y3d) t33Var.d()).f41946a;
        if (sac.N(j3, j2) < sac.N(j3, j)) {
            j = j2;
        }
        if (h2t0.a(((y3d) ((hgk0) t33Var.e).getValue()).f41946a, j)) {
            return Unit.f46060a;
        }
        Object objF2 = t33Var.f(yjeVar, new y3d(j));
        return objF2 == wne.f39444a ? objF2 : Unit.f46060a;
    }
}
