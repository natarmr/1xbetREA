package a;

import android.content.Context;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gb2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public Object j;
    public byte k;
    public int l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb2(w5z w5zVar, ygq0 ygq0Var, Pair pair, int i, Set set, yje yjeVar) {
        super(2, yjeVar);
        this.m = w5zVar;
        this.n = ygq0Var;
        this.o = pair;
        this.l = i;
        this.p = set;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                gb2 gb2Var = new gb2((hb2) obj2, yjeVar);
                gb2Var.o = obj;
                return gb2Var;
            case 1:
                return new gb2((w5z) this.m, (ygq0) this.n, (Pair) this.o, this.l, (Set) obj2, yjeVar);
            default:
                return new gb2((bk9) this.m, (Context) this.n, (qa10) this.o, (pz40) obj2, yjeVar);
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
        return ((gb2) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x029f  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:185:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[PHI: r0 r1
  0x007c: PHI (r0v83 int) = (r0v88 int), (r0v89 int) binds: [B:24:0x007a, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r1v17 java.lang.Throwable) = (r1v21 java.lang.Throwable), (r1v22 java.lang.Throwable) binds: [B:24:0x007a, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[Catch: all -> 0x00fe, TryCatch #4 {all -> 0x00fe, blocks: (B:26:0x007e, B:33:0x00a1, B:40:0x00b7, B:36:0x00ac, B:29:0x0090, B:32:0x009a), top: B:187:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00fe, TryCatch #4 {all -> 0x00fe, blocks: (B:26:0x007e, B:33:0x00a1, B:40:0x00b7, B:36:0x00ac, B:29:0x0090, B:32:0x009a), top: B:187:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x00fe, TryCatch #4 {all -> 0x00fe, blocks: (B:26:0x007e, B:33:0x00a1, B:40:0x00b7, B:36:0x00ac, B:29:0x0090, B:32:0x009a), top: B:187:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[Catch: all -> 0x0023, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001b, B:44:0x00ca, B:45:0x00d6, B:48:0x00e8, B:51:0x00f6, B:55:0x00fd, B:46:0x00d7, B:50:0x00ea), top: B:179:0x001b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: all -> 0x00fb, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00fb, blocks: (B:46:0x00d7, B:50:0x00ea), top: B:185:0x00d7, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c9 -> B:44:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0101 -> B:17:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gb2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb2(bk9 bk9Var, Context context, qa10 qa10Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = bk9Var;
        this.n = context;
        this.o = qa10Var;
        this.p = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb2(hb2 hb2Var, yje yjeVar) {
        super(2, yjeVar);
        this.p = hb2Var;
    }
}
