package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m9v extends bnn0 implements Function2 {
    public final /* synthetic */ l7m0 i;
    public final /* synthetic */ SnapshotStateList j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ pz40 m;
    public final /* synthetic */ agk0 n;
    public final /* synthetic */ agk0 o;
    public final /* synthetic */ a4x p;
    public final /* synthetic */ t33 q;
    public final /* synthetic */ t33 r;
    public final /* synthetic */ t33 s;
    public final /* synthetic */ t33 t;
    public final /* synthetic */ eav u;
    public final /* synthetic */ vne v;
    public final /* synthetic */ pz40 w;
    public final /* synthetic */ pz40 x;
    public final /* synthetic */ pz40 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9v(l7m0 l7m0Var, SnapshotStateList snapshotStateList, int i, int i2, pz40 pz40Var, agk0 agk0Var, agk0 agk0Var2, a4x a4xVar, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, eav eavVar, vne vneVar, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, yje yjeVar) {
        super(2, yjeVar);
        this.i = l7m0Var;
        this.j = snapshotStateList;
        this.k = i;
        this.l = i2;
        this.m = pz40Var;
        this.n = agk0Var;
        this.o = agk0Var2;
        this.p = a4xVar;
        this.q = t33Var;
        this.r = t33Var2;
        this.s = t33Var3;
        this.t = t33Var4;
        this.u = eavVar;
        this.v = vneVar;
        this.w = pz40Var2;
        this.x = pz40Var3;
        this.y = pz40Var4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new m9v(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m9v) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (!((Boolean) this.i.getValue()).booleanValue()) {
            return Unit.f46060a;
        }
        Pair pair = new Pair(new Integer(this.k), Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.j;
        snapshotStateList.add(pair);
        snapshotStateList.add(new Pair(new Integer(this.l), Boolean.TRUE));
        pz40 pz40Var = this.w;
        pz40 pz40Var2 = this.x;
        pz40 pz40Var3 = this.y;
        eav eavVar = this.u;
        aac.a0(this.j, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, eavVar, new enm((Object) pz40Var, (Object) pz40Var2, (Object) pz40Var3, (Object) eavVar, (byte) 9), this.v);
        return Unit.f46060a;
    }
}
