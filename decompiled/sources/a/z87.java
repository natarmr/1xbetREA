package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public nrt j;
    public byte k;
    public final /* synthetic */ f97 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z87(f97 f97Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = f97Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f97 f97Var = this.l;
        switch (b) {
            case 0:
                return new z87(f97Var, yjeVar, (byte) 0);
            default:
                return new z87(f97Var, yjeVar, (byte) 1);
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
        return ((z87) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (a.qcc.P(r2, r39) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r0 == r1) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z87.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
