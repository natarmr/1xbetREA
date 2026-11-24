package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ptt j;
    public byte k;
    public final /* synthetic */ f97 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y87(f97 f97Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = f97Var;
        this.m = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.m;
        f97 f97Var = this.l;
        switch (b) {
            case 0:
                return new y87(f97Var, str, yjeVar, (byte) 0);
            default:
                return new y87(f97Var, str, yjeVar, (byte) 1);
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
        return ((y87) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x022d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if (r5 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (r0 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01dd, code lost:
    
        if (r9 == r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022f, code lost:
    
        if (r0 == r8) goto L56;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y87.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
