package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class jio0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ rio0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jio0(rio0 rio0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rio0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rio0 rio0Var = this.k;
        switch (b) {
            case 0:
                return new jio0(rio0Var, yjeVar, (byte) 0);
            default:
                return new jio0(rio0Var, yjeVar, (byte) 1);
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
        return ((jio0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1 A[LOOP:1: B:36:0x00d8->B:38:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        if (((a.gmq) r10).c(r1, r9) == r0) goto L58;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jio0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
