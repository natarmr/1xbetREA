package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qkc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public long j;
    public byte k;
    public /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc0(rkc0 rkc0Var, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.m = rkc0Var;
        this.j = j;
        this.l = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new qkc0((rkc0) this.m, this.j, this.l, yjeVar);
            default:
                qkc0 qkc0Var = new qkc0((sch0) this.m, yjeVar);
                qkc0Var.l = ((g6u0) obj).f10786a;
                return qkc0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qkc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                long j = ((g6u0) obj).f10786a;
                qkc0 qkc0Var = new qkc0((sch0) this.m, (yje) obj2);
                qkc0Var.l = j;
                return qkc0Var.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        if (r15 == r14) goto L49;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qkc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc0(sch0 sch0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = sch0Var;
    }
}
