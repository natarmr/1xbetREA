package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class y240 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ j340 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y240(j340 j340Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j340Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j340 j340Var = this.k;
        switch (b) {
            case 0:
                return new y240(j340Var, yjeVar, (byte) 0);
            default:
                return new y240(j340Var, yjeVar, (byte) 1);
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
        return ((y240) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[LOOP:1: B:28:0x008f->B:30:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r11 == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (r1.c(r11, r10) == r0) goto L45;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y240.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
