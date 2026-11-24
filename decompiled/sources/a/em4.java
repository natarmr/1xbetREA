package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class em4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em4(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.m;
        switch (b) {
            case 0:
                return new em4((im4) this.k, (ru4) this.l, (f8) obj, yjeVar, (byte) 0);
            case 1:
                return new em4((sip) this.k, (ali) this.l, (LinkedHashMap) obj, yjeVar, (byte) 1);
            case 2:
                return new em4((d7f0) this.l, (tu4) obj, yjeVar);
            case 3:
                return new em4((k5k0) obj, yjeVar);
            case 4:
                return new em4((bxq0) this.k, (hhb0) this.l, (c050) obj, yjeVar, (byte) 4);
            default:
                return new em4((String) this.k, (dyu0) this.l, (axu0) obj, yjeVar, (byte) 5);
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
        }
        return ((em4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:168:0x0307  */
    /* JADX WARN: Code duplicated, block: B:175:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e A[LOOP:0: B:69:0x012f->B:80:0x015e, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ea, code lost:
    
        if (r0 == r8) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022f, code lost:
    
        if (r0 == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025b, code lost:
    
        if (r0 == r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x030f, code lost:
    
        if (r0.g0(false, r21) == r8) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r3.R(r9, r0, r2, r21) == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r3.S(r9, r0, r2, r21) == r8) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.em4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(k5k0 k5k0Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 3;
        this.m = k5k0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(d7f0 d7f0Var, tu4 tu4Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 2;
        this.l = d7f0Var;
        this.m = tu4Var;
    }
}
