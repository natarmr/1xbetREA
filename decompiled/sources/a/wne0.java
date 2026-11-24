package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class wne0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ one0 j;
    public final /* synthetic */ xne0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wne0(yje yjeVar, one0 one0Var, xne0 xne0Var) {
        super(2, yjeVar);
        this.j = one0Var;
        this.k = xne0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new wne0(yjeVar, this.j, this.k);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wne0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r4.w(5, r10) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r1.a(r4, r10) == r0) goto L19;
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
            byte r1 = r10.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            a.z1x.P(r11)
            goto L79
        L10:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L17:
            a.z1x.P(r11)
            goto L36
        L1b:
            a.z1x.P(r11)
            a.one0 r11 = r10.j
            a.une0 r11 = r11.b
            double r4 = r11.b
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            a.xne0 r4 = r10.k
            if (r1 != 0) goto L39
            r10.i = r3
            r11 = 5
            java.lang.Object r10 = r4.w(r11, r10)
            if (r10 != r0) goto L36
            goto L78
        L36:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        L39:
            a.qoj0 r1 = r4.k
            a.yme0 r4 = new a.yme0
            org.xplatform.ui_core.resources.UiText$ByRes r5 = new org.xplatform.ui_core.resources.UiText$ByRes
            r6 = 2131951970(0x7f130162, float:1.954037E38)
            r7 = 0
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r7]
            r5.<init>(r6, r8)
            org.xplatform.ui_core.resources.UiText$ByRes r6 = new org.xplatform.ui_core.resources.UiText$ByRes
            java.lang.String r11 = r11.f35957a
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            r3[r7] = r11
            r11 = 2131955023(0x7f130d4f, float:1.9546562E38)
            r6.<init>(r11, r3)
            r11 = r7
            org.xplatform.ui_core.resources.UiText$ByRes r7 = new org.xplatform.ui_core.resources.UiText$ByRes
            r3 = 2131951953(0x7f130151, float:1.9540335E38)
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r11]
            r7.<init>(r3, r8)
            org.xplatform.ui_core.resources.UiText$ByRes r8 = new org.xplatform.ui_core.resources.UiText$ByRes
            r3 = 2131952431(0x7f13032f, float:1.9541305E38)
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[r11]
            r8.<init>(r3, r11)
            java.lang.String r9 = "approveMoveMoney"
            r4.<init>(r5, r6, r7, r8, r9)
            r10.i = r2
            java.lang.Object r10 = r1.a(r4, r10)
            if (r10 != r0) goto L79
        L78:
            return r0
        L79:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wne0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
