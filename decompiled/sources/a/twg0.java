package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class twg0 extends bnn0 implements Function2 {
    public int i;
    public int j;
    public int k;
    public kie0 l;
    public cxg0 m;
    public dvh0 n;
    public boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ cxg0 q;
    public final /* synthetic */ kie0 r;
    public final /* synthetic */ int s;
    public final /* synthetic */ dvh0 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twg0(int i, cxg0 cxg0Var, kie0 kie0Var, int i2, dvh0 dvh0Var, int i3, yje yjeVar) {
        super(2, yjeVar);
        this.p = i;
        this.q = cxg0Var;
        this.r = kie0Var;
        this.s = i2;
        this.t = dvh0Var;
        this.u = i3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new twg0(this.p, this.q, this.r, this.s, this.t, this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((twg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:26:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0040
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.twg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
