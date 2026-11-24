package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class uwb extends zzf0 implements Function2 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ float l;
    public final /* synthetic */ a4x m;
    public final /* synthetic */ pz40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwb(float f, a4x a4xVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = f;
        this.m = a4xVar;
        this.n = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        uwb uwbVar = new uwb(this.l, this.m, this.n, yjeVar);
        uwbVar.k = obj;
        return uwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((uwb) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        return wne.f39444a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0087
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.k
            a.inn0 r0 = (a.inn0) r0
            a.wne r1 = a.wne.f39444a
            boolean r2 = r9.j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 != r4) goto L12
            a.z1x.P(r10)
            goto L28
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L18:
            a.z1x.P(r10)
        L1b:
            a.xoa0 r10 = a.xoa0.f41207a
            r9.k = r0
            r9.j = r4
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r1) goto L28
            return r1
        L28:
            a.woa0 r10 = (a.woa0) r10
            java.util.List r10 = r10.f39485a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L35:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r10.next()
            r6 = r5
            a.dpa0 r6 = (a.dpa0) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L35
            r2.add(r5)
            goto L35
        L4a:
            int r10 = r2.size()
            a.pz40 r5 = r9.n
            if (r10 != r4) goto L96
            r10 = 0
            java.lang.Object r10 = r2.get(r10)
            a.dpa0 r10 = (a.dpa0) r10
            float r2 = r9.l
            float r2 = r0.w0(r2)
            a.zcl r6 = a.qmk.f28987a
            r6 = 1101004800(0x41a00000, float:20.0)
            float r6 = r0.w0(r6)
            long r7 = r10.c
            r10 = 32
            long r7 = r7 >> r10
            int r10 = (int) r7
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 - r6
            float r10 = r10 / r2
            int r10 = (int) r10
            a.a4x r2 = r9.m
            kotlin.ranges.IntRange r2 = a.q3d.h(r2)
            int r10 = a.l1e0.e(r10, r2)
            java.lang.Object r2 = r5.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L87
            goto L8d
        L87:
            int r2 = r2.intValue()
            if (r2 == r10) goto L1b
        L8d:
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            r5.setValue(r2)
            goto L1b
        L96:
            java.lang.Object r10 = r5.getValue()
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L1b
            r5.setValue(r3)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uwb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
