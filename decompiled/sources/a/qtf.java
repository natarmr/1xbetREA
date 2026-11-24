package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qtf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtf(boolean z, boolean z2, t33 t33Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.k = z;
        this.m = z2;
        this.l = t33Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new qtf(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new qtf(this.k, this.l, this.m, yjeVar, (byte) 1);
            default:
                return new qtf(this.k, this.m, this.l, yjeVar);
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
        return ((qtf) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (a.t33.a(r16.l, r0, r2, null, null, r16, 12) == r15) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r6.f(r16, r0) == r15) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r6.f(r16, r0) == r15) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (a.t33.a(r16.l, r0, r2, null, null, r16, 12) == r15) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (r6.f(r16, r0) == r15) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0116, code lost:
    
        if (r6.f(r16, r0) == r15) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0142, code lost:
    
        if (a.t33.a(r16.l, r0, r2, null, null, r16, 12) == r15) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0150, code lost:
    
        if (r6.f(r16, r0) == r15) goto L83;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qtf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtf(boolean z, t33 t33Var, boolean z2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = t33Var;
        this.m = z2;
    }
}
