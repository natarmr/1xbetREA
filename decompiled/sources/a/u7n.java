package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u7n extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7n(List list, dgu dguVar, boolean z, int i, long j, long j2, String str, yje yjeVar) {
        super(2, yjeVar);
        this.o = list;
        this.p = dguVar;
        this.k = z;
        this.l = i;
        this.m = j;
        this.n = j2;
        this.q = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (b) {
            case 0:
                return new u7n(this.k, this.l, (egk0) obj4, (Long) obj3, this.n, (pz40) obj2, yjeVar);
            default:
                return new u7n((List) obj4, (dgu) obj3, this.k, this.l, this.m, this.n, (String) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((u7n) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:31:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u7n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7n(boolean z, int i, egk0 egk0Var, Long l, long j, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.l = i;
        this.o = egk0Var;
        this.p = l;
        this.n = j;
        this.q = pz40Var;
    }
}
