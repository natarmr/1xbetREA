package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ods0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ods0(t33 t33Var, ppj0 ppj0Var, pz40 pz40Var, agk0 agk0Var, agk0 agk0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.k = t33Var;
        this.l = ppj0Var;
        this.m = pz40Var;
        this.n = agk0Var;
        this.o = agk0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.l;
        switch (b) {
            case 0:
                ods0 ods0Var = new ods0((pds0) obj3, (sch0) obj2, (mie0) obj4, yjeVar);
                ods0Var.m = obj;
                return ods0Var;
            default:
                return new ods0((t33) this.k, (ppj0) obj4, (pz40) this.m, (agk0) obj3, (agk0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ods0) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ods0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0156  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011e -> B:43:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ods0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ods0(pds0 pds0Var, sch0 sch0Var, mie0 mie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = pds0Var;
        this.o = sch0Var;
        this.l = mie0Var;
    }
}
