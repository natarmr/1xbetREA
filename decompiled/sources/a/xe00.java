package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xe00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ ef00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe00(ef00 ef00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ef00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ef00 ef00Var = this.k;
        switch (b) {
            case 0:
                return new xe00(ef00Var, yjeVar, (byte) 0);
            default:
                return new xe00(ef00Var, yjeVar, (byte) 1);
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
        return ((xe00) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[LOOP:1: B:36:0x00d0->B:38:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r11 == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0129, code lost:
    
        if (((a.gmq) r11).c(r1, r10) == r0) goto L58;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xe00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
