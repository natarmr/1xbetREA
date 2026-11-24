package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y0b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public long k;
    public Object l;
    public byte m;
    public final /* synthetic */ f1b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0b0(long j, f1b0 f1b0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.k = j;
        this.n = f1b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f1b0 f1b0Var = this.n;
        switch (b) {
            case 0:
                return new y0b0(f1b0Var, yjeVar, (byte) 0);
            case 1:
                return new y0b0(f1b0Var, yjeVar, (byte) 1);
            case 2:
                return new y0b0(f1b0Var, yjeVar, (byte) 2);
            default:
                y0b0 y0b0Var = new y0b0(this.k, f1b0Var, yjeVar);
                y0b0Var.l = obj;
                return y0b0Var;
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
        }
        return ((y0b0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:156:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x008a A[LOOP:0: B:15:0x004c->B:20:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0295, code lost:
    
        if (a.qcc.O(r7 - r12, r20) == r11) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (a.qcc.O(r3, r20) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        if (a.qcc.O(r7 - r12, r20) == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d2, code lost:
    
        if (a.qcc.O(r7 - r12, r20) == r11) goto L100;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y0b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0b0(f1b0 f1b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = f1b0Var;
    }
}
