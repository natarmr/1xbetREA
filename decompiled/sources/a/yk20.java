package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yk20 extends bnn0 implements Function2 {
    public tg20 i;
    public double j;
    public double k;
    public double l;
    public boolean m;
    public int n;
    public byte o;
    public final /* synthetic */ ln20 p;
    public final /* synthetic */ ql5 q;
    public final /* synthetic */ double r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk20(ln20 ln20Var, ql5 ql5Var, double d, yje yjeVar) {
        super(2, yjeVar);
        this.p = ln20Var;
        this.q = ql5Var;
        this.r = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new yk20(this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r7 == r3) goto L34;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yk20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
