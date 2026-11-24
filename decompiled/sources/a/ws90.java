package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ws90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ int l;
    public final /* synthetic */ float m;
    public final /* synthetic */ j73 n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws90(xcz xczVar, pz40 pz40Var, int i, float f, j73 j73Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = xczVar;
        this.o = pz40Var;
        this.l = i;
        this.m = f;
        this.n = j73Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                ws90 ws90Var = new ws90(this.k, this.l, this.m, this.n, yjeVar);
                ws90Var.o = obj;
                return ws90Var;
            default:
                return new ws90(this.k, (pz40) this.o, this.l, this.m, this.n, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ws90) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ws90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r9.b(r1, r8, r14) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (a.hhm0.n(0.0f, r1, r14.n, r2, r14, 4) == r8) goto L43;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ws90.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws90(xcz xczVar, int i, float f, j73 j73Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = xczVar;
        this.l = i;
        this.m = f;
        this.n = j73Var;
    }
}
