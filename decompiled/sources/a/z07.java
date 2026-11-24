package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class z07 extends bnn0 implements Function2 {
    public mro i;
    public a17 j;
    public z07 k;
    public Throwable l;
    public long m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r;
    public byte s;
    public /* synthetic */ Object t;
    public final /* synthetic */ List u;
    public final /* synthetic */ long v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ a17 x;
    public final /* synthetic */ List y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z07(List list, long j, boolean z, a17 a17Var, List list2, yje yjeVar) {
        super(2, yjeVar);
        this.u = list;
        this.v = j;
        this.w = z;
        this.x = a17Var;
        this.y = list2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        z07 z07Var = new z07(this.u, this.v, this.w, this.x, this.y, yjeVar);
        z07Var.t = obj;
        return z07Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z07) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:86|179|87|88|176|89|90|174|91|92|(1:95)|94|147) */
    /* JADX WARN: Code duplicated, block: B:104:0x0263 A[Catch: all -> 0x024c, TRY_LEAVE, TryCatch #5 {all -> 0x024c, blocks: (B:96:0x023d, B:98:0x0249, B:101:0x0259, B:102:0x025d, B:104:0x0263), top: B:182:0x023d }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0294 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a2 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b0 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02da A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02f4 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:145:0x0302 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0325  */
    /* JADX WARN: Code duplicated, block: B:150:0x0333 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0347 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0352  */
    /* JADX WARN: Code duplicated, block: B:155:0x0356 A[Catch: all -> 0x0277, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:157:0x035e A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #2 {all -> 0x0277, blocks: (B:108:0x0273, B:119:0x028c, B:122:0x0294, B:124:0x02a2, B:128:0x02ac, B:130:0x02b0, B:135:0x02da, B:137:0x02ec, B:139:0x02f4, B:143:0x02fe, B:145:0x0302, B:150:0x0333, B:152:0x0347, B:155:0x0356, B:156:0x035d, B:157:0x035e), top: B:178:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:161:0x036a  */
    /* JADX WARN: Code duplicated, block: B:163:0x036f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0384  */
    /* JADX WARN: Code duplicated, block: B:168:0x038a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0392  */
    /* JADX WARN: Code duplicated, block: B:188:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[LOOP:0: B:102:0x025d->B:190:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249 A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:96:0x023d, B:98:0x0249, B:101:0x0259, B:102:0x025d, B:104:0x0263), top: B:182:0x023d }] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027a, code lost:
    
        r28 = r14;
        r14 = r0;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0280, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0281, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0285, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0289, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028a, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x02da -> B:136:0x02e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0325 -> B:149:0x032b). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
