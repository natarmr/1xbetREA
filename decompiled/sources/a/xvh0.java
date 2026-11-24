package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xvh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ mr0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvh0(t33 t33Var, t33 t33Var2, mr0 mr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = t33Var2;
        this.m = mr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new xvh0(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new xvh0(this.k, this.l, this.m, yjeVar, (byte) 1);
            default:
                return new xvh0(this.k, this.l, this.m, yjeVar, (byte) 2);
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
        return ((xvh0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r9.g(r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r9.g(r11) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        if (r9.g(r11) == r0) goto L56;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xvh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
