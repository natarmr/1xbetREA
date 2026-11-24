package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vne0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ xne0 j;
    public final /* synthetic */ one0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vne0(yje yjeVar, one0 one0Var, xne0 xne0Var) {
        super(2, yjeVar);
        this.j = xne0Var;
        this.k = one0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vne0(yjeVar, this.k, this.j);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vne0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r11.a(r2, r10) == r1) goto L18;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            a.one0 r0 = r10.k
            a.une0 r0 = r0.b
            a.wne r1 = a.wne.f39444a
            byte r2 = r10.i
            r3 = 0
            r4 = 2
            r5 = 1
            a.xne0 r6 = r10.j
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            a.z1x.P(r11)
            goto L75
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L1d:
            a.z1x.P(r11)
            goto L42
        L21:
            a.z1x.P(r11)
            a.p7m0 r11 = r6.j
            r11.getClass()
            a.pne0 r2 = a.pne0.f27282a
            r11.o(r3, r2)
            a.s5k r11 = r6.d
            double r2 = r0.b
            r10.i = r5
            a.z220 r11 = r11.f31657a
            java.lang.Object r11 = r11.G(r2, r10)
            if (r11 != r1) goto L3d
            goto L3f
        L3d:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L3f:
            if (r11 != r1) goto L42
            goto L74
        L42:
            a.qoj0 r11 = r6.k
            a.yme0 r2 = new a.yme0
            org.xplatform.ui_core.resources.UiText$ByRes r3 = new org.xplatform.ui_core.resources.UiText$ByRes
            r7 = 2131952497(0x7f130371, float:1.9541438E38)
            r8 = 0
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r8]
            r3.<init>(r7, r9)
            org.xplatform.ui_core.resources.UiText$ByRes r7 = new org.xplatform.ui_core.resources.UiText$ByRes
            java.lang.String r0 = r0.f35957a
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r5]
            r9[r8] = r0
            r0 = 2131955024(0x7f130d50, float:1.9546564E38)
            r7.<init>(r0, r9)
            org.xplatform.ui_core.resources.UiText$ByRes r0 = new org.xplatform.ui_core.resources.UiText$ByRes
            r9 = 2131955293(0x7f130e5d, float:1.954711E38)
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r8]
            r0.<init>(r9, r8)
            r2.<init>(r3, r7, r0)
            r10.i = r4
            java.lang.Object r10 = r11.a(r2, r10)
            if (r10 != r1) goto L75
        L74:
            return r1
        L75:
            r6.x(r5)
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vne0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
