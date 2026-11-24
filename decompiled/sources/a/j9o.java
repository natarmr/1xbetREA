package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class j9o extends bnn0 implements Function1 {
    public List i;
    public byte j;
    public final /* synthetic */ k9o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9o(k9o k9oVar, yje yjeVar) {
        super(1, yjeVar);
        this.k = k9oVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new j9o(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j9o) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[PHI: r1 r11
  0x005d: PHI (r1v3 java.util.List) = (r1v2 java.util.List), (r1v4 java.util.List) binds: [B:19:0x005a, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r11v14 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:19:0x005a, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r3.c(r4, r10) == r0) goto L23;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r10.j
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            a.k9o r6 = r10.k
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            a.z1x.P(r11)
            goto L9a
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r5
        L1d:
            java.util.List r1 = r10.i
            a.z1x.P(r11)
            goto L5d
        L23:
            a.z1x.P(r11)
            goto L47
        L27:
            a.z1x.P(r11)
            java.lang.Object r11 = r6.D()
            a.z8o r11 = (a.z8o) r11
            java.util.List r11 = r11.c
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L49
            a.b8u r11 = r6.u
            r10.j = r4
            java.lang.Object r11 = r11.f2175a
            a.z220 r11 = (a.z220) r11
            java.lang.Object r11 = r11.u(r10)
            if (r11 != r0) goto L47
            goto L99
        L47:
            java.util.List r11 = (java.util.List) r11
        L49:
            r1 = r11
            a.gvu r11 = r6.z
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Real r4 = org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Real.INSTANCE
            byte r4 = r4.f46556a
            r10.i = r1
            r10.j = r3
            a.ivu r11 = (a.ivu) r11
            java.io.Serializable r11 = r11.a(r4, r10)
            if (r11 != r0) goto L5d
            goto L99
        L5d:
            java.util.Map r11 = (java.util.Map) r11
            a.pwi r3 = r6.r
            a.sff0 r4 = r6.F
            a.ech r7 = r4.c
            int r7 = r7.g
            boolean r4 = r4.J1
            java.lang.Object r8 = r3.g
            a.m1e r8 = (a.m1e) r8
            a.gmq r8 = r8.b()
            a.q7u r9 = new a.q7u
            r9.<init>(r5, r3, r7, r4)
            a.utb r4 = a.aoq.c(r8, r9)
            java.lang.Object r3 = r3.h
            a.mne r3 = (a.mne) r3
            a.rwj r3 = r3.f22085a
            a.gmq r3 = a.ulb.L(r4, r3)
            a.gmq r3 = a.i120.W(r3)
            a.yj2 r4 = new a.yj2
            r7 = 8
            r4.<init>(r6, r1, r11, r7)
            r10.i = r5
            r10.j = r2
            java.lang.Object r10 = r3.c(r4, r10)
            if (r10 != r0) goto L9a
        L99:
            return r0
        L9a:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j9o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
