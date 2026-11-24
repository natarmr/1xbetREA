package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class dir0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public long j;
    public byte k;
    public final /* synthetic */ i3t0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dir0(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = i3t0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        i3t0 i3t0Var = this.l;
        switch (b) {
            case 0:
                return new dir0((fir0) i3t0Var, yjeVar, (byte) 0);
            default:
                return new dir0((ltr0) i3t0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((dir0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:44:0x013e, B:62:0x01a1, B:64:0x01ad, B:65:0x01b2, B:49:0x014c, B:58:0x0189, B:52:0x0155, B:53:0x0159, B:55:0x017e), top: B:76:0x0136 }] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (r0 == r13) goto L30;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dir0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
