package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class vmq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmq0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new vmq0((wmq0) obj2, yjeVar, (byte) 0);
            case 1:
                return new vmq0((xoq0) obj2, yjeVar, (byte) 1);
            case 2:
                return new vmq0((pzu) obj2, yjeVar, (byte) 2);
            case 3:
                return new vmq0((tzt0) obj2, yjeVar, (byte) 3);
            case 4:
                return new vmq0((lbu0) obj2, yjeVar, (byte) 4);
            case 5:
                return new vmq0((d7v0) obj2, yjeVar, (byte) 5);
            case 6:
                return new vmq0((vkr0) obj2, yjeVar, (byte) 6);
            case 7:
                return new vmq0((buv0) obj2, yjeVar, (byte) 7);
            default:
                return new vmq0((rzv0) obj2, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((vmq0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vmq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0200 A[LOOP:2: B:99:0x01fa->B:101:0x0200, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:111:0x0250  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258  */
    /* JADX WARN: Code duplicated, block: B:116:0x026b  */
    /* JADX WARN: Code duplicated, block: B:308:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:309:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:332:0x094b  */
    /* JADX WARN: Code duplicated, block: B:339:0x097d  */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02dd, code lost:
    
        if (a.qcc.P(r3, r21) == r2) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ed, code lost:
    
        if (r1 == r2) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r1 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03db, code lost:
    
        if (r1 == r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0445, code lost:
    
        if (kotlin.Unit.f46060a == r11) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x06c2, code lost:
    
        if (r2 == r3) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x08f0, code lost:
    
        if (kotlin.Unit.f46060a == r3) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0953, code lost:
    
        if (a.qcc.O(3500, r21) == r0) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        if (r1 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (r0 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        if (r0 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r3 == r0) goto L90;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vmq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
