package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class x5n extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5n(float f, float f2, pvh0 pvh0Var, y1h0 y1h0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = f;
        this.l = f2;
        this.m = pvh0Var;
        this.n = y1h0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new x5n((t33) this.m, this.k, (t33) this.n, this.l, yjeVar);
            default:
                return new x5n(this.k, this.l, (pvh0) this.m, (y1h0) this.n, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((x5n) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r0 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        if (((a.t33) r2).f(r16, r3) == r1) goto L47;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5n(t33 t33Var, float f, t33 t33Var2, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.m = t33Var;
        this.k = f;
        this.n = t33Var2;
        this.l = f2;
    }
}
