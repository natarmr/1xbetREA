package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y4j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public long j;
    public byte k;
    public /* synthetic */ Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4j(cyh cyhVar, v0 v0Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = cyhVar;
        this.r = v0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                y4j y4jVar = new y4j((kki) this.n, this.j, yjeVar);
                y4jVar.l = obj;
                return y4jVar;
            default:
                y4j y4jVar2 = new y4j((cyh) this.q, (v0) this.r, yjeVar);
                y4jVar2.l = obj;
                return y4jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y4j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y4j) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:154:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0218  */
    /* JADX WARN: Code duplicated, block: B:81:0x0220  */
    /* JADX WARN: Code duplicated, block: B:83:0x0240 A[LOOP:1: B:82:0x023e->B:83:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0287  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b4  */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03ff, code lost:
    
        if (a.qcc.O(600, r22) == r3) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02cf, code lost:
    
        if (r0.e.m(r22, r3) == r8) goto L98;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0220, please report this as an issue */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y4j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4j(kki kkiVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.n = kkiVar;
        this.j = j;
    }
}
