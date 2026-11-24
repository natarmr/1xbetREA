package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public byte k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu3(long j, inn0 inn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.j = j;
        this.l = inn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new hu3((diu0) obj2, yjeVar, (byte) 0);
            case 1:
                return new hu3((diu0) obj2, yjeVar, (byte) 1);
            case 2:
                return new hu3((diu0) obj2, yjeVar, (byte) 2);
            case 3:
                return new hu3((tu7) obj2, this.j, yjeVar, (byte) 3);
            case 4:
                return new hu3((sdn) obj2, this.j, yjeVar, (byte) 4);
            case 5:
                return new hu3((diu0) obj2, yjeVar, (byte) 5);
            case 6:
                return new hu3((ekf0) obj2, this.j, yjeVar, (byte) 6);
            case 7:
                return new hu3(this.j, (inn0) obj2, yjeVar);
            default:
                return new hu3((diu0) obj2, yjeVar, (byte) 8);
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
            case 7:
                break;
        }
        return ((hu3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0439  */
    /* JADX WARN: Code duplicated, block: B:190:0x046e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0473  */
    /* JADX WARN: Code duplicated, block: B:196:0x0478  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0295, code lost:
    
        if (r1 == r0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02f5, code lost:
    
        if (r3.m(r23) == r0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0377, code lost:
    
        if (r6.m(r23) == r4) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x049f, code lost:
    
        if (kotlin.Unit.f46060a == r0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (a.qcc.O(8, r23) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        if (a.t33.a(r0, r3, r2, null, null, r23, 12) == r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b9, code lost:
    
        if (r0 == r14) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0224, code lost:
    
        if (a.slb.N(r2, r23) == r0) goto L91;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hu3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu3(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu3(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.j = j;
    }
}
