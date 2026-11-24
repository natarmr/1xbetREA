package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mi2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qi2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi2(qi2 qi2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = qi2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qi2 qi2Var = this.l;
        switch (b) {
            case 0:
                mi2 mi2Var = new mi2(qi2Var, yjeVar, (byte) 0);
                mi2Var.k = obj;
                return mi2Var;
            default:
                mi2 mi2Var2 = new mi2(qi2Var, yjeVar, (byte) 1);
                mi2Var2.k = obj;
                return mi2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mi2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mi2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r2.c(r0, r16) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (r2 == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        if (r0.a(r14, r16) == r7) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
