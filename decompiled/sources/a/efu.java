package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class efu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public long j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public byte o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(yje yjeVar, dgu dguVar, String str, String str2) {
        super(2, yjeVar);
        this.s = str;
        this.t = dguVar;
        this.u = str2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                efu efuVar = new efu(this.l, (a6u) obj3, (Function1) obj2, yjeVar);
                efuVar.q = obj;
                return efuVar;
            default:
                return new efu(yjeVar, (dgu) obj3, (String) this.s, (String) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((efu) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((efu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:119:0x031e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0337  */
    /* JADX WARN: Code duplicated, block: B:125:0x033f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0358  */
    /* JADX WARN: Code duplicated, block: B:135:0x036f  */
    /* JADX WARN: Code duplicated, block: B:140:0x038c  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c0 A[LOOP:4: B:145:0x03ba->B:147:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:156:0x040a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0417  */
    /* JADX WARN: Code duplicated, block: B:161:0x0434  */
    /* JADX WARN: Code duplicated, block: B:164:0x0441  */
    /* JADX WARN: Code duplicated, block: B:165:0x0447  */
    /* JADX WARN: Code duplicated, block: B:167:0x044a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0467  */
    /* JADX WARN: Code duplicated, block: B:175:0x0485  */
    /* JADX WARN: Code duplicated, block: B:177:0x048c  */
    /* JADX WARN: Code duplicated, block: B:181:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:186:0x04c8 A[LOOP:2: B:133:0x0369->B:186:0x04c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:129:0x0358, B:132:0x0365], limit reached: 209 */
    /* JADX WARN: Type inference failed for: r13v18, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [a.dag0] */
    /* JADX WARN: Type inference failed for: r13v22, types: [a.el50] */
    /* JADX WARN: Type inference failed for: r13v23, types: [a.el50] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48, types: [int] */
    /* JADX WARN: Type inference failed for: r3v49, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v58, types: [int] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v65, types: [int] */
    /* JADX WARN: Type inference failed for: r3v66, types: [int] */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v14, types: [long] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v6, types: [long] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10, types: [long] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v3, types: [long] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [long] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x04c5 -> B:87:0x020b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:175:0x0485
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.efu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(boolean z, a6u a6uVar, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.l = z;
        this.t = a6uVar;
        this.u = function1;
    }
}
