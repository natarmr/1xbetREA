package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class b63 extends bnn0 implements xdr {
    public i050 i;
    public b8m0 j;
    public Object k;
    public pz40 l;
    public agk0 m;
    public pz40 n;
    public byte o;
    public final /* synthetic */ a4x p;
    public final /* synthetic */ pz40 q;
    public final /* synthetic */ agk0 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ t33 u;
    public final /* synthetic */ cfq v;
    public final /* synthetic */ i050 w;
    public final /* synthetic */ SnapshotStateList x;
    public final /* synthetic */ agk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b63(a4x a4xVar, pz40 pz40Var, agk0 agk0Var, float f, float f2, t33 t33Var, cfq cfqVar, i050 i050Var, SnapshotStateList snapshotStateList, agk0 agk0Var2, yje yjeVar) {
        super(3, yjeVar);
        this.p = a4xVar;
        this.q = pz40Var;
        this.r = agk0Var;
        this.s = f;
        this.t = f2;
        this.u = t33Var;
        this.v = cfqVar;
        this.w = i050Var;
        this.x = snapshotStateList;
        this.y = agk0Var2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        SnapshotStateList snapshotStateList = this.x;
        agk0 agk0Var = this.y;
        return new b63(this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, snapshotStateList, agk0Var, (yje) obj3).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0131 A[Catch: all -> 0x002b, LOOP:0: B:59:0x012f->B:60:0x0131, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0026, B:65:0x016e, B:58:0x012a, B:60:0x0131, B:61:0x0151), top: B:70:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r0 == r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (r0 == r7) goto L63;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
