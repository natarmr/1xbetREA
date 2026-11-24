package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class fwk0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwk0(i3t0 i3t0Var, Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = i3t0Var;
        this.l = obj;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new fwk0((iwk0) this.k, (kr5) obj, yjeVar, (byte) 0);
            case 1:
                return new fwk0((b0p0) obj, yjeVar, (byte) 1);
            case 2:
                return new fwk0((lkq0) this.k, (a95) obj, yjeVar, (byte) 2);
            case 3:
                return new fwk0((m2r0) obj, yjeVar, (byte) 3);
            case 4:
                return new fwk0((fir0) obj, yjeVar, (byte) 4);
            case 5:
                return new fwk0((ltr0) obj, yjeVar, (byte) 5);
            case 6:
                return new fwk0((xot0) obj, yjeVar, (byte) 6);
            default:
                return new fwk0((dyu0) obj, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((fwk0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x025f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0278  */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180 A[Catch: CancellationException -> 0x010a, TRY_ENTER, TryCatch #5 {CancellationException -> 0x010a, blocks: (B:38:0x0103, B:80:0x018e, B:82:0x01b1, B:88:0x01ba, B:89:0x01bd, B:77:0x0180, B:81:0x0191, B:86:0x01b8), top: B:226:0x00f9, inners: #3, #4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a0, code lost:
    
        if (r1 == r0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0495, code lost:
    
        if (a.qcc.P(r0, r25) == r10) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0565, code lost:
    
        if (r0.a(r2, r25) == r1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x059e, code lost:
    
        if (r1.a(r0, r25) == r4) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05a9, code lost:
    
        if (r1.a(r0, r25) == r4) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
    
        if (r0 == r7) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.AutoCloseable] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fwk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwk0(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
