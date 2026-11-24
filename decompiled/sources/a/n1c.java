package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class n1c extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ s1c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1c(s1c s1cVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = s1cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new n1c(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n1c) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r0 == r8) goto L30;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.s1c r7 = r10.j
            a.xzb r0 = r7.o
            a.wne r8 = a.wne.f39444a
            byte r1 = r10.i
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            a.z1x.P(r11)
            r0 = r11
            goto L6d
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r2
        L1f:
            a.z1x.P(r11)
            r0 = r11
            goto L5b
        L24:
            a.z1x.P(r11)
            r0 = r11
            goto L40
        L29:
            a.z1x.P(r11)
            org.xplatform.security.api.presentation.models.SendEmailIntention r1 = r7.u
            if (r1 == 0) goto L8f
            boolean r9 = r1 instanceof org.xplatform.security.api.presentation.models.SendEmailIntention.Bind
            if (r9 == 0) goto L43
            a.swp0 r1 = r7.y
            r10.i = r5
            r2 = 0
            java.lang.Object r0 = r0.a(r1, r2, r10)
            if (r0 != r8) goto L40
            goto L6c
        L40:
            a.pfi0 r0 = (a.pfi0) r0
            goto L6f
        L43:
            boolean r9 = r1 instanceof org.xplatform.security.api.presentation.models.SendEmailIntention.Registration
            if (r9 == 0) goto L5e
            a.n5c r0 = r7.f
            a.swp0 r1 = r7.y
            a.obk0 r2 = a.obk0.SMS
            r10.i = r4
            r3 = 0
            r4 = 1
            java.lang.String r5 = ""
            r6 = r10
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L5b
            goto L6c
        L5b:
            a.pfi0 r0 = (a.pfi0) r0
            goto L6f
        L5e:
            boolean r1 = r1 instanceof org.xplatform.security.api.presentation.models.SendEmailIntention.RestorePassword
            if (r1 == 0) goto L8f
            a.swp0 r1 = r7.y
            r10.i = r3
            java.lang.Object r0 = r0.a(r1, r5, r10)
            if (r0 != r8) goto L6d
        L6c:
            return r8
        L6d:
            a.pfi0 r0 = (a.pfi0) r0
        L6f:
            a.swp0 r1 = r0.b
            r7.y = r1
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = r0.f26908a
            long r3 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r3 = r3 + r1
            a.vzg0 r0 = r7.b
            java.lang.String r1 = "SAVED_FINISH_TIME"
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r0.e(r1, r2)
            r7.E()
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        L8f:
            a.t9f.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n1c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
