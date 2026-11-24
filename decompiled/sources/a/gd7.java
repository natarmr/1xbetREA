package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gd7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public int j;
    public int k;
    public byte l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd7(xk80 xk80Var, int i, xcz xczVar, int i2, cgk0 cgk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.m = xk80Var;
        this.j = i;
        this.n = xczVar;
        this.k = i2;
        this.o = cgk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new gd7((kd7) obj2, yjeVar);
            case 1:
                return new gd7((x9v0) this.n, (pn10) obj2, yjeVar, (byte) 1);
            case 2:
                return new gd7((x9v0) this.n, (bo10) obj2, yjeVar, (byte) 2);
            default:
                return new gd7((xk80) this.m, this.j, (xcz) this.n, this.k, (cgk0) obj2, yjeVar);
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
        return ((gd7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240  */
    /* JADX WARN: Code duplicated, block: B:157:0x0347  */
    /* JADX WARN: Code duplicated, block: B:161:0x035f  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03a6, code lost:
    
        if (a.qcc.O(1000, r40) == r13) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r2.f(r0, r3, r40) == r1) goto L18;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gd7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd7(kd7 kd7Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.o = kd7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd7(x9v0 x9v0Var, diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = x9v0Var;
        this.o = diu0Var;
    }
}
