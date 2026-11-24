package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ej20 extends bnn0 implements Function1 {
    public boolean i;
    public Object j;
    public double k;
    public double l;
    public byte m;
    public final /* synthetic */ on20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej20(on20 on20Var, yje yjeVar) {
        super(1, yjeVar);
        this.n = on20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new ej20(this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ej20) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r6.M0((a.vf7) r5, r2, r17) == r1) goto L32;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ej20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
