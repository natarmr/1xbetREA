package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class anq extends bnn0 implements xdr {
    public htb i;
    public long j;
    public int k;
    public boolean l;
    public /* synthetic */ vne m;
    public /* synthetic */ kmq n;
    public final /* synthetic */ long o;
    public final /* synthetic */ gmq p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anq(long j, gmq gmqVar, yje yjeVar) {
        super(3, yjeVar);
        this.o = j;
        this.p = gmqVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        anq anqVar = new anq(this.o, this.p, (yje) obj3);
        anqVar.m = (vne) obj;
        anqVar.n = (kmq) obj2;
        return anqVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:20:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            a.vne r1 = r0.m
            a.kmq r2 = r0.n
            a.wne r3 = a.wne.f39444a
            boolean r4 = r0.l
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L23
            if (r4 != r5) goto L1d
            int r1 = r0.k
            long r7 = r0.j
            a.htb r4 = r0.i
            a.z1x.P(r18)
            r9 = r18
            goto L8d
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r6
        L23:
            a.z1x.P(r18)
            a.uen r4 = a.wen.b
            r4.getClass()
            r7 = 0
            long r9 = r0.o
            int r4 = a.wen.c(r9, r7)
            if (r4 <= 0) goto L98
            a.gmq r4 = r0.p
            r7 = 0
            a.gmq r12 = a.ulb.D(r4, r7)
            boolean r4 = r12 instanceof a.ktb
            if (r4 == 0) goto L44
            r4 = r12
            a.ktb r4 = (a.ktb) r4
            goto L45
        L44:
            r4 = r6
        L45:
            if (r4 != 0) goto L52
            a.rtb r11 = new a.rtb
            r15 = 0
            r16 = 14
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r4 = r11
        L52:
            a.htb r1 = r4.l(r1)
            r4 = r1
            r1 = r7
            r7 = r9
        L59:
            a.o2i0 r9 = new a.o2i0
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
            r9.<init>(r10)
            a.i1i0 r10 = r4.i()
            a.g6q r11 = new a.g6q
            r11.<init>(r2, r6)
            r9.g(r10, r11)
            a.zmq r10 = new a.zmq
            r10.<init>(r7, r6)
            long r11 = a.qcc.g0(r7)
            a.idx.L(r9, r11, r10)
            r0.m = r6
            r0.n = r2
            r0.i = r4
            r0.j = r7
            r0.k = r1
            r0.l = r5
            java.lang.Object r9 = a.o2i0.d(r9, r0)
            if (r9 != r3) goto L8d
            return r3
        L8d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L59
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L98:
            a.gmq0 r0 = new a.gmq0
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.anq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
