package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rcf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcf(t33 t33Var, t33 t33Var2, t33 t33Var3, xcf xcfVar, t33 t33Var4, t33 t33Var5, t33 t33Var6, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.m = t33Var;
        this.n = t33Var2;
        this.o = t33Var3;
        this.s = xcfVar;
        this.p = t33Var4;
        this.q = t33Var5;
        this.r = t33Var6;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (b) {
            case 0:
                rcf rcfVar = new rcf((t33) this.m, (t33) this.n, (t33) this.o, (xcf) obj2, (t33) this.p, (t33) this.q, (t33) obj3, yjeVar);
                rcfVar.k = obj;
                return rcfVar;
            case 1:
                rcf rcfVar2 = new rcf((m9s) obj3, (uii) obj2, yjeVar);
                rcfVar2.k = obj;
                return rcfVar2;
            case 2:
                rcf rcfVar3 = new rcf((c050) this.p, (g050) this.q, (Function2) obj3, this.s, yjeVar, (byte) 2);
                rcfVar3.o = obj;
                return rcfVar3;
            default:
                rcf rcfVar4 = new rcf((pxs0) this.p, (String[]) this.q, (String) obj3, (String) obj2, yjeVar, (byte) 3);
                rcfVar4.o = obj;
                return rcfVar4;
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
            case 2:
                break;
        }
        return ((rcf) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0377  */
    /* JADX WARN: Code duplicated, block: B:128:0x037e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8 A[Catch: all -> 0x011b, TryCatch #6 {all -> 0x011b, blocks: (B:52:0x013f, B:40:0x00f2, B:42:0x00f8, B:44:0x00fc, B:49:0x011d, B:36:0x00dc), top: B:171:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: all -> 0x011b, TryCatch #6 {all -> 0x011b, blocks: (B:52:0x013f, B:40:0x00f2, B:42:0x00f8, B:44:0x00fc, B:49:0x011d, B:36:0x00dc), top: B:171:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d A[Catch: all -> 0x011b, TryCatch #6 {all -> 0x011b, blocks: (B:52:0x013f, B:40:0x00f2, B:42:0x00f8, B:44:0x00fc, B:49:0x011d, B:36:0x00dc), top: B:171:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:51:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0404, code lost:
    
        if (r0.f(r27, r5) == r12) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r5.a(r6, r27) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.i050, java.lang.Object] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rcf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcf(m9s m9sVar, uii uiiVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.r = m9sVar;
        this.s = uiiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rcf(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
    }
}
