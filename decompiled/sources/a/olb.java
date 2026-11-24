package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class olb extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ olb(byte b, yje yjeVar, i3t0 i3t0Var, boolean z) {
        super(1, yjeVar);
        this.i = b;
        this.l = i3t0Var;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new olb((byte) 0, yjeVar, (i3t0) obj, this.k);
            case 1:
                return new olb((byte) 1, yjeVar, (i3t0) obj, this.k);
            case 2:
                return new olb(this.k, obj, yjeVar, (byte) 2);
            case 3:
                return new olb(this.k, obj, yjeVar, (byte) 3);
            default:
                return new olb((ltr0) obj, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
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
        return ((olb) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0235, code lost:
    
        if (r1 == r0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r0 == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        if (r2.E(r18) == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
    
        if (r0.c(r3, r18) == r2) goto L99;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.olb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olb(ltr0 ltr0Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 4;
        this.l = ltr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ olb(boolean z, Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
    }
}
