package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class nyn0 extends bnn0 implements Function2 {
    public zyn0 i;
    public fuj0 j;
    public i050 k;
    public List l;
    public Iterator m;
    public List n;
    public kka o;
    public int p;
    public byte q;
    public final /* synthetic */ vne r;
    public final /* synthetic */ zyn0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyn0(vne vneVar, zyn0 zyn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = vneVar;
        this.s = zyn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new nyn0(this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nyn0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #1 {all -> 0x0043, blocks: (B:16:0x003c, B:48:0x00db, B:86:0x0160, B:38:0x00a9, B:40:0x00b1, B:44:0x00bb, B:53:0x00eb, B:55:0x00f6, B:57:0x00fb, B:59:0x00ff, B:62:0x0104, B:56:0x00f9, B:64:0x0109, B:68:0x012c, B:74:0x013e, B:76:0x0149, B:78:0x014e, B:80:0x0152, B:83:0x0157, B:77:0x014c, B:87:0x0168, B:88:0x016b, B:23:0x005d), top: B:113:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:16:0x003c, B:48:0x00db, B:86:0x0160, B:38:0x00a9, B:40:0x00b1, B:44:0x00bb, B:53:0x00eb, B:55:0x00f6, B:57:0x00fb, B:59:0x00ff, B:62:0x0104, B:56:0x00f9, B:64:0x0109, B:68:0x012c, B:74:0x013e, B:76:0x0149, B:78:0x014e, B:80:0x0152, B:83:0x0157, B:77:0x014c, B:87:0x0168, B:88:0x016b, B:23:0x005d), top: B:113:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0044: MOVE (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:69), block:B:19:0x0044 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r15v13, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r4v18, types: [a.fuj0, a.i050, a.kka, a.zyn0, java.lang.Object, java.util.Iterator, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b7 -> B:86:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d7 -> B:48:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x015c -> B:86:0x0160). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nyn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
