package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yqn0 extends bnn0 implements Function2 {
    public xuf i;
    public qz40 j;
    public arn0 k;
    public Object l;
    public oqn0 m;
    public Collection n;
    public Iterator o;
    public kka p;
    public Collection q;
    public String r;
    public boolean s;
    public byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ arn0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqn0(arn0 arn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.v = arn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        yqn0 yqn0Var = new yqn0(this.v, yjeVar);
        yqn0Var.u = obj;
        return yqn0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yqn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:111:0x02da  */
    /* JADX WARN: Code duplicated, block: B:114:0x0309  */
    /* JADX WARN: Code duplicated, block: B:115:0x030e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0324  */
    /* JADX WARN: Code duplicated, block: B:123:0x0336  */
    /* JADX WARN: Code duplicated, block: B:127:0x036b  */
    /* JADX WARN: Code duplicated, block: B:130:0x038b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0212  */
    /* JADX WARN: Code duplicated, block: B:78:0x0265  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x036b -> B:8:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01ed -> B:59:0x020c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yqn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
