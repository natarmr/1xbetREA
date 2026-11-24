package a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class dfu extends bnn0 implements Function2 {
    public Map i;
    public Iterator j;
    public Map k;
    public yeu l;
    public int m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Set p;
    public final /* synthetic */ a6u q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfu(Set set, a6u a6uVar, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.p = set;
        this.q = a6uVar;
        this.r = i;
        this.s = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        dfu dfuVar = new dfu(this.p, this.q, this.r, this.s, yjeVar);
        dfuVar.o = obj;
        return dfuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dfu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a9 -> B:22:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.o
            a.vne r0 = (a.vne) r0
            a.wne r1 = a.wne.f39444a
            boolean r2 = r13.n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            if (r2 != r3) goto L21
            int r0 = r13.m
            a.yeu r2 = r13.l
            java.util.Map r5 = r13.k
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r6 = r13.j
            java.util.Map r7 = r13.i
            java.util.Map r7 = (java.util.Map) r7
            a.z1x.P(r14)
            goto Laa
        L21:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            return r4
        L27:
            a.z1x.P(r14)
            java.util.Set r14 = r13.p
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r6 = a.r3d.q(r14, r5)
            r2.<init>(r6)
            java.util.Iterator r14 = r14.iterator()
        L3d:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L64
            java.lang.Object r6 = r14.next()
            r9 = r6
            a.yeu r9 = (a.yeu) r9
            a.ydu r7 = new a.ydu
            r12 = 0
            a.a6u r8 = r13.q
            int r10 = r13.r
            int r11 = r13.s
            r7.<init>(r8, r9, r10, r11, r12)
            r6 = 3
            a.kzj r6 = a.qjj.M(r0, r4, r7, r6)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r9, r6)
            r2.add(r7)
            goto L3d
        L64:
            int r14 = a.r3d.q(r2, r5)
            int r14 = a.wp20.a(r14)
            r0 = 16
            if (r14 >= r0) goto L71
            r14 = r0
        L71:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
            r5 = r0
            r6 = r2
            r0 = r14
        L7d:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto Laf
            java.lang.Object r14 = r6.next()
            kotlin.Pair r14 = (kotlin.Pair) r14
            java.lang.Object r2 = r14.f46059a
            a.yeu r2 = (a.yeu) r2
            java.lang.Object r14 = r14.b
            a.jzj r14 = (a.jzj) r14
            r13.o = r4
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            r13.i = r7
            r13.j = r6
            r13.k = r7
            r13.l = r2
            r13.m = r0
            r13.n = r3
            java.lang.Object r14 = r14.await(r13)
            if (r14 != r1) goto La9
            return r1
        La9:
            r7 = r5
        Laa:
            r5.put(r2, r14)
            r5 = r7
            goto L7d
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dfu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
