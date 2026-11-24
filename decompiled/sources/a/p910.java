package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p910 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ ea10 j;
    public final /* synthetic */ bby k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ u910 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p910(ea10 ea10Var, bby bbyVar, int i, int i2, u910 u910Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = ea10Var;
        this.k = bbyVar;
        this.l = i;
        this.m = i2;
        this.n = u910Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new p910(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p910) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            a.wne r0 = a.wne.f39444a
            boolean r1 = r5.i
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            a.z1x.P(r6)
            goto L58
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L14:
            a.z1x.P(r6)
        L17:
            int[] r6 = a.o910.f24858a
            a.ea10 r1 = r5.j
            int r1 = r1.ordinal()
            r6 = r6[r1]
            int r1 = r5.l
            if (r6 != r2) goto L30
            a.bby r6 = r5.k
            boolean r6 = r6.isActive()
            if (r6 == 0) goto L2e
            goto L30
        L2e:
            int r1 = r5.m
        L30:
            r5.i = r2
            r6 = 2147483647(0x7fffffff, float:NaN)
            a.u910 r3 = r5.n
            if (r1 != r6) goto L44
            a.r910 r6 = new a.r910
            r4 = 0
            r6.<init>(r3, r1, r4)
            java.lang.Object r6 = a.r7x.K(r6, r5)
            goto L55
        L44:
            a.r910 r6 = new a.r910
            r6.<init>(r3, r1, r2)
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            a.qq40 r1 = a.s0x.P(r1)
            java.lang.Object r6 = r1.e(r6, r5)
        L55:
            if (r6 != r0) goto L58
            return r0
        L58:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L17
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p910.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
