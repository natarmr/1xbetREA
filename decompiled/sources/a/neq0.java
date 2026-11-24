package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class neq0 extends bnn0 implements Function2 {
    public z8r i;
    public p7m0 j;
    public ly5 k;
    public oeq0 l;
    public Object m;
    public String n;
    public uk10 o;
    public ieq0 p;
    public double q;
    public boolean r;
    public final /* synthetic */ oeq0 s;
    public final /* synthetic */ ly5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public neq0(oeq0 oeq0Var, ly5 ly5Var, yje yjeVar) {
        super(2, yjeVar);
        this.s = oeq0Var;
        this.t = ly5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new neq0(this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((neq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a3 -> B:6:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x00a5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.neq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
