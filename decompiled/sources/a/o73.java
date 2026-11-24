package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class o73 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ zsf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o73(t33 t33Var, zsf zsfVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = zsfVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zsf zsfVar = this.l;
        t33 t33Var = this.k;
        switch (b) {
            case 0:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 0);
            case 1:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 1);
            case 2:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 2);
            case 3:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 3);
            case 4:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 4);
            case 5:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 5);
            default:
                return new o73(t33Var, zsfVar, yjeVar, (byte) 6);
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
        }
        return ((o73) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        if (a.t33.a(r17.k, r2, r0, null, null, r17, 12) == r8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (a.t33.a(r17.k, r1, r2, null, null, r17, 12) == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (a.t33.a(r17.k, r1, r2, null, null, r17, 12) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (a.t33.a(r17.k, r1, r2, null, null, r17, 12) == r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bb, code lost:
    
        if (a.t33.a(r17.k, r1, r2, null, null, r17, 12) == r8) goto L91;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
