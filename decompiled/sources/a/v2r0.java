package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class v2r0 extends bnn0 implements Function2 {
    public sip i;
    public jvn j;
    public jtj k;
    public CyberGamesPage.Real l;
    public byte m;
    public final /* synthetic */ z2r0 n;
    public final /* synthetic */ sip o;
    public final /* synthetic */ jvn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2r0(z2r0 z2r0Var, sip sipVar, jvn jvnVar, yje yjeVar) {
        super(2, yjeVar);
        this.n = z2r0Var;
        this.o = sipVar;
        this.p = jvnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v2r0(this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v2r0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r13 == r0) goto L22;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r12.m
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            a.sip r12 = r12.i
            a.z2r0 r12 = (a.z2r0) r12
            a.z1x.P(r13)     // Catch: java.lang.Throwable -> L75
            goto L70
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r4
        L1b:
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Real r1 = r12.l
            a.jtj r3 = r12.k
            a.jvn r5 = r12.j
            a.sip r6 = r12.i
            a.z1x.P(r13)     // Catch: java.lang.Throwable -> L75
            r7 = r1
        L27:
            r9 = r5
            goto L4b
        L29:
            a.z1x.P(r13)
            a.z2r0 r13 = r12.n
            a.sip r6 = r12.o
            a.jvn r5 = r12.p
            a.e0g0 r1 = a.j0g0.b     // Catch: java.lang.Throwable -> L75
            a.jtj r1 = r13.d     // Catch: java.lang.Throwable -> L75
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Real r7 = org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Real.INSTANCE     // Catch: java.lang.Throwable -> L75
            r12.i = r6     // Catch: java.lang.Throwable -> L75
            r12.j = r5     // Catch: java.lang.Throwable -> L75
            r12.k = r1     // Catch: java.lang.Throwable -> L75
            r12.l = r7     // Catch: java.lang.Throwable -> L75
            r12.m = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r13 = r13.a(r12)     // Catch: java.lang.Throwable -> L75
            if (r13 != r0) goto L49
            goto L6f
        L49:
            r3 = r1
            goto L27
        L4b:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L75
            int r8 = r13.intValue()     // Catch: java.lang.Throwable -> L75
            r12.i = r4     // Catch: java.lang.Throwable -> L75
            r12.j = r4     // Catch: java.lang.Throwable -> L75
            r12.k = r4     // Catch: java.lang.Throwable -> L75
            r12.l = r4     // Catch: java.lang.Throwable -> L75
            r12.m = r2     // Catch: java.lang.Throwable -> L75
            java.lang.Object r13 = r3.b     // Catch: java.lang.Throwable -> L75
            r5 = r13
            a.sb6 r5 = (a.sb6) r5     // Catch: java.lang.Throwable -> L75
            java.lang.Object r13 = r3.c     // Catch: java.lang.Throwable -> L75
            a.gst0 r13 = (a.gst0) r13     // Catch: java.lang.Throwable -> L75
            boolean r10 = r13.a()     // Catch: java.lang.Throwable -> L75
            r11 = r12
            java.io.Serializable r13 = r5.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L75
            if (r13 != r0) goto L70
        L6f:
            return r0
        L70:
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L75
            a.e0g0 r12 = a.j0g0.b     // Catch: java.lang.Throwable -> L75
            goto L7e
        L75:
            r0 = move-exception
            r12 = r0
            a.e0g0 r13 = a.j0g0.b
            a.g0g0 r13 = new a.g0g0
            r13.<init>(r12)
        L7e:
            a.j0g0 r12 = new a.j0g0
            r12.<init>(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v2r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
