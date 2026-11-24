package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w1f0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ y1f0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ jo20 n;
    public final /* synthetic */ ynb0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1f0(boolean z, y1f0 y1f0Var, String str, jo20 jo20Var, ynb0 ynb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = y1f0Var;
        this.m = str;
        this.n = jo20Var;
        this.o = ynb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new w1f0(this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 0);
            case 1:
                return new w1f0(this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 1);
            default:
                return new w1f0(this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 2);
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
        return ((w1f0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r12 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r12 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r12 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r12 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r12 == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        if (r12 == r0) goto L60;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w1f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
