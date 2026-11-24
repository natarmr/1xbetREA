package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class m1c extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ s1c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1c(s1c s1cVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = s1cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new m1c(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m1c) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r0.x(r10, r9) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.C(((a.f1c) r1.getValue()).b, (org.xplatform.security.api.presentation.models.SendEmailIntention.Registration) r2, r9) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r0.D(((a.f1c) r1.getValue()).b, (org.xplatform.security.api.presentation.models.SendEmailIntention.RestorePassword) r2, r9) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        return r3;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            a.s1c r0 = r9.j
            a.p7m0 r1 = r0.x
            org.xplatform.security.api.presentation.models.SendEmailIntention r2 = r0.u
            a.wne r3 = a.wne.f39444a
            byte r4 = r9.i
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L21
            if (r4 == r8) goto L1d
            if (r4 == r7) goto L1d
            if (r4 != r6) goto L17
            goto L1d
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L1d:
            a.z1x.P(r10)
            goto L69
        L21:
            a.z1x.P(r10)
            if (r2 == 0) goto L6c
            boolean r10 = r2 instanceof org.xplatform.security.api.presentation.models.SendEmailIntention.Bind
            if (r10 == 0) goto L3b
            java.lang.Object r10 = r1.getValue()
            a.f1c r10 = (a.f1c) r10
            java.lang.String r10 = r10.b
            r9.i = r8
            java.lang.Object r9 = r0.x(r10, r9)
            if (r9 != r3) goto L69
            goto L68
        L3b:
            boolean r10 = r2 instanceof org.xplatform.security.api.presentation.models.SendEmailIntention.Registration
            if (r10 == 0) goto L52
            java.lang.Object r10 = r1.getValue()
            a.f1c r10 = (a.f1c) r10
            java.lang.String r10 = r10.b
            org.xplatform.security.api.presentation.models.SendEmailIntention$Registration r2 = (org.xplatform.security.api.presentation.models.SendEmailIntention.Registration) r2
            r9.i = r7
            java.lang.Object r9 = r0.C(r10, r2, r9)
            if (r9 != r3) goto L69
            goto L68
        L52:
            boolean r10 = r2 instanceof org.xplatform.security.api.presentation.models.SendEmailIntention.RestorePassword
            if (r10 == 0) goto L6c
            java.lang.Object r10 = r1.getValue()
            a.f1c r10 = (a.f1c) r10
            java.lang.String r10 = r10.b
            org.xplatform.security.api.presentation.models.SendEmailIntention$RestorePassword r2 = (org.xplatform.security.api.presentation.models.SendEmailIntention.RestorePassword) r2
            r9.i = r6
            java.lang.Object r9 = r0.D(r10, r2, r9)
            if (r9 != r3) goto L69
        L68:
            return r3
        L69:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        L6c:
            a.t9f.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m1c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
