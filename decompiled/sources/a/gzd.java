package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gzd extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ kzd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzd(kzd kzdVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = kzdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new gzd(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gzd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r8.y((org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.BindEmail) r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r8.z((org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.Registration) r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r8.A((org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.RestorePassword) r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r7.i
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1b
            if (r1 == r5) goto L17
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            goto L17
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r2
        L17:
            a.z1x.P(r8)
            goto L51
        L1b:
            a.z1x.P(r8)
            a.kzd r8 = r7.j
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams r1 = r8.c
            if (r1 == 0) goto L54
            boolean r6 = r1 instanceof org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.BindEmail
            if (r6 == 0) goto L33
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$BindEmail r1 = (org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.BindEmail) r1
            r7.i = r5
            java.lang.Object r7 = r8.y(r1, r7)
            if (r7 != r0) goto L51
            goto L50
        L33:
            boolean r5 = r1 instanceof org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.Registration
            if (r5 == 0) goto L42
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$Registration r1 = (org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.Registration) r1
            r7.i = r4
            java.lang.Object r7 = r8.z(r1, r7)
            if (r7 != r0) goto L51
            goto L50
        L42:
            boolean r4 = r1 instanceof org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.RestorePassword
            if (r4 == 0) goto L54
            org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams$RestorePassword r1 = (org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams.RestorePassword) r1
            r7.i = r3
            java.lang.Object r7 = r8.A(r1, r7)
            if (r7 != r0) goto L51
        L50:
            return r0
        L51:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L54:
            a.t9f.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gzd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
