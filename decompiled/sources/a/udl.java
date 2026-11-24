package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class udl extends zzf0 implements Function2 {
    public woa0 j;
    public int k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hie0 n;
    public final /* synthetic */ mie0 o;
    public final /* synthetic */ mie0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udl(hie0 hie0Var, mie0 mie0Var, mie0 mie0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.n = hie0Var;
        this.o = mie0Var;
        this.p = mie0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        udl udlVar = new udl(this.n, this.o, this.p, yjeVar);
        udlVar.m = obj;
        return udlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((udl) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:2: B:16:0x0056->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0069 A[EDGE_INSN: B:74:0x0069->B:22:0x0069 BREAK  A[LOOP:2: B:16:0x0056->B:20:0x0065], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.udl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
