package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class coe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public /* synthetic */ Object k;
    public long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coe(long j, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                coe coeVar = new coe(2, yjeVar);
                coeVar.k = obj;
                return coeVar;
            default:
                coe coeVar2 = new coe(this.l, yjeVar);
                coeVar2.k = obj;
                return coeVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                ((coe) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                return ((coe) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[PHI: r3
  0x0084: PHI (r3v3 long) = (r3v4 long), (r3v7 long) binds: [B:31:0x0081, B:28:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:12:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008e -> B:37:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.i
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 2
            switch(r0) {
                case 0: goto L4f;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r9.k
            a.kmq r0 = (a.kmq) r0
            a.wne r7 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L23
            if (r8 == r5) goto L1f
            if (r8 != r6) goto L1b
            goto L23
        L1b:
            a.jf4.n(r4)
            goto L4e
        L1f:
            a.z1x.P(r10)
            goto L3d
        L23:
            a.z1x.P(r10)
        L26:
            kotlin.coroutines.CoroutineContext r10 = r9.getContext()
            boolean r10 = a.zvw.X(r10)
            if (r10 == 0) goto L4c
            kotlin.Unit r10 = kotlin.Unit.f46060a
            r9.k = r0
            r9.j = r5
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r7) goto L3d
            goto L4a
        L3d:
            long r3 = r9.l
            long r3 = r3 * r1
            r9.k = r0
            r9.j = r6
            java.lang.Object r10 = a.qcc.O(r3, r9)
            if (r10 != r7) goto L26
        L4a:
            r3 = r7
            goto L4e
        L4c:
            kotlin.Unit r3 = kotlin.Unit.f46060a
        L4e:
            return r3
        L4f:
            java.lang.Object r0 = r9.k
            a.kmq r0 = (a.kmq) r0
            a.wne r7 = a.wne.f39444a
            byte r8 = r9.j
            if (r8 == 0) goto L6d
            if (r8 == r5) goto L67
            if (r8 != r6) goto L63
            long r3 = r9.l
            a.z1x.P(r10)
            goto L92
        L63:
            a.jf4.n(r4)
            goto L91
        L67:
            long r3 = r9.l
            a.z1x.P(r10)
            goto L84
        L6d:
            a.z1x.P(r10)
            r3 = 0
        L72:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r3)
            r9.k = r0
            r9.l = r3
            r9.j = r5
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r7) goto L84
            goto L90
        L84:
            r9.k = r0
            r9.l = r3
            r9.j = r6
            java.lang.Object r10 = a.qcc.O(r1, r9)
            if (r10 != r7) goto L92
        L90:
            r3 = r7
        L91:
            return r3
        L92:
            long r3 = r3 + r1
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: a.coe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ coe(int i, yje yjeVar) {
        super(i, yjeVar);
    }
}
