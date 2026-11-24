package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f05 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f05(boolean z, xcz xczVar, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = xczVar;
        this.l = i;
        this.m = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new f05(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f05) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r5.l(r2, 0, r8) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (a.bww.x(r5, r1, a.ro4.g0(0.0f, 0.0f, null, 7), r8) == r0) goto L44;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r8.i
            int r2 = r8.l
            r3 = 1
            r4 = 0
            a.xcz r5 = r8.k
            r6 = 2
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r6) goto L16
            a.z1x.P(r9)
            goto L9b
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L1c:
            a.z1x.P(r9)
            goto L61
        L20:
            a.z1x.P(r9)
            boolean r9 = r8.j
            if (r9 == 0) goto L36
            boolean r9 = r5.d()
            if (r9 != 0) goto L36
            boolean r9 = r5.c()
            if (r9 != 0) goto L36
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L36:
            a.mcz r9 = r5.j()
            java.util.List r9 = r9.l
            java.util.Iterator r9 = r9.iterator()
        L40:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r9.next()
            r7 = r1
            a.ncz r7 = (a.ncz) r7
            int r7 = r7.f23317a
            if (r7 != r2) goto L40
            goto L53
        L52:
            r1 = r4
        L53:
            a.ncz r1 = (a.ncz) r1
            if (r1 != 0) goto L85
            r8.i = r3
            r9 = 0
            java.lang.Object r9 = r5.l(r2, r9, r8)
            if (r9 != r0) goto L61
            goto L9a
        L61:
            a.mcz r9 = r5.j()
            java.util.List r9 = r9.l
            java.util.Iterator r9 = r9.iterator()
        L6b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r9.next()
            r3 = r1
            a.ncz r3 = (a.ncz) r3
            int r3 = r3.f23317a
            if (r3 != r2) goto L6b
            r4 = r1
        L7d:
            r1 = r4
            a.ncz r1 = (a.ncz) r1
            if (r1 != 0) goto L85
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L85:
            int r9 = r8.m
            int r9 = r9 / r6
            int r2 = r1.p
            int r1 = r1.q
            int r1 = r1 / r6
            int r1 = r1 + r2
            int r1 = r1 - r9
            if (r1 == 0) goto L9b
            float r9 = (float) r1
            r8.i = r6
            java.lang.Object r8 = a.bww.y(r5, r9, r8)
            if (r8 != r0) goto L9b
        L9a:
            return r0
        L9b:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f05.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
