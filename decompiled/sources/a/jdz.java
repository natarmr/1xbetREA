package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jdz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ CoroutineContext k;
    public final /* synthetic */ hdz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdz(CoroutineContext coroutineContext, hdz hdzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = coroutineContext;
        this.l = hdzVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new jdz(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new jdz(this.k, this.l, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((jdz) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r4.a(r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (a.qjj.d0(r3, r9, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r8 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (a.qjj.d0(r3, r9, r8) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.i
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 2
            kotlin.coroutines.CoroutineContext r3 = r8.k
            a.hdz r4 = r8.l
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L47;
                default: goto Le;
            }
        Le:
            a.wne r0 = a.wne.f39444a
            byte r7 = r8.j
            if (r7 == 0) goto L21
            if (r7 == r5) goto L1d
            if (r7 != r2) goto L19
            goto L1d
        L19:
            a.jf4.n(r1)
            goto L46
        L1d:
            a.z1x.P(r9)
            goto L44
        L21:
            a.z1x.P(r9)
            kotlin.coroutines.g r9 = kotlin.coroutines.g.f46065a
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r3, r9)
            if (r9 == 0) goto L35
            r8.j = r5
            java.lang.Object r8 = r4.a(r8)
            if (r8 != r0) goto L44
            goto L42
        L35:
            a.idz r9 = new a.idz
            r9.<init>(r4, r6, r5)
            r8.j = r2
            java.lang.Object r8 = a.qjj.d0(r3, r9, r8)
            if (r8 != r0) goto L44
        L42:
            r6 = r0
            goto L46
        L44:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        L46:
            return r6
        L47:
            a.wne r0 = a.wne.f39444a
            byte r7 = r8.j
            if (r7 == 0) goto L5a
            if (r7 == r5) goto L56
            if (r7 != r2) goto L52
            goto L56
        L52:
            a.jf4.n(r1)
            goto L8d
        L56:
            a.z1x.P(r9)
            goto L8b
        L5a:
            a.z1x.P(r9)
            kotlin.coroutines.g r9 = kotlin.coroutines.g.f46065a
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r3, r9)
            if (r9 == 0) goto L7b
            r8.j = r5
            a.gmq r9 = r4.f12895a
            a.juy r1 = new a.juy
            r2 = 5
            r1.<init>(r4, r6, r2)
            java.lang.Object r8 = a.slb.O(r9, r1, r8)
            if (r8 != r0) goto L76
            goto L78
        L76:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L78:
            if (r8 != r0) goto L8b
            goto L89
        L7b:
            a.idz r9 = new a.idz
            r1 = 0
            r9.<init>(r4, r6, r1)
            r8.j = r2
            java.lang.Object r8 = a.qjj.d0(r3, r9, r8)
            if (r8 != r0) goto L8b
        L89:
            r6 = r0
            goto L8d
        L8b:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jdz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
