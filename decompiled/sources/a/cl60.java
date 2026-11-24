package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cl60 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ hl60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl60(hl60 hl60Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = hl60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new cl60(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cl60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r2.x(r5) == r0) goto L21;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r5.i
            a.hl60 r2 = r5.j
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            a.z1x.P(r6)
            goto L72
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L19:
            a.z1x.P(r6)
            goto L31
        L1d:
            a.z1x.P(r6)
            a.sp4 r6 = r2.i
            a.b9i r6 = r6.f32574a
            a.c5k r6 = r6.w()
            r5.i = r4
            java.lang.Object r6 = r6.o(r5)
            if (r6 != r0) goto L31
            goto L71
        L31:
            a.i2f0 r6 = (a.i2f0) r6
            boolean r6 = r6.c
            if (r6 == 0) goto L69
            a.i1w0 r5 = r2.n
            java.util.concurrent.CopyOnWriteArrayList r6 = a.b1j.q(r5)
            a.zn00 r0 = r2.k
            org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator r1 = org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType.ConfirmByAuthenticator.f46929a
            com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1 r0 = r0.z0(r1)
            a.d1w0 r1 = new a.d1w0
            r1.<init>(r0)
            a.c8d r0 = new a.c8d
            a.v7d r2 = a.y7d.f42146a
            r0.<init>(r2, r1)
            r1 = 0
            java.util.ListIterator r6 = a.b1j.p(r6, r0, r5, r6, r1)
        L56:
            r0 = r6
            a.paw r0 = (a.paw) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r0 = r0.next()
            a.oe50 r0 = (a.oe50) r0
            r5.a(r0)
            goto L56
        L69:
            r5.i = r3
            java.lang.Object r5 = r2.x(r5)
            if (r5 != r0) goto L72
        L71:
            return r0
        L72:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cl60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
