package a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jou extends bnn0 implements Function2 {
    public Map i;
    public Iterator j;
    public Map k;
    public Object l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ List o;
    public final /* synthetic */ khf0 p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ String r;
    public final /* synthetic */ sff0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jou(List list, khf0 khf0Var, int i, String str, sff0 sff0Var, yje yjeVar) {
        super(2, yjeVar);
        this.o = list;
        this.p = khf0Var;
        this.q = i;
        this.r = str;
        this.s = sff0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        jou jouVar = new jou(this.o, this.p, this.q, this.r, this.s, yjeVar);
        jouVar.n = obj;
        return jouVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jou) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00af -> B:22:0x00b0). Please report as a decompilation issue!!! */
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
            java.lang.Object r0 = r13.n
            a.vne r0 = (a.vne) r0
            a.wne r1 = a.wne.f39444a
            boolean r2 = r13.m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L25
            if (r2 != r3) goto L1f
            java.lang.Object r0 = r13.l
            java.util.Map r2 = r13.k
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r5 = r13.j
            java.util.Map r6 = r13.i
            java.util.Map r6 = (java.util.Map) r6
            a.z1x.P(r14)
            goto Lb0
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            return r4
        L25:
            a.z1x.P(r14)
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r2 = 10
            java.util.List r5 = r13.o
            int r2 = a.r3d.q(r5, r2)
            int r2 = a.wp20.a(r2)
            r6 = 16
            if (r2 >= r6) goto L3b
            r2 = r6
        L3b:
            r14.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L42:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r2.next()
            r8 = r5
            a.vh0 r8 = (a.vh0) r8
            a.sff0 r6 = r13.s
            a.hl1 r6 = r6.b
            boolean r11 = r6.N
            a.knu r6 = new a.knu
            r12 = 0
            a.khf0 r7 = r13.p
            java.lang.String r9 = r13.r
            byte r10 = r13.q
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r7 = 3
            a.kzj r6 = a.qjj.M(r0, r4, r6, r7)
            r14.put(r5, r6)
            goto L42
        L6a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r2 = r14.size()
            int r2 = a.wp20.a(r2)
            r0.<init>(r2)
            java.util.Set r14 = r14.entrySet()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
            r5 = r14
            r2 = r0
        L83:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto Lb9
            java.lang.Object r14 = r5.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r0 = r14.getKey()
            java.lang.Object r14 = r14.getValue()
            a.jzj r14 = (a.jzj) r14
            r13.n = r4
            r6 = r2
            java.util.Map r6 = (java.util.Map) r6
            r13.i = r6
            r13.j = r5
            r13.k = r6
            r13.l = r0
            r13.m = r3
            java.lang.Object r14 = r14.await(r13)
            if (r14 != r1) goto Laf
            return r1
        Laf:
            r6 = r2
        Lb0:
            a.j0g0 r14 = (a.j0g0) r14
            java.lang.Object r7 = r14.f15681a
            r2.put(r0, r14)
            r2 = r6
            goto L83
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jou.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
