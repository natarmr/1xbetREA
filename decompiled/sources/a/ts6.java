package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ts6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public double j;
    public byte k;
    public final /* synthetic */ diu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts6(aqf0 aqf0Var, double d, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.l = aqf0Var;
        this.j = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                return new ts6(diu0Var, yjeVar, (byte) 0);
            case 1:
                return new ts6(diu0Var, yjeVar, (byte) 1);
            case 2:
                return new ts6(diu0Var, yjeVar, (byte) 2);
            case 3:
                return new ts6(diu0Var, yjeVar, (byte) 3);
            default:
                return new ts6((aqf0) diu0Var, this.j, yjeVar);
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
        return ((ts6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0231  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b8  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0287, code lost:
    
        if (r2 == r1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0379, code lost:
    
        if (r0.N(r1, r3, r6, r6, r27) == r8) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r1.f(a.ey5.f8610a, r27) == r0) goto L23;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ts6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts6(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }
}
