package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g21 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public long k;
    public Object l;
    public byte m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ diu0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(boolean z, uv1 uv1Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.n = z;
        this.o = uv1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.n;
        diu0 diu0Var = this.o;
        switch (b) {
            case 0:
                return new g21((n21) diu0Var, z, yjeVar, (byte) 0);
            case 1:
                return new g21(z, (uv1) diu0Var, yjeVar);
            default:
                return new g21((l7b0) diu0Var, z, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((g21) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x025b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0267  */
    /* JADX WARN: Code duplicated, block: B:116:0x0275  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285 A[LOOP:1: B:118:0x027f->B:120:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0298  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02be  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02dd A[LOOP:2: B:134:0x02d7->B:136:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x0303  */
    /* JADX WARN: Code duplicated, block: B:145:0x031b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0330  */
    /* JADX WARN: Code duplicated, block: B:152:0x0350  */
    /* JADX WARN: Code duplicated, block: B:154:0x0365  */
    /* JADX WARN: Code duplicated, block: B:159:0x0385 A[LOOP:5: B:157:0x037f->B:159:0x0385, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x03ac A[LOOP:6: B:161:0x03a6->B:163:0x03ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x0425 A[LOOP:7: B:165:0x03e2->B:168:0x0425, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0439  */
    /* JADX WARN: Code duplicated, block: B:192:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba A[DONT_INVERT, PHI: r0
  0x01ba: PHI (r0v33 a.gu1) = (r0v32 a.gu1), (r0v32 a.gu1), (r0v36 a.gu1), (r0v39 a.gu1) binds: [B:60:0x017a, B:62:0x018a, B:75:0x01b8, B:38:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (r4.c(r3, r39) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b5, code lost:
    
        if (r0 == r5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        if (r8.N(r0, r39) == r5) goto L80;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g21.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g21(diu0 diu0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = diu0Var;
        this.n = z;
    }
}
