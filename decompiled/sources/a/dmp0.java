package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;

/* JADX INFO: loaded from: classes6.dex */
public final class dmp0 extends bnn0 implements Function2 {
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public TypeParam n;
    public fmp0 o;
    public Throwable p;
    public byte q;
    public final /* synthetic */ TypeParam r;
    public final /* synthetic */ fmp0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmp0(TypeParam typeParam, fmp0 fmp0Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = typeParam;
        this.s = fmp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new dmp0(this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dmp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:34|142|35|36|138|37|135|38|39|131|40|41) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:150|63|148|64|65|146|66|144|67|68|140|69|70) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:128|24|(1:26)(2:27|(1:29)(1:30))) */
    /* JADX WARN: Code duplicated, block: B:102:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x021d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0226  */
    /* JADX WARN: Code duplicated, block: B:124:0x022d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x022f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0235  */
    /* JADX WARN: Code duplicated, block: B:128:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:24:0x00ab, B:27:0x00b1), top: B:128:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[Catch: all -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0123, blocks: (B:34:0x00be, B:44:0x00fe, B:46:0x010e, B:48:0x0115, B:61:0x0134, B:62:0x0139), top: B:130:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0134 A[Catch: all -> 0x0123, TryCatch #1 {all -> 0x0123, blocks: (B:34:0x00be, B:44:0x00fe, B:46:0x010e, B:48:0x0115, B:61:0x0134, B:62:0x0139), top: B:130:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bf  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01db, code lost:
    
        if (a.qcc.P(r9, r21) == r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0214, code lost:
    
        if (a.qcc.P(r9, r21) == r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        if (r0 == r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012f, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0176, code lost:
    
        if (r0 == r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0193, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x006e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:111), block:B:16:0x006e */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dmp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
