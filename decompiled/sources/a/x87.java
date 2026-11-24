package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ f97 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x87(f97 f97Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f97Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        f97 f97Var = this.k;
        switch (b) {
            case 0:
                return new x87(f97Var, str, yjeVar, (byte) 0);
            case 1:
                return new x87(f97Var, str, yjeVar, (byte) 1);
            default:
                return new x87(f97Var, str, yjeVar, (byte) 2);
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
        return ((x87) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r2 == r13) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014b, code lost:
    
        if (r8.i0(r1, r45) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b0, code lost:
    
        if (r0 == r7) goto L52;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x87.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
