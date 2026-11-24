package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class owc extends bnn0 implements Function2 {
    public byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rwc k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owc(rwc rwcVar, boolean z, int i, String str, boolean z2, String str2, String str3, yje yjeVar) {
        super(2, yjeVar);
        this.k = rwcVar;
        this.l = z;
        this.m = i;
        this.n = str;
        this.o = z2;
        this.p = str2;
        this.q = str3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        owc owcVar = new owc(this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
        owcVar.j = obj;
        return owcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((owc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r0 == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r0 == r2) goto L19;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.j
            a.vne r1 = (a.vne) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r0.i
            r4 = 0
            r5 = 2
            r6 = 1
            a.rwc r7 = r0.k
            if (r3 == 0) goto L27
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            a.z1x.P(r19)
            r0 = r19
            goto L7b
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r4
        L21:
            a.z1x.P(r19)
            r0 = r19
            goto L43
        L27:
            a.z1x.P(r19)
            a.up70 r3 = r7.d
            java.lang.String r8 = "GET_CMS_BANNER_CATEGORIES"
            boolean r3 = r3.c(r8)
            a.rwc r10 = r0.k
            if (r3 == 0) goto L46
            a.up70 r1 = r10.d
            r0.j = r4
            r0.i = r6
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r2) goto L43
            goto L7a
        L43:
            java.util.List r0 = (java.util.List) r0
            return r0
        L46:
            a.nwc r9 = new a.nwc
            java.lang.String r3 = r0.q
            r17 = 0
            boolean r11 = r0.l
            int r12 = r0.m
            java.lang.String r13 = r0.n
            boolean r14 = r0.o
            java.lang.String r15 = r0.p
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = 3
            a.kzj r1 = a.qjj.M(r1, r4, r9, r3)
            a.up70 r3 = r7.d
            java.util.LinkedHashMap r3 = r3.f36049a
            r3.put(r8, r1)
            a.mwc r3 = new a.mwc
            r6 = 0
            r3.<init>(r7, r6)
            r1.invokeOnCompletion(r3)
            r0.j = r4
            r0.i = r5
            java.lang.Object r0 = r1.q(r0)
            if (r0 != r2) goto L7b
        L7a:
            return r2
        L7b:
            java.util.List r0 = (java.util.List) r0
            a.nhf0 r1 = r7.c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L88:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r3.next()
            a.awc r4 = (a.awc) r4
            java.util.List r4 = r4.c
            a.w3d.u(r2, r4)
            goto L88
        L9a:
            java.lang.Object r1 = r1.d
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            r1.clear()
            r1.addAll(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.owc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
