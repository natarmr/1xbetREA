package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class doe extends bnn0 implements Function2 {
    public long i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doe(long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
        this.m = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        doe doeVar = new doe(this.l, this.m, yjeVar);
        doeVar.k = obj;
        return doeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((doe) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        return wne.f39444a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r7
  0x003c: PHI (r7v1 long) = (r7v2 long), (r7v5 long) binds: [B:12:0x0039, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (a.qcc.O(1000, r11) == r1) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:17:0x0049). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.k
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r11.j
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L25
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L18
            long r7 = r11.i
            a.z1x.P(r12)
            goto L49
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L1f:
            long r7 = r11.i
            a.z1x.P(r12)
            goto L3c
        L25:
            a.z1x.P(r12)
            long r7 = r11.l
        L2a:
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r7)
            r11.k = r0
            r11.i = r7
            r11.j = r6
            java.lang.Object r12 = r0.a(r12, r11)
            if (r12 != r1) goto L3c
            goto L48
        L3c:
            r11.k = r0
            r11.i = r7
            r11.j = r5
            java.lang.Object r12 = a.qcc.O(r3, r11)
            if (r12 != r1) goto L49
        L48:
            return r1
        L49:
            int r12 = r11.m
            long r9 = (long) r12
            long r9 = r9 * r3
            long r7 = r7 + r9
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: a.doe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
