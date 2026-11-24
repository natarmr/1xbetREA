package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x4w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ z4w k;
    public final /* synthetic */ n3w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4w(n3w n3wVar, z4w z4wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = n3wVar;
        this.k = z4wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        z4w z4wVar = this.k;
        n3w n3wVar = this.l;
        switch (b) {
            case 0:
                return new x4w(z4wVar, n3wVar, yjeVar, (byte) 0);
            case 1:
                return new x4w(z4wVar, n3wVar, yjeVar, (byte) 1);
            case 2:
                return new x4w(z4wVar, n3wVar, yjeVar, (byte) 2);
            default:
                return new x4w(n3wVar, z4wVar, yjeVar);
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
        return ((x4w) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (a.qjj.d0(r0, r1, r17) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
    
        if (a.qjj.d0(r1, r10, r17) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        if (a.qjj.d0(r3, r4, r17) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        if (a.qjj.d0(r2, r3, r17) == r0) goto L83;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x4w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4w(z4w z4wVar, n3w n3wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z4wVar;
        this.l = n3wVar;
    }
}
