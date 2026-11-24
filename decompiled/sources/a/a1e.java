package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class a1e extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ g1e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1e(g1e g1eVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = g1eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new a1e(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a1e) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r8.a(r0, r7) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r0.w(r8, r7) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r2;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            a.g1e r0 = r7.j
            a.s64 r1 = r0.x
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.i
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L1c
            if (r3 == r6) goto L18
            if (r3 != r5) goto L12
            goto L18
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L18:
            a.z1x.P(r8)
            goto L54
        L1c:
            a.z1x.P(r8)
            org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType r8 = r0.d
            if (r8 == 0) goto L57
            boolean r3 = r8 instanceof org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType.Authenticator
            if (r3 == 0) goto L39
            a.hfi0 r8 = a.hfi0.AUTHENTICATOR
            r1.f(r8)
            a.tvd r8 = r0.q
            java.lang.String r0 = r0.A
            r7.i = r6
            java.lang.Object r7 = r8.a(r0, r7)
            if (r7 != r2) goto L54
            goto L47
        L39:
            boolean r3 = r8 instanceof org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType.Simple
            if (r3 == 0) goto L48
            java.lang.String r8 = r0.A
            r7.i = r5
            java.lang.Object r7 = r0.w(r8, r7)
            if (r7 != r2) goto L54
        L47:
            return r2
        L48:
            boolean r7 = r8 instanceof org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType.SmsCode
            if (r7 == 0) goto L57
            a.hfi0 r7 = a.hfi0.SMS
            r1.f(r7)
            r0.D()
        L54:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L57:
            a.t9f.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a1e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
