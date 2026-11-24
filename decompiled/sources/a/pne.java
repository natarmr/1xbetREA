package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pne extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pne(long j, long j2, long j3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = j;
        this.n = j2;
        this.o = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                pne pneVar = new pne(this.m, this.n, this.o, yjeVar, (byte) 0);
                pneVar.l = obj;
                return pneVar;
            default:
                pne pneVar2 = new pne(this.m, this.n, this.o, yjeVar, (byte) 1);
                pneVar2.l = obj;
                return pneVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((pne) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r3
  0x0047: PHI (r3v7 long) = (r3v8 long), (r3v11 long) binds: [B:15:0x0044, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[PHI: r3
  0x0091: PHI (r3v1 long) = (r3v2 long), (r3v5 long) binds: [B:34:0x008e, B:29:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (a.qcc.O(r9, r13) == r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (a.qcc.O(r9, r13) == r11) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:20:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009b -> B:39:0x009f). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.i
            long r1 = r13.n
            long r3 = r13.m
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = 2
            long r9 = r13.o
            switch(r0) {
                case 0: goto L5a;
                default: goto L10;
            }
        L10:
            java.lang.Object r0 = r13.l
            a.kmq r0 = (a.kmq) r0
            a.wne r11 = a.wne.f39444a
            byte r12 = r13.k
            if (r12 == 0) goto L2e
            if (r12 == r7) goto L28
            if (r12 != r8) goto L24
            long r3 = r13.j
            a.z1x.P(r14)
            goto L55
        L24:
            a.jf4.n(r6)
            goto L59
        L28:
            long r3 = r13.j
            a.z1x.P(r14)
            goto L47
        L2e:
            a.z1x.P(r14)
        L31:
            int r14 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r14 < 0) goto L57
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r3)
            r13.l = r0
            r13.j = r3
            r13.k = r7
            java.lang.Object r14 = r0.a(r14, r13)
            if (r14 != r11) goto L47
            goto L53
        L47:
            r13.l = r0
            r13.j = r3
            r13.k = r8
            java.lang.Object r14 = a.qcc.O(r9, r13)
            if (r14 != r11) goto L55
        L53:
            r5 = r11
            goto L59
        L55:
            long r3 = r3 - r9
            goto L31
        L57:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L59:
            return r5
        L5a:
            java.lang.Object r0 = r13.l
            a.kmq r0 = (a.kmq) r0
            a.wne r11 = a.wne.f39444a
            byte r12 = r13.k
            if (r12 == 0) goto L78
            if (r12 == r7) goto L72
            if (r12 != r8) goto L6e
            long r3 = r13.j
            a.z1x.P(r14)
            goto L9f
        L6e:
            a.jf4.n(r6)
            goto La3
        L72:
            long r3 = r13.j
            a.z1x.P(r14)
            goto L91
        L78:
            a.z1x.P(r14)
        L7b:
            int r14 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r14 < 0) goto La1
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r3)
            r13.l = r0
            r13.j = r3
            r13.k = r7
            java.lang.Object r14 = r0.a(r14, r13)
            if (r14 != r11) goto L91
            goto L9d
        L91:
            r13.l = r0
            r13.j = r3
            r13.k = r8
            java.lang.Object r14 = a.qcc.O(r9, r13)
            if (r14 != r11) goto L9f
        L9d:
            r5 = r11
            goto La3
        L9f:
            long r3 = r3 - r9
            goto L7b
        La1:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        La3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pne.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
