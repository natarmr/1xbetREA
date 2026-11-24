package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zl7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ fm7 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl7(fm7 fm7Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fm7Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                return new zl7(fm7Var, str, yjeVar, (byte) 0);
            case 1:
                return new zl7(fm7Var, str, yjeVar, (byte) 1);
            default:
                return new zl7(fm7Var, str, yjeVar, (byte) 2);
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
        return ((zl7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r2 == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        if (r8.X(r1, r31) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0163, code lost:
    
        if (((a.es) r0.f29996a).c(((a.x1u) r1.c).a(), r3, r31, r31.l) == r8) goto L52;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zl7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
