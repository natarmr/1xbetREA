package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y0f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public final /* synthetic */ long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0f(g45 g45Var, String str, long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.m = g45Var;
        this.n = str;
        this.k = j;
        this.j = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new y0f((g45) this.m, (String) obj2, this.k, this.j, yjeVar);
            case 1:
                boolean z = this.l;
                y0f y0fVar = new y0f(this.k, (pzu) obj2, z, yjeVar);
                y0fVar.m = obj;
                return y0fVar;
            default:
                return new y0f(this.l, (v3b0) this.m, this.k, (kic0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y0f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((y0f) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y0f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0 == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r0 == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:
    
        if (a.slb.Q(r6, r0, r19) == r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return r12;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y0f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0f(long j, pzu pzuVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.k = j;
        this.n = pzuVar;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0f(boolean z, v3b0 v3b0Var, long j, kic0 kic0Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = z;
        this.m = v3b0Var;
        this.k = j;
        this.n = kic0Var;
    }
}
