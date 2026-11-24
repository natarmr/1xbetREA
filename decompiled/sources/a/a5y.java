package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a5y extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ql5 j;
    public byte k;
    public final /* synthetic */ c5y l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5y(c5y c5yVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = c5yVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c5y c5yVar = this.l;
        switch (b) {
            case 0:
                return new a5y(c5yVar, yjeVar, (byte) 0);
            default:
                return new a5y(c5yVar, yjeVar, (byte) 1);
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
        return ((a5y) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014b, code lost:
    
        if (r2.a(r1, r20) == r8) goto L37;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a5y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
