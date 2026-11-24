package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g63 extends bnn0 implements Function2 {
    public float i;
    public float j;
    public float k;
    public i050 l;
    public pz40 m;
    public SnapshotStateList n;
    public agk0 o;
    public boolean p;
    public final /* synthetic */ float q;
    public final /* synthetic */ i050 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ SnapshotStateList u;
    public final /* synthetic */ rcq0 v;
    public final /* synthetic */ a4x w;
    public final /* synthetic */ pz40 x;
    public final /* synthetic */ agk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g63(float f, i050 i050Var, float f2, float f3, SnapshotStateList snapshotStateList, rcq0 rcq0Var, a4x a4xVar, pz40 pz40Var, agk0 agk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = f;
        this.r = i050Var;
        this.s = f2;
        this.t = f3;
        this.u = snapshotStateList;
        this.v = rcq0Var;
        this.w = a4xVar;
        this.x = pz40Var;
        this.y = agk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new g63(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g63) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        float f;
        i050 i050Var;
        pz40 pz40Var;
        agk0 agk0Var;
        float f2;
        float f3;
        SnapshotStateList snapshotStateList;
        wne wneVar = wne.f39444a;
        boolean z = this.p;
        float f4 = this.s;
        float f5 = this.t;
        SnapshotStateList snapshotStateList2 = this.u;
        if (!z) {
            z1x.P(obj);
            f = this.q / 2.0f;
            i050Var = this.r;
            this.l = i050Var;
            pz40Var = this.x;
            this.m = pz40Var;
            this.n = snapshotStateList2;
            agk0Var = this.y;
            this.o = agk0Var;
            this.i = f;
            this.j = f4;
            this.k = f5;
            this.p = true;
            if (i050Var.d(this) == wneVar) {
                return wneVar;
            }
            f2 = f4;
            f3 = f5;
            snapshotStateList = snapshotStateList2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = this.k;
            f2 = this.j;
            f = this.i;
            agk0Var = this.o;
            snapshotStateList = this.n;
            pz40Var = this.m;
            i050Var = this.l;
            z1x.P(obj);
        }
        try {
            if (pz40Var.getValue() == olx.c) {
                Unit unit = Unit.f46060a;
                i050Var.c(null);
                return unit;
            }
            float fC = l1e0.c(si30.b(f2), -f3, f3);
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                snapshotStateList.set(i, new Float(((Number) snapshotStateList.get(i)).floatValue() + fC));
            }
            agk0Var.m(agk0Var.l() + fC);
            i050Var.c(null);
            a4x a4xVar = this.w;
            rcq0 rcq0Var = this.v;
            if (f4 < 0.0f) {
                if (((Number) snapshotStateList2.get(0)).floatValue() <= f - (3.0f * f5)) {
                    snapshotStateList2.remove(0);
                    snapshotStateList2.add(new Float(((Number) snapshotStateList2.get(snapshotStateList2.size() - 1)).floatValue() + f5));
                    int size2 = a4xVar.size();
                    cgk0 cgk0Var = rcq0Var.f30253a;
                    int iL = (cgk0Var.l() + 1) % size2;
                    if (iL < 0) {
                        iL += size2;
                    }
                    cgk0Var.m(iL);
                }
            } else {
                if (((Number) snapshotStateList2.get(q3d.i(snapshotStateList2))).floatValue() >= (3.0f * f5) + f) {
                    snapshotStateList2.remove(snapshotStateList2.size() - 1);
                    snapshotStateList2.add(0, new Float(((Number) snapshotStateList2.get(0)).floatValue() - f5));
                    int size3 = a4xVar.size();
                    cgk0 cgk0Var2 = rcq0Var.f30253a;
                    int iL2 = (cgk0Var2.l() - 1) % size3;
                    if (iL2 < 0) {
                        iL2 += size3;
                    }
                    cgk0Var2.m(iL2);
                }
            }
            return Unit.f46060a;
        } catch (Throwable th) {
            i050Var.c(null);
            throw th;
        }
    }
}
