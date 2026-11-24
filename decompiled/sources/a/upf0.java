package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class upf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public vqf0 j;
    public byte k;
    public final /* synthetic */ aqf0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upf0(aqf0 aqf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = aqf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        aqf0 aqf0Var = this.l;
        switch (b) {
            case 0:
                return new upf0(aqf0Var, yjeVar, (byte) 0);
            default:
                return new upf0(aqf0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((upf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[PHI: r1
  0x008e: PHI (r1v12 a.vqf0) = (r1v11 a.vqf0), (r1v17 a.vqf0) binds: [B:26:0x008b, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:33:0x00b0->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r0.f(r1, r17) == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015c, code lost:
    
        if (r1.f(a.my5.f22588a, r17) == r11) goto L71;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.upf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
