package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class o6d extends bnn0 implements Function2 {
    public Object[] i;
    public htb j;
    public byte[] k;
    public int l;
    public int m;
    public int n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ gmq[] q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ xdr s;
    public final /* synthetic */ kmq t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6d(yje yjeVar, kmq kmqVar, xdr xdrVar, Function0 function0, gmq[] gmqVarArr) {
        super(2, yjeVar);
        this.q = gmqVarArr;
        this.r = function0;
        this.s = xdrVar;
        this.t = kmqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        o6d o6dVar = new o6d(yjeVar, this.t, this.s, this.r, this.q);
        o6dVar.p = obj;
        return o6dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o6d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2 A[LOOP:0: B:30:0x00d2->B:38:0x00f3, LOOP_START, PHI: r3 r14
  0x00d2: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:27:0x00cd, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r14v6 kotlin.collections.IndexedValue) = (r14v5 kotlin.collections.IndexedValue), (r14v10 kotlin.collections.IndexedValue) binds: [B:27:0x00cd, B:38:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5 A[EDGE_INSN: B:52:0x00f5->B:39:0x00f5 BREAK  A[LOOP:0: B:30:0x00d2->B:38:0x00f3], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0137 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013c -> B:45:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o6d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
