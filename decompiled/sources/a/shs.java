package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class shs extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ uhs k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shs(uhs uhsVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = uhsVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        uhs uhsVar = this.k;
        switch (b) {
            case 0:
                return new shs(uhsVar, yjeVar, (byte) 0);
            default:
                return new shs(uhsVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((shs) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r1.a(r2, r27) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0160, code lost:
    
        if (r0.c(r1, r27) == r11) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.shs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
