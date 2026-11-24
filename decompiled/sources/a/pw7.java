package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pw7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ t33 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw7(t33 t33Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = t33Var;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new pw7((byte) 0, this.l, yjeVar, this.k);
            case 1:
                return new pw7((byte) 1, this.l, yjeVar, this.k);
            case 2:
                return new pw7((byte) 2, this.l, yjeVar, this.k);
            case 3:
                return new pw7(this.l, this.k, yjeVar);
            default:
                return new pw7((byte) 4, this.l, yjeVar, this.k);
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
        }
        return ((pw7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r0 == r15) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r0 == r15) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        if (a.t33.a(r17.l, r0, r2, null, null, r17, 12) == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        if (a.t33.a(r0, r1, r2, null, null, r17, 12) == r15) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
    
        if (r0.f(r17, r1) == r15) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        if (r0 == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        if (r0 == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f5, code lost:
    
        if (r0 == r15) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0215, code lost:
    
        if (r0 == r15) goto L95;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pw7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw7(byte b, t33 t33Var, yje yjeVar, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = t33Var;
    }
}
