package a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fdw extends bnn0 implements Function2 {
    public Map i;
    public Object j;
    public Object k;
    public List l;
    public xzp m;
    public sgs n;
    public Iterator o;
    public byte p;
    public final /* synthetic */ xzp q;
    public final /* synthetic */ sgs r;
    public final /* synthetic */ zos s;
    public final /* synthetic */ jo20 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdw(xzp xzpVar, sgs sgsVar, zos zosVar, jo20 jo20Var, boolean z, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.q = xzpVar;
        this.r = sgsVar;
        this.s = zosVar;
        this.t = jo20Var;
        this.u = z;
        this.v = z2;
        this.w = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new fdw(this.q, this.r, this.s, this.t, this.u, this.v, this.w, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fdw) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0129  */
    /* JADX WARN: Code duplicated, block: B:32:0x016e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x016e -> B:33:0x0172). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fdw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
