package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ffe0 extends bnn0 implements Function2 {
    public Object i;
    public kd30 j;
    public ffe0 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ kd30 v;
    public final /* synthetic */ long w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffe0(kd30 kd30Var, long j, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.v = kd30Var;
        this.w = j;
        this.x = z;
        this.y = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ffe0 ffe0Var = new ffe0(this.v, this.w, this.x, this.y, yjeVar);
        ffe0Var.u = obj;
        return ffe0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ffe0) create((xe60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0311 -> B:158:0x0320). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ffe0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
