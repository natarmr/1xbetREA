package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sjv extends bnn0 implements Function2 {
    public hzb0 i;
    public v0 j;
    public cyh k;
    public Map l;
    public Iterator m;
    public i7a n;
    public byte o;
    public final /* synthetic */ y6a p;
    public final /* synthetic */ hzb0 q;
    public final /* synthetic */ v0 r;
    public final /* synthetic */ cyh s;
    public final /* synthetic */ LinkedHashMap t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjv(y6a y6aVar, hzb0 hzb0Var, v0 v0Var, cyh cyhVar, LinkedHashMap linkedHashMap, yje yjeVar) {
        super(2, yjeVar);
        this.p = y6aVar;
        this.q = hzb0Var;
        this.r = v0Var;
        this.s = cyhVar;
        this.t = linkedHashMap;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new sjv(this.p, this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sjv) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:17:0x0075->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ea -> B:31:0x00ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sjv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
