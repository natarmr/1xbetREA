package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h18 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public boolean k;
    public int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h18(boolean z, yrx yrxVar, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = z;
        this.m = yrxVar;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new h18((t33) obj2, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new h18(this.k, (yrx) obj2, this.l, yjeVar);
            case 2:
                return new h18((aqf0) obj2, this.k, this.l, yjeVar, (byte) 2);
            default:
                return new h18((j9v0) obj2, yjeVar);
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
        return ((h18) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        if (r1 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014d, code lost:
    
        if (r2.f(r0, r1, r14) == r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0160, code lost:
    
        if (a.bww.T(r1, r0 - r1.f30133a.l(), r14) == r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
    
        if (a.t33.a((a.t33) r7, r3, r2, null, null, r14, 12) == r8) goto L99;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h18.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h18(Object obj, boolean z, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = z;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h18(j9v0 j9v0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.m = j9v0Var;
    }
}
