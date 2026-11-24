package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s750 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ p850 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s750(p850 p850Var, String str, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p850Var;
        this.l = str;
        this.m = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new s750(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new s750(this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((s750) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r8.Z(r9, r24) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r8.Z(r9, r24) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        if (a.pw70.b(r0, r2, r1, r3, false, false, r24, 114) == r10) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025a, code lost:
    
        if (a.pw70.b(r0, r9, r2, 0, false, false, r24, 114) == r10) goto L93;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s750.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
